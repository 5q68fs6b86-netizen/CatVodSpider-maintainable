package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0502oj;
import com.github.catvod.spider.support.p002A0.AbstractC0763ya;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import com.github.catvod.spider.support.p002A0.C0226ed;
import com.github.catvod.spider.support.p002A0.C0235em;
import com.github.catvod.spider.support.p002A0.C0589rp;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Djuu extends Spider {

    /* JADX INFO: renamed from: a */
    public static ArrayList f166a = new ArrayList();

    /* JADX INFO: renamed from: com.github.catvod.spider.Djuu$1 */
    class C00351 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m501b(String str) {
        try {
            StringBuilder sb = new StringBuilder("https://m.djuu.com");
            sb.append(str);
            sb.append("@Headers=");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
            jSONObject.put("Referer", "https://m.djuu.com/");
            sb.append(jSONObject.toString());
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public final HashMap m502c(String str) {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
        map.put("Referer", "https://m.djuu.com");
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strConcat;
        String strM1645f;
        C0589rp c0589rpM1166ah;
        String strM1645f2;
        String strM501b;
        String strM1640a;
        Djuu djuu = this;
        String str3 = str;
        String str4 = "div.fs-5";
        try {
            if (str3.equals("djlist")) {
                f166a = new ArrayList();
                if (!str2.equals("1")) {
                    return "";
                }
                strConcat = "https://m.djuu.com/".concat(str3);
            } else {
                strConcat = "https://m.djuu.com" + str3.replace("{pg}", str2);
            }
            C0235em c0235emM1487a = AbstractC0502oj.m1487a(AbstractC0771yi.m1889k(strConcat, djuu.m502c("https://m.djuu.com")));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (str3.equals("djlist")) {
                c0589rpM1166ah = c0235emM1487a.m1166ah("div.my-3 div.mb-2");
                strM1645f = "";
            } else {
                C0589rp c0589rpM1166ah2 = c0235emM1487a.m1166ah("div#djuu-musiclist-djlist div.djuu-list-item");
                strM1645f = c0235emM1487a.m1166ah("div.fs-4").m1645f();
                c0589rpM1166ah = c0589rpM1166ah2;
            }
            int i = 0;
            while (i < c0589rpM1166ah.size()) {
                C0226ed c0226ed = (C0226ed) c0589rpM1166ah.get(i);
                if (str3.equals("djlist")) {
                    strM1645f2 = c0226ed.m1166ah(str4).m1645f();
                    strM501b = djuu.m501b(c0226ed.m1166ah("img").m1640a("src"));
                    strM1640a = c0226ed.m1166ah(str4).m1640a("onclick").split("\\('")[1].split("'\\)")[0].replace("1_1.html", "1_{pg}.html");
                } else {
                    strM1645f2 = c0226ed.m1166ah("div.me-2 > span").m1645f();
                    strM501b = djuu.m501b("/static/mobile/images/play/logo.png");
                    strM1640a = c0226ed.m1166ah("div.djuu-list-item").m1640a("data-bs-id");
                }
                JSONObject jSONObject2 = new JSONObject();
                if (str3.equals("djlist")) {
                    jSONObject2.put("vod_tag", "folder");
                    jSONObject2.put("vod_id", strM1640a);
                } else {
                    jSONObject2.put("vod_tag", "file");
                    jSONObject2.put("vod_id", strM1640a + "$$$" + strM1645f2 + "$$$" + strM501b + "$$$" + strM1645f);
                    ArrayList arrayList = f166a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(strM1645f2);
                    sb.append("$");
                    sb.append(strM1640a);
                    arrayList.add(sb.toString());
                }
                jSONObject2.put("vod_name", strM1645f2);
                jSONObject2.put("vod_pic", strM501b);
                jSONArray.put(jSONObject2);
                i++;
                djuu = this;
                str3 = str;
                str4 = str4;
            }
            jSONObject.put("page", str2);
            jSONObject.put("pagecount", Integer.MAX_VALUE);
            jSONObject.put("limit", jSONArray.length());
            jSONObject.put("total", Integer.MAX_VALUE);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final String m503d(String str, String str2) {
        try {
            f166a = new ArrayList();
            String str3 = "https://m.djuu.com/search?musicname=" + URLEncoder.encode(str);
            if (!str2.equals("1")) {
                str3 = "https://m.djuu.com/search?musicname=" + URLEncoder.encode(str) + "&page=" + str2;
            }
            C0235em c0235emM1487a = AbstractC0502oj.m1487a(AbstractC0771yi.m1889k(str3, m502c("https://m.djuu.com")));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            C0589rp c0589rpM1166ah = c0235emM1487a.m1166ah("div#djuu-musiclist-search div.djuu-list-item");
            for (int i = 0; i < c0589rpM1166ah.size(); i++) {
                C0226ed c0226ed = (C0226ed) c0589rpM1166ah.get(i);
                String strM1645f = c0226ed.m1166ah("div.me-2 > span").m1645f();
                String strM501b = m501b("/static/mobile/images/play/logo.png");
                String strM1640a = c0226ed.m1166ah("div.djuu-list-item").m1640a("data-bs-id");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strM1640a + "$$$" + strM1645f + "$$$" + strM501b + "$$$");
                jSONObject2.put("vod_name", strM1645f);
                jSONObject2.put("vod_pic", strM501b);
                jSONObject2.put("vod_tag", "file");
                jSONObject2.put("vod_remarks", "");
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            String[] strArrSplit = list.get(0).split("\\$\\$\\$");
            String str = strArrSplit[0];
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list);
            jSONObject2.put("vod_name", f166a.size() >= 1 ? strArrSplit[3] : strArrSplit[1]);
            jSONObject2.put("vod_pic", strArrSplit[2]);
            jSONObject2.put("vod_play_from", "DJ呦呦网");
            if (f166a.size() >= 1) {
                jSONObject2.put("vod_play_url", TextUtils.join("#", f166a));
            } else {
                jSONObject2.put("vod_play_url", strArrSplit[1] + "$" + str);
            }
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
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "曲库".split("&");
            String[] strArrSplit2 = "djlist".split("&");
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                if (strArrSplit[i].contains("曲库")) {
                    jSONObject.put("type_flag", "1");
                }
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            jSONObject2.put("filters", new JSONObject("{}"));
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context) {
        super.init(context);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strString;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
            jSONObject.put("Referer", "https://m.djuu.com/");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", str2);
            HashMap mapM502c = m502c("https://m.djuu.com");
            try {
                C00351 c00351 = new C00351();
                AbstractC0771yi.m1887i(AbstractC0771yi.m1884f(), "https://m.djuu.com/play/music", linkedHashMap, mapM502c, c00351);
                strString = ((Response) c00351.getResult()).body().string();
            } catch (Throwable th) {
                th.printStackTrace();
                strString = null;
            }
            String strOptString = new JSONObject(strString).getJSONObject("data").optString("url");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", strOptString);
            jSONObject2.put("parse", 0);
            jSONObject2.put("playUrl", "");
            jSONObject2.put("header", jSONObject.toString());
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        return m503d(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return m503d(str, str2);
    }
}
