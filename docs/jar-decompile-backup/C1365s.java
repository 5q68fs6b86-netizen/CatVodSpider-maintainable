package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p047C.C1300c;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.s */
/* JADX INFO: loaded from: classes.dex */
final class C1365s extends AbstractC1360n {

    /* JADX INFO: renamed from: b */
    private final Locale f3133b;

    /* JADX INFO: renamed from: c */
    private final Map<String, C1364r> f3134c = new HashMap();

    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p044FM.p051G.r>] */
    C1365s(Locale locale) {
        this.f3133b = C1300c.m3243a(locale);
        StringBuilder sbM3589b = C1434P.m3589b("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
        TreeSet<String> treeSet = new TreeSet(C1366t.f3136h);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (!str.equalsIgnoreCase("GMT")) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                C1364r c1364r = new C1364r(timeZone, false);
                C1364r c1364r2 = c1364r;
                for (int i = 1; i < strArr.length; i++) {
                    if (i == 3) {
                        c1364r2 = new C1364r(timeZone, true);
                    } else if (i == 5) {
                        c1364r2 = c1364r;
                    }
                    if (strArr[i] != null) {
                        String lowerCase = strArr[i].toLowerCase(locale);
                        if (treeSet.add(lowerCase)) {
                            this.f3134c.put(lowerCase, c1364r2);
                        }
                    }
                }
            }
        }
        for (String str2 : treeSet) {
            sbM3589b.append('|');
            C1366t.m3348f(sbM3589b, str2);
        }
        sbM3589b.append(")");
        this.f3125a = Pattern.compile(sbM3589b.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p044FM.p051G.r>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p044FM.p051G.r>] */
    @Override // com.github.catvod.spider.support.p044FM.p051G.AbstractC1360n
    /* JADX INFO: renamed from: c */
    final void mo3337c(Calendar calendar, String str) {
        TimeZone timeZoneM3330a = C1344O.m3330a(str);
        if (timeZoneM3330a != null) {
            calendar.setTimeZone(timeZoneM3330a);
            return;
        }
        String lowerCase = str.toLowerCase(this.f3133b);
        C1364r c1364r = (C1364r) this.f3134c.get(lowerCase);
        if (c1364r == null) {
            c1364r = (C1364r) this.f3134c.get(lowerCase + '.');
        }
        calendar.set(16, c1364r.f3132b);
        calendar.set(15, c1364r.f3131a.getRawOffset());
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.AbstractC1360n
    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("TimeZoneStrategy [locale=");
        sbM3589b.append(this.f3133b);
        sbM3589b.append(", tzNames=");
        sbM3589b.append(this.f3134c);
        sbM3589b.append(", pattern=");
        sbM3589b.append(this.f3125a);
        sbM3589b.append("]");
        return sbM3589b.toString();
    }
}
