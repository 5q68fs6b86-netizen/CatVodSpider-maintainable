package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.zn */
/* JADX INFO: loaded from: classes.dex */
public final class C0803zn {

    /* JADX INFO: renamed from: a */
    public final HashMap f1908a = new HashMap();

    /* JADX INFO: renamed from: b */
    public volatile abf f1909b;

    /* JADX INFO: renamed from: c */
    public final int f1910c;

    /* JADX INFO: renamed from: d */
    public final acc f1911d;

    /* JADX INFO: renamed from: e */
    public final boolean f1912e;

    public C0803zn(acc accVar, int i) {
        this.f1911d = accVar;
        this.f1910c = i;
        boolean z = false;
        if ((accVar instanceof C0627t) && ((C0627t) accVar).f1523c) {
            abf abfVar = new abf(new C0371jn(true));
            abfVar.f503c = new abf[0];
            abfVar.f504d = false;
            abfVar.f507g = false;
            this.f1909b = abfVar;
            z = true;
        }
        this.f1912e = z;
    }

    /* JADX INFO: renamed from: f */
    public final void m1955f(int i, abf abfVar) {
        if (!this.f1912e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.f1909b) {
            try {
                if (i >= this.f1909b.f503c.length) {
                    this.f1909b.f503c = (abf[]) Arrays.copyOf(this.f1909b.f503c, i + 1);
                }
                this.f1909b.f503c[i] = abfVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f1909b == null ? "" : new abb(this, C0317hn.f922b, 0).toString();
    }
}
