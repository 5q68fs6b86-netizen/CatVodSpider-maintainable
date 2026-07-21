package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class abl extends acs {

    /* JADX INFO: renamed from: e */
    public final Method f524e = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: f */
    public final Method f525f = Class.class.getMethod("getRecordComponents", null);

    /* JADX INFO: renamed from: g */
    public final Method f526g;

    /* JADX INFO: renamed from: h */
    public final Method f527h;

    public abl() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f526g = cls.getMethod("getName", null);
        this.f527h = cls.getMethod("getType", null);
    }

    @Override // com.github.catvod.spider.support.p002A0.acs
    /* JADX INFO: renamed from: a */
    public final Method mo918a(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.acs
    /* JADX INFO: renamed from: b */
    public final Constructor mo919b(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f525f.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f527h.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.acs
    /* JADX INFO: renamed from: c */
    public final String[] mo920c(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f525f.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f526g.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.acs
    /* JADX INFO: renamed from: d */
    public final boolean mo921d(Class cls) {
        try {
            return ((Boolean) this.f524e.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
