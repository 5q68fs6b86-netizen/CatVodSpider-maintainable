package com.github.catvod.spider;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p041D.C1266a;
import com.github.catvod.spider.support.p101G.C2034f;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p102H.C2051g;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Path;
import com.github.catvod.spider.support.p139y.C2423f;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PanWebShare123 extends Pan {

    /* JADX INFO: renamed from: j */
    private static String f247j = "";

    /* JADX INFO: renamed from: k */
    private static String f248k = "";

    /* JADX INFO: renamed from: i */
    private long f249i;

    /* JADX INFO: renamed from: b */
    private String m620b(String str) {
        HashMap mapM5756b = C2186v.m5756b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
        mapM5756b.put("Referer", f247j);
        mapM5756b.put("Cookie", f248k);
        mapM5756b.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6");
        return OkHttp.string(str, mapM5756b);
    }

    /* JADX INFO: renamed from: c */
    private List<String> m621c(C2034f c2034f) {
        ArrayList arrayList = new ArrayList();
        Iterator<C2037i> it = c2034f.m4896n0("div.message > div > div.alert,div.message > div.alert,div.message > section > div.alert,div.message").iterator();
        while (it.hasNext()) {
            String strM4902t0 = it.next().m4902t0();
            Matcher matcher = Pattern.compile("(?:www\\.)?123(?:[a-zA-Z0-9]{3}|pan)\\.(?:com|cn)/(?:s|123pan)/([^/?#]+)(?:\\?pwd=([^&#]+))?(?:[&#].*)?$").matcher(strM4902t0);
            Matcher matcher2 = Pattern.compile("(https?://[^\\s]+(?:\\.html)?)").matcher(strM4902t0);
            if (matcher.find() || matcher2.find()) {
                String strReplace = strM4902t0.replace("请您务必转存保存后再进行下载，以免消耗分享者的免登流量", "").replaceAll("\\s+", "").replace(".html", "");
                if (matcher.find()) {
                    arrayList.add(processExtractionCode((Object) strReplace));
                } else if (matcher2.find()) {
                    String strReplace2 = matcher2.group().replace(".html", "");
                    Matcher matcher3 = Pattern.compile("提取码[:：]\\s*([a-zA-Z0-9]{4})").matcher(strReplace);
                    if (matcher3.find()) {
                        strReplace2 = strReplace2 + "?pwd=" + matcher3.group(1);
                    }
                    String str = (String) processExtractionCode((Object) strReplace2);
                    if (!str.isEmpty() && str.contains("http")) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.size() == 1 && !((String) arrayList.get(0)).contains("http")) {
            String strM5408a = (String) arrayList.get(0);
            Iterator<C2037i> it2 = c2034f.m4896n0("a").iterator();
            while (it2.hasNext()) {
                String strMo4929d = it2.next().mo4929d("href");
                if (strMo4929d.contains("/s/") || strMo4929d.contains("/t/")) {
                    if (strMo4929d.contains(".123") && !strM5408a.contains("码")) {
                        strM5408a = C2139c.m5408a("提取码：", strM5408a);
                    }
                    if (strMo4929d.contains("cloud.") && !strM5408a.contains("码")) {
                        strM5408a = C2139c.m5408a("访问码：", strM5408a);
                    }
                    arrayList.set(0, strMo4929d + strM5408a);
                    break;
                }
            }
        }
        SpiderDebug.log(arrayList.toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private void m622d(String str) {
        String str2 = f247j;
        if (!str2.contains("123panfx.com") || !str2.contains("pan1.me")) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f249i;
            if (jCurrentTimeMillis < 21000) {
                try {
                    Thread.sleep(21000 - jCurrentTimeMillis);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        String str3 = new String[]{"感谢楼主分享！", "这个资源太棒了！", "已收藏，谢谢！", "不错的资源，支持一下", "楼主辛苦了！", "内容很有用，感谢分享"}[new Random().nextInt(6)];
        String str4 = f247j + "/post-create-" + C2423f.m6448l(str, "thread-", ".") + "-1.htm";
        HashMap mapM5756b = C2186v.m5756b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
        mapM5756b.put("Referer", f247j);
        mapM5756b.put("Cookie", f248k);
        mapM5756b.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6");
        mapM5756b.put("X-Requested-With", "XMLHttpRequest");
        mapM5756b.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        HashMap map = new HashMap();
        map.put("doctype", "1");
        map.put("return_html", "0");
        map.put("quotepid", "");
        map.put("message", str3);
        map.put("quick_reply_message", "4");
        C2238b.m6067g(str4, map, mapM5756b).m6076a();
        this.f249i = System.currentTimeMillis();
    }

    public static Object processExtractionCode(Object obj) {
        String strReplaceAll;
        if (!(obj instanceof String)) {
            return obj;
        }
        String strReplaceAll2 = Pattern.compile("(\\?pwd=[a-zA-Z0-9]+)(.*?)\\?pwd=[a-zA-Z0-9]+").matcher(Pattern.compile("链接：").matcher((String) obj).replaceAll("")).replaceAll("$1$2");
        Pattern.compile("\\?").matcher(strReplaceAll2).find();
        if (Pattern.compile("\\?pwd=[a-zA-Z0-9]{4}").matcher(strReplaceAll2).find()) {
            strReplaceAll = Pattern.compile("(提取码[\\s:：]*[a-zA-Z0-9]{4}|密码[\\s:：]*[a-zA-Z0-9]{4}|码[\\s:：]*[a-zA-Z0-9]{4})").matcher(strReplaceAll2).replaceAll("").trim();
        } else {
            Pattern.compile("(提取码[\\s:：]*)([a-zA-Z0-9]{4})").matcher(strReplaceAll2);
            strReplaceAll = Pattern.compile("(https?://[^\\s]+)(提取码[\\s:：]*)([a-zA-Z0-9]{4})").matcher(strReplaceAll2).replaceAll("$1?pwd=$3");
        }
        return Pattern.compile("#$").matcher(Pattern.compile("\\?\\?pwd=").matcher(strReplaceAll).replaceAll("?pwd=")).replaceAll("");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            C2034f c2034fM3149a = C1266a.m3149a(m620b(f247j + "/forum-" + str + "-" + str2 + ".htm"));
            ArrayList arrayList = new ArrayList();
            for (C2037i c2037i : c2034fM3149a.m4896n0("ul.threadlist > li")) {
                if (!c2037i.m4896n0("i").m5179a("data-placement").contains("top")) {
                    String strMo4929d = c2037i.m4896n0("div > div.subject > a,div > div.style3_subject > a").m5180b().mo4929d("href");
                    String strM4902t0 = c2037i.m4896n0("div > div.subject > a,div > div.style3_subject > a").m5180b().m4902t0();
                    String strM5179a = c2037i.m4896n0("a > img").m5179a("src");
                    if (!strM5179a.startsWith("http")) {
                        strM5179a = f247j + "/" + strM5179a;
                    }
                    arrayList.add(new Vod(strMo4929d, strM4902t0, strM5179a, c2037i.m4896n0("div > div.subject > a.badge,div > div.style3_subject > a.badge").m5181c()));
                }
            }
            C2192c c2192c = new C2192c();
            c2192c.m5817i(Integer.valueOf(str2).intValue(), 0, 0, 0);
            c2192c.m5829w(arrayList);
            return c2192c.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        try {
            String str = f247j + "/" + list.get(0);
            C2034f c2034f = new C2034f("");
            for (int i = 1; i < 3; i++) {
                c2034f = C2051g.m5074d(m620b(str));
                if (!c2034f.m4896n0("div.message").m5181c().contains("请回复后再查看")) {
                    break;
                }
                m622d(list.get(0));
            }
            List<String> listM621c = m621c(c2034f);
            HashSet hashSet = new HashSet();
            Iterator<String> it = listM621c.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
            ArrayList arrayList = new ArrayList(hashSet);
            if (arrayList.size() == 2) {
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.get(0).contains("pwd")) {
                    arrayList2.add(arrayList.get(0));
                }
                if (arrayList.get(1).contains("pwd")) {
                    arrayList2.add(arrayList.get(1));
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            ArrayList arrayList3 = arrayList;
            Vod c2194e = new Vod();
            c2194e.m5848j(list.get(0));
            c2194e.m5849k(c2034f.m4896n0("h4").m5181c());
            c2194e.m5850l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/N1l5/1200X800/123.jpg/webp");
            StringBuilder sb = new StringBuilder();
            sb.append("资源id:");
            sb.append(list.get(0));
            sb.append(">>");
            c2194e.m5846h(arrayList3.toString().replace("[", "").replace("]", "").replace(",", "\n"));
            PanOrder.sort(arrayList3);
            c2194e.m5851m(detailContentVodPlayFrom(arrayList3));
            c2194e.m5852n(detailContentVodPlayUrl(arrayList3));
            return C2137a.processVodData(Result.string(c2194e));
        } catch (Exception unused) {
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", "2");
            jSONObject.put("type_name", "电影");
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type_id", "48");
            jSONObject2.put("type_name", "剧集");
            jSONArray.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type_id", "56");
            jSONObject3.put("type_name", "4K原盘");
            jSONArray.put(jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("type_id", "52");
            jSONObject4.put("type_name", "综艺");
            jSONArray.put(jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("type_id", "37");
            jSONObject5.put("type_name", "动漫");
            jSONArray.put(jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("class", jSONArray);
            return jSONObject6.toString();
        } catch (Exception unused) {
            return "{\"class\":[]}";
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        JSONArray jSONArray;
        int length;
        try {
            if (str.isEmpty() || (length = (jSONArray = new JSONObject(str).getJSONArray("site")).length()) == 0) {
                return;
            }
            for (int i = 0; i < length; i++) {
                String strTrim = jSONArray.getString(i).trim();
                if (!strTrim.isEmpty()) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strTrim).openConnection();
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setRequestMethod("HEAD");
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 400) {
                        f247j = strTrim;
                        httpURLConnection.disconnect();
                        break;
                    }
                    httpURLConnection.disconnect();
                }
            }
            String strM6164a = Path.read(Path.tv("/diy_cookie.txt"));
            if (TextUtils.isEmpty(strM6164a)) {
                return;
            }
            f248k = new JSONObject(strM6164a).optString("123panfx_cookie");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = f247j + "/search.htm?keyword=" + str;
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 16_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.6 Mobile/15E148 Safari/604.1");
            map.put("Referer", f247j);
            map.put("x-requested-with", "XMLHttpRequest");
            JSONObject jSONObject = new JSONObject(OkHttp.string(str2, map));
            SpiderDebug.log(jSONObject.toString());
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("message");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("url");
                String strReplaceAll = jSONObjectOptJSONObject.optString("subject").replaceAll("<[^>]+>|&(?:#\\d+;|#x[\\da-fA-F]+;|[a-z]+;)", "");
                String strOptString2 = jSONObjectOptJSONObject.optString("user_avatar_url");
                if (!strOptString2.startsWith("http")) {
                    strOptString2 = f247j + "/" + strOptString2;
                }
                arrayList.add(new Vod(strOptString, strReplaceAll, strOptString2, ""));
            }
            return Result.string(arrayList);
        } catch (Exception unused) {
            return "";
        }
    }
}
