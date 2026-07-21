package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p026c0.C1061t;
import com.github.catvod.spider.support.p012C0.p026c0.C1062u;
import com.github.catvod.spider.support.p012C0.p028d0.C1074D;
import com.github.catvod.spider.support.p012C0.p028d0.C1078F;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1189J extends AbstractC1193N {
    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        if (c1053l2 instanceof C1061t) {
            return true;
        }
        for (C1062u c1062u : c1053l2.m2722q0()) {
            C1061t c1061t = new C1061t(C1078F.m2811l(c1053l2.m2719n0(), C1074D.f2656d), c1053l2.mo2707e(), c1053l2.mo2705d());
            c1062u.m2751E(c1061t);
            c1061t.m2690L(c1062u);
        }
        return false;
    }

    public final String toString() {
        return ":matchText";
    }
}
