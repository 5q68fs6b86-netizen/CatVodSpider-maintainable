package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1563s extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3509a;

    /* JADX INFO: renamed from: b */
    private final String f3510b;

    public C1563s(String str, int i) {
        this.f3509a = i;
        if (i == 1) {
            this.f3510b = str;
            return;
        }
        StringBuilder sbM3363b = C1380b.m3363b();
        C1380b.m3362a(sbM3363b, str, false);
        this.f3510b = C1286l.m3219d(C1380b.m3369h(sbM3363b));
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        switch (this.f3509a) {
            case 0:
                return C1286l.m3219d(c1393m2.m3484v0()).contains(this.f3510b);
            default:
                return c1393m2.m3469i0().equals(this.f3510b);
        }
    }

    public final String toString() {
        switch (this.f3509a) {
            case 0:
                return String.format(":contains(%s)", this.f3510b);
            default:
                return String.format("%s", this.f3510b);
        }
    }
}
