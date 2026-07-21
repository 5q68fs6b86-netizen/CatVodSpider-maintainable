package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.d */
/* JADX INFO: loaded from: classes.dex */
final class C1128d extends EnumC1068A {
    C1128d() {
        super("InCaption", 10, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        if (abstractC1096O.m2850e()) {
            C1090L c1090l = (C1090L) abstractC1096O;
            if (c1090l.f2686c.equals("caption")) {
                if (!c1122b.m2927B(c1090l.f2686c)) {
                    c1122b.m2968n(this);
                    return false;
                }
                if (!c1122b.m2989a().m2706d0().equals("caption")) {
                    c1122b.m2968n(this);
                }
                c1122b.m2945V("caption");
                c1122b.m2962i();
                c1122b.m2964j0(EnumC1068A.f2636k);
            } else {
                if ((abstractC1096O.m2851f() || !C1034b.m2596b(((C1092M) abstractC1096O).f2686c, C1178z.f2824A)) && !(abstractC1096O.m2850e() && ((C1090L) abstractC1096O).f2686c.equals("table"))) {
                    if (abstractC1096O.m2850e() || !C1034b.m2596b(((C1090L) abstractC1096O).f2686c, C1178z.f2835L)) {
                        return c1122b.m2947X(abstractC1096O, EnumC1068A.f2634i);
                    }
                    c1122b.m2968n(this);
                    return false;
                }
                c1122b.m2968n(this);
                if (c1122b.m2990d("caption")) {
                    return c1122b.mo2953c(abstractC1096O);
                }
            }
        } else {
            if (abstractC1096O.m2851f()) {
                if (abstractC1096O.m2850e()) {
                }
                return c1122b.m2947X(abstractC1096O, EnumC1068A.f2634i);
            }
            if (abstractC1096O.m2850e()) {
            }
            return c1122b.m2947X(abstractC1096O, EnumC1068A.f2634i);
            c1122b.m2968n(this);
            if (c1122b.m2990d("caption")) {
                return c1122b.mo2953c(abstractC1096O);
            }
        }
        return true;
    }
}
