package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.xs */
/* JADX INFO: loaded from: classes.dex */
public final class C0754xs extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        long j;
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        C0589rp c0589rp = new C0589rp();
        for (C0226ed c0226ed : c0676uv.m1735d().f1438a) {
            Stack stack = c0676uv.f1588b;
            C0580rg c0580rg = new C0580rg();
            c0580rg.f1439b = false;
            C0589rp c0589rp2 = new C0589rp();
            c0580rg.f1438a = c0589rp2;
            c0589rp2.add(c0226ed);
            c0580rg.f1440c = c0676uv.m1735d();
            stack.push(c0580rg);
            C0133as c0133as = (C0133as) ((C0383jz) m1631k(C0383jz.class)).mo874b(c0676uv);
            stack.pop();
            Serializable serializable = c0133as.f673a;
            if (serializable instanceof Number) {
                long jLongValue = c0133as.m1014h().longValue();
                long j2 = 0;
                if (jLongValue < 0) {
                    if (Objects.equals(c0226ed.f771g.f589b, "JX_TEXT")) {
                        String strMo1228au = c0226ed.mo1228au("EL_SAME_TAG_ALL_NUM");
                        j = ((long) (AbstractC0273fx.m1237c(strMo1228au) ? -1 : Integer.parseInt(strMo1228au))) + jLongValue + 1;
                        jLongValue = 1;
                    } else {
                        C0580rg c0580rgM1735d = c0676uv.m1735d();
                        C0589rp c0589rp3 = new C0589rp();
                        C0226ed c0226ed2 = (C0226ed) c0226ed.f846ap;
                        String str = c0226ed.f771g.f589b;
                        c0226ed2.getClass();
                        AbstractC0711wc.m1768c(str);
                        for (C0226ed c0226ed3 : AbstractC0149bh.m1024a(new C0242et(AbstractC0552qf.m1582d(str), 9, false), c0226ed2)) {
                            if (c0580rgM1735d.f1438a.contains(c0226ed3)) {
                                c0589rp3.add(c0226ed3);
                            }
                        }
                        long size = ((long) c0589rp3.size()) + jLongValue;
                        jLongValue = 1;
                        j = size + 1;
                        j2 = 0;
                    }
                    if (j >= j2) {
                        jLongValue = j;
                    }
                }
                if (Objects.equals(c0226ed.f771g.f589b, "JX_TEXT")) {
                    String strMo1228au2 = c0226ed.mo1228au("EL_SAME_TAG_INDEX");
                    if (jLongValue == (AbstractC0273fx.m1237c(strMo1228au2) ? -1 : Integer.parseInt(strMo1228au2))) {
                        c0589rp.add(c0226ed);
                    }
                } else {
                    C0580rg c0580rgM1735d2 = c0676uv.m1735d();
                    C0226ed c0226ed4 = (C0226ed) c0226ed.f846ap;
                    c0226ed4.getClass();
                    int i = 1;
                    for (C0226ed c0226ed5 : new C0589rp(c0226ed4.m1181z())) {
                        if (c0226ed.f771g.f589b.equals(c0226ed5.f771g.f589b) && c0580rgM1735d2.f1438a.contains(c0226ed5)) {
                            if (c0226ed.equals(c0226ed5)) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (jLongValue == i) {
                        c0589rp.add(c0226ed);
                    }
                }
            } else if (serializable instanceof Boolean) {
                if (c0133as.m1011e().booleanValue()) {
                    c0589rp.add(c0226ed);
                }
            } else if (serializable instanceof String) {
                if (!AbstractC0273fx.m1237c(c0133as.m1015i())) {
                    c0589rp.add(c0226ed);
                }
            } else if (!(serializable instanceof C0589rp)) {
                if (!(serializable instanceof List)) {
                    throw new C0649tv("unknown expr val:" + c0133as);
                }
                if (((List) serializable).size() > 0) {
                    c0589rp.add(c0226ed);
                }
            } else if (((C0589rp) serializable).size() > 0) {
                c0589rp.add(c0226ed);
            }
        }
        return C0133as.m1010d(c0589rp);
    }
}
