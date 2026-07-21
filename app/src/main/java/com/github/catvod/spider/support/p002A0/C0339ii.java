package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ii */
/* JADX INFO: loaded from: classes.dex */
public final class C0339ii {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1008a;

    /* JADX INFO: renamed from: b */
    public boolean f1009b;

    static {
        C0339ii c0339ii = new C0339ii(new int[0]);
        c0339ii.m1303d(0, 1114111);
        c0339ii.f1009b = true;
        new C0339ii(new int[0]).f1009b = true;
    }

    public C0339ii(C0339ii c0339ii) {
        this(new int[0]);
        m1304e(c0339ii);
    }

    public C0339ii(int... iArr) {
        this.f1008a = new ArrayList(iArr.length);
        for (int i : iArr) {
            m1302c(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1302c(int i) {
        if (this.f1009b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        m1303d(i, i);
    }

    /* JADX INFO: renamed from: d */
    public final void m1303d(int i, int i2) {
        C0145bd c0145bd;
        int i3;
        C0145bd c0145bdM1022d = C0145bd.m1022d(i, i2);
        if (this.f1009b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (c0145bdM1022d.f685c < c0145bdM1022d.f684b) {
            return;
        }
        ArrayList arrayList = this.f1008a;
        ListIterator listIterator = arrayList.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                arrayList.add(c0145bdM1022d);
                return;
            }
            c0145bd = (C0145bd) listIterator.next();
            if (!c0145bdM1022d.equals(c0145bd)) {
                i3 = c0145bdM1022d.f684b;
                int i4 = c0145bd.f685c;
                if (i3 == i4 + 1) {
                    break;
                }
                int i5 = c0145bdM1022d.f685c;
                int i6 = c0145bd.f684b;
                if (i5 == i6 - 1 || ((i3 >= i6 || i5 >= i6) && i3 <= i4)) {
                    break;
                }
                if (i3 < i6 && i5 < i6) {
                    listIterator.previous();
                    listIterator.add(c0145bdM1022d);
                    return;
                }
            } else {
                return;
            }
        }
        C0145bd c0145bdM1022d2 = C0145bd.m1022d(Math.min(i3, c0145bd.f684b), Math.max(c0145bdM1022d.f685c, c0145bd.f685c));
        listIterator.set(c0145bdM1022d2);
        while (listIterator.hasNext()) {
            C0145bd c0145bd2 = (C0145bd) listIterator.next();
            int i7 = c0145bdM1022d2.f684b;
            int i8 = c0145bd2.f685c;
            if (i7 != i8 + 1) {
                int i9 = c0145bdM1022d2.f685c;
                int i10 = c0145bd2.f684b;
                if (i9 != i10 - 1 && ((i7 < i10 && i9 < i10) || i7 > i8)) {
                    return;
                }
            }
            listIterator.remove();
            listIterator.previous();
            listIterator.set(C0145bd.m1022d(Math.min(c0145bdM1022d2.f684b, c0145bd2.f684b), Math.max(c0145bdM1022d2.f685c, c0145bd2.f685c)));
            listIterator.next();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1304e(C0339ii c0339ii) {
        if (c0339ii == null) {
            return;
        }
        ArrayList arrayList = c0339ii.f1008a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0145bd c0145bd = (C0145bd) arrayList.get(i);
            m1303d(c0145bd.f684b, c0145bd.f685c);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0339ii)) {
            return false;
        }
        return this.f1008a.equals(((C0339ii) obj).f1008a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1305f(int i) {
        ArrayList arrayList = this.f1008a;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C0145bd c0145bd = (C0145bd) arrayList.get(i3);
            int i4 = c0145bd.f684b;
            if (c0145bd.f685c < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return true;
                }
                size = i3 - 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1306g() {
        ArrayList arrayList = this.f1008a;
        return arrayList == null || arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: h */
    public final void m1307h() {
        if (this.f1009b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        ArrayList arrayList = this.f1008a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0145bd c0145bd = (C0145bd) arrayList.get(i);
            int i2 = c0145bd.f684b;
            int i3 = c0145bd.f685c;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                arrayList.remove(i);
                return;
            }
            if (-2 == i2) {
                c0145bd.f684b = i2 + 1;
                return;
            }
            if (-2 == i3) {
                c0145bd.f685c = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                c0145bd.f685c = -3;
                m1303d(-1, i3);
            }
        }
    }

    public final int hashCode() {
        ArrayList<C0145bd> arrayList = this.f1008a;
        int iM1523j = 0;
        for (C0145bd c0145bd : arrayList) {
            iM1523j = AbstractC0534po.m1523j(AbstractC0534po.m1523j(iM1523j, c0145bd.f684b), c0145bd.f685c);
        }
        return AbstractC0534po.m1518e(iM1523j, arrayList.size() * 2);
    }

    /* JADX INFO: renamed from: i */
    public final int m1308i() {
        ArrayList arrayList = this.f1008a;
        int size = arrayList.size();
        if (size == 1) {
            C0145bd c0145bd = (C0145bd) arrayList.get(0);
            return (c0145bd.f685c - c0145bd.f684b) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0145bd c0145bd2 = (C0145bd) arrayList.get(i2);
            i += (c0145bd2.f685c - c0145bd2.f684b) + 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public final String m1309j(C0317hn c0317hn) {
        String strM1296f;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f1008a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (m1308i() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0145bd c0145bd = (C0145bd) it.next();
            int i = c0145bd.f684b;
            int i2 = c0145bd.f685c;
            String strM1296f2 = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strM1296f2 = "<EOF>";
                } else if (i != -2) {
                    strM1296f2 = c0317hn.m1296f(i);
                }
                sb.append(strM1296f2);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    if (i3 == -1) {
                        strM1296f = "<EOF>";
                    } else {
                        strM1296f = i3 == -2 ? "<EPSILON>" : c0317hn.m1296f(i3);
                    }
                    sb.append(strM1296f);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m1308i() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f1008a;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (m1308i() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0145bd c0145bd = (C0145bd) it.next();
            int i = c0145bd.f684b;
            int i2 = c0145bd.f685c;
            if (i != i2) {
                sb.append(i);
                sb.append("..");
                sb.append(i2);
            } else if (i == -1) {
                sb.append("<EOF>");
            } else {
                sb.append(i);
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m1308i() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }
}
