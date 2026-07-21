package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p041D.C1266a;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p117b.C2185u;
import com.github.catvod.spider.support.p117b.C2188x;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.support.p128m.C2256I;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Web1905 extends Spider {

    /* JADX INFO: renamed from: a */
    private static final Pattern f282a = Pattern.compile("play/(.*?).sh");

    /* JADX INFO: renamed from: a */
    private String m658a(String str) {
        HashMap mapM5658c = C2174h.m5658c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Referer", "https://www.1905.com");
        mapM5658c.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        return OkHttp.string(str, mapM5658c);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (C2037i c2037i : C1266a.m3149a(m658a("https://www.1905.com/vod/list/" + str + "/o3p" + str2 + ".html")).m4896n0("n_2".equals(str) ? "div.mod > div > a" : "section.search-list > div > a")) {
            String strMo4929d = c2037i.mo4929d("href");
            Matcher matcher = f282a.matcher(strMo4929d);
            if (matcher.find()) {
                strMo4929d = matcher.group(1);
            }
            C2177k.m5715b(strMo4929d, c2037i.mo4929d("title"), c2037i.m4896n0("img").m5179a("src"), c2037i.m4896n0("p").m5181c(), arrayList);
        }
        return C2174h.m5655a(str2, Result.get()(), 0, 0, 0, arrayList);
    }

    public String detailContent(List<String> list) {
        String str = list.get(0);
        JSONObject jSONObject = new JSONObject(m658a(C2185u.m5754a("https://www.1905.com/api/content/?m=Vod&a=getVodSidebar&id=", str, "&fomat=json")));
        Vod c2194e = new Vod();
        c2194e.m5848j(str);
        String strOptString = jSONObject.optString("title");
        c2194e.m5849k(strOptString);
        c2194e.m5850l(jSONObject.optString("thumb"));
        c2194e.m5853o(jSONObject.optString("commendreason"));
        c2194e.m5846h(jSONObject.optString("description"));
        c2194e.m5847i(jSONObject.optString("direct"));
        c2194e.m5843f(jSONObject.optString("starring"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(strOptString + "$" + str);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("info").optJSONArray("series_data");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            arrayList.add(jSONObjectOptJSONObject.optString("title") + "$" + jSONObjectOptJSONObject.optString("contentid"));
        }
        c2194e.m5851m("1905");
        c2194e.m5852n(TextUtils.join("#", arrayList));
        String strM5795m = Result.string(c2194e);
        C2137a.parseJsonAndSave(strM5795m);
        return strM5795m;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("n_1", "n_1_c_922", "n_2", "c_927", "n_1_c_586", "n_1_c_178", "n_1_c_1024", "n_1_c_1053");
        List listAsList2 = Arrays.asList("电影", "微电影", "系列电影", "记录片", "晚会", "独家", "综艺", "体育");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new Class((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return Result.string(arrayList, new ArrayList());
    }

    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strOptString;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long j = 600 + jCurrentTimeMillis;
        String string = UUID.randomUUID().toString();
        String str3 = "";
        String strSubstring = string.replace("-", "").substring(5, 20);
        String strM6116k = C2256I.m6116k(String.format("cid=%s&expiretime=%d&nonce=%d&page=%s&playerid=%s&type=hls&uuid=%s.dde3d61a0411511d", str2, Long.valueOf(j), Long.valueOf(jCurrentTimeMillis), C2185u.m5754a("https://www.1905.com/vod/play/", str2, ".shtml").replace(":", "%3A").replace("/", "%2F"), strSubstring, string));
        StringBuilder sb = new StringBuilder();
        sb.append("https://profile.m1905.com/mvod/getVideoinfo.php?nonce=");
        sb.append(jCurrentTimeMillis);
        sb.append("&expiretime=");
        sb.append(j);
        sb.append("&cid=");
        sb.append(str2);
        C2188x.m5787a(sb, "&uuid=", string, "&playerid=", strSubstring);
        C2188x.m5787a(sb, "&page=https%3A%2F%2Fwww.1905.com%2Fvod%2Fplay%2F", str2, ".shtml&type=hls&signature=", strM6116k);
        sb.append("&callback=");
        JSONObject jSONObjectOptJSONObject = new JSONObject(m658a(sb.toString()).replace("(", "").replace(")", "")).optJSONObject("data");
        Iterator<String> itKeys = jSONObjectOptJSONObject.optJSONObject("sign").keys();
        ArrayList arrayList = new ArrayList();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        if (arrayList.contains("uhd")) {
            strOptString = jSONObjectOptJSONObject.optJSONObject("sign").optJSONObject("uhd").optString("sign");
            str3 = "uhd";
        } else if (arrayList.contains("hd")) {
            strOptString = jSONObjectOptJSONObject.optJSONObject("sign").optJSONObject("hd").optString("sign");
            str3 = "hd";
        } else if (arrayList.contains("sd")) {
            strOptString = jSONObjectOptJSONObject.optJSONObject("sign").optJSONObject("sd").optString("sign");
            str3 = "sd";
        } else {
            strOptString = "";
        }
        String strM5754a = C2185u.m5754a(jSONObjectOptJSONObject.optJSONObject("quality").optJSONObject(str3).optString("host"), strOptString, jSONObjectOptJSONObject.optJSONObject("path").optJSONObject(str3).optString("path"));
        C2192c c2192c = Result.get()();
        c2192c.m5821k(0);
        c2192c.m5827u(strM5754a);
        return c2192c.toString();
    }

    public String searchContent(String str, boolean z) {
        StringBuilder sbM5396a = C2137a.m5396a("https://www.1905.com/search/index-p-type-all-q-");
        sbM5396a.append(URLEncoder.encode(str));
        sbM5396a.append(".html");
        ArrayList arrayList = new ArrayList();
        for (C2037i c2037i : C1266a.m3149a(m658a(sbM5396a.toString())).m4896n0("div.movie_box > div > div")) {
            String strM5179a = c2037i.m4896n0("div > ul > li.paly-tab-icon > a").m5179a("href");
            if (!TextUtils.isEmpty(strM5179a)) {
                Matcher matcher = f282a.matcher(strM5179a);
                if (matcher.find()) {
                    strM5179a = matcher.group(1);
                }
                C2177k.m5715b(strM5179a, c2037i.m4896n0("div > div.movie-pic > a > img").m5179a("alt"), c2037i.m4896n0("div > div.movie-pic > a > img").m5179a("src"), "", arrayList);
            }
        }
        return Result.string(arrayList);
    }
}
