package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r;
import com.github.catvod.spider.support.p012C0.p026c0.C1046e;
import com.github.catvod.spider.support.p012C0.p026c0.C1050i;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1230z extends AbstractC1193N {
    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        for (AbstractC1059r abstractC1059r : c1053l2.m2756i()) {
            if (!(abstractC1059r instanceof C1046e) && !(abstractC1059r instanceof C1050i)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return ":empty";
    }
}
