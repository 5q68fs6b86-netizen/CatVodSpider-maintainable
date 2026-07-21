package com.github.catvod.spider.support.p101G;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p101G.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2032d extends AbstractC2040l {
    public C2032d(String str) {
        this.f4646d = str;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    public final Object clone() {
        return (C2032d) super.clone();
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2040l, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ int mo4835h() {
        return 0;
    }
//DUP 
//DUP     @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
//DUP     /* JADX INFO: renamed from: j */
//DUP     public final AbstractC2041m clone() {
//DUP         return (C2032d) super.clone();
//DUP     }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2040l, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: m */
    public final AbstractC2041m mo4836m() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: t */
    public final String mo4832t() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    public final String toString() {
        return mo4843u();
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: w */
    final void mo4833w(Appendable appendable, int i, C2034f.a aVar) throws IOException {
        if (aVar.m4854g() && this.f4649b == 0) {
            AbstractC2041m abstractC2041m = this.f4648a;
            if ((abstractC2041m instanceof C2037i) && ((C2037i) abstractC2041m).m4900q0().m5080a()) {
                m4941r(appendable, i, aVar);
            }
        }
        appendable.append("<!--").append(m4926I()).append("-->");
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: x */
    final void mo4834x(Appendable appendable, int i, C2034f.a aVar) {
    }
}
