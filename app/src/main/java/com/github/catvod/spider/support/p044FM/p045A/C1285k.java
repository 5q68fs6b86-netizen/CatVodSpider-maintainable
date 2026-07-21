package com.github.catvod.spider.support.p044FM.p045A;

import com.github.catvod.spider.support.p044FM.p098x.C1924J;
import com.github.catvod.spider.support.p044FM.p098x.InterfaceC1923I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.A.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1285k implements InterfaceC1281g {

    /* JADX INFO: renamed from: a */
    protected List<C1284j> f3011a;

    /* JADX INFO: renamed from: b */
    protected boolean f3012b;

    static {
        m3204g(0, 1114111).m3213i();
        new C1285k(new int[0]).m3213i();
    }

    public C1285k(int... iArr) {
        this.f3011a = new ArrayList(iArr.length);
        for (int i : iArr) {
            m3206a(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C1285k m3204g(int i, int i2) {
        C1285k c1285k = new C1285k(new int[0]);
        c1285k.m3207b(i, i2);
        return c1285k;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX INFO: renamed from: k */
    public static C1285k m3205k(C1285k c1285k, C1285k c1285k2) {
        int i = 0;
        if (c1285k.m3211f()) {
            return new C1285k(new int[0]);
        }
        C1285k c1285k3 = new C1285k(new int[0]);
        c1285k3.m3208c(c1285k);
        if (!c1285k2.m3211f()) {
            int i2 = 0;
            while (i < c1285k3.f3011a.size() && i2 < c1285k2.f3011a.size()) {
                C1284j c1284j = (C1284j) c1285k3.f3011a.get(i);
                C1284j c1284j2 = (C1284j) c1285k2.f3011a.get(i2);
                int i3 = c1284j2.f3010b;
                int i4 = c1284j.f3009a;
                if (i3 >= i4) {
                    int i5 = c1284j2.f3009a;
                    int i6 = c1284j.f3010b;
                    if (i5 <= i6) {
                        C1284j c1284j3 = i5 > i4 ? new C1284j(i4, i5 - 1) : null;
                        C1284j c1284j4 = i3 < i6 ? new C1284j(i3 + 1, i6) : null;
                        ?? r2 = c1285k3.f3011a;
                        if (c1284j3 != null) {
                            r2.set(i, c1284j3);
                            if (c1284j4 != null) {
                                i++;
                                c1285k3.f3011a.add(i, c1284j4);
                            }
                        } else if (c1284j4 != null) {
                            r2.set(i, c1284j4);
                        } else {
                            r2.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return c1285k3;
    }

    /* JADX INFO: renamed from: a */
    public final void m3206a(int i) {
        if (this.f3012b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        m3207b(i, i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    public final void m3207b(int i, int i2) {
        C1284j c1284jM3201b = C1284j.m3201b(i, i2);
        if (this.f3012b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (c1284jM3201b.f3010b < c1284jM3201b.f3009a) {
            return;
        }
        ListIterator<C1284j> listIterator = this.f3011a.listIterator();
        while (listIterator.hasNext()) {
            C1284j next = listIterator.next();
            if (c1284jM3201b.equals(next)) {
                return;
            }
            boolean z = true;
            if ((c1284jM3201b.f3009a == next.f3010b + 1 || c1284jM3201b.f3010b == next.f3009a - 1) || !c1284jM3201b.m3202a(next)) {
                C1284j c1284jM3203c = c1284jM3201b.m3203c(next);
                listIterator.set(c1284jM3203c);
                while (listIterator.hasNext()) {
                    C1284j next2 = listIterator.next();
                    if (!(c1284jM3203c.f3009a == next2.f3010b + 1 || c1284jM3203c.f3010b == next2.f3009a - 1) && c1284jM3203c.m3202a(next2)) {
                        return;
                    }
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(c1284jM3203c.m3203c(next2));
                    listIterator.next();
                }
                return;
            }
            int i3 = c1284jM3201b.f3009a;
            int i4 = next.f3009a;
            if (i3 >= i4 || c1284jM3201b.f3010b >= i4) {
                z = false;
            }
            if (z) {
                listIterator.previous();
                listIterator.add(c1284jM3201b);
                return;
            }
        }
        this.f3011a.add(c1284jM3201b);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX INFO: renamed from: c */
    public final C1285k m3208c(InterfaceC1281g interfaceC1281g) {
        if (interfaceC1281g == null) {
            return this;
        }
        int i = 0;
        if (interfaceC1281g instanceof C1285k) {
            C1285k c1285k = (C1285k) interfaceC1281g;
            int size = c1285k.f3011a.size();
            while (i < size) {
                C1284j c1284j = (C1284j) c1285k.f3011a.get(i);
                m3207b(c1284j.f3009a, c1284j.f3010b);
                i++;
            }
        } else {
            C1285k c1285k2 = (C1285k) interfaceC1281g;
            ArrayList arrayList = new ArrayList();
            int size2 = c1285k2.f3011a.size();
            while (i < size2) {
                C1284j c1284j2 = (C1284j) c1285k2.f3011a.get(i);
                int i2 = c1284j2.f3010b;
                for (int i3 = c1284j2.f3009a; i3 <= i2; i3++) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i++;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m3206a(((Integer) it.next()).intValue());
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX INFO: renamed from: d */
    public final boolean m3209d(int i) {
        int size = this.f3011a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C1284j c1284j = (C1284j) this.f3011a.get(i3);
            int i4 = c1284j.f3009a;
            if (c1284j.f3010b < i) {
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX INFO: renamed from: e */
    public final int m3210e() {
        if (m3211f()) {
            throw new RuntimeException("set is empty");
        }
        return ((C1284j) this.f3011a.get(0)).f3009a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1285k)) {
            return false;
        }
        return this.f3011a.equals(((C1285k) obj).f3011a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX INFO: renamed from: f */
    public final boolean m3211f() {
        ?? r0 = this.f3011a;
        return r0 == 0 || r0.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX INFO: renamed from: h */
    public final void m3212h() {
        if (this.f3012b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        int size = this.f3011a.size();
        for (int i = 0; i < size; i++) {
            C1284j c1284j = (C1284j) this.f3011a.get(i);
            int i2 = c1284j.f3009a;
            int i3 = c1284j.f3010b;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                this.f3011a.remove(i);
                return;
            }
            if (-2 == i2) {
                c1284j.f3009a = i2 + 1;
                return;
            }
            if (-2 == i3) {
                c1284j.f3010b = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                c1284j.f3010b = -3;
                m3207b(-1, i3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    public final int hashCode() {
        int iM3224i = 0;
        for (C1284j c1284j : this.f3011a) {
            iM3224i = C1286l.m3224i(C1286l.m3224i(iM3224i, c1284j.f3009a), c1284j.f3010b);
        }
        return C1286l.m3218c(iM3224i, this.f3011a.size() * 2);
    }

    /* JADX INFO: renamed from: i */
    public final void m3213i() {
        boolean z = this.f3012b;
        this.f3012b = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX INFO: renamed from: j */
    public final int m3214j() {
        int size = this.f3011a.size();
        if (size == 1) {
            C1284j c1284j = (C1284j) this.f3011a.get(0);
            return (c1284j.f3010b - c1284j.f3009a) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1284j c1284j2 = (C1284j) this.f3011a.get(i2);
            i += (c1284j2.f3010b - c1284j2.f3009a) + 1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX INFO: renamed from: l */
    public final String m3215l(InterfaceC1923I interfaceC1923I) {
        String strM4648a;
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.f3011a;
        if (r1 == 0 || r1.isEmpty()) {
            return "{}";
        }
        if (m3214j() > 1) {
            sb.append("{");
        }
        Iterator it = this.f3011a.iterator();
        while (it.hasNext()) {
            C1284j c1284j = (C1284j) it.next();
            int i = c1284j.f3009a;
            int i2 = c1284j.f3010b;
            String strM4648a2 = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strM4648a2 = "<EOF>";
                } else if (i != -2) {
                    strM4648a2 = ((C1924J) interfaceC1923I).m4648a(i);
                }
                sb.append(strM4648a2);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    if (i3 == -1) {
                        strM4648a = "<EOF>";
                    } else {
                        strM4648a = i3 == -2 ? "<EPSILON>" : ((C1924J) interfaceC1923I).m4648a(i3);
                    }
                    sb.append(strM4648a);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m3214j() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.A.j>] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.f3011a;
        if (r1 == 0 || r1.isEmpty()) {
            return "{}";
        }
        if (m3214j() > 1) {
            sb.append("{");
        }
        Iterator it = this.f3011a.iterator();
        while (it.hasNext()) {
            C1284j c1284j = (C1284j) it.next();
            int i = c1284j.f3009a;
            int i2 = c1284j.f3010b;
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
        if (m3214j() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }
}
