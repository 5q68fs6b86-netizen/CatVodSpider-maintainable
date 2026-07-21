package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.C0.P.A;
import com.github.catvod.spider.support.C0.P.a;
import com.github.catvod.spider.support.p012C0.p015Q.AbstractC0993l;
import com.github.catvod.spider.support.p012C0.p015Q.C0990a;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.P.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0967B<Symbol, ATNInterpreter extends AbstractC0993l> {

    /* JADX INFO: renamed from: b */
    protected ATNInterpreter f2350b;

    /* JADX INFO: renamed from: a */
    private List<a> f2349a = new A();

    /* JADX INFO: renamed from: c */
    private int f2351c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: f */
    public abstract C0990a mo2383f();

    /* JADX INFO: renamed from: g */
    public final a m2384g() {
        return new C0984y(this.f2349a);
    }

    /* JADX INFO: renamed from: h */
    public final ATNInterpreter m2385h() {
        return this.f2350b;
    }

    /* JADX INFO: renamed from: i */
    public final int m2386i() {
        return this.f2351c;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo2387j(int i) {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m2388k(int i) {
        this.f2351c = i;
    }
}
