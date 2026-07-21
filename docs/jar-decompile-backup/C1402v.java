package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p055K.v */
/* JADX INFO: loaded from: classes.dex */
public class C1402v extends AbstractC1397q {
    public C1402v(String str) {
        this.f3220d = str;
    }

    /* JADX INFO: renamed from: N */
    static boolean m3528N(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: K */
    public C1402v mo3404i() {
        return (C1402v) super.mo3404i();
    }

    /* JADX INFO: renamed from: L */
    public final String m3529L() {
        return m3509I();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m3530M() {
        return C1380b.m3365d(m3509I());
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1397q, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ int mo3411g() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1397q, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: l */
    public final AbstractC1399s mo3412l() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: s */
    public String mo3405s() {
        return "#text";
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    public final String toString() {
        return mo3431t();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: v */
    void mo3406v(Appendable appendable, int i, C1387g c1387g) throws IOException {
        boolean z;
        boolean z2;
        boolean zM3421i = c1387g.m3421i();
        AbstractC1399s abstractC1399s = this.f3224a;
        C1393m c1393m = abstractC1399s instanceof C1393m ? (C1393m) abstractC1399s : null;
        boolean z3 = true;
        boolean z4 = zM3421i && !C1393m.m3446m0(abstractC1399s);
        if (z4) {
            boolean z5 = (this.f3225b == 0 && c1393m != null && c1393m.m3482s0().m3555c()) || (this.f3224a instanceof C1388h);
            boolean z6 = m3523r() == null && c1393m != null && c1393m.m3482s0().m3555c();
            AbstractC1399s abstractC1399sM3523r = m3523r();
            if ((!(abstractC1399sM3523r instanceof C1393m) || !((C1393m) abstractC1399sM3523r).m3480q0(c1387g)) && (!(abstractC1399sM3523r instanceof C1402v) || !((C1402v) abstractC1399sM3523r).m3530M())) {
                z3 = false;
            }
            if (z3 && m3530M()) {
                return;
            }
            if (this.f3225b == 0 && c1393m != null && c1393m.m3482s0().m3553a() && !m3530M()) {
                m3522q(appendable, i, c1387g);
            }
            z = z5;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        C1395o.m3501d(appendable, m3509I(), c1387g, false, z4, z, z2);
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: w */
    void mo3407w(Appendable appendable, int i, C1387g c1387g) {
    }
}
