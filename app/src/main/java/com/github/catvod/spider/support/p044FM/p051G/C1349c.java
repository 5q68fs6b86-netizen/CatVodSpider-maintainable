package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1349c extends Format {

    /* JADX INFO: renamed from: c */
    private static final C1348b f3114c = new C1348b();

    /* JADX INFO: renamed from: a */
    private final C1343N f3115a;

    /* JADX INFO: renamed from: b */
    private final C1366t f3116b;

    protected C1349c(String str, TimeZone timeZone, Locale locale) {
        this.f3115a = new C1343N(str, timeZone, locale);
        this.f3116b = new C1366t(str, timeZone, locale);
    }

    /* JADX INFO: renamed from: a */
    public static C1349c m3332a() {
        return (C1349c) f3114c.m3331a("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }

    /* JADX INFO: renamed from: b */
    public static C1349c m3333b(String str) {
        return (C1349c) f3114c.m3331a(str, null);
    }

    /* JADX INFO: renamed from: c */
    public final Date m3334c(String str) {
        return this.f3116b.m3351h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1349c) {
            return this.f3115a.equals(((C1349c) obj).f3115a);
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.f3115a.m3325d(obj));
        return stringBuffer;
    }

    public final int hashCode() {
        return this.f3115a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.f3116b.m3352i(str, parsePosition);
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("FastDateFormat[");
        sbM3589b.append(this.f3115a.m3327f());
        sbM3589b.append(",");
        sbM3589b.append(this.f3115a.m3326e());
        sbM3589b.append(",");
        sbM3589b.append(this.f3115a.m3328g().getID());
        sbM3589b.append("]");
        return sbM3589b.toString();
    }
}
