package com.github.catvod.spider.support.p012C0.p027d;

import android.text.TextUtils;
import com.github.catvod.spider.support.p012C0.p023b.C1032p;
import com.github.catvod.spider.support.p012C0.p035j.C1244l;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1066f {

    /* JADX INFO: renamed from: a */
    @SerializedName("token_type")
    private String f2619a;

    /* JADX INFO: renamed from: b */
    @SerializedName("access_token")
    private String f2620b;

    /* JADX INFO: renamed from: c */
    @SerializedName("refresh_token")
    private String f2621c;

    /* JADX INFO: renamed from: d */
    public static C1066f m2784d(String str) {
        C1066f c1066f = (C1066f) new Gson().fromJson(str, C1066f.class);
        return c1066f == null ? new C1066f() : c1066f;
    }

    /* JADX INFO: renamed from: a */
    public final C1066f m2785a() {
        this.f2621c = "";
        this.f2620b = "";
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final String m2786b() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.f2619a) ? "" : this.f2619a);
        sb.append(" ");
        sb.append(TextUtils.isEmpty(this.f2620b) ? "" : this.f2620b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public final String m2787c() {
        return TextUtils.isEmpty(this.f2621c) ? "" : this.f2621c;
    }

    /* JADX INFO: renamed from: e */
    public final C1066f m2788e() {
        C1244l.m3104g(C1032p.m2579o().m2589s(), toString());
        return this;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
