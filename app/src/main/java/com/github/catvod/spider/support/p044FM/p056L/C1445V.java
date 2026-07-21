package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.V */
/* JADX INFO: loaded from: classes.dex */
final class C1445V extends EnumC1484j1 {
    C1445V() {
        super("RcdataLessthanSign", 10, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        if (c1455a.m3647E('/')) {
            c1441t.m3623i();
            c1441t.m3616a(EnumC1484j1.f3445l);
            return;
        }
        if (!c1455a.m3650H() || c1441t.m3617b() == null || c1455a.m3676t(c1441t.m3618c())) {
            c1441t.m3626l("<");
            enumC1484j1 = EnumC1484j1.f3427c;
        } else {
            AbstractC1432O abstractC1432OM3622h = c1441t.m3622h(false);
            abstractC1432OM3622h.m3584v(c1441t.m3617b());
            c1441t.f3354k = abstractC1432OM3622h;
            c1441t.m3630p();
            enumC1484j1 = EnumC1484j1.f3437h;
        }
        c1441t.m3636v(enumC1484j1);
    }
}
