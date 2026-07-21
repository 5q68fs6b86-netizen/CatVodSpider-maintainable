package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 天逸搜（天翼盘）。AES cookie 与解析逻辑来自 jar 反编译 TianYiSo。
 */
public class TianYiSo extends Pan {

    private static final String HOST = "https://www.tianyiso.com";
    private static final String KEY = "1234567812345678";
    private static final String IV = "1234567812345678";

    private static String group1(String html, String regex) {
        Matcher m = Pattern.compile(regex).matcher(html);
        return m.find() ? m.group(1) : "";
    }

    public static String encrypt(String plain, String key, String iv) {
        try {
            if (key == null || key.length() < 16) throw new IllegalArgumentException("Key must be at least 16 bytes");
            if (iv == null || iv.length() != 16) throw new IllegalArgumentException("IV must be 16 bytes");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE,
                    new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES"),
                    new IvParameterSpec(iv.getBytes(StandardCharsets.UTF_8)));
            byte[] out = cipher.doFinal(plain.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : out) {
                String hex = Integer.toHexString(b & 0xff);
                if (hex.length() == 1) sb.append('0');
                sb.append(hex);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Map<String, String> baseHeaders() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        h.put("Referer", HOST + "/");
        return h;
    }

    private Map<String, String> withCookie(String pageUrl) {
        Map<String, String> h = baseHeaders();
        String html = OkHttp.string(pageUrl, h);
        String token = group1(html, "start_load\\(\"(.*)\"\\)");
        String cookie = encrypt(token, KEY, IV);
        if (cookie != null) h.put("cookie", "ck_ml_sea_=" + cookie.replace("\n", ""));
        return h;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String path = ids.get(0);
        String page = path.startsWith("http") ? path : HOST + path;
        Map<String, String> h = withCookie(page);
        String html = OkHttp.string(page, h);
        String name = "";
        int t0 = html.indexOf("<title>");
        if (t0 >= 0) {
            int t1 = html.indexOf("</title>", t0 + 7);
            if (t1 > t0) {
                name = html.substring(t0 + 7, t1);
                int cut = name.indexOf(" - 云盘资源 - 天逸搜");
                if (cut >= 0) name = name.substring(0, cut);
            }
        }
        String pwd = group1(html, "<van-cell title=\"密码\">\\s*<b[^>]*>(.*?)</b>\\s*</van-cell>");
        String cv = page.replace("/s/", "/cv/");
        h.put("Referer", page);
        String loc = OkHttp.getLocation(cv, h);
        if (loc == null) loc = "";
        if (loc.contains("cloud.189.cn/web/share")) {
            int i = loc.indexOf("code=");
            if (i >= 0) {
                int s = i + 5;
                int e = loc.indexOf('&', s);
                if (e < 0) e = loc.length();
                loc = "https://cloud.189.cn/t/" + loc.substring(s, e);
            }
        }
        if (html.contains("密码") && !TextUtils.isEmpty(pwd)) {
            loc = loc + "访问码：" + pwd;
        }
        return super.detailContent(Collections.singletonList(loc));
    }

    private String searchPage(String key, String page) {
        try {
            String url = HOST + "/search?k=" + key + "&page=" + page;
            Map<String, String> h = withCookie(url);
            String html = OkHttp.string(url, h);
            List<Vod> list = new ArrayList<>();
            int i = 0;
            while (i < html.length()) {
                int a = html.indexOf("<a href=\"/s/", i);
                if (a < 0) break;
                int s = a + 9;
                int e = html.indexOf('"', s);
                if (e < 0) {
                    i = a + 1;
                    continue;
                }
                String href = html.substring(s, e);
                int gt = html.indexOf('>', e);
                if (gt < 0) {
                    i = a + 1;
                    continue;
                }
                int div = html.indexOf("</div>", gt + 1);
                if (div < 0) {
                    i = a + 1;
                    continue;
                }
                String raw = html.substring(gt + 1, div);
                StringBuilder sb = new StringBuilder();
                boolean inTag = false;
                for (int k = 0; k < raw.length(); k++) {
                    char c = raw.charAt(k);
                    if (c == '<') inTag = true;
                    else if (c == '>') inTag = false;
                    else if (!inTag) sb.append(c);
                }
                String title = sb.toString().replace("\n", "").replace("  ", " ").trim();
                if (title.isEmpty() || title.contains("🈲") || title.contains("🔞")) {
                    i = a + 1;
                    continue;
                }
                list.add(new Vod(href, title, PanSearchSupport.PIC_TIANYI));
                i = div;
            }
            return Result.string(list);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.string(new ArrayList<>());
        }
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return searchPage(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        return searchPage(key, pg);
    }
}
