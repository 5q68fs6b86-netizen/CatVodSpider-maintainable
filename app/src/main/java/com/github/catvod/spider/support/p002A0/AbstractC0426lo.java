package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.lo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0426lo extends AbstractC0406kv {

    /* JADX INFO: renamed from: g */
    public final C0688vg f1162g;

    public AbstractC0426lo(C0688vg c0688vg) {
        this.f1162g = c0688vg;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        Object objMo1356d = mo1356d();
        Map map = this.f1162g.f1594b;
        try {
            c0577rd.m1618q();
            while (c0577rd.m1625x()) {
                C0379jv c0379jv = (C0379jv) map.get(c0577rd.m1601ae());
                if (c0379jv == null) {
                    c0577rd.m1614ar();
                } else {
                    mo1358f(objMo1356d, c0577rd, c0379jv);
                }
            }
            c0577rd.m1622u();
            return mo1357e(objMo1356d);
        } catch (IllegalAccessException e) {
            acs acsVar = AbstractC0173ce.f703a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new C0765yc(e2);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        if (obj == null) {
            aagVar.m892w();
            return;
        }
        aagVar.m886q();
        try {
            Iterator it = this.f1162g.f1595c.iterator();
            while (it.hasNext()) {
                ((C0379jv) it.next()).m1342i(aagVar, obj);
            }
            aagVar.m889t();
        } catch (IllegalAccessException e) {
            acs acsVar = AbstractC0173ce.f703a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo1356d();

    /* JADX INFO: renamed from: e */
    public abstract Object mo1357e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract void mo1358f(Object obj, C0577rd c0577rd, C0379jv c0379jv);
}
