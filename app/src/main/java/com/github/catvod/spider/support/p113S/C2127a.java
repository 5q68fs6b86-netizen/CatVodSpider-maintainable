package com.github.catvod.spider.support.p113S;

import com.github.catvod.spider.support.p112R.InterfaceC2125b;
import com.github.catvod.spider.support.p114T.C2132c;
import java.util.Queue;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p113S.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2127a implements InterfaceC2125b {

    /* JADX INFO: renamed from: a */
    String f4985a;

    /* JADX INFO: renamed from: b */
    C2132c f4986b;

    /* JADX INFO: renamed from: c */
    Queue<C2129c> f4987c;

    public C2127a(C2132c c2132c, Queue<C2129c> queue) {
        this.f4986b = c2132c;
        this.f4985a = c2132c.getName();
        this.f4987c = queue;
    }

    @Override // com.github.catvod.spider.support.p112R.InterfaceC2125b
    /* JADX INFO: renamed from: a */
    public final void mo5366a(String str, Throwable th) {
        C2129c c2129c = new C2129c();
        System.currentTimeMillis();
        c2129c.f4988a = this.f4986b;
        Thread.currentThread().getName();
        this.f4987c.add(c2129c);
    }

    @Override // com.github.catvod.spider.support.p112R.InterfaceC2125b
    public final String getName() {
        return this.f4985a;
    }
}
