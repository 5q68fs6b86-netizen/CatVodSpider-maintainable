package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.I */
/* JADX INFO: loaded from: classes.dex */
public class C1527I extends AbstractC1566v {
    public C1527I(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1566v
    /* JADX INFO: renamed from: b */
    protected final int mo3767b(C1393m c1393m) {
        int i = 0;
        if (c1393m.m3473k0() == null) {
            return 0;
        }
        C1551g c1551gM3456V = c1393m.m3473k0().m3456V();
        for (int iM3458Y = c1393m.m3458Y(); iM3458Y < c1551gM3456V.size(); iM3458Y++) {
            if (c1551gM3456V.get(iM3458Y).m3482s0().equals(c1393m.m3482s0())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1566v
    /* JADX INFO: renamed from: c */
    protected final String mo3768c() {
        return "nth-last-of-type";
    }
}
