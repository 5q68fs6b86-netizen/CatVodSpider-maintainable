package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p137w.C2407i;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.w */
/* JADX INFO: loaded from: classes.dex */
public class C2330w extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final AbstractC2331x<?, ?> f5791a;

    /* JADX INFO: renamed from: b */
    private final C2328u f5792b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2323p f5793c;

    /* JADX INFO: renamed from: d */
    private InterfaceC2333z f5794d;

    /* JADX INFO: renamed from: e */
    private int f5795e;

    public C2330w(AbstractC2331x<?, ?> abstractC2331x, InterfaceC2323p interfaceC2323p, C2328u c2328u) {
        this.f5795e = -1;
        this.f5791a = abstractC2331x;
        this.f5793c = interfaceC2323p;
        this.f5792b = c2328u;
        if (abstractC2331x != null) {
            this.f5795e = abstractC2331x.m6301f();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C2407i m6294a() {
        AbstractC2331x<?, ?> abstractC2331x = this.f5791a;
        if (abstractC2331x != null) {
            return abstractC2331x.mo5199c().m6346c(this.f5795e, this.f5792b);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2323p m6295b() {
        return this.f5793c;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2333z m6296c() {
        return this.f5794d;
    }

    /* JADX INFO: renamed from: d */
    protected final void m6297d(int i) {
        this.f5795e = i;
    }

    /* JADX INFO: renamed from: e */
    protected final void m6298e(InterfaceC2333z interfaceC2333z) {
        this.f5794d = interfaceC2333z;
    }
}
