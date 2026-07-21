package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.hk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0314hk {
    /* JADX INFO: renamed from: a */
    public static final boolean m1277a(int i) {
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1278b(C0601sa c0601sa, InterfaceC0747xl interfaceC0747xl, boolean z) {
        Object objMo961n = c0601sa.mo961n();
        Throwable thMo965l = c0601sa.mo965l(objMo961n);
        Object objM953b = thMo965l != null ? act.m953b(thMo965l) : c0601sa.mo966m(objMo961n);
        if (!z) {
            interfaceC0747xl.resumeWith(objM953b);
            return;
        }
        if (interfaceC0747xl == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
        }
        acu acuVar = (acu) interfaceC0747xl;
        AbstractC0748xm abstractC0748xm = acuVar.f584e;
        InterfaceC0769yg context = abstractC0748xm.getContext();
        Object objM1957d = AbstractC0807zr.m1957d(context, acuVar.f582c);
        try {
            abstractC0748xm.resumeWith(objM953b);
        } finally {
            AbstractC0807zr.m1956c(context, objM1957d);
        }
    }
}
