package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.C0.T.d;
import com.github.catvod.spider.support.p012C0.p018T.InterfaceC1006b;
import com.github.catvod.spider.support.p012C0.p018T.InterfaceC1008e;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.P.C */
/* JADX INFO: loaded from: classes.dex */
public class C0968C implements InterfaceC1008e {

    /* JADX INFO: renamed from: c */
    public static final C0983x f2352c = new C0983x();

    /* JADX INFO: renamed from: a */
    public C0968C f2353a;

    /* JADX INFO: renamed from: b */
    public int f2354b;

    public C0968C() {
        this.f2354b = -1;
    }

    public C0968C(C0968C c0968c, int i) {
        this.f2353a = c0968c;
        this.f2354b = i;
    }

    @Override // com.github.catvod.spider.support.p012C0.p018T.InterfaceC1006b
    /* JADX INFO: renamed from: b */
    public InterfaceC1006b mo2389b(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.support.p012C0.p018T.InterfaceC1006b
    /* JADX INFO: renamed from: c */
    public final String mo2390c() {
        if (mo2391d() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mo2391d(); i++) {
            sb.append(mo2389b(i).mo2390c());
        }
        return sb.toString();
    }

    @Override // com.github.catvod.spider.support.p012C0.p018T.InterfaceC1006b
    /* JADX INFO: renamed from: d */
    public int mo2391d() {
        throw null;
    }

    @Override // com.github.catvod.spider.support.p012C0.p018T.InterfaceC1006b
    /* JADX INFO: renamed from: e */
    public <T> T mo2392e(d<? extends T> dVar) {
        return (T) dVar.A(this);
    }

    /* JADX INFO: renamed from: f */
    public int m2393f() {
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2394g() {
        return this.f2354b == -1;
    }

    public final String toString() {
        StringBuilder sbM2774b = C1064d.m2774b("[");
        while (this != null) {
            if (!this.m2394g()) {
                sbM2774b.append(this.f2354b);
            }
            C0968C c0968c = this.f2353a;
            if (c0968c != null && !c0968c.m2394g()) {
                sbM2774b.append(" ");
            }
            this = this.f2353a;
        }
        sbM2774b.append("]");
        return sbM2774b.toString();
    }
}
