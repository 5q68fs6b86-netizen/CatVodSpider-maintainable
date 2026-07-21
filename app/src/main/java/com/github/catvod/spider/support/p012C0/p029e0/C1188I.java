package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1049h;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1188I extends AbstractC1193N {
    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        C1053l c1053lM2709f0 = c1053l2.m2709f0();
        if (c1053lM2709f0 == null || (c1053lM2709f0 instanceof C1049h)) {
            return false;
        }
        Iterator<C1053l> it = c1053lM2709f0.m2695R().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m2717m0().equals(c1053l2.m2717m0())) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        return ":only-of-type";
    }
}
