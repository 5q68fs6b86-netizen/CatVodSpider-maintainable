package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class acw extends adf {

    /* JADX INFO: renamed from: x */
    public int f586x;

    public acw(int i) {
        super(0L, C0372jo.f1075g);
        this.f586x = i;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo959j(Object obj, CancellationException cancellationException);

    /* JADX INFO: renamed from: k */
    public abstract InterfaceC0747xl mo960k();

    /* JADX INFO: renamed from: l */
    public Throwable mo965l(Object obj) {
        if (!(obj instanceof C0647tt)) {
            obj = null;
        }
        C0647tt c0647tt = (C0647tt) obj;
        if (c0647tt != null) {
            return c0647tt.f1565c;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public Object mo966m(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: n */
    public abstract Object mo961n();

    @Override // java.lang.Runnable
    public final void run() {
        Object objM953b = C0372jo.f1077i;
        InterfaceC0394kj interfaceC0394kj = this.f603aa;
        try {
            InterfaceC0747xl interfaceC0747xlMo960k = mo960k();
            if (interfaceC0747xlMo960k == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            }
            acu acuVar = (acu) interfaceC0747xlMo960k;
            AbstractC0748xm abstractC0748xm = acuVar.f584e;
            InterfaceC0769yg context = abstractC0748xm.getContext();
            Object objMo961n = mo961n();
            Object objM1957d = AbstractC0807zr.m1957d(context, acuVar.f582c);
            try {
                Throwable thMo965l = mo965l(objMo961n);
                InterfaceC0483nr interfaceC0483nr = (thMo965l == null && AbstractC0314hk.m1277a(this.f586x)) ? (InterfaceC0483nr) context.get(InterfaceC0483nr.f1290aj) : null;
                if (interfaceC0483nr != null && !interfaceC0483nr.mo1035f()) {
                    CancellationException cancellationExceptionM1044q = ((C0150bi) interfaceC0483nr).m1044q();
                    mo959j(objMo961n, cancellationExceptionM1044q);
                    abstractC0748xm.resumeWith(act.m953b(cancellationExceptionM1044q));
                } else if (thMo965l != null) {
                    abstractC0748xm.resumeWith(act.m953b(thMo965l));
                } else {
                    abstractC0748xm.resumeWith(mo966m(objMo961n));
                }
                AbstractC0807zr.m1956c(context, objM1957d);
                try {
                    interfaceC0394kj.mo1341p();
                } catch (Throwable th) {
                    objM953b = act.m953b(th);
                }
                m967y(null, C0705vx.m1752b(objM953b));
            } catch (Throwable th2) {
                AbstractC0807zr.m1956c(context, objM1957d);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                interfaceC0394kj.mo1341p();
            } catch (Throwable th4) {
                objM953b = act.m953b(th4);
            }
            m967y(th3, C0705vx.m1752b(objM953b));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m967y(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0180cl.m1087a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC0399ko.m1348c(th);
        AbstractC0151bj.m1054a(mo960k().getContext(), new C0790za("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }
}
