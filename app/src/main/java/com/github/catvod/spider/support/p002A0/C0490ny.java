package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ny */
/* JADX INFO: loaded from: classes.dex */
public final class C0490ny extends AbstractC0782yt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f1297a;

    public C0490ny(Method method) {
        this.f1297a = method;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0782yt
    /* JADX INFO: renamed from: c */
    public final Object mo922c(Class cls) {
        String strM1869d = C0742xg.m1869d(cls);
        if (strM1869d == null) {
            return this.f1297a.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM1869d));
    }
}
