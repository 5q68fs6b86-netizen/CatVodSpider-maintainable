package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p117b.C2185u;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Kuwo extends Spider {

    /* JADX INFO: renamed from: a */
    private static final Pattern f215a = Pattern.compile("<[^>]+>");

    /* JADX INFO: renamed from: b */
    private static final Pattern f216b = Pattern.compile("[$#]");

    /* JADX INFO: renamed from: a */
    private String m587a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vod_id", str);
            jSONObject.put("vod_name", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("vod_pic", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("vod_remarks", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("vod_actor", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("vod_content", str6);
            }
            jSONObject.put("vod_play_from", "酷我音乐");
            jSONObject.put("vod_play_url", str7);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (JSONException unused) {
            return "{}";
        }
    }

    /* JADX INFO: renamed from: c */
    private JSONArray m588c(String str) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 1; i <= 10; i++) {
            try {
                JSONObject jSONObjectM591i = m591i("http://wapi.kuwo.cn/api/www/artist/artistMusic?artistid=" + str + "&pn=" + i + "&rn=30");
                JSONArray jSONArrayOptJSONArray = jSONObjectM591i != null ? jSONObjectM591i.optJSONArray("list") : null;
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    break;
                    break;
                }
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                    if (!TextUtils.isEmpty(jSONObject.optString("name", "").trim())) {
                        jSONArray.put(jSONObject);
                        if (jSONArray.length() >= 300) {
                            return jSONArray;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: d */
    private String m589d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int iMin = Math.min(jSONArray.length(), 300);
        for (int i = 0; i < iMin; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("name");
                String strTrim = TextUtils.isEmpty(strOptString) ? "" : f216b.matcher(strOptString).replaceAll("").trim();
                String strOptString2 = jSONObjectOptJSONObject.optString("rid");
                if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strOptString2)) {
                    String strOptString3 = jSONObjectOptJSONObject.optString("album");
                    arrayList.add(TextUtils.isEmpty(strOptString3) ? C2185u.m5754a(strTrim, "$", strOptString2) : strTrim + " - " + strOptString3 + "$" + strOptString2);
                }
            }
        }
        return TextUtils.join("#", arrayList);
    }

    /* JADX INFO: renamed from: f */
    private Map<String, String> m590f() {
        return C2174h.m5658c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36", "Referer", "http://www.kuwo.cn/");
    }

    /* JADX INFO: renamed from: i */
    private JSONObject m591i(String str) {
        return new JSONObject(OkHttp.string(str, m590f())).optJSONObject("data");
    }

    /* JADX INFO: renamed from: j */
    private String m592j(String str) {
        StringBuilder sbM5396a;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith("//")) {
            sbM5396a = C2137a.m5396a("https:");
        } else {
            if (!str.startsWith("http://")) {
                return str;
            }
            sbM5396a = C2137a.m5396a("https://");
            str = str.substring(7);
        }
        sbM5396a.append(str);
        return sbM5396a.toString();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax = 1;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObjectM591i = m591i("http://wapi.kuwo.cn/api/www/artist/artistInfo?category=" + str + "&prefix=&pn=" + iMax + "&rn=30");
            JSONArray jSONArrayOptJSONArray = jSONObjectM591i != null ? jSONObjectM591i.optJSONArray("artistList") : null;
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject.optString("id");
                    String strOptString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        String strOptString3 = jSONObject.optString("pic300");
                        if (TextUtils.isEmpty(strOptString3)) {
                            strOptString3 = jSONObject.optString("pic");
                        }
                        if (TextUtils.isEmpty(strOptString3)) {
                            strOptString3 = jSONObject.optString("pic120");
                        }
                        Vod c2194e = new Vod(strOptString, strOptString2, m592j(strOptString3), "");
                        c2194e.m5841d(Vod.a.m5857a());
                        arrayList.add(c2194e);
                    }
                }
            }
            C2192c c2192c = Result.get()();
            c2192c.m5829w(arrayList);
            c2192c.m5817i(iMax, 9999, 30, 999999);
            return c2192c.toString();
        } catch (Exception unused2) {
            C2192c c2192c2 = Result.get()();
            c2192c2.m5829w(new ArrayList());
            return c2192c2.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008d  */
    public String detailContent(List<String> list) {
        String str;
        if (list == null || list.isEmpty()) {
            return "{}";
        }
        String str2 = list.get(0);
        try {
            JSONObject jSONObjectM591i = m591i("http://wapi.kuwo.cn/api/www/artist/artist?artistid=" + str2);
            if (jSONObjectM591i == null) {
                return m587a(str2, "加载失败", "", "加载失败", "未知", "加载歌手信息失败", "");
            }
            String strOptString = jSONObjectM591i.optString("name");
            String strM592j = m592j(jSONObjectM591i.optString("pic300", jSONObjectM591i.optString("pic")));
            String strOptString2 = jSONObjectM591i.optString("info");
            if (TextUtils.isEmpty(strOptString2)) {
                str = "暂无歌手简介";
            } else {
                String strTrim = f215a.matcher(strOptString2).replaceAll("").replace("&nbsp;", " ").replace("\r\n", "\n").replace("\r", "\n").trim();
                if (TextUtils.isEmpty(strTrim)) {
                    str = "暂无歌手简介";
                } else {
                    str = strTrim;
                }
            }
            JSONArray jSONArrayM588c = m588c(str2);
            return m587a(str2, strOptString, strM592j, "歌曲 :   " + Math.min(jSONArrayM588c.length(), 300) + "首", strOptString, str, m589d(jSONArrayM588c));
        } catch (Exception e) {
            StringBuilder sbM5396a = C2137a.m5396a("错误: ");
            sbM5396a.append(e.getMessage());
            return m587a(str2, "加载失败", "", "加载失败", "未知", sbM5396a.toString(), "");
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Class("1", "华语男"));
        arrayList.add(new Class("2", "华语女"));
        arrayList.add(new Class("3", "华语组合"));
        arrayList.add(new Class("4", "日韩男"));
        arrayList.add(new Class("5", "日韩女"));
        arrayList.add(new Class("6", "日韩组合"));
        arrayList.add(new Class("7", "欧美男"));
        arrayList.add(new Class("8", "欧美女"));
        arrayList.add(new Class("9", "欧美组合"));
        arrayList.add(new Class("0", "其他"));
        return Result.string(arrayList, new ArrayList());
    }

    public String homeVideoContent() {
        return categoryContent("1", "1", false, new HashMap<>());
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        String strSubstring = str2;
        try {
            if (strSubstring.contains("$")) {
                strSubstring = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
            }
            if (strSubstring.startsWith("MUSIC_")) {
                strSubstring = strSubstring.substring(6);
            }
            String strTrim = strSubstring.trim();
            if (TextUtils.isEmpty(strTrim)) {
                C2192c c2192c = Result.get()();
                c2192c.m5821k(0);
                c2192c.m5827u("");
                return c2192c.toString();
            }
            String str3 = "https://nmobi.kuwo.cn/mobi.s?f=web&user=0&source=kwplayer_ar_4.4.2.7_B_nuoweida_vh.apk&type=convert_url_with_sign&rid=" + strTrim + "&bitrate=128&format=mp3";
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; Android 10)");
            map.put("Referer", "https://www.kuwo.cn/");
            try {
                JSONObject jSONObject = new JSONObject(OkHttp.string(str3, map));
                strOptString = (jSONObject.optInt("code", 0) != 200 || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) ? "" : jSONObjectOptJSONObject.optString("url");
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("http")) {
                HashMap map2 = new HashMap();
                map2.put("User-Agent", "Mozilla/5.0 (Linux; Android 10)");
                map2.put("Accept", "*/*");
                C2192c c2192c2 = Result.get()();
                c2192c2.m5821k(0);
                c2192c2.m5827u(strOptString);
                c2192c2.m5815h();
                c2192c2.m5811e((Map<String, String>) map2);
                try {
                    JSONObject jSONObjectOptJSONObject2 = new JSONObject(OkHttp.string("https://kuwo.cn/openapi/v1/www/lyric/getlyric?musicId=" + strTrim, m590f())).optJSONObject("data");
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray("lrclist") : null;
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject3 != null) {
                                double dOptDouble = jSONObjectOptJSONObject3.optDouble("time", 0.0d);
                                String strOptString2 = jSONObjectOptJSONObject3.optString("lineLyric", "");
                                if (sb.length() > 0) {
                                    sb.append('\n');
                                }
                                sb.append(String.format(Locale.US, "[%02d:%05.2f]%s", Integer.valueOf((int) (dOptDouble / 60.0d)), Double.valueOf(dOptDouble % 60.0d), strOptString2));
                            }
                        }
                        if (sb.length() > 0) {
                            c2192c2.m5818i(sb.toString());
                        }
                    }
                } catch (Exception unused2) {
                }
                return c2192c2.toString();
            }
            C2192c c2192c3 = Result.get()();
            c2192c3.m5821k(0);
            c2192c3.m5827u("");
            return c2192c3.toString();
        } catch (Exception unused3) {
            C2192c c2192c4 = Result.get()();
            c2192c4.m5821k(0);
            c2192c4.m5827u("");
            return c2192c4.toString();
        }
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "{}";
        }
        int iMax = 1;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject = new JSONObject(OkHttp.string("https://search.kuwo.cn/r.s?client=kt&pn=" + ((iMax - 1) * 30) + "&rn=30&all=" + URLEncoder.encode(str.trim(), "UTF-8") + "&vipver=1&ft=artist&encoding=utf8&rformat=json&mobi=1", m590f()));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("abslist");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                String strOptString = jSONObject.optString("BASEPICPATH", "http://img1.kuwo.cn/star/starheads/");
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString2 = jSONObject2.optString("ARTISTID", jSONObject2.optString("DC_TARGETID"));
                    if (!TextUtils.isEmpty(strOptString2)) {
                        String strOptString3 = jSONObject2.optString("hts_PICPATH");
                        if (TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(jSONObject2.optString("PICPATH"))) {
                            strOptString3 = strOptString + jSONObject2.optString("PICPATH");
                        }
                        String strOptString4 = jSONObject2.optString("ARTIST");
                        Vod c2194e = new Vod(strOptString2, strOptString4, m592j(strOptString3), "歌曲 :  " + jSONObject2.optString("SONGNUM", "0") + "首");
                        c2194e.m5841d(Vod.a.m5857a());
                        arrayList.add(c2194e);
                    }
                }
            }
            C2192c c2192c = Result.get()();
            c2192c.m5829w(arrayList);
            c2192c.m5817i(iMax, 9999, 30, 999999);
            return c2192c.toString();
        } catch (Exception unused2) {
            return "{}";
        }
    }
}
