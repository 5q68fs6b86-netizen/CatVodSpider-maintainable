package com.github.catvod.spider.support.p102H;

import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p101G.C2038j;
import com.github.catvod.spider.support.p116a.C2137a;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.H.k */
/* JADX INFO: loaded from: classes.dex */
final class C2055k {

    /* JADX INFO: renamed from: u */
    private static final char[] f4798u;

    /* JADX INFO: renamed from: v */
    static final int[] f4799v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: a */
    private final C2045a f4800a;

    /* JADX INFO: renamed from: b */
    private final C2049e f4801b;

    /* JADX INFO: renamed from: o */
    @Nullable
    private String f4814o;

    /* JADX INFO: renamed from: p */
    @Nullable
    private String f4815p;

    /* JADX INFO: renamed from: q */
    private int f4816q;

    /* JADX INFO: renamed from: c */
    private EnumC2056l f4802c = EnumC2056l.f4846a;

    /* JADX INFO: renamed from: d */
    @Nullable
    private AbstractC2053i f4803d = null;

    /* JADX INFO: renamed from: e */
    private boolean f4804e = false;

    /* JADX INFO: renamed from: f */
    @Nullable
    private String f4805f = null;

    /* JADX INFO: renamed from: g */
    private final StringBuilder f4806g = new StringBuilder(1024);

    /* JADX INFO: renamed from: h */
    StringBuilder f4807h = new StringBuilder(1024);

    /* JADX INFO: renamed from: i */
    AbstractC2053i.g f4808i = new AbstractC2053i.g();

    /* JADX INFO: renamed from: j */
    AbstractC2053i.f f4809j = new AbstractC2053i.f();

    /* JADX INFO: renamed from: k */
    AbstractC2053i.h f4810k = this.f4808i;

    /* JADX INFO: renamed from: l */
    AbstractC2053i.b f4811l = new AbstractC2053i.b();

    /* JADX INFO: renamed from: m */
    AbstractC2053i.d f4812m = new AbstractC2053i.d();

    /* JADX INFO: renamed from: n */
    AbstractC2053i.c f4813n = new AbstractC2053i.c();

    /* JADX INFO: renamed from: r */
    private int f4817r = -1;

    /* JADX INFO: renamed from: s */
    private final int[] f4818s = new int[1];

    /* JADX INFO: renamed from: t */
    private final int[] f4819t = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f4798u = cArr;
        Arrays.sort(cArr);
    }

    C2055k(C2045a c2045a, C2049e c2049e) {
        this.f4800a = c2045a;
        this.f4801b = c2049e;
    }

    /* JADX INFO: renamed from: d */
    private void m5138d(String str, Object... objArr) {
        if (this.f4801b.m5066a()) {
            this.f4801b.add(new C2048d(this.f4800a, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    /* JADX INFO: renamed from: a */
    final void m5139a(EnumC2056l enumC2056l) {
        m5159v(enumC2056l);
        this.f4800a.m4970a();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    final String m5140b() {
        return this.f4814o;
    }

    /* JADX INFO: renamed from: c */
    final String m5141c() {
        if (this.f4815p == null) {
            StringBuilder sbM5396a = C2137a.m5396a("</");
            sbM5396a.append(this.f4814o);
            this.f4815p = sbM5396a.toString();
        }
        return this.f4815p;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    final int[] m5142e(@Nullable Character ch, boolean z) {
        int iIntValue;
        if (this.f4800a.m4990w()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f4800a.m4988u()) || this.f4800a.m4960G(f4798u)) {
            return null;
        }
        int[] iArr = this.f4818s;
        this.f4800a.m4955B();
        if (this.f4800a.m4956C("#")) {
            boolean zM4957D = this.f4800a.m4957D("X");
            C2045a c2045a = this.f4800a;
            String strM4977j = zM4957D ? c2045a.m4977j() : c2045a.m4976i();
            if (strM4977j.length() != 0) {
                this.f4800a.m4969Q();
                if (!this.f4800a.m4956C(";")) {
                    m5138d("missing semicolon on [&#%s]", strM4977j);
                }
                try {
                    iIntValue = Integer.valueOf(strM4977j, zM4957D ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    m5138d("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                    iArr[0] = 65533;
                } else {
                    if (iIntValue >= 128) {
                        int[] iArr2 = f4799v;
                        if (iIntValue < 160) {
                            m5138d("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                            iIntValue = iArr2[iIntValue - 128];
                        }
                    }
                    iArr[0] = iIntValue;
                }
                return iArr;
            }
            m5138d("numeric reference with no numerals", new Object[0]);
        } else {
            String strM4979l = this.f4800a.m4979l();
            boolean zM4958E = this.f4800a.m4958E(';');
            if (!(C2038j.m4910e(strM4979l) || (C2038j.m4911f(strM4979l) && zM4958E))) {
                this.f4800a.m4966M();
                if (zM4958E) {
                    m5138d("invalid named reference [%s]", strM4979l);
                }
                return null;
            }
            if (!z || (!this.f4800a.m4963J() && !this.f4800a.m4962I() && !this.f4800a.m4959F('=', '-', '_'))) {
                this.f4800a.m4969Q();
                if (!this.f4800a.m4956C(";")) {
                    m5138d("missing semicolon on [&%s]", strM4979l);
                }
                int iM4908c = C2038j.m4908c(strM4979l, this.f4819t);
                if (iM4908c == 1) {
                    iArr[0] = this.f4819t[0];
                    return iArr;
                }
                if (iM4908c == 2) {
                    return this.f4819t;
                }
                C1271c.m3151a("Unexpected characters returned for " + strM4979l);
                throw null;
            }
        }
        this.f4800a.m4966M();
        return null;
    }

    /* JADX INFO: renamed from: f */
    final void m5143f() {
        this.f4813n.mo5099h();
        this.f4813n.getClass();
    }

    /* JADX INFO: renamed from: g */
    final void m5144g() {
        this.f4812m.mo5099h();
    }

    /* JADX INFO: renamed from: h */
    final AbstractC2053i.h m5145h(boolean z) {
        AbstractC2053i.h hVar;
        if (z) {
            hVar = this.f4808i;
            hVar.mo5099h();
        } else {
            hVar = this.f4809j;
            hVar.mo5099h();
        }
        this.f4810k = hVar;
        return hVar;
    }

    /* JADX INFO: renamed from: i */
    final void m5146i() {
        AbstractC2053i.m5091i(this.f4807h);
    }

    /* JADX INFO: renamed from: j */
    final void m5147j(char c) {
        if (this.f4805f == null) {
            this.f4805f = String.valueOf(c);
        } else {
            if (this.f4806g.length() == 0) {
                this.f4806g.append(this.f4805f);
            }
            this.f4806g.append(c);
        }
        this.f4811l.m5100j(this.f4817r);
        this.f4811l.m5092a(this.f4800a.m4965L());
    }

    /* JADX INFO: renamed from: k */
    final void m5148k(AbstractC2053i abstractC2053i) {
        C1271c.m3152b(this.f4804e);
        this.f4803d = abstractC2053i;
        this.f4804e = true;
        abstractC2053i.m5100j(this.f4816q);
        abstractC2053i.m5092a(this.f4800a.m4965L());
        this.f4817r = -1;
        int i = abstractC2053i.f4774a;
        if (i == 2) {
            this.f4814o = ((AbstractC2053i.g) abstractC2053i).f4785d;
            this.f4815p = null;
        } else if (i == 3) {
            AbstractC2053i.f fVar = (AbstractC2053i.f) abstractC2053i;
            if (fVar.m5118u()) {
                m5156s("Attributes incorrectly present on end tag [/%s]", fVar.f4786e);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    final void m5149l(String str) {
        if (this.f4805f == null) {
            this.f4805f = str;
        } else {
            if (this.f4806g.length() == 0) {
                this.f4806g.append(this.f4805f);
            }
            this.f4806g.append(str);
        }
        this.f4811l.m5100j(this.f4817r);
        this.f4811l.m5092a(this.f4800a.m4965L());
    }

    /* JADX INFO: renamed from: m */
    final void m5150m(StringBuilder sb) {
        if (this.f4805f == null) {
            this.f4805f = sb.toString();
        } else {
            if (this.f4806g.length() == 0) {
                this.f4806g.append(this.f4805f);
            }
            this.f4806g.append((CharSequence) sb);
        }
        this.f4811l.m5100j(this.f4817r);
        this.f4811l.m5092a(this.f4800a.m4965L());
    }

    /* JADX INFO: renamed from: n */
    final void m5151n() {
        m5148k(this.f4813n);
    }

    /* JADX INFO: renamed from: o */
    final void m5152o() {
        m5148k(this.f4812m);
    }

    /* JADX INFO: renamed from: p */
    final void m5153p() {
        this.f4810k.m5116s();
        m5148k(this.f4810k);
    }

    /* JADX INFO: renamed from: q */
    final void m5154q(EnumC2056l enumC2056l) {
        if (this.f4801b.m5066a()) {
            this.f4801b.add(new C2048d(this.f4800a, "Unexpectedly reached end of file (EOF) in input state [%s]", enumC2056l));
        }
    }

    /* JADX INFO: renamed from: r */
    final void m5155r(EnumC2056l enumC2056l) {
        if (this.f4801b.m5066a()) {
            C2049e c2049e = this.f4801b;
            C2045a c2045a = this.f4800a;
            c2049e.add(new C2048d(c2045a, "Unexpected character '%s' in input state [%s]", Character.valueOf(c2045a.m4988u()), enumC2056l));
        }
    }

    /* JADX INFO: renamed from: s */
    final void m5156s(String str, Object... objArr) {
        if (this.f4801b.m5066a()) {
            this.f4801b.add(new C2048d(this.f4800a, str, objArr));
        }
    }

    /* JADX INFO: renamed from: t */
    final boolean m5157t() {
        return this.f4814o != null && this.f4810k.m5120w().equalsIgnoreCase(this.f4814o);
    }

    /* JADX INFO: renamed from: u */
    final AbstractC2053i m5158u() {
        while (!this.f4804e) {
            this.f4802c.mo5166g(this, this.f4800a);
        }
        StringBuilder sb = this.f4806g;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            AbstractC2053i.b bVar = this.f4811l;
            bVar.m5101k(string);
            this.f4805f = null;
            return bVar;
        }
        String str = this.f4805f;
        if (str == null) {
            this.f4804e = false;
            return this.f4803d;
        }
        AbstractC2053i.b bVar2 = this.f4811l;
        bVar2.m5101k(str);
        this.f4805f = null;
        return bVar2;
    }

    /* JADX INFO: renamed from: v */
    final void m5159v(EnumC2056l enumC2056l) {
        int iOrdinal = enumC2056l.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 7) {
                this.f4816q = this.f4800a.m4965L();
            }
        } else if (this.f4817r == -1) {
            this.f4817r = this.f4800a.m4965L();
        }
        this.f4802c = enumC2056l;
    }
}
