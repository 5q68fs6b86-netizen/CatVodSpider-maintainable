package com.github.catvod.spider.support.p011C;

import com.github.catvod.spider.support.p116a.C2137a;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0959b extends Format {

    /* JADX INFO: renamed from: c */
    private static final AbstractC0964g<C0959b> f2259c = new a();

    /* JADX INFO: renamed from: a */
    private final C0962e f2260a;

    /* JADX INFO: renamed from: b */
    private final C0961d f2261b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.b$a */
    static class a extends AbstractC0964g<C0959b> {
        a() {
        }
    }

    protected C0959b(String str, TimeZone timeZone, Locale locale) {
        this.f2260a = new C0962e(str, timeZone, locale);
        this.f2261b = new C0961d(str, timeZone, locale);
    }

    /* JADX INFO: renamed from: a */
    public static C0959b m2332a() {
        return (C0959b) f2259c.m2366a("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }

    /* JADX INFO: renamed from: b */
    public static C0959b m2333b(String str) {
        return (C0959b) f2259c.m2366a(str, null);
    }

    /* JADX INFO: renamed from: c */
    public final Date m2334c(String str) {
        return this.f2261b.m2344h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0959b) {
            return this.f2260a.equals(((C0959b) obj).f2260a);
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.f2260a.m2357d(obj));
        return stringBuffer;
    }

    public final int hashCode() {
        return this.f2260a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return this.f2261b.m2345i(str, parsePosition);
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("FastDateFormat[");
        sbM5396a.append(this.f2260a.m2359f());
        sbM5396a.append(",");
        sbM5396a.append(this.f2260a.m2358e());
        sbM5396a.append(",");
        sbM5396a.append(this.f2260a.m2360g().getID());
        sbM5396a.append("]");
        return sbM5396a.toString();
    }
}
