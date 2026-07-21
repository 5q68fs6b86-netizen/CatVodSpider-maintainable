package com.github.catvod.spider.support.p116a;

import android.util.Base64;
import com.github.catvod.spider.Danmu;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p128m.C2268k;
import com.github.catvod.spider.support.p128m.C2269l;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p116a.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2137a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f5007a = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)|http((?!http).)*?video/tos*");

    /* JADX INFO: renamed from: a */
    public static String m5394a(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        if (i <= 0) {
            return stringBuffer.toString();
        }
        int i2 = 0;
        do {
            i2++;
            stringBuffer.append("0123456789abcdef".charAt(random.nextInt(16)));
        } while (i2 < i);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m5395a(String str, String str2) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(bArrDecode), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static StringBuilder m5396a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5397a(String str) {
        if (str.contains("url=http") || str.contains(".js") || str.contains(".css") || str.contains(".html")) {
            return false;
        }
        return f5007a.matcher(str).find();
    }

    public static String addDanmaku(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("danmaku", Proxy.getUrl() + "?do=diydanmu");
            return jSONObject.toString();
        } catch (Exception e) {
            return str;
        }
    }

    public static String filterCloudDiskLinks(String str) {
        if (str == null || str.trim().isEmpty()) {
            return str;
        }
        String strOptString = new JSONObject(C2268k.m6164a(C2268k.m6169c("/config.json"))).optString("panBlock");
        if (strOptString.contains("夸克网盘") && Pattern.compile("pan\\.quark\\.cn").matcher(str).find()) {
            return "";
        }
        if (strOptString.contains("UC网盘") && Pattern.compile("drive\\.uc\\.cn").matcher(str).find()) {
            return "";
        }
        if (strOptString.contains("百度网盘") && Pattern.compile("pan\\.baidu\\.com").matcher(str).find()) {
            return "";
        }
        if (strOptString.contains("123云盘") && Pattern.compile("123(?:pan)?[0-9]*\\.(?:com|cn)").matcher(str).find()) {
            return "";
        }
        if (strOptString.contains("天翼云盘") && Pattern.compile("cloud\\.189\\.cn").matcher(str).find()) {
            return "";
        }
        if (strOptString.contains("阿里云盘") && Pattern.compile("(www\\.aliyundrive\\.com|www\\.alipan\\.com)").matcher(str).find()) {
            return "";
        }
        if (strOptString.contains("移动云盘") && Pattern.compile("caiyun\\.139\\.com").matcher(str).find()) {
            return "";
        }
        if (strOptString.contains("迅雷云盘") && Pattern.compile("pan\\.xunlei\\.com").matcher(str).find()) {
            return "";
        }
        return (strOptString.contains("光鸭云盘") && Pattern.compile("www\\.guangyapan\\.com/").matcher(str).find()) ? "" : str;
    }

    public static void parseJsonAndSave(String str) {
        try {
            saveName(new JSONObject(str).getJSONArray("list").getJSONObject(0).optString("vod_name"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static String processVodData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray jSONArray = jSONObject.getJSONArray("list");
        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
        String string = jSONObject2.getString("vod_name");
        saveName(string);
        C2269l.m6176a("danmuvodname", string);
        if (jSONObject2.has("vod_content")) {
            jSONObject2.put("vod_content", jSONObject2.getString("vod_content").replaceAll("\\[.*?\\]", "").replace(" ", ""));
        }
        if (jSONObject2.has("vod_play_url")) {
            jSONObject2.put("vod_play_url", jSONObject2.getString("vod_play_url").replaceAll("\\[\\d{4,8}\\]", ""));
            jSONArray.put(0, jSONObject2);
            jSONObject.put("list", jSONArray);
            str = jSONObject.toString();
        }
        return processVodJsonSimple(str);
    }

    private static String processVodJsonSimple(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Gson gson = new Gson();
        try {
            JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
            JsonObject asJsonObject2 = asJsonObject.getAsJsonArray("list").get(0).getAsJsonObject();
            String asString = asJsonObject2.get("vod_play_url").getAsString();
            String asString2 = asJsonObject2.get("vod_play_from").getAsString();
            String[] strArrSplit = asString.split("\\$\\$\\$");
            String[] strArrSplit2 = asString2.split("\\$\\$\\$");
            if (strArrSplit.length != strArrSplit2.length) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < strArrSplit.length; i++) {
                String str2 = strArrSplit[i];
                if (!str2.contains("null") && !str2.contains("分享地址已失效") && !str2.contains("分享不存在") && !str2.contains("文件不存在") && !str2.contains("好友已取消了分享") && !str2.contains("分享已过期") && !str2.contains("分享者用户封禁链接查看受限") && !str2.contains("当前分享链接下无视频文件") && !str2.contains("文件涉及违规内容") && !str2.contains("分享文件夹为空")) {
                    if (sb.length() > 0) {
                        sb.append("$$$");
                        sb2.append("$$$");
                    }
                    sb.append(str2);
                    sb2.append(strArrSplit2[i]);
                }
            }
            asJsonObject2.addProperty("vod_play_url", sb.toString());
            asJsonObject2.addProperty("vod_play_from", sb2.toString());
            return gson.toJson(asJsonObject);
        } catch (Exception e) {
            return str;
        }
    }

    public static void saveName(String str) {
        String string;
        boolean z;
        boolean z2;
        try {
            String strM6177b = C2269l.m6177b("historyvodname");
            JSONArray jSONArray = new JSONArray();
            if (str != null && !str.isEmpty()) {
                String realName = Danmu.getRealName(str);
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        z2 = false;
                        break;
                    } else {
                        if (realName.equals(jSONArray.get(i))) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (!z2) {
                    jSONArray.put(realName);
                }
            }
            if (strM6177b != null && !strM6177b.isEmpty() && !strM6177b.equals("[]")) {
                JSONArray jSONArray2 = new JSONArray(strM6177b);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    Object obj = jSONArray2.get(i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= jSONArray.length()) {
                            z = false;
                            break;
                        } else {
                            if (obj.equals(jSONArray.get(i3))) {
                                z = true;
                                break;
                            }
                            i3++;
                        }
                    }
                    if (!z) {
                        jSONArray.put(obj);
                    }
                }
            }
            while (jSONArray.length() > 10) {
                jSONArray.remove(jSONArray.length() - 1);
            }
            string = jSONArray.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            string = "[]";
        }
        C2269l.m6176a("historyvodname", string);
    }
}
