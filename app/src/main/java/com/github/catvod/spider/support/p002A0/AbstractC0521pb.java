package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.pb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0521pb extends C0150bi implements InterfaceC0747xl, InterfaceC0779yq {

    /* JADX INFO: renamed from: ak */
    public final InterfaceC0769yg f1357ak;

    /* JADX INFO: renamed from: al */
    public final InterfaceC0769yg f1358al;

    public AbstractC0521pb(InterfaceC0769yg interfaceC0769yg, boolean z) {
        super(z);
        this.f1358al = interfaceC0769yg;
        this.f1357ak = interfaceC0769yg.plus(this);
    }

    @Override // com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: ad */
    public final void mo1030ad(Object obj) {
        if (obj instanceof C0647tt) {
            Throwable th = ((C0647tt) obj).f1565c;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: ae */
    public final void mo1031ae() {
        mo1511an();
    }

    /* JADX INFO: renamed from: am */
    public final void m1510am() {
        m1051x((InterfaceC0483nr) this.f1358al.get(InterfaceC0483nr.f1290aj));
    }

    /* JADX INFO: renamed from: an */
    public void mo1511an() {
    }

    @Override // com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: b */
    public String mo1021b() {
        boolean z = AbstractC0772yj.f1835a;
        return super.mo1021b();
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0747xl
    public final InterfaceC0769yg getContext() {
        return this.f1357ak;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: l */
    public final String mo1039l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0747xl
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thM1752b = C0705vx.m1752b(obj);
        if (thM1752b != null) {
            obj = new C0647tt(thM1752b, false);
        }
        Object objM1027aa = m1027aa(obj);
        if (objM1027aa == AbstractC0745xj.f1805b) {
            return;
        }
        mo964i(objM1027aa);
    }

    @Override // com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: w */
    public final void mo1050w(C0649tv c0649tv) {
        AbstractC0151bj.m1054a(this.f1357ak, c0649tv);
    }
}
