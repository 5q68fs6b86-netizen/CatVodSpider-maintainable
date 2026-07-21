package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.vx */
/* JADX INFO: loaded from: classes.dex */
public final class C0705vx implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f1647a;

    /* JADX INFO: renamed from: b */
    public static final Throwable m1752b(Object obj) {
        if (obj instanceof C0381jx) {
            return ((C0381jx) obj).f1095a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0705vx) {
            return AbstractC0399ko.m1347b(this.f1647a, ((C0705vx) obj).f1647a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f1647a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f1647a;
        if (obj instanceof C0381jx) {
            return ((C0381jx) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
