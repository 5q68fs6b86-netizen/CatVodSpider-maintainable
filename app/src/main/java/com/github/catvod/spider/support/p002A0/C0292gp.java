package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.gp */
/* JADX INFO: loaded from: classes.dex */
public final class C0292gp extends C0368jk {

    /* JADX INFO: renamed from: a */
    public final C0287gk f869a;

    /* JADX INFO: renamed from: b */
    public final boolean f870b;

    public C0292gp(C0292gp c0292gp, AbstractC0428lq abstractC0428lq) {
        super(c0292gp, abstractC0428lq, c0292gp.f1048g, c0292gp.f1050i);
        this.f869a = c0292gp.f869a;
        this.f870b = m1256c(c0292gp, abstractC0428lq);
    }

    public C0292gp(C0292gp c0292gp, AbstractC0428lq abstractC0428lq, C0287gk c0287gk) {
        super(c0292gp, abstractC0428lq, c0292gp.f1048g, c0292gp.f1050i);
        this.f869a = c0287gk;
        this.f870b = m1256c(c0292gp, abstractC0428lq);
    }

    public C0292gp(C0292gp c0292gp, AbstractC0428lq abstractC0428lq, AbstractC0753xr abstractC0753xr) {
        super(c0292gp, abstractC0428lq, abstractC0753xr, c0292gp.f1050i);
        this.f869a = c0292gp.f869a;
        this.f870b = m1256c(c0292gp, abstractC0428lq);
    }

    public C0292gp(AbstractC0428lq abstractC0428lq, int i, C0215dt c0215dt) {
        super(abstractC0428lq, i, c0215dt, AbstractC0687vf.f1592e);
        this.f870b = false;
        this.f869a = null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1256c(C0292gp c0292gp, AbstractC0428lq abstractC0428lq) {
        return c0292gp.f870b || ((abstractC0428lq instanceof acc) && ((acc) abstractC0428lq).f550m);
    }

    @Override // com.github.catvod.spider.support.p002A0.C0368jk
    /* JADX INFO: renamed from: d */
    public final boolean mo1257d(C0368jk c0368jk) {
        boolean zEquals = true;
        if (this == c0368jk) {
            return true;
        }
        if (!(c0368jk instanceof C0292gp)) {
            return false;
        }
        C0292gp c0292gp = (C0292gp) c0368jk;
        if (this.f870b != c0292gp.f870b) {
            return false;
        }
        C0287gk c0287gk = this.f869a;
        C0287gk c0287gk2 = c0292gp.f869a;
        if (c0287gk != null) {
            zEquals = c0287gk.equals(c0287gk2);
        } else if (c0287gk2 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.mo1257d(c0368jk);
        }
        return false;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0368jk
    public final int hashCode() {
        return AbstractC0534po.m1518e(AbstractC0534po.m1524k(AbstractC0534po.m1523j(AbstractC0534po.m1524k(AbstractC0534po.m1524k(AbstractC0534po.m1523j(AbstractC0534po.m1523j(7, this.f1046e.f1164e), this.f1047f), this.f1048g), this.f1050i), this.f870b ? 1 : 0), this.f869a), 6);
    }
}
