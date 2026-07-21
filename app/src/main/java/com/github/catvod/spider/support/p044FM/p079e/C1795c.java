package com.github.catvod.spider.support.p044FM.p079e;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p075c.C1768j;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.e.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1795c {

    /* JADX INFO: renamed from: a */
    @SerializedName("name")
    private String f4040a;

    /* JADX INFO: renamed from: b */
    @SerializedName(alternate = {"parent"}, value = "path")
    private String f4041b;

    /* JADX INFO: renamed from: c */
    @SerializedName("type")
    private int f4042c;

    /* JADX INFO: renamed from: d */
    @SerializedName("size")
    private long f4043d;

    /* JADX INFO: renamed from: e */
    @SerializedName(alternate = {"thumbnail"}, value = "thumb")
    private String f4044e;

    /* JADX INFO: renamed from: f */
    @SerializedName(alternate = {"raw_url"}, value = "url")
    private String f4045f;

    /* JADX INFO: renamed from: g */
    @SerializedName(alternate = {"updated_at"}, value = "modified")
    private String f4046g;

    /* JADX INFO: renamed from: a */
    public static List<C1795c> m4315a(String str) {
        return (List) new Gson().fromJson(str, new C1794b().getType());
    }

    /* JADX INFO: renamed from: b */
    public final Date m4316b() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(this.f4046g);
        } catch (Exception unused) {
            return new Date();
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m4317c() {
        return TextUtils.isEmpty(this.f4040a) ? "" : this.f4040a;
    }

    /* JADX INFO: renamed from: d */
    public final String m4318d(String str) {
        if ((TextUtils.isEmpty(this.f4044e) ? "" : this.f4044e).isEmpty() && m4325k()) {
            return str;
        }
        return TextUtils.isEmpty(this.f4044e) ? "" : this.f4044e;
    }

    /* JADX INFO: renamed from: e */
    public final long m4319e() {
        return this.f4043d;
    }

    /* JADX INFO: renamed from: f */
    public final String m4320f() {
        if (TextUtils.isEmpty(this.f4045f)) {
            return "";
        }
        if (!this.f4045f.startsWith("//")) {
            return this.f4045f;
        }
        return "http:" + this.f4045f;
    }

    /* JADX INFO: renamed from: g */
    public final C1768j m4321g(C1793a c1793a, String str) {
        return new C1768j(m4323i(c1793a.m4305h()), m4317c(), m4318d(str), c1793a.m4305h(), m4325k());
    }

    /* JADX INFO: renamed from: h */
    public final C1768j m4322h(String str, String str2) {
        return new C1768j(m4323i(str), m4317c(), m4318d(str2), C1885z.m4568g(this.f4043d), m4325k());
    }

    /* JADX INFO: renamed from: i */
    public final String m4323i(String str) {
        StringBuilder sbM3589b = C1434P.m3589b(str);
        sbM3589b.append(TextUtils.isEmpty(this.f4041b) ? "" : this.f4041b);
        sbM3589b.append("/");
        sbM3589b.append(m4317c());
        return sbM3589b.toString();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4324j(boolean z) {
        if (!m4317c().endsWith(".ts") && !m4317c().endsWith(".mpg")) {
            if (z) {
                int i = this.f4042c;
                return i == 0 || i == 4;
            }
            int i2 = this.f4042c;
            if (i2 == 0 || i2 == 2 || i2 == 5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4325k() {
        return this.f4042c == 1;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4326l(boolean z) {
        if (!m4317c().endsWith(".ts") && !m4317c().endsWith(".mpg")) {
            if (z) {
                int i = this.f4042c;
                return i == 2 || i == 3;
            }
            int i2 = this.f4042c;
            if (i2 != 3 && i2 != 4) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m4327m(String str) {
        this.f4040a = str;
    }

    /* JADX INFO: renamed from: n */
    public final void m4328n(String str) {
        this.f4041b = str;
    }

    /* JADX INFO: renamed from: o */
    public final void m4329o(String str) {
        this.f4044e = str;
    }

    /* JADX INFO: renamed from: p */
    public final void m4330p(int i) {
        this.f4042c = i;
    }
}
