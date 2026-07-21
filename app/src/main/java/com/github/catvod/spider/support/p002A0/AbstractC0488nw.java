package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.nw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0488nw {

    /* JADX INFO: renamed from: g */
    public final AbstractC0428lq f1292g;

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));
        C0581rh c0581rh = new C0581rh();
        c0581rh.put(C0244ev.class, 1);
        c0581rh.put(C0321hr.class, 2);
        c0581rh.put(abw.class, 3);
        c0581rh.put(aaa.class, 4);
        c0581rh.put(C0549qc.class, 5);
        c0581rh.put(C0531pl.class, 6);
        c0581rh.put(C0181cm.class, 7);
        c0581rh.put(C0378ju.class, 8);
        c0581rh.put(C0355iy.class, 9);
        c0581rh.put(C0420li.class, 10);
        Collections.unmodifiableMap(c0581rh);
    }

    public AbstractC0488nw(AbstractC0428lq abstractC0428lq) {
        if (abstractC0428lq == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.f1292g = abstractC0428lq;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo871b();

    /* JADX INFO: renamed from: c */
    public C0339ii mo1088c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo872d(int i, int i2);

    /* JADX INFO: renamed from: e */
    public boolean mo873e() {
        return this instanceof C0531pl;
    }
}
