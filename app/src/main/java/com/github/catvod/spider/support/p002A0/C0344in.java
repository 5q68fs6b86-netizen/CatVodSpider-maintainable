package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.in */
/* JADX INFO: loaded from: classes.dex */
public final class C0344in implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f1014a;

    /* JADX INFO: renamed from: b */
    public final Object f1015b;

    public C0344in(Object obj, Object obj2) {
        this.f1014a = obj;
        this.f1015b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0344in)) {
            return false;
        }
        C0344in c0344in = (C0344in) obj;
        return AbstractC0399ko.m1347b(this.f1014a, c0344in.f1014a) && AbstractC0399ko.m1347b(this.f1015b, c0344in.f1015b);
    }

    public final int hashCode() {
        Object obj = this.f1014a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1015b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f1014a + ", " + this.f1015b + ')';
    }
}
