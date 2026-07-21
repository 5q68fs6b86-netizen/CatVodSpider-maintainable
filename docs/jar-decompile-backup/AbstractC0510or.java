package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.or */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0510or {
    /* JADX INFO: renamed from: a */
    public static AbstractC0342il m1503a(C0577rd c0577rd) {
        int i = c0577rd.f1433o;
        if (i == 2) {
            c0577rd.f1433o = 1;
        }
        try {
            try {
                AbstractC0342il abstractC0342ilM1637b = AbstractC0584rk.m1637b(c0577rd);
                c0577rd.m1610an(i);
                return abstractC0342ilM1637b;
            } catch (OutOfMemoryError e) {
                throw new C0649tv("Failed parsing JSON source: " + c0577rd + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new C0649tv("Failed parsing JSON source: " + c0577rd + " to Json", e2);
            }
        } catch (Throwable th) {
            c0577rd.m1610an(i);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0342il m1504b(String str) {
        try {
            C0577rd c0577rd = new C0577rd(new StringReader(str));
            AbstractC0342il abstractC0342ilM1503a = m1503a(c0577rd);
            abstractC0342ilM1503a.getClass();
            if (!(abstractC0342ilM1503a instanceof aas) && c0577rd.m1607ak() != 10) {
                throw new C0765yc("Did not consume the entire document.");
            }
            return abstractC0342ilM1503a;
        } catch (C0657uc e) {
            throw new C0765yc(e);
        } catch (IOException e2) {
            throw new C0765yc(e2);
        } catch (NumberFormatException e3) {
            throw new C0765yc(e3);
        }
    }
}
