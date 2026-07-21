package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p055K.C1390j;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1565u extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    private final String f3513a;

    public C1565u(String str) {
        this.f3513a = str;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        StringBuilder sbM3363b = C1380b.m3363b();
        C1317a.m3303d(new C1390j(sbM3363b), c1393m2);
        return C1380b.m3369h(sbM3363b).contains(this.f3513a);
    }

    public final String toString() {
        return String.format(":containsWholeText(%s)", this.f3513a);
    }
}
