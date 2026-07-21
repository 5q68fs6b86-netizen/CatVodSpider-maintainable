package com.github.catvod.spider.support.p044FM.p055K;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.q */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1397q extends AbstractC1399s {

    /* JADX INFO: renamed from: d */
    Object f3220d;

    AbstractC1397q() {
    }

    /* JADX INFO: renamed from: J */
    private void m3507J() {
        Object obj = this.f3220d;
        if (obj instanceof C1383c) {
            return;
        }
        C1383c c1383c = new C1383c();
        this.f3220d = c1383c;
        if (obj != null) {
            c1383c.m3400w(mo3405s(), (String) obj);
        }
    }

    /* JADX INFO: renamed from: H */
    public AbstractC1399s m3508H(String str, String str2) {
        if ((this.f3220d instanceof C1383c) || !str.equals("#doctype")) {
            m3507J();
            mo3463d().m3401x(C1400t.m3527a(this).m3549f().m3539b(str), str2);
        } else {
            this.f3220d = str2;
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    final String m3509I() {
        return mo3511c(mo3405s());
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: a */
    public String mo3510a(String str) {
        m3507J();
        return super.mo3510a(str);
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: c */
    public String mo3511c(String str) {
        if (this.f3220d instanceof C1383c) {
            return super.mo3511c(str);
        }
        return mo3405s().equals(str) ? (String) this.f3220d : "";
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: d */
    public final C1383c mo3463d() {
        m3507J();
        return (C1383c) this.f3220d;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: e */
    public String mo3465e() {
        AbstractC1399s abstractC1399s = this.f3224a;
        return abstractC1399s != null ? abstractC1399s.mo3465e() : "";
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: g */
    public int mo3411g() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: j */
    protected final AbstractC1399s mo3470j(AbstractC1399s abstractC1399s) {
        AbstractC1397q abstractC1397q = (AbstractC1397q) super.mo3470j(abstractC1399s);
        Object obj = this.f3220d;
        if (obj instanceof C1383c) {
            abstractC1397q.f3220d = ((C1383c) obj).clone();
        }
        return abstractC1397q;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: k */
    protected final void mo3472k(String str) {
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: l */
    public AbstractC1399s mo3412l() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: m */
    protected final List<AbstractC1399s> mo3475m() {
        return AbstractC1399s.f3223c;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: o */
    protected final boolean mo3477o() {
        return this.f3220d instanceof C1383c;
    }
}
