package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.cl */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0180cl {
    /* JADX INFO: renamed from: a */
    public static void m1087a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        AbstractC0399ko.m1351f("<this>", th);
        AbstractC0399ko.m1351f("exception", th2);
        if (th != th2) {
            Integer num = AbstractC0468nc.f1267a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC0298gv.f876a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
