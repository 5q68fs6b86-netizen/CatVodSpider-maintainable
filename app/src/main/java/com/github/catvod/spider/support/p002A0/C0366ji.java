package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ji */
/* JADX INFO: loaded from: classes.dex */
public final class C0366ji implements WildcardType, Serializable {

    /* JADX INFO: renamed from: a */
    public final Type f1035a;

    /* JADX INFO: renamed from: b */
    public final Type f1036b;

    public C0366ji(Type[] typeArr, Type[] typeArr2) {
        AbstractC0584rk.m1636a(typeArr2.length <= 1);
        AbstractC0584rk.m1636a(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC0534po.m1516c(typeArr[0]);
            this.f1036b = null;
            this.f1035a = AbstractC0534po.m1515b(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC0534po.m1516c(typeArr2[0]);
        AbstractC0584rk.m1636a(typeArr[0] == Object.class);
        this.f1036b = AbstractC0534po.m1515b(typeArr2[0]);
        this.f1035a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC0534po.m1517d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f1036b;
        return type != null ? new Type[]{type} : AbstractC0534po.f1371a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f1035a};
    }

    public final int hashCode() {
        Type type = this.f1036b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f1035a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f1036b;
        if (type != null) {
            return "? super " + AbstractC0534po.m1522i(type);
        }
        Type type2 = this.f1035a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC0534po.m1522i(type2);
    }
}
