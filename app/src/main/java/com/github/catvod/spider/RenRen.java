package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p101G.C2034f;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p102H.C2051g;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class RenRen extends Pan {
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int iIndexOf;
        int iIndexOf2;
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        String strM6073l = OkHttp.string("https://www.rrdynb.com/" + str + str2 + ".html", map2);
        if (TextUtils.isEmpty(strM6073l)) {
            return Result.string(new ArrayList());
        }
        C2034f c2034fM5074d = C2051g.m5074d(strM6073l);
        ArrayList arrayList = new ArrayList();
        for (C2037i c2037i : c2034fM5074d.m4896n0("#movielist li.pure-g.shadow")) {
            String strM5179a = c2037i.m4896n0("a").m5179a("href");
            C2060c c2060cM4896n0 = c2037i.m4896n0("img");
            String strM5179a2 = c2060cM4896n0.m5179a("data-original");
            if (TextUtils.isEmpty(strM5179a2)) {
                strM5179a2 = c2060cM4896n0.m5179a("src");
            }
            String strM5179a3 = c2037i.m4896n0("h2 > a").m5179a("title");
            String strSubstring = (TextUtils.isEmpty(strM5179a3) || (iIndexOf = strM5179a3.indexOf("《")) == -1 || (iIndexOf2 = strM5179a3.indexOf("》", iIndexOf)) == -1) ? "" : strM5179a3.substring(iIndexOf + 1, iIndexOf2);
            if (!TextUtils.isEmpty(strSubstring)) {
                C2177k.m5715b(strM5179a, strSubstring, strM5179a2, "", arrayList);
            }
        }
        return Result.string(arrayList);
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List list) throws JSONException {
        String str = (String) list.get(0);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        String strM6073l = OkHttp.string("https://www.rrdynb.com" + str, map);
        if (TextUtils.isEmpty(strM6073l)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg", "获取详情页失败");
            return jSONObject.toString();
        }
        Vod c2194eM812b = C0082a.m812b(str);
        C2034f c2034fM5074d = C2051g.m5074d(strM6073l);
        Matcher matcher = Pattern.compile("《(.*?)》").matcher(c2034fM5074d.m4896n0("div.movie-des.shadow > h1").m5181c());
        c2194eM812b.m5849k(matcher.find() ? matcher.group(1) : "");
        c2194eM812b.m5850l(c2034fM5074d.m4896n0("div.movie-txt img").m5179a("src"));
        C2060c c2060cM4896n0 = c2034fM5074d.m4896n0("div.movie-txt");
        String string = c2060cM4896n0.toString();
        String strM5181c = c2060cM4896n0.m5181c();
        int iIndexOf = strM5181c.indexOf("导演:");
        if (iIndexOf != -1) {
            int i = iIndexOf + 6;
            int iIndexOf2 = strM5181c.indexOf("编剧:");
            if (iIndexOf2 != -1) {
                c2194eM812b.m5847i(strM5181c.substring(i, iIndexOf2).trim());
            }
        }
        int iIndexOf3 = strM5181c.indexOf("主演:");
        if (iIndexOf3 != -1) {
            int i2 = iIndexOf3 + 6;
            int iIndexOf4 = strM5181c.indexOf("类型:");
            if (iIndexOf4 != -1) {
                c2194eM812b.m5843f(strM5181c.substring(i2, iIndexOf4).trim().replace(" / ", ","));
            }
        }
        int iIndexOf5 = strM5181c.indexOf("制片国家/地区:");
        if (iIndexOf5 != -1) {
            int i3 = iIndexOf5 + 9;
            int iIndexOf6 = strM5181c.indexOf("语言:");
            if (iIndexOf6 != -1) {
                c2194eM812b.m5845g(strM5181c.substring(i3, iIndexOf6).trim().replace(" / ", ","));
            }
        }
        int iIndexOf7 = strM5181c.indexOf("剧情简介：");
        if (iIndexOf7 != -1) {
            int i4 = iIndexOf7 + 10;
            int iIndexOf8 = strM5181c.indexOf("资源：");
            if (iIndexOf8 != -1) {
                c2194eM812b.m5846h(strM5181c.substring(i4, iIndexOf8).replaceAll("<[^>]+>", "").replace("&nbsp;", " ").trim());
            }
        }
        ArrayList arrayList = new ArrayList();
        int iIndexOf9 = string.indexOf("href=\"");
        while (iIndexOf9 != -1) {
            iIndexOf9 += 6;
            int iIndexOf10 = string.indexOf("\"", iIndexOf9);
            if (iIndexOf10 != -1) {
                String strSubstring = string.substring(iIndexOf9, iIndexOf10);
                if (strSubstring.contains("pan.baidu.com") || strSubstring.contains("pan.quark.cn") || strSubstring.contains("pan.xunlei.com") || strSubstring.contains("www.aliyundrive.com") || strSubstring.contains("cloud.189.cn")) {
                    int iIndexOf11 = strSubstring.indexOf("#");
                    if (iIndexOf11 != -1) {
                        strSubstring = strSubstring.substring(0, iIndexOf11);
                    }
                    arrayList.add(strSubstring.replace("&amp;", "&").replace("?entry=nmmecc", ""));
                }
                iIndexOf9 = string.indexOf("href=\"", iIndexOf10 + 1);
            }
        }
        ArrayList arrayList2 = new ArrayList(new HashSet(arrayList));
        PanOrder.sort(arrayList2);
        if (arrayList2.size() > 0) {
            c2194eM812b.m5851m(detailContentVodPlayFrom(arrayList2));
            c2194eM812b.m5852n(detailContentVodPlayUrl(arrayList2));
        }
        return C2137a.processVodData(Result.string(c2194eM812b));
    }

    public String homeContent(boolean z) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        List listAsList = Arrays.asList("movie/list_2_", "dianshiju/list_6_", "zongyi/list_10_", "dongman/list_13_");
        List listAsList2 = Arrays.asList("电影", "电视剧", "老电影", "动漫");
        for (int i = 0; i < listAsList.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", listAsList.get(i));
            jSONObject.put("type_name", listAsList2.get(i));
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("class", jSONArray);
        jSONObject3.put("filters", jSONObject2);
        return jSONObject3.toString();
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
        int iIndexOf;
        int iIndexOf2;
        if (TextUtils.isEmpty(str)) {
            return Result.string(new ArrayList());
        }
        String str2 = "https://www.rrdynb.com/plus/search.php?q=" + URLEncoder.encode(str);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        String strM6073l = OkHttp.string(str2, map);
        if (TextUtils.isEmpty(strM6073l)) {
            return Result.string(new ArrayList());
        }
        C2034f c2034fM5074d = C2051g.m5074d(strM6073l);
        ArrayList arrayList = new ArrayList();
        for (C2037i c2037i : c2034fM5074d.m4896n0("#movielist li.pure-g.shadow")) {
            String strM5179a = c2037i.m4896n0("a").m5179a("href");
            C2060c c2060cM4896n0 = c2037i.m4896n0("img");
            String strM5179a2 = c2060cM4896n0.m5179a("data-original");
            if (TextUtils.isEmpty(strM5179a2)) {
                strM5179a2 = c2060cM4896n0.m5179a("src");
            }
            String strM5179a3 = c2037i.m4896n0("h2 > a").m5179a("title");
            String strSubstring = (TextUtils.isEmpty(strM5179a3) || (iIndexOf = strM5179a3.indexOf("《")) == -1 || (iIndexOf2 = strM5179a3.indexOf("》", iIndexOf)) == -1) ? "" : strM5179a3.substring(iIndexOf + 1, iIndexOf2);
            if (!TextUtils.isEmpty(strSubstring)) {
                C2177k.m5715b(strM5179a, strSubstring, strM5179a2, "", arrayList);
            }
        }
        return Result.string(arrayList);
    }
}
