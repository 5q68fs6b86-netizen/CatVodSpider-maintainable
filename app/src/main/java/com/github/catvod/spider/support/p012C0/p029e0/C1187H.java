package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.H */
/* JADX INFO: loaded from: classes.dex */
public class C1187H extends AbstractC1224t {
    public C1187H(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1224t
    /* JADX INFO: renamed from: b */
    protected final int mo2997b(C1053l c1053l) {
        if (c1053l.m2709f0() == null) {
            return 0;
        }
        int i = 0;
        for (C1053l c1053l2 : c1053l.m2709f0().m2695R()) {
            if (c1053l2.m2717m0().equals(c1053l.m2717m0())) {
                i++;
            }
            if (c1053l2 == c1053l) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1224t
    /* JADX INFO: renamed from: c */
    protected final String mo2998c() {
        return "nth-of-type";
    }
}
