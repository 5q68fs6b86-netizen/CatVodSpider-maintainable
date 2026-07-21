package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.Q */
/* JADX INFO: loaded from: classes.dex */
final class C1346Q extends TimeZone {

    /* JADX INFO: renamed from: a */
    private final int f3110a;

    /* JADX INFO: renamed from: b */
    private final String f3111b;

    C1346Q(boolean z, int i, int i2) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + " hours out of range");
        }
        if (i2 >= 60) {
            throw new IllegalArgumentException(i2 + " minutes out of range");
        }
        int i3 = ((i * 60) + i2) * 60000;
        this.f3110a = z ? -i3 : i3;
        StringBuilder sb = new StringBuilder(9);
        sb.append("GMT");
        sb.append(z ? '-' : '+');
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
        sb.append(':');
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
        this.f3111b = sb.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1346Q) && this.f3111b == ((C1346Q) obj).f3111b;
    }

    @Override // java.util.TimeZone
    public final String getID() {
        return this.f3111b;
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f3110a;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.f3110a;
    }

    public final int hashCode() {
        return this.f3110a;
    }

    @Override // java.util.TimeZone
    public final boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("[GmtTimeZone id=\"");
        sbM3589b.append(this.f3111b);
        sbM3589b.append("\",offset=");
        sbM3589b.append(this.f3110a);
        sbM3589b.append(']');
        return sbM3589b.toString();
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}
