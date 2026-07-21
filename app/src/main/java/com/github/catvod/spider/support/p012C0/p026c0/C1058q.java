package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p021Z.a;
import com.github.catvod.spider.support.p012C0.p029e0.InterfaceC1194O;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.q */
/* JADX INFO: loaded from: classes.dex */
final class C1058q implements InterfaceC1194O {

    /* JADX INFO: renamed from: a */
    private final Appendable f2597a;

    /* JADX INFO: renamed from: b */
    private final C1048g f2598b;

    C1058q(Appendable appendable, C1048g c1048g) {
        this.f2597a = appendable;
        this.f2598b = c1048g;
        c1048g.m2667e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.support.p012C0.p021Z.a */
    @Override // com.github.catvod.spider.support.p012C0.p029e0.InterfaceC1194O
    /* JADX INFO: renamed from: a */
    public final void mo2681a(AbstractC1059r abstractC1059r, int i) throws a {
        try {
            abstractC1059r.mo2659w(this.f2597a, i, this.f2598b);
        } catch (IOException e) {
            throw new a(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.support.p012C0.p021Z.a */
    @Override // com.github.catvod.spider.support.p012C0.p029e0.InterfaceC1194O
    /* JADX INFO: renamed from: b */
    public final void mo2682b(AbstractC1059r abstractC1059r, int i) throws a {
        if (abstractC1059r.mo2658t().equals("#text")) {
            return;
        }
        try {
            abstractC1059r.mo2660x(this.f2597a, i, this.f2598b);
        } catch (IOException e) {
            throw new a(e);
        }
    }
}
