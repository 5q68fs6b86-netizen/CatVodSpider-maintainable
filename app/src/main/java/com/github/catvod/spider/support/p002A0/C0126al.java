package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.al */
/* JADX INFO: loaded from: classes.dex */
public final class C0126al extends AbstractC0782yt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f657a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f658b;

    public C0126al(Method method, int i) {
        this.f657a = method;
        this.f658b = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0782yt
    /* JADX INFO: renamed from: c */
    public final Object mo922c(Class cls) {
        String strM1869d = C0742xg.m1869d(cls);
        if (strM1869d == null) {
            return this.f657a.invoke(null, cls, Integer.valueOf(this.f658b));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM1869d));
    }
}
