package com.github.catvod.spider.support.p044FM.p076c0;

import com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1757b;
import com.github.catvod.spider.support.p044FM.p078d0.C1789c;
import java.util.Queue;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p076c0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1769a implements InterfaceC1757b {

    /* JADX INFO: renamed from: a */
    String f3923a;

    /* JADX INFO: renamed from: b */
    C1789c f3924b;

    /* JADX INFO: renamed from: c */
    Queue<C1771c> f3925c;

    public C1769a(C1789c c1789c, Queue<C1771c> queue) {
        this.f3924b = c1789c;
        this.f3923a = c1789c.getName();
        this.f3925c = queue;
    }

    @Override // com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1757b
    /* JADX INFO: renamed from: a */
    public final void mo4163a(String str, Throwable th) {
        C1771c c1771c = new C1771c();
        System.currentTimeMillis();
        c1771c.f3926a = this.f3924b;
        Thread.currentThread().getName();
        this.f3925c.add(c1771c);
    }

    @Override // com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1757b
    public final String getName() {
        return this.f3923a;
    }
}
