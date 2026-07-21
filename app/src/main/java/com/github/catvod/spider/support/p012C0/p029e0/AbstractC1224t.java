package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1049h;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1224t extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    protected final int f2893a;

    /* JADX INFO: renamed from: b */
    protected final int f2894b;

    public AbstractC1224t(int i, int i2) {
        this.f2893a = i;
        this.f2894b = i2;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        C1053l c1053lM2709f0 = c1053l2.m2709f0();
        if (c1053lM2709f0 != null && !(c1053lM2709f0 instanceof C1049h)) {
            int iMo2997b = mo2997b(c1053l2);
            int i = this.f2893a;
            if (i == 0) {
                return iMo2997b == this.f2894b;
            }
            int i2 = iMo2997b - this.f2894b;
            if (i2 * i >= 0 && i2 % i == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    protected abstract int mo2997b(C1053l c1053l);

    /* JADX INFO: renamed from: c */
    protected abstract String mo2998c();

    public String toString() {
        if (this.f2893a == 0) {
            return String.format(":%s(%d)", mo2998c(), Integer.valueOf(this.f2894b));
        }
        return this.f2894b == 0 ? String.format(":%s(%dn)", mo2998c(), Integer.valueOf(this.f2893a)) : String.format(":%s(%dn%+d)", mo2998c(), Integer.valueOf(this.f2893a), Integer.valueOf(this.f2894b));
    }
}
