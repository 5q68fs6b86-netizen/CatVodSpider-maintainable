package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.u */
/* JADX INFO: loaded from: classes.dex */
public class C1062u extends AbstractC1057p {
    public C1062u(String str) {
        this.f2596f = str;
    }

    /* JADX INFO: renamed from: M */
    static boolean m2764M(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() + (-1)) == ' ';
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: K */
    public C1062u mo2657j() {
        return (C1062u) super.mo2657j();
    }

    /* JADX INFO: renamed from: L */
    public final String m2765L() {
        return m2744I();
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1057p, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ int mo2661h() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1057p, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: m */
    public final AbstractC1059r mo2662m() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: t */
    public String mo2658t() {
        return "#text";
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    public final String toString() {
        return mo2675u();
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: w */
    void mo2659w(Appendable appendable, int i, C1048g c1048g) {
        boolean zM2668f = c1048g.m2668f();
        if (zM2668f && this.f2601d == 0) {
            AbstractC1059r abstractC1059r = this.f2600c;
            if ((abstractC1059r instanceof C1053l) && ((C1053l) abstractC1059r).m2717m0().m2812a() && !C1034b.m2597c(m2744I())) {
                m2759r(appendable, i, c1048g);
            }
        }
        C1055n.m2737d(appendable, m2744I(), c1048g, false, zM2668f && !C1053l.m2688h0(this.f2600c), zM2668f && (this.f2600c instanceof C1049h));
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: x */
    void mo2660x(Appendable appendable, int i, C1048g c1048g) {
    }
}
