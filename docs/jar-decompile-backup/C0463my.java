package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.my */
/* JADX INFO: loaded from: classes.dex */
public final class C0463my extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final C0802zm f1254a = new C0802zm(1);

    /* JADX INFO: renamed from: b */
    public final Comparator f1255b;

    /* JADX INFO: renamed from: c */
    public final boolean f1256c;

    /* JADX INFO: renamed from: d */
    public adi f1257d;

    /* JADX INFO: renamed from: e */
    public int f1258e;

    /* JADX INFO: renamed from: f */
    public int f1259f;

    /* JADX INFO: renamed from: g */
    public final adi f1260g;

    /* JADX INFO: renamed from: h */
    public C0192cx f1261h;

    /* JADX INFO: renamed from: i */
    public C0192cx f1262i;

    public C0463my(boolean z) {
        C0802zm c0802zm = f1254a;
        this.f1258e = 0;
        this.f1259f = 0;
        this.f1255b = c0802zm;
        this.f1256c = z;
        this.f1260g = new adi(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f1257d = null;
        this.f1258e = 0;
        this.f1259f++;
        adi adiVar = this.f1260g;
        adiVar.f611e = adiVar;
        adiVar.f610d = adiVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        adi adiVarM1443j = null;
        if (obj != null) {
            try {
                adiVarM1443j = m1443j(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return adiVarM1443j != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0192cx c0192cx = this.f1261h;
        if (c0192cx != null) {
            return c0192cx;
        }
        C0192cx c0192cx2 = new C0192cx(this, 0);
        this.f1261h = c0192cx2;
        return c0192cx2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        adi adiVarM1443j;
        if (obj != null) {
            try {
                adiVarM1443j = m1443j(obj, false);
            } catch (ClassCastException unused) {
                adiVarM1443j = null;
            }
        } else {
            adiVarM1443j = null;
        }
        if (adiVarM1443j != null) {
            return adiVarM1443j.f614h;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final adi m1443j(Object obj, boolean z) {
        int iCompareTo;
        adi adiVar;
        adi adiVar2 = this.f1257d;
        C0802zm c0802zm = f1254a;
        Comparator comparator = this.f1255b;
        if (adiVar2 != null) {
            Comparable comparable = comparator == c0802zm ? (Comparable) obj : null;
            while (true) {
                Object obj2 = adiVar2.f612f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return adiVar2;
                }
                adi adiVar3 = iCompareTo < 0 ? adiVar2.f608b : adiVar2.f609c;
                if (adiVar3 == null) {
                    break;
                }
                adiVar2 = adiVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        adi adiVar4 = this.f1260g;
        if (adiVar2 != null) {
            adiVar = new adi(this.f1256c, adiVar2, obj, adiVar4, adiVar4.f611e);
            if (iCompareTo < 0) {
                adiVar2.f608b = adiVar;
            } else {
                adiVar2.f609c = adiVar;
            }
            m1444k(adiVar2, true);
        } else {
            if (comparator == c0802zm && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            adiVar = new adi(this.f1256c, adiVar2, obj, adiVar4, adiVar4.f611e);
            this.f1257d = adiVar;
        }
        this.f1258e++;
        this.f1259f++;
        return adiVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m1444k(adi adiVar, boolean z) {
        while (adiVar != null) {
            adi adiVar2 = adiVar.f608b;
            adi adiVar3 = adiVar.f609c;
            int i = adiVar2 != null ? adiVar2.f615i : 0;
            int i2 = adiVar3 != null ? adiVar3.f615i : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                adi adiVar4 = adiVar3.f608b;
                adi adiVar5 = adiVar3.f609c;
                int i4 = (adiVar4 != null ? adiVar4.f615i : 0) - (adiVar5 != null ? adiVar5.f615i : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m1447n(adiVar);
                } else {
                    m1448o(adiVar3);
                    m1447n(adiVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                adi adiVar6 = adiVar2.f608b;
                adi adiVar7 = adiVar2.f609c;
                int i5 = (adiVar6 != null ? adiVar6.f615i : 0) - (adiVar7 != null ? adiVar7.f615i : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m1448o(adiVar);
                } else {
                    m1447n(adiVar2);
                    m1448o(adiVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                adiVar.f615i = i + 1;
                if (z) {
                    return;
                }
            } else {
                adiVar.f615i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            adiVar = adiVar.f607a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0192cx c0192cx = this.f1262i;
        if (c0192cx != null) {
            return c0192cx;
        }
        C0192cx c0192cx2 = new C0192cx(this, 1);
        this.f1262i = c0192cx2;
        return c0192cx2;
    }

    /* JADX INFO: renamed from: l */
    public final void m1445l(adi adiVar, boolean z) {
        adi adiVar2;
        adi adiVar3;
        int i;
        if (z) {
            adi adiVar4 = adiVar.f611e;
            adiVar4.f610d = adiVar.f610d;
            adiVar.f610d.f611e = adiVar4;
        }
        adi adiVar5 = adiVar.f608b;
        adi adiVar6 = adiVar.f609c;
        adi adiVar7 = adiVar.f607a;
        int i2 = 0;
        if (adiVar5 == null || adiVar6 == null) {
            if (adiVar5 != null) {
                m1446m(adiVar, adiVar5);
                adiVar.f608b = null;
            } else if (adiVar6 != null) {
                m1446m(adiVar, adiVar6);
                adiVar.f609c = null;
            } else {
                m1446m(adiVar, null);
            }
            m1444k(adiVar7, false);
            this.f1258e--;
            this.f1259f++;
            return;
        }
        if (adiVar5.f615i > adiVar6.f615i) {
            adi adiVar8 = adiVar5.f609c;
            while (true) {
                adi adiVar9 = adiVar8;
                adiVar3 = adiVar5;
                adiVar5 = adiVar9;
                if (adiVar5 == null) {
                    break;
                } else {
                    adiVar8 = adiVar5.f609c;
                }
            }
        } else {
            adi adiVar10 = adiVar6.f608b;
            while (true) {
                adiVar2 = adiVar6;
                adiVar6 = adiVar10;
                if (adiVar6 == null) {
                    break;
                } else {
                    adiVar10 = adiVar6.f608b;
                }
            }
            adiVar3 = adiVar2;
        }
        m1445l(adiVar3, false);
        adi adiVar11 = adiVar.f608b;
        if (adiVar11 != null) {
            i = adiVar11.f615i;
            adiVar3.f608b = adiVar11;
            adiVar11.f607a = adiVar3;
            adiVar.f608b = null;
        } else {
            i = 0;
        }
        adi adiVar12 = adiVar.f609c;
        if (adiVar12 != null) {
            i2 = adiVar12.f615i;
            adiVar3.f609c = adiVar12;
            adiVar12.f607a = adiVar3;
            adiVar.f609c = null;
        }
        adiVar3.f615i = Math.max(i, i2) + 1;
        m1446m(adiVar, adiVar3);
    }

    /* JADX INFO: renamed from: m */
    public final void m1446m(adi adiVar, adi adiVar2) {
        adi adiVar3 = adiVar.f607a;
        adiVar.f607a = null;
        if (adiVar2 != null) {
            adiVar2.f607a = adiVar3;
        }
        if (adiVar3 == null) {
            this.f1257d = adiVar2;
        } else if (adiVar3.f608b == adiVar) {
            adiVar3.f608b = adiVar2;
        } else {
            adiVar3.f609c = adiVar2;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1447n(adi adiVar) {
        adi adiVar2 = adiVar.f608b;
        adi adiVar3 = adiVar.f609c;
        adi adiVar4 = adiVar3.f608b;
        adi adiVar5 = adiVar3.f609c;
        adiVar.f609c = adiVar4;
        if (adiVar4 != null) {
            adiVar4.f607a = adiVar;
        }
        m1446m(adiVar, adiVar3);
        adiVar3.f608b = adiVar;
        adiVar.f607a = adiVar3;
        int iMax = Math.max(adiVar2 != null ? adiVar2.f615i : 0, adiVar4 != null ? adiVar4.f615i : 0) + 1;
        adiVar.f615i = iMax;
        adiVar3.f615i = Math.max(iMax, adiVar5 != null ? adiVar5.f615i : 0) + 1;
    }

    /* JADX INFO: renamed from: o */
    public final void m1448o(adi adiVar) {
        adi adiVar2 = adiVar.f608b;
        adi adiVar3 = adiVar.f609c;
        adi adiVar4 = adiVar2.f608b;
        adi adiVar5 = adiVar2.f609c;
        adiVar.f608b = adiVar5;
        if (adiVar5 != null) {
            adiVar5.f607a = adiVar;
        }
        m1446m(adiVar, adiVar2);
        adiVar2.f609c = adiVar;
        adiVar.f607a = adiVar2;
        int iMax = Math.max(adiVar3 != null ? adiVar3.f615i : 0, adiVar5 != null ? adiVar5.f615i : 0) + 1;
        adiVar.f615i = iMax;
        adiVar2.f615i = Math.max(iMax, adiVar4 != null ? adiVar4.f615i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f1256c) {
            throw new NullPointerException("value == null");
        }
        adi adiVarM1443j = m1443j(obj, true);
        Object obj3 = adiVarM1443j.f614h;
        adiVarM1443j.f614h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        adi adiVarM1443j;
        if (obj != null) {
            try {
                adiVarM1443j = m1443j(obj, false);
            } catch (ClassCastException unused) {
                adiVarM1443j = null;
            }
        } else {
            adiVarM1443j = null;
        }
        if (adiVarM1443j != null) {
            m1445l(adiVarM1443j, true);
        }
        if (adiVarM1443j != null) {
            return adiVarM1443j.f614h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1258e;
    }
}
