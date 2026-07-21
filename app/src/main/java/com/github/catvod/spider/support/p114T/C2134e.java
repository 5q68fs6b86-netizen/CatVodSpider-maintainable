package com.github.catvod.spider.support.p114T;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p114T.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2134e {

    /* JADX INFO: renamed from: a */
    private static a f5000a;

    /* JADX INFO: renamed from: b */
    private static boolean f5001b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p114T.e$a */
    private static final class a extends SecurityManager {
        a() {
        }

        @Override // java.lang.SecurityManager
        protected final Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private C2134e() {
    }

    /* JADX INFO: renamed from: a */
    public static Class<?> m5387a() {
        int i;
        a aVar = f5000a;
        if (aVar == null) {
            if (f5001b) {
                aVar = null;
            } else {
                try {
                    aVar = new a();
                } catch (SecurityException unused) {
                    aVar = null;
                }
                f5000a = aVar;
                f5001b = true;
            }
        }
        if (aVar == null) {
            return null;
        }
        Class<?>[] classContext = aVar.getClassContext();
        String name = C2134e.class.getName();
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
    public static final void m5388b(String str) {
        System.err.println("SLF4J: " + str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m5389c(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
