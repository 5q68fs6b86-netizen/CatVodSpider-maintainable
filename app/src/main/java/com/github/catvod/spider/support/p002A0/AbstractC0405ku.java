package com.github.catvod.spider.support.p002A0;

import android.net.Uri;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ku */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0405ku {

    /* JADX INFO: renamed from: a */
    public static final String[] f1105a = {".m3u8", ".mp4", ".flv", ".avi", ".mkv", ".rm", ".wmv", ".mpg", "video/tos", ".mp3", ".m4a", "mime_type=video_mp4"};

    /* JADX INFO: renamed from: b */
    public static final String[] f1106b = {"=http", ".html", "?http"};

    /* JADX INFO: renamed from: c */
    public static final Charset f1107c = Charset.forName("UTF-8");

    static {
        Charset.forName("iso-8859-1");
    }

    /* JADX INFO: renamed from: d */
    public static String m1360d(String str, Charset charset) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(charset));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString);
            }
            return sb.toString().toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1361e(String str) {
        String lowerCase = str.toLowerCase();
        if ((!lowerCase.contains("=http") && !lowerCase.contains(".html")) || (lowerCase.contains("m3u8.pw/Cache") && lowerCase.contains("from=https://banyung.pw"))) {
            String[] strArr = f1105a;
            for (int i = 0; i < 12; i++) {
                if (lowerCase.contains(strArr[i])) {
                    String[] strArr2 = f1106b;
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (lowerCase.contains(strArr2[i2]) && (!lowerCase.contains("m3u8.pw/Cache") || !lowerCase.contains("from=https://banyung.pw") || !lowerCase.contains("getm3u8?url=http"))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1362f(String str) {
        try {
            String host = Uri.parse(str).getHost();
            String[] strArr = {"iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com", "www.miguvideo.com", "www.ixigua.com", "vip.1905.com", "www.fun.tv", "m.fun.tv"};
            for (int i = 0; i < 16; i++) {
                if (host.contains(strArr[i]) && (!"iqiyi.com".equals(strArr[i]) || str.contains("iqiyi.com/a_") || str.contains("iqiyi.com/w_") || str.contains("iqiyi.com/v_"))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static JSONObject m1363g(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.has("data") ? jSONObject.getJSONObject("data").getString("url") : jSONObject.getString("url");
        if (string.startsWith("//")) {
            string = "https:".concat(string);
        }
        if (!string.startsWith("http")) {
            return null;
        }
        if ((string.equals(str) && (m1362f(string) || !m1361e(string))) || string.contains("973973.xyz") || string.contains(".fit:")) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        String strOptString = jSONObject.optString("user-agent", "");
        if (strOptString.trim().length() > 0) {
            jSONObject2.put("User-Agent", " ".concat(strOptString));
        }
        String strOptString2 = jSONObject.optString("referer", "");
        if (strOptString2.trim().length() > 0) {
            jSONObject2.put("Referer", " ".concat(strOptString2));
        }
        if (str.contains("www.mgtv.com") || string.contains("titan.mgtv")) {
            jSONObject2.put("Referer", " ");
            jSONObject2.put("User-Agent", " Mozilla/5.0");
        } else if (str.contains("bilibili")) {
            jSONObject2.put("Referer", " https://www.bilibili.com/");
            jSONObject2.put("User-Agent", " Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36");
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("header", jSONObject2);
        jSONObject3.put("url", string);
        return jSONObject3;
    }
}
