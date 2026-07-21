package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ob */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0494ob implements Runnable, Comparable, adh {

    /* JADX INFO: renamed from: d */
    public Object f1321d;

    /* JADX INFO: renamed from: e */
    public int f1322e = -1;

    /* JADX INFO: renamed from: f */
    public long f1323f;

    public AbstractRunnableC0494ob(long j) {
        this.f1323f = j;
    }

    @Override // com.github.catvod.spider.support.p002A0.adh
    /* JADX INFO: renamed from: b */
    public final synchronized void mo990b() {
        try {
            Object obj = this.f1321d;
            C0737xb c0737xb = AbstractC0611sk.f1493a;
            if (obj == c0737xb) {
                return;
            }
            if (!(obj instanceof C0419lh)) {
                obj = null;
            }
            C0419lh c0419lh = (C0419lh) obj;
            if (c0419lh != null) {
                c0419lh.m1246e(this);
            }
            this.f1321d = c0737xb;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f1323f - ((AbstractRunnableC0494ob) obj).f1323f;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f1323f + ']';
    }
}
