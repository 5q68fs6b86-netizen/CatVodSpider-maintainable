package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.jl */
/* JADX INFO: loaded from: classes.dex */
public final class C0369jl extends AbstractC0760xy {

    /* JADX INFO: renamed from: a */
    public static final C0369jl f1051a = new C0369jl(0);

    /* JADX INFO: renamed from: b */
    public static final C0369jl f1052b = new C0369jl(1);

    /* JADX INFO: renamed from: c */
    public static final C0369jl f1053c = new C0369jl(2);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1054d;

    public /* synthetic */ C0369jl(int i) {
        this.f1054d = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0760xy
    /* JADX INFO: renamed from: e */
    public final boolean mo1329e(Object obj, Object obj2) {
        switch (this.f1054d) {
            case 0:
                C0368jk c0368jk = (C0368jk) obj;
                C0368jk c0368jk2 = (C0368jk) obj2;
                if (c0368jk == c0368jk2) {
                    return true;
                }
                return c0368jk2 != null && c0368jk.f1046e.f1164e == c0368jk2.f1046e.f1164e && c0368jk.f1047f == c0368jk2.f1047f && c0368jk.f1050i.equals(c0368jk2.f1050i);
            case 1:
                return obj.equals(obj2);
            default:
                C0368jk c0368jk3 = (C0368jk) obj;
                C0368jk c0368jk4 = (C0368jk) obj2;
                if (c0368jk3 == c0368jk4) {
                    return true;
                }
                return c0368jk4 != null && c0368jk3.f1046e.f1164e == c0368jk4.f1046e.f1164e && c0368jk3.f1048g.equals(c0368jk4.f1048g);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0760xy
    /* JADX INFO: renamed from: f */
    public final int mo1330f(Object obj) {
        switch (this.f1054d) {
            case 0:
                C0368jk c0368jk = (C0368jk) obj;
                return c0368jk.f1050i.hashCode() + ((((217 + c0368jk.f1046e.f1164e) * 31) + c0368jk.f1047f) * 31);
            case 1:
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            default:
                C0368jk c0368jk2 = (C0368jk) obj;
                return AbstractC0534po.m1518e(AbstractC0534po.m1524k(AbstractC0534po.m1523j(7, c0368jk2.f1046e.f1164e), c0368jk2.f1048g), 2);
        }
    }
}
