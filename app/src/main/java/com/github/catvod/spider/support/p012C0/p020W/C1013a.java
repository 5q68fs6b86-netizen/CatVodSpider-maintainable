package com.github.catvod.spider.support.p012C0.p020W;

import com.github.catvod.spider.support.C0.p0.b;
import com.github.catvod.spider.support.p012C0.p019U.C1011b;
import com.github.catvod.spider.support.p012C0.p019U.C1012h;
import com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r;
import com.github.catvod.spider.support.p012C0.p029e0.InterfaceC1194O;
import com.github.catvod.spider.support.p012C0.p038n0.InterfaceC1259a;
import com.github.catvod.spider.support.p012C0.p038n0.InterfaceC1260b;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.W.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1013a implements InterfaceC1259a {
    /* JADX INFO: renamed from: b */
    public static String m2549b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable cause = th; cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
            arrayList.add(cause);
        }
        Throwable th2 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th2 != null) {
            th = th2;
        }
        int i = C1011b.f2476e;
        String strM2538a = C1011b.m2538a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(strM2538a);
        sb.append(": ");
        int i2 = C1012h.f2477a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m2550c(InterfaceC1194O interfaceC1194O, AbstractC1059r abstractC1059r) {
        AbstractC1059r abstractC1059rM2755g = abstractC1059r;
        int i = 0;
        while (abstractC1059rM2755g != null) {
            AbstractC1059r abstractC1059rM2749A = abstractC1059rM2755g.m2749A();
            interfaceC1194O.mo2681a(abstractC1059rM2755g, i);
            if (abstractC1059rM2749A != null && !abstractC1059rM2755g.m2758q()) {
                abstractC1059rM2755g = abstractC1059rM2749A.m2755g(abstractC1059rM2755g.m2753H());
            }
            if (abstractC1059rM2755g.mo2661h() > 0) {
                abstractC1059rM2755g = abstractC1059rM2755g.m2755g(0);
                i++;
            } else {
                while (abstractC1059rM2755g.m2760s() == null && i > 0) {
                    interfaceC1194O.mo2682b(abstractC1059rM2755g, i);
                    abstractC1059rM2755g = abstractC1059rM2755g.m2749A();
                    i--;
                }
                interfaceC1194O.mo2682b(abstractC1059rM2755g, i);
                if (abstractC1059rM2755g == abstractC1059r) {
                    return;
                } else {
                    abstractC1059rM2755g = abstractC1059rM2755g.m2760s();
                }
            }
        }
    }

    @Override // com.github.catvod.spider.support.p012C0.p038n0.InterfaceC1259a
    /* JADX INFO: renamed from: a */
    public InterfaceC1260b mo2551a(String str) {
        return b.c;
    }
}
