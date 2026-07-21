package com.github.catvod.spider.support.p002A0;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.cg */
/* JADX INFO: loaded from: classes.dex */
public class C0175cg {

    /* JADX INFO: renamed from: p */
    @InterfaceC0474ni("name")
    private String f704p;

    /* JADX INFO: renamed from: q */
    @InterfaceC0474ni(alternate = {"parent"}, value = "path")
    private String f705q;

    /* JADX INFO: renamed from: r */
    @InterfaceC0474ni("type")
    private int f706r;

    /* JADX INFO: renamed from: s */
    @InterfaceC0474ni("size")
    private long f707s;

    /* JADX INFO: renamed from: t */
    @InterfaceC0474ni(alternate = {"thumbnail"}, value = "thumb")
    private String f708t;

    /* JADX INFO: renamed from: u */
    @InterfaceC0474ni(alternate = {"raw_url"}, value = "url")
    private String f709u;

    /* JADX INFO: renamed from: v */
    @InterfaceC0474ni(alternate = {"updated_at"}, value = "modified")
    private String f710v;

    /* JADX INFO: renamed from: a */
    public static List m1072a(String str) {
        return (List) new C0493oa().m1477y(str, new C0259fj(new C0797zh().f828b));
    }

    /* JADX INFO: renamed from: b */
    public final Date m1073b() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(this.f710v);
        } catch (Exception unused) {
            return new Date();
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m1074c() {
        return TextUtils.isEmpty(this.f704p) ? "" : this.f704p;
    }

    /* JADX INFO: renamed from: d */
    public final long m1075d() {
        return this.f707s;
    }

    /* JADX INFO: renamed from: e */
    public final String m1076e() {
        if (TextUtils.isEmpty(this.f709u)) {
            return "";
        }
        if (!this.f709u.startsWith("//")) {
            return this.f709u;
        }
        return "http:" + this.f709u;
    }

    /* JADX INFO: renamed from: f */
    public final C0723wo m1077f(C0456mr c0456mr, String str) {
        String strM1079h = m1079h(c0456mr.m1432g());
        String strM1074c = m1074c();
        if (!(TextUtils.isEmpty(this.f708t) ? "" : this.f708t).isEmpty() || !m1081j()) {
            str = TextUtils.isEmpty(this.f708t) ? "" : this.f708t;
        }
        return new C0723wo(strM1079h, strM1074c, str, c0456mr.m1432g(), m1081j());
    }

    /* JADX INFO: renamed from: g */
    public final C0723wo m1078g(String str, String str2) {
        String str3;
        String str4;
        String strM1079h = m1079h(str);
        String strM1074c = m1074c();
        if (!(TextUtils.isEmpty(this.f708t) ? "" : this.f708t).isEmpty() || !m1081j()) {
            str2 = TextUtils.isEmpty(this.f708t) ? "" : this.f708t;
        }
        String str5 = str2;
        double d = this.f707s;
        List list = AbstractC0716wh.f1725a;
        if (d <= 0.0d) {
            str4 = "";
        } else {
            if (d > 1.099511627776E12d) {
                str3 = String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.099511627776E12d), "TB");
            } else if (d > 1.073741824E9d) {
                str3 = String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1.073741824E9d), "GB");
            } else {
                str3 = d > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d / 1024.0d), "KB");
            }
            str4 = str3;
        }
        return new C0723wo(strM1079h, strM1074c, str5, str4, m1081j());
    }

    /* JADX INFO: renamed from: h */
    public final String m1079h(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TextUtils.isEmpty(this.f705q) ? "" : this.f705q);
        sb.append("/");
        sb.append(m1074c());
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1080i(boolean z) {
        if (m1074c().endsWith(".ts") || m1074c().endsWith(".mpg")) {
            return false;
        }
        if (z) {
            int i = this.f706r;
            return i == 0 || i == 4;
        }
        int i2 = this.f706r;
        return i2 == 0 || i2 == 2 || i2 == 5;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1081j() {
        return this.f706r == 1;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1082k(boolean z) {
        if (m1074c().endsWith(".ts") || m1074c().endsWith(".mpg")) {
            return true;
        }
        if (z) {
            int i = this.f706r;
            return i == 2 || i == 3;
        }
        int i2 = this.f706r;
        return i2 == 3 || i2 == 4;
    }

    /* JADX INFO: renamed from: l */
    public final void m1083l(String str) {
        this.f704p = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m1084m(String str) {
        this.f705q = str;
    }

    /* JADX INFO: renamed from: n */
    public final void m1085n(String str) {
        this.f708t = str;
    }

    /* JADX INFO: renamed from: o */
    public final void m1086o(int i) {
        this.f706r = i;
    }
}
