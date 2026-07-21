package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.xg */
/* JADX INFO: loaded from: classes.dex */
public final class C0742xg {

    /* JADX INFO: renamed from: a */
    public final Map f1800a;

    /* JADX INFO: renamed from: b */
    public final boolean f1801b;

    /* JADX INFO: renamed from: c */
    public final List f1802c;

    public C0742xg(Map map, boolean z, List list) {
        this.f1800a = map;
        this.f1801b = z;
        this.f1802c = list;
    }

    /* JADX INFO: renamed from: d */
    public static String m1869d(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0656ub m1870e(C0259fj c0259fj) {
        C0738xc c0738xc;
        String str;
        InterfaceC0656ub c0737xb;
        int i = 1;
        int i2 = 0;
        Type type = c0259fj.f828b;
        Map map = this.f1800a;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        Class cls = c0259fj.f827a;
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        C0372jo c0372jo = null;
        if (EnumSet.class.isAssignableFrom(cls)) {
            c0738xc = new C0738xc(type, 0);
        } else {
            c0738xc = cls == EnumMap.class ? new C0738xc(type, 1) : null;
        }
        if (c0738xc != null) {
            return c0738xc;
        }
        AbstractC0791zb.m1910b(this.f1802c);
        if (Modifier.isAbstract(cls.getModifiers())) {
            c0737xb = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                acs acsVar = AbstractC0173ce.f703a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + AbstractC0173ce.m1067c(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + AbstractC0173ce.m1070f(e);
                }
                c0737xb = str != null ? new C0737xb(str, 2) : new C0736xa(i, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                c0737xb = null;
            }
        }
        if (c0737xb != null) {
            return c0737xb;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                c0372jo = new C0372jo(11);
            } else if (Set.class.isAssignableFrom(cls)) {
                c0372jo = new C0372jo(12);
            } else {
                c0372jo = Queue.class.isAssignableFrom(cls) ? new C0372jo(13) : new C0372jo(14);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                c0372jo = new C0372jo(15);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                c0372jo = new C0372jo(16);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                c0372jo = new C0372jo(17);
            } else {
                c0372jo = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new C0259fj(((ParameterizedType) type).getActualTypeArguments()[0]).f827a)) ? new C0372jo(19) : new C0372jo(18);
            }
        }
        if (c0372jo != null) {
            return c0372jo;
        }
        String strM1869d = m1869d(cls);
        if (strM1869d != null) {
            return new C0737xb(strM1869d, 1);
        }
        if (this.f1801b) {
            return new C0736xa(i2, cls);
        }
        String str2 = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str2 = str2 + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new C0737xb(str2, 0);
    }

    public final String toString() {
        return this.f1800a.toString();
    }
}
