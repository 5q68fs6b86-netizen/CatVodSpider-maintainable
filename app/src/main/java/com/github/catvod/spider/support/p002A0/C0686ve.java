package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ve */
/* JADX INFO: loaded from: classes.dex */
public final class C0686ve extends AbstractC0147bf {

    /* JADX INFO: renamed from: a */
    public final AbstractC0687vf[] f1591a;

    public C0686ve(AbstractC0687vf abstractC0687vf, AbstractC0687vf abstractC0687vf2) {
        HashSet hashSet = new HashSet();
        if (abstractC0687vf instanceof C0686ve) {
            hashSet.addAll(Arrays.asList(((C0686ve) abstractC0687vf).f1591a));
        } else {
            hashSet.add(abstractC0687vf);
        }
        if (abstractC0687vf2 instanceof C0686ve) {
            hashSet.addAll(Arrays.asList(((C0686ve) abstractC0687vf2).f1591a));
        } else {
            hashSet.add(abstractC0687vf2);
        }
        List listM1747f = AbstractC0687vf.m1747f(hashSet);
        if (!listM1747f.isEmpty()) {
            hashSet.add((aae) Collections.max(listM1747f));
        }
        this.f1591a = (AbstractC0687vf[]) hashSet.toArray(new AbstractC0687vf[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0687vf
    /* JADX INFO: renamed from: b */
    public final AbstractC0687vf mo875b(C0720wl c0720wl, C0579rf c0579rf) {
        ArrayList arrayList = new ArrayList();
        AbstractC0687vf[] abstractC0687vfArr = this.f1591a;
        int length = abstractC0687vfArr.length;
        int i = 0;
        boolean z = false;
        while (true) {
            C0467nb c0467nb = AbstractC0687vf.f1592e;
            if (i >= length) {
                if (!z) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                AbstractC0687vf abstractC0687vf = (AbstractC0687vf) arrayList.get(0);
                for (int i2 = 1; i2 < arrayList.size(); i2++) {
                    AbstractC0687vf abstractC0687vf2 = (AbstractC0687vf) arrayList.get(i2);
                    if (abstractC0687vf == null) {
                        abstractC0687vf = abstractC0687vf2;
                    } else if (abstractC0687vf2 != null) {
                        if (abstractC0687vf == c0467nb || abstractC0687vf2 == c0467nb) {
                            abstractC0687vf = c0467nb;
                        } else {
                            C0686ve c0686ve = new C0686ve(abstractC0687vf, abstractC0687vf2);
                            AbstractC0687vf[] abstractC0687vfArr2 = c0686ve.f1591a;
                            abstractC0687vf = abstractC0687vfArr2.length == 1 ? abstractC0687vfArr2[0] : c0686ve;
                        }
                    }
                }
                return abstractC0687vf;
            }
            AbstractC0687vf abstractC0687vf3 = abstractC0687vfArr[i];
            AbstractC0687vf abstractC0687vfMo875b = abstractC0687vf3.mo875b(c0720wl, c0579rf);
            z |= abstractC0687vfMo875b != abstractC0687vf3;
            if (abstractC0687vfMo875b == c0467nb) {
                return c0467nb;
            }
            if (abstractC0687vfMo875b != null) {
                arrayList.add(abstractC0687vfMo875b);
            }
            i++;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0687vf
    /* JADX INFO: renamed from: d */
    public final boolean mo876d(C0720wl c0720wl, C0579rf c0579rf) {
        for (AbstractC0687vf abstractC0687vf : this.f1591a) {
            if (abstractC0687vf.mo876d(c0720wl, c0579rf)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0686ve) {
            return Arrays.equals(this.f1591a, ((C0686ve) obj).f1591a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = C0686ve.class.hashCode();
        AbstractC0687vf[] abstractC0687vfArr = this.f1591a;
        for (AbstractC0687vf abstractC0687vf : abstractC0687vfArr) {
            iHashCode = AbstractC0534po.m1524k(iHashCode, abstractC0687vf);
        }
        return AbstractC0534po.m1518e(iHashCode, abstractC0687vfArr.length);
    }

    public final String toString() {
        return AbstractC0399ko.m1353h(Arrays.asList(this.f1591a).iterator(), "||");
    }
}
