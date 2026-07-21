package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p073b.C1751v;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.K */
/* JADX INFO: loaded from: classes.dex */
final class C1424K extends AbstractC1436Q {

    /* JADX INFO: renamed from: d */
    final StringBuilder f3321d = new StringBuilder();

    /* JADX INFO: renamed from: e */
    String f3322e = null;

    /* JADX INFO: renamed from: f */
    final StringBuilder f3323f = new StringBuilder();

    /* JADX INFO: renamed from: g */
    final StringBuilder f3324g = new StringBuilder();

    /* JADX INFO: renamed from: h */
    boolean f3325h = false;

    C1424K() {
        this.f3337a = 1;
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1436Q
    /* JADX INFO: renamed from: h */
    final AbstractC1436Q mo3564h() {
        super.mo3564h();
        AbstractC1436Q.m3591i(this.f3321d);
        this.f3322e = null;
        AbstractC1436Q.m3591i(this.f3323f);
        AbstractC1436Q.m3591i(this.f3324g);
        this.f3325h = false;
        return this;
    }

    /* JADX INFO: renamed from: k */
    final String m3570k() {
        return this.f3321d.toString();
    }

    public final String toString() {
        return C1751v.m4142b(C1434P.m3589b("<!doctype "), m3570k(), ">");
    }
}
