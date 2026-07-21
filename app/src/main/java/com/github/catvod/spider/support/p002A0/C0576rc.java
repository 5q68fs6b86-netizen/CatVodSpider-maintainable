package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.rc */
/* JADX INFO: loaded from: classes.dex */
public final class C0576rc extends AbstractC0426lo {

    /* JADX INFO: renamed from: a */
    public static final HashMap f1415a;

    /* JADX INFO: renamed from: h */
    public final Constructor f1416h;

    /* JADX INFO: renamed from: i */
    public final Object[] f1417i;

    /* JADX INFO: renamed from: j */
    public final HashMap f1418j;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f1415a = map;
    }

    public C0576rc(Class cls, C0688vg c0688vg) {
        super(c0688vg);
        this.f1418j = new HashMap();
        acs acsVar = AbstractC0173ce.f703a;
        Constructor constructorMo919b = acsVar.mo919b(cls);
        this.f1416h = constructorMo919b;
        AbstractC0173ce.m1071g(constructorMo919b);
        String[] strArrMo920c = acsVar.mo920c(cls);
        for (int i = 0; i < strArrMo920c.length; i++) {
            this.f1418j.put(strArrMo920c[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f1416h.getParameterTypes();
        this.f1417i = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f1417i[i2] = f1415a.get(parameterTypes[i2]);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0426lo
    /* JADX INFO: renamed from: d */
    public final Object mo1356d() {
        return (Object[]) this.f1417i.clone();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0426lo
    /* JADX INFO: renamed from: e */
    public final Object mo1357e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f1416h;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            acs acsVar = AbstractC0173ce.f703a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0173ce.m1067c(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0173ce.m1067c(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0173ce.m1067c(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0426lo
    /* JADX INFO: renamed from: f */
    public final void mo1358f(Object obj, C0577rd c0577rd, C0379jv c0379jv) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f1418j;
        String str = c0379jv.f1089c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC0173ce.m1067c(this.f1416h) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo900b = c0379jv.f1092f.mo900b(c0577rd);
        if (objMo900b != null || !c0379jv.f1093g) {
            objArr[iIntValue] = objMo900b;
            return;
        }
        throw new C0649tv("null is not allowed as value for record component '" + str + "' of primitive type; at path " + c0577rd.m1624w(false));
    }
}
