package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.jh */
/* JADX INFO: loaded from: classes.dex */
public final class C0365jh implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: a */
    public final Type f1032a;

    /* JADX INFO: renamed from: b */
    public final Type f1033b;

    /* JADX INFO: renamed from: c */
    public final Type[] f1034c;

    public C0365jh(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type == null && (type2 instanceof Class)) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException("Must specify owner type for " + type2);
            }
        }
        this.f1032a = type == null ? null : AbstractC0534po.m1515b(type);
        this.f1033b = AbstractC0534po.m1515b(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f1034c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f1034c[i]);
            AbstractC0534po.m1516c(this.f1034c[i]);
            Type[] typeArr3 = this.f1034c;
            typeArr3[i] = AbstractC0534po.m1515b(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC0534po.m1517d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f1034c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f1032a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f1033b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f1034c) ^ this.f1033b.hashCode();
        Type type = this.f1032a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f1034c;
        int length = typeArr.length;
        Type type = this.f1033b;
        if (length == 0) {
            return AbstractC0534po.m1522i(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC0534po.m1522i(type));
        sb.append("<");
        sb.append(AbstractC0534po.m1522i(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC0534po.m1522i(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
