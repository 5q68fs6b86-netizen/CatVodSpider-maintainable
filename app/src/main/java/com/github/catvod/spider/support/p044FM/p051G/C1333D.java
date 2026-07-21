package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p047C.C1300c;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.D */
/* JADX INFO: loaded from: classes.dex */
final class C1333D implements InterfaceC1372z {

    /* JADX INFO: renamed from: a */
    private final Locale f3083a;

    /* JADX INFO: renamed from: b */
    private final int f3084b;

    /* JADX INFO: renamed from: c */
    private final String f3085c;

    /* JADX INFO: renamed from: d */
    private final String f3086d;

    C1333D(TimeZone timeZone, Locale locale, int i) {
        this.f3083a = C1300c.m3243a(locale);
        this.f3084b = i;
        this.f3085c = C1343N.m3324h(timeZone, false, i, locale);
        this.f3086d = C1343N.m3324h(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) C1343N.m3324h(calendar.getTimeZone(), calendar.get(16) != 0, this.f3084b, this.f3083a));
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return Math.max(this.f3085c.length(), this.f3086d.length());
    }
}
