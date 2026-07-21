package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class adp extends AbstractRunnableC0494ob {

    /* JADX INFO: renamed from: a */
    public final RunnableC0140az f644a;

    public adp(long j, RunnableC0140az runnableC0140az) {
        super(j);
        this.f644a = runnableC0140az;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        this.f644a.run();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractRunnableC0494ob
    public final String toString() {
        return super.toString() + this.f644a.toString();
    }
}
