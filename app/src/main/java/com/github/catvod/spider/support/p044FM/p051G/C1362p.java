package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.p */
/* JADX INFO: loaded from: classes.dex */
final class C1362p {

    /* JADX INFO: renamed from: a */
    final AbstractC1361o f3126a;

    /* JADX INFO: renamed from: b */
    final int f3127b;

    C1362p(AbstractC1361o abstractC1361o, int i) {
        this.f3126a = abstractC1361o;
        this.f3127b = i;
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("StrategyAndWidth [strategy=");
        sbM3589b.append(this.f3126a);
        sbM3589b.append(", width=");
        sbM3589b.append(this.f3127b);
        sbM3589b.append("]");
        return sbM3589b.toString();
    }
}
