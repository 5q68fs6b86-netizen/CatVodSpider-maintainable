package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p037l.C1257a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.i */
/* JADX INFO: loaded from: classes.dex */
final class C1143i extends EnumC1068A {
    C1143i() {
        super("InSelect", 15, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        int iM3131a = C1257a.m3131a(abstractC1096O.f2694a);
        if (iM3131a == 0) {
            c1122b.m2968n(this);
            return false;
        }
        if (iM3131a == 1) {
            C1092M c1092m = (C1092M) abstractC1096O;
            String str = c1092m.f2686c;
            if (str.equals("html")) {
                return c1122b.m2947X(c1092m, EnumC1068A.f2634i);
            }
            if (str.equals("option")) {
                if (c1122b.m2989a().m2706d0().equals("option")) {
                    c1122b.m2990d("option");
                }
            } else {
                if (!str.equals("optgroup")) {
                    if (str.equals("select")) {
                        c1122b.m2968n(this);
                        return c1122b.m2990d("select");
                    }
                    if (!C1034b.m2596b(str, C1178z.f2831H)) {
                        if (str.equals("script")) {
                            return c1122b.m2947X(abstractC1096O, EnumC1068A.f2631f);
                        }
                        c1122b.m2968n(this);
                        return false;
                    }
                    c1122b.m2968n(this);
                    if (!c1122b.m2980z("select")) {
                        return false;
                    }
                    c1122b.m2990d("select");
                    return c1122b.mo2953c(c1092m);
                }
                if (c1122b.m2989a().m2706d0().equals("option")) {
                    c1122b.m2990d("option");
                }
                if (c1122b.m2989a().m2706d0().equals("optgroup")) {
                    c1122b.m2990d("optgroup");
                }
            }
            c1122b.m2929D(c1092m);
        } else if (iM3131a == 2) {
            String str2 = ((C1090L) abstractC1096O).f2686c;
            str2.getClass();
            int iHashCode = str2.hashCode();
            byte b = -1;
            if (iHashCode != -1010136971) {
                if (iHashCode != -906021636) {
                    if (iHashCode == -80773204 && str2.equals("optgroup")) {
                        b = 2;
                    }
                } else if (str2.equals("select")) {
                    b = 1;
                }
            } else if (str2.equals("option")) {
                b = 0;
            }
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        c1122b.m2968n(this);
                        return false;
                    }
                    if (c1122b.m2989a().m2706d0().equals("option") && c1122b.m2958g(c1122b.m2989a()) != null && c1122b.m2958g(c1122b.m2989a()).m2706d0().equals("optgroup")) {
                        c1122b.m2990d("option");
                    }
                    if (c1122b.m2989a().m2706d0().equals("optgroup")) {
                        c1122b.m2944U();
                    } else {
                        c1122b.m2968n(this);
                    }
                } else {
                    if (!c1122b.m2980z(str2)) {
                        c1122b.m2968n(this);
                        return false;
                    }
                    c1122b.m2945V(str2);
                    c1122b.m2956e0();
                }
            } else if (c1122b.m2989a().m2706d0().equals("option")) {
                c1122b.m2944U();
            } else {
                c1122b.m2968n(this);
            }
        } else if (iM3131a == 3) {
            c1122b.m2931F((C1084I) abstractC1096O);
        } else if (iM3131a == 4) {
            C1082H c1082h = (C1082H) abstractC1096O;
            if (c1082h.m2825j().equals(EnumC1068A.f2651z)) {
                c1122b.m2968n(this);
                return false;
            }
            c1122b.m2930E(c1082h);
        } else {
            if (iM3131a != 5) {
                c1122b.m2968n(this);
                return false;
            }
            if (!c1122b.m2989a().m2706d0().equals("html")) {
                c1122b.m2968n(this);
            }
        }
        return true;
    }
}
