package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.rg */
/* JADX INFO: loaded from: classes.dex */
public final class C0580rg {

    /* JADX INFO: renamed from: a */
    public C0589rp f1438a;

    /* JADX INFO: renamed from: b */
    public boolean f1439b = false;

    /* JADX INFO: renamed from: c */
    public C0580rg f1440c;

    public C0580rg(C0589rp c0589rp) {
        C0589rp c0589rp2 = new C0589rp();
        this.f1438a = c0589rp2;
        c0589rp2.addAll(c0589rp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final C0226ed m1635d() {
        if (this.f1438a.size() != 1) {
            throw new C0649tv("current context is more than one el,total = " + this.f1438a.size());
        }
        C0589rp c0589rp = this.f1438a;
        if (c0589rp.isEmpty()) {
            return null;
        }
        return (C0226ed) c0589rp.get(0);
    }
}
