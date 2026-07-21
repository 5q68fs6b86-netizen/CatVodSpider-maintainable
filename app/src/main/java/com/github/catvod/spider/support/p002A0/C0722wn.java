package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.wn */
/* JADX INFO: loaded from: classes.dex */
public static final class C0722wn extends EnumC0416le {
    public C0722wn() {
        super("InCell", 14);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        boolean zM1743m = abstractC0680uz.m1743m();
        C0155bn c0155bn = EnumC0416le.f1134i;
        if (!zM1743m) {
            if (!abstractC0680uz.m1744n() || !AbstractC0727ws.m1847i(((C0708w) abstractC0680uz).f1730d, AbstractC0702vu.f1646z)) {
                return c0155bn.mo1058a(abstractC0680uz, c0801zl);
            }
            if (!c0801zl.m1931bb("td") && !c0801zl.m1931bb("th")) {
                c0801zl.m1922as(this);
                return false;
            }
            if (c0801zl.m1931bb("td")) {
                c0801zl.m1946bq("td");
            } else {
                c0801zl.m1946bq("th");
            }
            return c0801zl.m1945bp(abstractC0680uz);
        }
        String str = ((C0667um) abstractC0680uz).f1730d;
        if (!AbstractC0727ws.m1847i(str, AbstractC0702vu.f1643w)) {
            if (AbstractC0727ws.m1847i(str, AbstractC0702vu.f1644x)) {
                c0801zl.m1922as(this);
                return false;
            }
            if (!AbstractC0727ws.m1847i(str, AbstractC0702vu.f1645y)) {
                return c0155bn.mo1058a(abstractC0680uz, c0801zl);
            }
            if (!c0801zl.m1931bb(str)) {
                c0801zl.m1922as(this);
                return false;
            }
            if (c0801zl.m1931bb("td")) {
                c0801zl.m1946bq("td");
            } else {
                c0801zl.m1946bq("th");
            }
            return c0801zl.m1945bp(abstractC0680uz);
        }
        boolean zM1931bb = c0801zl.m1931bb(str);
        C0799zj c0799zj = EnumC0416le.f1141p;
        if (!zM1931bb) {
            c0801zl.m1922as(this);
            c0801zl.f1902v = c0799zj;
            return false;
        }
        c0801zl.m1924au(false);
        if (!c0801zl.m1920aq(str)) {
            c0801zl.m1922as(this);
        }
        c0801zl.m1943bn(str);
        c0801zl.m1914ak();
        c0801zl.f1902v = c0799zj;
        return true;
    }
}
