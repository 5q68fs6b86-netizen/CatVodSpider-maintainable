package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p073b.C1751v;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.N */
/* JADX INFO: loaded from: classes.dex */
final class C1430N extends AbstractC1432O {
    C1430N() {
        this.f3337a = 2;
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1432O, com.github.catvod.spider.support.p044FM.p056L.AbstractC1436Q
    /* JADX INFO: renamed from: h */
    final /* bridge */ /* synthetic */ AbstractC1436Q mo3564h() {
        mo3564h();
        return this;
    }

    public final String toString() {
        StringBuilder sbM3589b;
        String strM3573A;
        if (!m3583u() || this.f3336n.size() <= 0) {
            sbM3589b = C1434P.m3589b("<");
            strM3573A = m3573A();
        } else {
            sbM3589b = C1434P.m3589b("<");
            sbM3589b.append(m3573A());
            sbM3589b.append(" ");
            strM3573A = this.f3336n.toString();
        }
        return C1751v.m4142b(sbM3589b, strM3573A, ">");
    }
//DUP 
//DUP     /* JADX INFO: Access modifiers changed from: package-private */
//DUP     @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1432O
//DUP     /* JADX INFO: renamed from: y */
//DUP     public final AbstractC1432O mo3564h() {
//DUP         super.mo3564h();
//DUP         this.f3336n = null;
//DUP         return this;
//DUP     }
}
