package com.github.catvod.spider.support.p044FM.p099y;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C1975Y {

    /* JADX INFO: renamed from: a */
    protected final Map<AbstractC1974X, AbstractC1974X> f4511a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.FM.y.X, com.github.catvod.spider.support.FM.y.X>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.FM.y.X, com.github.catvod.spider.support.FM.y.X>] */
    /* JADX INFO: renamed from: a */
    public final AbstractC1974X m4758a(AbstractC1974X abstractC1974X) {
        C2020w c2020w = AbstractC1974X.f4509b;
        if (abstractC1974X == c2020w) {
            return c2020w;
        }
        AbstractC1974X abstractC1974X2 = (AbstractC1974X) this.f4511a.get(abstractC1974X);
        if (abstractC1974X2 != null) {
            return abstractC1974X2;
        }
        this.f4511a.put(abstractC1974X, abstractC1974X);
        return abstractC1974X;
    }
}
