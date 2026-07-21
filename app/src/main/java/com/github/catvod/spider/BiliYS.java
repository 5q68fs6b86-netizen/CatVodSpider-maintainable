package com.github.catvod.spider;
import com.github.catvod.spider.support.p117b.C2177k;
import com.github.catvod.spider.support.p117b.C2174h;
import com.github.catvod.spider.support.p116a.C2137a;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p121f.C2212a;
import com.github.catvod.spider.support.p121f.C2213b;
import com.github.catvod.spider.support.p121f.C2214c;
import com.github.catvod.spider.support.p121f.C2216e;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Path;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class BiliYS extends Spider {

    /* JADX INFO: renamed from: a */
    private static String f146a;

    /* JADX INFO: renamed from: b */
    private static HashMap f147b;

    /* JADX INFO: renamed from: a */
    private JsonObject f148a;

    /* JADX INFO: renamed from: c */
    private boolean f149c;

    /* JADX INFO: renamed from: d */
    private boolean f150d;

    /* JADX INFO: renamed from: e */
    private static Map<String, String> m471e() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36 Edg/143.0.0.0");
        String asString = f146a;
        if (TextUtils.isEmpty(asString)) {
            String strM6164a = Path.read(Path.tv("/bili_cookie.txt"));
            asString = !TextUtils.isEmpty(strM6164a) ? JsonParser.parseString(strM6164a).getAsJsonObject().get("cookie").getAsString() : "";
        }
        if (TextUtils.isEmpty(asString)) {
            asString = "buvid3=04E9092E-4D34-B728-CB76-E5BCBEC43B5129057infoc";
        }
        map.put("cookie", asString.replace(",", "%2C"));
        map.put("Referer", "https://www.bilibili.com");
        return map;
    }

    /* JADX INFO: renamed from: f */
    private static Map<String, String> m472f() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Referer", "https://search.bilibili.com");
        map.put("cookie", "buvid3=04E9092E-4D34-B728-CB76-E5BCBEC43B5129057infoc");
        return map;
    }

    /* JADX INFO: renamed from: g */
    private static String m473g(C2214c c2214c) {
        String str;
        if (c2214c.m5974h().startsWith("video")) {
            str = String.format(Locale.getDefault(), "height='%s' width='%s' frameRate='%s' sar='%s'", c2214c.m5972f(), c2214c.m5978l(), c2214c.m5971e(), c2214c.m5975i());
        } else {
            if (!c2214c.m5974h().startsWith("audio")) {
                return "";
            }
            str = String.format("numChannels='2' sampleRate='%s'", m475h().get(c2214c.m5973g()));
        }
        return m474h(c2214c, str);
    }

    /* JADX INFO: renamed from: h */
    private static String m474h(C2214c c2214c, String str) {
        return String.format(Locale.getDefault(), "<AdaptationSet>\n<ContentComponent contentType=\"%s\"/>\n<Representation id=\"%s\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%s\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>", c2214c.m5974h().split("/")[0], c2214c.m5973g() + "_" + c2214c.m5969c(), c2214c.m5967a(), c2214c.m5970d(), c2214c.m5974h(), str, c2214c.m5977k(), c2214c.m5968b().replace("&", "&amp;"), c2214c.m5976j().m5993a(), c2214c.m5976j().m5994b());
    }

    /* JADX INFO: renamed from: h */
    private static HashMap<String, String> m475h() {
        HashMap<String, String> map = new HashMap<>();
        map.put("30280", "192000");
        map.put("30232", "132000");
        map.put("30216", "64000");
        return map;
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get("aid");
        String str2 = map.get("cid");
        String str3 = map.get("qn");
        C2212a c2212aM5951e = C2216e.m5981b(OkHttp.string(C2174h.m5657b(C2177k.m5714a("https://api.bilibili.com/pgc/player/web/playurl?avid=", str, "&cid=", str2, "&qn="), str3, "&fnval=4048&fourk=1"), m471e())).m5983b().m5951e();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (C2214c c2214c : c2212aM5951e.m5943a()) {
            Iterator<String> it = m475h().keySet().iterator();
            while (it.hasNext()) {
                if (c2214c.m5973g().equals(it.next())) {
                    sb2.append(m473g(c2214c));
                }
            }
        }
        for (C2214c c2214c2 : c2212aM5951e.m5946d()) {
            if (c2214c2.m5973g().equals(str3)) {
                sb.append(m473g(c2214c2));
            }
        }
        return new Object[]{200, "application/dash+xml", new ByteArrayInputStream(String.format(Locale.getDefault(), "<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT%sS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", c2212aM5951e.m5944b(), c2212aM5951e.m5945c(), c2212aM5951e.m5944b(), sb.toString(), sb2.toString()).getBytes())};
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectOptJSONObject = new JSONObject(OkHttp.string("https://api.bilibili.com/pgc/season/index/result?order=" + (map.containsKey("order") ? map.get("order") : "2") + "&season_status=" + (map.containsKey("season_status") ? map.get("season_status") : "-1") + "&style_id=-1&sort=-1&area=-1&pagesize=20&type=1&season_type=" + str + "&page=" + str2, m472f())).optJSONObject("data");
        JSONArray jSONArray2 = jSONObjectOptJSONObject.getJSONArray("list");
        for (int i = 0; i < jSONArray2.length(); i++) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("vod_name", jSONObject2.optString("title"));
            jSONObject3.put("vod_id", jSONObject2.optString("season_id"));
            jSONObject3.put("vod_pic", jSONObject2.optString("cover"));
            jSONObject3.put("vod_remarks", jSONObject2.optString("index_show"));
            jSONArray.put(jSONObject3);
        }
        jSONObject.put("page", jSONObjectOptJSONObject.optString("num"));
        jSONObject.put("pagecount", Integer.parseInt(jSONObjectOptJSONObject.optString("total")) / Integer.parseInt(jSONObjectOptJSONObject.optString("size")));
        jSONObject.put("limit", jSONObjectOptJSONObject.optString("size"));
        jSONObject.put("total", jSONObjectOptJSONObject.optString("total"));
        jSONObject.put("list", jSONArray);
        return jSONObject.toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        if (!this.f150d) {
            C2213b c2213bM5982a = C2216e.m5981b(OkHttp.string("https://api.bilibili.com/x/web-interface/nav", m471e())).m5982a();
            this.f150d = c2213bM5982a.m5958k();
            this.f149c = c2213bM5982a.m5966s();
        }
        String str = list.get(0);
        JSONObject jSONObjectM828c = C0082a.m828c(OkHttp.string(C2139c.m5408a("https://api.bilibili.com/pgc/view/web/season?season_id=", str), m471e()), "result");
        Vod c2194eM812b = C0082a.m812b(str);
        c2194eM812b.m5849k(jSONObjectM828c.getString("title"));
        c2194eM812b.m5850l(jSONObjectM828c.getString("cover"));
        c2194eM812b.m5846h(jSONObjectM828c.getString("evaluate"));
        c2194eM812b.m5847i("");
        c2194eM812b.m5843f(jSONObjectM828c.getString("actors"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = jSONObjectM828c.getJSONArray("episodes");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getJSONObject(i).getString("share_copy") + "$" + jSONArray.getJSONObject(i).getString("aid") + Marker.ANY_NON_NULL_MARKER + jSONArray.getJSONObject(i).getString("cid"));
        }
        if (arrayList.size() > 0) {
            linkedHashMap.put("哔哩影视", TextUtils.join("#", arrayList));
        }
        if (linkedHashMap.size() > 0) {
            C0082a.m821b(linkedHashMap, "$$$", c2194eM812b, "$$$");
        }
        return Vod.m5837e(c2194eM812b);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "2", "3", "4", "5", "7");
        List listAsList2 = Arrays.asList("番剧", "电影", "纪录", "国创", "剧集", "综艺");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new Class((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return C2192c.m5805s(arrayList, new JSONObject("{\"1\":[{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"弹幕数量\",\"v\":\"1\"},{\"n\":\"播放数量\",\"v\":\"2\"},{\"n\":\"追看人数\",\"v\":\"3\"},{\"n\":\"最高评分\",\"v\":\"4\"},{\"n\":\"开播时间\",\"v\":\"5\"},{\"n\":\"上映时间\",\"v\":\"6\"}]},{\"key\":\"season_status\",\"name\":\"付费\",\"value\":[{\"n\":\"全部\",\"v\":\"-1\"},{\"n\":\"免费\",\"v\":\"1\"},{\"n\":\"付费\",\"v\":\"2%2C6\"},{\"n\":\"大会员\",\"v\":\"4%2C6\"}]}],\"2\":[{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"弹幕数量\",\"v\":\"1\"},{\"n\":\"播放数量\",\"v\":\"2\"},{\"n\":\"追看人数\",\"v\":\"3\"},{\"n\":\"最高评分\",\"v\":\"4\"},{\"n\":\"开播时间\",\"v\":\"5\"},{\"n\":\"上映时间\",\"v\":\"6\"}]},{\"key\":\"season_status\",\"name\":\"付费\",\"value\":[{\"n\":\"全部\",\"v\":\"-1\"},{\"n\":\"免费\",\"v\":\"1\"},{\"n\":\"付费\",\"v\":\"2%2C6\"},{\"n\":\"大会员\",\"v\":\"4%2C6\"}]}],\"3\":[{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"弹幕数量\",\"v\":\"1\"},{\"n\":\"播放数量\",\"v\":\"2\"},{\"n\":\"追看人数\",\"v\":\"3\"},{\"n\":\"最高评分\",\"v\":\"4\"},{\"n\":\"开播时间\",\"v\":\"5\"},{\"n\":\"上映时间\",\"v\":\"6\"}]},{\"key\":\"season_status\",\"name\":\"付费\",\"value\":[{\"n\":\"全部\",\"v\":\"-1\"},{\"n\":\"免费\",\"v\":\"1\"},{\"n\":\"付费\",\"v\":\"2%2C6\"},{\"n\":\"大会员\",\"v\":\"4%2C6\"}]}],\"4\":[{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"弹幕数量\",\"v\":\"1\"},{\"n\":\"播放数量\",\"v\":\"2\"},{\"n\":\"追看人数\",\"v\":\"3\"},{\"n\":\"最高评分\",\"v\":\"4\"},{\"n\":\"开播时间\",\"v\":\"5\"},{\"n\":\"上映时间\",\"v\":\"6\"}]},{\"key\":\"season_status\",\"name\":\"付费\",\"value\":[{\"n\":\"全部\",\"v\":\"-1\"},{\"n\":\"免费\",\"v\":\"1\"},{\"n\":\"付费\",\"v\":\"2%2C6\"},{\"n\":\"大会员\",\"v\":\"4%2C6\"}]}],\"5\":[{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"弹幕数量\",\"v\":\"1\"},{\"n\":\"播放数量\",\"v\":\"2\"},{\"n\":\"追看人数\",\"v\":\"3\"},{\"n\":\"最高评分\",\"v\":\"4\"},{\"n\":\"开播时间\",\"v\":\"5\"},{\"n\":\"上映时间\",\"v\":\"6\"}]},{\"key\":\"season_status\",\"name\":\"付费\",\"value\":[{\"n\":\"全部\",\"v\":\"-1\"},{\"n\":\"免费\",\"v\":\"1\"},{\"n\":\"付费\",\"v\":\"2%2C6\"},{\"n\":\"大会员\",\"v\":\"4%2C6\"}]}],\"7\":[{\"key\":\"order\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"弹幕数量\",\"v\":\"1\"},{\"n\":\"播放数量\",\"v\":\"2\"},{\"n\":\"追看人数\",\"v\":\"3\"},{\"n\":\"最高评分\",\"v\":\"4\"},{\"n\":\"开播时间\",\"v\":\"5\"},{\"n\":\"上映时间\",\"v\":\"6\"}]},{\"key\":\"season_status\",\"name\":\"付费\",\"value\":[{\"n\":\"全部\",\"v\":\"-1\"},{\"n\":\"免费\",\"v\":\"1\"},{\"n\":\"付费\",\"v\":\"2%2C6\"},{\"n\":\"大会员\",\"v\":\"4%2C6\"}]}]}"));
    }

    public void init(Context context, String str) {
        JsonObject jsonObject;
        JsonElement jsonElement;
        String asString;
        JsonElement jsonElement2;
        try {
            jsonObject = JsonParser.parseString(str).getAsJsonObject();
        } catch (Exception unused) {
            jsonObject = new JsonObject();
        }
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        this.f148a = jsonObject;
        String asString2 = "";
        if (jsonObject.has("cookie") && (jsonElement2 = jsonObject.get("cookie")) != null && !jsonElement2.isJsonNull()) {
            try {
                asString2 = jsonElement2.getAsString();
            } catch (Exception unused2) {
            }
        }
        f146a = asString2;
        if (asString2.startsWith("http")) {
            try {
                JsonObject asJsonObject = JsonParser.parseString(OkHttp.string(asString2, null)).getAsJsonObject();
                if (!asJsonObject.has("cookie") || (jsonElement = asJsonObject.get("cookie")) == null || jsonElement.isJsonNull() || (asString = jsonElement.getAsString()) == null) {
                    f146a = "";
                } else {
                    f146a = asString.trim();
                }
            } catch (Exception unused3) {
                f146a = "";
            }
        }
        if (TextUtils.isEmpty(f146a)) {
            f146a = "";
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split("\\+");
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C2213b c2213bM5983b = C2216e.m5981b(OkHttp.string(C2174h.m5656a("https://api.bilibili.com/pgc/player/web/playurl?avid=", str3, "&cid=", str4, "&qn=127&fnval=4048&fourk=1"), m471e())).m5983b();
        for (int i = 0; i < c2213bM5983b.m5948b().size(); i++) {
            int iIntValue = c2213bM5983b.m5948b().get(i).intValue();
            if ((this.f150d || iIntValue <= 32) && (this.f149c || iIntValue <= 80)) {
                arrayList2.add(c2213bM5983b.m5948b().get(i));
                arrayList.add(c2213bM5983b.m5947a().get(i));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        String strConcat = "https://api.bilibili.com/x/v1/dm/list.so?oid=".concat(str4);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList3.add((String) arrayList.get(i2));
            arrayList3.add(Proxy.getUrl() + "?do=biliys&aid=" + str3 + "&cid=" + str4 + "&qn=" + arrayList2.get(i2) + "&type=mpd");
        }
        C2192c c2192c = new C2192c();
        c2192c.m5828v(arrayList3);
        c2192c.m5806a(strConcat);
        c2192c.m5808b();
        c2192c.m5811e(m471e());
        return c2192c.toString();
    }

    public String searchContent(String str, String str2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbM5396a = C2137a.m5396a("https://api.bilibili.com/x/web-interface/search/type?search_type=media_ft&keyword=");
        sbM5396a.append(URLEncoder.encode(str));
        sbM5396a.append("&page=");
        sbM5396a.append(str2);
        JSONObject jSONObject = new JSONObject(OkHttp.string(sbM5396a.toString(), m472f()));
        String str3 = "index_show";
        String str4 = "cover";
        String str5 = "season_id";
        if (jSONObject.getJSONObject("data").has("result")) {
            JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("result");
            int iM5716c = 0;
            while (iM5716c < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(iM5716c);
                String string = jSONObject2.getString(str5);
                String string2 = jSONObject2.getString(str4);
                int i = iM5716c;
                JSONArray jSONArray2 = jSONArray;
                iM5716c = C2177k.m5716c(string, jSONObject2.getString("title").replaceAll("<[^>]*>", ""), string2, jSONObject2.getString(str3), arrayList, i, 1);
                str5 = str5;
                str4 = str4;
                str3 = str3;
                jSONArray = jSONArray2;
                arrayList = arrayList;
            }
        }
        ArrayList arrayList2 = arrayList;
        String str6 = str3;
        String str7 = str5;
        String str8 = str4;
        StringBuilder sbM5396a2 = C2137a.m5396a("https://api.bilibili.com/x/web-interface/search/type?search_type=media_bangumi&keyword=");
        sbM5396a2.append(URLEncoder.encode(str));
        sbM5396a2.append("&page=");
        sbM5396a2.append(str2);
        JSONObject jSONObject3 = new JSONObject(OkHttp.string(sbM5396a2.toString(), m472f()));
        if (jSONObject3.getJSONObject("data").has("result")) {
            JSONArray jSONArray3 = jSONObject3.getJSONObject("data").getJSONArray("result");
            int iM5716c2 = 0;
            while (iM5716c2 < jSONArray3.length()) {
                JSONObject jSONObject4 = jSONArray3.getJSONObject(iM5716c2);
                iM5716c2 = C2177k.m5716c(jSONObject4.getString(str7), jSONObject4.getString("title").replaceAll("<[^>]*>", ""), jSONObject4.getString(str8), jSONObject4.getString(str6), arrayList2, iM5716c2, 1);
            }
        }
        return Result.string(arrayList2);
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
