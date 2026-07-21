package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class abo extends AbstractC0782yt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f533b;

    public abo(Method method, Object obj) {
        this.f532a = method;
        this.f533b = obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0782yt
    /* JADX INFO: renamed from: c */
    public final Object mo922c(Class cls) {
        String strM1869d = C0742xg.m1869d(cls);
        if (strM1869d == null) {
            return this.f532a.invoke(this.f533b, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM1869d));
    }
}
