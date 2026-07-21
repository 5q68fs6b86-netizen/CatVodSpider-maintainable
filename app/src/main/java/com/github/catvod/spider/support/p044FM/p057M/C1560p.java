package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1560p extends AbstractC1554j {
    public C1560p(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        return !this.f3502b.equalsIgnoreCase(c1393m2.mo3511c(this.f3501a));
    }

    public final String toString() {
        return String.format("[%s!=%s]", this.f3501a, this.f3502b);
    }
}
