package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zq */
/* JADX INFO: loaded from: classes.dex */
public final class C0806zq extends AbstractC0147bf {

    /* JADX INFO: renamed from: a */
    public final AbstractC0687vf[] f1914a;

    public C0806zq(AbstractC0687vf abstractC0687vf, AbstractC0687vf abstractC0687vf2) {
        HashSet hashSet = new HashSet();
        if (abstractC0687vf instanceof C0806zq) {
            hashSet.addAll(Arrays.asList(((C0806zq) abstractC0687vf).f1914a));
        } else {
            hashSet.add(abstractC0687vf);
        }
        if (abstractC0687vf2 instanceof C0806zq) {
            hashSet.addAll(Arrays.asList(((C0806zq) abstractC0687vf2).f1914a));
        } else {
            hashSet.add(abstractC0687vf2);
        }
        List listM1747f = AbstractC0687vf.m1747f(hashSet);
        if (!listM1747f.isEmpty()) {
            hashSet.add((aae) Collections.min(listM1747f));
        }
        this.f1914a = (AbstractC0687vf[]) hashSet.toArray(new AbstractC0687vf[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0687vf
    /* JADX INFO: renamed from: b */
    public final AbstractC0687vf mo875b(C0720wl c0720wl, C0579rf c0579rf) {
        ArrayList arrayList = new ArrayList();
        AbstractC0687vf[] abstractC0687vfArr = this.f1914a;
        int length = abstractC0687vfArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            C0467nb c0467nb = AbstractC0687vf.f1592e;
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return c0467nb;
                }
                AbstractC0687vf abstractC0687vfM1748g = (AbstractC0687vf) arrayList.get(0);
                for (int i3 = 1; i3 < arrayList.size(); i3++) {
                    abstractC0687vfM1748g = AbstractC0687vf.m1748g(abstractC0687vfM1748g, (AbstractC0687vf) arrayList.get(i3));
                }
                return abstractC0687vfM1748g;
            }
            AbstractC0687vf abstractC0687vf = abstractC0687vfArr[i];
            AbstractC0687vf abstractC0687vfMo875b = abstractC0687vf.mo875b(c0720wl, c0579rf);
            i2 |= abstractC0687vfMo875b == abstractC0687vf ? 0 : 1;
            if (abstractC0687vfMo875b == null) {
                return null;
            }
            if (abstractC0687vfMo875b != c0467nb) {
                arrayList.add(abstractC0687vfMo875b);
            }
            i++;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0687vf
    /* JADX INFO: renamed from: d */
    public final boolean mo876d(C0720wl c0720wl, C0579rf c0579rf) {
        for (AbstractC0687vf abstractC0687vf : this.f1914a) {
            if (!abstractC0687vf.mo876d(c0720wl, c0579rf)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0806zq) {
            return Arrays.equals(this.f1914a, ((C0806zq) obj).f1914a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = C0806zq.class.hashCode();
        AbstractC0687vf[] abstractC0687vfArr = this.f1914a;
        for (AbstractC0687vf abstractC0687vf : abstractC0687vfArr) {
            iHashCode = AbstractC0534po.m1524k(iHashCode, abstractC0687vf);
        }
        return AbstractC0534po.m1518e(iHashCode, abstractC0687vfArr.length);
    }

    public final String toString() {
        return AbstractC0399ko.m1353h(Arrays.asList(this.f1914a).iterator(), "&&");
    }
}
