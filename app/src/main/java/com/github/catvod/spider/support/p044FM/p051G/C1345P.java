package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.P */
/* JADX INFO: loaded from: classes.dex */
final class C1345P {

    /* JADX INFO: renamed from: a */
    private final Object[] f3108a;

    /* JADX INFO: renamed from: b */
    private final int f3109b;

    C1345P(Object... objArr) {
        this.f3108a = objArr;
        this.f3109b = Arrays.hashCode(objArr) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1345P.class == obj.getClass()) {
            return Arrays.deepEquals(this.f3108a, ((C1345P) obj).f3108a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3109b;
    }
}
