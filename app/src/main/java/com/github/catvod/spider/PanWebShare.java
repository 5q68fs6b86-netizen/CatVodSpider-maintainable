package com.github.catvod.spider;

import com.github.catvod.spider.support.p044FM.p075c.C1765g;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p056L.C1414F;
import com.github.catvod.spider.support.p044FM.p057M.C1536S;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p089n.C1846b;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PanWebShare extends Pan {

    /* JADX INFO: renamed from: f */
    private String f246f;

    static {
        new OkHttpClient();
    }

    /* JADX INFO: renamed from: d */
    public static String m616d(String str) {
        if (!str.contains("douban")) {
            return str;
        }
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

    /* JADX INFO: renamed from: g */
    private Map<String, String> m617g() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Referer", this.f246f + "/");
        return map;
    }

    /* JADX INFO: renamed from: h */
    private String m618h(C1388h c1388h, String str) {
        for (C1393m c1393m : c1388h.m3478o0(".video-info-item")) {
            if (c1393m.m3476n0().m3484v0().contains(str)) {
                List<String> listM3786c = c1393m.m3478o0("a").m3786c();
                StringBuilder sb = new StringBuilder();
                Iterator it = ((ArrayList) listM3786c).iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) ",");
                    }
                }
                return sb.toString();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: j */
    private String m619j(String str) {
        C1551g c1551gM3478o0 = C1414F.m3544d(C1840c.m4479n(this.f246f + "/index.php/vod/search/wd/" + URLEncoder.encode(str) + ".html", m617g())).m3478o0(".module-search-item");
        ArrayList arrayList = new ArrayList();
        for (C1393m c1393m : c1551gM3478o0) {
            String strM3784a = c1393m.m3478o0(".video-info-header a").m3784a("href");
            String strM3784a2 = c1393m.m3478o0(".video-info-header a").m3784a("title");
            String strM3784a3 = c1393m.m3478o0(".module-item-pic img").m3784a("data-src");
            int iLastIndexOf = strM3784a3.lastIndexOf("http");
            if (iLastIndexOf >= 0) {
                strM3784a3 = m616d(strM3784a3.substring(iLastIndexOf));
            }
            C1551g c1551gM3478o1 = c1393m.m3478o0(".video-info-header a.video-serial");
            C1846b.m4486a(strM3784a, strM3784a2, strM3784a3, !c1551gM3478o1.isEmpty() ? c1551gM3478o1.m3788e().m3484v0() : "", arrayList);
        }
        return Result.string(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6;
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        String str7 = "";
        if (map.get("area") != null) {
            str3 = "/area/" + map.get("area");
        } else {
            str3 = "";
        }
        if (map.get("by") != null) {
            str4 = "/by/" + map.get("by");
        } else {
            str4 = "";
        }
        if (map.get("year") != null) {
            str5 = "/year/" + map.get("year");
        } else {
            str5 = "";
        }
        if (map.get("class") != null) {
            str6 = "/class/" + map.get("class");
        } else {
            str6 = "";
        }
        if (map.get("lang") != null) {
            str7 = "/lang/" + map.get("lang");
        }
        String str8 = this.f246f + "/index.php/vod/show/id/" + str + "/page/" + str2 + str6 + str3 + str7 + str5 + str4 + ".html";
        SpiderDebug.log("categoryContent cateUrl: " + str8);
        List<Vod> vodList = parseVodList(C1286l.m3222g(C1840c.m4479n(str8, m617g())).m3478o0(".module-item"));
        C1765g c1765g = new C1765g();
        c1765g.m4209z(vodList);
        return c1765g.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        String str;
        if (list.get(0).startsWith("http")) {
            str = list.get(0);
        } else {
            str = this.f246f + list.get(0);
        }
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(str, m617g()));
        Vod c1768j = new Vod();
        List<String> listM3785b = c1388hM3222g.m3478o0(".module-row-text").m3785b("data-clipboard-text");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String strM3484v0 = C1536S.m3779a(".video-info-header > .page-title", c1388hM3222g).m3484v0();
        int i = 0;
        while (true) {
            ArrayList arrayList6 = (ArrayList) listM3785b;
            if (i >= arrayList6.size()) {
                break;
            }
            if (Pan.f229a.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList.add((String) arrayList6.get(i));
            }
            if (Pan.f230b.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList2.add((String) arrayList6.get(i));
            }
            if (Pan.f231c.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList3.add((String) arrayList6.get(i));
            }
            if (Pan.f232d.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList4.add((String) arrayList6.get(i));
            }
            if (Pan.f233e.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList5.add((String) arrayList6.get(i));
            }
            if (Pan.f234f.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList5.add((String) arrayList6.get(i));
            }
            if (Pan.f235g.matcher((CharSequence) arrayList6.get(i)).find()) {
                arrayList5.add((String) arrayList6.get(i));
            }
            i++;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList);
        arrayList7.addAll(arrayList2);
        arrayList7.addAll(arrayList3);
        arrayList7.addAll(arrayList4);
        arrayList7.addAll(arrayList5);
        PanOrder.sort(arrayList7);
        c1768j.m4224j(detailContentVodPlayFrom(arrayList7));
        c1768j.m4225k(detailContentVodPlayUrl(arrayList7));
        String strMo3511c = C1536S.m3779a(".module-item-pic img", c1388hM3222g).mo3511c("data-src");
        int iLastIndexOf = strMo3511c.lastIndexOf("http");
        if (iLastIndexOf >= 0) {
            strMo3511c = m616d(strMo3511c.substring(iLastIndexOf));
        }
        String strM3484v1 = c1388hM3222g.m3478o0(".video-info-header a.tag-link").m3790g().m3484v0();
        List<String> listM3786c = c1388hM3222g.m3478o0(".video-info-header div.tag-link a").m3786c();
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) listM3786c).iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ",");
            }
        }
        String string = sb.toString();
        String strM3792i = c1388hM3222g.m3478o0("p.sqjj_a").m3792i();
        String strM618h = m618h(c1388hM3222g, "导演");
        String strM618h2 = m618h(c1388hM3222g, "主演");
        String strM618h3 = m618h(c1388hM3222g, "年代");
        String strM618h4 = m618h(c1388hM3222g, "备注");
        c1768j.m4221g(list.get(0));
        c1768j.m4223i(strMo3511c);
        c1768j.m4228n(strM618h3);
        c1768j.m4222h(strM3484v0);
        c1768j.m4218d(strM3484v1);
        c1768j.m4217c(strM618h2);
        c1768j.m4226l(strM618h4);
        c1768j.m4219e(strM3792i);
        c1768j.m4220f(strM618h);
        c1768j.m4216b(string);
        return C2137a.processVodData(Result.string(c1768j));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(this.f246f, m617g()));
        for (C1393m c1393m : c1388hM3222g.m3478o0("span.module-tab-item.tab-item")) {
            String strMo3511c = c1393m.mo3511c("data-id");
            if (strMo3511c != null && !strMo3511c.equals("0")) {
                if (arrayList.size() >= 7) {
                    break;
                }
                String strMo3511c2 = c1393m.mo3511c("data-name");
                if (strMo3511c2 != null && !strMo3511c2.contains("115")) {
                    arrayList.add(new Class(strMo3511c, strMo3511c2));
                }
            }
        }
        return C1765g.m4193u(arrayList, parseVodList(c1388hM3222g.m3478o0(".module-item")), new JSONObject("{\"1\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"1\"},{\"n\":\"科幻片\",\"v\":\"6\"},{\"n\":\"爱情片\",\"v\":\"7\"},{\"n\":\"战争片\",\"v\":\"8\"},{\"n\":\"恐怖片\",\"v\":\"9\"},{\"n\":\"高码片\",\"v\":\"10\"},{\"n\":\"动画片\",\"v\":\"11\"},{\"n\":\"动作片\",\"v\":\"12\"}]},{\"key\":\"class\",\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"2\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"2\"},{\"n\":\"国产剧\",\"v\":\"13\"},{\"n\":\"日韩剧\",\"v\":\"14\"},{\"n\":\"欧美剧\",\"v\":\"15\"},{\"n\":\"港台剧\",\"v\":\"16\"}]},{\"key\":\"class\",\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"3\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"3\"},{\"n\":\"日韩\",\"v\":\"22\"},{\"n\":\"国产\",\"v\":\"20\"},{\"n\":\"欧美\",\"v\":\"21\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"4\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"5\":[{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"26\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"26\"},{\"n\":\"高分电影\",\"v\":\"29\"},{\"n\":\"高分剧集\",\"v\":\"27\"},{\"n\":\"高分外剧\",\"v\":\"30\"},{\"n\":\"国漫之光\",\"v\":\"28\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}]}"));
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        JSONArray jSONArray;
        int length;
        if (str.isEmpty() || (length = (jSONArray = new JSONObject(str).getJSONArray("site")).length()) == 0) {
            return;
        }
        for (int i = 0; i < length; i++) {
            String strTrim = jSONArray.getString(i).trim();
            if (!strTrim.isEmpty()) {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strTrim).openConnection();
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setRequestMethod("HEAD");
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 400) {
                        this.f246f = strTrim;
                        httpURLConnection.disconnect();
                        return;
                    }
                    httpURLConnection.disconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public List<Vod> parseVodList(C1551g c1551g) {
        ArrayList arrayList = new ArrayList();
        for (C1393m c1393m : c1551g) {
            String strM3784a = c1393m.m3478o0(".module-item-titlebox >a").m3784a("href");
            String strM3784a2 = c1393m.m3478o0(".module-item-titlebox >a").m3784a("title");
            if (!"臻彩".equals(strM3784a2)) {
                String strM3784a3 = c1393m.m3478o0(".module-item-pic img").m3784a("data-src");
                int iLastIndexOf = strM3784a3.lastIndexOf("http");
                if (iLastIndexOf >= 0) {
                    strM3784a3 = m616d(strM3784a3.substring(iLastIndexOf));
                }
                C1846b.m4486a(strM3784a, strM3784a2, strM3784a3, c1393m.m3478o0(".module-item-text").m3792i(), arrayList);
            }
        }
        return arrayList;
    }

    public String searchContent(String str, boolean z) {
        return m619j(str);
    }

    public String searchContent(String str, boolean z, String str2) {
        return m619j(str);
    }
}
