package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p026c0.C1055n;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.Q */
/* JADX INFO: loaded from: classes.dex */
final class C1100Q {

    /* JADX INFO: renamed from: r */
    private static final char[] f2697r;

    /* JADX INFO: renamed from: s */
    static final int[] f2698s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: a */
    private final C1119a f2699a;

    /* JADX INFO: renamed from: b */
    private final C1072C f2700b;

    /* JADX INFO: renamed from: d */
    private AbstractC1096O f2702d;

    /* JADX INFO: renamed from: i */
    AbstractC1094N f2707i;

    /* JADX INFO: renamed from: o */
    private String f2713o;

    /* JADX INFO: renamed from: c */
    private EnumC1142h1 f2701c = EnumC1142h1.f2771c;

    /* JADX INFO: renamed from: e */
    private boolean f2703e = false;

    /* JADX INFO: renamed from: f */
    private String f2704f = null;

    /* JADX INFO: renamed from: g */
    private StringBuilder f2705g = new StringBuilder(1024);

    /* JADX INFO: renamed from: h */
    StringBuilder f2706h = new StringBuilder(1024);

    /* JADX INFO: renamed from: j */
    C1092M f2708j = new C1092M();

    /* JADX INFO: renamed from: k */
    C1090L f2709k = new C1090L();

    /* JADX INFO: renamed from: l */
    C1082H f2710l = new C1082H();

    /* JADX INFO: renamed from: m */
    C1086J f2711m = new C1086J();

    /* JADX INFO: renamed from: n */
    C1084I f2712n = new C1084I();

    /* JADX INFO: renamed from: p */
    private final int[] f2714p = new int[1];

    /* JADX INFO: renamed from: q */
    private final int[] f2715q = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f2697r = cArr;
        Arrays.sort(cArr);
    }

    C1100Q(C1119a c1119a, C1072C c1072c) {
        this.f2699a = c1119a;
        this.f2700b = c1072c;
    }

    /* JADX INFO: renamed from: c */
    private void m2867c(String str) {
        if (this.f2700b.m2802a()) {
            this.f2700b.add(new C1070B(this.f2699a.m2896E(), "Invalid character reference: %s", str));
        }
    }

    /* JADX INFO: renamed from: a */
    final void m2868a(EnumC1142h1 enumC1142h1) {
        this.f2699a.m2900a();
        this.f2701c = enumC1142h1;
    }

    /* JADX INFO: renamed from: b */
    final String m2869b() {
        return this.f2713o;
    }

    /* JADX INFO: renamed from: d */
    final int[] m2870d(Character ch, boolean z) {
        int iIntValue;
        if (this.f2699a.m2917t()) {
            return null;
        }
        if ((ch == null || ch.charValue() != this.f2699a.m2916s()) && !this.f2699a.m2892A(f2697r)) {
            int[] iArr = this.f2714p;
            this.f2699a.m2918v();
            if (this.f2699a.m2919w("#")) {
                boolean zM2920x = this.f2699a.m2920x("X");
                C1119a c1119a = this.f2699a;
                String strM2906i = zM2920x ? c1119a.m2906i() : c1119a.m2905h();
                if (strM2906i.length() != 0) {
                    this.f2699a.m2899H();
                    if (!this.f2699a.m2919w(";")) {
                        m2867c("missing semicolon");
                    }
                    try {
                        iIntValue = Integer.valueOf(strM2906i, zM2920x ? 16 : 10).intValue();
                    } catch (NumberFormatException e) {
                        iIntValue = -1;
                    }
                    if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                        m2867c("character outside of valid range");
                        iArr[0] = 65533;
                    } else {
                        if (iIntValue >= 128) {
                            int[] iArr2 = f2698s;
                            if (iIntValue < 160) {
                                m2867c("character is not a valid unicode code point");
                                iIntValue = iArr2[iIntValue - 128];
                            }
                        }
                        iArr[0] = iIntValue;
                    }
                    return iArr;
                }
                m2867c("numeric reference with no numerals");
            } else {
                String strM2908k = this.f2699a.m2908k();
                boolean zM2921y = this.f2699a.m2921y(';');
                if (!(C1055n.m2738e(strM2908k) || (C1055n.m2739f(strM2908k) && zM2921y))) {
                    this.f2699a.m2897F();
                    if (zM2921y) {
                        m2867c("invalid named reference");
                    }
                    return null;
                }
                if (!z || (!this.f2699a.m2894C() && !this.f2699a.m2893B() && !this.f2699a.m2922z('=', '-', '_'))) {
                    this.f2699a.m2899H();
                    if (!this.f2699a.m2919w(";")) {
                        m2867c("missing semicolon");
                    }
                    int iM2736c = C1055n.m2736c(strM2908k, this.f2715q);
                    if (iM2736c == 1) {
                        iArr[0] = this.f2715q[0];
                        return iArr;
                    }
                    if (iM2736c == 2) {
                        return this.f2715q;
                    }
                    C0966a.m2367a("Unexpected characters returned for " + strM2908k);
                    throw null;
                }
            }
            this.f2699a.m2897F();
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    final void m2871e() {
        this.f2712n.mo2823g();
        this.f2712n.getClass();
    }

    /* JADX INFO: renamed from: f */
    final void m2872f() {
        this.f2711m.mo2823g();
    }

    /* JADX INFO: renamed from: g */
    final AbstractC1094N m2873g(boolean z) {
        AbstractC1094N abstractC1094N;
        if (z) {
            abstractC1094N = this.f2708j;
            abstractC1094N.mo2823g();
        } else {
            abstractC1094N = this.f2709k;
            abstractC1094N.mo2823g();
        }
        this.f2707i = abstractC1094N;
        return abstractC1094N;
    }

    /* JADX INFO: renamed from: h */
    final void m2874h() {
        AbstractC1096O.m2845h(this.f2706h);
    }

    /* JADX INFO: renamed from: i */
    final void m2875i(char c) {
        if (this.f2704f == null) {
            this.f2704f = String.valueOf(c);
            return;
        }
        if (this.f2705g.length() == 0) {
            this.f2705g.append(this.f2704f);
        }
        this.f2705g.append(c);
    }

    /* JADX INFO: renamed from: j */
    final void m2876j(AbstractC1096O abstractC1096O) {
        C0966a.m2370e(this.f2703e);
        this.f2702d = abstractC1096O;
        this.f2703e = true;
        int i = abstractC1096O.f2694a;
        if (i == 2) {
            this.f2713o = ((C1092M) abstractC1096O).f2685b;
        } else if (i == 3 && ((C1090L) abstractC1096O).m2839r()) {
            m2884r("Attributes incorrectly present on end tag");
        }
    }

    /* JADX INFO: renamed from: k */
    final void m2877k(String str) {
        if (this.f2704f == null) {
            this.f2704f = str;
            return;
        }
        if (this.f2705g.length() == 0) {
            this.f2705g.append(this.f2704f);
        }
        this.f2705g.append(str);
    }

    /* JADX INFO: renamed from: l */
    final void m2878l(StringBuilder sb) {
        if (this.f2704f == null) {
            this.f2704f = sb.toString();
            return;
        }
        if (this.f2705g.length() == 0) {
            this.f2705g.append(this.f2704f);
        }
        this.f2705g.append((CharSequence) sb);
    }

    /* JADX INFO: renamed from: m */
    final void m2879m() {
        m2876j(this.f2712n);
    }

    /* JADX INFO: renamed from: n */
    final void m2880n() {
        m2876j(this.f2711m);
    }

    /* JADX INFO: renamed from: o */
    final void m2881o() {
        this.f2707i.m2838q();
        m2876j(this.f2707i);
    }

    /* JADX INFO: renamed from: p */
    final void m2882p(EnumC1142h1 enumC1142h1) {
        if (this.f2700b.m2802a()) {
            this.f2700b.add(new C1070B(this.f2699a.m2896E(), "Unexpectedly reached end of file (EOF) in input state [%s]", enumC1142h1));
        }
    }

    /* JADX INFO: renamed from: q */
    final void m2883q(EnumC1142h1 enumC1142h1) {
        if (this.f2700b.m2802a()) {
            this.f2700b.add(new C1070B(this.f2699a.m2896E(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f2699a.m2916s()), enumC1142h1));
        }
    }

    /* JADX INFO: renamed from: r */
    final void m2884r(String str) {
        if (this.f2700b.m2802a()) {
            this.f2700b.add(new C1070B(this.f2699a.m2896E(), str));
        }
    }

    /* JADX INFO: renamed from: s */
    final boolean m2885s() {
        return this.f2713o != null && this.f2707i.m2841t().equalsIgnoreCase(this.f2713o);
    }

    /* JADX INFO: renamed from: t */
    final AbstractC1096O m2886t() {
        while (!this.f2703e) {
            this.f2701c.mo2801g(this, this.f2699a);
        }
        StringBuilder sb = this.f2705g;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.f2704f = null;
            C1082H c1082h = this.f2710l;
            c1082h.m2824i(string);
            return c1082h;
        }
        String str = this.f2704f;
        if (str == null) {
            this.f2703e = false;
            return this.f2702d;
        }
        C1082H c1082h2 = this.f2710l;
        c1082h2.m2824i(str);
        this.f2704f = null;
        return c1082h2;
    }

    /* JADX INFO: renamed from: u */
    final void m2887u(EnumC1142h1 enumC1142h1) {
        this.f2701c = enumC1142h1;
    }
}
