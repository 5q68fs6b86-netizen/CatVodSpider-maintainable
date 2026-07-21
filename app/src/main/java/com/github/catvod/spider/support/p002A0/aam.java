package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class aam implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f447a;

    /* JADX INFO: renamed from: b */
    public final Object f448b;

    public aam(Object obj, Object obj2) {
        this.f447a = obj;
        this.f448b = obj2;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aam)) {
            return false;
        }
        aam aamVar = (aam) obj;
        Object obj2 = aamVar.f447a;
        Object obj3 = this.f447a;
        if (obj3 == null) {
            zEquals = obj2 == null;
        } else {
            zEquals = obj3.equals(obj2);
        }
        if (zEquals) {
            Object obj4 = this.f448b;
            Object obj5 = aamVar.f448b;
            if (obj4 == null) {
                zEquals2 = obj5 == null;
            } else {
                zEquals2 = obj4.equals(obj5);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0534po.m1518e(AbstractC0534po.m1524k(AbstractC0534po.m1524k(0, this.f447a), this.f448b), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.f447a, this.f448b);
    }
}
