package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.tn */
/* JADX INFO: loaded from: classes.dex */
public final class C0641tn extends AbstractC0448mj {

    /* JADX INFO: renamed from: a */
    public static final int f1542a;

    /* JADX INFO: renamed from: b */
    public static final C0641tn f1543b = new C0641tn();
    private static volatile Executor pool;

    static {
        String property;
        int iIntValue;
        try {
            property = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            property = null;
        }
        if (property != null) {
            Integer numM1298x = AbstractC0327hx.m1298x(property);
            if (numM1298x == null || numM1298x.intValue() < 1) {
                throw new IllegalStateException("Expected positive number in kotlinx.coroutines.default.parallelism, but has ".concat(property).toString());
            }
            iIntValue = numM1298x.intValue();
        } else {
            iIntValue = -1;
        }
        f1542a = iIntValue;
    }

    /* JADX INFO: renamed from: c */
    public static ExecutorService m1717c() {
        return Executors.newFixedThreadPool(m1719f(), new ThreadFactoryC0639tl(new AtomicInteger()));
    }

    /* JADX INFO: renamed from: d */
    public static ExecutorService m1718d() {
        Class<?> cls;
        ExecutorService executorService;
        Integer num;
        if (System.getSecurityManager() != null) {
            return m1717c();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m1717c();
        }
        int i = f1542a;
        C0641tn c0641tn = f1543b;
        if (i < 0) {
            try {
                Method method = cls.getMethod("commonPool", null);
                Object objInvoke = method != null ? method.invoke(null, null) : null;
                if (!(objInvoke instanceof ExecutorService)) {
                    objInvoke = null;
                }
                executorService = (ExecutorService) objInvoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                c0641tn.getClass();
                executorService.submit(RunnableC0640tm.f1540a);
                try {
                    Object objInvoke2 = cls.getMethod("getPoolSize", null).invoke(executorService, null);
                    if (!(objInvoke2 instanceof Integer)) {
                        objInvoke2 = null;
                    }
                    num = (Integer) objInvoke2;
                } catch (Throwable unused3) {
                    num = null;
                }
                if (num == null || num.intValue() < 1) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Constructor<?> constructor = cls.getConstructor(Integer.TYPE);
            c0641tn.getClass();
            Object objNewInstance = constructor.newInstance(Integer.valueOf(m1719f()));
            if (!(objNewInstance instanceof ExecutorService)) {
                objNewInstance = null;
            }
            executorService2 = (ExecutorService) objNewInstance;
        } catch (Throwable unused4) {
        }
        return executorService2 != null ? executorService2 : m1717c();
    }

    /* JADX INFO: renamed from: f */
    public static int m1719f() {
        int i = f1542a;
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (iAvailableProcessors < 1) {
            return 1;
        }
        return iAvailableProcessors;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool");
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0775ym
    /* JADX INFO: renamed from: e */
    public final void mo1146e(InterfaceC0769yg interfaceC0769yg, acw acwVar) {
        try {
            Executor executorM1718d = pool;
            if (executorM1718d == null) {
                synchronized (this) {
                    executorM1718d = pool;
                    if (executorM1718d == null) {
                        executorM1718d = m1718d();
                        pool = executorM1718d;
                    }
                }
            }
            executorM1718d.execute(acwVar);
        } catch (RejectedExecutionException unused) {
            acj.f562x.m1145_a(acwVar);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0775ym
    public final String toString() {
        return "CommonPool";
    }
}
