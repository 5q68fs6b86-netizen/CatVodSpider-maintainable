package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.er */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0240er extends AbstractC0775ym {

    /* JADX INFO: renamed from: m */
    public long f789m;

    /* JADX INFO: renamed from: n */
    public boolean f790n;

    /* JADX INFO: renamed from: o */
    public C0544py f791o;

    /* JADX INFO: renamed from: p */
    public static void m1198p(long j, AbstractRunnableC0494ob abstractRunnableC0494ob) {
        acj.f562x.m1152l(j, abstractRunnableC0494ob);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1147f();

    /* JADX INFO: renamed from: q */
    public final void m1199q() {
        long j = this.f789m - 4294967296L;
        this.f789m = j;
        if (j <= 0 && this.f790n) {
            mo1147f();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1200r(acw acwVar) {
        C0544py c0544py = this.f791o;
        if (c0544py == null) {
            c0544py = new C0544py();
            c0544py.f1386a = new Object[16];
            this.f791o = c0544py;
        }
        Object[] objArr = c0544py.f1386a;
        int i = c0544py.f1388c;
        objArr[i] = acwVar;
        int length = (objArr.length - 1) & (i + 1);
        c0544py.f1388c = length;
        int i2 = c0544py.f1387b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            AbstractC0548qb.m1570f(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = c0544py.f1386a;
            int length3 = objArr3.length;
            int i3 = c0544py.f1387b;
            AbstractC0548qb.m1570f(objArr3, objArr2, length3 - i3, 0, i3, 4);
            c0544py.f1386a = objArr2;
            c0544py.f1387b = 0;
            c0544py.f1388c = length2;
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract Thread mo948s();

    /* JADX INFO: renamed from: t */
    public final void m1201t(boolean z) {
        this.f789m = (z ? 4294967296L : 1L) + this.f789m;
        if (z) {
            return;
        }
        this.f790n = true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1202u() {
        C0544py c0544py = this.f791o;
        if (c0544py == null) {
            return false;
        }
        int i = c0544py.f1387b;
        Object obj = null;
        if (i != c0544py.f1388c) {
            Object[] objArr = c0544py.f1386a;
            Object obj2 = objArr[i];
            objArr[i] = null;
            c0544py.f1387b = (i + 1) & (objArr.length - 1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T");
            }
            obj = obj2;
        }
        acw acwVar = (acw) obj;
        if (acwVar == null) {
            return false;
        }
        acwVar.run();
        return true;
    }
}
