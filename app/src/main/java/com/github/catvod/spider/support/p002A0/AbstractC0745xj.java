package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.xj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0745xj {

    /* JADX INFO: renamed from: a */
    public static final C0737xb f1804a = new C0737xb("COMPLETING_ALREADY", 3);

    /* JADX INFO: renamed from: b */
    public static final C0737xb f1805b = new C0737xb("COMPLETING_WAITING_CHILDREN", 3);

    /* JADX INFO: renamed from: c */
    public static final C0737xb f1806c = new C0737xb("COMPLETING_RETRY", 3);

    /* JADX INFO: renamed from: d */
    public static final C0737xb f1807d = new C0737xb("TOO_LATE_TO_CANCEL", 3);

    /* JADX INFO: renamed from: e */
    public static final C0737xb f1808e = new C0737xb("SEALED", 3);

    /* JADX INFO: renamed from: f */
    public static final C0224eb f1809f = new C0224eb(false);

    /* JADX INFO: renamed from: g */
    public static final C0224eb f1810g = new C0224eb(true);

    /* JADX INFO: renamed from: h */
    public static int m1871h(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: i */
    public static aaf m1872i(add addVar, int i) {
        AbstractC0399ko.m1351f("<this>", addVar);
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z) {
            if (addVar.f430c <= 0) {
                i = -i;
            }
            return new aaf(addVar.f428a, addVar.f429b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    /* JADX INFO: renamed from: j */
    public static final Object m1873j(Object obj) {
        InterfaceC0681v interfaceC0681v;
        C0262fm c0262fm = (C0262fm) (!(obj instanceof C0262fm) ? null : obj);
        return (c0262fm == null || (interfaceC0681v = c0262fm.f831a) == null) ? obj : interfaceC0681v;
    }

    /* JADX INFO: renamed from: k */
    public static add m1874k(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new add(i, i2 - 1, 1);
        }
        add addVar = add.f601d;
        return add.f601d;
    }
}
