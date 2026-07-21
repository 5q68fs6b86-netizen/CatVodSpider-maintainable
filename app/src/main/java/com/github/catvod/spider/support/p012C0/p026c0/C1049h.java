package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p028d0.C1074D;
import com.github.catvod.spider.support.p012C0.p028d0.C1076E;
import com.github.catvod.spider.support.p012C0.p028d0.C1078F;
import com.github.catvod.spider.support.p012C0.p028d0.C1122b;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1049h extends C1053l {

    /* JADX INFO: renamed from: l */
    private C1048g f2574l;

    /* JADX INFO: renamed from: m */
    private C1076E f2575m;

    /* JADX INFO: renamed from: n */
    private int f2576n;

    public C1049h() {
        super(C1078F.m2811l("#root", C1074D.f2655c), "", null);
        this.f2574l = new C1048g();
        this.f2576n = 1;
        this.f2575m = new C1076E(new C1122b());
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.C1053l
    /* JADX INFO: renamed from: o0 */
    public final C1053l mo2671o0(String str) {
        C1053l c1053lM2691M;
        Iterator<C1053l> it = m2694Q().iterator();
        while (true) {
            if (!it.hasNext()) {
                c1053lM2691M = m2691M("html");
                break;
            }
            C1053l next = it.next();
            if (next.m2706d0().equals("html")) {
                c1053lM2691M = next;
                break;
            }
        }
        for (C1053l c1053lM2691M2 : c1053lM2691M.m2694Q()) {
            if ("body".equals(c1053lM2691M2.m2706d0()) || "frameset".equals(c1053lM2691M2.m2706d0())) {
                c1053lM2691M2.mo2671o0(str);
                return this;
            }
        }
        c1053lM2691M2 = c1053lM2691M.m2691M("body");
        c1053lM2691M2.mo2671o0(str);
        return this;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.C1053l, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1049h mo2657j() {
        C1049h c1049h = (C1049h) super.mo2657j();
        c1049h.f2574l = this.f2574l.clone();
        return c1049h;
    }

    /* JADX INFO: renamed from: s0 */
    public final C1048g m2673s0() {
        return this.f2574l;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.C1053l, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: t */
    public final String mo2658t() {
        return "#document";
    }

    /* JADX INFO: renamed from: t0 */
    public final C1049h m2674t0(C1076E c1076e) {
        this.f2575m = c1076e;
        return this;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: u */
    public final String mo2675u() {
        return m2700X();
    }

    /* JADX INFO: renamed from: u0 */
    public final C1076E m2676u0() {
        return this.f2575m;
    }

    /* JADX INFO: renamed from: v0 */
    public final C1049h m2677v0() {
        this.f2576n = 2;
        return this;
    }

    /* JADX INFO: renamed from: w0 */
    public final int m2678w0() {
        return this.f2576n;
    }
}
