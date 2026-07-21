package com.github.catvod.spider.support.p002A0;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.bj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0151bj {
    /* JADX INFO: renamed from: a */
    public static final void m1054a(InterfaceC0769yg interfaceC0769yg, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = interfaceC0769yg.get(C0372jo.f1072d);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(interfaceC0769yg, th);
            } else {
                AbstractC0776yn.m1893b(interfaceC0769yg, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0180cl.m1087a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0776yn.m1893b(interfaceC0769yg, th);
        }
    }
}
