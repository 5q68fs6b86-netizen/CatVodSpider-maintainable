package com.github.catvod.spider;
import com.github.catvod.spider.support.p128m.C2268k;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p117b.C2174h;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p117b.C2156X;
import com.github.catvod.spider.support.p117b.C2185u;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Path;
import java.io.File;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class XunleiPan extends Spider {

    /* JADX INFO: renamed from: l */
    private static String f368l;

    /* JADX INFO: renamed from: k */
    private static String f367k = "com.xunlei.downloadprovider";

    /* JADX INFO: renamed from: j */
    private static String f366j = "8.31.0.9726";

    /* JADX INFO: renamed from: h */
    private static String f364h = "Xp6vsxz_7IYVw2BB";

    /* JADX INFO: renamed from: i */
    private static String f365i = "0";

    /* JADX INFO: renamed from: b */
    static String[] f363b = {"9uJNVj/wLmdwKrJaVj/omlQ", "Oz64Lp0GigmChHMf/6TNfxx7O9PyopcczMsnf", "Eb+L7Ce+Ej48u", "jKY0", "ASr0zCl6v8W4aidjPK5KHd1Lq3t+vBFf41dqv5+fnOd", "wQlozdg6r1qxh0eRmt3QgNXOvSZO6q/GXK", "gmirk+ciAvIgA/cxUUCema47jr/YToixTT+Q6O", "5IiCoM9B1/788ntB", "P07JH0h6qoM6TSUAK2aL9T5s2QBVeY9JWvalf", "+oK0AN"};

    public static void checktime() {
        String strM6164a = Path.read(getCache("xltime"));
        if (!strM6164a.trim().isEmpty()) {
            String strTrim = strM6164a.replaceAll("[^0-9]", "").trim();
            if (strTrim.isEmpty() || !strTrim.matches("\\d+")) {
                m772m();
                return;
            }
            if (Integer.parseInt(strTrim) >= Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()))) {
                return;
            }
        }
        m772m();
    }

    public static File getCache(String str) {
        return C2268k.m6172d(str);
    }

    /* JADX INFO: renamed from: m */
    private static void m772m() {
        PrintStream printStream;
        StringBuilder sb;
        String str;
        try {
            String strM774q = m774q("get:/drive/v1/share", f365i);
            JSONObject jSONObject = new JSONObject(OkHttp.string("https://api-pan.xunlei.com/drive/v1/share?share_id=VOwTF0m3ItvrjtoIuRcXN8jqA1&pass_code=ptpz&limit=9999&pass_code_token=&page_token=&thumbnail_size=SIZE_SMALL", m773o(strM774q)));
            if (jSONObject.has("share_status") && jSONObject.getString("share_status").equals("OK")) {
                String string = "";
                if (jSONObject.has("files") && jSONObject.getJSONArray("files").length() > 0) {
                    string = jSONObject.getJSONArray("files").getJSONObject(0).getString("id");
                }
                String strEncode = URLEncoder.encode(jSONObject.getString("pass_code_token"));
                String strM6073l = OkHttp.string("https://api-pan.xunlei.com/drive/v1/share/detail?share_id=VOwTF0m3ItvrjtoIuRcXN8jqA1&parent_id=" + string + "&pass_code_token=" + strEncode + "&limit=9999&page_token=&thumbnail_size=SIZE_SMALL", m773o(strM774q));
                if (strM6073l.contains("{") || strM6073l.contains("}")) {
                    JSONObject jSONObject2 = new JSONObject(strM6073l);
                    if (!jSONObject2.has("files") || jSONObject2.getJSONArray("files").length() <= 0) {
                        return;
                    }
                    JSONArray jSONArray = jSONObject2.getJSONArray("files");
                    String strM6076a = C2238b.m6066f("https://api-pan.xunlei.com/drive/v1/share/restore", String.format("{\"parent_id\":\"\",\"share_id\":\"%s\",\"pass_code_token\":\"%s\",\"ancestor_ids\":[],\"file_ids\":[\"%s\"],\"specify_parent_id\":true,\"params\":{\"origin\":\"runegg\"}}", "VOwTF0m3ItvrjtoIuRcXN8jqA1", URLDecoder.decode(strEncode), jSONArray.getJSONObject(new Random().nextInt(jSONArray.length())).getString("id")), m775r(m774q("get:/drive/v1/about", f365i))).m6076a();
                    if ((strM6076a.contains("{") || strM6076a.contains("}")) && new JSONObject(strM6076a).optString("share_status").equals("OK")) {
                        f368l = new JSONObject(strM6076a).optJSONObject("params").optString("trace_file_ids");
                        C2268k.m6168c(getCache("xltime"), new SimpleDateFormat("yyyyMMdd").format(new Date()));
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException unused) {
                        }
                        m776u();
                    }
                }
            }
        } catch (UnsupportedEncodingException e) {
            e = e;
            printStream = System.err;
            sb = new StringBuilder();
            str = "编码错误: ";
            sb.append(str);
            sb.append(e.getMessage());
            printStream.println(sb.toString());
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            printStream = System.err;
            sb = new StringBuilder();
            str = "算法错误: ";
            sb.append(str);
            sb.append(e.getMessage());
            printStream.println(sb.toString());
        } catch (JSONException e3) {
            e = e3;
            printStream = System.err;
            sb = new StringBuilder();
            str = "JSON 解析错误: ";
            sb.append(str);
            sb.append(e.getMessage());
            printStream.println(sb.toString());
        } catch (Exception e4) {
            e = e4;
            printStream = System.err;
            sb = new StringBuilder();
            str = "发生未知错误: ";
            sb.append(str);
            sb.append(e.getMessage());
            printStream.println(sb.toString());
        }
    }

    /* JADX INFO: renamed from: o */
    private static Map<String, String> m773o(String str) {
        HashMap mapM5658c = C2174h.m5658c("User-Agent", "ANDROID-com.xunlei.downloadprovider/7.51.0.8196 netWorkType/5G appid/40 deviceName/Xiaomi_M2004j7ac deviceModel/M2004J7AC OSVersion/12 protocolVersion/301 platformVersion/10 sdkVersion/220200 Oauth2Client/0.9 (Linux 4_14_186-perf-gddfs8vbb238b) (JAVA 0)", "Referer", "https://pan.xunlei.com/");
        mapM5658c.put("x-client-id", f364h);
        mapM5658c.put("x-device-id", C2156X.m5559m().m5573k());
        mapM5658c.put("x-captcha-token", str);
        return mapM5658c;
    }

    /* JADX INFO: renamed from: q */
    private static String m774q(String str, String str2) throws NoSuchAlgorithmException {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        Object[] objArr = new Object[8];
        objArr[0] = f364h;
        objArr[1] = str;
        objArr[2] = C2156X.m5559m().m5573k();
        objArr[3] = f367k;
        objArr[4] = f366j;
        StringBuilder sb = new StringBuilder();
        sb.append(f364h);
        sb.append(f366j);
        sb.append(f367k);
        String strM5657b = C2174h.m5657b(sb, C2156X.m5559m().m5573k(), strValueOf);
        for (String str3 : f363b) {
            String strM5408a = C2139c.m5408a(strM5657b, str3);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(strM5408a.getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(new BigInteger(1, messageDigest.digest()).toString(16));
            while (sb2.length() < 32) {
                sb2.insert(0, "0");
            }
            strM5657b = sb2.toString().toLowerCase();
        }
        objArr[5] = C2139c.m5408a("1.", strM5657b);
        objArr[6] = strValueOf;
        objArr[7] = str2;
        return C0082a.m832e(C2238b.m6066f("https://xluser-ssl.xunlei.com/v1/shield/captcha/init", String.format("{\"client_id\":\"%s\",\"action\":\"%s\",\"device_id\":\"%s\",\"meta\":{\"username\":\"\",\"phone_number\":\"\",\"email\":\"\",\"package_name\":\"%s\",\"client_version\":\"%s\",\"captcha_sign\":\"%s\",\"timestamp\":\"%s\",\"user_id\":\"%s\"}}", objArr), C2174h.m5658c("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 12; M2004J7AC Build/SP1A.210812.016)", "Referer", "https://pan.xunlei.com/")).m6076a(), "captcha_token");
    }

    /* JADX INFO: renamed from: r */
    private static Map<String, String> m775r(String str) {
        HashMap mapM5658c = C2174h.m5658c("User-Agent", "ANDROID-com.xunlei.downloadprovider/7.51.0.8196 netWorkType/5G appid/40 deviceName/Xiaomi_M2004j7ac deviceModel/M2004J7AC OSVersion/12 protocolVersion/301 platformVersion/10 sdkVersion/220200 Oauth2Client/0.9 (Linux 4_14_186-perf-gddfs8vbb238b) (JAVA 0)", "Referer", "https://pan.xunlei.com/");
        mapM5658c.put("x-client-id", f364h);
        mapM5658c.put("x-device-id", C2156X.m5559m().m5573k());
        mapM5658c.put("x-captcha-token", str);
        mapM5658c.put("authorization", C2156X.m5559m().m5574l());
        return mapM5658c;
    }

    /* JADX INFO: renamed from: u */
    private static void m776u() throws NoSuchAlgorithmException {
        String strM774q = m774q("get:/drive/v1/files", f365i);
        String str = f368l;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = new JSONObject(C2238b.m6066f("https://api-pan.xunlei.com/drive/v1/files:batchDelete", C2185u.m5754a("{\"ids\":[\"", jSONObject.getString(jSONObject.keys().next()), "\"],\"space\":\"\"}"), m775r(strM774q)).m6076a()).optString("task_id");
            if (strOptString.isEmpty()) {
                return;
            }
            OkHttp.string("https://api-pan.xunlei.com/drive/v1/tasks/" + strOptString, m775r(strM774q));
        } catch (JSONException e) {
        }
    }
}
