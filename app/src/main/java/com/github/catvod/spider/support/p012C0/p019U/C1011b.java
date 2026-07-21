package com.github.catvod.spider.support.p012C0.p019U;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p019U.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1011b {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Class<?>> f2472a;

    /* JADX INFO: renamed from: b */
    private static final Map<Class<?>, Class<?>> f2473b;

    /* JADX INFO: renamed from: c */
    private static final Map<Class<?>, Class<?>> f2474c;

    /* JADX INFO: renamed from: d */
    private static final Map<String, String> f2475d;

    /* JADX INFO: renamed from: e */
    public static final int f2476e = 0;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    static {
        HashMap map = new HashMap();
        f2472a = map;
        Class cls = Boolean.TYPE;
        map.put("boolean", cls);
        map.put("byte", Byte.TYPE);
        map.put("char", Character.TYPE);
        map.put("short", Short.TYPE);
        Class cls2 = Integer.TYPE;
        map.put("int", cls2);
        Class cls3 = Long.TYPE;
        map.put("long", cls3);
        map.put("double", Double.TYPE);
        Class cls4 = Float.TYPE;
        map.put("float", cls4);
        map.put("void", Void.TYPE);
        HashMap map2 = new HashMap();
        f2473b = map2;
        map2.put(cls, Boolean.class);
        map2.put(Byte.TYPE, Byte.class);
        map2.put(Character.TYPE, Character.class);
        map2.put(Short.TYPE, Short.class);
        map2.put(cls2, Integer.class);
        map2.put(cls3, Long.class);
        map2.put(Double.TYPE, Double.class);
        map2.put(cls4, Float.class);
        Class cls5 = Void.TYPE;
        map2.put(cls5, cls5);
        f2474c = new HashMap();
        for (Object __en_entry : map2.entrySet()) { Map.Entry entry = (Map.Entry) __en_entry;
            Class<?> cls6 = (Class) entry.getKey();
            Class<?> cls7 = (Class) entry.getValue();
            if (!cls6.equals(cls7)) {
                f2474c.put(cls7, cls6);
            }
        }
        HashMap map3 = new HashMap();
        map3.put("int", "I");
        map3.put("boolean", "Z");
        map3.put("float", "F");
        map3.put("long", "J");
        map3.put("short", "S");
        map3.put("byte", "B");
        map3.put("double", "D");
        map3.put("char", "C");
        HashMap map4 = new HashMap();
        for (Object __en_entry2 : map3.entrySet()) { Map.Entry entry2 = (Map.Entry) __en_entry2;
            map4.put(entry2.getValue(), entry2.getKey());
        }
        Collections.unmodifiableMap(map3);
        f2475d = Collections.unmodifiableMap(map4);
    }

    /* JADX INFO: renamed from: a */
    public static String m2538a(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String name = cls.getName();
        if (C1012h.m2541c(name)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (name.startsWith("[")) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                sb.append("[]");
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = name.substring(1, name.length() - 1);
            }
            Map<String, String> map = f2475d;
            if (map.containsKey(name)) {
                name = map.get(name);
            }
        }
        int iLastIndexOf = name.lastIndexOf(46);
        int iIndexOf = name.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = name.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace('$', '.');
        }
        return strSubstring + ((Object) sb);
    }
}
