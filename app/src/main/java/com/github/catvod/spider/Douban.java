package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Path;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Douban extends Spider {

    /* JADX INFO: renamed from: a */
    private final String f167a = "?apikey=0ac44ae016490db2204ce0a042db2916";

    /* JADX INFO: renamed from: b */
    private String f168b;

    /* JADX INFO: renamed from: a */
    private Map<String, String> m504a() {
        HashMap map = new HashMap();
        map.put("Host", "frodo.douban.com");
        map.put("Connection", "Keep-Alive");
        map.put("Referer", "https://servicewechat.com/wx2f9b06c1de1ccfca/84/page-frame.html");
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat");
        return map;
    }

    /* JADX INFO: renamed from: b */
    private String m505b(HashMap<String, String> map) {
        try {
            StringBuilder sb = new StringBuilder();
            for (String str : map.keySet()) {
                if (!str.equals("sort")) {
                    sb.append(map.get(str));
                    sb.append(",");
                }
            }
            return C1885z.m4578q(sb.toString());
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private List<Vod> m506c(JSONArray jSONArray) throws JSONException {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String str3 = "msearch:" + jSONObject.optString("id");
            String strOptString = jSONObject.optString("title");
            try {
                str = jSONObject.getJSONObject("pic").optString("normal") + "@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36";
            } catch (Exception unused) {
                str = "";
            }
            try {
                str2 = "评分：" + jSONObject.getJSONObject("rating").optString("value");
            } catch (Exception unused2) {
                str2 = "";
            }
            arrayList.add(new Vod(str3, strOptString, str, str2));
        }
        return arrayList;
    }

    public static String filterItemsWithoutPic(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("list");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (!TextUtils.isEmpty(jSONObject2.optString("vod_pic", ""))) {
                    jSONArray2.put(jSONObject2);
                }
            }
            jSONObject.put("list", jSONArray2);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private String processAnimeContent(String str, HashMap<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StringBuilder sb = new StringBuilder();
        sb.append("https://frodo.douban.com/rexxar/api/v2/tv/recommend?apikey=0ac44ae016490db2204ce0a042db2916&sort=T&tags=动画&start=0&count=20");
        if (!TextUtils.isEmpty(str)) {
            int i = Integer.parseInt(str);
            String strReplace = sb.toString().replace("start=0", "start=" + (i > 1 ? (i - 1) * 20 : 0));
            sb = new StringBuilder();
            sb.append(strReplace);
        }
        if (map != null) {
            String str2 = map.get("sort");
            if (str2 != null && !str2.isEmpty()) {
                String strReplace2 = sb.toString().replace("sort=T", "sort=" + str2);
                sb = new StringBuilder();
                sb.append(strReplace2);
            }
            StringBuilder sb2 = new StringBuilder();
            String str3 = map.get("类型");
            String str4 = map.get("地区");
            String str5 = map.get("年代");
            sb2.append("动画");
            if (str3 != null && !str3.isEmpty()) {
                sb2.append(",");
                sb2.append(str3);
            }
            if (str4 != null && !str4.isEmpty()) {
                sb2.append(",");
                sb2.append(str4);
            }
            if (str5 != null && !str5.isEmpty()) {
                sb2.append(",");
                sb2.append(str5);
            }
            String strReplace3 = sb.toString().replace("tags=动画", "tags=" + sb2.toString());
            sb = new StringBuilder();
            sb.append(strReplace3);
        }
        JSONArray jSONArrayOptJSONArray = new JSONObject(OkHttp.string(sb.toString(), m504a())).optJSONArray("items");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                String strOptString = jSONObject2.optString("title");
                String str6 = "msearch:" + jSONObject2.optString("id");
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pic");
                String str7 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("normal") + "@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36" : "";
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("rating");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("评分：");
                if (jSONObjectOptJSONObject2 != null) {
                    sb3.append(jSONObjectOptJSONObject2.optDouble("value"));
                }
                String string = sb3.toString();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", str6);
                jSONObject3.put("vod_name", strOptString);
                jSONObject3.put("vod_pic", str7);
                jSONObject3.put("vod_remarks", string);
                jSONArray.put(jSONObject3);
            }
        }
        jSONObject.put("list", jSONArray);
        int length = jSONArray.length();
        jSONObject.put("page", Integer.parseInt(str));
        jSONObject.put("pagecount", 999);
        jSONObject.put("limit", 20);
        jSONObject.put("total", length);
        return jSONObject.toString();
    }

    private String processGuessyoulike(String str) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int i = Integer.parseInt(str);
        JSONArray jSONArray2 = new JSONArray(
        int i2 = i - 1;
        if (i2 >= jSONArray2.length()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("list", new JSONArray());
            return jSONObject.toString();
        }
        String string = jSONArray2.getString(i2);
        JSONArray jSONArray3 = new JSONArray();
        String strM6073l = OkHttp.string("https://frodo.douban.com/rexxar/api/v2/search/weixin?q=" + URLEncoder.encode(string, "UTF-8") + "&start=0&count=20&apikey=0ac44ae016490db2204ce0a042db2916", m504a());
        this.f168b = strM6073l;
        JSONObject jSONObject2 = new JSONObject(strM6073l);
        JSONObject jSONObject3 = null;
        if (jSONObject2 != null && (jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("items")) != null && jSONArrayOptJSONArray2.length() > 0) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                JSONObject jSONObject4 = jSONArrayOptJSONArray2.getJSONObject(i3);
                JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("target");
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optBoolean("has_linewatch")) {
                    if (jSONObjectOptJSONObject2.optString("title").equals(string)) {
                        jSONObject3 = jSONObject4;
                        break;
                    }
                    if (jSONObject3 == null) {
                        jSONObject3 = jSONObject4;
                    }
                }
            }
        }
        if (jSONObject3 != null) {
            String strOptString2 = jSONObject3.optString("target_type");
            JSONObject jSONObjectOptJSONObject3 = jSONObject3.optJSONObject("target");
            if (jSONObjectOptJSONObject3 != null && (strOptString = jSONObjectOptJSONObject3.optString("id")) != null && !strOptString.isEmpty() && strOptString2 != null && !strOptString2.isEmpty()) {
                String strM6073l2 = OkHttp.string("https://frodo.douban.com/rexxar/api/v2/" + strOptString2 + "/" + strOptString + "/recommendations?apiKey=0ac44ae016490db2204ce0a042db2916", m504a());
                if (!strM6073l2.contains("\"code\":404") && (jSONArray = new JSONArray(strM6073l2)) != null && jSONArray.length() > 0) {
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i4);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("vod_id", "msearch:" + jSONObject5.optString("id"));
                        jSONObject6.put("vod_name", jSONObject5.optString("title"));
                        JSONObject jSONObjectOptJSONObject4 = jSONObject5.optJSONObject("pic");
                        jSONObject6.put("vod_pic", (jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("normal") : "") + "@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
                        JSONObject jSONObjectOptJSONObject5 = jSONObject5.optJSONObject("rating");
                        StringBuilder sb = new StringBuilder();
                        sb.append("评分：");
                        if (jSONObjectOptJSONObject5 != null) {
                            sb.append(jSONObjectOptJSONObject5.optDouble("value"));
                        }
                        jSONObject6.put("vod_remarks", sb.toString());
                        jSONArray3.put(jSONObject6);
                    }
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("list", jSONArray3);
                    return jSONObject7.toString();
                }
            }
        }
        String str2 = this.f168b;
        if (str2 == null || (jSONArrayOptJSONArray = new JSONObject(str2).optJSONArray("items")) == null) {
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("list", new JSONArray());
            return jSONObject8.toString();
        }
        JSONArray jSONArray4 = new JSONArray();
        for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
            JSONObject jSONObject9 = jSONArrayOptJSONArray.getJSONObject(i5);
            String strOptString3 = jSONObject9.optString("target_type");
            if ((strOptString3.equals("tv") || strOptString3.equals("movie")) && (jSONObjectOptJSONObject = jSONObject9.optJSONObject("target")) != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("vod_name", jSONObjectOptJSONObject.optString("title"));
                jSONObject10.put("vod_id", "msearch:" + jSONObjectOptJSONObject.optString("id"));
                jSONObject10.put("vod_pic", jSONObjectOptJSONObject.optString("cover_url") + "@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject.optJSONObject("rating");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("评分：");
                if (jSONObjectOptJSONObject6 != null) {
                    sb2.append(jSONObjectOptJSONObject6.optDouble("value"));
                }
                jSONObject10.put("vod_remarks", sb2.toString());
                jSONArray4.put(jSONObject10);
            }
        }
        JSONObject jSONObject11 = new JSONObject();
        jSONObject11.put("list", jSONArray4);
        return jSONObject11.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        byte b;
        String string;
        StringBuilder sb;
        String str3;
        if ("anime_hot".equals(str)) {
            return processAnimeContent(str2, map);
        }
        if ("guess_you_like".equals(str)) {
            return processGuessyoulike(str2);
        }
        String str4 = map.get("sort") == null ? "T" : map.get("sort");
        String strEncode = URLEncoder.encode(m505b(map));
        int i = (Integer.parseInt(str2) - 1) * 20;
        String str5 = "items";
        switch (str) {
            case "rank_list_movie":
                b = 4;
                break;
            case "tv_hot":
                b = 1;
                break;
            case "show_hot":
                b = 2;
                break;
            case "hot_gaia":
                b = 0;
                break;
            case "tv":
                b = 3;
                break;
            case "rank_list_tv":
                b = 5;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            String str6 = map.get("sort") == null ? "recommend" : map.get("sort");
            String str7 = map.get("area") == null ? "全部" : map.get("area");
            StringBuilder sbM3589b = C1434P.m3589b(str6);
            sbM3589b.append("&area=");
            sbM3589b.append(URLEncoder.encode(str7));
            string = "https://frodo.douban.com/rexxar/api/v2/movie/hot_gaia?apikey=0ac44ae016490db2204ce0a042db2916&sort=" + sbM3589b.toString() + "&start=" + i + "&count=20";
        } else if (b == 1) {
            string = "https://frodo.douban.com/rexxar/api/v2/subject_collection/" + (map.get("type") == null ? "tv_hot" : map.get("type")) + "/items" + this.f167a + "&start=" + i + "&count=20";
            str5 = "subject_collection_items";
        } else if (b != 2) {
            if (b == 3) {
                sb = new StringBuilder();
                sb.append("https://frodo.douban.com/rexxar/api/v2/tv/recommend?apikey=0ac44ae016490db2204ce0a042db2916&sort=");
                sb.append(str4);
                sb.append("&tags=");
                sb.append(strEncode);
                sb.append("&start=");
                sb.append(i);
                str3 = "&count=20";
            } else if (b == 4) {
                string = "https://frodo.douban.com/rexxar/api/v2/subject_collection/" + (map.get("榜单") == null ? "movie_real_time_hotest" : map.get("榜单")) + "/items" + this.f167a + "&start=" + i + "&count=20";
                str5 = "subject_collection_items";
            } else if (b != 5) {
                sb = new StringBuilder();
                sb.append("https://frodo.douban.com/rexxar/api/v2/movie/recommend?apikey=0ac44ae016490db2204ce0a042db2916&sort=");
                sb.append(str4);
                sb.append("&tags=");
                sb.append(strEncode);
                sb.append("&start=");
                sb.append(i);
                str3 = "&count=20";
            } else {
                string = "https://frodo.douban.com/rexxar/api/v2/subject_collection/" + (map.get("榜单") == null ? "tv_real_time_hotest" : map.get("榜单")) + "/items" + this.f167a + "&start=" + i + "&count=20";
                str5 = "subject_collection_items";
            }
            sb.append(str3);
            string = sb.toString();
        } else {
            string = "https://frodo.douban.com/rexxar/api/v2/subject_collection/" + (map.get("type") == null ? "show_hot" : map.get("type")) + "/items" + this.f167a + "&start=" + i + "&count=20";
            str5 = "subject_collection_items";
        }
        List<Vod> listM506c = m506c(new JSONObject(C1840c.m4479n(string, m504a())).getJSONArray(str5));
        int i2 = Integer.parseInt(str2);
        C1765g c1765gM4185e = C1765g.m4185e();
        c1765gM4185e.m4209z(listM506c);
        c1765gM4185e.m4202k(i2, Integer.MAX_VALUE, 20, Integer.MAX_VALUE);
        return filterItemsWithoutPic(c1765gM4185e.m4205o());
    }

    public String homeContent(boolean z) {
        String strOptString = new JSONObject(Path.read(Path.tv("/config.json"))).optString("homePage", "");
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(strOptString)) {
            hashSet.addAll(Arrays.asList(strOptString.split(",")));
        }
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("guess_you_like", "hot_gaia", "tv_hot", "anime_hot", "show_hot", "movie", "tv", "rank_list_movie", "rank_list_tv");
        List listAsList2 = Arrays.asList("猜你喜欢", "热门电影", "热播剧集", "热门动漫", "热播综艺", "电影筛选", "电视筛选", "电影榜单", "电视剧榜单");
        for (int i = 0; i < listAsList.size(); i++) {
            String str = (String) listAsList2.get(i);
            if (hashSet.isEmpty() || hashSet.contains(str)) {
                arrayList.add(new Class((String) listAsList.get(i), (String) listAsList2.get(i)));
            }
        }
        return C1765g.m4193u(arrayList, m506c(new JSONObject(C1840c.m4479n("https://frodo.douban.com/rexxar/api/v2/subject_collection/subject_real_time_hotest/items?apikey=0ac44ae016490db2204ce0a042db2916", m504a())).optJSONArray("subject_collection_items")), new JSONObject("{\"hot_gaia\":[{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"热度\",\"v\":\"recommend\"},{\"n\":\"最新\",\"v\":\"time\"},{\"n\":\"评分\",\"v\":\"rank\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"全部\"},{\"n\":\"华语\",\"v\":\"华语\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"}]}],\"tv_hot\":[{\"key\":\"type\",\"name\":\"分类\",\"value\":[{\"n\":\"综合\",\"v\":\"tv_hot\"},{\"n\":\"国产剧\",\"v\":\"tv_domestic\"},{\"n\":\"欧美剧\",\"v\":\"tv_american\"},{\"n\":\"日剧\",\"v\":\"tv_japanese\"},{\"n\":\"韩剧\",\"v\":\"tv_korean\"},{\"n\":\"动画\",\"v\":\"tv_animation\"}]}],\"anime_hot\":[{\"key\":\"类型\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"恋爱\",\"v\":\"恋爱\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"治愈\",\"v\":\"治愈\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"机甲\",\"v\":\"机甲\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"少年\",\"v\":\"少年\"}]},{\"key\":\"地区\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"近期热度\",\"v\":\"T\"},{\"n\":\"首播时间\",\"v\":\"R\"},{\"n\":\"高分优先\",\"v\":\"S\"}]},{\"key\":\"年代\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2010年代\",\"v\":\"2010年代\"},{\"n\":\"2000年代\",\"v\":\"2000年代\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"更早\",\"v\":\"更早\"}]}],\"show_hot\":[{\"key\":\"type\",\"name\":\"分类\",\"value\":[{\"n\":\"综合\",\"v\":\"show_hot\"},{\"n\":\"国内\",\"v\":\"show_domestic\"},{\"n\":\"国外\",\"v\":\"show_foreign\"}]}],\"movie\":[{\"key\":\"类型\",\"name\":\"类型\",\"value\":[{\"n\":\"全部类型\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"传记\",\"v\":\"传记\"},{\"n\":\"歌舞\",\"v\":\"歌舞\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"情色\",\"v\":\"情色\"},{\"n\":\"灾难\",\"v\":\"灾难\"},{\"n\":\"西部\",\"v\":\"西部\"},{\"n\":\"纪录片\",\"v\":\"纪录片\"},{\"n\":\"短片\",\"v\":\"短片\"}]},{\"key\":\"地区\",\"name\":\"地区\",\"value\":[{\"n\":\"全部地区\",\"v\":\"\"},{\"n\":\"华语\",\"v\":\"华语\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"中国\",\"v\":\"中国\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"菲律宾\",\"v\":\"菲律宾\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"},{\"n\":\"爱尔兰\",\"v\":\"爱尔兰\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"巴西\",\"v\":\"巴西\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"近期热度\",\"v\":\"T\"},{\"n\":\"首映时间\",\"v\":\"R\"},{\"n\":\"高分优先\",\"v\":\"S\"}]},{\"key\":\"年代\",\"name\":\"年代\",\"value\":[{\"n\":\"全部年代\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2010年代\",\"v\":\"2010年代\"},{\"n\":\"2000年代\",\"v\":\"2000年代\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"},{\"n\":\"70年代\",\"v\":\"70年代\"},{\"n\":\"60年代\",\"v\":\"60年代\"},{\"n\":\"更早\",\"v\":\"更早\"}]}],\"tv\":[{\"key\":\"类型\",\"name\":\"类型\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"电视剧\",\"v\":\"电视剧\"},{\"n\":\"综艺\",\"v\":\"综艺\"}]},{\"key\":\"电视剧形式\",\"name\":\"电视剧形式\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"传记\",\"v\":\"传记\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"灾难\",\"v\":\"灾难\"},{\"n\":\"歌舞\",\"v\":\"歌舞\"},{\"n\":\"音乐\",\"v\":\"音乐\"}]},{\"key\":\"综艺形式\",\"name\":\"综艺形式\",\"value\":[{\"n\":\"不限\",\"v\":\"\"},{\"n\":\"真人秀\",\"v\":\"真人秀\"},{\"n\":\"脱口秀\",\"v\":\"脱口秀\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"歌舞\",\"v\":\"歌舞\"}]},{\"key\":\"地区\",\"name\":\"地区\",\"value\":[{\"n\":\"全部地区\",\"v\":\"\"},{\"n\":\"华语\",\"v\":\"华语\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"中国\",\"v\":\"中国\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"俄罗斯\",\"v\":\"俄罗斯\"},{\"n\":\"瑞典\",\"v\":\"瑞典\"},{\"n\":\"巴西\",\"v\":\"巴西\"},{\"n\":\"丹麦\",\"v\":\"丹麦\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"爱尔兰\",\"v\":\"爱尔兰\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"}]},{\"key\":\"sort\",\"name\":\"排序\",\"value\":[{\"n\":\"近期热度\",\"v\":\"T\"},{\"n\":\"首播时间\",\"v\":\"R\"},{\"n\":\"高分优先\",\"v\":\"S\"}]},{\"key\":\"年代\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2010年代\",\"v\":\"2010年代\"},{\"n\":\"2000年代\",\"v\":\"2000年代\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"},{\"n\":\"70年代\",\"v\":\"70年代\"},{\"n\":\"60年代\",\"v\":\"60年代\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"平台\",\"name\":\"平台\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"腾讯视频\",\"v\":\"腾讯视频\"},{\"n\":\"爱奇艺\",\"v\":\"爱奇艺\"},{\"n\":\"优酷\",\"v\":\"优酷\"},{\"n\":\"湖南卫视\",\"v\":\"湖南卫视\"},{\"n\":\"Netflix\",\"v\":\"Netflix\"},{\"n\":\"HBO\",\"v\":\"HBO\"},{\"n\":\"BBC\",\"v\":\"BBC\"},{\"n\":\"NHK\",\"v\":\"NHK\"},{\"n\":\"CBS\",\"v\":\"CBS\"},{\"n\":\"NBC\",\"v\":\"NBC\"},{\"n\":\"tvN\",\"v\":\"tvN\"}]}],\"rank_list_movie\":[{\"key\":\"榜单\",\"name\":\"榜单\",\"value\":[{\"n\":\"实时热门电影\",\"v\":\"movie_real_time_hotest\"},{\"n\":\"一周口碑电影榜\",\"v\":\"movie_weekly_best\"},{\"n\":\"豆瓣电影Top250\",\"v\":\"movie_top250\"}]}],\"rank_list_tv\":[{\"key\":\"榜单\",\"name\":\"榜单\",\"value\":[{\"n\":\"实时热门电视\",\"v\":\"tv_real_time_hotest\"},{\"n\":\"华语口碑剧集榜\",\"v\":\"tv_chinese_best_weekly\"},{\"n\":\"全球口碑剧集榜\",\"v\":\"tv_global_best_weekly\"},{\"n\":\"国内口碑综艺榜\",\"v\":\"show_chinese_best_weekly\"},{\"n\":\"国外口碑综艺榜\",\"v\":\"show_global_best_weekly\"}]}]}"));
    }

    public void init(Context context, String str) {
    }
}
