package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1285k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2001m {

    /* JADX INFO: renamed from: c */
    public int f4562c;

    /* JADX INFO: renamed from: f */
    public C1285k f4565f;

    /* JADX INFO: renamed from: a */
    public C1977a f4560a = null;

    /* JADX INFO: renamed from: b */
    public int f4561b = -1;

    /* JADX INFO: renamed from: d */
    public boolean f4563d = false;

    /* JADX INFO: renamed from: e */
    protected final List<AbstractC2016t0> f4564e = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.t0>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.t0>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.t0>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.t0>] */
    /* JADX INFO: renamed from: a */
    public final void m4787a(AbstractC2016t0 abstractC2016t0) {
        int size = this.f4564e.size();
        boolean z = false;
        if (this.f4564e.isEmpty()) {
            this.f4563d = abstractC2016t0.mo4749b();
        } else if (this.f4563d != abstractC2016t0.mo4749b()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.f4561b));
            this.f4563d = false;
        }
        for (AbstractC2016t0 abstractC2016t1 : this.f4564e) {
            if (abstractC2016t1.f4577a.f4561b == abstractC2016t0.f4577a.f4561b && ((abstractC2016t1.mo4771c() != null && abstractC2016t0.mo4771c() != null && abstractC2016t1.mo4771c().equals(abstractC2016t0.mo4771c())) || (abstractC2016t1.mo4749b() && abstractC2016t0.mo4749b()))) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        this.f4564e.add(size, abstractC2016t0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.t0>] */
    /* JADX INFO: renamed from: b */
    public final int m4788b() {
        return this.f4564e.size();
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo4730c();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p099y.t0>] */
    /* JADX INFO: renamed from: d */
    public final AbstractC2016t0 m4789d(int i) {
        return (AbstractC2016t0) this.f4564e.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC2001m) && this.f4561b == ((AbstractC2001m) obj).f4561b;
    }

    public final int hashCode() {
        return this.f4561b;
    }

    public final String toString() {
        return String.valueOf(this.f4561b);
    }
}
