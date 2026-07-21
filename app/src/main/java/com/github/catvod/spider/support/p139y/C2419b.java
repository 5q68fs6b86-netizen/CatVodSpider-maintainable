package com.github.catvod.spider.support.p139y;

import com.github.catvod.spider.support.p117b.C2174h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p139y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2419b {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Class<?>> f5970a;

    /* JADX INFO: renamed from: b */
    private static final Map<Class<?>, Class<?>> f5971b;

    /* JADX INFO: renamed from: c */
    private static final Map<Class<?>, Class<?>> f5972c;

    /* JADX INFO: renamed from: d */
    private static final Map<String, String> f5973d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f5974e = 0;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    static {
        String.valueOf('.');
        String.valueOf('$');
        HashMap map = new HashMap();
        f5970a = map;
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
        f5971b = map2;
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
        f5972c = new HashMap();
        for (Object __en : map2.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            Class<?> cls6 = (Class) entry.getKey();
            Class<?> cls7 = (Class) entry.getValue();
            if (!cls6.equals(cls7)) {
                f5972c.put(cls7, cls6);
            }
        }
        HashMap mapM5658c = C2174h.m5658c("int", "I", "boolean", "Z");
        mapM5658c.put("float", "F");
        mapM5658c.put("long", "J");
        mapM5658c.put("short", "S");
        mapM5658c.put("byte", "B");
        mapM5658c.put("double", "D");
        mapM5658c.put("char", "C");
        HashMap map3 = new HashMap();
        for (Object __en : mapM5658c.entrySet()) { Map.Entry entry2 = (Map.Entry) __en;
            map3.put(entry2.getValue(), entry2.getKey());
        }
        Collections.unmodifiableMap(mapM5658c);
        f5973d = Collections.unmodifiableMap(map3);
    }

    /* JADX INFO: renamed from: a */
    public static String m6433a(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        String name = cls.getName();
        if (C2423f.m6439c(name)) {
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
            Map<String, String> map = f5973d;
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
