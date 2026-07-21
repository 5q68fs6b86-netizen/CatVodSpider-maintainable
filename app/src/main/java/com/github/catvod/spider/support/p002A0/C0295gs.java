package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.gs */
/* JADX INFO: loaded from: classes.dex */
public class C0295gs extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        c0577rd.m1618q();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (c0577rd.m1607ak() != 4) {
            String strM1601ae = c0577rd.m1601ae();
            int iM1599ac = c0577rd.m1599ac();
            strM1601ae.getClass();
            switch (strM1601ae) {
                case "dayOfMonth":
                    i3 = iM1599ac;
                    break;
                case "minute":
                    i5 = iM1599ac;
                    break;
                case "second":
                    i6 = iM1599ac;
                    break;
                case "year":
                    i = iM1599ac;
                    break;
                case "month":
                    i2 = iM1599ac;
                    break;
                case "hourOfDay":
                    i4 = iM1599ac;
                    break;
            }
        }
        c0577rd.m1622u();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            aagVar.m892w();
            return;
        }
        aagVar.m886q();
        aagVar.m890u("year");
        aagVar.m879ac(calendar.get(1));
        aagVar.m890u("month");
        aagVar.m879ac(calendar.get(2));
        aagVar.m890u("dayOfMonth");
        aagVar.m879ac(calendar.get(5));
        aagVar.m890u("hourOfDay");
        aagVar.m879ac(calendar.get(11));
        aagVar.m890u("minute");
        aagVar.m879ac(calendar.get(12));
        aagVar.m890u("second");
        aagVar.m879ac(calendar.get(13));
        aagVar.m889t();
    }
}
