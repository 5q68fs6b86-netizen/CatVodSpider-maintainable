package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p099y.AbstractC1999l;
import com.github.catvod.spider.support.p044FM.p099y.C1977a;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1917C<Symbol, ATNInterpreter extends AbstractC1999l> {

    /* JADX INFO: renamed from: b */
    protected ATNInterpreter f4391b;

    /* JADX INFO: renamed from: a */
    private List<InterfaceC1926a> f4390a = new C1916B();

    /* JADX INFO: renamed from: c */
    private int f4392c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: d */
    public abstract C1977a mo3855d();

    /* JADX INFO: renamed from: e */
    public final InterfaceC1926a m4632e() {
        return new C1951z(this.f4390a);
    }

    /* JADX INFO: renamed from: f */
    public final ATNInterpreter m4633f() {
        return this.f4391b;
    }

    /* JADX INFO: renamed from: g */
    public final int m4634g() {
        return this.f4392c;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo4635h(int i) {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m4636i(int i) {
        this.f4392c = i;
    }
}
