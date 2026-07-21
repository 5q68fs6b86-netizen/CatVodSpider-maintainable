package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.G */
/* JADX INFO: loaded from: classes.dex */
public class C1186G extends AbstractC1224t {
    public C1186G(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1224t
    /* JADX INFO: renamed from: b */
    protected final int mo2997b(C1053l c1053l) {
        int i = 0;
        if (c1053l.m2709f0() == null) {
            return 0;
        }
        C1211g c1211gM2695R = c1053l.m2709f0().m2695R();
        int iM2697U = c1053l.m2697U();
        while (true) {
            int i2 = i;
            if (iM2697U >= c1211gM2695R.size()) {
                return i2;
            }
            i = c1211gM2695R.get(iM2697U).m2717m0().equals(c1053l.m2717m0()) ? i2 + 1 : i2;
            iM2697U++;
        }
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1224t
    /* JADX INFO: renamed from: c */
    protected final String mo2998c() {
        return "nth-last-of-type";
    }
}
