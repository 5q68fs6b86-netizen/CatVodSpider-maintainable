package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C0124aj extends adf {

    /* JADX INFO: renamed from: a */
    public final Runnable f651a;

    public C0124aj(Runnable runnable, long j, InterfaceC0394kj interfaceC0394kj) {
        super(j, interfaceC0394kj);
        this.f651a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f651a.run();
        } finally {
            this.f603aa.mo1341p();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f651a;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0592rs.m1647a(runnable));
        sb.append(", ");
        sb.append(this.f604z);
        sb.append(", ");
        sb.append(this.f603aa);
        sb.append(']');
        return sb.toString();
    }
}
