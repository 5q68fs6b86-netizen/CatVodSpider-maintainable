package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public abstract class act {

    /* JADX INFO: renamed from: a */
    public static final String[] f579a = {"input", "keygen", "object", "select", "textarea"};

    /* JADX INFO: renamed from: b */
    public static final C0381jx m953b(Throwable th) {
        AbstractC0399ko.m1351f("exception", th);
        return new C0381jx(th);
    }

    /* JADX INFO: renamed from: c */
    public static final void m954c(Object obj) throws Throwable {
        if (obj instanceof C0381jx) {
            throw ((C0381jx) obj).f1095a;
        }
    }
}
