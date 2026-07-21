package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.rf */
/* JADX INFO: loaded from: classes.dex */
public class C0579rf implements InterfaceC0256fg {

    /* JADX INFO: renamed from: d */
    public static final C0579rf f1434d;

    /* JADX INFO: renamed from: e */
    public final C0579rf f1435e;

    /* JADX INFO: renamed from: f */
    public int f1436f;

    /* JADX INFO: renamed from: g */
    public ArrayList f1437g;

    static {
        C0579rf c0579rf = new C0579rf();
        c0579rf.f1436f = -1;
        f1434d = c0579rf;
    }

    public C0579rf(int i, C0579rf c0579rf) {
        this.f1435e = c0579rf;
        this.f1436f = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public Object mo874b(C0676uv c0676uv) {
        return c0676uv.m1737f(this);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: c */
    public final String mo1128c() {
        if (m1630j() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m1630j(); i++) {
            sb.append(m1629i(i).mo1128c());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final void m1628h(InterfaceC0207dl interfaceC0207dl) {
        if (this.f1437g == null) {
            this.f1437g = new ArrayList();
        }
        this.f1437g.add(interfaceC0207dl);
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0207dl m1629i(int i) {
        ArrayList arrayList = this.f1437g;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (InterfaceC0207dl) this.f1437g.get(i);
    }

    /* JADX INFO: renamed from: j */
    public final int m1630j() {
        ArrayList arrayList = this.f1437g;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final C0579rf m1631k(Class cls) {
        ArrayList arrayList = this.f1437g;
        InterfaceC0207dl interfaceC0207dl = null;
        if (arrayList != null && arrayList.size() > 0) {
            for (InterfaceC0207dl interfaceC0207dl2 : this.f1437g) {
                if (cls.isInstance(interfaceC0207dl2)) {
                    interfaceC0207dl = (InterfaceC0207dl) cls.cast(interfaceC0207dl2);
                    break;
                }
            }
        }
        return (C0579rf) interfaceC0207dl;
    }

    /* JADX INFO: renamed from: l */
    public final List m1632l(Class cls) {
        ArrayList<InterfaceC0207dl> arrayList = this.f1437g;
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = null;
        for (InterfaceC0207dl interfaceC0207dl : arrayList) {
            if (cls.isInstance(interfaceC0207dl)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(cls.cast(interfaceC0207dl));
            }
        }
        return arrayList2 == null ? Collections.emptyList() : arrayList2;
    }

    /* JADX INFO: renamed from: m */
    public final C0451mm m1633m(int i) {
        ArrayList arrayList = this.f1437g;
        if (arrayList != null && arrayList.size() > 0) {
            for (InterfaceC0207dl interfaceC0207dl : this.f1437g) {
                if (interfaceC0207dl instanceof C0451mm) {
                    C0451mm c0451mm = (C0451mm) interfaceC0207dl;
                    if (c0451mm.f1235a.f1544a == i) {
                        return c0451mm;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1634n() {
        return this.f1436f == -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        C0579rf c0579rf = this;
        while (c0579rf != null) {
            if (!c0579rf.m1634n()) {
                sb.append(c0579rf.f1436f);
            }
            c0579rf = c0579rf.f1435e;
            if (c0579rf != null && !c0579rf.m1634n()) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
