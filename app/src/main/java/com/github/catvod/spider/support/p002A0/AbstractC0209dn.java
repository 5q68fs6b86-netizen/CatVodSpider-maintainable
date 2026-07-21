package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.dn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0209dn extends AbstractC0664uj {

    /* JADX INFO: renamed from: a */
    public aci f735a = new aci();

    /* JADX INFO: renamed from: b */
    public final C0643tp f736b;

    /* JADX INFO: renamed from: c */
    public final C0734wz f737c;

    /* JADX INFO: renamed from: d */
    public C0579rf f738d;

    /* JADX INFO: renamed from: e */
    public final boolean f739e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f740f;

    /* JADX INFO: renamed from: g */
    public boolean f741g;

    static {
        new WeakHashMap();
    }

    public AbstractC0209dn(C0643tp c0643tp) {
        C0734wz c0734wz = new C0734wz();
        this.f737c = c0734wz;
        c0734wz.m1855d(0);
        this.f739e = true;
        this.f736b = null;
        this.f735a.m940j();
        this.f738d = null;
        this.f741g = false;
        ArrayList arrayList = this.f740f;
        if (arrayList != null && arrayList.remove((Object) null) && this.f740f.isEmpty()) {
            this.f740f = null;
        }
        Arrays.fill(c0734wz.f1774b, 0, c0734wz.f1775c, 0);
        c0734wz.f1775c = 0;
        c0734wz.m1855d(0);
        AbstractC0414lc abstractC0414lc = this.f1571r;
        if (abstractC0414lc != null) {
            abstractC0414lc.mo1219i();
        }
        this.f736b = c0643tp;
    }

    /* JADX INFO: renamed from: h */
    public final void m1129h() {
        C0642to c0642toM1133l = m1133l();
        if (c0642toM1133l.f1544a != -1) {
            this.f736b.m1722g();
        }
        ArrayList arrayList = this.f740f;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (this.f739e || z) {
            if (this.f735a.f556a) {
                C0579rf c0579rf = this.f738d;
                C0216du c0216du = new C0216du(c0642toM1133l);
                c0579rf.getClass();
                c0579rf.m1628h(c0216du);
                ArrayList arrayList2 = this.f740f;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0574ra) it.next()).getClass();
                    }
                    return;
                }
                return;
            }
            C0579rf c0579rf2 = this.f738d;
            C0451mm c0451mm = new C0451mm(c0642toM1133l);
            c0579rf2.getClass();
            c0579rf2.m1628h(c0451mm);
            ArrayList arrayList3 = this.f740f;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    ((AbstractC0574ra) it2.next()).getClass();
                    c0451mm.f1235a.toString();
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1130i(C0579rf c0579rf) {
        C0579rf c0579rf2;
        C0579rf c0579rf3;
        if (this.f739e && (c0579rf2 = this.f738d) != c0579rf && (c0579rf3 = c0579rf2.f1435e) != null) {
            ArrayList arrayList = c0579rf3.f1437g;
            if (arrayList != null) {
                arrayList.remove(arrayList.size() - 1);
            }
            c0579rf3.m1628h(c0579rf);
        }
        this.f738d = c0579rf;
    }

    /* JADX INFO: renamed from: j */
    public final void m1131j(int i, C0579rf c0579rf) {
        C0579rf c0579rf2;
        C0579rf c0579rf3;
        this.f1572s = i;
        this.f738d = c0579rf;
        this.f736b.m1721f(1);
        if (this.f739e && (c0579rf3 = (c0579rf2 = this.f738d).f1435e) != null) {
            c0579rf3.m1628h(c0579rf2);
        }
        ArrayList arrayList = this.f740f;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1132k() {
        int size;
        if (this.f741g) {
            C0579rf c0579rf = this.f738d;
            this.f736b.m1721f(1);
            c0579rf.getClass();
        } else {
            C0579rf c0579rf2 = this.f738d;
            this.f736b.m1721f(-1);
            c0579rf2.getClass();
        }
        ArrayList arrayList = this.f740f;
        if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
            this.f738d.getClass();
            throw null;
        }
        C0579rf c0579rf3 = this.f738d;
        this.f1572s = c0579rf3.f1436f;
        this.f738d = c0579rf3.f1435e;
    }

    /* JADX INFO: renamed from: l */
    public final C0642to m1133l() {
        return this.f736b.m1721f(1);
    }

    /* JADX INFO: renamed from: m */
    public final C0339ii m1134m() {
        return C0720wl.f1744y.m1325k(this.f1572s, this.f738d);
    }

    /* JADX INFO: renamed from: n */
    public final C0642to m1135n(int i) {
        C0642to c0642toM1133l = m1133l();
        if (c0642toM1133l.f1544a == i) {
            if (i == -1) {
                this.f741g = true;
            }
            this.f735a.m940j();
            m1129h();
        } else {
            c0642toM1133l = this.f735a.mo942l((C0720wl) this);
            if (this.f739e && c0642toM1133l.f1550g == -1) {
                C0579rf c0579rf = this.f738d;
                C0216du c0216du = new C0216du(c0642toM1133l);
                c0579rf.getClass();
                c0579rf.m1628h(c0216du);
            }
        }
        return c0642toM1133l;
    }

    /* JADX INFO: renamed from: o */
    public final void m1136o(C0642to c0642to, String str, AbstractC0346ip abstractC0346ip) {
        int i = c0642to.f1545b;
        int i2 = c0642to.f1546c;
        C0764yb c0764yb = this.f1570q;
        if (c0764yb == null) {
            throw new NullPointerException("delegates");
        }
        Iterator it = c0764yb.iterator();
        while (it.hasNext()) {
            ((C0718wj) it.next()).m1802e(this, c0642to, i, i2, str, abstractC0346ip);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1137p(int i) {
        C0734wz c0734wz = this.f737c;
        int i2 = c0734wz.f1775c;
        int i3 = i2 - 1;
        if (i3 < 0 || i3 >= i2) {
            throw new IndexOutOfBoundsException();
        }
        return i >= c0734wz.f1774b[i3];
    }
}
