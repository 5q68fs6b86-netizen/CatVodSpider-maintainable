package com.github.catvod.spider.support.p002A0;

import java.text.Format;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.eq */
/* JADX INFO: loaded from: classes.dex */
public final class C0239eq {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f788a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    /* JADX INFO: renamed from: b */
    public final Format m1197b(String str, Locale locale) {
        Objects.requireNonNull(str, new C0306hc("pattern", new Object[0]));
        TimeZone timeZone = TimeZone.getDefault();
        Locale localeM1018a = AbstractC0134at.m1018a(locale);
        C0116ab c0116ab = new C0116ab(str, timeZone, localeM1018a);
        ConcurrentHashMap concurrentHashMap = this.f788a;
        Format format = (Format) concurrentHashMap.get(c0116ab);
        if (format != null) {
            return format;
        }
        C0435lx c0435lx = new C0435lx(str, timeZone, localeM1018a);
        Format format2 = (Format) concurrentHashMap.putIfAbsent(c0116ab, c0435lx);
        return format2 != null ? format2 : c0435lx;
    }
}
