package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p029e0.InterfaceC1194O;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.c0.j */
/* JADX INFO: loaded from: classes.dex */
final class C1051j implements InterfaceC1194O {

    /* JADX INFO: renamed from: a */
    final StringBuilder f2577a;

    C1051j(StringBuilder sb) {
        this.f2577a = sb;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.InterfaceC1194O
    /* JADX INFO: renamed from: a */
    public final void mo2681a(AbstractC1059r abstractC1059r, int i) {
        if (abstractC1059r instanceof C1062u) {
            C1053l.m2686N(this.f2577a, (C1062u) abstractC1059r);
        } else if (abstractC1059r instanceof C1053l) {
            C1053l c1053l = (C1053l) abstractC1059r;
            if (this.f2577a.length() > 0) {
                if ((c1053l.m2702a0() || c1053l.f2581f.m2813b().equals("br")) && !C1062u.m2764M(this.f2577a)) {
                    this.f2577a.append(' ');
                }
            }
        }
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.InterfaceC1194O
    /* JADX INFO: renamed from: b */
    public final void mo2682b(AbstractC1059r abstractC1059r, int i) {
        if ((abstractC1059r instanceof C1053l) && ((C1053l) abstractC1059r).m2702a0() && (abstractC1059r.m2760s() instanceof C1062u) && !C1062u.m2764M(this.f2577a)) {
            this.f2577a.append(' ');
        }
    }
}
