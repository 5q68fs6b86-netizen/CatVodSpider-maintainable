package com.github.catvod.spider.support.p044FM.p100z;

import com.github.catvod.spider.support.p044FM.p098x.C1924J;
import com.github.catvod.spider.support.p044FM.p099y.AbstractC2019v;
import com.github.catvod.spider.support.p044FM.p099y.C1987f;
import com.github.catvod.spider.support.p044FM.p099y.C2008p0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.z.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2025b {

    /* JADX INFO: renamed from: a */
    public final Map<C2028e, C2028e> f4585a = new HashMap();

    /* JADX INFO: renamed from: b */
    public volatile C2028e f4586b;

    /* JADX INFO: renamed from: c */
    public final int f4587c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2019v f4588d;

    /* JADX INFO: renamed from: e */
    private final boolean f4589e;

    public C2025b(AbstractC2019v abstractC2019v, int i) {
        this.f4588d = abstractC2019v;
        this.f4587c = i;
        boolean z = true;
        if ((abstractC2019v instanceof C2008p0) && ((C2008p0) abstractC2019v).f4574j) {
            C2028e c2028e = new C2028e(new C1987f(true));
            c2028e.f4596c = new C2028e[0];
            c2028e.f4597d = false;
            c2028e.f4600g = false;
            this.f4586b = c2028e;
        } else {
            z = false;
        }
        this.f4589e = z;
    }

    /* JADX INFO: renamed from: a */
    public final C2028e m4796a(int i) {
        if (!this.f4589e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0 || i >= this.f4586b.f4596c.length) {
            return null;
        }
        return this.f4586b.f4596c[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4797b() {
        return this.f4589e;
    }

    /* JADX INFO: renamed from: c */
    public final void m4798c(int i, C2028e c2028e) {
        if (!this.f4589e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.f4586b) {
            if (i >= this.f4586b.f4596c.length) {
                this.f4586b.f4596c = (C2028e[]) Arrays.copyOf(this.f4586b.f4596c, i + 1);
            }
            this.f4586b.f4596c[i] = c2028e;
        }
    }

    public final String toString() {
        return this.f4586b == null ? "" : new C2026c(this, C1924J.f4397e).toString();
    }
}
