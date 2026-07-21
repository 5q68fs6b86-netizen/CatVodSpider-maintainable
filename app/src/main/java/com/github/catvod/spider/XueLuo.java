package com.github.catvod.spider;

import com.github.catvod.spider.support.p044FM.p075c.C1765g;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p073b.C1751v;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p089n.C1846b;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class XueLuo extends Spider {

    /* JADX INFO: renamed from: a */
    private static String f361a = "https://v.xl01.eu.cc";

    /* JADX INFO: renamed from: a */
    private Map<String, String> m769a() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Accept-Language", "zh-CN,zh;q=0.9");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(f361a + String.format("/s/%s/%s?type=%s&area=%s&year=%s&order=%s", map.get("class") == null ? "all" : map.get("class"), str2, str, map.get("area") == null ? "中国大陆" : map.get("area"), map.get("year") == null ? "" : map.get("year"), map.get("by") == null ? "" : map.get("by")), m769a()));
        ArrayList arrayList = new ArrayList();
        for (C1393m c1393m : c1388hM3222g.m3478o0(".movie-card")) {
            C1846b.m4486a(f361a + c1393m.m3478o0(".card-img").m3784a("href"), c1393m.m3478o0("h4").m3792i(), c1393m.m3478o0(".card-img img").m3784a("data-src"), c1393m.m3478o0(".rating-badge").m3792i(), arrayList);
        }
        return Result.string(arrayList);
    }

    public String detailContent(List<String> list) {
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(list.get(0), m769a()));
        String strMo3511c = c1388hM3222g.m3479p0(".movie-poster img").mo3511c("src");
        String strM3484v0 = c1388hM3222g.m3479p0(".movie-title").m3484v0();
        String strReplaceAll = c1388hM3222g.m3478o0(".desc").m3792i().replaceAll("\\s+", "");
        C1551g c1551gM3478o0 = c1388hM3222g.m3478o0(".info-item");
        String strM3484v1 = "";
        String strJoin = "";
        String strJoin2 = "";
        String strM3484v2 = "";
        String strM3484v3 = "";
        for (int i = 0; i < c1551gM3478o0.size(); i++) {
            C1393m c1393m = c1551gM3478o0.get(i);
            String strM3484v4 = c1393m.m3479p0(".info-label").m3484v0();
            if (strM3484v4.contains("导演：")) {
                strM3484v1 = c1393m.m3479p0(".info-value").m3484v0();
            } else if (strM3484v4.contains("主演：")) {
                ArrayList arrayList = new ArrayList();
                C1551g c1551gM3478o1 = c1393m.m3478o0(".info-value");
                for (int i2 = 0; i2 < c1551gM3478o1.size(); i2++) {
                    arrayList.add(c1551gM3478o1.get(i2).m3484v0());
                }
                strJoin = TextUtils.join(",", arrayList);
            } else if (strM3484v4.contains("类型：")) {
                ArrayList arrayList2 = new ArrayList();
                C1551g c1551gM3478o2 = c1393m.m3478o0(".info-value");
                for (int i3 = 0; i3 < c1551gM3478o2.size(); i3++) {
                    arrayList2.add(c1551gM3478o2.get(i3).m3484v0());
                }
                strJoin2 = TextUtils.join("/", arrayList2);
            } else if (strM3484v4.contains("制片国家：")) {
                strM3484v2 = c1393m.m3479p0(".info-value").m3484v0();
            } else if (strM3484v4.contains("别名：")) {
                strM3484v3 = c1393m.m3479p0(".info-value").m3484v0();
            }
        }
        Matcher matcher = Pattern.compile("\\((\\d{4})\\)").matcher(strM3484v0);
        String strGroup = matcher.find() ? matcher.group(1) : "";
        C1551g c1551gM3478o3 = c1388hM3222g.m3478o0(".play-list .play-item");
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < c1551gM3478o3.size(); i4++) {
            C1393m c1393m2 = c1551gM3478o3.get(i4);
            arrayList3.add(c1393m2.m3484v0() + "$" + c1393m2.mo3511c("href"));
        }
        String strJoin3 = arrayList3.size() > 0 ? TextUtils.join("#", arrayList3) : "";
        Vod c1768j = new Vod(list.get(0), strM3484v0, strMo3511c);
        c1768j.m4216b(strJoin2);
        c1768j.m4228n(strGroup);
        c1768j.m4218d(strM3484v2);
        c1768j.m4217c(strJoin);
        c1768j.m4220f(strM3484v1);
        c1768j.m4219e(strReplaceAll);
        c1768j.m4226l(strM3484v3);
        c1768j.m4224j("在线播放");
        c1768j.m4225k(strJoin3);
        return Result.string(c1768j);
    }

    public String homeContent(boolean z) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("0", "1");
        List listAsList2 = Arrays.asList("电影", "电视剧");
        while (true) {
            int i2 = i;
            if (i2 >= listAsList.size()) {
                return C1765g.m4193u(arrayList, new ArrayList(), new JSONObject("{\"0\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"all\"},{\"n\":\"动作\",\"v\":\"dongzuo\"},{\"n\":\"爱情\",\"v\":\"aiqing\"},{\"n\":\"喜剧\",\"v\":\"xiju\"},{\"n\":\"科幻\",\"v\":\"kehuan\"},{\"n\":\"恐怖\",\"v\":\"kongbu\"},{\"n\":\"战争\",\"v\":\"zhanzheng\"},{\"n\":\"武侠\",\"v\":\"wuxia\"},{\"n\":\"魔幻\",\"v\":\"mohuan\"},{\"n\":\"剧情\",\"v\":\"juqing\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"惊悚\",\"v\":\"jingsong\"},{\"n\":\"3D\",\"v\":\"3D\"},{\"n\":\"灾难\",\"v\":\"zainan\"},{\"n\":\"悬疑\",\"v\":\"xuanyi\"},{\"n\":\"警匪\",\"v\":\"jingfei\"},{\"n\":\"文艺\",\"v\":\"wenyi\"},{\"n\":\"青春\",\"v\":\"qingchun\"},{\"n\":\"冒险\",\"v\":\"maoxian\"},{\"n\":\"犯罪\",\"v\":\"fanzui\"},{\"n\":\"纪录\",\"v\":\"jilu\"},{\"n\":\"古装\",\"v\":\"guzhuang\"},{\"n\":\"奇幻\",\"v\":\"qihuan\"},{\"n\":\"国语\",\"v\":\"guoyu\"},{\"n\":\"综艺\",\"v\":\"zongyi\"},{\"n\":\"历史\",\"v\":\"lishi\"},{\"n\":\"运动\",\"v\":\"yundong\"},{\"n\":\"原创压制\",\"v\":\"yuanchuang\"},{\"n\":\"美剧\",\"v\":\"meiju\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"国产电视剧\",\"v\":\"guoju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"英剧\",\"v\":\"yingju\"},{\"n\":\"德剧\",\"v\":\"deju\"},{\"n\":\"俄剧\",\"v\":\"eju\"},{\"n\":\"巴剧\",\"v\":\"baju\"},{\"n\":\"加剧\",\"v\":\"jiaju\"},{\"n\":\"西剧\",\"v\":\"anish\"},{\"n\":\"意大利剧\",\"v\":\"yidaliju\"},{\"n\":\"泰剧\",\"v\":\"taiju\"},{\"n\":\"港台剧\",\"v\":\"gangtaiju\"},{\"n\":\"法剧\",\"v\":\"faju\"},{\"n\":\"澳剧\",\"v\":\"aoju\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"比利时\",\"v\":\"比利时\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"荷兰\",\"v\":\"荷兰\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"豆瓣评分\",\"v\":\"1\"}]}],\"1\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"all\"},{\"n\":\"动作\",\"v\":\"dongzuo\"},{\"n\":\"爱情\",\"v\":\"aiqing\"},{\"n\":\"喜剧\",\"v\":\"xiju\"},{\"n\":\"科幻\",\"v\":\"kehuan\"},{\"n\":\"恐怖\",\"v\":\"kongbu\"},{\"n\":\"战争\",\"v\":\"zhanzheng\"},{\"n\":\"武侠\",\"v\":\"wuxia\"},{\"n\":\"魔幻\",\"v\":\"mohuan\"},{\"n\":\"剧情\",\"v\":\"juqing\"},{\"n\":\"动画\",\"v\":\"donghua\"},{\"n\":\"惊悚\",\"v\":\"jingsong\"},{\"n\":\"3D\",\"v\":\"3D\"},{\"n\":\"灾难\",\"v\":\"zainan\"},{\"n\":\"悬疑\",\"v\":\"xuanyi\"},{\"n\":\"警匪\",\"v\":\"jingfei\"},{\"n\":\"文艺\",\"v\":\"wenyi\"},{\"n\":\"青春\",\"v\":\"qingchun\"},{\"n\":\"冒险\",\"v\":\"maoxian\"},{\"n\":\"犯罪\",\"v\":\"fanzui\"},{\"n\":\"纪录\",\"v\":\"jilu\"},{\"n\":\"古装\",\"v\":\"guzhuang\"},{\"n\":\"奇幻\",\"v\":\"qihuan\"},{\"n\":\"国语\",\"v\":\"guoyu\"},{\"n\":\"综艺\",\"v\":\"zongyi\"},{\"n\":\"历史\",\"v\":\"lishi\"},{\"n\":\"运动\",\"v\":\"yundong\"},{\"n\":\"原创压制\",\"v\":\"yuanchuang\"},{\"n\":\"美剧\",\"v\":\"meiju\"},{\"n\":\"韩剧\",\"v\":\"hanju\"},{\"n\":\"国产电视剧\",\"v\":\"guoju\"},{\"n\":\"日剧\",\"v\":\"riju\"},{\"n\":\"英剧\",\"v\":\"yingju\"},{\"n\":\"德剧\",\"v\":\"deju\"},{\"n\":\"俄剧\",\"v\":\"eju\"},{\"n\":\"巴剧\",\"v\":\"baju\"},{\"n\":\"加剧\",\"v\":\"jiaju\"},{\"n\":\"西剧\",\"v\":\"anish\"},{\"n\":\"意大利剧\",\"v\":\"yidaliju\"},{\"n\":\"泰剧\",\"v\":\"taiju\"},{\"n\":\"港台剧\",\"v\":\"gangtaiju\"},{\"n\":\"法剧\",\"v\":\"faju\"},{\"n\":\"澳剧\",\"v\":\"aoju\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"比利时\",\"v\":\"比利时\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"荷兰\",\"v\":\"荷兰\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"更新时间\",\"v\":\"0\"},{\"n\":\"豆瓣评分\",\"v\":\"1\"}]}]}"));
            }
            arrayList.add(new Class((String) listAsList.get(i2), (String) listAsList2.get(i2)));
            i = i2 + 1;
        }
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        f361a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strSubstring;
        String upperCase;
        C1551g c1551gM3478o0 = C1286l.m3222g(C1840c.m4479n(C1751v.m4142b(new StringBuilder(), f361a, str2), m769a())).m3478o0("script");
        new JSONObject();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c1551gM3478o0.size()) {
                strSubstring = "";
                break;
            }
            String strMo3431t = c1551gM3478o0.get(i2).mo3431t();
            if (strMo3431t.contains("var pid =")) {
                String strSubstring2 = strMo3431t.substring(strMo3431t.indexOf("var pid ="), strMo3431t.lastIndexOf("var time") + 1);
                strSubstring = strSubstring2.substring(strSubstring2.indexOf("=") + 2, strSubstring2.lastIndexOf(";"));
                break;
            }
            i = i2 + 1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbM3589b = C1434P.m3589b(strSubstring);
        sbM3589b.append("-");
        sbM3589b.append(jCurrentTimeMillis);
        String strSubstring3 = C1885z.m4560a(sbM3589b.toString()).substring(0, 16);
        StringBuilder sbM3589b2 = C1434P.m3589b(strSubstring);
        sbM3589b2.append("-");
        sbM3589b2.append(jCurrentTimeMillis);
        String string = sbM3589b2.toString();
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(1, new SecretKeySpec(strSubstring3.getBytes(), "AES"));
            byte[] bArrDoFinal = cipher.doFinal(string.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDoFinal) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = '0' + hexString;
                }
                sb.append(hexString);
            }
            upperCase = sb.toString().toUpperCase();
        } catch (Exception e) {
            SpiderDebug.log(e);
            upperCase = null;
        }
        String strTrim = new JSONObject(C1840c.m4479n(f361a + "/lines?t=" + jCurrentTimeMillis + "&sg=" + upperCase + "&pid=" + strSubstring, m769a())).getJSONObject("data").getString("url3").split(",")[0].trim();
        C1765g c1765g = new C1765g();
        c1765g.m4207x(strTrim);
        c1765g.m4198f(m769a());
        return C2137a.addDanmaku(c1765g.toString());
    }

    public String searchContent(String str, boolean z) {
        return null;
    }
}
