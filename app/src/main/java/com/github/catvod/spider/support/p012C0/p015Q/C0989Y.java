package com.github.catvod.spider.support.p012C0.p015Q;

import com.github.catvod.spider.support.C0.Q.X;
import com.github.catvod.spider.support.C0.Q.w;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.Q.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C0989Y {

    /* JADX INFO: renamed from: a */
    protected final Map<X, X> f2415a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.C0.Q.X, com.github.catvod.spider.support.C0.Q.X>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.C0.Q.X, com.github.catvod.spider.support.C0.Q.X>] */
    /* JADX INFO: renamed from: a */
    public final X m2492a(X x) {
        w wVar = X.b;
        if (x == wVar) {
            return wVar;
        }
        X x2 = (X) this.f2415a.get(x);
        if (x2 != null) {
            return x2;
        }
        this.f2415a.put(x, x);
        return x;
    }
}
