package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.jx */
/* JADX INFO: loaded from: classes.dex */
public final class C0381jx implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f1095a;

    public C0381jx(Throwable th) {
        AbstractC0399ko.m1351f("exception", th);
        this.f1095a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0381jx) {
            if (AbstractC0399ko.m1347b(this.f1095a, ((C0381jx) obj).f1095a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1095a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1095a + ')';
    }
}
