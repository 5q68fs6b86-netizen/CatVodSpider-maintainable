package com.github.catvod.spider.support.p101G;

import com.github.catvod.spider.support.p043F.C1274b;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.G.p */
/* JADX INFO: loaded from: classes.dex */
public class C2044p extends AbstractC2040l {
    public C2044p(String str) {
        this.f4646d = str;
    }

    /* JADX INFO: renamed from: N */
    static boolean m4946N(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public C2044p clone() {
        return (C2044p) super.clone();
    }

    /* JADX INFO: renamed from: L */
    public final String m4947L() {
        return m4926I();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m4948M() {
        return C1274b.m3173d(m4926I());
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2040l, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ int mo4835h() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2040l, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: m */
    public final AbstractC2041m mo4836m() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: t */
    public String mo4832t() {
        return "#text";
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    public final String toString() {
        return mo4843u();
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: w */
    void mo4833w(Appendable appendable, int i, C2034f.a aVar) throws IOException {
        boolean z;
        boolean z2;
        boolean zM4854g = aVar.m4854g();
        AbstractC2041m abstractC2041m = this.f4648a;
        C2037i c2037i = abstractC2041m instanceof C2037i ? (C2037i) abstractC2041m : null;
        boolean z3 = true;
        boolean z4 = zM4854g && !C2037i.m4867l0(abstractC2041m);
        if (z4) {
            boolean z5 = (this.f4649b == 0 && c2037i != null && c2037i.m4900q0().m5082c()) || (this.f4648a instanceof C2034f);
            boolean z6 = m4942s() == null && c2037i != null && c2037i.m4900q0().m5082c();
            AbstractC2041m abstractC2041mM4942s = m4942s();
            if ((!(abstractC2041mM4942s instanceof C2037i) || !((C2037i) abstractC2041mM4942s).m4897o0(aVar)) && (!(abstractC2041mM4942s instanceof C2044p) || !((C2044p) abstractC2041mM4942s).m4948M())) {
                z3 = false;
            }
            if (z3 && m4948M()) {
                return;
            }
            if (this.f4649b == 0 && c2037i != null && c2037i.m4900q0().m5080a() && !m4948M()) {
                m4941r(appendable, i, aVar);
            }
            z = z5;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        C2038j.m4909d(appendable, m4926I(), aVar, false, z4, z, z2);
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: x */
    void mo4834x(Appendable appendable, int i, C2034f.a aVar) {
    }
}
