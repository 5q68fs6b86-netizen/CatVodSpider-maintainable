package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.pz */
/* JADX INFO: loaded from: classes.dex */
public class C0545pz implements InterfaceC0698vq {
    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0698vq
    /* JADX INFO: renamed from: a */
    public final AbstractC0406kv mo934a(C0493oa c0493oa, C0259fj c0259fj) {
        Type type = c0259fj.f828b;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C0547qa(c0493oa, c0493oa.m1471aa(new C0259fj(genericComponentType)), AbstractC0534po.m1520g(genericComponentType));
    }
}
