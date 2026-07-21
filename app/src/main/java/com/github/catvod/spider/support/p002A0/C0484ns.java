package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ns */
/* JADX INFO: loaded from: classes.dex */
public final class C0484ns extends Number {

    /* JADX INFO: renamed from: a */
    public final String f1291a;

    public C0484ns(String str) {
        this.f1291a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f1291a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0484ns) {
            return this.f1291a.equals(((C0484ns) obj).f1291a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f1291a);
    }

    public final int hashCode() {
        return this.f1291a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f1291a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return AbstractC0611sk.m1687d(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f1291a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return AbstractC0611sk.m1687d(str).longValue();
        }
    }

    public final String toString() {
        return this.f1291a;
    }
}
