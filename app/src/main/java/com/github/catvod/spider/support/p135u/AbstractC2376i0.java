package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p137w.C2407i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2376i0 {

    /* JADX INFO: renamed from: a */
    public AbstractC2375i f5889a;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.i0$a */
    static class a extends HashMap<Class<? extends AbstractC2376i0>, Integer> {
        a() {
            put(C2388t.class, 1);
            put(C2356X.class, 2);
            put(C2360a0.class, 3);
            put(C2350Q.class, 4);
            put(C2381m.class, 5);
            put(C2379k.class, 6);
            put(C2364c0.class, 7);
            put(C2344K.class, 8);
            put(C2378j0.class, 9);
            put(C2349P.class, 10);
        }
    }

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));
        Collections.unmodifiableMap(new a());
    }

    protected AbstractC2376i0(AbstractC2375i abstractC2375i) {
        if (abstractC2375i == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.f5889a = abstractC2375i;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo6309a();

    /* JADX INFO: renamed from: b */
    public boolean mo6328b() {
        return this instanceof C2379k;
    }

    /* JADX INFO: renamed from: c */
    public C2407i mo6343c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo6310d(int i, int i2);
}
