package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1548d extends AbstractC1550f {
    C1548d(Collection<AbstractC1532N> collection) {
        this.f3497a.addAll(collection);
        m3783b();
    }

    C1548d(AbstractC1532N... abstractC1532NArr) {
        this(Arrays.asList(abstractC1532NArr));
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        for (int i = this.f3498b - 1; i >= 0; i--) {
            if (!this.f3497a.get(i).mo3766a(c1393m, c1393m2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C1380b.m3367f(this.f3497a, "");
    }
}
