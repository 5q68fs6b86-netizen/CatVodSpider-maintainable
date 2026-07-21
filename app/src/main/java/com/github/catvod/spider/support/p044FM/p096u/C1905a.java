package com.github.catvod.spider.support.p044FM.p096u;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.u.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1905a extends Error {

    /* JADX INFO: renamed from: a */
    Exception f4382a;

    public C1905a(String str, Exception exc) {
        super(str);
        this.f4382a = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.f4382a) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.f4382a.getClass().toString() : message2;
    }
}
