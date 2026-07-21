package com.github.catvod.spider.support.p135u;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.T */
/* JADX INFO: loaded from: classes.dex */
public final class C2352T {

    /* JADX INFO: renamed from: a */
    protected final Map<AbstractC2351S, AbstractC2351S> f5829a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.u.S, com.github.catvod.spider.support.u.S>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.u.S, com.github.catvod.spider.support.u.S>] */
    /* JADX INFO: renamed from: a */
    public final AbstractC2351S m6337a(AbstractC2351S abstractC2351S) {
        C2387s c2387s = AbstractC2351S.f5827b;
        if (abstractC2351S == c2387s) {
            return c2387s;
        }
        AbstractC2351S abstractC2351S2 = (AbstractC2351S) this.f5829a.get(abstractC2351S);
        if (abstractC2351S2 != null) {
            return abstractC2351S2;
        }
        this.f5829a.put(abstractC2351S, abstractC2351S);
        return abstractC2351S;
    }
}
