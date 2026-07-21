package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.p012C0.p014P.g;
import com.github.catvod.spider.support.p012C0.p014P.h;
import com.github.catvod.spider.support.p012C0.p014P.i;
import com.github.catvod.spider.support.p012C0.p017S.C1002i;
import com.github.catvod.spider.support.p012C0.p037l.C1257a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p014P.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0975j implements InterfaceC0972d {

    /* JADX INFO: renamed from: a */
    protected final int f2364a;

    /* JADX INFO: renamed from: b */
    protected int f2365b = 0;

    AbstractC0975j(int i) {
        this.f2364a = i;
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC0975j m2418k(C0974f c0974f) {
        int iM3131a = C1257a.m3131a(c0974f.m2414e());
        if (iM3131a == 0) {
            int iM2416g = c0974f.m2416g();
            int iM2417h = c0974f.m2417h();
            byte[] bArrM2412c = c0974f.m2412c();
            c0974f.m2411a();
            return new i(iM2416g, iM2417h, bArrM2412c);
        }
        if (iM3131a == 1) {
            int iM2416g2 = c0974f.m2416g();
            int iM2417h2 = c0974f.m2417h();
            char[] cArrM2413d = c0974f.m2413d();
            c0974f.m2411a();
            return new g(iM2416g2, iM2417h2, cArrM2413d);
        }
        if (iM3131a != 2) {
            throw new UnsupportedOperationException("Not reached");
        }
        int iM2416g3 = c0974f.m2416g();
        int iM2417h3 = c0974f.m2417h();
        int[] iArrM2415f = c0974f.m2415f();
        c0974f.m2411a();
        return new h(iM2416g3, iM2417h3, iArrM2415f);
    }

    @Override // com.github.catvod.spider.support.p012C0.p014P.InterfaceC0978r
    /* JADX INFO: renamed from: a */
    public final void mo2419a() {
    }

    @Override // com.github.catvod.spider.support.p012C0.p014P.InterfaceC0978r
    /* JADX INFO: renamed from: d */
    public final void mo2420d(int i) {
        this.f2365b = i;
    }

    @Override // com.github.catvod.spider.support.p012C0.p014P.InterfaceC0978r
    /* JADX INFO: renamed from: g */
    public final int mo2421g() {
        return -1;
    }

    @Override // com.github.catvod.spider.support.p012C0.p014P.InterfaceC0978r
    /* JADX INFO: renamed from: i */
    public final int mo2422i() {
        return this.f2365b;
    }

    @Override // com.github.catvod.spider.support.p012C0.p014P.InterfaceC0978r
    /* JADX INFO: renamed from: j */
    public final void mo2423j() {
        int i = this.f2364a;
        int i2 = this.f2365b;
        if (i - i2 == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        this.f2365b = i2 + 1;
    }

    @Override // com.github.catvod.spider.support.p012C0.p014P.InterfaceC0978r
    public final int size() {
        return this.f2364a;
    }

    public final String toString() {
        return m2404h(C1002i.m2518b(0, this.f2364a - 1));
    }
}
