package com.github.catvod.spider.support.p002A0;

import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0276g {

    /* JADX INFO: renamed from: a */
    public final TimeZone f849a;

    /* JADX INFO: renamed from: b */
    public final int f850b;

    /* JADX INFO: renamed from: c */
    public final Locale f851c;

    public C0276g(TimeZone timeZone, boolean z, int i, Locale locale) {
        this.f849a = timeZone;
        if (z) {
            this.f850b = Integer.MIN_VALUE | i;
        } else {
            this.f850b = i;
        }
        this.f851c = AbstractC0134at.m1018a(locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0276g)) {
            return false;
        }
        C0276g c0276g = (C0276g) obj;
        return this.f849a.equals(c0276g.f849a) && this.f850b == c0276g.f850b && this.f851c.equals(c0276g.f851c);
    }

    public final int hashCode() {
        return this.f849a.hashCode() + ((this.f851c.hashCode() + (this.f850b * 31)) * 31);
    }
}
