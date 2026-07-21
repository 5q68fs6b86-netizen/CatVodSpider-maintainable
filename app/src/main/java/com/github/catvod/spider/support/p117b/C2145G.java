package com.github.catvod.spider.support.p117b;

import android.app.Dialog;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p118c.C2192c;
import com.github.catvod.spider.support.p118c.C2194e;
import com.github.catvod.spider.support.p119d.C2209y;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2268k;
import com.github.catvod.spider.support.p128m.C2269l;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2145G {

    /* JADX INFO: renamed from: a */
    private Dialog f5047a;

    /* JADX INFO: renamed from: b */
    private ScheduledExecutorService f5048b;

    /* JADX INFO: renamed from: d */
    public b f5050d;

    /* JADX INFO: renamed from: e */
    private final d f5051e;

    /* JADX INFO: renamed from: f */
    private final String f5052f;

    /* JADX INFO: renamed from: l */
    private final HashMap f5058l;

    /* JADX INFO: renamed from: m */
    private final HashMap f5059m;

    /* JADX INFO: renamed from: o */
    private static final String f5046o = "aMe-8VSlkrbQXpUR";

    /* JADX INFO: renamed from: n */
    private static final Integer f5045n = 50;

    /* JADX INFO: renamed from: c */
    private final HashMap f5049c = new HashMap();

    /* JADX INFO: renamed from: g */
    private final String f5053g = "com.xunlei.downloadprovider";

    /* JADX INFO: renamed from: h */
    private final String f5054h = "8.31.0.9726";

    /* JADX INFO: renamed from: i */
    private final ArrayList f5055i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private final HashMap f5056j = new HashMap();

    /* JADX INFO: renamed from: k */
    private final HashMap f5057k = new HashMap();

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.G$a */
    public class a {

        /* JADX INFO: renamed from: a */
        static volatile C2145G f5060a = new C2145G();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.G$b */
    public final class b {

        /* JADX INFO: renamed from: a */
        @SerializedName("username")
        private String f5061a;

        /* JADX INFO: renamed from: b */
        @SerializedName("password")
        private String f5062b;

        /* JADX INFO: renamed from: c */
        @SerializedName("captcha_token")
        private String f5063c;

        /* JADX INFO: renamed from: d */
        @SerializedName("deviceid")
        private String f5064d;

        /* JADX INFO: renamed from: e */
        @SerializedName("invite_code")
        private String f5065e;

        /* JADX INFO: renamed from: f */
        @SerializedName("token_resp")
        private c f5066f;

        /* JADX INFO: renamed from: g */
        @SerializedName("pdir_fid")
        private String f5067g;

        /* JADX INFO: renamed from: h */
        @SerializedName("drive_about")
        private String f5068h;

        /* JADX INFO: renamed from: i */
        @SerializedName("vip_expire")
        private String f5069i;

        /* JADX INFO: renamed from: c */
        public static void m5475c(final String str) {
            Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.b.Gg
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj = str;
                    C2145G.m5459r().getClass();
                    C2268k.m6173i(C2145G.m5462v(), (String) obj);
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public final String m5476a() {
            return this.f5064d;
        }

        /* JADX INFO: renamed from: b */
        public final c m5477b() {
            return this.f5066f;
        }

        /* JADX INFO: renamed from: d */
        public final void m5478d(String str) {
            this.f5064d = str;
        }

        /* JADX INFO: renamed from: e */
        public final void m5479e(c cVar) {
            this.f5066f = cVar;
        }

        public final String toString() {
            return new GsonBuilder().disableHtmlEscaping().create().toJson(this);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.G$c */
    public final class c {

        /* JADX INFO: renamed from: a */
        @SerializedName("token_type")
        private String f5070a;

        /* JADX INFO: renamed from: b */
        @SerializedName("access_token")
        private String f5071b;

        /* JADX INFO: renamed from: c */
        @SerializedName("refresh_token")
        private String f5072c;

        /* JADX INFO: renamed from: d */
        @SerializedName("expires_in")
        private Long f5073d;

        /* JADX INFO: renamed from: e */
        @SerializedName("sub")
        private String f5074e;

        /* JADX INFO: renamed from: f */
        @SerializedName("expires_end")
        private Long f5075f;

        /* JADX INFO: renamed from: g */
        @SerializedName("expires_at")
        private String f5076g;

        /* JADX INFO: renamed from: h */
        @SerializedName("ua")
        private String f5077h;

        /* JADX INFO: renamed from: a */
        public final String m5480a() {
            return this.f5071b;
        }

        /* JADX INFO: renamed from: b */
        public final Long m5481b() {
            return this.f5075f;
        }

        /* JADX INFO: renamed from: c */
        public final String m5482c() {
            return this.f5072c;
        }

        /* JADX INFO: renamed from: d */
        public final String m5483d() {
            return this.f5074e;
        }

        /* JADX INFO: renamed from: e */
        public final String m5484e() {
            return this.f5070a;
        }

        /* JADX INFO: renamed from: f */
        public final String m5485f() {
            return this.f5077h;
        }

        /* JADX INFO: renamed from: g */
        public final void m5486g(String str) {
            this.f5071b = str;
        }

        /* JADX INFO: renamed from: h */
        public final void m5487h(Long l) {
            this.f5075f = l;
        }

        /* JADX INFO: renamed from: i */
        public final void m5488i(Long l) {
            this.f5073d = l;
            this.f5076g = C2149Gf.m5536d(l);
        }

        /* JADX INFO: renamed from: j */
        public final void m5489j(String str) {
            this.f5072c = str;
        }

        /* JADX INFO: renamed from: k */
        public final void m5490k(String str) {
            this.f5074e = str;
        }

        /* JADX INFO: renamed from: l */
        public final void m5491l(String str) {
            this.f5070a = str;
        }

        /* JADX INFO: renamed from: m */
        public final void m5492m(String str) {
            this.f5077h = str;
        }

        public final String toString() {
            return new GsonBuilder().disableHtmlEscaping().create().toJson(this);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.G$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        @SerializedName("passCodeToken")
        private f f5078a;

        /* JADX INFO: renamed from: a */
        public final f m5493a() {
            return this.f5078a;
        }

        /* JADX INFO: renamed from: b */
        public final void m5494b(f fVar) {
            this.f5078a = fVar;
        }

        public final String toString() {
            return new GsonBuilder().disableHtmlEscaping().create().toJson(this);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.G$e */
    public final class e implements Comparable<e> {

        /* JADX INFO: renamed from: a */
        @SerializedName("fileId")
        private String f5079a;

        /* JADX INFO: renamed from: b */
        @SerializedName("fileName")
        private String f5080b;

        /* JADX INFO: renamed from: c */
        @SerializedName("parentId")
        private String f5081c;

        /* JADX INFO: renamed from: d */
        @SerializedName("depth")
        private Integer f5082d;

        /* JADX INFO: renamed from: e */
        @SerializedName("resType")
        private Integer f5083e;

        /* JADX INFO: renamed from: f */
        @SerializedName("ctime")
        private long f5084f;

        /* JADX INFO: renamed from: g */
        @SerializedName("utime")
        private long f5085g;

        /* JADX INFO: renamed from: h */
        @SerializedName("fileSize")
        private Double f5086h;

        /* JADX INFO: renamed from: i */
        @SerializedName("thumbnail")
        private String f5087i;

        /* JADX INFO: renamed from: j */
        private String f5088j;

        /* JADX INFO: renamed from: k */
        private String f5089k;

        /* JADX INFO: renamed from: l */
        private String f5090l;

        public e(String str) {
            this.f5079a = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m5495a() {
            if (!C2146Ga.m5525d(this.f5088j)) {
                return TextUtils.join("", Arrays.asList(m5503i(), this.f5080b)).trim().replace("$", "").replace("#", "");
            }
            String strM5503i = m5503i();
            return TextUtils.join("", Arrays.asList("[", this.f5088j.replaceAll("\\{[^{}]*\\}|\\[[^\\[\\]]*\\]|\\([^()]*\\)|（[^（）]*）", ""), "]", this.f5080b, strM5503i)).trim().replace("$", "").replace("#", "");
        }

        /* JADX INFO: renamed from: b */
        public final String m5496b() {
            return this.f5089k;
        }

        /* JADX INFO: renamed from: c */
        public final String m5497c() {
            return this.f5079a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(e eVar) {
            return m5504j().compareTo(eVar.m5504j());
        }

        /* JADX INFO: renamed from: d */
        public final String m5498d() {
            return this.f5080b;
        }

        /* JADX INFO: renamed from: e */
        public final String m5499e() {
            String strSubstring;
            int iIndexOf;
            int i = 0;
            if (C2149Gf.m5534b((CharSequence) this.f5090l) && C2146Ga.m5525d(this.f5087i) && this.f5087i.contains("screenshot-thumbnails")) {
                String str = this.f5087i;
                Object[] objArr = {str, "/screenshot-thumbnails/", "/"};
                while (true) {
                    strSubstring = null;
                    if (i >= 3) {
                        int iIndexOf2 = str.indexOf("/screenshot-thumbnails/");
                        if (iIndexOf2 != -1 && (iIndexOf = str.indexOf("/", "/screenshot-thumbnails/".length() + iIndexOf2)) != -1) {
                            strSubstring = str.substring("/screenshot-thumbnails/".length() + iIndexOf2, iIndexOf);
                            break;
                        }
                        break;
                        break;
                    }
                    if (objArr[i] == null) {
                        break;
                    }
                    i++;
                }
                if (C2146Ga.m5525d(strSubstring)) {
                    this.f5090l = strSubstring;
                }
            }
            return this.f5090l;
        }

        /* JADX INFO: renamed from: f */
        public final String m5500f() {
            return this.f5081c;
        }

        /* JADX INFO: renamed from: g */
        public final String m5501g() {
            return "Guangya://" + this.f5080b + "|" + String.format("%.0f", this.f5086h) + "|" + m5499e();
        }

        /* JADX INFO: renamed from: h */
        public final Integer m5502h() {
            return this.f5083e;
        }

        /* JADX INFO: renamed from: i */
        public final String m5503i() {
            if (this.f5086h.doubleValue() == 0.0d) {
                return "";
            }
            return "[" + C2149Gf.m5539l(this.f5086h.doubleValue()) + "]";
        }

        /* JADX INFO: renamed from: j */
        public final String m5504j() {
            return C2146Ga.m5525d(this.f5088j) ? TextUtils.join(" ", Arrays.asList(this.f5088j, C2149Gf.m5537h(this.f5080b))).trim() : TextUtils.join(" ", Collections.singletonList(C2149Gf.m5537h(this.f5080b))).trim();
        }

        /* JADX INFO: renamed from: k */
        public final String m5505k() {
            return this.f5087i;
        }

        /* JADX INFO: renamed from: l */
        public final long m5506l() {
            return this.f5085g;
        }

        /* JADX INFO: renamed from: m */
        public final void m5507m(String str) {
            this.f5088j = str;
        }

        /* JADX INFO: renamed from: n */
        public final void m5508n(String str) {
            this.f5089k = str;
        }

        /* JADX INFO: renamed from: o */
        public final void m5509o(String str) {
            this.f5079a = str;
        }

        /* JADX INFO: renamed from: p */
        public final void m5510p(String str) {
            this.f5080b = str;
        }

        /* JADX INFO: renamed from: q */
        public final void m5511q(String str) {
            this.f5081c = str;
        }

        /* JADX INFO: renamed from: r */
        public final void m5512r(Integer num) {
            this.f5083e = num;
        }

        /* JADX INFO: renamed from: s */
        public final void m5513s(Double d) {
            this.f5086h = d;
        }

        /* JADX INFO: renamed from: t */
        public final void m5514t(String str) {
            this.f5087i = str;
        }

        /* JADX INFO: renamed from: u */
        public final void m5515u(long j) {
            this.f5085g = j;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.G$f */
    public final class f {

        /* JADX INFO: renamed from: a */
        @SerializedName("pass_code_token")
        private String f5091a;

        /* JADX INFO: renamed from: b */
        private String f5092b;

        /* JADX INFO: renamed from: c */
        private Long f5093c;

        /* JADX INFO: renamed from: a */
        public final String m5516a() {
            return this.f5091a;
        }

        /* JADX INFO: renamed from: b */
        public final String m5517b() {
            return this.f5092b;
        }

        /* JADX INFO: renamed from: c */
        public final Long m5518c() {
            return this.f5093c;
        }

        /* JADX INFO: renamed from: d */
        public final void m5519d(String str) {
            this.f5091a = str;
        }

        /* JADX INFO: renamed from: e */
        public final void m5520e(String str) {
            this.f5092b = str;
        }

        /* JADX INFO: renamed from: f */
        public final void m5521f(Long l) {
            this.f5093c = l;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.G$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f5094b;

        public /* synthetic */ g(Object obj) {
            this.f5094b = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2256I.m6113i(((C2152Gj) this.f5094b).f5110a);
        }
    }

    public C2145G() {
        b bVar;
        d dVar = (d) new GsonBuilder().disableHtmlEscaping().create().fromJson(C2268k.m6164a(m5461u()), d.class);
        this.f5051e = dVar == null ? new d() : dVar;
        try {
            bVar = (b) new Gson().fromJson(C2268k.m6164a(m5462v()), b.class);
        } catch (Exception unused) {
            bVar = null;
        }
        bVar = bVar == null ? new b() : bVar;
        this.f5050d = bVar;
        String strM5476a = bVar.m5476a();
        if (!C2146Ga.m5525d(strM5476a)) {
            strM5476a = C2147Gb.m5532b("a0A0b1B2c1C3d2D1e3E2f4F3g5G7h4H6i5Ij4J9k5K6l6Lm7M7n8N8o9Op0PqQrRsStTuUv9VwWxXy8YzZ").toLowerCase();
            bVar.m5478d(strM5476a);
            Init.execute(new RunnableC2148Gc(bVar));
        }
        this.f5052f = strM5476a;
        this.f5055i.add("9uJNVj/wLmdwKrJaVj/omlQ");
        this.f5055i.add("Oz64Lp0GigmChHMf/6TNfxx7O9PyopcczMsnf");
        this.f5055i.add("Eb+L7Ce+Ej48u");
        this.f5055i.add("jKY0");
        this.f5055i.add("ASr0zCl6v8W4aidjPK5KHd1Lq3t+vBFf41dqv5+fnOd");
        this.f5055i.add("wQlozdg6r1qxh0eRmt3QgNXOvSZO6q/GXK");
        this.f5055i.add("gmirk+ciAvIgA/cxUUCema47jr/YToixTT+Q6O");
        this.f5055i.add("5IiCoM9B1/788ntB");
        this.f5055i.add("P07JH0h6qoM6TSUAK2aL9T5s2QBVeY9JWvalf");
        this.f5055i.add("+oK0AN");
        this.f5058l = new HashMap();
        this.f5059m = new HashMap();
        m5467P();
    }

    /* JADX INFO: renamed from: C */
    private C2153Gk m5452C(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shareId", str);
            String strM6069h = C2238b.m6069h("https://api.guangyapan.com/userres/v1/get_share_summary", jSONObject.toString(), m5474w());
            if (C2149Gf.m5534b((CharSequence) strM6069h)) {
                return null;
            }
            C2153Gk c2153Gk = (C2153Gk) new Gson().fromJson(strM6069h, C2153Gk.class);
            c2153Gk.m5546b();
            return c2153Gk.m5547c();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    private static String m5453D(String str) {
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(str);
        if (urlQuerySanitizer.hasParameter("e")) {
            return urlQuerySanitizer.getValue("e");
        }
        return urlQuerySanitizer.hasParameter("auth_key") ? urlQuerySanitizer.getValue("auth_key").split("-")[0] : String.valueOf((System.currentTimeMillis() / 1000) + 3600000);
    }

    /* JADX INFO: renamed from: E */
    private String m5454E(String str) {
        try {
            HashMap<String, String> mapM5472t = m5472t();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileId", str);
            JSONObject jSONObject2 = new JSONObject(C2238b.m6069h("https://api.guangyapan.com/nd.bizuserres.s/v1/get_res_download_url", jSONObject.toString(), mapM5472t));
            if (jSONObject2.getString("msg").equalsIgnoreCase("success")) {
                return jSONObject2.getJSONObject("data").getString("signedURL");
            }
            return null;
        } catch (Exception e2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: K */
    private void m5455K(String str, e eVar, ArrayList arrayList, ArrayList arrayList2, Integer num, boolean z, boolean z2, boolean z3) {
        try {
            HashMap<String, String> mapM5474w = m5474w();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accessToken", str);
            int i = 1;
            int iIntValue = num.intValue() - 1;
            Integer num2 = f5045n;
            jSONObject.put("cursor", iIntValue * num2.intValue());
            jSONObject.put("orderBy", 0);
            jSONObject.put("pageSize", num2);
            jSONObject.put("parentId", eVar.m5497c());
            jSONObject.put("sortType", 0);
            String strM6069h = C2238b.m6069h("https://api.guangyapan.com/userres/v1/get_share_page_files_list", jSONObject.toString(), mapM5474w);
            SpiderDebug.log("detailStr:" + strM6069h);
            JSONObject jSONObject2 = new JSONObject(strM6069h);
            if (jSONObject2.getString("msg").equalsIgnoreCase("success")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                JSONArray jSONArray = jSONObject3.getJSONArray("list");
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                    int iOptInt = jSONObject4.optInt("resType");
                    boolean z4 = iOptInt == 2;
                    boolean z5 = iOptInt == i;
                    String strOptString = jSONObject4.optString("parentId");
                    String strOptString2 = jSONObject4.optString("fileId");
                    String strOptString3 = jSONObject4.optString("fileName");
                    String strOptString4 = jSONObject4.optString("thumbnail");
                    JSONArray jSONArray2 = jSONArray;
                    long jOptLong = jSONObject4.optLong("utime");
                    double dOptDouble = jSONObject4.optDouble("fileSize");
                    e eVar2 = new e(strOptString);
                    eVar2.m5509o(strOptString2);
                    eVar2.m5510p(strOptString3);
                    eVar2.m5513s(Double.valueOf(dOptDouble));
                    eVar2.m5511q(strOptString);
                    eVar2.m5512r(Integer.valueOf(iOptInt));
                    eVar2.m5514t(strOptString4);
                    eVar2.m5515u(jOptLong);
                    if (z4) {
                        if (z2) {
                            arrayList.add(eVar2);
                        }
                        if (z) {
                            arrayList3.add(eVar2);
                        }
                    } else if (!z5) {
                        if (C2149Gf.m5542o(C2149Gf.m5538i(strOptString3))) {
                            eVar2.m5508n(C2149Gf.m5538i(strOptString3));
                            arrayList2.add(eVar2);
                        }
                        i2++;
                        jSONArray = jSONArray2;
                        i = 1;
                    } else if (C2149Gf.m5541n(strOptString3)) {
                        eVar2.m5507m(eVar.m5498d());
                        arrayList.add(eVar2);
                    }
                    i2++;
                    jSONArray = jSONArray2;
                    i = 1;
                }
                if (z3 && jSONObject3.optBoolean("hasMore")) {
                    m5455K(str, eVar, arrayList, arrayList2, Integer.valueOf(num.intValue() + 1), z, z2, z3);
                }
                if (z) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        m5455K(str, (e) it.next(), arrayList, arrayList2, 1, z, z2, z3);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: L */
    private void m5456L(e eVar, ArrayList arrayList, ArrayList arrayList2, Integer num, boolean z) {
        int i = 1;
        try {
            HashMap<String, String> mapM5472t = m5472t();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orderBy", 3);
            jSONObject.put("page", num.intValue() - 1);
            jSONObject.put("pageSize", f5045n);
            jSONObject.put("parentId", eVar.m5497c());
            jSONObject.put("sortType", 1);
            String strM6069h = C2238b.m6069h("https://api.guangyapan.com/nd.bizuserres.s/v1/file/get_file_list", jSONObject.toString(), mapM5472t);
            SpiderDebug.log("detailStr:" + strM6069h);
            JSONObject jSONObject2 = new JSONObject(strM6069h);
            if (jSONObject2.getString("msg").equalsIgnoreCase("success")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                JSONArray jSONArray = jSONObject3.getJSONArray("list");
                new ArrayList();
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                    int iOptInt = jSONObject4.optInt("resType");
                    boolean z2 = iOptInt == 2;
                    boolean z3 = iOptInt == i;
                    String strOptString = jSONObject4.optString("parentId");
                    String strOptString2 = jSONObject4.optString("fileId");
                    String strOptString3 = jSONObject4.optString("fileName");
                    C2269l.m6178c("danmuvodindex", strOptString3);
                    String strOptString4 = jSONObject4.optString("thumbnail");
                    JSONArray jSONArray2 = jSONArray;
                    long jOptLong = jSONObject4.optLong("utime");
                    double dOptDouble = jSONObject4.optDouble("fileSize");
                    e eVar2 = new e(strOptString);
                    eVar2.m5509o(strOptString2);
                    eVar2.m5510p(strOptString3);
                    eVar2.m5513s(Double.valueOf(dOptDouble));
                    eVar2.m5511q(strOptString);
                    eVar2.m5512r(Integer.valueOf(iOptInt));
                    eVar2.m5514t(strOptString4);
                    eVar2.m5515u(jOptLong);
                    if (z2) {
                        if (z) {
                            arrayList.add(eVar2);
                        }
                    } else if (z3) {
                        if (C2149Gf.m5541n(strOptString3)) {
                            eVar2.m5507m(eVar.m5498d());
                            arrayList.add(eVar2);
                        }
                    } else if (C2149Gf.m5542o(C2149Gf.m5538i(strOptString3))) {
                        eVar2.m5508n(C2149Gf.m5538i(strOptString3));
                        arrayList2.add(eVar2);
                    }
                    i2++;
                    jSONArray = jSONArray2;
                    i = 1;
                }
                if (jSONObject3.optBoolean("hasMore")) {
                    m5456L(eVar, arrayList, arrayList2, Integer.valueOf(num.intValue() + 1), z);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m5457g(long j) {
        try {
            Thread.sleep(j);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    private static String m5458p(String str, ArrayList arrayList) {
        ArrayList<e> arrayList2 = new ArrayList();
        String lowerCase = C2149Gf.m5544u(str).toLowerCase();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            String lowerCase2 = C2149Gf.m5544u(eVar.m5498d()).toLowerCase();
            if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                arrayList2.add(eVar);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        StringBuilder sb = new StringBuilder();
        for (e eVar2 : arrayList2) {
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(C2149Gf.m5544u(eVar2.m5498d()));
            sb.append("@@@");
            sb.append(eVar2.m5496b());
            sb.append("@@@");
            sb.append(eVar2.m5497c());
            sb.append("@@@");
            sb.append(eVar2.m5500f());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static C2145G m5459r() {
        return a.f5060a;
    }

    /* JADX INFO: renamed from: r */
    private String m5460r(String str) {
        try {
            return new JSONObject(C2268k.m6164a(m5462v())).optString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: u */
    public static File m5461u() {
        return C2268k.m6166b("free_guangya");
    }

    /* JADX INFO: renamed from: v */
    public static File m5462v() {
        return C2268k.m6166b("/guangya.txt");
    }

    /* JADX INFO: renamed from: x */
    private f m5463x(String str, String str2) {
        d dVar = this.f5051e;
        f fVarM5493a = dVar.m5493a();
        if (fVarM5493a != null && str.equals(fVarM5493a.m5517b())) {
            Long lM5518c = fVarM5493a.m5518c();
            if (lM5518c == null) {
                lM5518c = 0L;
            }
            if (System.currentTimeMillis() <= lM5518c.longValue()) {
                return fVarM5493a;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shareId", str);
            jSONObject.put("code", str2);
            String strM6069h = C2238b.m6069h("https://api.guangyapan.com/userres/v1/get_share_access_token", jSONObject.toString(), m5474w());
            SpiderDebug.log("detailStr:" + strM6069h);
            JSONObject jSONObject2 = new JSONObject(strM6069h);
            if (!jSONObject2.getString("msg").equalsIgnoreCase("success")) {
                return null;
            }
            String string = jSONObject2.getJSONObject("data").getString("accessToken");
            if (C2149Gf.m5534b((CharSequence) string)) {
                return null;
            }
            f fVar = new f();
            fVar.m5519d(string);
            fVar.m5521f(Long.valueOf(System.currentTimeMillis() + 7200000));
            fVar.m5520e(str);
            dVar.m5494b(fVar);
            Init.execute(new RunnableC2151Gi(dVar));
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    private String m5464y(String str, String str2) {
        final String strM5497c;
        String strM5454E;
        try {
            String[] strArrSplit = str.replace("Guangya://", "").split("\\|");
            if (strArrSplit.length < 3) {
                C2256I.m6113i("当前分享资源不支持保存");
                return "";
            }
            String str3 = strArrSplit[2];
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[0];
            if (C2149Gf.m5534b((CharSequence) str3) || "null".equalsIgnoreCase(str3)) {
                C2256I.m6113i("当前分享资源不支持保存");
                return "";
            }
            HashMap<String, String> mapM5472t = m5472t();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("capacity", 1);
            jSONObject.put("name", str5);
            jSONObject.put("parentId", "");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("res", jSONObject2);
            jSONObject2.put("gcid", str3);
            jSONObject2.put("fileSize", Long.parseLong(str4));
            JSONObject jSONObject3 = new JSONObject(C2238b.m6069h("https://api.guangyapan.com/nd.bizuserres.s/v1/get_res_center_token", jSONObject.toString(), mapM5472t));
            if (jSONObject3.getInt("code") != 156) {
                String strOptString = jSONObject3.optString("msg");
                if (strOptString == null) {
                    strOptString = "分享资源保存失败，请稍后再试";
                }
                C2256I.m6113i(strOptString);
                return "";
            }
            ArrayList arrayList = new ArrayList();
            m5456L(new e(""), arrayList, new ArrayList(), 1, true);
            if (arrayList.isEmpty()) {
                C2256I.m6113i("分享资源保存失败，请稍后再试");
                return "";
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strM5497c = "";
                    break;
                }
                e eVar = (e) it.next();
                if (str3.equalsIgnoreCase(eVar.m5499e())) {
                    strM5497c = eVar.m5497c();
                    break;
                }
            }
            if (C2149Gf.m5534b((CharSequence) strM5497c) || (strM5454E = m5454E(strM5497c)) == null) {
                return "";
            }
            C0082a.m820b(new Runnable() { // from class: com.github.catvod.spider.support.b.Gl
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj = this;
                    String str6 = (String) strM5497c;
                    C2145G c2145g = (C2145G) obj;
                    try {
                        c2145g.m5471o(str6);
                        C2145G.m5457g(1000L);
                        c2145g.m5471o(str6);
                    } catch (Exception unused) {
                    }
                }
            });
            return strM5454E;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: F */
    public final C2194e m5465F(String str, String str2) {
        f fVarM5463x = m5463x(str, str2);
        if (fVarM5463x == null) {
            return null;
        }
        String strM5516a = fVarM5463x.m5516a();
        ArrayList<e> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m5455K(strM5516a, new e(""), arrayList, arrayList2, 1, true, false, true);
        Collections.sort(arrayList);
        List listAsList = Arrays.asList("光鸭原画");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (e eVar : arrayList) {
            arrayList3.add(eVar.m5495a() + "$" + str + Marker.ANY_NON_NULL_MARKER + eVar.m5497c() + Marker.ANY_NON_NULL_MARKER + eVar.m5500f() + Marker.ANY_NON_NULL_MARKER + eVar.m5501g() + Marker.ANY_NON_NULL_MARKER + str2 + m5458p(eVar.m5498d(), arrayList2));
            this.f5049c.put(eVar.m5497c(), eVar.m5498d());
        }
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList4.add(TextUtils.join("#", arrayList3));
        }
        C2153Gk c2153GkM5452C = m5452C(str);
        C2194e c2194e = new C2194e();
        c2194e.m5848j(str);
        c2194e.m5850l("https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260625/kqrL/1200X800/guangya.jpg/webp");
        c2194e.m5849k(c2153GkM5452C != null ? c2153GkM5452C.m5548d() : "");
        c2194e.m5852n(TextUtils.join("$$$", arrayList4));
        c2194e.m5851m(TextUtils.join("$$$", listAsList));
        return c2194e;
    }

    /* JADX INFO: renamed from: N */
    public final String m5466N(String[] strArr, String str) {
        if (TextUtils.isEmpty(m5459r().m5468j())) {
            C2256I.m6113i("还未登录光鸭账号,请前往【配置中心】登录");
            return C2192c.m5794l("还未登录光鸭账号,请前往【配置中心】登录");
        }
        String str2 = strArr[0];
        String str3 = strArr[1];
        String str4 = strArr[2];
        String strM5464y = m5464y(strArr[3], "");
        C2192c c2192c = new C2192c();
        c2192c.m5830w(strM5464y);
        c2192c.m5806a(Proxy.getUrl() + "?do=danmu&site=wangpan");
        c2192c.m5812e((Map) m5474w());
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: P */
    public final void m5467P() {
        b bVar = this.f5050d;
        try {
            c cVarM5477b = bVar.m5477b();
            String strM5482c = cVarM5477b.m5482c();
            if (C2149Gf.m5534b((CharSequence) strM5482c)) {
                return;
            }
            if (System.currentTimeMillis() / 1000 < cVarM5477b.m5481b().longValue()) {
                return;
            }
            SpiderDebug.log("光鸭token已过期，准备刷新");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", f5046o);
            jSONObject.put("grant_type", "refresh_token");
            jSONObject.put("refresh_token", strM5482c);
            String string = jSONObject.toString();
            HashMap<String, String> mapM5474w = m5474w();
            String strM5485f = cVarM5477b.m5485f();
            if (C2146Ga.m5525d(strM5485f)) {
                mapM5474w.put("User-Agent", strM5485f);
            }
            String strM6069h = C2238b.m6069h("https://account.guangyapan.com/v1/auth/token", string, mapM5474w);
            if (C2149Gf.m5534b((CharSequence) strM6069h)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(strM6069h);
            if (jSONObject2.has("error")) {
                SpiderDebug.log("光鸭token已过期，请重新扫码");
                return;
            }
            String string2 = jSONObject2.getString("token_type");
            String string3 = jSONObject2.getString("access_token");
            String string4 = jSONObject2.getString("refresh_token");
            String string5 = jSONObject2.getString("sub");
            long j = jSONObject2.getLong("expires_in");
            if (!C2146Ga.m5525d(string2) || !C2146Ga.m5525d(string3)) {
                C2256I.m6113i("光鸭token已过期，请重新扫码");
                return;
            }
            c cVarM5477b2 = bVar.m5477b();
            if (cVarM5477b2 == null) {
                cVarM5477b2 = new c();
            }
            cVarM5477b2.m5491l(string2);
            cVarM5477b2.m5486g(string3);
            cVarM5477b2.m5489j(string4);
            cVarM5477b2.m5490k(string5);
            cVarM5477b2.m5488i(Long.valueOf(j));
            cVarM5477b2.m5487h(Long.valueOf(((System.currentTimeMillis() / 1000) + j) - 1800));
            bVar.m5479e(cVarM5477b2);
            Init.execute(new RunnableC2148Gc(bVar));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final String m5468j() {
        String strM5460r = m5460r("token_resp");
        if (TextUtils.isEmpty(strM5460r)) {
            return "";
        }
        try {
            return TextUtils.isEmpty(new JSONObject(strM5460r).optString("access_token")) ? "" : strM5460r;
        } catch (Exception e2) {
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public final String m5469k() {
        return m5460r("deviceid");
    }

    /* JADX INFO: renamed from: l */
    public final String m5470l() {
        String strM5460r = m5460r("token_resp");
        if (TextUtils.isEmpty(strM5460r)) {
            return "";
        }
        try {
            String strOptString = new JSONObject(strM5460r).optString("access_token");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            return "Bearer " + strOptString;
        } catch (Exception e2) {
            return "";
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5471o(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("fileIds", jSONArray);
        SpiderDebug.log("删除文件响应信息=" + C2238b.m6069h("https://api.guangyapan.com/userres/v1/file/delete_file", jSONObject.toString(), m5472t()));
    }

    /* JADX INFO: renamed from: t */
    public final HashMap<String, String> m5472t() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36");
        map.put("Referer", "https://www.guangyapan.com/");
        map.put("Origin", "https://www.guangyapan.com");
        map.put("X-Client-Id", f5046o);
        map.put("X-Device-Id", m5469k());
        map.put("Authorization", m5470l());
        SpiderDebug.log("auth headers>>>>" + map);
        return map;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5473t(String str) {
        C2209y c2209y;
        try {
            if (TextUtils.isEmpty(str) || (c2209y = (C2209y) new Gson().fromJson(str, C2209y.class)) == null || !c2209y.m5925d()) {
                return false;
            }
            HashMap map = new HashMap();
            map.put("Authorization", c2209y.m5922a());
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36 Edg/147.0.0.0");
            String strM6073l = C2238b.m6073l("https://account.guangyapan.com/v1/user/me", map);
            String strOptString = null;
            if (!TextUtils.isEmpty(strM6073l)) {
                JSONObject jSONObject = new JSONObject(strM6073l);
                c2209y.m5928k(jSONObject.optString("sub"));
                strOptString = jSONObject.optString("name");
            }
            c2209y.m5929p((System.currentTimeMillis() / 1000) + 7200);
            String strM5926e = c2209y.m5926e();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("token_resp", new JSONObject(strM5926e));
            if (!TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("username", strOptString);
            }
            C2268k.m6168c(C2268k.m6166b("/guangya.txt"), jSONObject2.toString());
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public final HashMap<String, String> m5474w() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36");
        map.put("Referer", "https://www.guangyapan.com/");
        map.put("Origin", "https://www.guangyapan.com");
        map.put("X-Client-Id", f5046o);
        map.put("X-Device-Id", this.f5052f);
        SpiderDebug.log("headers>>>>" + map);
        return map;
    }
}
