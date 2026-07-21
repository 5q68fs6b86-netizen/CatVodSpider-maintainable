package com.github.catvod.spider.support.p132q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.q.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2293a extends Error {

    /* JADX INFO: renamed from: a */
    Exception f5722a;

    public C2293a(String str, Exception exc) {
        super(str);
        this.f5722a = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.f5722a) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.f5722a.getClass().toString() : message2;
    }
}
