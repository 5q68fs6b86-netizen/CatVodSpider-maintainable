package com.github.catvod.spider.support.p003AB.p009o;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p003AB.p005b.C0854u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0945z {

    /* JADX INFO: renamed from: a */
    private static final Pattern f2232a = Pattern.compile("http((?!http).){26,}?\\.(m3u8|mp4)\\?.*|http((?!http).){26,}\\.(m3u8|mp4)|http((?!http).){26,}?/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?cdn-tos[^\\?]*|http((?!http).)*?/obj/tos[^\\?]*|http.*?/player/m3u8play\\.php\\?url=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/playlist/m3u8/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*");

    /* JADX INFO: renamed from: b */
    public static final String f2233b = "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36";

    static {
        Charset charset = StandardCharsets.UTF_8;
        Charset charset2 = StandardCharsets.ISO_8859_1;
    }

    /* JADX INFO: renamed from: a */
    public static String m2284a(String str, String str2) {
        StringBuilder sb;
        try {
            if (str2.startsWith("//")) {
                Uri uri = Uri.parse(str);
                sb = new StringBuilder();
                sb.append(uri.getScheme());
                sb.append(":");
                sb.append(str2);
            } else {
                if (str2.contains("://")) {
                    return str2;
                }
                Uri uri2 = Uri.parse(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uri2.getScheme());
                sb2.append("://");
                sb2.append(uri2.getHost());
                sb2.append(str2);
                sb = sb2;
            }
            return sb.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2285b(String str) {
        try {
            String host = Uri.parse(str).getHost();
            String[] strArr = {"iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com"};
            for (int i = 0; i < 11; i++) {
                if (host.contains(strArr[i]) && (!"iqiyi.com".equals(strArr[i]) || str.contains("iqiyi.com/a_") || str.contains("iqiyi.com/w_") || str.contains("iqiyi.com/v_"))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if ((com.github.catvod.spider.support.p003AB.p009o.C0945z.f2232a.matcher(r9).find() && !(r9.contains("cdn-tos") && r9.contains(".js"))) == false) goto L25;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject m2286c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.has("data") ? jSONObject.getJSONObject("data").getString("url") : jSONObject.getString("url");
        if (string.startsWith("//")) {
            string = C0854u.m2059b(new byte[]{57, 100, -27, -82, 106, 125}, new byte[]{81, 16, -111, -34, 25, 71, 2, -18}, new StringBuilder(), string);
        }
        if (!string.startsWith("http")) {
            return null;
        }
        boolean z = true;
        if (string.equals(str)) {
            if (!m2285b(string)) {
            }
            return null;
        }
        if (!string.contains("973973.xyz") && !string.contains(".fit:")) {
            z = false;
        }
        if (z) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        String strOptString = jSONObject.optString("user-agent", "");
        if (strOptString.trim().length() > 0) {
            jSONObject2.put("User-Agent", " " + strOptString);
        }
        String strOptString2 = jSONObject.optString("referer", "");
        if (strOptString2.trim().length() > 0) {
            jSONObject2.put("Referer", " " + strOptString2);
        }
        String str3 = " Mozilla/5.0";
        if (str.contains("www.mgtv.com") || string.contains("titan.mgtv")) {
            jSONObject2.put("Referer", " ");
        } else {
            if (!str.contains("bilibili")) {
                if (str.contains("moagent")) {
                    str3 = f2233b;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("header", jSONObject2);
                jSONObject3.put("url", string);
                return jSONObject3;
            }
            jSONObject2.put("Referer", " https://www.bilibili.com/");
            str3 = " Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";
        }
        jSONObject2.put("User-Agent", str3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("header", jSONObject2);
        jSONObject4.put("url", string);
        return jSONObject4;
    }
}
