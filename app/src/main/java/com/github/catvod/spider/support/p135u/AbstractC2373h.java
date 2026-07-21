package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p136v.C2398d;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2373h {

    /* JADX INFO: renamed from: c */
    public static final C2398d f5880c;

    /* JADX INFO: renamed from: a */
    public final C2359a f5881a;

    /* JADX INFO: renamed from: b */
    protected final C2352T f5882b;

    static {
        UUID uuid = C2371g.f5878f;
        UUID uuid2 = C2371g.f5878f;
        C2398d c2398d = new C2398d(new C2363c(true));
        f5880c = c2398d;
        c2398d.f5932a = Integer.MAX_VALUE;
    }

    public AbstractC2373h(C2359a c2359a, C2352T c2352t) {
        this.f5881a = c2359a;
        this.f5882b = c2352t;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6312a();
}
