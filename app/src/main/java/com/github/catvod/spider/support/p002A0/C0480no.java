package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.no */
/* JADX INFO: loaded from: classes.dex */
public final class C0480no extends AbstractC0250fa {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public final int mo1019b() {
        return ((AbstractC0213dr) this.f813f).mo1019b() + 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.github.catvod.spider.support.A0.ed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.catvod.spider.support.A0.fw] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.catvod.spider.support.A0.fw] */
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        C0226ed c0226ed3;
        if (c0226ed == c0226ed2) {
            return false;
        }
        c0226ed2.getClass();
        while (true) {
            c0226ed2 = c0226ed2.m1232ay();
            if (c0226ed2 == 0) {
                c0226ed3 = null;
                break;
            }
            if (c0226ed2 instanceof C0226ed) {
                c0226ed3 = (C0226ed) c0226ed2;
                break;
            }
        }
        return c0226ed3 != null && m1204h(c0226ed, c0226ed3);
    }

    public final String toString() {
        return String.format("%s + ", (AbstractC0213dr) this.f813f);
    }
}
