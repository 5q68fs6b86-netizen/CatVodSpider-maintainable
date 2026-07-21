package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1549e extends AbstractC1550f {
    C1549e() {
    }

    C1549e(AbstractC1532N... abstractC1532NArr) {
        List listAsList = Arrays.asList(abstractC1532NArr);
        if (this.f3498b > 1) {
            this.f3497a.add(new C1548d(listAsList));
        } else {
            this.f3497a.addAll(listAsList);
        }
        m3783b();
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        for (int i = 0; i < this.f3498b; i++) {
            if (this.f3497a.get(i).mo3766a(c1393m, c1393m2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return C1380b.m3367f(this.f3497a, ", ");
    }
}
