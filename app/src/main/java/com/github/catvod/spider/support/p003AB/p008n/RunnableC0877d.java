package com.github.catvod.spider.support.p003AB.p008n;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.support.p003AB.g.b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p008n.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0877d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Bili f2059a;

    /* JADX INFO: renamed from: b */
    public final b f2060b;

    public /* synthetic */ RunnableC0877d(Bili bili, b bVar) {
        this.f2059a = bili;
        this.f2060b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bili.a(this.f2059a, this.f2060b);
    }
}
