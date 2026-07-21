package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p055K.C1395o;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.T */
/* JADX INFO: loaded from: classes.dex */
final class C1441T {

    /* JADX INFO: renamed from: u */
    private static final char[] f3342u;

    /* JADX INFO: renamed from: v */
    static final int[] f3343v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: a */
    private final C1455a f3344a;

    /* JADX INFO: renamed from: b */
    private final C1410D f3345b;

    /* JADX INFO: renamed from: o */
    @Nullable
    private String f3358o;

    /* JADX INFO: renamed from: p */
    @Nullable
    private String f3359p;

    /* JADX INFO: renamed from: q */
    private int f3360q;

    /* JADX INFO: renamed from: c */
    private EnumC1484j1 f3346c = EnumC1484j1.f3423a;

    /* JADX INFO: renamed from: d */
    @Nullable
    private AbstractC1436Q f3347d = null;

    /* JADX INFO: renamed from: e */
    private boolean f3348e = false;

    /* JADX INFO: renamed from: f */
    @Nullable
    private String f3349f = null;

    /* JADX INFO: renamed from: g */
    private final StringBuilder f3350g = new StringBuilder(1024);

    /* JADX INFO: renamed from: h */
    StringBuilder f3351h = new StringBuilder(1024);

    /* JADX INFO: renamed from: i */
    C1430N f3352i = new C1430N();

    /* JADX INFO: renamed from: j */
    C1428M f3353j = new C1428M();

    /* JADX INFO: renamed from: k */
    AbstractC1432O f3354k = this.f3352i;

    /* JADX INFO: renamed from: l */
    C1420I f3355l = new C1420I();

    /* JADX INFO: renamed from: m */
    C1424K f3356m = new C1424K();

    /* JADX INFO: renamed from: n */
    C1422J f3357n = new C1422J();

    /* JADX INFO: renamed from: r */
    private int f3361r = -1;

    /* JADX INFO: renamed from: s */
    private final int[] f3362s = new int[1];

    /* JADX INFO: renamed from: t */
    private final int[] f3363t = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f3342u = cArr;
        Arrays.sort(cArr);
    }

    C1441T(C1455a c1455a, C1410D c1410d) {
        this.f3344a = c1455a;
        this.f3345b = c1410d;
    }

    /* JADX INFO: renamed from: d */
    private void m3615d(String str, Object... objArr) {
        if (this.f3345b.m3536a()) {
            this.f3345b.add(new C1408C(this.f3344a, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    /* JADX INFO: renamed from: a */
    final void m3616a(EnumC1484j1 enumC1484j1) {
        m3636v(enumC1484j1);
        this.f3344a.m3659a();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    final String m3617b() {
        return this.f3358o;
    }

    /* JADX INFO: renamed from: c */
    final String m3618c() {
        if (this.f3359p == null) {
            StringBuilder sbM3589b = C1434P.m3589b("</");
            sbM3589b.append(this.f3358o);
            this.f3359p = sbM3589b.toString();
        }
        return this.f3359p;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    final int[] m3619e(@Nullable Character ch, boolean z) {
        int iIntValue;
        if (this.f3344a.m3679w()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f3344a.m3677u()) || this.f3344a.m3649G(f3342u)) {
            return null;
        }
        int[] iArr = this.f3362s;
        this.f3344a.m3644B();
        if (this.f3344a.m3645C("#")) {
            boolean zM3646D = this.f3344a.m3646D("X");
            C1455a c1455a = this.f3344a;
            String strM3666j = zM3646D ? c1455a.m3666j() : c1455a.m3665i();
            if (strM3666j.length() != 0) {
                this.f3344a.m3658Q();
                if (!this.f3344a.m3645C(";")) {
                    m3615d("missing semicolon on [&#%s]", strM3666j);
                }
                try {
                    iIntValue = Integer.valueOf(strM3666j, zM3646D ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    m3615d("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                    iArr[0] = 65533;
                } else {
                    if (iIntValue >= 128) {
                        int[] iArr2 = f3343v;
                        if (iIntValue < 160) {
                            m3615d("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                            iIntValue = iArr2[iIntValue - 128];
                        }
                    }
                    iArr[0] = iIntValue;
                }
                return iArr;
            }
            m3615d("numeric reference with no numerals", new Object[0]);
        } else {
            String strM3668l = this.f3344a.m3668l();
            boolean zM3647E = this.f3344a.m3647E(';');
            if (!(C1395o.m3502e(strM3668l) || (C1395o.m3503f(strM3668l) && zM3647E))) {
                this.f3344a.m3655M();
                if (zM3647E) {
                    m3615d("invalid named reference [%s]", strM3668l);
                }
                return null;
            }
            if (!z || (!this.f3344a.m3652J() && !this.f3344a.m3651I() && !this.f3344a.m3648F('=', '-', '_'))) {
                this.f3344a.m3658Q();
                if (!this.f3344a.m3645C(";")) {
                    m3615d("missing semicolon on [&%s]", strM3668l);
                }
                int iM3500c = C1395o.m3500c(strM3668l, this.f3363t);
                if (iM3500c == 1) {
                    iArr[0] = this.f3363t[0];
                    return iArr;
                }
                if (iM3500c == 2) {
                    return this.f3363t;
                }
                C1377c.m3354a("Unexpected characters returned for " + strM3668l);
                throw null;
            }
        }
        this.f3344a.m3655M();
        return null;
    }

    /* JADX INFO: renamed from: f */
    final void m3620f() {
        this.f3357n.mo3564h();
        this.f3357n.f3320f = true;
    }

    /* JADX INFO: renamed from: g */
    final void m3621g() {
        this.f3356m.mo3564h();
    }

    /* JADX INFO: renamed from: h */
    final AbstractC1432O m3622h(boolean z) {
        AbstractC1432O abstractC1432O;
        if (z) {
            abstractC1432O = this.f3352i;
            abstractC1432O.mo3564h();
        } else {
            abstractC1432O = this.f3353j;
            abstractC1432O.mo3564h();
        }
        this.f3354k = abstractC1432O;
        return abstractC1432O;
    }

    /* JADX INFO: renamed from: i */
    final void m3623i() {
        AbstractC1436Q.m3591i(this.f3351h);
    }

    /* JADX INFO: renamed from: j */
    final void m3624j(char c) {
        if (this.f3349f == null) {
            this.f3349f = String.valueOf(c);
        } else {
            if (this.f3350g.length() == 0) {
                this.f3350g.append(this.f3349f);
            }
            this.f3350g.append(c);
        }
        this.f3355l.m3599j(this.f3361r);
        this.f3355l.m3592a(this.f3344a.m3654L());
    }

    /* JADX INFO: renamed from: k */
    final void m3625k(AbstractC1436Q abstractC1436Q) {
        C1377c.m3355b(this.f3348e);
        this.f3347d = abstractC1436Q;
        this.f3348e = true;
        abstractC1436Q.m3599j(this.f3360q);
        abstractC1436Q.m3592a(this.f3344a.m3654L());
        this.f3361r = -1;
        int i = abstractC1436Q.f3337a;
        if (i == 2) {
            this.f3358o = ((C1430N) abstractC1436Q).f3326d;
            this.f3359p = null;
        } else if (i == 3) {
            C1428M c1428m = (C1428M) abstractC1436Q;
            if (c1428m.m3583u()) {
                m3633s("Attributes incorrectly present on end tag [/%s]", c1428m.f3327e);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    final void m3626l(String str) {
        if (this.f3349f == null) {
            this.f3349f = str;
        } else {
            if (this.f3350g.length() == 0) {
                this.f3350g.append(this.f3349f);
            }
            this.f3350g.append(str);
        }
        this.f3355l.m3599j(this.f3361r);
        this.f3355l.m3592a(this.f3344a.m3654L());
    }

    /* JADX INFO: renamed from: m */
    final void m3627m(StringBuilder sb) {
        if (this.f3349f == null) {
            this.f3349f = sb.toString();
        } else {
            if (this.f3350g.length() == 0) {
                this.f3350g.append(this.f3349f);
            }
            this.f3350g.append((CharSequence) sb);
        }
        this.f3355l.m3599j(this.f3361r);
        this.f3355l.m3592a(this.f3344a.m3654L());
    }

    /* JADX INFO: renamed from: n */
    final void m3628n() {
        m3625k(this.f3357n);
    }

    /* JADX INFO: renamed from: o */
    final void m3629o() {
        m3625k(this.f3356m);
    }

    /* JADX INFO: renamed from: p */
    final void m3630p() {
        this.f3354k.m3581s();
        m3625k(this.f3354k);
    }

    /* JADX INFO: renamed from: q */
    final void m3631q(EnumC1484j1 enumC1484j1) {
        if (this.f3345b.m3536a()) {
            this.f3345b.add(new C1408C(this.f3344a, "Unexpectedly reached end of file (EOF) in input state [%s]", enumC1484j1));
        }
    }

    /* JADX INFO: renamed from: r */
    final void m3632r(EnumC1484j1 enumC1484j1) {
        if (this.f3345b.m3536a()) {
            C1410D c1410d = this.f3345b;
            C1455a c1455a = this.f3344a;
            c1410d.add(new C1408C(c1455a, "Unexpected character '%s' in input state [%s]", Character.valueOf(c1455a.m3677u()), enumC1484j1));
        }
    }

    /* JADX INFO: renamed from: s */
    final void m3633s(String str, Object... objArr) {
        if (this.f3345b.m3536a()) {
            this.f3345b.add(new C1408C(this.f3344a, str, objArr));
        }
    }

    /* JADX INFO: renamed from: t */
    final boolean m3634t() {
        return this.f3358o != null && this.f3354k.m3585w().equalsIgnoreCase(this.f3358o);
    }

    /* JADX INFO: renamed from: u */
    final AbstractC1436Q m3635u() {
        while (!this.f3348e) {
            this.f3346c.mo3531g(this, this.f3344a);
        }
        StringBuilder sb = this.f3350g;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            C1420I c1420i = this.f3355l;
            c1420i.m3565k(string);
            this.f3349f = null;
            return c1420i;
        }
        String str = this.f3349f;
        if (str == null) {
            this.f3348e = false;
            return this.f3347d;
        }
        C1420I c1420i2 = this.f3355l;
        c1420i2.m3565k(str);
        this.f3349f = null;
        return c1420i2;
    }

    /* JADX INFO: renamed from: v */
    final void m3636v(EnumC1484j1 enumC1484j1) {
        int iOrdinal = enumC1484j1.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 7) {
                this.f3360q = this.f3344a.m3654L();
            }
        } else if (this.f3361r == -1) {
            this.f3361r = this.f3344a.m3654L();
        }
        this.f3346c = enumC1484j1;
    }
}
