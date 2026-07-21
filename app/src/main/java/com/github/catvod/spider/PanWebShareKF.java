package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p041D.C1266a;
import com.github.catvod.spider.support.p101G.C2034f;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p102H.C2051g;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.support.p139y.C2423f;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PanWebShareKF extends Pan {

    /* JADX INFO: renamed from: j */
    private static String f250j = "";

    /* JADX INFO: renamed from: k */
    private static String f251k = "";

    /* JADX INFO: renamed from: i */
    private long f252i;

    /* JADX INFO: renamed from: b */
    private String m623b(String str) {
        HashMap mapM5756b = C2186v.m5756b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
        mapM5756b.put("Referer", f250j);
        mapM5756b.put("Cookie", f251k);
        mapM5756b.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6");
        return OkHttp.string(str, mapM5756b);
    }

    /* JADX INFO: renamed from: c */
    private List<String> m624c(C2034f c2034f) {
        ArrayList arrayList = new ArrayList();
        Iterator<C2037i> it = c2034f.m4896n0("div.message > div > div.alert, div.message > div.alert, div.message > section > div.alert, div.message > h5 > div.alert").iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m4902t0().replace("您已通过回复满足要求，内容已解锁", "").replaceAll("\\s+", ""));
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
    private void m625d(String str) {
        String str2 = f250j;
        if (!str2.contains("https://www.kfjwzz.com") || !str2.contains("www.kfzy.cc")) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f252i;
            if (jCurrentTimeMillis < 21000) {
                try {
                    Thread.sleep(21000 - jCurrentTimeMillis);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        String str3 = new String[]{"感谢楼主分享！", "这个资源太棒了！", "已收藏，谢谢！", "不错的资源，支持一下", "楼主辛苦了！", "内容很有用，感谢分享"}[new Random().nextInt(6)];
        String str4 = f250j + "/post-create-" + C2423f.m6448l(str, "thread-", ".") + "-1.htm";
        HashMap mapM5756b = C2186v.m5756b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
        mapM5756b.put("Referer", f250j);
        mapM5756b.put("Cookie", f251k);
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
        this.f252i = System.currentTimeMillis();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            C2034f c2034fM3149a = C1266a.m3149a(m623b(f250j + "/forum-" + str + "-" + str2 + ".htm"));
            ArrayList arrayList = new ArrayList();
            for (C2037i c2037i : c2034fM3149a.m4896n0("ul.threadlist > li")) {
                if (!c2037i.m4896n0("i").m5179a("data-placement").contains("top")) {
                    String strMo4929d = c2037i.m4896n0("div > div.subject > a,div > div.style3_subject > a").m5180b().mo4929d("href");
                    String strM4902t0 = c2037i.m4896n0("div > div.subject > a,div > div.style3_subject > a").m5180b().m4902t0();
                    if (!strM4902t0.contains("福利")) {
                        String strM5179a = c2037i.m4896n0("a > img").m5179a("src");
                        if (!strM5179a.startsWith("http")) {
                            strM5179a = f250j + "/" + strM5179a;
                        }
                        arrayList.add(new Vod(strMo4929d, strM4902t0, strM5179a, c2037i.m4896n0("div > div.subject > a.badge,div > div.style3_subject > a.badge").m5181c()));
                    }
                }
            }
            C2192c c2192c = Result.get()();
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
            String str = f250j + "/" + list.get(0);
            C2034f c2034f = new C2034f("");
            for (int i = 1; i < 3; i++) {
                c2034f = C2051g.m5074d(m623b(str));
                if (!c2034f.m4896n0("div.message").m5181c().contains("<立即回复>")) {
                    break;
                }
                m625d(list.get(0));
            }
            List<String> listM624c = m624c(c2034f);
            Vod c2194e = new Vod();
            c2194e.m5848j(list.get(0));
            c2194e.m5849k(c2034f.m4896n0("h4").m5181c());
            c2194e.m5850l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/LX2y/1200X800/quark.jpg/webp");
            StringBuilder sb = new StringBuilder();
            sb.append("资源id:");
            sb.append(list.get(0));
            sb.append(">>");
            c2194e.m5846h(listM624c.toString().replace("[", "").replace("]", "").replace("网盘链接：", "").replace(",", "\n"));
            PanOrder.sort(listM624c);
            c2194e.m5851m(detailContentVodPlayFrom(listM624c));
            c2194e.m5852n(detailContentVodPlayUrl(listM624c));
            return C2137a.processVodData(Result.string(c2194e));
        } catch (Exception unused) {
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", "1");
            jSONObject.put("type_name", "剧集");
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type_id", "2");
            jSONObject2.put("type_name", "短剧");
            jSONArray.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type_id", "3");
            jSONObject3.put("type_name", "动漫");
            jSONArray.put(jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("type_id", "4");
            jSONObject4.put("type_name", "综艺");
            jSONArray.put(jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("type_id", "9");
            jSONObject5.put("type_name", "电影");
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
        JSONObject jSONObject;
        JSONArray jSONArray;
        int length;
        try {
            if (str.isEmpty() || (length = (jSONArray = (jSONObject = new JSONObject(str)).getJSONArray("site")).length()) == 0) {
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
                        f250j = strTrim;
                        httpURLConnection.disconnect();
                        break;
                    }
                    httpURLConnection.disconnect();
                }
            }
            f251k = jSONObject.optString("cookie");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            ArrayList arrayList = new ArrayList();
            for (C2037i c2037i : C1266a.m3149a(m623b(f250j + "/search-" + str + "-1.htm")).m4896n0("ul.threadlist > li")) {
                if (!c2037i.m4896n0("i").m5179a("data-placement").contains("top")) {
                    String strMo4929d = c2037i.m4896n0("div > div.subject > a,div > div.style3_subject > a").m5180b().mo4929d("href");
                    String strM4902t0 = c2037i.m4896n0("div > div.subject > a,div > div.style3_subject > a").m5180b().m4902t0();
                    String strM5179a = c2037i.m4896n0("a > img").m5179a("src");
                    if (!strM5179a.startsWith("http")) {
                        strM5179a = f250j + "/" + strM5179a;
                    }
                    arrayList.add(new Vod(strMo4929d, strM4902t0, strM5179a, c2037i.m4896n0("div > div.subject > a.badge,div > div.style3_subject > a.badge").m5181c()));
                }
            }
            C2192c c2192c = Result.get()();
            c2192c.m5817i(1, 0, 0, 0);
            c2192c.m5829w(arrayList);
            return c2192c.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
