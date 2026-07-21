package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1285k;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.A */
/* JADX INFO: loaded from: classes.dex */
public class C1915A extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final AbstractC1917C<?, ?> f4385a;

    /* JADX INFO: renamed from: b */
    private final C1950y f4386b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1944s f4387c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1919E f4388d;

    /* JADX INFO: renamed from: e */
    private int f4389e;

    public C1915A(AbstractC1917C<?, ?> abstractC1917C, InterfaceC1944s interfaceC1944s, C1950y c1950y) {
        this.f4389e = -1;
        this.f4385a = abstractC1917C;
        this.f4387c = interfaceC1944s;
        this.f4386b = c1950y;
        if (abstractC1917C != null) {
            this.f4389e = abstractC1917C.m4634g();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1285k m4627a() {
        AbstractC1917C<?, ?> abstractC1917C = this.f4385a;
        if (abstractC1917C != null) {
            return abstractC1917C.mo3855d().m4761c(this.f4389e, this.f4386b);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1944s m4628b() {
        return this.f4387c;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1919E m4629c() {
        return this.f4388d;
    }

    /* JADX INFO: renamed from: d */
    protected final void m4630d(int i) {
        this.f4389e = i;
    }

    /* JADX INFO: renamed from: e */
    protected final void m4631e(InterfaceC1919E interfaceC1919E) {
        this.f4388d = interfaceC1919E;
    }
}
