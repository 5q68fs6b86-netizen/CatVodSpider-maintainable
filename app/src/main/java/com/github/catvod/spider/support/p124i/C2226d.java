package com.github.catvod.spider.support.p124i;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.i.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2226d {

    /* JADX INFO: renamed from: a */
    @SerializedName("nickname")
    private String f5569a;

    /* JADX INFO: renamed from: b */
    @SerializedName("member_type")
    private String f5570b;

    /* JADX INFO: renamed from: c */
    @SerializedName("cookie")
    private String f5571c;

    public C2226d() {
    }

    public C2226d(String str) {
        this.f5571c = str;
    }

    /* JADX INFO: renamed from: e */
    public static C2226d m6051e(String str) {
        C2226d c2226d = (C2226d) new Gson().fromJson(str, C2226d.class);
        return c2226d == null ? new C2226d() : c2226d;
    }

    /* JADX INFO: renamed from: a */
    public final String m6052a() {
        return TextUtils.isEmpty(this.f5571c) ? "" : this.f5571c;
    }

    /* JADX INFO: renamed from: b */
    public final String m6053b() {
        return TextUtils.isEmpty(this.f5570b) ? "" : this.f5570b;
    }

    /* JADX INFO: renamed from: c */
    public final String m6054c() {
        return TextUtils.isEmpty(this.f5569a) ? "" : this.f5569a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6055d() {
        return m6052a().length() > 0 && m6053b().length() > 0 && m6054c().length() > 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m6056f(String str) {
        this.f5571c = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m6057g(String str) {
        this.f5570b = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m6058h(String str) {
        this.f5569a = str;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
