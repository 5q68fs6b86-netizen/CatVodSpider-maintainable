package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1284j;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1937l implements InterfaceC1929d {

    /* JADX INFO: renamed from: a */
    protected final int f4419a;

    /* JADX INFO: renamed from: b */
    protected int f4420b = 0;

    AbstractC1937l(int i) {
        this.f4419a = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: a */
    public final void mo4656a() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: d */
    public final int mo4657d() {
        return -1;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: f */
    public final void mo4658f(int i) {
        this.f4420b = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: i */
    public final int mo4660i() {
        return this.f4420b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: j */
    public final void mo4661j() {
        int i = this.f4419a;
        int i2 = this.f4420b;
        if (i - i2 == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        this.f4420b = i2 + 1;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    public final int size() {
        return this.f4419a;
    }

    public final String toString() {
        return mo4667e(C1284j.m3201b(0, this.f4419a - 1));
    }
}
