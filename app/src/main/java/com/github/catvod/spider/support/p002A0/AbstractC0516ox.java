package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ox */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0516ox extends AbstractC0448mj {

    /* JADX INFO: renamed from: a */
    public ExecutorC0778yp f1354a;

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0775ym
    /* JADX INFO: renamed from: e */
    public final void mo1146e(InterfaceC0769yg interfaceC0769yg, acw acwVar) {
        try {
            ExecutorC0778yp executorC0778yp = this.f1354a;
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0778yp.f1849a;
            executorC0778yp.m1904l(acwVar, C0372jo.f1075g, false);
        } catch (RejectedExecutionException unused) {
            acj.f562x.m1145_a(acwVar);
        }
    }
}
