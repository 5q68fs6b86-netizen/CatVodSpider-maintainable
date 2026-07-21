package com.github.catvod.spider.support.p002A0;

import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.xz */
/* JADX INFO: loaded from: classes.dex */
public final class C0761xz extends TimeZone {

    /* JADX INFO: renamed from: a */
    public final int f1825a;

    /* JADX INFO: renamed from: b */
    public final String f1826b;

    public C0761xz(boolean z, int i, int i2) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + " hours out of range");
        }
        if (i2 >= 60) {
            throw new IllegalArgumentException(i2 + " minutes out of range");
        }
        int i3 = ((i * 60) + i2) * 60000;
        this.f1825a = z ? -i3 : i3;
        StringBuilder sb = new StringBuilder(9);
        sb.append("GMT");
        sb.append(z ? '-' : '+');
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
        sb.append(':');
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
        this.f1826b = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0761xz) {
            return this.f1826b == ((C0761xz) obj).f1826b;
        }
        return false;
    }

    @Override // java.util.TimeZone
    public final String getID() {
        return this.f1826b;
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f1825a;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.f1825a;
    }

    public final int hashCode() {
        return this.f1825a;
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
        return "[GmtTimeZone id=\"" + this.f1826b + "\",offset=" + this.f1825a + ']';
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}
