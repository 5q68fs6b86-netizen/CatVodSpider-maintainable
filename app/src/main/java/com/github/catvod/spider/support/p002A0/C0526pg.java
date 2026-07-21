package com.github.catvod.spider.support.p002A0;

import java.util.RandomAccess;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.pg */
/* JADX INFO: loaded from: classes.dex */
public final class C0526pg extends AbstractC0527ph implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final AbstractC0527ph f1363a;

    /* JADX INFO: renamed from: b */
    public final int f1364b;

    /* JADX INFO: renamed from: c */
    public final int f1365c;

    public C0526pg(AbstractC0527ph abstractC0527ph, int i, int i2) {
        this.f1363a = abstractC0527ph;
        this.f1364b = i;
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int size = abstractC0527ph.size();
        c0523pd.getClass();
        C0523pd.m1514c(i, i2, size);
        this.f1365c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f1365c;
        c0523pd.getClass();
        C0523pd.m1512a(i, i2);
        return this.f1363a.get(this.f1364b + i);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0520pa
    public final int getSize() {
        return this.f1365c;
    }
}
