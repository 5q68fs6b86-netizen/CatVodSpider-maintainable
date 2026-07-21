package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.so */
/* JADX INFO: loaded from: classes.dex */
public final class C0615so implements InterfaceC0578re, InterfaceC0614sn {

    /* JADX INFO: renamed from: a */
    public static final Map f1498a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f1499b;

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f1500c;

    /* JADX INFO: renamed from: d */
    public final Class f1501d;

    static {
        List listM1567c = AbstractC0548qb.m1567c(new Class[]{InterfaceC0264fo.class, InterfaceC0569qw.class, InterfaceC0304ha.class, InterfaceC0384k.class, InterfaceC0271fv.class, InterfaceC0165bx.class, InterfaceC0158bq.class, InterfaceC0570qx.class, InterfaceC0120af.class, InterfaceC0330i.class, InterfaceC0197db.class, InterfaceC0307hd.class, InterfaceC0320hq.class, InterfaceC0798zi.class, InterfaceC0248ez.class, aap.class, InterfaceC0302gz.class, InterfaceC0349is.class, InterfaceC0796zg.class, InterfaceC0439ma.class, InterfaceC0596rw.class, InterfaceC0492o.class, InterfaceC0163bv.class});
        ArrayList<C0344in> arrayList = new ArrayList(AbstractC0625sy.m1711m(listM1567c));
        int i = 0;
        for (Object obj : listM1567c) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C0344in((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        Map mapSingletonMap = C0229eg.f776a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                mapSingletonMap = new LinkedHashMap(AbstractC0711wc.m1767b(arrayList.size()));
                for (C0344in c0344in : arrayList) {
                    mapSingletonMap.put(c0344in.f1014a, c0344in.f1015b);
                }
            } else {
                C0344in c0344in2 = (C0344in) arrayList.get(0);
                AbstractC0399ko.m1351f("pair", c0344in2);
                mapSingletonMap = Collections.singletonMap(c0344in2.f1014a, c0344in2.f1015b);
                AbstractC0399ko.m1350e("singletonMap(...)", mapSingletonMap);
            }
        }
        f1498a = mapSingletonMap;
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC0399ko.m1350e("<get-values>(...)", collectionValues);
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0399ko.m1348c(str);
            sb.append(AbstractC0198dc.m1113u(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Object __en : f1498a.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f1499b = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0711wc.m1767b(map3.size()));
        for (Object __en : map3.entrySet()) { Map.Entry entry2 = (Map.Entry) __en;
            linkedHashMap.put(entry2.getKey(), AbstractC0198dc.m1113u((String) entry2.getValue()));
        }
        f1500c = linkedHashMap;
    }

    public C0615so(Class cls) {
        this.f1501d = cls;
    }

    /* JADX INFO: renamed from: e */
    public final String m1689e() {
        String str;
        Class cls = this.f1501d;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f1500c;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC0198dc.m1112t(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return AbstractC0198dc.m1112t(simpleName, enclosingConstructor.getName() + '$');
        }
        int iM1099g = AbstractC0198dc.m1099g(simpleName, '$', 0, 6);
        if (iM1099g == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iM1099g + 1, simpleName.length());
        AbstractC0399ko.m1350e("substring(...)", strSubstring);
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0615so) && AbstractC0199dd.m1118c(this).equals(AbstractC0199dd.m1118c((InterfaceC0578re) obj));
    }

    public final int hashCode() {
        return AbstractC0199dd.m1118c(this).hashCode();
    }

    public final String toString() {
        return this.f1501d.toString() + " (Kotlin reflection is not available)";
    }
}
