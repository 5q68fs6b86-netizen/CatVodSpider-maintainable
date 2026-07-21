package com.github.catvod.spider.support.p012C0.p027d;

import android.text.TextUtils;
import com.github.catvod.spider.support.p012C0.p023b.C1032p;
import com.github.catvod.spider.support.p012C0.p035j.C1244l;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p027d.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1067g {

    /* JADX INFO: renamed from: a */
    @SerializedName("default_drive_id")
    private String f2622a;

    /* JADX INFO: renamed from: b */
    @SerializedName("user_id")
    private String f2623b;

    /* JADX INFO: renamed from: c */
    @SerializedName("token_type")
    private String f2624c;

    /* JADX INFO: renamed from: d */
    @SerializedName("access_token")
    private String f2625d;

    /* JADX INFO: renamed from: e */
    @SerializedName("refresh_token")
    private String f2626e;

    /* JADX INFO: renamed from: f */
    public static C1067g m2789f(String str) {
        C1067g c1067g = (C1067g) new Gson().fromJson(str, C1067g.class);
        return c1067g == null ? new C1067g() : c1067g;
    }

    /* JADX INFO: renamed from: a */
    public final C1067g m2790a() {
        this.f2626e = "";
        this.f2625d = "";
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final String m2791b() {
        return TextUtils.isEmpty(this.f2625d) ? "" : this.f2625d;
    }

    /* JADX INFO: renamed from: c */
    public final String m2792c() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.f2624c) ? "" : this.f2624c);
        sb.append(" ");
        sb.append(TextUtils.isEmpty(this.f2625d) ? "" : this.f2625d);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final String m2793d() {
        return TextUtils.isEmpty(this.f2622a) ? "" : this.f2622a;
    }

    /* JADX INFO: renamed from: e */
    public final String m2794e() {
        return TextUtils.isEmpty(this.f2626e) ? "" : this.f2626e;
    }

    /* JADX INFO: renamed from: g */
    public final C1067g m2795g() {
        C1244l.m3104g(C1032p.m2579o().m2592x(), toString());
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m2796h(String str) {
        this.f2626e = str;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
