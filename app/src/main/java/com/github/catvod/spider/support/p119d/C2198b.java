package com.github.catvod.spider.support.p119d;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p117b.RunnableC2172f;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p119d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2198b {

    /* JADX INFO: renamed from: a */
    @SerializedName("user")
    private C2208l f5339a;

    /* JADX INFO: renamed from: b */
    @SerializedName("oauth")
    private C2204h f5340b;

    /* JADX INFO: renamed from: c */
    @SerializedName("drive")
    private C2202f f5341c;

    /* JADX INFO: renamed from: d */
    @SerializedName("signature")
    private String f5342d;

    /* JADX INFO: renamed from: a */
    public final C2202f m5868a() {
        C2202f c2202f = this.f5341c;
        return c2202f == null ? new C2202f() : c2202f;
    }

    /* JADX INFO: renamed from: b */
    public final C2204h m5869b() {
        C2204h c2204h = this.f5340b;
        return c2204h == null ? new C2204h() : c2204h;
    }

    /* JADX INFO: renamed from: c */
    public final C2208l m5870c() {
        C2208l c2208l = this.f5339a;
        return c2208l == null ? new C2208l() : c2208l;
    }

    /* JADX INFO: renamed from: d */
    public final void m5871d() {
        Init.run(new RunnableC2172f(this, 1));
    }

    /* JADX INFO: renamed from: e */
    public final void m5872e(C2202f c2202f) {
        this.f5341c = c2202f;
        m5871d();
    }

    /* JADX INFO: renamed from: f */
    public final void m5873f(C2204h c2204h) {
        this.f5340b = c2204h;
        m5871d();
    }

    /* JADX INFO: renamed from: g */
    public final void m5874g(C2208l c2208l) {
        this.f5339a = c2208l;
        m5871d();
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
