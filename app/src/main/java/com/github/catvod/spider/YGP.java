package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class YGP extends Spider {

    /* JADX INFO: renamed from: b */
    private static final String f369b = "https://www.6huo.com/";

    /* JADX INFO: renamed from: c */
    private static final String f370c = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36";

    /* JADX INFO: renamed from: a */
    private JSONObject f371a;

    /* JADX INFO: renamed from: b */
    private static String m777b(Pattern pattern, String str) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(1).trim() : str;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m778d(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("@Headers=");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
            jSONObject.put("Referer", "https://www.douban.com");
            sb.append(jSONObject.toString());
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    protected final HashMap<String, String> m779a() {
        HashMap<String, String> map = new HashMap<>();
        map.put("method", "GET");
        map.put("User-Agent", f370c);
        map.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        map.put("Accept-Language", "zh-CN,zh;q=0.9");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        int i2;
        try {
            String[] strArr = new String[5];
            strArr[0] = "";
            strArr[1] = "";
            strArr[2] = "";
            strArr[3] = "";
            strArr[4] = "";
            String str3 = f369b + str;
            strArr[4] = str2;
            if (map != null && map.size() > 0) {
                for (String str4 : map.keySet()) {
                    strArr[Integer.parseInt(str4)] = URLEncoder.encode(map.get(str4));
                }
            }
            String strM4479n = C1840c.m4479n(str3 + TextUtils.join("_", strArr), m779a());
            C1388h c1388hM3222g = C1286l.m3222g(strM4479n);
            JSONObject jSONObject = new JSONObject();
            C1551g c1551gM3478o0 = c1388hM3222g.m3478o0("p.page-nav a");
            if (c1551gM3478o0.size() == 0) {
                int i3 = Integer.parseInt(str2);
                i = i3;
                i2 = i3;
            } else {
                int i4 = 0;
                int i5 = 0;
                while (i5 < c1551gM3478o0.size()) {
                    C1393m c1393m = c1551gM3478o0.get(i5);
                    i5++;
                    i4 = isNumeric(c1393m.m3484v0()) ? i4 < Integer.parseInt(c1393m.m3484v0()) ? Integer.parseInt(c1393m.m3484v0()) : i4 : i4;
                }
                i = Integer.parseInt(c1388hM3222g.m3478o0("p.page-nav a.current").m3792i());
                i2 = i4;
            }
            JSONArray jSONArray = new JSONArray();
            if (!strM4479n.contains("没有找到您想要的结果哦")) {
                C1551g c1551gM3478o1 = c1388hM3222g.m3478o0("div.inner-2col-main div.movlist > ul li > a");
                for (int i6 = 0; i6 < c1551gM3478o1.size(); i6++) {
                    C1393m c1393m2 = c1551gM3478o1.get(i6);
                    String strMo3511c = c1393m2.mo3511c("href");
                    String strMo3511c2 = c1393m2.m3479p0("span").mo3511c("title");
                    String strMo3511c3 = c1393m2.m3479p0("img").mo3511c("src");
                    if (!strMo3511c3.contains("http")) {
                        strMo3511c3 = f369b + strMo3511c3;
                    }
                    String strM3484v0 = c1393m2.m3478o0("span").m3790g().m3484v0();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", strMo3511c);
                    jSONObject2.put("vod_name", strMo3511c2);
                    jSONObject2.put("vod_pic", m778d(strMo3511c3));
                    jSONObject2.put("vod_remarks", strM3484v0);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("page", i);
            jSONObject.put("pagecount", i2);
            jSONObject.put("limit", 30);
            jSONObject.put("total", i2 <= 1 ? jSONArray.length() : i2 * 30);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            StringBuilder sb = new StringBuilder();
            String str = f369b;
            sb.append(str);
            sb.append(list.get(0));
            C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(sb.toString(), m779a()));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            c1388hM3222g.m3478o0("div.inner-wrapper").get(0);
            String strM3784a = c1388hM3222g.m3478o0("div.movie-title-mpic > a >img").m3784a("src");
            String strM778d = strM3784a.contains("http") ? m778d(strM3784a) : str + strM3784a;
            String strM3792i = c1388hM3222g.m3478o0("h1.movie-name").m3792i();
            String str2 = "";
            String strM3484v0 = "";
            C1551g c1551gM3478o0 = c1388hM3222g.m3478o0("div.movie-title-detail a");
            int i = 0;
            while (i < c1551gM3478o0.size()) {
                if (c1551gM3478o0.get(i).mo3511c("href").contains("country")) {
                    strM3484v0 = c1551gM3478o0.get(i).m3484v0();
                }
                String str3 = c1551gM3478o0.get(i).mo3511c("href").contains("movietype") ? str2 + c1551gM3478o0.get(i).m3484v0() + "/" : str2;
                i++;
                str2 = str3;
            }
            String strM777b = m777b(Pattern.compile("导演：(.+)主演"), c1388hM3222g.m3478o0("div.movie-title-detail p").m3792i());
            String strM777b2 = m777b(Pattern.compile("上映：(\\w+)"), c1388hM3222g.m3478o0("div.movie-title-detail p").m3792i());
            String strM777b3 = m777b(Pattern.compile("主演：(.+)剧情"), c1388hM3222g.m3478o0("div.movie-title-detail p").m3792i());
            String strM777b4 = m777b(Pattern.compile("剧情：(.+)\\(详细\\)"), c1388hM3222g.m3478o0("div.movie-title-detail p").m3792i());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C1551g c1551gM3478o1 = c1388hM3222g.m3478o0("#tabwrapper-all > .tlist");
            String strJoin = "";
            String strJoin2 = "";
            for (int i2 = 0; i2 < c1551gM3478o1.size(); i2++) {
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(c1551gM3478o1.m3791h("th").m3788e().m3484v0());
                C1551g c1551gM3478o2 = c1551gM3478o1.get(i2).m3478o0("td a.tlist-bbs-tdtitle");
                for (int i3 = 0; i3 < c1551gM3478o2.size(); i3++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c1551gM3478o2.get(i3).m3484v0());
                    sb2.append("$");
                    sb2.append(c1551gM3478o2.get(i3).mo3511c("href"));
                    arrayList3.add(sb2.toString());
                }
                strJoin2 = arrayList3.size() > 1 ? TextUtils.join("#", arrayList3) : (String) arrayList3.get(0);
                arrayList2.add(strJoin2);
                if (arrayList2.size() > 1) {
                    strJoin2 = TextUtils.join("$$$", arrayList2);
                    strJoin = TextUtils.join("$$$", arrayList);
                } else {
                    strJoin = (String) arrayList.get(0);
                }
            }
            if (strJoin.equals("")) {
                strJoin2 = "暂无预告$www";
                strJoin = "暂无预告";
            }
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strM3792i);
            jSONObject2.put("vod_pic", strM778d);
            jSONObject2.put("type_name", str2);
            jSONObject2.put("vod_year", strM777b2);
            jSONObject2.put("vod_area", strM3484v0);
            jSONObject2.put("vod_remarks", "");
            jSONObject2.put("vod_actor", strM777b3);
            jSONObject2.put("vod_director", strM777b);
            jSONObject2.put("vod_content", strM777b4);
            jSONObject2.put("vod_play_from", strJoin);
            jSONObject2.put("vod_play_url", strJoin2);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type_id", "movlist/");
            jSONObject2.put("type_name", "预告片世界");
            jSONArray.put(jSONObject2);
            jSONObject.put("class", jSONArray);
            if (z) {
                try {
                    jSONObject.put("filters", this.f371a);
                } catch (Exception e) {
                    e = e;
                    SpiderDebug.log(e);
                    return "";
                }
            }
            C1551g c1551gM3478o0 = C1286l.m3222g(C1840c.m4479n(f369b, m779a())).m3478o0("div.inner-2col-main div.movlist > ul li > a");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < c1551gM3478o0.size(); i++) {
                C1393m c1393m = c1551gM3478o0.get(i);
                String strMo3511c = c1393m.mo3511c("href");
                String strMo3511c2 = c1393m.m3479p0("span").mo3511c("title");
                String strMo3511c3 = c1393m.m3479p0("img").mo3511c("src");
                if (!strMo3511c3.contains("http")) {
                    strMo3511c3 = f369b + strMo3511c3;
                }
                String strM3484v0 = c1393m.m3478o0("span").m3790g().m3484v0();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", strMo3511c);
                jSONObject3.put("vod_name", strMo3511c2);
                jSONObject3.put("vod_pic", m778d(strMo3511c3));
                jSONObject3.put("vod_remarks", strM3484v0);
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("list", jSONArray2);
            return jSONObject.toString();
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void init(Context context) {
        super.init(context);
        try {
            this.f371a = new JSONObject("{\"movlist/\":[{\"key\":\"1\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"灾难\",\"v\":\"灾难\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"冒险\",\"v\":\"冒险\"}]},{\"key\":\"0\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"2\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"v\":\"2026\",\"n\":\"2026\"},{\"v\":\"2025\",\"n\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"},{\"n\":\"1999\",\"v\":\"1999\"},{\"n\":\"1998\",\"v\":\"1998\"},{\"n\":\"1980\",\"v\":\"1980\"}]},{\"key\":\"3\",\"name\":\"排序\",\"value\":[{\"n\":\"最近更新\",\"v\":\"\"},{\"n\":\"热门\",\"v\":\"hot\"},{\"n\":\"上映时间\",\"v\":\"pubtime\"}]}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = f369b + str2;
            jSONObject.put("parse", 1);
            jSONObject.put("url", str3);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            C1551g c1551gM3478o0 = C1286l.m3222g(C1840c.m4479n("https://www.6huo.com/?keyword=" + URLEncoder.encode(str) + "&view=search", m779a())).m3478o0("div.inner-2col-main div.movlist > ul li > a");
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c1551gM3478o0.size(); i++) {
                C1393m c1393m = c1551gM3478o0.get(i);
                String strMo3511c = c1393m.mo3511c("href");
                String strMo3511c2 = c1393m.m3479p0("span").mo3511c("title");
                String strMo3511c3 = c1393m.m3479p0("img").mo3511c("src");
                if (!strMo3511c3.contains("http")) {
                    strMo3511c3 = f369b + strMo3511c3;
                }
                String strM3484v0 = c1393m.m3478o0("span").m3790g().m3484v0();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strMo3511c);
                jSONObject2.put("vod_name", strMo3511c2);
                jSONObject2.put("vod_pic", m778d(strMo3511c3));
                jSONObject2.put("vod_remarks", strM3484v0);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
