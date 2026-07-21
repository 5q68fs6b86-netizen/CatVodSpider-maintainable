package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.gr */
/* JADX INFO: loaded from: classes.dex */
public final class C0294gr implements InterfaceC0698vq {

    /* JADX INFO: renamed from: b */
    public final C0742xg f871b;

    /* JADX INFO: renamed from: c */
    public final EnumC0252fc f872c;

    /* JADX INFO: renamed from: d */
    public final C0434lw f873d;

    /* JADX INFO: renamed from: e */
    public final C0130ap f874e;

    /* JADX INFO: renamed from: f */
    public final List f875f;

    public C0294gr(C0742xg c0742xg, EnumC0252fc enumC0252fc, C0434lw c0434lw, C0130ap c0130ap, List list) {
        this.f871b = c0742xg;
        this.f872c = enumC0252fc;
        this.f873d = c0434lw;
        this.f874e = c0130ap;
        this.f875f = list;
    }

    /* JADX INFO: renamed from: g */
    public static void m1258g(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC0173ce.m1068d(field) + " and " + AbstractC0173ce.m1068d(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0698vq
    /* JADX INFO: renamed from: a */
    public final AbstractC0406kv mo934a(C0493oa c0493oa, C0259fj c0259fj) {
        Class cls = c0259fj.f827a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        acs acsVar = AbstractC0173ce.f703a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C0167bz(2);
        }
        AbstractC0791zb.m1910b(this.f875f);
        return AbstractC0173ce.f703a.mo921d(cls) ? new C0576rc(cls, m1259h(c0493oa, c0259fj, cls, true)) : new C0400kp(this.f871b.m1870e(c0259fj), m1259h(c0493oa, c0259fj, cls, false));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[LOOP:2: B:76:0x0179->B:103:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0150  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:75:0x0175  */
    /* JADX WARN: Code duplicated, block: B:78:0x017f  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:96:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final C0688vg m1259h(C0493oa c0493oa, C0259fj c0259fj, Class cls, boolean z) {
        boolean z2;
        Method method;
        List listSingletonList;
        List<String> list;
        String str;
        C0259fj c0259fj2;
        Class cls2;
        boolean z3;
        int modifiers;
        boolean z4;
        InterfaceC0388kd interfaceC0388kd;
        C0259fj c0259fj3;
        String str2;
        AbstractC0406kv abstractC0406kvM1471aa;
        boolean z5;
        C0259fj c0259fj4;
        AbstractC0406kv abstractC0406kv;
        C0379jv c0379jv;
        String str3;
        C0379jv c0379jv2;
        C0379jv c0379jv3;
        AbstractC0406kv c0489nx;
        if (cls.isInterface()) {
            return C0688vg.f1593a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C0259fj c0259fj5 = c0259fj;
        Class cls3 = cls;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            if (cls3 != cls && declaredFields.length > 0) {
                AbstractC0791zb.m1910b(this.f875f);
            }
            int length = declaredFields.length;
            boolean z6 = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean zM1260i = m1260i(field, true);
                boolean zM1260i2 = m1260i(field, z6);
                if (zM1260i || zM1260i2) {
                    if (!z) {
                        z2 = zM1260i2;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z2 = false;
                    } else {
                        Method methodMo918a = AbstractC0173ce.f703a.mo918a(cls3, field);
                        AbstractC0173ce.m1071g(methodMo918a);
                        if (methodMo918a.getAnnotation(InterfaceC0474ni.class) != null && field.getAnnotation(InterfaceC0474ni.class) == null) {
                            throw new C0765yc("@SerializedName on " + AbstractC0173ce.m1069e(methodMo918a, z6) + " is not supported");
                        }
                        z2 = zM1260i2;
                        method = methodMo918a;
                    }
                    if (method == null) {
                        AbstractC0173ce.m1071g(field);
                    }
                    Type typeM1521h = AbstractC0534po.m1521h(c0259fj5.f828b, cls3, field.getGenericType(), new HashMap());
                    InterfaceC0474ni interfaceC0474ni = (InterfaceC0474ni) field.getAnnotation(InterfaceC0474ni.class);
                    if (interfaceC0474ni == null) {
                        listSingletonList = Collections.singletonList(this.f872c.mo1214a(field));
                    } else {
                        String strValue = interfaceC0474ni.value();
                        String[] strArrAlternate = interfaceC0474ni.alternate();
                        if (strArrAlternate.length == 0) {
                            listSingletonList = Collections.singletonList(strValue);
                        } else {
                            ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                            arrayList.add(strValue);
                            Collections.addAll(arrayList, strArrAlternate);
                            list = arrayList;
                        }
                        str = (String) list.get(0);
                        c0259fj2 = new C0259fj(typeM1521h);
                        cls2 = c0259fj2.f827a;
                        if ((cls2 instanceof Class) || !cls2.isPrimitive()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        modifiers = field.getModifiers();
                        if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        interfaceC0388kd = (InterfaceC0388kd) field.getAnnotation(InterfaceC0388kd.class);
                        if (interfaceC0388kd != null) {
                            c0259fj3 = c0259fj2;
                            str2 = str;
                            abstractC0406kvM1471aa = this.f874e.m1007f(this.f871b, c0493oa, c0259fj3, interfaceC0388kd, false);
                        } else {
                            c0259fj3 = c0259fj2;
                            str2 = str;
                            abstractC0406kvM1471aa = null;
                        }
                        if (abstractC0406kvM1471aa != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c0259fj4 = c0259fj3;
                        if (abstractC0406kvM1471aa == null) {
                            abstractC0406kvM1471aa = c0493oa.m1471aa(c0259fj4);
                        }
                        if (zM1260i) {
                            if (z5) {
                                c0489nx = abstractC0406kvM1471aa;
                            } else {
                                c0489nx = new C0489nx(c0493oa, abstractC0406kvM1471aa, c0259fj4.f828b);
                            }
                            abstractC0406kv = c0489nx;
                        } else {
                            abstractC0406kv = abstractC0406kvM1471aa;
                        }
                        c0379jv = new C0379jv(str2, field, method, abstractC0406kv, abstractC0406kvM1471aa, z3, z4);
                        if (z2) {
                            for (String str4 : list) {
                                c0379jv3 = (C0379jv) linkedHashMap.put(str4, c0379jv);
                                if (c0379jv3 == null) {
                                    m1258g(cls, str4, c0379jv3.f1088b, field);
                                    throw null;
                                }
                            }
                        }
                        if (zM1260i) {
                            str3 = str2;
                            c0379jv2 = (C0379jv) linkedHashMap2.put(str3, c0379jv);
                            if (c0379jv2 == null) {
                                m1258g(cls, str3, c0379jv2.f1088b, field);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    }
                    list = listSingletonList;
                    str = (String) list.get(0);
                    c0259fj2 = new C0259fj(typeM1521h);
                    cls2 = c0259fj2.f827a;
                    if (cls2 instanceof Class) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers)) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    interfaceC0388kd = (InterfaceC0388kd) field.getAnnotation(InterfaceC0388kd.class);
                    if (interfaceC0388kd != null) {
                        c0259fj3 = c0259fj2;
                        str2 = str;
                        abstractC0406kvM1471aa = this.f874e.m1007f(this.f871b, c0493oa, c0259fj3, interfaceC0388kd, false);
                    } else {
                        c0259fj3 = c0259fj2;
                        str2 = str;
                        abstractC0406kvM1471aa = null;
                    }
                    if (abstractC0406kvM1471aa != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c0259fj4 = c0259fj3;
                    if (abstractC0406kvM1471aa == null) {
                        abstractC0406kvM1471aa = c0493oa.m1471aa(c0259fj4);
                    }
                    if (zM1260i) {
                        if (z5) {
                            c0489nx = abstractC0406kvM1471aa;
                        } else {
                            c0489nx = new C0489nx(c0493oa, abstractC0406kvM1471aa, c0259fj4.f828b);
                        }
                        abstractC0406kv = c0489nx;
                    } else {
                        abstractC0406kv = abstractC0406kvM1471aa;
                    }
                    c0379jv = new C0379jv(str2, field, method, abstractC0406kv, abstractC0406kvM1471aa, z3, z4);
                    if (z2) {
                        while (r1.hasNext()) {
                            c0379jv3 = (C0379jv) linkedHashMap.put(str4, c0379jv);
                            if (c0379jv3 == null) {
                                m1258g(cls, str4, c0379jv3.f1088b, field);
                                throw null;
                            }
                        }
                    }
                    if (zM1260i) {
                        str3 = str2;
                        c0379jv2 = (C0379jv) linkedHashMap2.put(str3, c0379jv);
                        if (c0379jv2 == null) {
                            m1258g(cls, str3, c0379jv2.f1088b, field);
                            throw null;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i = i;
                }
                i++;
                z6 = false;
            }
            c0259fj5 = new C0259fj(AbstractC0534po.m1521h(c0259fj5.f828b, cls3, cls3.getGenericSuperclass(), new HashMap()));
            cls3 = c0259fj5.f827a;
        }
        return new C0688vg(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1260i(Field field, boolean z) {
        boolean z2;
        C0434lw c0434lw = this.f873d;
        c0434lw.getClass();
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || c0434lw.m1418e(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? c0434lw.f1205c : c0434lw.f1206d;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
