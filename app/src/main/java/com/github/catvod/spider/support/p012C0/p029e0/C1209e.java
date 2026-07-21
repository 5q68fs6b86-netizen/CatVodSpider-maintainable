package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.e */
/* JADX INFO: loaded from: classes.dex */
final class C1209e extends AbstractC1210f {
    C1209e() {
    }

    C1209e(AbstractC1193N... abstractC1193NArr) {
        List listAsList = Arrays.asList(abstractC1193NArr);
        if (this.f2882b > 1) {
            this.f2881a.add(new C1208d(listAsList));
        } else {
            this.f2881a.addAll(listAsList);
        }
        m3011b();
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        for (int i = 0; i < this.f2882b; i++) {
            if (this.f2881a.get(i).mo2996a(c1053l, c1053l2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return C1034b.m2599e(this.f2881a, ", ");
    }
}
