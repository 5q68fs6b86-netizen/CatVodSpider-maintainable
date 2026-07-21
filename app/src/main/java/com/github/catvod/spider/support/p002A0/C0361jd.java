package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Stack;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.jd */
/* JADX INFO: loaded from: classes.dex */
public final class C0361jd extends C0579rf {

    /* JADX INFO: renamed from: a */
    public C0642to f1031a;

    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        if (((ada) m1631k(ada.class)) == null && !((ada) m1631k(ada.class)).m1634n()) {
            return (C0133as) ((C0361jd) m1631k(C0361jd.class)).mo874b(c0676uv);
        }
        C0133as c0133as = (C0133as) ((ada) m1631k(ada.class)).mo874b(c0676uv);
        if (this.f1031a != null) {
            Stack stack = c0676uv.f1588b;
            C0580rg c0580rg = c0676uv.m1735d().f1440c;
            C0580rg c0580rg2 = new C0580rg(c0580rg.f1438a);
            c0580rg2.f1440c = c0580rg;
            stack.push(c0580rg2);
            C0133as c0133as2 = (C0133as) ((C0361jd) m1631k(C0361jd.class)).mo874b(c0676uv);
            stack.pop();
            Serializable serializable = c0133as.f673a;
            if (!(serializable instanceof C0589rp)) {
                if (serializable instanceof String) {
                    if (!(c0133as2.f673a instanceof C0589rp)) {
                        return C0133as.m1010d(c0133as.m1015i() + c0133as2.m1015i());
                    }
                    C0226ed c0226ed = new C0226ed("V");
                    String strM1015i = c0133as.m1015i();
                    AbstractC0711wc.m1770e(strM1015i);
                    c0226ed.m1180y(new C0706vy(strM1015i));
                    ((C0589rp) c0133as2.f673a).add(c0226ed);
                    return c0133as2;
                }
                if (serializable instanceof Boolean) {
                    Serializable serializable2 = c0133as2.f673a;
                    if (serializable2 instanceof Boolean) {
                        return C0133as.m1010d(Boolean.valueOf(c0133as2.m1011e().booleanValue() | c0133as.m1011e().booleanValue()));
                    }
                    if (serializable2 instanceof C0589rp) {
                        C0226ed c0226ed2 = new C0226ed("V");
                        String strM1015i2 = c0133as.m1015i();
                        AbstractC0711wc.m1770e(strM1015i2);
                        c0226ed2.m1180y(new C0706vy(strM1015i2));
                        ((C0589rp) c0133as2.f673a).add(c0226ed2);
                        return c0133as2;
                    }
                    if (serializable2 instanceof String) {
                        return C0133as.m1010d(c0133as.m1011e() + c0133as2.m1015i());
                    }
                    throw new C0649tv("can not merge val1=" + c0133as.m1011e() + ",val2=" + c0133as2.m1015i());
                }
                if (!(serializable instanceof Number)) {
                    LinkedList linkedList = new LinkedList();
                    if (!AbstractC0273fx.m1237c(c0133as.m1015i())) {
                        linkedList.add(c0133as.m1015i());
                    }
                    if (!AbstractC0273fx.m1237c(c0133as2.m1015i())) {
                        linkedList.add(c0133as2.m1015i());
                    }
                    return C0133as.m1010d(AbstractC0273fx.m1239e(linkedList, ","));
                }
                Serializable serializable3 = c0133as2.f673a;
                if (serializable3 instanceof String) {
                    return C0133as.m1010d(c0133as.m1013g() + c0133as2.m1015i());
                }
                if (!(serializable3 instanceof C0589rp)) {
                    throw new C0649tv("can not merge val1=" + c0133as.m1013g() + ",val2=" + c0133as2.m1015i());
                }
                C0226ed c0226ed3 = new C0226ed("V");
                String strM1015i3 = c0133as.m1015i();
                AbstractC0711wc.m1770e(strM1015i3);
                c0226ed3.m1180y(new C0706vy(strM1015i3));
                ((C0589rp) c0133as2.f673a).add(c0226ed3);
                return c0133as2;
            }
            Serializable serializable4 = c0133as2.f673a;
            if (serializable4 instanceof C0589rp) {
                ((C0589rp) serializable).addAll((C0589rp) serializable4);
            } else {
                C0226ed c0226ed4 = new C0226ed("V");
                String strM1015i4 = c0133as2.m1015i();
                AbstractC0711wc.m1770e(strM1015i4);
                c0226ed4.m1180y(new C0706vy(strM1015i4));
                ((C0589rp) c0133as.f673a).add(c0226ed4);
            }
        }
        return c0133as;
    }
}
