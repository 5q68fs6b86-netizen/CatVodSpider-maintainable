package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p045A.C1290p;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1917C;
import com.github.catvod.spider.support.p044FM.p098x.C1918D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1990g0 extends AbstractC1994i0 {

    /* JADX INFO: renamed from: b */
    public final AbstractC2000l0[] f4544b;

    public C1990g0(AbstractC2000l0 abstractC2000l0, AbstractC2000l0 abstractC2000l1) {
        HashSet hashSet = new HashSet();
        if (abstractC2000l0 instanceof C1990g0) {
            hashSet.addAll(Arrays.asList(((C1990g0) abstractC2000l0).f4544b));
        } else {
            hashSet.add(abstractC2000l0);
        }
        if (abstractC2000l1 instanceof C1990g0) {
            hashSet.addAll(Arrays.asList(((C1990g0) abstractC2000l1).f4544b));
        } else {
            hashSet.add(abstractC2000l1);
        }
        List listM4784a = AbstractC2000l0.m4784a(hashSet);
        if (!listM4784a.isEmpty()) {
            hashSet.add((C1996j0) Collections.min(listM4784a));
        }
        this.f4544b = (AbstractC2000l0[]) hashSet.toArray(new AbstractC2000l0[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2000l0
    /* JADX INFO: renamed from: c */
    public final boolean mo4775c(AbstractC1917C<?, ?> abstractC1917C, C1918D c1918d) {
        for (AbstractC2000l0 abstractC2000l0 : this.f4544b) {
            if (!abstractC2000l0.mo4775c(abstractC1917C, c1918d)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2000l0
    /* JADX INFO: renamed from: d */
    public final AbstractC2000l0 mo4776d(AbstractC1917C<?, ?> abstractC1917C, C1918D c1918d) {
        ArrayList arrayList = new ArrayList();
        AbstractC2000l0[] abstractC2000l0Arr = this.f4544b;
        int length = abstractC2000l0Arr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return AbstractC2000l0.f4559a;
                }
                AbstractC2000l0 abstractC2000l0M4785b = (AbstractC2000l0) arrayList.get(0);
                for (int i3 = 1; i3 < arrayList.size(); i3++) {
                    abstractC2000l0M4785b = AbstractC2000l0.m4785b(abstractC2000l0M4785b, (AbstractC2000l0) arrayList.get(i3));
                }
                return abstractC2000l0M4785b;
            }
            AbstractC2000l0 abstractC2000l0 = abstractC2000l0Arr[i];
            AbstractC2000l0 abstractC2000l0Mo4776d = abstractC2000l0.mo4776d(abstractC1917C, c1918d);
            i2 |= abstractC2000l0Mo4776d == abstractC2000l0 ? 0 : 1;
            if (abstractC2000l0Mo4776d == null) {
                return null;
            }
            if (abstractC2000l0Mo4776d != AbstractC2000l0.f4559a) {
                arrayList.add(abstractC2000l0Mo4776d);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1990g0) {
            return Arrays.equals(this.f4544b, ((C1990g0) obj).f4544b);
        }
        return false;
    }

    public final int hashCode() {
        AbstractC2000l0[] abstractC2000l0Arr = this.f4544b;
        int iHashCode = C1990g0.class.hashCode();
        for (AbstractC2000l0 abstractC2000l0 : abstractC2000l0Arr) {
            iHashCode = C1286l.m3225j(iHashCode, abstractC2000l0);
        }
        return C1286l.m3218c(iHashCode, abstractC2000l0Arr.length);
    }

    public final String toString() {
        return C1290p.m3228c(Arrays.asList(this.f4544b).iterator(), "&&");
    }
}
