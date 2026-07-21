package com.github.catvod.spider.support.p002A0;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.rk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0584rk {
    /* JADX INFO: renamed from: a */
    public static void m1636a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0342il m1637b(C0577rd c0577rd) {
        boolean z;
        try {
            try {
                c0577rd.m1607ak();
                z = false;
                try {
                    return (AbstractC0342il) ado.f643z.mo900b(c0577rd);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return aas.f454f;
                    }
                    throw new C0765yc(e);
                }
            } catch (EOFException e2) {
                /*e=e2*/
                z = true;
            }
        } catch (C0657uc e3) {
            throw new C0765yc(e3);
        } catch (IOException e4) {
            throw new C0765yc(e4);
        } catch (NumberFormatException e5) {
            throw new C0765yc(e5);
        }
    }
}
