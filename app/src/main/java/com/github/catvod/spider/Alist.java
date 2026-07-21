package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0502oj;
import com.github.catvod.spider.support.p002A0.AbstractC0716wh;
import com.github.catvod.spider.support.p002A0.AbstractC0763ya;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import com.github.catvod.spider.support.p002A0.C0138ax;
import com.github.catvod.spider.support.p002A0.C0164bw;
import com.github.catvod.spider.support.p002A0.C0175cg;
import com.github.catvod.spider.support.p002A0.C0202dg;
import com.github.catvod.spider.support.p002A0.C0226ed;
import com.github.catvod.spider.support.p002A0.C0456mr;
import com.github.catvod.spider.support.p002A0.C0493oa;
import com.github.catvod.spider.support.p002A0.C0514ov;
import com.github.catvod.spider.support.p002A0.C0613sm;
import com.github.catvod.spider.support.p002A0.C0723wo;
import com.github.catvod.spider.support.p002A0.C0739xd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Alist extends Spider {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f37a = 0;

    /* JADX INFO: renamed from: b */
    public List f38b;

    /* JADX INFO: renamed from: c */
    public String f39c;

    /* JADX INFO: renamed from: d */
    public String f40d;

    /* JADX INFO: renamed from: com.github.catvod.spider.Alist$1 */
    class C00281 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.Alist$2 */
    class C00292 extends AbstractC0763ya {
        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    class Job implements Callable<List<C0723wo>> {

        /* JADX INFO: renamed from: a */
        public final C0456mr f41a;

        /* JADX INFO: renamed from: b */
        public final String f42b;

        public Job(C0456mr c0456mr, String str) {
            this.f41a = c0456mr;
            this.f42b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<com.github.catvod.spider.support.A0.wo>] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
        @Override // java.util.concurrent.Callable
        public List<C0723wo> call() {
            ?? EmptyList;
            String str = this.f42b;
            C0456mr c0456mr = this.f41a;
            Alist alist = Alist.this;
            try {
                EmptyList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                sb.append(c0456mr.m1430e());
                sb.append(c0456mr.m1436k() ? "/api/fs/search" : "/api/public/search");
                String string = sb.toString();
                String strM1437l = c0456mr.m1437l(str);
                int i = Alist.f37a;
                alist.getClass();
                String strM388h = Alist.m388h(c0456mr, string, strM1437l, true);
                for (C0175cg c0175cg : C0175cg.m1072a(c0456mr.m1436k() ? new JSONObject(strM388h).getJSONObject("data").getJSONArray("content").toString() : new JSONObject(strM388h).getJSONArray("data").toString())) {
                    if (!c0175cg.m1080i(c0456mr.m1436k())) {
                        EmptyList.add(c0175cg.m1077f(c0456mr, alist.f39c));
                    }
                }
            } catch (Exception unused) {
                EmptyList = Collections.emptyList();
            }
            if (EmptyList.size() <= 0) {
                EmptyList = new ArrayList();
                Iterator it = AbstractC0502oj.m1487a(AbstractC0771yi.m1889k(c0456mr.m1430e() + "/search?box=" + str + "&url=&type=video", null)).m1166ah("ul > a").iterator();
                while (it.hasNext()) {
                    String[] strArrSplit = ((C0226ed) it.next()).m1169ak().split("#");
                    if (strArrSplit[0].contains("/")) {
                        int iLastIndexOf = strArrSplit[0].lastIndexOf("/");
                        String strSubstring = strArrSplit[0];
                        List list = AbstractC0716wh.f1725a;
                        if (strSubstring.contains(".")) {
                            strSubstring = strSubstring.substring(strSubstring.lastIndexOf(".") + 1);
                        }
                        boolean zContains = AbstractC0716wh.f1725a.contains(strSubstring.toLowerCase());
                        C0175cg c0175cg2 = new C0175cg();
                        c0175cg2.m1086o(!zContains ? 1 : 0);
                        c0175cg2.m1085n(strArrSplit.length > 3 ? strArrSplit[4] : "");
                        c0175cg2.m1084m("/" + strArrSplit[0].substring(0, iLastIndexOf));
                        c0175cg2.m1083l(strArrSplit[0].substring(iLastIndexOf + 1));
                        EmptyList.add(c0175cg2.m1077f(c0456mr, alist.f39c));
                    }
                }
            }
            return EmptyList;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m385e(String str, List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0175cg c0175cg = (C0175cg) it.next();
            String strM1074c = c0175cg.m1074c();
            List list2 = AbstractC0716wh.f1725a;
            if (strM1074c.contains(".")) {
                strM1074c = strM1074c.substring(strM1074c.lastIndexOf(".") + 1);
            }
            if (AbstractC0716wh.f1726b.contains(strM1074c)) {
                sb.append("~~~");
                sb.append(c0175cg.m1074c());
                sb.append("@@@");
                String strM1074c2 = c0175cg.m1074c();
                if (strM1074c2.contains(".")) {
                    strM1074c2 = strM1074c2.substring(strM1074c2.lastIndexOf(".") + 1);
                }
                sb.append(strM1074c2);
                sb.append("@@@");
                sb.append(c0175cg.m1079h(str));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m386f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0138ax("type", "排序类型", Arrays.asList(new C0164bw("预设", ""), new C0164bw("名称", "name"), new C0164bw("大小", "size"), new C0164bw("修改时间", "date"))));
        arrayList.add(new C0138ax("order", "排序方式", Arrays.asList(new C0164bw("预设", ""), new C0164bw("⬆", "asc"), new C0164bw("⬇", "desc"))));
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m387g(C0456mr c0456mr) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("username", c0456mr.m1431f().m1009b());
            jSONObject.put("password", c0456mr.m1431f().m1008a());
            C00292 c00292 = new C00292();
            AbstractC0771yi.m1888j(AbstractC0771yi.m1884f(), c0456mr.m1430e() + "/api/auth/login", jSONObject.toString(), null, c00292);
            c0456mr.m1439n(new JSONObject(((Response) c00292.getResult()).body().string()).getJSONObject("data").getString("token"));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m388h(C0456mr c0456mr, String str, String str2, boolean z) {
        try {
            C00281 c00281 = new C00281();
            AbstractC0771yi.m1888j(AbstractC0771yi.m1884f(), str, str2, c0456mr.m1429d(), c00281);
            String strString = ((Response) c00281.getResult()).body().string();
            SpiderDebug.log(strString);
            return (z && strString.contains("Guest user is disabled") && m387g(c0456mr)) ? m388h(c0456mr, str, str2, false) : strString;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            m389i();
            String str3 = map.containsKey("type") ? map.get("type") : "";
            String str4 = map.containsKey("order") ? map.get("order") : "";
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (C0175cg c0175cg : m392l(str, true)) {
                if (c0175cg.m1081j()) {
                    arrayList.add(c0175cg);
                } else {
                    arrayList2.add(c0175cg);
                }
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                Collections.sort(arrayList, new C0514ov(str3, str4));
                Collections.sort(arrayList2, new C0514ov(str3, str4));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C0175cg) it.next()).m1078g(str, this.f39c));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((C0175cg) it2.next()).m1078g(str, this.f39c));
            }
            C0739xd c0739xd = new C0739xd();
            c0739xd.m1868h(arrayList3);
            c0739xd.m1865e();
            return c0739xd.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            m389i();
            String str = list.get(0);
            String strSubstring = str.contains("/") ? str.substring(0, str.indexOf("/")) : str;
            String strSubstring2 = str.substring(0, str.lastIndexOf("/"));
            String strSubstring3 = strSubstring2.substring(strSubstring2.lastIndexOf("/") + 1);
            C0456mr c0456mrM391k = m391k(strSubstring);
            C0723wo c0723wo = new C0723wo();
            c0723wo.m1842d(strSubstring);
            c0723wo.m1839a(str);
            c0723wo.m1840b(strSubstring3);
            c0723wo.m1841c(this.f39c);
            ArrayList arrayList = new ArrayList();
            List<C0175cg> listM392l = m392l(strSubstring2, false);
            for (C0175cg c0175cg : listM392l) {
                if (c0175cg.m1082k(c0456mrM391k.m1436k())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c0175cg.m1074c());
                    sb.append("$");
                    String strReplace = c0175cg.m1079h(strSubstring2) + m385e(strSubstring2, listM392l);
                    if (strReplace.contains("#")) {
                        strReplace = strReplace.replace("#", "***");
                    }
                    sb.append(strReplace);
                    arrayList.add(sb.toString());
                }
            }
            c0723wo.m1843e(TextUtils.join("#", arrayList));
            return C0739xd.m1861a(c0723wo);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            m389i();
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C0456mr c0456mr : this.f38b) {
                if (!c0456mr.m1435j().booleanValue()) {
                    arrayList.add(new C0613sm(c0456mr.m1432g(), c0456mr.m1432g()));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap.put(((C0613sm) it.next()).m1688a(), m386f());
            }
            return C0739xd.m1863c(arrayList, linkedHashMap);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m389i() {
        List list = this.f38b;
        if (list == null || list.isEmpty()) {
            if (this.f40d.startsWith("http")) {
                this.f40d = AbstractC0771yi.m1889k(this.f40d, null);
            }
            C0456mr c0456mr = (C0456mr) new C0493oa().m1478z(this.f40d, C0456mr.class);
            this.f38b = c0456mr.m1428c();
            this.f39c = c0456mr.m1434i();
        }
    }

    public void init(Context context, String str) {
        try {
            this.f40d = str;
            m389i();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final C0175cg m390j(String str) {
        try {
            String strSubstring = str.contains("/") ? str.substring(0, str.indexOf("/")) : str;
            String strSubstring2 = str.contains("/") ? str.substring(str.indexOf("/")) : "";
            C0456mr c0456mrM391k = m391k(strSubstring);
            if (!strSubstring2.startsWith(c0456mrM391k.m1433h())) {
                strSubstring2 = c0456mrM391k.m1433h() + strSubstring2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", strSubstring2);
            jSONObject.put("password", c0456mrM391k.m1427b(strSubstring2));
            StringBuilder sb = new StringBuilder();
            sb.append(c0456mrM391k.m1430e());
            sb.append(c0456mrM391k.m1436k() ? "/api/fs/get" : "/api/public/path");
            String strM388h = m388h(c0456mrM391k, sb.toString(), jSONObject.toString(), true);
            return (C0175cg) new C0493oa().m1478z(c0456mrM391k.m1436k() ? new JSONObject(strM388h).getJSONObject("data").toString() : new JSONObject(strM388h).getJSONObject("data").getJSONArray("files").getJSONObject(0).toString(), C0175cg.class);
        } catch (Exception unused) {
            return new C0175cg();
        }
    }

    /* JADX INFO: renamed from: k */
    public final C0456mr m391k(String str) {
        List list = this.f38b;
        C0456mr c0456mr = (C0456mr) list.get(list.indexOf(new C0456mr(str)));
        c0456mr.m1426a();
        return c0456mr;
    }

    /* JADX INFO: renamed from: l */
    public final List m392l(String str, boolean z) {
        try {
            String strSubstring = str.contains("/") ? str.substring(0, str.indexOf("/")) : str;
            String strSubstring2 = str.contains("/") ? str.substring(str.indexOf("/")) : "";
            C0456mr c0456mrM391k = m391k(strSubstring);
            if (!strSubstring2.startsWith(c0456mrM391k.m1433h())) {
                strSubstring2 = c0456mrM391k.m1433h() + strSubstring2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", strSubstring2);
            jSONObject.put("password", c0456mrM391k.m1427b(strSubstring2));
            StringBuilder sb = new StringBuilder();
            sb.append(c0456mrM391k.m1430e());
            sb.append(c0456mrM391k.m1436k() ? "/api/fs/list" : "/api/public/path");
            String strM388h = m388h(c0456mrM391k, sb.toString(), jSONObject.toString(), true);
            List listM1072a = C0175cg.m1072a(c0456mrM391k.m1436k() ? new JSONObject(strM388h).getJSONObject("data").getJSONArray("content").toString() : new JSONObject(strM388h).getJSONObject("data").getJSONArray("files").toString());
            Iterator it = listM1072a.iterator();
            if (z) {
                while (it.hasNext()) {
                    if (((C0175cg) it.next()).m1080i(c0456mrM391k.m1436k())) {
                        it.remove();
                    }
                }
            }
            return listM1072a;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        HashMap map;
        if (str2.contains("***")) {
            str2 = str2.replace("***", "#");
        }
        String[] strArrSplit = str2.split("~~~");
        String strM1076e = m390j(strArrSplit[0]).m1076e();
        C0739xd c0739xd = new C0739xd();
        c0739xd.m1867g(strM1076e);
        try {
            Uri uri = Uri.parse(strM1076e);
            map = new HashMap();
            if (uri.getHost().contains("115")) {
                map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
            }
            if (uri.getHost().contains("baidupcs.com")) {
                map.put("User-Agent", "pan.baidu.com");
            }
        } catch (Exception unused) {
            map = new HashMap();
        }
        c0739xd.m1864d(map);
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            if (str3.contains("@@@")) {
                String[] strArrSplit2 = str3.split("@@@");
                String str4 = strArrSplit2[0];
                String str5 = strArrSplit2[1];
                String strM1076e2 = m390j(strArrSplit2[2]).m1076e();
                C0202dg c0202dg = new C0202dg();
                c0202dg.m1122b(str4);
                c0202dg.m1121a(str5);
                c0202dg.m1123c(strM1076e2);
                arrayList.add(c0202dg);
            }
        }
        c0739xd.m1866f(arrayList);
        return c0739xd.toString();
    }

    public String searchContent(String str, boolean z) {
        try {
            m389i();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            for (C0456mr c0456mr : this.f38b) {
                if (c0456mr.m1438m().booleanValue()) {
                    c0456mr.m1426a();
                    arrayList2.add(new Job(c0456mr, str));
                }
            }
            Iterator it = executorServiceNewCachedThreadPool.invokeAll(arrayList2, 15L, TimeUnit.SECONDS).iterator();
            while (it.hasNext()) {
                arrayList.addAll((Collection) ((Future) it.next()).get());
            }
            return C0739xd.m1862b(arrayList);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
