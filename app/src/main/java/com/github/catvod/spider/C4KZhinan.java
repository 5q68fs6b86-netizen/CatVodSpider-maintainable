package com.github.catvod.spider;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p101G.C2034f;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p102H.C2051g;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.4KZhinan, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C4KZhinan extends Pan {

    /* JADX INFO: renamed from: a */
    public final String f36a = "https://4kzn.cc";

    public static List<String> extractQuarkLinks(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            Matcher matcher = Pattern.compile("href\\s*=\\s*\"(https://pan\\.quark\\.cn\\/s\\/[a-fA-F0-9]+)\"").matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final String m384b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36a);
        sb.append("/page/" + str2 + "?post_type=book&s=" + URLEncoder.encode(str));
        String string = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        C2060c c2060cM4896n0 = C2051g.m5074d(OkHttp.string(string, map)).m4896n0(".posts-item.book-item.d-flex.style-book-v");
        ArrayList arrayList = new ArrayList();
        for (C2037i c2037i : c2060cM4896n0) {
            C2177k.m5715b(c2037i.m4896n0("div.item-header > div > a").m5179a("href"), c2037i.m4896n0("div.item-body.flex-fill > h3 > a").m5181c(), c2037i.m4896n0("div.item-header > div > a > img").m5179a("data-src"), c2037i.m4896n0("div.item-body.flex-fill > div").m5181c(), arrayList);
        }
        return Result.string(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36a);
        sb.append(str + "/page/" + str2);
        String string = sb.toString();
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        C2034f c2034fM5074d = C2051g.m5074d(OkHttp.string(string, map2));
        int i = Integer.parseInt(str2);
        int iCeil = (int) Math.ceil(((double) Integer.MAX_VALUE) / ((double) 50));
        C2192c c2192c = new C2192c();
        ArrayList arrayList = new ArrayList();
        for (C2037i c2037i : c2034fM5074d.m4896n0(".posts-item.book-item.d-flex.style-book-v")) {
            C2177k.m5715b(c2037i.m4896n0("div.item-header > div > a").m5179a("href"), c2037i.m4896n0("div.item-body.flex-fill > h3 > a").m5181c(), c2037i.m4896n0("div.item-header > div > a > img").m5179a("data-src"), c2037i.m4896n0("div.item-body.flex-fill > div").m5181c(), arrayList);
        }
        c2192c.m5833z(arrayList);
        c2192c.m5819i(i, iCeil, 50, Integer.MAX_VALUE);
        return c2192c.toString();
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        int i;
        String str = list.get(0);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        C2034f c2034fM5074d = C2051g.m5074d(OkHttp.string(str, map));
        Vod c2194eM812b = C0082a.m812b(str);
        c2194eM812b.m5849k(c2034fM5074d.m4896n0("div.d-flex.flex-wrap.mb-4 > div.site-name-box.flex-fill.mb-3 > h1").m5181c());
        c2194eM812b.m5850l(c2034fM5074d.m4896n0("div.book-cover.text-center.mr-0.mr-md-3.mt-4.mt-md-0 > img").m5179a("data-src"));
        String strM5181c = c2034fM5074d.m4896n0("div.panel.site-content.card > div > div > p").m5181c();
        int iIndexOf = strM5181c.indexOf("导演:");
        if (iIndexOf != -1) {
            int i2 = iIndexOf + 6;
            int iIndexOf2 = strM5181c.indexOf("编剧:");
            if (iIndexOf2 != -1) {
                c2194eM812b.m5847i(strM5181c.substring(i2, iIndexOf2).trim());
            }
        }
        int iIndexOf3 = strM5181c.indexOf("主演:");
        if (iIndexOf3 != -1) {
            int i3 = iIndexOf3 + 6;
            int iIndexOf4 = strM5181c.indexOf("类型:");
            if (iIndexOf4 != -1) {
                c2194eM812b.m5843f(strM5181c.substring(i3, iIndexOf4).trim().replace(" / ", ","));
            }
        }
        int iIndexOf5 = strM5181c.indexOf("制片国家/地区:");
        if (iIndexOf5 != -1) {
            int i4 = iIndexOf5 + 9;
            int iIndexOf6 = strM5181c.indexOf("语言:");
            if (iIndexOf6 != -1) {
                c2194eM812b.m5845g(strM5181c.substring(i4, iIndexOf6).trim());
            }
        }
        int iIndexOf7 = strM5181c.indexOf("IMDb: ");
        c2194eM812b.m5846h((iIndexOf7 == -1 || (i = iIndexOf7 + 16) >= strM5181c.length()) ? strM5181c : strM5181c.substring(i).trim());
        List<String> listExtractQuarkLinks = extractQuarkLinks(c2034fM5074d.m4896n0("div.book-info.flex-fill > div.site-body.text-sm > div.mt-n2 > div.site-go.mt-3").toString());
        c2194eM812b.m5851m(detailContentVodPlayFrom(listExtractQuarkLinks));
        c2194eM812b.m5852n(detailContentVodPlayUrl(listExtractQuarkLinks));
        return C2137a.processVodData(Result.string(c2194eM812b));
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("/books/zuixin", "/books/top250", "/books/juji", "/books/dianying");
        List listAsList2 = Arrays.asList("最新", "top250", "剧集", "电影");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new Class((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return C0082a.m802a("{}", arrayList);
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, boolean z) {
        return m384b(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return m384b(str, str2);
    }
}
