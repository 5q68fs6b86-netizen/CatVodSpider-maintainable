package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.xx */
/* JADX INFO: loaded from: classes.dex */
public final class C0759xx extends EnumC0416le {
    public C0759xx() {
        super("InSelectInTable", 16);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        boolean zM1744n = abstractC0680uz.m1744n();
        String[] strArr = AbstractC0702vu.f1615ah;
        if (zM1744n && AbstractC0727ws.m1847i(((C0708w) abstractC0680uz).f1730d, strArr)) {
            c0801zl.m1922as(this);
            c0801zl.m1943bn("select");
            c0801zl.m1953bx();
            return c0801zl.m1945bp(abstractC0680uz);
        }
        if (abstractC0680uz.m1743m()) {
            C0667um c0667um = (C0667um) abstractC0680uz;
            if (AbstractC0727ws.m1847i(c0667um.f1730d, strArr)) {
                c0801zl.m1922as(this);
                if (!c0801zl.m1931bb(c0667um.f1730d)) {
                    return false;
                }
                c0801zl.m1943bn("select");
                c0801zl.m1953bx();
                return c0801zl.m1945bp(abstractC0680uz);
            }
        }
        return EnumC0416le.f1143r.mo1058a(abstractC0680uz, c0801zl);
    }
}
