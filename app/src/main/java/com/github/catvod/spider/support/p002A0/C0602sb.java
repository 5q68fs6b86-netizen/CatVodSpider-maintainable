package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.sb */
/* JADX INFO: loaded from: classes.dex */
public final class C0602sb extends C0647tt {

    /* JADX INFO: renamed from: a */
    public static final AtomicIntegerFieldUpdater f1466a = AtomicIntegerFieldUpdater.newUpdater(C0602sb.class, "_resumed");
    private volatile int _resumed;

    public C0602sb(C0601sa c0601sa, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0601sa + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }
}
