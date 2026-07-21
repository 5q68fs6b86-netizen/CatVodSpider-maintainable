package com.github.catvod.spider.support.p002A0;

import com.base.model.proto.DramaDetailProto;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zd */
/* JADX INFO: loaded from: classes.dex */
public final class C0793zd extends C0579rf {

    /* JADX INFO: renamed from: a */
    public C0642to f1869a;

    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        List listM1632l = m1632l(C0177ci.class);
        if (listM1632l.size() == 1) {
            return (C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv);
        }
        if (listM1632l.size() != 2) {
            throw new C0649tv("error equalityExpr near:" + mo1128c());
        }
        C0133as c0133as = (C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv);
        C0133as c0133as2 = (C0133as) ((InterfaceC0207dl) listM1632l.get(1)).mo874b(c0676uv);
        switch (this.f1869a.f1544a) {
            case 24:
                return C0133as.m1010d(Boolean.valueOf(c0133as.compareTo(c0133as2) < 0));
            case 25:
                return C0133as.m1010d(Boolean.valueOf(c0133as.compareTo(c0133as2) > 0));
            case 26:
                return C0133as.m1010d(Boolean.valueOf(c0133as.compareTo(c0133as2) <= 0));
            case 27:
                return C0133as.m1010d(Boolean.valueOf(c0133as.compareTo(c0133as2) >= 0));
            case 28:
            case 29:
            default:
                throw new C0649tv("unknown operator" + this.f1869a.m1720j());
            case 30:
                return C0133as.m1010d(Boolean.valueOf(c0133as.m1015i().startsWith(c0133as2.m1015i())));
            case 31:
                return C0133as.m1010d(Boolean.valueOf(c0133as.m1015i().endsWith(c0133as2.m1015i())));
            case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                return C0133as.m1010d(Boolean.valueOf(c0133as.m1015i().contains(c0133as2.m1015i())));
            case 33:
                return C0133as.m1010d(Boolean.valueOf(c0133as.m1015i().matches(c0133as2.m1015i())));
            case 34:
                return C0133as.m1010d(Boolean.valueOf(!c0133as.m1015i().matches(c0133as2.m1015i())));
        }
    }
}
