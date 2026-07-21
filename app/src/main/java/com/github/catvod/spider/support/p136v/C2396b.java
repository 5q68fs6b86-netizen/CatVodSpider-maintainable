package com.github.catvod.spider.support.p136v;

import com.github.catvod.spider.support.p134t.C2306E;
import com.github.catvod.spider.support.p135u.AbstractC2386r;
import com.github.catvod.spider.support.p135u.C2363c;
import com.github.catvod.spider.support.p135u.C2370f0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p136v.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2396b {

    /* JADX INFO: renamed from: a */
    public final Map<C2398d, C2398d> f5925a = new HashMap();

    /* JADX INFO: renamed from: b */
    public volatile C2398d f5926b;

    /* JADX INFO: renamed from: c */
    public final int f5927c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2386r f5928d;

    /* JADX INFO: renamed from: e */
    private final boolean f5929e;

    public C2396b(AbstractC2386r abstractC2386r, int i) {
        this.f5928d = abstractC2386r;
        this.f5927c = i;
        boolean z = true;
        if ((abstractC2386r instanceof C2370f0) && ((C2370f0) abstractC2386r).f5873j) {
            C2398d c2398d = new C2398d(new C2363c(true));
            c2398d.f5934c = new C2398d[0];
            c2398d.f5935d = false;
            c2398d.f5938g = false;
            this.f5926b = c2398d;
        } else {
            z = false;
        }
        this.f5929e = z;
    }

    /* JADX INFO: renamed from: a */
    public final C2398d m6392a(int i) {
        if (!this.f5929e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0 || i >= this.f5926b.f5934c.length) {
            return null;
        }
        return this.f5926b.f5934c[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6393b() {
        return this.f5929e;
    }

    /* JADX INFO: renamed from: c */
    public final void m6394c(int i, C2398d c2398d) {
        if (!this.f5929e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.f5926b) {
            if (i >= this.f5926b.f5934c.length) {
                this.f5926b.f5934c = (C2398d[]) Arrays.copyOf(this.f5926b.f5934c, i + 1);
            }
            this.f5926b.f5934c[i] = c2398d;
        }
    }

    public final String toString() {
        return this.f5926b == null ? "" : new C2397c(this, C2306E.f5726e).toString();
    }
}
