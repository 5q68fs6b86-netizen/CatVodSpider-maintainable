package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.xk */
/* JADX INFO: loaded from: classes.dex */
public final class C0746xk implements InterfaceC0654u {

    /* JADX INFO: renamed from: a */
    public final Locale f1811a;

    /* JADX INFO: renamed from: b */
    public final int f1812b;

    /* JADX INFO: renamed from: c */
    public final String f1813c;

    /* JADX INFO: renamed from: d */
    public final String f1814d;

    public C0746xk(TimeZone timeZone, Locale locale, int i) {
        this.f1811a = AbstractC0134at.m1018a(locale);
        this.f1812b = i;
        this.f1813c = C0312hi.m1274j(timeZone, false, i, locale);
        this.f1814d = C0312hi.m1274j(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: e */
    public final void mo1195e(StringBuilder sb, Calendar calendar) {
        TimeZone timeZone = calendar.getTimeZone();
        int i = calendar.get(16);
        Locale locale = this.f1811a;
        int i2 = this.f1812b;
        if (i == 0) {
            sb.append((CharSequence) C0312hi.m1274j(timeZone, false, i2, locale));
        } else {
            sb.append((CharSequence) C0312hi.m1274j(timeZone, true, i2, locale));
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: f */
    public final int mo1196f() {
        return Math.max(this.f1813c.length(), this.f1814d.length());
    }
}
