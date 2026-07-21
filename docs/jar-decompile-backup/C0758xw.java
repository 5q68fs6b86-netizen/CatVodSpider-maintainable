package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.xw */
/* JADX INFO: loaded from: classes.dex */
public final class C0758xw extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final C0150bi f1824a;

    public C0758xw(String str, Throwable th, C0150bi c0150bi) {
        super(str);
        this.f1824a = c0150bi;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0758xw) {
                C0758xw c0758xw = (C0758xw) obj;
                if (!AbstractC0399ko.m1347b(c0758xw.getMessage(), getMessage()) || !AbstractC0399ko.m1347b(c0758xw.f1824a, this.f1824a) || !AbstractC0399ko.m1347b(c0758xw.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC0399ko.m1348c(message);
        int iHashCode = (this.f1824a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1824a;
    }
}
