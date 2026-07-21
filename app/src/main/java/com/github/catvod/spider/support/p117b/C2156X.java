package com.github.catvod.spider.support.p117b;

import android.app.AlertDialog;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.merge.b.Xd;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p116a.C2137a;
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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.X */
/* JADX INFO: loaded from: classes.dex */
public final class C2156X {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f5119o = 0;

    /* JADX INFO: renamed from: a */
    private AlertDialog f5120a;

    /* JADX INFO: renamed from: b */
    private ScheduledExecutorService f5121b;

    /* JADX INFO: renamed from: c */
    public b f5122c;

    /* JADX INFO: renamed from: d */
    private final d f5123d;

    /* JADX INFO: renamed from: e */
    private final String f5124e;

    /* JADX INFO: renamed from: f */
    private final String f5125f = "com.xunlei.downloadprovider";

    /* JADX INFO: renamed from: g */
    private final String f5126g = "8.31.0.9726";

    /* JADX INFO: renamed from: h */
    private final ArrayList f5127h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private final HashMap f5128i = new HashMap();

    /* JADX INFO: renamed from: j */
    private final HashMap f5129j = new HashMap();

    /* JADX INFO: renamed from: k */
    private final HashMap f5130k;

    /* JADX INFO: renamed from: l */
    private final HashMap f5131l;

    /* JADX INFO: renamed from: n */
    private static final String f5118n = "Xp6vsxz_7IYVw2BB";

    /* JADX INFO: renamed from: m */
    private static final Integer f5117m = 200;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.X$a */
    final class a {

        /* JADX INFO: renamed from: a */
        static volatile C2156X f5132a = new C2156X();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.X$b */
    public final class b {

        /* JADX INFO: renamed from: a */
        @SerializedName("username")
        private String f5133a;

        /* JADX INFO: renamed from: b */
        @SerializedName("password")
        private String f5134b;

        /* JADX INFO: renamed from: c */
        @SerializedName("captcha_token")
        private String f5135c;

        /* JADX INFO: renamed from: d */
        @SerializedName("deviceid")
        private String f5136d;

        /* JADX INFO: renamed from: e */
        @SerializedName("invite_code")
        private String f5137e;

        /* JADX INFO: renamed from: f */
        @SerializedName("token_resp")
        private c f5138f;

        /* JADX INFO: renamed from: g */
        @SerializedName("pdir_fid")
        private String f5139g;

        /* JADX INFO: renamed from: h */
        @SerializedName("drive_about")
        private String f5140h;

        /* JADX INFO: renamed from: i */
        @SerializedName("vip_expire")
        private String f5141i;

        /* JADX INFO: renamed from: c */
        public static void m5580c(final String str) {
            Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.b.Xg
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj = str;
                    C2156X.m5559m().getClass();
                    C2268k.m6173i(C2156X.m5565x(), (String) obj);
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public final String m5581a() {
            return this.f5136d;
        }

        /* JADX INFO: renamed from: b */
        public final c m5582b() {
            return this.f5138f;
        }

        /* JADX INFO: renamed from: d */
        public final void m5583d(String str) {
            this.f5136d = str;
        }

        /* JADX INFO: renamed from: e */
        public final void m5584e(c cVar) {
            this.f5138f = cVar;
        }

        /* JADX INFO: renamed from: f */
        public final String m5585f() {
            return this.f5133a;
        }

        /* JADX INFO: renamed from: g */
        public final void m5586g(String str) {
            this.f5133a = str;
        }

        public final String toString() {
            return new GsonBuilder().disableHtmlEscaping().create().toJson(this);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.X$c */
    public final class c {

        /* JADX INFO: renamed from: a */
        @SerializedName("token_type")
        private String f5142a;

        /* JADX INFO: renamed from: b */
        @SerializedName("access_token")
        private String f5143b;

        /* JADX INFO: renamed from: c */
        @SerializedName("refresh_token")
        private String f5144c;

        /* JADX INFO: renamed from: d */
        @SerializedName("expires_in")
        private Long f5145d;

        /* JADX INFO: renamed from: e */
        @SerializedName("sub")
        private String f5146e;

        /* JADX INFO: renamed from: f */
        @SerializedName("expires_end")
        private Long f5147f;

        /* JADX INFO: renamed from: g */
        @SerializedName("expires_at")
        private String f5148g;

        /* JADX INFO: renamed from: h */
        @SerializedName("ua")
        private String f5149h;

        /* JADX INFO: renamed from: a */
        public final String m5587a() {
            return this.f5143b;
        }

        /* JADX INFO: renamed from: b */
        public final Long m5588b() {
            return this.f5147f;
        }

        /* JADX INFO: renamed from: c */
        public final String m5589c() {
            return this.f5144c;
        }

        /* JADX INFO: renamed from: d */
        public final String m5590d() {
            return this.f5146e;
        }

        /* JADX INFO: renamed from: e */
        public final String m5591e() {
            return this.f5142a;
        }

        /* JADX INFO: renamed from: f */
        public final String m5592f() {
            return this.f5149h;
        }

        /* JADX INFO: renamed from: g */
        public final void m5593g(String str) {
            this.f5143b = str;
        }

        /* JADX INFO: renamed from: h */
        public final void m5594h(Long l) {
            this.f5147f = l;
        }

        /* JADX INFO: renamed from: i */
        public final void m5595i(Long l) {
            this.f5145d = l;
            Pattern pattern = C2161Xf.f5172a;
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(13, l.intValue());
            this.f5148g = C2161Xf.f5176e.format(calendar.getTime());
        }

        /* JADX INFO: renamed from: j */
        public final void m5596j(String str) {
            this.f5144c = str;
        }

        /* JADX INFO: renamed from: k */
        public final void m5597k(String str) {
            this.f5146e = str;
        }

        /* JADX INFO: renamed from: l */
        public final void m5598l(String str) {
            this.f5142a = str;
        }

        /* JADX INFO: renamed from: m */
        public final void m5599m(String str) {
            this.f5149h = str;
        }

        public final String toString() {
            return new GsonBuilder().disableHtmlEscaping().create().toJson(this);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.X$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        @SerializedName("passCodeToken")
        private f f5150a;

        /* JADX INFO: renamed from: a */
        public final f m5600a() {
            return this.f5150a;
        }

        /* JADX INFO: renamed from: b */
        public final void m5601b(f fVar) {
            this.f5150a = fVar;
        }

        public final String toString() {
            return new GsonBuilder().disableHtmlEscaping().create().toJson(this);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.X$e */
    public final class e implements Comparable<e> {

        /* JADX INFO: renamed from: a */
        @SerializedName("kind")
        private String f5151a;

        /* JADX INFO: renamed from: b */
        @SerializedName("id")
        private String f5152b;

        /* JADX INFO: renamed from: c */
        @SerializedName("parent_id")
        private String f5153c;

        /* JADX INFO: renamed from: d */
        @SerializedName("name")
        private String f5154d;

        /* JADX INFO: renamed from: e */
        @SerializedName("size")
        private Double f5155e;

        /* JADX INFO: renamed from: f */
        private String f5156f;

        /* JADX INFO: renamed from: g */
        private String f5157g;

        /* JADX INFO: renamed from: h */
        private String f5158h;

        /* JADX INFO: renamed from: i */
        private String f5159i;

        /* JADX INFO: renamed from: j */
        private String f5160j;

        /* JADX INFO: renamed from: k */
        private String f5161k;

        /* JADX INFO: renamed from: l */
        private String f5162l;

        public e(String str) {
            this.f5152b = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m5602a() {
            if (!C2157Xa.m5637e(this.f5156f)) {
                return TextUtils.join("", Arrays.asList(this.f5154d, m5611j())).trim().replace("$", "").replace("#", "");
            }
            String strM5611j = m5611j();
            return TextUtils.join("", Arrays.asList("[", this.f5156f.replaceAll("\\{[^{}]*\\}|\\[[^\\[\\]]*\\]|\\([^()]*\\)|（[^（）]*）", ""), "]", this.f5154d, strM5611j)).trim().replace("$", "").replace("#", "");
        }

        /* JADX INFO: renamed from: b */
        public final String m5603b() {
            return this.f5157g;
        }

        /* JADX INFO: renamed from: c */
        public final String m5604c() {
            return this.f5152b;
        }

        @Override // java.lang.Comparable
        public final int compareTo(e eVar) {
            return m5612k().compareTo(eVar.m5612k());
        }

        /* JADX INFO: renamed from: d */
        public final String m5605d() {
            return this.f5160j;
        }

        /* JADX INFO: renamed from: e */
        public final String m5606e() {
            return this.f5151a;
        }

        /* JADX INFO: renamed from: f */
        public final String m5607f() {
            return this.f5161k;
        }

        /* JADX INFO: renamed from: g */
        public final String m5608g() {
            return this.f5154d;
        }

        /* JADX INFO: renamed from: h */
        public final String m5609h() {
            return this.f5153c;
        }

        /* JADX INFO: renamed from: i */
        public final String m5610i() {
            return "Thunder://" + this.f5154d + "|" + String.format("%.0f", this.f5155e) + "|" + this.f5158h;
        }

        /* JADX INFO: renamed from: j */
        public final String m5611j() {
            if (this.f5155e.doubleValue() == 0.0d) {
                return "";
            }
            return "[" + C2161Xf.m5647l(this.f5155e.doubleValue()) + "]";
        }

        /* JADX INFO: renamed from: k */
        public final String m5612k() {
            return C2157Xa.m5637e(this.f5156f) ? TextUtils.join(" ", Arrays.asList(this.f5156f, C2161Xf.m5645h(this.f5154d))).trim() : TextUtils.join(" ", Collections.singletonList(C2161Xf.m5645h(this.f5154d))).trim();
        }

        /* JADX INFO: renamed from: l */
        public final String m5613l() {
            return this.f5159i;
        }

        /* JADX INFO: renamed from: m */
        public final void m5614m(String str) {
            this.f5156f = str;
        }

        /* JADX INFO: renamed from: n */
        public final void m5615n(String str) {
            this.f5157g = str;
        }

        /* JADX INFO: renamed from: o */
        public final void m5616o(String str) {
            this.f5152b = str;
        }

        /* JADX INFO: renamed from: p */
        public final void m5617p(String str) {
            this.f5158h = str;
        }

        /* JADX INFO: renamed from: q */
        public final void m5618q(String str) {
            this.f5160j = str;
        }

        /* JADX INFO: renamed from: r */
        public final void m5619r(String str) {
            this.f5151a = str;
        }

        /* JADX INFO: renamed from: s */
        public final void m5620s(String str) {
            this.f5161k = str;
        }

        /* JADX INFO: renamed from: t */
        public final void m5621t(String str) {
            this.f5154d = str;
        }

        /* JADX INFO: renamed from: u */
        public final void m5622u(String str) {
            this.f5153c = str;
        }

        /* JADX INFO: renamed from: v */
        public final void m5623v(Double d) {
            this.f5155e = d;
        }

        /* JADX INFO: renamed from: w */
        public final void m5624w(String str) {
            this.f5159i = str;
        }

        /* JADX INFO: renamed from: x */
        public final String m5625x() {
            return this.f5162l;
        }

        /* JADX INFO: renamed from: y */
        public final void m5626y(String str) {
            this.f5162l = str;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.b.X$f */
    public final class f {

        /* JADX INFO: renamed from: a */
        @SerializedName("pass_code_token")
        private String f5163a;

        /* JADX INFO: renamed from: b */
        private String f5164b;

        /* JADX INFO: renamed from: c */
        private Long f5165c;

        /* JADX INFO: renamed from: a */
        public final String m5627a() {
            return this.f5163a;
        }

        /* JADX INFO: renamed from: b */
        public final String m5628b() {
            return this.f5164b;
        }

        /* JADX INFO: renamed from: c */
        public final Long m5629c() {
            return this.f5165c;
        }

        /* JADX INFO: renamed from: d */
        public final void m5630d(String str) {
            this.f5163a = str;
        }

        /* JADX INFO: renamed from: e */
        public final void m5631e(String str) {
            this.f5164b = str;
        }

        /* JADX INFO: renamed from: f */
        public final void m5632f(Long l) {
            this.f5165c = l;
        }
    }

    public C2156X() {
        final b bVar;
        d dVar = (d) new GsonBuilder().disableHtmlEscaping().create().fromJson(C2268k.m6164a(m5560p()), d.class);
        this.f5123d = dVar == null ? new d() : dVar;
        try {
            bVar = (b) new Gson().fromJson(C2268k.m6164a(m5565x()), b.class);
        } catch (Exception unused) {
            bVar = null;
        }
        bVar = bVar == null ? new b() : bVar;
        this.f5122c = bVar;
        String strM5581a = bVar.m5581a();
        if (!C2157Xa.m5637e(strM5581a)) {
            strM5581a = C2158Xb.m5644b("a0A0b1B2c1C3d2D1e3E2f4F3g5G7h4H6i5Ij4J9k5K6l6Lm7M7n8N8o9Op0PqQrRsStTuUv9VwWxXy8YzZ").toLowerCase();
            bVar.m5583d(strM5581a);
            Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.b.Xc
                @Override // java.lang.Runnable
                public final void run() {
                    C2156X.b bVar2 = (C2156X.b) bVar;
                    C2156X.m5559m().getClass();
                    C2268k.m6173i(C2156X.m5565x(), bVar2.toString());
                }
            });
        }
        this.f5124e = strM5581a;
        this.f5127h.add("9uJNVj/wLmdwKrJaVj/omlQ");
        this.f5127h.add("Oz64Lp0GigmChHMf/6TNfxx7O9PyopcczMsnf");
        this.f5127h.add("Eb+L7Ce+Ej48u");
        this.f5127h.add("jKY0");
        this.f5127h.add("ASr0zCl6v8W4aidjPK5KHd1Lq3t+vBFf41dqv5+fnOd");
        this.f5127h.add("wQlozdg6r1qxh0eRmt3QgNXOvSZO6q/GXK");
        this.f5127h.add("gmirk+ciAvIgA/cxUUCema47jr/YToixTT+Q6O");
        this.f5127h.add("5IiCoM9B1/788ntB");
        this.f5127h.add("P07JH0h6qoM6TSUAK2aL9T5s2QBVeY9JWvalf");
        this.f5127h.add("+oK0AN");
        this.f5130k = new HashMap();
        this.f5131l = new HashMap();
        final b bVar2 = this.f5122c;
        try {
            c cVarM5582b = bVar2.m5582b();
            String strM5589c = cVarM5582b.m5589c();
            if (C2157Xa.m5635c(strM5589c)) {
                return;
            }
            if (System.currentTimeMillis() / 1000 < cVarM5582b.m5588b().longValue()) {
                return;
            }
            SpiderDebug.log("迅雷token已过期，准备刷新");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_id", f5118n);
            jSONObject.put("grant_type", "refresh_token");
            jSONObject.put("refresh_token", strM5589c);
            String string = jSONObject.toString();
            HashMap<String, String> mapM5578r = m5578r();
            String strM5592f = cVarM5582b.m5592f();
            if (C2157Xa.m5637e(strM5592f)) {
                mapM5578r.put("User-Agent", strM5592f);
            }
            String strM6069h = C2238b.m6069h("https://xluser-ssl.xunlei.com/v1/auth/token", string, mapM5578r);
            if (C2157Xa.m5635c(strM6069h)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(strM6069h);
            if (jSONObject2.has("error")) {
                SpiderDebug.log("迅雷token已过期，请重新扫码");
                return;
            }
            String string2 = jSONObject2.getString("token_type");
            String string3 = jSONObject2.getString("access_token");
            String string4 = jSONObject2.getString("refresh_token");
            String string5 = jSONObject2.getString("sub");
            long j = jSONObject2.getLong("expires_in");
            String strOptString = jSONObject2.optString("name");
            if (!C2157Xa.m5637e(string2) || !C2157Xa.m5637e(string3)) {
                C2256I.m6113i("迅雷token已过期，请重新扫码");
                return;
            }
            c cVarM5582b2 = bVar2.m5582b();
            cVarM5582b2 = cVarM5582b2 == null ? new c() : cVarM5582b2;
            cVarM5582b2.m5598l(string2);
            cVarM5582b2.m5593g(string3);
            cVarM5582b2.m5596j(string4);
            cVarM5582b2.m5597k(string5);
            cVarM5582b2.m5595i(Long.valueOf(j));
            cVarM5582b2.m5594h(Long.valueOf(((System.currentTimeMillis() / 1000) + j) - 1800));
            if (C2157Xa.m5637e(strOptString)) {
                bVar2.m5586g(strOptString);
            }
            bVar2.m5584e(cVarM5582b2);
            Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.b.Xc
                @Override // java.lang.Runnable
                public final void run() {
                    C2156X.b bVar3 = (C2156X.b) bVar2;
                    C2156X.m5559m().getClass();
                    C2268k.m6173i(C2156X.m5565x(), bVar3.toString());
                }
            });
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: G */
    private void m5557G(String str, String str2, e eVar, ArrayList arrayList, ArrayList arrayList2, String str3, boolean z, boolean z2) {
        int i = 0;
        try {
            String strM5575l = m5575l(m5570i("GET:/drive/v1/share/detail"));
            if (C2157Xa.m5635c(strM5575l)) {
                return;
            }
            HashMap<String, String> mapM5578r = m5578r();
            mapM5578r.put("x-captcha-token", strM5575l);
            String strM6073l = C2238b.m6073l(String.format("https://api-pan.xunlei.com/drive/v1/share/detail?limit=%s&thumbnail_size=SIZE_LARGE&share_id=%s&parent_id=%s&page_token=%s&pass_code_token=%s", f5117m, str, eVar.m5604c(), str3, URLEncoder.encode(str2)), mapM5578r);
            SpiderDebug.log("detailStr:" + strM6073l);
            JSONObject jSONObject = new JSONObject(strM6073l);
            if (jSONObject.has("error")) {
                C0082a.m820b(new RunnableC2160Xd(jSONObject, 0));
                return;
            }
            if (!jSONObject.getString("share_status").equalsIgnoreCase("OK")) {
                C0082a.m820b(new RunnableC2160Xd(jSONObject, 2));
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("files");
            ArrayList arrayList3 = new ArrayList();
            while (i < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                jSONObject2.optString("mime_type");
                String strOptString = jSONObject2.optString("kind");
                boolean zContains = strOptString.contains("folder");
                boolean zContains2 = strOptString.contains("file");
                String strOptString2 = jSONObject2.optString("parent_id");
                String strOptString3 = jSONObject2.optString("id");
                String strOptString4 = jSONObject2.optString("name");
                String strOptString5 = jSONObject2.optString("hash");
                JSONArray jSONArray2 = jSONArray;
                String strOptString6 = jSONObject2.optString("thumbnail_link");
                String strOptString7 = jSONObject2.optString("icon_link");
                JSONObject jSONObject3 = jSONObject;
                String strOptString8 = jSONObject2.optString("modified_time");
                int i2 = i;
                double d2 = jSONObject2.getDouble("size");
                e eVar2 = new e(strOptString2);
                eVar2.m5616o(strOptString3);
                eVar2.m5621t(strOptString4);
                eVar2.m5623v(Double.valueOf(d2));
                eVar2.m5622u(strOptString2);
                eVar2.m5617p(strOptString5);
                eVar2.m5619r(strOptString);
                eVar2.m5624w(strOptString6);
                eVar2.m5618q(strOptString7);
                eVar2.m5620s(strOptString8);
                if (zContains) {
                    eVar2.m5626y(strOptString4);
                    if (z2) {
                        arrayList.add(eVar2);
                    }
                    if (z) {
                        arrayList3.add(eVar2);
                    }
                } else if (zContains2) {
                    if (C2161Xf.m5648m(strOptString4)) {
                        eVar2.m5626y(eVar.m5625x());
                        eVar2.m5614m(eVar.m5608g());
                        arrayList.add(eVar2);
                    }
                } else if (C2161Xf.m5649n(C2161Xf.m5646i(strOptString4))) {
                    eVar2.m5615n(C2161Xf.m5646i(strOptString4));
                    arrayList2.add(eVar2);
                }
                i = i2 + 1;
                jSONArray = jSONArray2;
                jSONObject = jSONObject3;
            }
            JSONObject jSONObject4 = jSONObject;
            if (C2157Xa.m5637e(jSONObject4.getString("next_page_token"))) {
                m5557G(str, str2, eVar, arrayList, arrayList2, jSONObject4.getString("next_page_token"), z, z2);
            }
            if (z) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    m5557G(str, str2, (e) it.next(), arrayList, arrayList2, "", z, z2);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    private static String m5558k(String str, ArrayList arrayList) {
        ArrayList<e> arrayList2 = new ArrayList();
        String lowerCase = C2161Xf.m5651s(str).toLowerCase();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            String lowerCase2 = C2161Xf.m5651s(eVar.m5608g()).toLowerCase();
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
            sb.append(C2161Xf.m5651s(eVar2.m5608g()));
            sb.append("@@@");
            sb.append(eVar2.m5603b());
            sb.append("@@@");
            sb.append(eVar2.m5604c());
            sb.append("@@@");
            sb.append(eVar2.m5609h());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static C2156X m5559m() {
        return a.f5132a;
    }

    /* JADX INFO: renamed from: p */
    public static File m5560p() {
        return C2268k.m6166b("free_thunder");
    }

    /* JADX INFO: renamed from: r */
    private String m5561r(String str) {
        try {
            return new JSONObject(C2268k.m6164a(m5565x())).optString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: s */
    private f m5562s(String str, String str2) {
        final d dVar = this.f5123d;
        f fVarM5600a = dVar.m5600a();
        if (fVarM5600a != null && str.equals(fVarM5600a.m5628b())) {
            Long lM5629c = fVarM5600a.m5629c();
            if (lM5629c == null) {
                lM5629c = 0L;
            }
            if (System.currentTimeMillis() <= lM5629c.longValue()) {
                return fVarM5600a;
            }
        }
        try {
            String strM5575l = m5575l(m5570i("GET:/drive/v1/share"));
            if (C2157Xa.m5635c(strM5575l)) {
                return null;
            }
            HashMap<String, String> mapM5578r = m5578r();
            mapM5578r.put("x-captcha-token", strM5575l);
            String strM6073l = C2238b.m6073l(String.format("https://api-pan.xunlei.com/drive/v1/share?limit=%s&thumbnail_size=SIZE_LARGE&share_id=%s&parent_id=%s&page_token=%s&pass_code=%s", f5117m, str, "", "", str2), mapM5578r);
            SpiderDebug.log("detailStr:" + strM6073l);
            JSONObject jSONObject = new JSONObject(strM6073l);
            if (jSONObject.has("error")) {
                C0082a.m820b(new RunnableC2160Xd(jSONObject, 0));
                return null;
            }
            if (!jSONObject.getString("share_status").equalsIgnoreCase("OK")) {
                C0082a.m820b(new RunnableC2160Xd(jSONObject, 1));
                return null;
            }
            String string = jSONObject.getString("pass_code_token");
            if (C2157Xa.m5635c(string)) {
                return null;
            }
            f fVar = new f();
            fVar.m5630d(string);
            fVar.m5632f(Long.valueOf(System.currentTimeMillis() + 7200000));
            fVar.m5631e(str);
            dVar.m5601b(fVar);
            Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.b.Xi
                @Override // java.lang.Runnable
                public final void run() {
                    C2156X.d dVar2 = (C2156X.d) dVar;
                    dVar2.getClass();
                    C2156X.m5559m().getClass();
                    C2268k.m6173i(C2156X.m5560p(), dVar2.toString());
                }
            });
            return fVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    private String m5563u(String str, String str2) {
        try {
            String strM5575l = m5575l(m5570i("GET:/drive/v1/tasks/" + str));
            if (C2157Xa.m5635c(strM5575l)) {
                return null;
            }
            HashMap<String, String> mapM5576o = m5576o();
            mapM5576o.put("x-captcha-token", strM5575l);
            String strM6073l = C2238b.m6073l("https://api-pan.xunlei.com/drive/v1/tasks/" + str, mapM5576o);
            SpiderDebug.log("taskStr:" + strM6073l);
            JSONObject jSONObject = new JSONObject(strM6073l);
            if (jSONObject.getString("phase").equalsIgnoreCase("PHASE_TYPE_COMPLETE")) {
                return new JSONObject(jSONObject.getJSONObject("params").getString("trace_file_ids")).getString(str2);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    private String m5564v(String str, String str2, String str3) {
        try {
            f fVarM5562s = m5562s(str, str3);
            if (fVarM5562s == null) {
                return null;
            }
            String strM5627a = fVarM5562s.m5627a();
            String strM5575l = m5575l(m5570i("POST:/drive/v1/share/restore"));
            if (C2157Xa.m5635c(strM5575l)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pass_code_token", strM5627a);
            jSONObject.put("share_id", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str2);
            jSONObject.put("file_ids", jSONArray);
            jSONObject.put("parent_id", "");
            jSONObject.put("specify_parent_id", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("trace_file_ids", str2);
            jSONObject.put("params", jSONObject2);
            jSONObject.put("ancestor_ids", new JSONArray());
            String string = jSONObject.toString();
            HashMap<String, String> mapM5576o = m5576o();
            mapM5576o.put("x-captcha-token", strM5575l);
            String strM6069h = C2238b.m6069h("https://api-pan.xunlei.com/drive/v1/share/restore", string, mapM5576o);
            SpiderDebug.log("restoreStr:" + strM6069h);
            JSONObject jSONObject3 = new JSONObject(strM6069h);
            if (jSONObject3.has("error")) {
                C0082a.m820b((Runnable) new Xd(jSONObject3, 0));
                return null;
            }
            if (jSONObject3.getString("share_status").equalsIgnoreCase("OK")) {
                return jSONObject3.getString("restore_task_id");
            }
            C0082a.m820b(new RunnableC2160Xd(jSONObject3, 1));
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public static File m5565x() {
        return C2268k.m6166b("/xunlei.txt");
    }

    /* JADX INFO: renamed from: z */
    private String m5566z(String str) {
        try {
            JSONObject jSONObject = new JSONObject(m5568F(str));
            if (jSONObject.has("error")) {
                return null;
            }
            if (jSONObject.has("name")) {
                C2269l.m6178c("danmuvodindex", jSONObject.getString("name"));
            }
            return jSONObject.getString("web_content_link");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final C2194e m5567A(String str, String str2) {
        f fVarM5562s = m5562s(str, str2);
        if (fVarM5562s == null) {
            return null;
        }
        String strM5627a = fVarM5562s.m5627a();
        ArrayList<e> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m5557G(str, strM5627a, new e(""), arrayList, arrayList2, "", true, false);
        Collections.sort(arrayList);
        List listAsList = Arrays.asList("迅雷原画");
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String strM5625x = "";
        for (e eVar : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append(eVar.m5602a());
            sb.append("$");
            sb.append(str);
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(eVar.m5604c());
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(eVar.m5609h());
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(eVar.m5610i());
            sb.append(Marker.ANY_NON_NULL_MARKER);
            sb.append(str2);
            String strM5608g = eVar.m5608g();
            strM5625x = eVar.m5625x();
            sb.append(m5558k(strM5608g, arrayList2));
            arrayList3.add(sb.toString());
        }
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList4.add(TextUtils.join("#", arrayList3));
        }
        C2194e c2194e = new C2194e();
        c2194e.m5848j(str);
        c2194e.m5850l("https://img.51shazhu.com/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260623/4oPO/1200X800/xunlei.jpg/webp");
        c2194e.m5852n(TextUtils.join("$$$", arrayList4));
        c2194e.m5851m(TextUtils.join("$$$", listAsList));
        c2194e.m5849k(strM5625x);
        return c2194e;
    }

    /* JADX INFO: renamed from: F */
    public final String m5568F(String str) {
        String strM5575l = m5575l(m5570i("GET:/drive/v1/files/" + str));
        if (C2157Xa.m5635c(strM5575l)) {
            return null;
        }
        HashMap<String, String> mapM5576o = m5576o();
        mapM5576o.put("x-captcha-token", strM5575l);
        return C2238b.m6073l("https://api-pan.xunlei.com/drive/v1/files/" + str + "?_magic=2021&usage=PLAY&thumbnail_size=SIZE_LARGE", mapM5576o);
    }

    /* JADX INFO: renamed from: J */
    public final String m5569J(String[] strArr, String str) {
        if (TextUtils.isEmpty(m5559m().m5571j())) {
            C2256I.m6113i("还未登录迅雷账号,请前往【配置中心】登录");
            return C2192c.m5794l("还未登录迅雷账号,请前往【配置中心】登录");
        }
        String str2 = strArr[0];
        String str3 = strArr[1];
        String str4 = strArr[2];
        String str5 = strArr[3];
        String str6 = strArr[4];
        String str7 = Proxy.getUrl() + "?do=danmu&site=wangpan";
        String strM3159a = C1273a.m3159a("xunlei", str2, str3, str6);
        C2192c c2192c = new C2192c();
        c2192c.m5827u(strM3159a);
        c2192c.m5815h();
        c2192c.m5812e((Map) m5578r());
        c2192c.m5806a(str7);
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: i */
    public final JSONObject m5570i(String str) throws JSONException {
        c cVarM5582b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", str);
        String str2 = f5118n;
        jSONObject.put("client_id", str2);
        String str3 = this.f5124e;
        jSONObject.put("device_id", str3);
        JSONObject jSONObject2 = new JSONObject();
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        StringBuilder sbM5396a = C2137a.m5396a(str2);
        String str4 = this.f5126g;
        sbM5396a.append(str4);
        String str5 = this.f5125f;
        sbM5396a.append(str5);
        sbM5396a.append(str3);
        sbM5396a.append(lValueOf);
        String string = sbM5396a.toString();
        Iterator it = this.f5127h.iterator();
        while (it.hasNext()) {
            string = C2256I.m6109a(string + ((String) it.next()));
        }
        jSONObject2.put("captcha_sign", "1." + string);
        jSONObject2.put("client_version", str4);
        jSONObject2.put("package_name", str5);
        jSONObject2.put("timestamp", String.valueOf(lValueOf));
        b bVar = this.f5122c;
        String strM5590d = (bVar == null || (cVarM5582b = bVar.m5582b()) == null) ? null : cVarM5582b.m5590d();
        if (strM5590d == null) {
            strM5590d = "";
        }
        jSONObject2.put("user_id", strM5590d);
        jSONObject.put("meta", jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: j */
    public final String m5571j() {
        String strM5561r = m5561r("token_resp");
        if (TextUtils.isEmpty(strM5561r)) {
            return "";
        }
        try {
            return TextUtils.isEmpty(new JSONObject(strM5561r).optString("access_token")) ? "" : strM5561r;
        } catch (Exception e2) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5572j(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        String string = jSONObject.toString();
        HashMap<String, String> mapM5576o = m5576o();
        String strM5575l = m5575l(m5570i("POST:/drive/v1/files:batchDelete"));
        if (C2157Xa.m5635c(strM5575l)) {
            return;
        }
        mapM5576o.put("x-captcha-token", strM5575l);
        SpiderDebug.log("删除文件响应信息=" + C2238b.m6069h("https://api-pan.xunlei.com/drive/v1/files:batchDelete", string, mapM5576o));
    }

    /* JADX INFO: renamed from: k */
    public final String m5573k() {
        return m5561r("deviceid");
    }

    /* JADX INFO: renamed from: l */
    public final String m5574l() {
        String strM5561r = m5561r("token_resp");
        if (TextUtils.isEmpty(strM5561r)) {
            return "";
        }
        try {
            String strOptString = new JSONObject(strM5561r).optString("access_token");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            return "Bearer " + strOptString;
        } catch (Exception e2) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public final String m5575l(JSONObject jSONObject) {
        Long l;
        try {
            String string = jSONObject.getString("action");
            HashMap map = this.f5128i;
            boolean zContainsKey = map.containsKey(string);
            HashMap map2 = this.f5129j;
            if (zContainsKey && map2.containsKey(string) && (l = (Long) map.get(string)) != null && System.currentTimeMillis() <= l.longValue()) {
                return (String) map2.get(string);
            }
            String strM6069h = C2238b.m6069h("https://xluser-ssl.xunlei.com/v1/shield/captcha/init", jSONObject.toString(), m5578r());
            if (C2157Xa.m5635c(strM6069h)) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject(strM6069h);
            String string2 = jSONObject2.getString("captcha_token");
            map.put(string, Long.valueOf((((long) (jSONObject2.getInt("expires_in") - 30)) * 1000) + System.currentTimeMillis()));
            map2.put(string, string2);
            return string2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public final HashMap<String, String> m5576o() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.31.0.9726 netWorkType/5G appid/40 deviceName/Xiaomi_M2004j7ac deviceModel/M2004J7AC OSVersion/12 protocolVersion/301 platformVersion/10 sdkVersion/512000 Oauth2Client/0.9 (Linux 4_14_186-perf-gddfs8vbb238b) (JAVA 0)");
        map.put("Referer", "https://pan.xunlei.com/");
        map.put("Origin", "https://pan.xunlei.com");
        map.put("X-Client-Id", f5118n);
        map.put("X-Device-Id", m5573k());
        map.put("Authorization", m5574l());
        SpiderDebug.log("auth headers>>>>" + map);
        return map;
    }

    /* JADX INFO: renamed from: q */
    public final String m5577q(String str, String str2, String str3) {
        try {
            String strM5564v = m5564v(str, str2, str3);
            if (C2157Xa.m5635c(strM5564v)) {
                return null;
            }
            final String strM5563u = "";
            for (int i = 50; i >= 0; i--) {
                strM5563u = m5563u(strM5564v, str2);
                if (C2157Xa.m5637e(strM5563u)) {
                    break;
                }
                Thread.sleep(200L);
            }
            if (C2157Xa.m5635c(strM5563u)) {
                return null;
            }
            String strM5566z = m5566z(strM5563u);
            if (strM5566z == null) {
                return "";
            }
            C0082a.m820b(new Runnable() { // from class: com.github.catvod.spider.support.b.Xh
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ((C2156X) this).m5572j((String) strM5563u);
                    } catch (Exception unused) {
                    }
                }
            });
            return strM5566z;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: r */
    public final HashMap<String, String> m5578r() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.31.0.9726 netWorkType/5G appid/40 deviceName/Xiaomi_M2004j7ac deviceModel/M2004J7AC OSVersion/12 protocolVersion/301 platformVersion/10 sdkVersion/512000 Oauth2Client/0.9 (Linux 4_14_186-perf-gddfs8vbb238b) (JAVA 0)");
        map.put("Referer", "https://pan.xunlei.com/");
        map.put("Origin", "https://pan.xunlei.com");
        map.put("X-Client-Id", f5118n);
        map.put("X-Device-Id", this.f5124e);
        SpiderDebug.log("headers>>>>" + map);
        return map;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5579t(String str) {
        C2209y c2209y;
        try {
            if (TextUtils.isEmpty(str) || (c2209y = (C2209y) new Gson().fromJson(str, C2209y.class)) == null || !c2209y.m5925d()) {
                return false;
            }
            HashMap map = new HashMap();
            map.put("Authorization", c2209y.m5922a());
            map.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.31.0.9726 netWorkType/5G appid/40 deviceName/Xiaomi_M2004j7ac deviceModel/M2004J7AC OSVersion/12 protocolVersion/301 platformVersion/10 sdkVersion/512000 Oauth2Client/0.9 (Linux 4_14_186-perf-gddfs8vbb238b) (JAVA 0)");
            String strM6073l = C2238b.m6073l("https://xluser-ssl.xunlei.com/v1/user/me", map);
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
            C2268k.m6168c(C2268k.m6166b("/xunlei.txt"), jSONObject2.toString());
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
