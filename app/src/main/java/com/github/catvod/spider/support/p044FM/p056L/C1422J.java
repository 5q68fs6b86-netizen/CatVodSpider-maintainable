package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p073b.C1751v;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.J */
/* JADX INFO: loaded from: classes.dex */
final class C1422J extends AbstractC1436Q {

    /* JADX INFO: renamed from: e */
    private String f3319e;

    /* JADX INFO: renamed from: d */
    private final StringBuilder f3318d = new StringBuilder();

    /* JADX INFO: renamed from: f */
    boolean f3320f = false;

    C1422J() {
        this.f3337a = 4;
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1436Q
    /* JADX INFO: renamed from: h */
    final AbstractC1436Q mo3564h() {
        super.mo3564h();
        AbstractC1436Q.m3591i(this.f3318d);
        this.f3319e = null;
        this.f3320f = false;
        return this;
    }

    /* JADX INFO: renamed from: k */
    final C1422J m3567k(char c) {
        String str = this.f3319e;
        if (str != null) {
            this.f3318d.append(str);
            this.f3319e = null;
        }
        this.f3318d.append(c);
        return this;
    }

    /* JADX INFO: renamed from: l */
    final C1422J m3568l(String str) {
        String str2 = this.f3319e;
        if (str2 != null) {
            this.f3318d.append(str2);
            this.f3319e = null;
        }
        if (this.f3318d.length() == 0) {
            this.f3319e = str;
        } else {
            this.f3318d.append(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    final String m3569m() {
        String str = this.f3319e;
        return str != null ? str : this.f3318d.toString();
    }

    public final String toString() {
        return C1751v.m4142b(C1434P.m3589b("<!--"), m3569m(), "-->");
    }
}
