package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.tt */
/* JADX INFO: loaded from: classes.dex */
public class C0647tt {

    /* JADX INFO: renamed from: b */
    public static final AtomicIntegerFieldUpdater f1564b = AtomicIntegerFieldUpdater.newUpdater(C0647tt.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: c */
    public final Throwable f1565c;

    public C0647tt(Throwable th, boolean z) {
        this.f1565c = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f1565c + ']';
    }
}
