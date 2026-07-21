package com.github.catvod.spider.support.p002A0;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.lx */
/* JADX INFO: loaded from: classes.dex */
public final class C0435lx extends Format {

    /* JADX INFO: renamed from: a */
    public static final C0239eq f1207a = new C0239eq();

    /* JADX INFO: renamed from: b */
    public final C0312hi f1208b;

    /* JADX INFO: renamed from: c */
    public final abe f1209c;

    public C0435lx(String str, TimeZone timeZone, Locale locale) {
        this.f1208b = new C0312hi(str, timeZone, locale);
        this.f1209c = new abe(str, timeZone, locale);
    }

    /* JADX INFO: renamed from: d */
    public static C0435lx m1419d(String str) {
        return (C0435lx) f1207a.m1197b(str, null);
    }

    /* JADX INFO: renamed from: e */
    public final Date m1420e(String str) throws ParseException {
        abe abeVar = this.f1209c;
        abeVar.getClass();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateM916ab = abeVar.m916ab(str, parsePosition);
        if (dateM916ab != null) {
            return dateM916ab;
        }
        Locale locale = abe.f476a;
        Locale locale2 = abeVar.f497v;
        if (!locale2.equals(locale)) {
            throw new ParseException("Unparseable date: " + str, parsePosition.getErrorIndex());
        }
        throw new ParseException("(The " + locale2 + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0435lx) {
            return this.f1208b.equals(((C0435lx) obj).f1208b);
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        String string;
        C0312hi c0312hi = this.f1208b;
        c0312hi.getClass();
        boolean z = obj instanceof Date;
        int i = 0;
        Locale locale = c0312hi.f896e;
        TimeZone timeZone = c0312hi.f895d;
        if (z) {
            Calendar calendar = Calendar.getInstance(timeZone, locale);
            calendar.setTime((Date) obj);
            StringBuilder sb = new StringBuilder(c0312hi.f898g);
            InterfaceC0654u[] interfaceC0654uArr = c0312hi.f897f;
            int length = interfaceC0654uArr.length;
            while (i < length) {
                interfaceC0654uArr[i].mo1195e(sb, calendar);
                i++;
            }
            string = sb.toString();
        } else if (obj instanceof Calendar) {
            Calendar calendar2 = (Calendar) obj;
            StringBuilder sb2 = new StringBuilder(c0312hi.f898g);
            if (!calendar2.getTimeZone().equals(timeZone)) {
                calendar2 = (Calendar) calendar2.clone();
                calendar2.setTimeZone(timeZone);
            }
            InterfaceC0654u[] interfaceC0654uArr2 = c0312hi.f897f;
            int length2 = interfaceC0654uArr2.length;
            while (i < length2) {
                interfaceC0654uArr2[i].mo1195e(sb2, calendar2);
                i++;
            }
            string = sb2.toString();
        } else {
            if (!(obj instanceof Long)) {
                throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
            }
            long jLongValue = ((Long) obj).longValue();
            Calendar calendar3 = Calendar.getInstance(timeZone, locale);
            calendar3.setTimeInMillis(jLongValue);
            StringBuilder sb3 = new StringBuilder(c0312hi.f898g);
            InterfaceC0654u[] interfaceC0654uArr3 = c0312hi.f897f;
            int length3 = interfaceC0654uArr3.length;
            while (i < length3) {
                interfaceC0654uArr3[i].mo1195e(sb3, calendar3);
                i++;
            }
            string = sb3.toString();
        }
        stringBuffer.append(string);
        return stringBuffer;
    }

    public final int hashCode() {
        return this.f1208b.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.f1209c.m916ab(str, parsePosition);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FastDateFormat[");
        C0312hi c0312hi = this.f1208b;
        sb.append(c0312hi.f894c);
        sb.append(",");
        sb.append(c0312hi.f896e);
        sb.append(",");
        sb.append(c0312hi.f895d.getID());
        sb.append("]");
        return sb.toString();
    }
}
