package com.github.catvod.spider.support.p002A0;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.vr */
/* JADX INFO: loaded from: classes.dex */
public final class C0699vr extends AbstractC0457ms {

    /* JADX INFO: renamed from: c */
    public final Locale f1603c;

    /* JADX INFO: renamed from: d */
    public final HashMap f1604d = new HashMap();

    public C0699vr(Locale locale) {
        this.f1603c = AbstractC0134at.m1018a(locale);
        StringBuilder sb = new StringBuilder();
        sb.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
        TreeSet<String> treeSet = new TreeSet(abe.f477b);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase("GMT")) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                C0519p c0519p = new C0519p(timeZone, false);
                C0519p c0519p2 = c0519p;
                for (int i = 1; i < strArr.length; i++) {
                    if (i == 3) {
                        c0519p2 = new C0519p(timeZone, true);
                    } else if (i == 5) {
                        c0519p2 = c0519p;
                    }
                    String str2 = strArr[i];
                    if (str2 != null) {
                        String lowerCase = str2.toLowerCase(locale);
                        if (treeSet.add(lowerCase)) {
                            this.f1604d.put(lowerCase, c0519p2);
                        }
                    }
                }
            }
        }
        for (String str3 : treeSet) {
            sb.append('|');
            abe.m914z(sb, str3);
        }
        sb.append(")");
        this.f1253g = Pattern.compile(sb.toString());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0457ms
    /* JADX INFO: renamed from: f */
    public final void mo1215f(Calendar calendar, String str) {
        C0761xz c0761xzM1856c = AbstractC0735x.m1856c(str);
        if (c0761xzM1856c != null) {
            calendar.setTimeZone(c0761xzM1856c);
            return;
        }
        String lowerCase = str.toLowerCase(this.f1603c);
        HashMap map = this.f1604d;
        C0519p c0519p = (C0519p) map.get(lowerCase);
        if (c0519p == null) {
            c0519p = (C0519p) map.get(lowerCase + '.');
        }
        calendar.set(16, c0519p.f1356b);
        calendar.set(15, c0519p.f1355a.getRawOffset());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0457ms
    public final String toString() {
        return "TimeZoneStrategy [locale=" + this.f1603c + ", tzNames=" + this.f1604d + ", pattern=" + this.f1253g + "]";
    }
}
