package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.yh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0770yh implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1829a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f1830b;

    public /* synthetic */ ThreadFactoryC0770yh(String str, boolean z) {
        this.f1829a = str;
        this.f1830b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return Util.Ԩ(this.f1829a, this.f1830b, runnable);
    }
}
