package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.d */
/* JADX INFO: loaded from: classes.dex */
final class C1208d extends AbstractC1210f {
    C1208d(Collection<AbstractC1193N> collection) {
        this.f2881a.addAll(collection);
        m3011b();
    }

    C1208d(AbstractC1193N... abstractC1193NArr) {
        this(Arrays.asList(abstractC1193NArr));
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        for (int i = this.f2882b - 1; i >= 0; i--) {
            if (!this.f2881a.get(i).mo2996a(c1053l, c1053l2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C1034b.m2599e(this.f2881a, "");
    }
}
