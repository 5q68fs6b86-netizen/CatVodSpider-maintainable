package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p137w.C2407i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2375i {

    /* JADX INFO: renamed from: c */
    public int f5885c;

    /* JADX INFO: renamed from: f */
    public C2407i f5888f;

    /* JADX INFO: renamed from: a */
    public C2359a f5883a = null;

    /* JADX INFO: renamed from: b */
    public int f5884b = -1;

    /* JADX INFO: renamed from: d */
    public boolean f5886d = false;

    /* JADX INFO: renamed from: e */
    protected final List<AbstractC2376i0> f5887e = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i0>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i0>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i0>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i0>] */
    /* JADX INFO: renamed from: a */
    public final void m6372a(AbstractC2376i0 abstractC2376i0) {
        int size = this.f5887e.size();
        boolean z = false;
        if (this.f5887e.isEmpty()) {
            this.f5886d = abstractC2376i0.mo6328b();
        } else if (this.f5886d != abstractC2376i0.mo6328b()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.f5884b));
            this.f5886d = false;
        }
        for (AbstractC2376i0 abstractC2376i1 : this.f5887e) {
            if (abstractC2376i1.f5889a.f5884b == abstractC2376i0.f5889a.f5884b && ((abstractC2376i1.mo6343c() != null && abstractC2376i0.mo6343c() != null && abstractC2376i1.mo6343c().equals(abstractC2376i0.mo6343c())) || (abstractC2376i1.mo6328b() && abstractC2376i0.mo6328b()))) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        this.f5887e.add(size, abstractC2376i0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i0>] */
    /* JADX INFO: renamed from: b */
    public final int m6373b() {
        return this.f5887e.size();
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo6308c();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i0>] */
    /* JADX INFO: renamed from: d */
    public final AbstractC2376i0 m6374d(int i) {
        return (AbstractC2376i0) this.f5887e.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC2375i) && this.f5884b == ((AbstractC2375i) obj).f5884b;
    }

    public final int hashCode() {
        return this.f5884b;
    }

    public final String toString() {
        return String.valueOf(this.f5884b);
    }
}
