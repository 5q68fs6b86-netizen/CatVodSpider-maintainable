package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1566v extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    protected final int f3514a;

    /* JADX INFO: renamed from: b */
    protected final int f3515b;

    public AbstractC1566v(int i, int i2) {
        this.f3514a = i;
        this.f3515b = i2;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        C1393m c1393mM3473k0 = c1393m2.m3473k0();
        if (c1393mM3473k0 != null && !(c1393mM3473k0 instanceof C1388h)) {
            int iMo3767b = mo3767b(c1393m2);
            int i = this.f3514a;
            if (i == 0) {
                return iMo3767b == this.f3515b;
            }
            int i2 = iMo3767b - this.f3515b;
            if (i2 * i >= 0 && i2 % i == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    protected abstract int mo3767b(C1393m c1393m);

    /* JADX INFO: renamed from: c */
    protected abstract String mo3768c();

    public String toString() {
        if (this.f3514a == 0) {
            return String.format(":%s(%d)", mo3768c(), Integer.valueOf(this.f3515b));
        }
        return this.f3515b == 0 ? String.format(":%s(%dn)", mo3768c(), Integer.valueOf(this.f3514a)) : String.format(":%s(%dn%+d)", mo3768c(), Integer.valueOf(this.f3514a), Integer.valueOf(this.f3515b));
    }
}
