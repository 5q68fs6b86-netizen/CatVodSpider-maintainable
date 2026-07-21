package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1285k;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.t0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2016t0 {

    /* JADX INFO: renamed from: a */
    public AbstractC2001m f4577a;

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));
        Collections.unmodifiableMap(new C2014s0());
    }

    protected AbstractC2016t0(AbstractC2001m abstractC2001m) {
        if (abstractC2001m == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.f4577a = abstractC2001m;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo4731a();

    /* JADX INFO: renamed from: b */
    public boolean mo4749b() {
        return this instanceof C2005o;
    }

    /* JADX INFO: renamed from: c */
    public C1285k mo4771c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo4732d(int i, int i2);
}
