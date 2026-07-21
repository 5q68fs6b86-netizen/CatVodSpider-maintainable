package com.github.catvod.spider.support.p044FM.p078d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p078d0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1792f {

    /* JADX INFO: renamed from: a */
    private static C1791e f4027a;

    /* JADX INFO: renamed from: b */
    private static boolean f4028b;

    private C1792f() {
    }

    /* JADX INFO: renamed from: a */
    public static Class<?> m4295a() {
        int i;
        C1791e c1791e = f4027a;
        if (c1791e == null) {
            if (f4028b) {
                c1791e = null;
            } else {
                try {
                    c1791e = new C1791e();
                } catch (SecurityException unused) {
                    c1791e = null;
                }
                f4027a = c1791e;
                f4028b = true;
            }
        }
        if (c1791e == null) {
            return null;
        }
        Class<?>[] classContext = c1791e.getClassContext();
        String name = C1792f.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    /* JADX INFO: renamed from: b */
    public static final void m4296b(String str) {
        System.err.println("SLF4J: " + str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m4297c(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
