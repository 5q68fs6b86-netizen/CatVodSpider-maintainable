package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.c0.p */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1057p extends AbstractC1059r {

    /* JADX INFO: renamed from: f */
    Object f2596f;

    AbstractC1057p() {
    }

    /* JADX INFO: renamed from: J */
    private void m2743J() {
        Object obj = this.f2596f;
        if (obj instanceof C1044c) {
            return;
        }
        C1044c c1044c = new C1044c();
        this.f2596f = c1044c;
        if (obj != null) {
            c1044c.m2653t(mo2658t(), (String) obj);
        }
    }

    /* JADX INFO: renamed from: I */
    final String m2744I() {
        return mo2747c(mo2658t());
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: a */
    public String mo2745a(String str) {
        m2743J();
        return super.mo2745a(str);
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: b */
    public AbstractC1059r mo2746b(String str, String str2) {
        if ((this.f2596f instanceof C1044c) || !str.equals("#doctype")) {
            m2743J();
            super.mo2746b(str, str2);
        } else {
            this.f2596f = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: c */
    public String mo2747c(String str) {
        C0966a.m2376k(str);
        if (this.f2596f instanceof C1044c) {
            return super.mo2747c(str);
        }
        return str.equals(mo2658t()) ? (String) this.f2596f : "";
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: d */
    public final C1044c mo2705d() {
        m2743J();
        return (C1044c) this.f2596f;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: e */
    public String mo2707e() {
        AbstractC1059r abstractC1059r = this.f2600c;
        return abstractC1059r != null ? abstractC1059r.mo2707e() : "";
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: h */
    public int mo2661h() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: k */
    protected final AbstractC1059r mo2713k(AbstractC1059r abstractC1059r) {
        AbstractC1057p abstractC1057p = (AbstractC1057p) super.mo2713k(abstractC1059r);
        Object obj = this.f2596f;
        if (obj instanceof C1044c) {
            abstractC1057p.f2596f = ((C1044c) obj).clone();
        }
        return abstractC1057p;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: l */
    protected final void mo2715l(String str) {
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: m */
    public AbstractC1059r mo2662m() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: n */
    protected final List<AbstractC1059r> mo2718n() {
        return AbstractC1059r.f2599e;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: p */
    protected final boolean mo2720p() {
        return this.f2596f instanceof C1044c;
    }
}
