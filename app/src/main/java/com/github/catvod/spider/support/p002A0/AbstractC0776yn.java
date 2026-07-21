package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.yn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0776yn {

    /* JADX INFO: renamed from: a */
    public static final List f1840a;

    static {
        Iterator it = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        AbstractC0399ko.m1351f("<this>", it);
        f1840a = AbstractC0728wt.m1854a(new C0732wx(new C0631td(2, it)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m1893b(InterfaceC0769yg interfaceC0769yg, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = f1840a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(interfaceC0769yg, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0180cl.m1087a(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
