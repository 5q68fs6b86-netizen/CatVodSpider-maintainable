package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p047C.C1300c;
import com.github.catvod.spider.support.p044FM.p047C.C1307j;
import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.b */
/* JADX INFO: loaded from: classes.dex */
final class C1348b {

    /* JADX INFO: renamed from: a */
    private final ConcurrentMap<C1345P, C1349c> f3113a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    C1348b() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.support.p044FM.p051G.P, com.github.catvod.spider.support.p044FM.p051G.c>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.support.p044FM.p051G.P, com.github.catvod.spider.support.p044FM.p051G.c>] */
    /* JADX INFO: renamed from: a */
    public final Format m3331a(String str, Locale locale) {
        C1307j.m3258a(str, new Object[0]);
        TimeZone timeZone = TimeZone.getDefault();
        Locale localeM3243a = C1300c.m3243a(locale);
        C1345P c1345p = new C1345P(str, timeZone, localeM3243a);
        Format format = (Format) this.f3113a.get(c1345p);
        if (format != null) {
            return format;
        }
        C1349c c1349c = new C1349c(str, timeZone, localeM3243a);
        Format format2 = (Format) this.f3113a.putIfAbsent(c1345p, c1349c);
        return format2 != null ? format2 : c1349c;
    }
}
