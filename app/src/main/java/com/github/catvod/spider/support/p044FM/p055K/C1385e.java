package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p056L.C1414F;
import com.github.catvod.spider.support.p044FM.p056L.C1458b;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1385e extends AbstractC1397q {
    public C1385e(String str) {
        this.f3220d = str;
    }

    /* JADX INFO: renamed from: M */
    private static boolean m3408M(String str) {
        return str.length() > 1 && (str.startsWith("!") || str.startsWith("?"));
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public final C1403w m3409K() {
        String strM3509I = m3509I();
        String strSubstring = strM3509I.substring(1, strM3509I.length() - 1);
        if (m3408M(strSubstring)) {
            return null;
        }
        C1414F c1414f = new C1414F(new C1458b());
        c1414f.m3550g();
        C1388h c1388hM3548e = c1414f.m3548e("<" + strSubstring + ">", super.mo3465e());
        if (c1388hM3548e.m3433y0().m3456V().size() <= 0) {
            return null;
        }
        C1393m c1393m = c1388hM3548e.m3433y0().m3455U().get(0);
        C1403w c1403w = new C1403w(C1400t.m3527a(c1388hM3548e).m3549f().m3541d(c1393m.m3483t0()), strM3509I.startsWith("!"));
        c1403w.mo3463d().m3388e(c1393m.mo3463d());
        return c1403w;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m3410L() {
        return m3408M(m3509I());
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: clone */
    public final Object mo3404i() {
        return (C1385e) super.mo3404i();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1397q, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ int mo3411g() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: i */
    public final AbstractC1399s mo3404i() {
        return (C1385e) super.mo3404i();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1397q, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: l */
    public final AbstractC1399s mo3412l() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: s */
    public final String mo3405s() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    public final String toString() {
        return mo3431t();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: v */
    final void mo3406v(Appendable appendable, int i, C1387g c1387g) throws IOException {
        if (c1387g.m3421i() && this.f3225b == 0) {
            AbstractC1399s abstractC1399s = this.f3224a;
            if ((abstractC1399s instanceof C1393m) && ((C1393m) abstractC1399s).m3482s0().m3553a()) {
                m3522q(appendable, i, c1387g);
            }
        }
        appendable.append("<!--").append(m3509I()).append("-->");
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: w */
    final void mo3407w(Appendable appendable, int i, C1387g c1387g) {
    }
}
