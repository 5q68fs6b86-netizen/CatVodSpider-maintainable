package com.github.catvod.spider.support.p002A0;

import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.qf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0552qf {

    /* JADX INFO: renamed from: a */
    public static final C0737xb f1400a = new C0737xb("UNDEFINED", 3);

    /* JADX INFO: renamed from: b */
    public static final C0737xb f1401b = new C0737xb("REUSABLE_CLAIMED", 3);

    /* JADX INFO: renamed from: c */
    public static String m1581c(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: d */
    public static String m1582d(String str) {
        return m1581c(str).trim();
    }

    /* JADX INFO: renamed from: e */
    public static final void m1583e(Object obj, InterfaceC0747xl interfaceC0747xl) {
        if (!(interfaceC0747xl instanceof acu)) {
            interfaceC0747xl.resumeWith(obj);
            return;
        }
        acu acuVar = (acu) interfaceC0747xl;
        Throwable thM1752b = C0705vx.m1752b(obj);
        Object c0647tt = thM1752b == null ? obj : new C0647tt(thM1752b, false);
        AbstractC0775ym abstractC0775ym = acuVar.f583d;
        AbstractC0748xm abstractC0748xm = acuVar.f584e;
        abstractC0748xm.getContext();
        if (abstractC0775ym.mo1217g()) {
            acuVar.f581b = c0647tt;
            acuVar.f586x = 1;
            abstractC0775ym.mo1146e(abstractC0748xm.getContext(), acuVar);
            return;
        }
        AbstractC0240er abstractC0240erM917b = abk.m917b();
        if (abstractC0240erM917b.f789m >= 4294967296L) {
            acuVar.f581b = c0647tt;
            acuVar.f586x = 1;
            abstractC0240erM917b.m1200r(acuVar);
            return;
        }
        abstractC0240erM917b.m1201t(true);
        try {
            InterfaceC0483nr interfaceC0483nr = (InterfaceC0483nr) abstractC0748xm.getContext().get(InterfaceC0483nr.f1290aj);
            if (interfaceC0483nr == null || interfaceC0483nr.mo1035f()) {
                InterfaceC0769yg context = abstractC0748xm.getContext();
                Object objM1957d = AbstractC0807zr.m1957d(context, acuVar.f582c);
                try {
                    abstractC0748xm.resumeWith(obj);
                    AbstractC0807zr.m1956c(context, objM1957d);
                } catch (Throwable th) {
                    AbstractC0807zr.m1956c(context, objM1957d);
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionM1044q = ((C0150bi) interfaceC0483nr).m1044q();
                acuVar.mo959j(c0647tt, cancellationExceptionM1044q);
                acuVar.resumeWith(act.m953b(cancellationExceptionM1044q));
            }
            while (abstractC0240erM917b.m1202u()) {
            }
        } catch (Throwable th2) {
            try {
                acuVar.m967y(th2, null);
            } finally {
                abstractC0240erM917b.m1199q();
            }
        }
    }
}
