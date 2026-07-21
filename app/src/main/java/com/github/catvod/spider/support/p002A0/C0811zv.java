package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zv */
/* JADX INFO: loaded from: classes.dex */
public final class C0811zv extends AbstractC0250fa {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public final int mo1019b() {
        return ((AbstractC0213dr) this.f813f).mo1019b() * 3;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        if (c0226ed == c0226ed2) {
            return false;
        }
        C0226ed c0226ed3 = (C0226ed) c0226ed2.f846ap;
        for (C0226ed c0226edM1161ac = c0226ed3 != null ? c0226ed3.m1161ac() : c0226ed2; c0226edM1161ac != null && c0226edM1161ac != c0226ed2; c0226edM1161ac = c0226edM1161ac.m1164af()) {
            if (m1204h(c0226ed, c0226edM1161ac)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", (AbstractC0213dr) this.f813f);
    }
}
