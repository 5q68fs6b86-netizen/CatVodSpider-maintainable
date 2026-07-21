package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p047C.C1300c;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.C */
/* JADX INFO: loaded from: classes.dex */
final class C1332C {

    /* JADX INFO: renamed from: a */
    private final TimeZone f3080a;

    /* JADX INFO: renamed from: b */
    private final int f3081b;

    /* JADX INFO: renamed from: c */
    private final Locale f3082c;

    C1332C(TimeZone timeZone, boolean z, int i, Locale locale) {
        this.f3080a = timeZone;
        if (z) {
            this.f3081b = Integer.MIN_VALUE | i;
        } else {
            this.f3081b = i;
        }
        this.f3082c = C1300c.m3243a(locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1332C)) {
            return false;
        }
        C1332C c1332c = (C1332C) obj;
        return this.f3080a.equals(c1332c.f3080a) && this.f3081b == c1332c.f3081b && this.f3082c.equals(c1332c.f3082c);
    }

    public final int hashCode() {
        return this.f3080a.hashCode() + ((this.f3082c.hashCode() + (this.f3081b * 31)) * 31);
    }
}
