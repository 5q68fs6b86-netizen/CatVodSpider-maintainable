package com.github.catvod.spider.support.p137w;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p134t.C2306E;
import com.github.catvod.spider.support.p134t.InterfaceC2305D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.w.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2407i implements InterfaceC2403e {

    /* JADX INFO: renamed from: a */
    protected List<C2406h> f5964a;

    /* JADX INFO: renamed from: b */
    protected boolean f5965b;

    static {
        m6414g(0, 1114111).m6423i();
        new C2407i(new int[0]).m6423i();
    }

    public C2407i(int... iArr) {
        this.f5964a = new ArrayList(iArr.length);
        for (int i : iArr) {
            m6416a(i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C2407i m6414g(int i, int i2) {
        C2407i c2407i = new C2407i(new int[0]);
        c2407i.m6417b(i, i2);
        return c2407i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX INFO: renamed from: k */
    public static C2407i m6415k(C2407i c2407i, C2407i c2407i2) {
        int i = 0;
        if (c2407i.m6421f()) {
            return new C2407i(new int[0]);
        }
        C2407i c2407i3 = new C2407i(new int[0]);
        c2407i3.m6418c(c2407i);
        if (!c2407i2.m6421f()) {
            int i2 = 0;
            while (i < c2407i3.f5964a.size() && i2 < c2407i2.f5964a.size()) {
                C2406h c2406h = (C2406h) c2407i3.f5964a.get(i);
                C2406h c2406h2 = (C2406h) c2407i2.f5964a.get(i2);
                int i3 = c2406h2.f5963b;
                int i4 = c2406h.f5962a;
                if (i3 >= i4) {
                    int i5 = c2406h2.f5962a;
                    int i6 = c2406h.f5963b;
                    if (i5 <= i6) {
                        C2406h c2406h3 = i5 > i4 ? new C2406h(i4, i5 - 1) : null;
                        C2406h c2406h4 = i3 < i6 ? new C2406h(i3 + 1, i6) : null;
                        Object r2 = c2407i3.f5964a;
                        if (c2406h3 != null) {
                            r2.set(i, c2406h3);
                            if (c2406h4 != null) {
                                i++;
                                c2407i3.f5964a.add(i, c2406h4);
                            }
                        } else if (c2406h4 != null) {
                            r2.set(i, c2406h4);
                        } else {
                            r2.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return c2407i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m6416a(int i) {
        if (this.f5965b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        m6417b(i, i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    public final void m6417b(int i, int i2) {
        C2406h c2406hM6411b = C2406h.m6411b(i, i2);
        if (this.f5965b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (c2406hM6411b.f5963b < c2406hM6411b.f5962a) {
            return;
        }
        ListIterator<C2406h> listIterator = this.f5964a.listIterator();
        while (listIterator.hasNext()) {
            C2406h next = listIterator.next();
            if (c2406hM6411b.equals(next)) {
                return;
            }
            boolean z = true;
            if ((c2406hM6411b.f5962a == next.f5963b + 1 || c2406hM6411b.f5963b == next.f5962a - 1) || !c2406hM6411b.m6412a(next)) {
                C2406h c2406hM6413c = c2406hM6411b.m6413c(next);
                listIterator.set(c2406hM6413c);
                while (listIterator.hasNext()) {
                    C2406h next2 = listIterator.next();
                    if (!(c2406hM6413c.f5962a == next2.f5963b + 1 || c2406hM6413c.f5963b == next2.f5962a - 1) && c2406hM6413c.m6412a(next2)) {
                        return;
                    }
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(c2406hM6413c.m6413c(next2));
                    listIterator.next();
                }
                return;
            }
            int i3 = c2406hM6411b.f5962a;
            int i4 = next.f5962a;
            if (i3 >= i4 || c2406hM6411b.f5963b >= i4) {
                z = false;
            }
            if (z) {
                listIterator.previous();
                listIterator.add(c2406hM6411b);
                return;
            }
        }
        this.f5964a.add(c2406hM6411b);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX INFO: renamed from: c */
    public final C2407i m6418c(InterfaceC2403e interfaceC2403e) {
        if (interfaceC2403e == null) {
            return this;
        }
        int i = 0;
        if (interfaceC2403e instanceof C2407i) {
            C2407i c2407i = (C2407i) interfaceC2403e;
            int size = c2407i.f5964a.size();
            while (i < size) {
                C2406h c2406h = (C2406h) c2407i.f5964a.get(i);
                m6417b(c2406h.f5962a, c2406h.f5963b);
                i++;
            }
        } else {
            C2407i c2407i2 = (C2407i) interfaceC2403e;
            ArrayList arrayList = new ArrayList();
            int size2 = c2407i2.f5964a.size();
            while (i < size2) {
                C2406h c2406h2 = (C2406h) c2407i2.f5964a.get(i);
                int i2 = c2406h2.f5963b;
                for (int i3 = c2406h2.f5962a; i3 <= i2; i3++) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i++;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m6416a(((Integer) it.next()).intValue());
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX INFO: renamed from: d */
    public final boolean m6419d(int i) {
        int size = this.f5964a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C2406h c2406h = (C2406h) this.f5964a.get(i3);
            int i4 = c2406h.f5962a;
            if (c2406h.f5963b < i) {
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX INFO: renamed from: e */
    public final int m6420e() {
        if (m6421f()) {
            throw new RuntimeException("set is empty");
        }
        return ((C2406h) this.f5964a.get(0)).f5962a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2407i)) {
            return false;
        }
        return this.f5964a.equals(((C2407i) obj).f5964a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX INFO: renamed from: f */
    public final boolean m6421f() {
        Object r0 = this.f5964a;
        return r0 == 0 || r0.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX INFO: renamed from: h */
    public final void m6422h() {
        if (this.f5965b) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        int size = this.f5964a.size();
        for (int i = 0; i < size; i++) {
            C2406h c2406h = (C2406h) this.f5964a.get(i);
            int i2 = c2406h.f5962a;
            int i3 = c2406h.f5963b;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                this.f5964a.remove(i);
                return;
            }
            if (-2 == i2) {
                c2406h.f5962a = i2 + 1;
                return;
            }
            if (-2 == i3) {
                c2406h.f5963b = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                c2406h.f5963b = -3;
                m6417b(-1, i3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    public final int hashCode() {
        int iM3168h = 0;
        for (C2406h c2406h : this.f5964a) {
            iM3168h = C1273a.m3168h(C1273a.m3168h(iM3168h, c2406h.f5962a), c2406h.f5963b);
        }
        return C1273a.m3160b(iM3168h, this.f5964a.size() * 2);
    }

    /* JADX INFO: renamed from: i */
    public final void m6423i() {
        boolean z = this.f5965b;
        this.f5965b = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX INFO: renamed from: j */
    public final int m6424j() {
        int size = this.f5964a.size();
        if (size == 1) {
            C2406h c2406h = (C2406h) this.f5964a.get(0);
            return (c2406h.f5963b - c2406h.f5962a) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C2406h c2406h2 = (C2406h) this.f5964a.get(i2);
            i += (c2406h2.f5963b - c2406h2.f5962a) + 1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX INFO: renamed from: l */
    public final String m6425l(InterfaceC2305D interfaceC2305D) {
        String strM6223a;
        StringBuilder sb = new StringBuilder();
        Object r1 = this.f5964a;
        if (r1 == 0 || r1.isEmpty()) {
            return "{}";
        }
        if (m6424j() > 1) {
            sb.append("{");
        }
        Iterator it = this.f5964a.iterator();
        while (it.hasNext()) {
            C2406h c2406h = (C2406h) it.next();
            int i = c2406h.f5962a;
            int i2 = c2406h.f5963b;
            String strM6223a2 = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strM6223a2 = "<EOF>";
                } else if (i != -2) {
                    strM6223a2 = ((C2306E) interfaceC2305D).m6223a(i);
                }
                sb.append(strM6223a2);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    if (i3 == -1) {
                        strM6223a = "<EOF>";
                    } else {
                        strM6223a = i3 == -2 ? "<EPSILON>" : ((C2306E) interfaceC2305D).m6223a(i3);
                    }
                    sb.append(strM6223a);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m6424j() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.w.h>] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object r1 = this.f5964a;
        if (r1 == 0 || r1.isEmpty()) {
            return "{}";
        }
        if (m6424j() > 1) {
            sb.append("{");
        }
        Iterator it = this.f5964a.iterator();
        while (it.hasNext()) {
            C2406h c2406h = (C2406h) it.next();
            int i = c2406h.f5962a;
            int i2 = c2406h.f5963b;
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
        if (m6424j() > 1) {
            sb.append("}");
        }
        return sb.toString();
    }
}
