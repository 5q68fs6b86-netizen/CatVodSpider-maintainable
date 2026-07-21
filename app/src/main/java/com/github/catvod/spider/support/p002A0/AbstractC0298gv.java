package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.gv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0298gv {

    /* JADX INFO: renamed from: a */
    public static final Method f876a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC0399ko.m1348c(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC0399ko.m1347b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC0399ko.m1350e("getParameterTypes(...)", parameterTypes);
                if (AbstractC0399ko.m1347b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f876a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !AbstractC0399ko.m1347b(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
