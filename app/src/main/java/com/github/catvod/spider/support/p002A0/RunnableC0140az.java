package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.az */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0140az extends C0178cj implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f682a;

    public RunnableC0140az(long j, InterfaceC0747xl interfaceC0747xl) {
        super(interfaceC0747xl.getContext(), interfaceC0747xl);
        this.f682a = j;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0521pb, com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: b */
    public final String mo1021b() {
        return super.mo1021b() + "(timeMillis=" + this.f682a + ')';
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        m1037j(new C0563qq("Timed out waiting for " + this.f682a + " ms", this));
    }
}
