package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1185F extends AbstractC1224t {
    public C1185F(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1224t
    /* JADX INFO: renamed from: b */
    protected final int mo2997b(C1053l c1053l) {
        if (c1053l.m2709f0() == null) {
            return 0;
        }
        return c1053l.m2709f0().m2695R().size() - c1053l.m2697U();
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1224t
    /* JADX INFO: renamed from: c */
    protected final String mo2998c() {
        return "nth-last-child";
    }
}
