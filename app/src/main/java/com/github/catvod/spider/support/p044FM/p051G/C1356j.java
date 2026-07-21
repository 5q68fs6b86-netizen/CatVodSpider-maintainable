package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p047C.C1300c;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.j */
/* JADX INFO: loaded from: classes.dex */
final class C1356j extends AbstractC1360n {

    /* JADX INFO: renamed from: b */
    private final int f3117b;

    /* JADX INFO: renamed from: c */
    final Locale f3118c;

    /* JADX INFO: renamed from: d */
    private final Map<String, Integer> f3119d;

    C1356j(int i, Calendar calendar, Locale locale) {
        this.f3117b = i;
        this.f3118c = C1300c.m3243a(locale);
        StringBuilder sbM3589b = C1434P.m3589b("((?iu)");
        this.f3119d = (HashMap) C1366t.m3345c(calendar, locale, i, sbM3589b);
        sbM3589b.setLength(sbM3589b.length() - 1);
        sbM3589b.append(")");
        this.f3125a = Pattern.compile(sbM3589b.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    @Override // com.github.catvod.spider.support.p044FM.p051G.AbstractC1360n
    /* JADX INFO: renamed from: c */
    final void mo3337c(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.f3118c);
        Integer num = (Integer) this.f3119d.get(lowerCase);
        if (num == null) {
            num = (Integer) this.f3119d.get(lowerCase + '.');
        }
        calendar.set(this.f3117b, num.intValue());
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.AbstractC1360n
    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("CaseInsensitiveTextStrategy [field=");
        sbM3589b.append(this.f3117b);
        sbM3589b.append(", locale=");
        sbM3589b.append(this.f3118c);
        sbM3589b.append(", lKeyValues=");
        sbM3589b.append(this.f3119d);
        sbM3589b.append(", pattern=");
        sbM3589b.append(this.f3125a);
        sbM3589b.append("]");
        return sbM3589b.toString();
    }
}
