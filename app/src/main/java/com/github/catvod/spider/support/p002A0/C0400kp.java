package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.kp */
/* JADX INFO: loaded from: classes.dex */
public final class C0400kp extends AbstractC0426lo {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0656ub f1104a;

    public C0400kp(InterfaceC0656ub interfaceC0656ub, C0688vg c0688vg) {
        super(c0688vg);
        this.f1104a = interfaceC0656ub;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0426lo
    /* JADX INFO: renamed from: d */
    public final Object mo1356d() {
        return this.f1104a.mo1338m();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0426lo
    /* JADX INFO: renamed from: e */
    public final Object mo1357e(Object obj) {
        return obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0426lo
    /* JADX INFO: renamed from: f */
    public final void mo1358f(Object obj, C0577rd c0577rd, C0379jv c0379jv) throws IllegalAccessException {
        Object objMo900b = c0379jv.f1092f.mo900b(c0577rd);
        if (objMo900b == null && c0379jv.f1093g) {
            return;
        }
        Field field = c0379jv.f1088b;
        if (!c0379jv.f1094h) {
            field.set(obj, objMo900b);
            return;
        }
        throw new C0765yc("Cannot set value of 'static final' " + AbstractC0173ce.m1069e(field, false));
    }
}
