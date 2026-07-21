package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.fl */
/* JADX INFO: loaded from: classes.dex */
public final class C0261fl implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: a */
    public final Type f830a;

    public C0261fl(Type type) {
        Objects.requireNonNull(type);
        this.f830a = AbstractC0534po.m1515b(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC0534po.m1517d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f830a;
    }

    public final int hashCode() {
        return this.f830a.hashCode();
    }

    public final String toString() {
        return AbstractC0534po.m1522i(this.f830a) + "[]";
    }
}
