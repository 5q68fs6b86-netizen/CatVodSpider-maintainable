package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.J */
/* JADX INFO: loaded from: classes.dex */
public class C1528J extends AbstractC1566v {
    public C1528J(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1566v
    /* JADX INFO: renamed from: b */
    protected final int mo3767b(C1393m c1393m) {
        int i = 0;
        if (c1393m.m3473k0() == null) {
            return 0;
        }
        for (C1393m c1393m2 : c1393m.m3473k0().m3456V()) {
            if (c1393m2.m3482s0().equals(c1393m.m3482s0())) {
                i++;
            }
            if (c1393m2 == c1393m) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1566v
    /* JADX INFO: renamed from: c */
    protected final String mo3768c() {
        return "nth-of-type";
    }
}
