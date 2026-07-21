package com.github.catvod.spider.support.p044FM.p077d;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p073b.RunnableC1731b;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p077d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1773b {

    /* JADX INFO: renamed from: a */
    @SerializedName("user")
    private C1786o f3949a;

    /* JADX INFO: renamed from: b */
    @SerializedName("oauth")
    private C1779h f3950b;

    /* JADX INFO: renamed from: c */
    @SerializedName("drive")
    private C1777f f3951c;

    /* JADX INFO: renamed from: a */
    public final C1777f m4232a() {
        C1777f c1777f = this.f3951c;
        return c1777f == null ? new C1777f() : c1777f;
    }

    /* JADX INFO: renamed from: b */
    public final C1779h m4233b() {
        C1779h c1779h = this.f3950b;
        return c1779h == null ? new C1779h() : c1779h;
    }

    /* JADX INFO: renamed from: c */
    public final C1786o m4234c() {
        C1786o c1786o = this.f3949a;
        return c1786o == null ? new C1786o() : c1786o;
    }

    /* JADX INFO: renamed from: d */
    public final void m4235d() {
        Init.execute(new RunnableC1731b(this, 3));
    }

    /* JADX INFO: renamed from: e */
    public final void m4236e(C1777f c1777f) {
        this.f3951c = c1777f;
        m4235d();
    }

    /* JADX INFO: renamed from: f */
    public final void m4237f(C1779h c1779h) {
        this.f3950b = c1779h;
        m4235d();
    }

    /* JADX INFO: renamed from: g */
    public final void m4238g(C1786o c1786o) {
        this.f3949a = c1786o;
        m4235d();
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
