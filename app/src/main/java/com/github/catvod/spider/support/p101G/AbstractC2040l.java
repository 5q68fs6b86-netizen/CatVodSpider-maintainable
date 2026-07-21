package com.github.catvod.spider.support.p101G;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p101G.l */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2040l extends AbstractC2041m {
    private static boolean hasReplaced;
    private static long lastReplaceDay;

    /* JADX INFO: renamed from: d */
    Object f4646d;

    AbstractC2040l() {
    }

    /* JADX INFO: renamed from: J */
    private void m4925J() {
        Object obj = this.f4646d;
        if (obj instanceof C2030b) {
            return;
        }
        C2030b c2030b = new C2030b();
        this.f4646d = c2030b;
        if (obj != null) {
            c2030b.m4827w(mo4832t(), (String) obj);
        }
    }

    /* JADX INFO: renamed from: I */
    final String m4926I() {
        return mo4929d(mo4832t());
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: a */
    public String mo4927a(String str) {
        m4925J();
        return super.mo4927a(str);
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: c */
    public AbstractC2041m mo4928c(String str, String str2) {
        if ((this.f4646d instanceof C2030b) || !str.equals("#doctype")) {
            m4925J();
            super.mo4928c(str, str2);
        } else {
            this.f4646d = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: d */
    public String mo4929d(String str) {
        if (this.f4646d instanceof C2030b) {
            return super.mo4929d(str);
        }
        return mo4832t().equals(str) ? (String) this.f4646d : "";
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: e */
    public final C2030b mo4883e() {
        m4925J();
        return (C2030b) this.f4646d;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: f */
    public String mo4885f() {
        AbstractC2041m abstractC2041m = this.f4648a;
        return abstractC2041m != null ? abstractC2041m.mo4885f() : "";
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: h */
    public int mo4835h() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: k */
    protected final AbstractC2041m mo4891k(AbstractC2041m abstractC2041m) {
        AbstractC2040l abstractC2040l = (AbstractC2040l) super.mo4891k(abstractC2041m);
        Object obj = this.f4646d;
        if (obj instanceof C2030b) {
            abstractC2040l.f4646d = ((C2030b) obj).clone();
        }
        return abstractC2040l;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: l */
    protected final void mo4893l(String str) {
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: m */
    public AbstractC2041m mo4836m() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: n */
    protected final List<AbstractC2041m> mo4895n() {
        return AbstractC2041m.f4647c;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: p */
    protected final boolean mo4898p() {
        return this.f4646d instanceof C2030b;
    }
}
