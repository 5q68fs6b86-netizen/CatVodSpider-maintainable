package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.p012C0.p017S.C1003j;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p014P.z */
/* JADX INFO: loaded from: classes.dex */
public class C0985z extends RuntimeException {

    /* JADX INFO: renamed from: c */
    private final AbstractC0967B<?, ?> f2393c;

    /* JADX INFO: renamed from: d */
    private final C0983x f2394d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0978r f2395e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0969D f2396f;

    /* JADX INFO: renamed from: g */
    private int f2397g;

    public C0985z(AbstractC0967B<?, ?> abstractC0967B, InterfaceC0978r interfaceC0978r, C0983x c0983x) {
        this.f2397g = -1;
        this.f2393c = abstractC0967B;
        this.f2395e = interfaceC0978r;
        this.f2394d = c0983x;
        if (abstractC0967B != null) {
            this.f2397g = abstractC0967B.m2386i();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1003j m2458a() {
        AbstractC0967B<?, ?> abstractC0967B = this.f2393c;
        if (abstractC0967B != null) {
            return abstractC0967B.mo2383f().m2495c(this.f2397g, this.f2394d);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0978r m2459b() {
        return this.f2395e;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0969D m2460c() {
        return this.f2396f;
    }

    /* JADX INFO: renamed from: d */
    protected final void m2461d(int i) {
        this.f2397g = i;
    }

    /* JADX INFO: renamed from: e */
    protected final void m2462e(InterfaceC0969D interfaceC0969D) {
        this.f2396f = interfaceC0969D;
    }
}
