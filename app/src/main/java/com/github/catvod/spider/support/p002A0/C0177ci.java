package com.github.catvod.spider.support.p002A0;

import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ci */
/* JADX INFO: loaded from: classes.dex */
public final class C0177ci extends C0579rf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f711a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0177ci(C0579rf c0579rf, int i, int i2) {
        super(i, c0579rf);
        this.f711a = i2;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        switch (this.f711a) {
            case 0:
                if (!(c0676uv instanceof C0676uv)) {
                    return c0676uv.m1737f(this);
                }
                List listM1632l = m1632l(ade.class);
                if (listM1632l.size() == 1) {
                    return (C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv);
                }
                Double dM1013g = ((C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv)).m1013g();
                String strMo1128c = null;
                for (int i = 1; i < m1630j(); i++) {
                    InterfaceC0207dl interfaceC0207dlM1629i = m1629i(i);
                    if (interfaceC0207dlM1629i instanceof ade) {
                        C0133as c0133as = (C0133as) ((ade) interfaceC0207dlM1629i).mo874b(c0676uv);
                        if (Marker.ANY_NON_NULL_MARKER.equals(strMo1128c)) {
                            dM1013g = Double.valueOf(c0133as.m1013g().doubleValue() + dM1013g.doubleValue());
                        } else {
                            if (!"-".equals(strMo1128c)) {
                                throw new C0649tv("syntax error, " + mo1128c());
                            }
                            dM1013g = Double.valueOf(dM1013g.doubleValue() - c0133as.m1013g().doubleValue());
                        }
                    } else {
                        strMo1128c = interfaceC0207dlM1629i.mo1128c();
                    }
                }
                return C0133as.m1010d(dM1013g);
            default:
                return c0676uv instanceof C0676uv ? (C0133as) ((C0383jz) m1631k(C0383jz.class)).mo874b(c0676uv) : c0676uv.m1737f(this);
        }
    }
}
