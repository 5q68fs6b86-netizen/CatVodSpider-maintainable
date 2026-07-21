package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.vd */
/* JADX INFO: loaded from: classes.dex */
public class C0685vd extends AbstractC0406kv {
    /* JADX INFO: renamed from: a */
    public static AbstractC0342il m1745a(C0577rd c0577rd, int i) throws IOException {
        int iM1764h = AbstractC0710wb.m1764h(i);
        if (iM1764h == 5) {
            return new C0715wg(c0577rd.m1605ai());
        }
        if (iM1764h == 6) {
            return new C0715wg(new C0484ns(c0577rd.m1605ai()));
        }
        if (iM1764h == 7) {
            return new C0715wg(Boolean.valueOf(c0577rd.m1597aa()));
        }
        if (iM1764h != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0710wb.m1765i(i)));
        }
        c0577rd.m1603ag();
        return aas.f454f;
    }

    /* JADX INFO: renamed from: d */
    public static void m1746d(aag aagVar, AbstractC0342il abstractC0342il) throws IOException {
        if (abstractC0342il == null || (abstractC0342il instanceof aas)) {
            aagVar.m892w();
            return;
        }
        boolean z = abstractC0342il instanceof C0715wg;
        if (z) {
            if (!z) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC0342il);
            }
            C0715wg c0715wg = (C0715wg) abstractC0342il;
            Serializable serializable = c0715wg.f1724f;
            if (serializable instanceof Number) {
                aagVar.m880ad(c0715wg.m1783j());
                return;
            } else if (serializable instanceof Boolean) {
                aagVar.m882af(c0715wg.m1782i());
                return;
            } else {
                aagVar.m881ae(c0715wg.mo1321e());
                return;
            }
        }
        boolean z2 = abstractC0342il instanceof C0813zx;
        if (z2) {
            aagVar.m885p();
            if (!z2) {
                throw new IllegalStateException("Not a JSON Array: " + abstractC0342il);
            }
            Iterator it = ((C0813zx) abstractC0342il).f1923f.iterator();
            while (it.hasNext()) {
                m1746d(aagVar, (AbstractC0342il) it.next());
            }
            aagVar.m888s();
            return;
        }
        if (!(abstractC0342il instanceof C0359jb)) {
            throw new IllegalArgumentException("Couldn't write " + abstractC0342il.getClass());
        }
        aagVar.m886q();
        Iterator it2 = ((C0192cx) abstractC0342il.m1319c().f1030f.entrySet()).iterator();
        while (((C0756xu) it2).hasNext()) {
            adi adiVarM1880g = ((C0756xu) it2).m1880g();
            aagVar.m890u((String) adiVarM1880g.getKey());
            m1746d(aagVar, (AbstractC0342il) adiVarM1880g.getValue());
        }
        aagVar.m889t();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        AbstractC0342il c0813zx;
        AbstractC0342il c0813zx2;
        int iM1607ak = c0577rd.m1607ak();
        int iM1764h = AbstractC0710wb.m1764h(iM1607ak);
        if (iM1764h == 0) {
            c0577rd.m1617p();
            c0813zx = new C0813zx();
        } else if (iM1764h != 2) {
            c0813zx = null;
        } else {
            c0577rd.m1618q();
            c0813zx = new C0359jb();
        }
        if (c0813zx == null) {
            return m1745a(c0577rd, iM1607ak);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c0577rd.m1625x()) {
                String strM1601ae = c0813zx instanceof C0359jb ? c0577rd.m1601ae() : null;
                int iM1607ak2 = c0577rd.m1607ak();
                int iM1764h2 = AbstractC0710wb.m1764h(iM1607ak2);
                if (iM1764h2 == 0) {
                    c0577rd.m1617p();
                    c0813zx2 = new C0813zx();
                } else if (iM1764h2 != 2) {
                    c0813zx2 = null;
                } else {
                    c0577rd.m1618q();
                    c0813zx2 = new C0359jb();
                }
                boolean z = c0813zx2 != null;
                if (c0813zx2 == null) {
                    c0813zx2 = m1745a(c0577rd, iM1607ak2);
                }
                if (c0813zx instanceof C0813zx) {
                    ((C0813zx) c0813zx).f1923f.add(c0813zx2);
                } else {
                    C0359jb c0359jb = (C0359jb) c0813zx;
                    c0359jb.getClass();
                    c0359jb.f1030f.put(strM1601ae, c0813zx2);
                }
                if (z) {
                    arrayDeque.addLast(c0813zx);
                    c0813zx = c0813zx2;
                }
            } else {
                if (c0813zx instanceof C0813zx) {
                    c0577rd.m1621t();
                } else {
                    c0577rd.m1622u();
                }
                if (arrayDeque.isEmpty()) {
                    return c0813zx;
                }
                c0813zx = (AbstractC0342il) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo901c(aag aagVar, Object obj) throws IOException {
        m1746d(aagVar, (AbstractC0342il) obj);
    }
}
