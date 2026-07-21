package com.github.catvod.spider.support.p002A0;

import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.cy */
/* JADX INFO: loaded from: classes.dex */
public final class C0193cy {

    /* JADX INFO: renamed from: a */
    public static final C0193cy f722a;

    /* JADX INFO: renamed from: b */
    public final C0373jp f723b;

    /* JADX INFO: renamed from: c */
    public final C0373jp f724c;

    static {
        C0373jp c0373jp = new C0373jp(-1, -1, -1);
        f722a = new C0193cy(c0373jp, c0373jp);
    }

    public C0193cy(C0373jp c0373jp, C0373jp c0373jp2) {
        this.f723b = c0373jp;
        this.f724c = c0373jp2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0193cy.class != obj.getClass()) {
            return false;
        }
        C0193cy c0193cy = (C0193cy) obj;
        if (this.f723b.equals(c0193cy.f723b)) {
            return this.f724c.equals(c0193cy.f724c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f723b, this.f724c);
    }

    public final String toString() {
        return this.f723b + "-" + this.f724c;
    }
}
