package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.xq */
/* JADX INFO: loaded from: classes.dex */
public class C0752xq extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        try {
            int iM1599ac = c0577rd.m1599ac();
            if (iM1599ac <= 65535 && iM1599ac >= -32768) {
                return Short.valueOf((short) iM1599ac);
            }
            throw new C0765yc("Lossy conversion from " + iM1599ac + " to short; at path " + c0577rd.m1624w(true));
        } catch (NumberFormatException e) {
            throw new C0765yc(e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            aagVar.m892w();
        } else {
            aagVar.m879ac(number.shortValue());
        }
    }
}
