package com.github.catvod.spider.support.p002A0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class adi implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public adi f607a;

    /* JADX INFO: renamed from: b */
    public adi f608b;

    /* JADX INFO: renamed from: c */
    public adi f609c;

    /* JADX INFO: renamed from: d */
    public adi f610d;

    /* JADX INFO: renamed from: e */
    public adi f611e;

    /* JADX INFO: renamed from: f */
    public final Object f612f;

    /* JADX INFO: renamed from: g */
    public final boolean f613g;

    /* JADX INFO: renamed from: h */
    public Object f614h;

    /* JADX INFO: renamed from: i */
    public int f615i;

    public adi(boolean z) {
        this.f612f = null;
        this.f613g = z;
        this.f611e = this;
        this.f610d = this;
    }

    public adi(boolean z, adi adiVar, Object obj, adi adiVar2, adi adiVar3) {
        this.f607a = adiVar;
        this.f612f = obj;
        this.f613g = z;
        this.f615i = 1;
        this.f610d = adiVar2;
        this.f611e = adiVar3;
        adiVar3.f610d = this;
        adiVar2.f611e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f612f;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f614h;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f612f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f614h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f612f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f614h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f613g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f614h;
        this.f614h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f612f + "=" + this.f614h;
    }
}
