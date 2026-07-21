package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.jv */
/* JADX INFO: loaded from: classes.dex */
public final class C0379jv {

    /* JADX INFO: renamed from: a */
    public final String f1087a;

    /* JADX INFO: renamed from: b */
    public final Field f1088b;

    /* JADX INFO: renamed from: c */
    public final String f1089c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Method f1090d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0406kv f1091e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0406kv f1092f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f1093g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f1094h;

    public C0379jv(String str, Field field, Method method, AbstractC0406kv abstractC0406kv, AbstractC0406kv abstractC0406kv2, boolean z, boolean z2) {
        this.f1090d = method;
        this.f1091e = abstractC0406kv;
        this.f1092f = abstractC0406kv2;
        this.f1093g = z;
        this.f1094h = z2;
        this.f1087a = str;
        this.f1088b = field;
        this.f1089c = field.getName();
    }

    /* JADX INFO: renamed from: i */
    public final void m1342i(aag aagVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Field field = this.f1088b;
        Method method = this.f1090d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new C0765yc("Accessor " + AbstractC0173ce.m1069e(method, false) + " threw exception", e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        aagVar.m890u(this.f1087a);
        this.f1091e.mo901c(aagVar, objInvoke);
    }
}
