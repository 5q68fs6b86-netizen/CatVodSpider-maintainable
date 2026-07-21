package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public final class aax extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        boolean z;
        C0133as c0133as;
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        if (((C0486nu) m1631k(C0486nu.class)) != null && !((C0486nu) m1631k(C0486nu.class)).m1634n()) {
            return (C0133as) ((C0486nu) m1631k(C0486nu.class)).mo874b(c0676uv);
        }
        boolean z2 = false;
        if (((C0587rn) m1631k(C0587rn.class)) == null || ((C0587rn) m1631k(C0587rn.class)).m1634n() || (c0133as = (C0133as) ((C0587rn) m1631k(C0587rn.class)).mo874b(c0676uv)) == null) {
            z = false;
        } else {
            Serializable serializable = c0133as.f673a;
            if (serializable instanceof C0589rp) {
                c0676uv.m1736e((C0589rp) serializable);
            } else if (c0133as.f674b) {
                z = true;
                z2 = true;
            }
            z = true;
        }
        if (((C0505om) m1631k(C0505om.class)) != null && !((C0505om) m1631k(C0505om.class)).m1634n()) {
            C0133as c0133as2 = (C0133as) ((C0505om) m1631k(C0505om.class)).mo874b(c0676uv);
            if (z2) {
                C0589rp c0589rp = c0676uv.m1735d().f1438a;
                String strM1015i = c0133as2.m1015i();
                if (!c0676uv.m1735d().f1439b) {
                    if (c0589rp.size() == 1) {
                        return C0133as.m1010d(c0676uv.m1735d().m1635d().mo1228au(strM1015i));
                    }
                    LinkedList linkedList = new LinkedList();
                    Iterator<E> it = c0589rp.iterator();
                    while (it.hasNext()) {
                        linkedList.add(((C0226ed) it.next()).mo1228au(strM1015i));
                    }
                    return C0133as.m1010d(linkedList);
                }
                if (c0589rp.size() == 1) {
                    C0589rp c0589rpM1166ah = c0676uv.m1735d().m1635d().m1166ah("[" + strM1015i + "]");
                    LinkedList linkedList2 = new LinkedList();
                    Iterator<E> it2 = c0589rpM1166ah.iterator();
                    while (it2.hasNext()) {
                        linkedList2.add(((C0226ed) it2.next()).mo1228au(strM1015i));
                    }
                    return C0133as.m1010d(linkedList2);
                }
                C0589rp c0589rp2 = new C0589rp();
                Iterator<E> it3 = c0589rp.iterator();
                while (it3.hasNext()) {
                    c0589rp2.addAll(((C0226ed) it3.next()).m1166ah("[" + strM1015i + "]"));
                }
                LinkedList linkedList3 = new LinkedList();
                Iterator<E> it4 = c0589rp2.iterator();
                while (it4.hasNext()) {
                    linkedList3.add(((C0226ed) it4.next()).mo1228au(strM1015i));
                }
                return C0133as.m1010d(linkedList3);
            }
            if (c0133as2.f675c) {
                String strM1015i2 = c0133as2.m1015i();
                C0589rp c0589rp3 = c0676uv.m1735d().f1438a;
                if (c0676uv.m1735d().f1439b) {
                    c0676uv.m1736e(c0589rp3.m1644e(strM1015i2));
                } else {
                    C0589rp c0589rp4 = new C0589rp();
                    for (C0226ed c0226ed : c0676uv.m1735d().f1438a) {
                        if (!z) {
                            c0226ed.getClass();
                            for (C0226ed c0226ed2 : new C0589rp(c0226ed.m1181z())) {
                                if (c0226ed2.mo924s().equals(strM1015i2) || Marker.ANY_MARKER.equals(strM1015i2)) {
                                    c0589rp4.add(c0226ed2);
                                }
                            }
                        } else if (c0226ed.mo924s().equals(strM1015i2) || Marker.ANY_MARKER.equals(strM1015i2)) {
                            c0589rp4.add(c0226ed);
                        }
                    }
                    c0676uv.m1736e(c0589rp4);
                }
            } else {
                Serializable serializable2 = c0133as2.f673a;
                if (!(serializable2 instanceof C0589rp)) {
                    return c0133as2;
                }
                c0676uv.m1736e((C0589rp) serializable2);
            }
        }
        if (m1632l(C0754xs.class) != null && m1632l(C0754xs.class).size() > 0) {
            Iterator it5 = m1632l(C0754xs.class).iterator();
            while (it5.hasNext()) {
                c0676uv.m1736e((C0589rp) ((C0133as) ((C0754xs) it5.next()).mo874b(c0676uv)).f673a);
            }
        }
        return C0133as.m1010d(c0676uv.m1735d().f1438a);
    }
}
