package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.H */
/* JADX INFO: loaded from: classes.dex */
public final class C1526H extends AbstractC1566v {
    public C1526H(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1566v
    /* JADX INFO: renamed from: b */
    protected final int mo3767b(C1393m c1393m) {
        if (c1393m.m3473k0() == null) {
            return 0;
        }
        return c1393m.m3473k0().m3456V().size() - c1393m.m3458Y();
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1566v
    /* JADX INFO: renamed from: c */
    protected final String mo3768c() {
        return "nth-last-child";
    }
}
