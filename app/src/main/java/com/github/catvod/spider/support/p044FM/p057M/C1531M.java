package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1531M extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    private final Pattern f3481a;

    public C1531M(Pattern pattern) {
        this.f3481a = pattern;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        return this.f3481a.matcher(c1393m2.m3484v0()).find();
    }

    public final String toString() {
        return String.format(":matches(%s)", this.f3481a);
    }
}
