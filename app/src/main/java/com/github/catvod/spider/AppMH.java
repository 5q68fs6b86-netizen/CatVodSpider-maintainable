package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.spider.support.p118c.C2192c;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppMH extends Spider {

    /* JADX INFO: renamed from: a */
    private String f94a;

    /* JADX INFO: renamed from: b */
    private String f95b;

    /* JADX INFO: renamed from: c */
    private String f96c;

    /* JADX INFO: renamed from: e */
    private static final String f90e = "SF-A962FEC75DA28D7514F2A16580334272A78AC0A8429F10C94F47C1BAFC876E3F";

    /* JADX INFO: renamed from: f */
    private static final String f91f = "com.damahou.tv";

    /* JADX INFO: renamed from: g */
    private static final String f92g = "SK-woniu-thanks";

    /* JADX INFO: renamed from: h */
    private static final String f93h = "1";

    /* JADX INFO: renamed from: d */
    private static final Random f89d = new Random();

    /* JADX INFO: renamed from: a */
    private String m420a(String str) {
        try {
            return new JSONObject(OkHttp.string(this.f94a + str, m421b())).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private HashMap<String, String> m421b() {
        String upperCase;
        HashMap<String, String> map = new HashMap<>();
        map.put("user-agent", "okhttp/4.12.0");
        map.put("accept", "application/json");
        map.put("x-platform", "android");
        String str = f93h;
        map.put("x-ave", str);
        String str2 = f91f;
        map.put("x-aid", str2);
        map.put("x-time", this.f95b);
        map.put("x-nonc", this.f96c);
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(String.format("finger=%s&id=%s&nonce=%s&sk=%s&time=%s&v=%s", f90e, str2, this.f96c, f92g, this.f95b, str).getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            upperCase = sb.toString().toUpperCase();
        } catch (Exception e) {
            upperCase = "";
        }
        map.put("x-sign", upperCase);
        map.put("x-device-id", "23d5ba9ce57a9508");
        map.put("x-device-brand", "vivo");
        map.put("x-device-model", "V2309A");
        map.put("x-update-id", "43c1ef69-3748-aaeb-317f-c621c77653ee");
        return map;
    }

    /* JADX INFO: renamed from: c */
    private String m422c(String str) {
        try {
            Matcher matcher = Pattern.compile("_0x1\\s*=\\s*\\[(.*?)\\];").matcher(str);
            if (!matcher.find()) {
                System.out.println("未匹配到JS中的组，解析失败");
                return "";
            }
            String[] strArrSplit = matcher.group(1).split(",");
            String strTrim = strArrSplit[0].replaceAll("['\"]", "").trim();
            String strTrim2 = strArrSplit[1].replaceAll("['\"]", "").trim();
            String str2 = String.format("%s:%s:%s:%s", strTrim, strTrim2, strArrSplit[2].replaceAll("['\"]", "").trim(), strArrSplit[3].replaceAll("['\"]", "").trim());
            long jCharAt = 0;
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                jCharAt = (((jCharAt << 5) - jCharAt) + ((long) str2.charAt(i))) & 4294967295L;
            }
            return String.format("%s:%s:%s", strTrim, Long.toHexString(Math.abs(jCharAt)), strTrim2.substring(0, 8));
        } catch (Exception e) {
            System.out.println("异常信息：" + e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        new ArrayList();
        List<Vod> vodList = parseVodList(new JSONObject(m420a("/api.php/app/filter/vod?type_name=" + str + "&page=" + str2 + "&sort=hits")).optJSONArray("data"));
        C2192c c2192c = new C2192c();
        c2192c.m5817i(Integer.valueOf(str2).intValue(), 0, 0, 0);
        c2192c.m5829w(vodList);
        return c2192c.toString();
    }

    public String detailContent(List<String> list) {
        Vod c2194e = new Vod();
        try {
            JSONObject jSONObject = new JSONObject(m420a("/api.php/app/vod/get_detail?vod_id=" + list.get(0)));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONArray("data").optJSONObject(0);
            c2194e.m5848j(list.get(0));
            c2194e.m5849k(jSONObjectOptJSONObject.optString("vod_name"));
            c2194e.m5850l(jSONObjectOptJSONObject.optString("vod_pic"));
            c2194e.m5842e(jSONObjectOptJSONObject.optString("vod_class"));
            c2194e.m5853o(jSONObjectOptJSONObject.optString("vod_remarks"));
            c2194e.m5846h(jSONObjectOptJSONObject.optString("vod_content").trim());
            c2194e.m5843f(jSONObjectOptJSONObject.optString("vod_actor"));
            c2194e.m5847i(jSONObjectOptJSONObject.optString("vod_director"));
            String strOptString = jSONObjectOptJSONObject.optString("vod_name");
            HashMap map = new HashMap();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("vodplayer");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    map.put(jSONObject2.optString("from"), jSONObject2.optString("show"));
                }
            }
            String strOptString2 = jSONObjectOptJSONObject.optString("vod_play_from");
            String strOptString3 = jSONObjectOptJSONObject.optString("vod_play_url");
            String[] strArrSplit = strOptString2.split("\\$\\$\\$");
            StringBuilder sb = new StringBuilder();
            String[] strArrSplit2 = strOptString3.split("\\$\\$\\$");
            for (String str : strArrSplit) {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append(str);
                }
                sb.append("$$$");
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 3, sb.length());
            }
            StringBuilder sb2 = new StringBuilder();
            int i2 = 0;
            while (i2 < strArrSplit2.length) {
                String str3 = i2 < strArrSplit.length ? strArrSplit[i2] : "";
                String[] strArrSplit3 = strArrSplit2[i2].split("#");
                StringBuilder sb3 = new StringBuilder();
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 >= strArrSplit3.length) {
                        break;
                    }
                    String[] strArrSplit4 = strArrSplit3[i4].split("\\$");
                    String str4 = strArrSplit4[0];
                    String str5 = str4 + "$" + strArrSplit4[1] + "@" + str3 + "@" + strOptString + "@" + (str4.replaceAll("\\D+", "").isEmpty() ? "1" : str4.replaceAll("\\D+", ""));
                    if (sb3.length() > 0) {
                        sb3.append("#");
                    }
                    sb3.append(str5);
                    i3 = i4 + 1;
                }
                if (sb2.length() > 0 && sb3.length() > 0) {
                    sb2.append("$$$");
                }
                sb2.append((CharSequence) sb3);
                i2++;
            }
            c2194e.m5851m(sb.toString());
            c2194e.m5852n(sb2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String strM5795m = Result.string(c2194e);
        C2137a.parseJsonAndSave(strM5795m);
        return strM5795m;
    }

    public String homeContent(boolean z) throws JSONException {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject(m420a("/api.php/app/index/home")).getJSONObject("data");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("categories");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("recommend");
        int i2 = 0;
        while (true) {
            jSONArrayOptJSONArray.getClass();
            if (i2 >= jSONArrayOptJSONArray.length()) {
                break;
            }
            String string = jSONArrayOptJSONArray.getJSONObject(i2).getString("type_name");
            if (!string.equals("电影")) {
                arrayList.add(new Class(string, string));
            }
            i2++;
        }
        while (true) {
            jSONArrayOptJSONArray2.getClass();
            if (i >= jSONArrayOptJSONArray2.length()) {
                return Result.string(arrayList, parseVodList(jSONArray));
            }
            jSONArray.put(jSONArrayOptJSONArray2.getJSONObject(i));
            i++;
        }
    }

    public void init(Context context, String str) {
        if (str == null || str.isEmpty()) {
            str = "https://45.150.167.18:8000";
        }
        this.f94a = str;
        this.f95b = String.valueOf(System.currentTimeMillis() / 1000);
        this.f96c = String.valueOf(f89d.nextInt(999) + 1);
    }

    public List<Vod> parseVodList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            try {
                jSONArray.getClass();
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new Vod(jSONObject.optString("vod_id"), jSONObject.optString("vod_name"), jSONObject.optString("vod_pic"), jSONObject.optString("vod_remarks")));
                i++;
            } catch (Exception e) {
            }
        }
        return arrayList;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split("@");
            String strTrim = strArrSplit[0].trim();
            String strTrim2 = strArrSplit[1].trim();
            String str3 = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArrSplit[2].trim() + "&vodIndex=" + strArrSplit[3].trim() + "&vodUrl=";
            if (strTrim.matches(".*(m3u8|mp4|flv|avi|mov|mkv).*")) {
                return C2192c.m5792e().m5827u(strTrim).m5806a(str3).m5824o();
            }
            for (int i = 0; i < 3; i++) {
                String strM6073l = OkHttp.string(this.f94a + "/api.php/app/decode/url/?url=" + URLEncoder.encode(strTrim, "UTF-8") + "&vodFrom=" + strTrim2 + "", m421b());
                if (strM6073l != null && !strM6073l.trim().isEmpty()) {
                    JSONObject jSONObject = new JSONObject(strM6073l);
                    if (jSONObject.optInt("code", -1) == 2 && jSONObject.has("challenge")) {
                        String strTrim3 = jSONObject.optString("challenge").trim();
                        if (!strTrim3.isEmpty()) {
                            String strM422c = m422c(strTrim3);
                            if (!strM422c.trim().isEmpty()) {
                                String str4 = "&token=" + strM422c;
                            }
                        }
                    }
                    String strTrim4 = jSONObject.optString("data").trim();
                    return strTrim4.startsWith("http") ? C2192c.m5792e().m5827u(strTrim4).m5806a(str3).m5824o() : strTrim4;
                }
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return C2192c.m5797n("播放链接解析失败，请更换其他源播放");
        }
    }

    public String searchContent(String str, boolean z) {
        JSONArray jSONArrayOptJSONArray = new JSONObject(m420a("/api.php/app/search/index?wd=" + URLEncoder.encode(str) + "&page=1&limit=15")).optJSONArray("data");
        new ArrayList();
        return Result.string(parseVodList(jSONArrayOptJSONArray));
    }
}
