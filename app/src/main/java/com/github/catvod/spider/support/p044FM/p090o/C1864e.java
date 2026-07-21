package com.github.catvod.spider.support.p044FM.p090o;

import android.net.Uri;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.github.catvod.spider.support.p044FM.p073b.C1747r;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1864e {

    /* JADX INFO: renamed from: a */
    private static final Pattern f4286a;

    /* JADX INFO: renamed from: b */
    public static final String f4287b;

    static {
        C1711a.m3992b(new byte[]{89, 62, 127, 116, 35, -20, 103, -1, 33, 127, 53, 61, 103, -41, 111, -66, 112, 62, 114, 110, 111, -50, 82, -16, 37, 97, 43, 45, 116, -96, 81, -71, 122, 103, 49, 38, 111, -8, 48, -28, 61, 113, 68, 109, 63, -20, 99, -121, 113, 51, 78, 116, 59, -81, 51, -29, 35, 127, 54, 43, 111, -88, 77, -104, 64, 28, 73, 49, 111, -20, 111, -69, 113, 113, 66, 120, 44, -21, 105, -7, 52, 18, 109, 111, 32, -19, 99, -1, 45, 101, 43, 45, 97, -76, 48, -32, 34, 127, 48, 41, 111, -45, 103, -74, 117, 35, 108, 50, 122, -77, 49, -2, 39, 103}, new byte[]{20, 81, 5, 29, 79, -128, 6, -48});
        f4287b = "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36";
        f4286a = Pattern.compile("http((?!http).){26,}?\\.(m3u8|mp4)\\?.*|http((?!http).){26,}\\.(m3u8|mp4)|http((?!http).){26,}?/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?cdn-tos[^\\?]*|http((?!http).)*?/obj/tos[^\\?]*|http.*?/player/m3u8play\\.php\\?url=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/playlist/m3u8/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*");
        Charset charset = StandardCharsets.UTF_8;
        Charset charset2 = StandardCharsets.ISO_8859_1;
    }

    /* JADX INFO: renamed from: a */
    public static String m4508a(String str, String str2) {
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
                sb = new StringBuilder();
                sb.append(uri2.getScheme());
                sb.append("://");
                sb.append(uri2.getHost());
                sb.append(str2);
            }
            str2 = sb.toString();
            return str2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4509b(String str) {
        try {
            String host = Uri.parse(str).getHost();
            int i = 12;
            String[] strArr = {"iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com"};
            int i2 = 0;
            while (i2 < 11) {
                if (host.contains(strArr[i2])) {
                    if ("iqiyi.com".equals(strArr[i2])) {
                        byte[] bArr = new byte[i];
                        bArr[0] = -7;
                        bArr[1] = -94;
                        bArr[2] = 62;
                        bArr[3] = -80;
                        bArr[4] = -122;
                        bArr[5] = -10;
                        bArr[6] = 92;
                        bArr[7] = 78;
                        bArr[8] = -3;
                        bArr[9] = -4;
                        bArr[10] = 54;
                        bArr[11] = -106;
                        if (!str.contains(C1711a.m3992b(bArr, new byte[]{-112, -45, 87, -55, -17, -40, 63, 33}))) {
                            byte[] bArr2 = new byte[i];
                            bArr2[0] = -95;
                            bArr2[1] = 52;
                            bArr2[2] = 66;
                            bArr2[3] = 22;
                            bArr2[4] = 85;
                            bArr2[5] = 13;
                            bArr2[6] = 108;
                            bArr2[7] = 126;
                            bArr2[8] = -91;
                            bArr2[9] = 106;
                            bArr2[10] = 92;
                            bArr2[11] = 48;
                            if (!str.contains(C1711a.m3992b(bArr2, new byte[]{-56, 69, 43, 111, 60, 35, 15, 17}))) {
                                byte[] bArr3 = new byte[i];
                                bArr3[0] = 95;
                                bArr3[1] = -16;
                                bArr3[2] = -23;
                                bArr3[3] = -91;
                                bArr3[4] = -33;
                                bArr3[5] = -27;
                                bArr3[6] = -111;
                                bArr3[7] = 74;
                                bArr3[8] = 91;
                                bArr3[9] = -82;
                                bArr3[10] = -10;
                                bArr3[11] = -125;
                                if (str.contains(C1711a.m3992b(bArr3, new byte[]{54, -127, -128, -36, -74, -53, -14, 37}))) {
                                }
                            }
                        }
                    }
                    return true;
                }
                i2++;
                i = 12;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if ((com.github.catvod.spider.support.p044FM.p090o.C1864e.f4286a.matcher(r1).find() && !(r1.contains("cdn-tos") && r1.contains(".js"))) == false) goto L25;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject m4510c(String str, String str2) throws JSONException {
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.has("data") ? jSONObject.getJSONObject("data").getString("url") : jSONObject.getString("url");
        if (string.startsWith("//")) {
            string = C1747r.m4094b(new byte[]{18, -36, 27, 77, -105, 116}, new byte[]{122, -88, 111, 61, -28, 78, 45, -40}, new StringBuilder(), string);
        }
        if (!string.startsWith("http")) {
            return null;
        }
        if (string.equals(str)) {
            if (!m4509b(string)) {
            }
            return null;
        }
        if (string.contains("973973.xyz") || string.contains(".fit:")) {
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
        if (str.contains("www.mgtv.com") || string.contains("titan.mgtv")) {
            jSONObject2.put("Referer", " ");
            str3 = "User-Agent";
            str4 = " Mozilla/5.0";
        } else {
            if (!str.contains("bilibili")) {
                if (str.contains("moagent")) {
                    str3 = "User-Agent";
                    str4 = f4287b;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("header", jSONObject2);
                jSONObject3.put("url", string);
                return jSONObject3;
            }
            jSONObject2.put("Referer", " https://www.bilibili.com/");
            str3 = "User-Agent";
            str4 = " Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";
        }
        jSONObject2.put(str3, str4);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("header", jSONObject2);
        jSONObject4.put("url", string);
        return jSONObject4;
    }
}
