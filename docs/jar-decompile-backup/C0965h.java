package com.github.catvod.spider.support.p011C;

import com.github.catvod.spider.support.p116a.C2137a;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.h */
/* JADX INFO: loaded from: classes.dex */
final class C0965h extends TimeZone {

    /* JADX INFO: renamed from: a */
    private final int f2347a;

    /* JADX INFO: renamed from: b */
    private final String f2348b;

    C0965h(boolean z, int i, int i2) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + " hours out of range");
        }
        if (i2 >= 60) {
            throw new IllegalArgumentException(i2 + " minutes out of range");
        }
        int i3 = ((i * 60) + i2) * 60000;
        this.f2347a = z ? -i3 : i3;
        StringBuilder sb = new StringBuilder(9);
        sb.append("GMT");
        sb.append(z ? '-' : '+');
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
        sb.append(':');
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
        this.f2348b = sb.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0965h) && this.f2348b == ((C0965h) obj).f2348b;
    }

    @Override // java.util.TimeZone
    public final String getID() {
        return this.f2348b;
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f2347a;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.f2347a;
    }

    public final int hashCode() {
        return this.f2347a;
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
        StringBuilder sbM5396a = C2137a.m5396a("[GmtTimeZone id=\"");
        sbM5396a.append(this.f2348b);
        sbM5396a.append("\",offset=");
        sbM5396a.append(this.f2347a);
        sbM5396a.append(']');
        return sbM5396a.toString();
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}
