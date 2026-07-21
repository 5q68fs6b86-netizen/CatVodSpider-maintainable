package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class ach extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public static final ace f553a = new ace();

    /* JADX INFO: renamed from: d */
    public final acg f554d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f555e;

    public ach(acg acgVar, int i, int i2) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f555e = arrayList;
        Objects.requireNonNull(acgVar);
        this.f554d = acgVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (acz.f587a >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(AbstractC0710wb.m1759c("Unknown DateFormat style: ", i));
                }
                str = "M/d/yy";
            }
            sb.append(str);
            sb.append(" ");
            if (i2 == 0 || i2 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i2 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException(AbstractC0710wb.m1759c("Unknown DateFormat style: ", i2));
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        Date dateM1125c;
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        String strM1605ai = c0577rd.m1605ai();
        synchronized (this.f555e) {
            try {
                for (DateFormat dateFormat : this.f555e) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateM1125c = dateFormat.parse(strM1605ai);
                            dateFormat.setTimeZone(timeZone);
                        } catch (Throwable th) {
                            dateFormat.setTimeZone(timeZone);
                            throw th;
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    dateM1125c = AbstractC0204di.m1125c(strM1605ai, new ParsePosition(0));
                } catch (ParseException e) {
                    throw new C0765yc("Failed parsing '" + strM1605ai + "' as Date; at path " + c0577rd.m1624w(true), e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f554d.mo935b(dateM1125c);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            aagVar.m892w();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f555e.get(0);
        synchronized (this.f555e) {
            str = dateFormat.format(date);
        }
        aagVar.m881ae(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f555e.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
