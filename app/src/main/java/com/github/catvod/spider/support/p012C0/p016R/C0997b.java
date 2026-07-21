package com.github.catvod.spider.support.p012C0.p016R;

import com.github.catvod.spider.support.p012C0.p014P.I;
import com.github.catvod.spider.support.p012C0.p016R.c;
import com.github.catvod.spider.support.p012C0.p015Q.AbstractC0996v;
import com.github.catvod.spider.support.p012C0.p015Q.C0991f;
import com.github.catvod.spider.support.p012C0.p015Q.C0995p0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p016R.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0997b {

    /* JADX INFO: renamed from: a */
    public final Map<C0999e, C0999e> f2448a = new HashMap();

    /* JADX INFO: renamed from: b */
    public volatile C0999e f2449b;

    /* JADX INFO: renamed from: c */
    public final int f2450c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0996v f2451d;

    /* JADX INFO: renamed from: e */
    private final boolean f2452e;

    public C0997b(AbstractC0996v abstractC0996v, int i) {
        boolean z = true;
        this.f2451d = abstractC0996v;
        this.f2450c = i;
        if ((abstractC0996v instanceof C0995p0) && ((C0995p0) abstractC0996v).f2445j) {
            C0999e c0999e = new C0999e(new C0991f(true));
            c0999e.f2457c = new C0999e[0];
            c0999e.f2458d = false;
            c0999e.f2461g = false;
            this.f2449b = c0999e;
        } else {
            z = false;
        }
        this.f2452e = z;
    }

    /* JADX INFO: renamed from: a */
    public final C0999e m2513a(int i) {
        if (!this.f2452e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0 || i >= this.f2449b.f2457c.length) {
            return null;
        }
        return this.f2449b.f2457c[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2514b() {
        return this.f2452e;
    }

    /* JADX INFO: renamed from: c */
    public final void m2515c(int i, C0999e c0999e) {
        if (!this.f2452e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.f2449b) {
            if (i >= this.f2449b.f2457c.length) {
                this.f2449b.f2457c = (C0999e[]) Arrays.copyOf(this.f2449b.f2457c, i + 1);
            }
            this.f2449b.f2457c[i] = c0999e;
        }
    }

    public final String toString() {
        return this.f2449b == null ? "" : new c(this, I.e).toString();
    }
}
