package com.github.catvod.spider.support.p012C0.p017S;

import com.github.catvod.spider.support.C0.P.I;
import com.github.catvod.spider.support.C0.S.f;
import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p014P.InterfaceC0971H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.S.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1003j implements f {

    /* JADX INFO: renamed from: a */
    protected List<C1002i> f2467a;

    /* JADX INFO: renamed from: b */
    protected boolean f2468b;

    static {
        m2521g(0, 1114111).m2530i();
        new C1003j(new int[0]).m2530i();
    }

    public C1003j(int... iArr) {
        this.f2467a = new ArrayList(iArr.length);
        for (int i : iArr) {
            m2523a(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C1003j m2521g(int i, int i2) {
        C1003j c1003j = new C1003j(new int[0]);
        c1003j.m2524b(i, i2);
        return c1003j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX INFO: renamed from: k */
    public static C1003j m2522k(C1003j c1003j, C1003j c1003j2) {
        if (c1003j.m2528f()) {
            return new C1003j(new int[0]);
        }
        C1003j c1003j3 = new C1003j(new int[0]);
        c1003j3.m2525c(c1003j);
        if (!c1003j2.m2528f()) {
            int i = 0;
            int i2 = 0;
            while (i2 < c1003j3.f2467a.size() && i < c1003j2.f2467a.size()) {
                C1002i c1002i = (C1002i) c1003j3.f2467a.get(i2);
                C1002i c1002i2 = (C1002i) c1003j2.f2467a.get(i);
                int i3 = c1002i2.f2466b;
                int i4 = c1002i.f2465a;
                if (i3 >= i4) {
                    int i5 = c1002i2.f2465a;
                    int i6 = c1002i.f2466b;
                    if (i5 <= i6) {
                        C1002i c1002i3 = i5 > i4 ? new C1002i(i4, i5 - 1) : null;
                        C1002i c1002i4 = i3 < i6 ? new C1002i(i3 + 1, i6) : null;
                        Object r6 = c1003j3.f2467a;
                        if (c1002i3 != null) {
                            r6.set(i2, c1002i3);
                            if (c1002i4 != null) {
                                i2++;
                                c1003j3.f2467a.add(i2, c1002i4);
                            }
                        } else if (c1002i4 != null) {
                            r6.set(i2, c1002i4);
                        } else {
                            r6.remove(i2);
                        }
                    }
                    i2++;
                }
                i++;
                i2 = i2;
            }
        }
        return c1003j3;
    }

    /* JADX INFO: renamed from: a */
    public final void m2523a(int i) {
        if (this.f2468b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        m2524b(i, i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    public final void m2524b(int i, int i2) {
        C1002i c1002iM2518b = C1002i.m2518b(i, i2);
        if (this.f2468b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (c1002iM2518b.f2466b < c1002iM2518b.f2465a) {
            return;
        }
        ListIterator<C1002i> listIterator = this.f2467a.listIterator();
        while (listIterator.hasNext()) {
            C1002i next = listIterator.next();
            if (c1002iM2518b.equals(next)) {
                return;
            }
            if ((c1002iM2518b.f2465a == next.f2466b + 1 || c1002iM2518b.f2466b == next.f2465a + (-1)) || !c1002iM2518b.m2519a(next)) {
                C1002i c1002iM2520c = c1002iM2518b.m2520c(next);
                listIterator.set(c1002iM2520c);
                while (listIterator.hasNext()) {
                    C1002i next2 = listIterator.next();
                    if (!(c1002iM2520c.f2465a == next2.f2466b + 1 || c1002iM2520c.f2466b == next2.f2465a + (-1)) && c1002iM2520c.m2519a(next2)) {
                        return;
                    }
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(c1002iM2520c.m2520c(next2));
                    listIterator.next();
                }
                return;
            }
            int i3 = c1002iM2518b.f2465a;
            int i4 = next.f2465a;
            if (i3 < i4 && c1002iM2518b.f2466b < i4) {
                listIterator.previous();
                listIterator.add(c1002iM2518b);
                return;
            }
        }
        this.f2467a.add(c1002iM2518b);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX INFO: renamed from: c */
    public final C1003j m2525c(f fVar) {
        if (fVar != null) {
            if (fVar instanceof C1003j) {
                C1003j c1003j = (C1003j) fVar;
                int size = c1003j.f2467a.size();
                for (int i = 0; i < size; i++) {
                    C1002i c1002i = (C1002i) c1003j.f2467a.get(i);
                    m2524b(c1002i.f2465a, c1002i.f2466b);
                }
            } else {
                C1003j c1003j2 = (C1003j) fVar;
                ArrayList arrayList = new ArrayList();
                int size2 = c1003j2.f2467a.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C1002i c1002i2 = (C1002i) c1003j2.f2467a.get(i2);
                    int i3 = c1002i2.f2465a;
                    int i4 = c1002i2.f2466b;
                    for (int i5 = i3; i5 <= i4; i5++) {
                        arrayList.add(Integer.valueOf(i5));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m2523a(((Integer) it.next()).intValue());
                }
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX INFO: renamed from: d */
    public final boolean m2526d(int i) {
        int size = this.f2467a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C1002i c1002i = (C1002i) this.f2467a.get(i3);
            int i4 = c1002i.f2465a;
            if (c1002i.f2466b < i) {
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX INFO: renamed from: e */
    public final int m2527e() {
        if (m2528f()) {
            throw new RuntimeException("set is empty");
        }
        return ((C1002i) this.f2467a.get(0)).f2465a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1003j)) {
            return false;
        }
        return this.f2467a.equals(((C1003j) obj).f2467a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX INFO: renamed from: f */
    public final boolean m2528f() {
        Object r0 = this.f2467a;
        return r0 == 0 || r0.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX INFO: renamed from: h */
    public final void m2529h() {
        if (this.f2468b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        int size = this.f2467a.size();
        for (int i = 0; i < size; i++) {
            C1002i c1002i = (C1002i) this.f2467a.get(i);
            int i2 = c1002i.f2465a;
            int i3 = c1002i.f2466b;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                this.f2467a.remove(i);
                return;
            }
            if (-2 == i2) {
                c1002i.f2465a = i2 + 1;
                return;
            }
            if (-2 == i3) {
                c1002i.f2466b = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                c1002i.f2466b = -3;
                m2524b(-1, i3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    public final int hashCode() {
        Iterator it = this.f2467a.iterator();
        int iM2379o = 0;
        while (true) {
            int i = iM2379o;
            if (!it.hasNext()) {
                return C0966a.m2368b(i, this.f2467a.size() * 2);
            }
            C1002i c1002i = (C1002i) it.next();
            iM2379o = C0966a.m2379o(C0966a.m2379o(i, c1002i.f2465a), c1002i.f2466b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2530i() {
        boolean z = this.f2468b;
        this.f2468b = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX INFO: renamed from: j */
    public final int m2531j() {
        int size = this.f2467a.size();
        if (size == 1) {
            C1002i c1002i = (C1002i) this.f2467a.get(0);
            return (c1002i.f2466b - c1002i.f2465a) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1002i c1002i2 = (C1002i) this.f2467a.get(i2);
            i += (c1002i2.f2466b - c1002i2.f2465a) + 1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX INFO: renamed from: l */
    public final String m2532l(InterfaceC0971H interfaceC0971H) {
        String strA;
        StringBuilder sb = new StringBuilder();
        Object r0 = this.f2467a;
        if (r0 == 0 || r0.isEmpty()) {
            return "{}";
        }
        if (m2531j() > 1) {
            sb.append("{");
        }
        Iterator it = this.f2467a.iterator();
        while (it.hasNext()) {
            C1002i c1002i = (C1002i) it.next();
            int i = c1002i.f2465a;
            int i2 = c1002i.f2466b;
            String strA2 = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strA2 = "<EOF>";
                } else if (i != -2) {
                    strA2 = ((I) interfaceC0971H).a(i);
                }
                sb.append(strA2);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    if (i3 == -1) {
                        strA = "<EOF>";
                    } else {
                        strA = i3 == -2 ? "<EPSILON>" : ((I) interfaceC0971H).a(i3);
                    }
                    sb.append(strA);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m2531j() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.S.i>] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object r0 = this.f2467a;
        if (r0 == 0 || r0.isEmpty()) {
            return "{}";
        }
        if (m2531j() > 1) {
            sb.append("{");
        }
        Iterator it = this.f2467a.iterator();
        while (it.hasNext()) {
            C1002i c1002i = (C1002i) it.next();
            int i = c1002i.f2465a;
            int i2 = c1002i.f2466b;
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
        if (m2531j() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }
}
