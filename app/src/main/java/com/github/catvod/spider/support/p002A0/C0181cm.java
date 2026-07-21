package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.cm */
/* JADX INFO: loaded from: classes.dex */
public class C0181cm extends AbstractC0488nw {

    /* JADX INFO: renamed from: a */
    public final C0339ii f713a;

    public C0181cm(AbstractC0428lq abstractC0428lq, C0339ii c0339ii) {
        super(abstractC0428lq);
        if (c0339ii == null) {
            c0339ii = new C0339ii(new int[0]);
            c0339ii.m1302c(0);
        }
        this.f713a = c0339ii;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0488nw
    /* JADX INFO: renamed from: b */
    public int mo871b() {
        return 7;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0488nw
    /* JADX INFO: renamed from: c */
    public final C0339ii mo1088c() {
        return this.f713a;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0488nw
    /* JADX INFO: renamed from: d */
    public boolean mo872d(int i, int i2) {
        return this.f713a.m1305f(i);
    }

    public String toString() {
        return this.f713a.toString();
    }
}
