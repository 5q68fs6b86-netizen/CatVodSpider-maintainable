package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.jk */
/* JADX INFO: loaded from: classes.dex */
public class C0368jk {

    /* JADX INFO: renamed from: e */
    public final AbstractC0428lq f1046e;

    /* JADX INFO: renamed from: f */
    public final int f1047f;

    /* JADX INFO: renamed from: g */
    public AbstractC0753xr f1048g;

    /* JADX INFO: renamed from: h */
    public int f1049h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0687vf f1050i;

    public C0368jk(C0368jk c0368jk, AbstractC0428lq abstractC0428lq, AbstractC0753xr abstractC0753xr, AbstractC0687vf abstractC0687vf) {
        this.f1046e = abstractC0428lq;
        this.f1047f = c0368jk.f1047f;
        this.f1048g = abstractC0753xr;
        this.f1050i = abstractC0687vf;
        this.f1049h = c0368jk.f1049h;
    }

    public C0368jk(AbstractC0428lq abstractC0428lq, int i, AbstractC0753xr abstractC0753xr) {
        this(abstractC0428lq, i, abstractC0753xr, AbstractC0687vf.f1592e);
    }

    public C0368jk(AbstractC0428lq abstractC0428lq, int i, AbstractC0753xr abstractC0753xr, AbstractC0687vf abstractC0687vf) {
        this.f1046e = abstractC0428lq;
        this.f1047f = i;
        this.f1048g = abstractC0753xr;
        this.f1050i = abstractC0687vf;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo1257d(C0368jk c0368jk) {
        AbstractC0753xr abstractC0753xr;
        AbstractC0753xr abstractC0753xr2;
        if (this == c0368jk) {
            return true;
        }
        return c0368jk != null && this.f1046e.f1164e == c0368jk.f1046e.f1164e && this.f1047f == c0368jk.f1047f && ((abstractC0753xr = this.f1048g) == (abstractC0753xr2 = c0368jk.f1048g) || (abstractC0753xr != null && abstractC0753xr.equals(abstractC0753xr2))) && this.f1050i.equals(c0368jk.f1050i) && m1328j() == c0368jk.m1328j();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0368jk) {
            return mo1257d((C0368jk) obj);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC0534po.m1518e(AbstractC0534po.m1524k(AbstractC0534po.m1524k(AbstractC0534po.m1523j(AbstractC0534po.m1523j(7, this.f1046e.f1164e), this.f1047f), this.f1048g), this.f1050i), 4);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1328j() {
        return (this.f1049h & 1073741824) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f1046e);
        sb.append(",");
        sb.append(this.f1047f);
        if (this.f1048g != null) {
            sb.append(",[");
            sb.append(this.f1048g.toString());
            sb.append("]");
        }
        AbstractC0687vf abstractC0687vf = this.f1050i;
        if (abstractC0687vf != null && abstractC0687vf != AbstractC0687vf.f1592e) {
            sb.append(",");
            sb.append(abstractC0687vf);
        }
        if ((this.f1049h & (-1073741825)) > 0) {
            sb.append(",up=");
            sb.append(this.f1049h & (-1073741825));
        }
        sb.append(')');
        return sb.toString();
    }
}
