package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.fj */
/* JADX INFO: loaded from: classes.dex */
public class C0259fj<T> {

    /* JADX INFO: renamed from: a */
    public final Class f827a;

    /* JADX INFO: renamed from: b */
    public final Type f828b;

    /* JADX INFO: renamed from: c */
    public final int f829c;

    public C0259fj() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C0259fj.class) {
                Type typeM1515b = AbstractC0534po.m1515b(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    m1216d(typeM1515b);
                }
                this.f828b = typeM1515b;
                this.f827a = AbstractC0534po.m1520g(typeM1515b);
                this.f829c = typeM1515b.hashCode();
                return;
            }
        } else if (genericSuperclass == C0259fj.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public C0259fj(Type type) {
        Objects.requireNonNull(type);
        Type typeM1515b = AbstractC0534po.m1515b(type);
        this.f828b = typeM1515b;
        this.f827a = AbstractC0534po.m1520g(typeM1515b);
        this.f829c = typeM1515b.hashCode();
    }

    /* JADX INFO: renamed from: d */
    public static void m1216d(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            m1216d(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                m1216d(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                m1216d(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            m1216d(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            m1216d(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0259fj) {
            if (AbstractC0534po.m1517d(this.f828b, ((C0259fj) obj).f828b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f829c;
    }

    public final String toString() {
        return AbstractC0534po.m1522i(this.f828b);
    }
}
