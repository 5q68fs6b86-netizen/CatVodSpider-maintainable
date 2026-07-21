package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.rs */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0592rs {
    /* JADX INFO: renamed from: a */
    public static final String m1647a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: b */
    public static final String m1648b(InterfaceC0747xl interfaceC0747xl) {
        Object objM953b;
        if (interfaceC0747xl instanceof acu) {
            return interfaceC0747xl.toString();
        }
        try {
            objM953b = interfaceC0747xl + '@' + m1647a(interfaceC0747xl);
        } catch (Throwable th) {
            objM953b = act.m953b(th);
        }
        if (C0705vx.m1752b(objM953b) != null) {
            objM953b = interfaceC0747xl.getClass().getName() + '@' + m1647a(interfaceC0747xl);
        }
        return (String) objM953b;
    }
}
