package com.github.catvod.spider.support.p012C0.p015Q;

import com.github.catvod.spider.support.p012C0.p015Q.C;
import com.github.catvod.spider.support.p012C0.p015Q.X;
import com.github.catvod.spider.support.p012C0.p015Q.d0;
import com.github.catvod.spider.support.p012C0.p015Q.e0;
import com.github.catvod.spider.support.p012C0.p015Q.m;
import com.github.catvod.spider.support.p012C0.p015Q.r0;
import com.github.catvod.spider.support.p012C0.p015Q.y;
import com.github.catvod.spider.support.p012C0.p014P.C0968C;
import com.github.catvod.spider.support.p012C0.p017S.C1003j;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p015Q.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0990a {

    /* JADX INFO: renamed from: a */
    public final List<m> f2416a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<AbstractC0996v> f2417b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public d0[] f2418c;

    /* JADX INFO: renamed from: d */
    public e0[] f2419d;

    /* JADX INFO: renamed from: e */
    public final int f2420e;

    /* JADX INFO: renamed from: f */
    public final int f2421f;

    /* JADX INFO: renamed from: g */
    public int[] f2422g;

    /* JADX INFO: renamed from: h */
    public C[] f2423h;

    /* JADX INFO: renamed from: i */
    public final List<r0> f2424i;

    public C0990a(int i, int i2) {
        new LinkedHashMap();
        this.f2424i = new ArrayList();
        this.f2420e = i;
        this.f2421f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p012C0.p015Q.m>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p012C0.p015Q.m>] */
    /* JADX INFO: renamed from: a */
    public final void m2493a(m mVar) {
        if (mVar != null) {
            mVar.a = this;
            mVar.b = this.f2416a.size();
        }
        this.f2416a.add(mVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p012C0.p015Q.v>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p012C0.p015Q.v>] */
    /* JADX INFO: renamed from: b */
    public final AbstractC0996v m2494b(int i) {
        if (this.f2417b.isEmpty()) {
            return null;
        }
        return (AbstractC0996v) this.f2417b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p012C0.p015Q.m>] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p012C0.p015Q.m>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p012C0.p015Q.m>] */
    /* JADX INFO: renamed from: c */
    public final C1003j m2495c(int i, C0968C c0968c) {
        if (i < 0 || i >= this.f2416a.size()) {
            throw new IllegalArgumentException("Invalid state number.");
        }
        C1003j c1003jM2497e = m2497e((m) this.f2416a.get(i));
        if (!c1003jM2497e.m2526d(-2)) {
            return c1003jM2497e;
        }
        C1003j c1003j = new C1003j(new int[0]);
        c1003j.m2525c(c1003jM2497e);
        c1003j.m2529h();
        while (c0968c != null && c0968c.f2354b >= 0 && c1003jM2497e.m2526d(-2)) {
            c1003jM2497e = m2497e(((m) this.f2416a.get(c0968c.f2354b)).d(0).c);
            c1003j.m2525c(c1003jM2497e);
            c1003j.m2529h();
            c0968c = c0968c.f2353a;
        }
        if (c1003jM2497e.m2526d(-2)) {
            c1003j.m2523a(-1);
        }
        return c1003j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p012C0.p015Q.v>] */
    /* JADX INFO: renamed from: d */
    public final int m2496d() {
        return this.f2417b.size();
    }

    /* JADX INFO: renamed from: e */
    public final C1003j m2497e(m mVar) {
        C1003j c1003j = mVar.f;
        if (c1003j != null) {
            return c1003j;
        }
        C1003j c1003jM2498f = m2498f(mVar, null);
        mVar.f = c1003jM2498f;
        c1003jM2498f.m2530i();
        return mVar.f;
    }

    /* JADX INFO: renamed from: f */
    public final C1003j m2498f(m mVar, C0968C c0968c) {
        y yVar = new y(this);
        C1003j c1003j = new C1003j(new int[0]);
        yVar.a(mVar, c0968c != null ? X.a(mVar.a, c0968c) : null, c1003j, new HashSet(), new BitSet());
        return c1003j;
    }
}
