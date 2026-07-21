package com.github.catvod.spider.support.p102H;

import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p101G.C2030b;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2174h;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.H.i */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2053i {

    /* JADX INFO: renamed from: a */
    int f4774a;

    /* JADX INFO: renamed from: b */
    private int f4775b;

    /* JADX INFO: renamed from: c */
    private int f4776c = -1;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.H.i$a */
    static final class a extends b {
        a(String str) {
            m5101k(str);
        }

        @Override // com.github.catvod.spider.support.p102H.AbstractC2053i.b
        public final String toString() {
            return C2174h.m5657b(C2137a.m5396a("<![CDATA["), m5102l(), "]]>");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.H.i$b */
    static class b extends AbstractC2053i {

        /* JADX INFO: renamed from: d */
        private String f4777d;

        b() {
            this.f4774a = 5;
        }

        @Override // com.github.catvod.spider.support.p102H.AbstractC2053i
        /* JADX INFO: renamed from: h */
        final AbstractC2053i mo5099h() {
            super.mo5099h();
            this.f4777d = null;
            return this;
        }

        /* JADX INFO: renamed from: k */
        final b m5101k(String str) {
            this.f4777d = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        final String m5102l() {
            return this.f4777d;
        }

        public String toString() {
            return this.f4777d;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.H.i$c */
    static final class c extends AbstractC2053i {

        /* JADX INFO: renamed from: d */
        private final StringBuilder f4778d = new StringBuilder();

        /* JADX INFO: renamed from: e */
        private String f4779e;

        c() {
            this.f4774a = 4;
        }

        @Override // com.github.catvod.spider.support.p102H.AbstractC2053i
        /* JADX INFO: renamed from: h */
        final AbstractC2053i mo5099h() {
            super.mo5099h();
            AbstractC2053i.m5091i(this.f4778d);
            this.f4779e = null;
            return this;
        }

        /* JADX INFO: renamed from: k */
        final c m5103k(char c) {
            String str = this.f4779e;
            if (str != null) {
                this.f4778d.append(str);
                this.f4779e = null;
            }
            this.f4778d.append(c);
            return this;
        }

        /* JADX INFO: renamed from: l */
        final c m5104l(String str) {
            String str2 = this.f4779e;
            if (str2 != null) {
                this.f4778d.append(str2);
                this.f4779e = null;
            }
            if (this.f4778d.length() == 0) {
                this.f4779e = str;
            } else {
                this.f4778d.append(str);
            }
            return this;
        }

        /* JADX INFO: renamed from: m */
        final String m5105m() {
            String str = this.f4779e;
            return str != null ? str : this.f4778d.toString();
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("<!--");
            String string = this.f4779e;
            if (string == null) {
                string = this.f4778d.toString();
            }
            return C2174h.m5657b(sbM5396a, string, "-->");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.H.i$d */
    static final class d extends AbstractC2053i {

        /* JADX INFO: renamed from: d */
        final StringBuilder f4780d = new StringBuilder();

        /* JADX INFO: renamed from: e */
        String f4781e = null;

        /* JADX INFO: renamed from: f */
        final StringBuilder f4782f = new StringBuilder();

        /* JADX INFO: renamed from: g */
        final StringBuilder f4783g = new StringBuilder();

        /* JADX INFO: renamed from: h */
        boolean f4784h = false;

        d() {
            this.f4774a = 1;
        }

        @Override // com.github.catvod.spider.support.p102H.AbstractC2053i
        /* JADX INFO: renamed from: h */
        final AbstractC2053i mo5099h() {
            super.mo5099h();
            AbstractC2053i.m5091i(this.f4780d);
            this.f4781e = null;
            AbstractC2053i.m5091i(this.f4782f);
            AbstractC2053i.m5091i(this.f4783g);
            this.f4784h = false;
            return this;
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("<!doctype ");
            sbM5396a.append(this.f4780d.toString());
            sbM5396a.append(">");
            return sbM5396a.toString();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.H.i$e */
    static final class e extends AbstractC2053i {
        e() {
            this.f4774a = 6;
        }

        @Override // com.github.catvod.spider.support.p102H.AbstractC2053i
        /* JADX INFO: renamed from: h */
        final AbstractC2053i mo5099h() {
            super.mo5099h();
            return this;
        }

        public final String toString() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.H.i$f */
    static final class f extends h {
        f() {
            this.f4774a = 3;
        }

        public final String toString() {
            return C2174h.m5657b(C2137a.m5396a("</"), m5108A(), ">");
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.H.i$g */
    static final class g extends h {
        g() {
            this.f4774a = 2;
        }

        @Override // com.github.catvod.spider.support.p102H.AbstractC2053i.h, com.github.catvod.spider.support.p102H.AbstractC2053i
        /* JADX INFO: renamed from: h */
        final /* bridge */ /* synthetic */ AbstractC2053i mo5099h() {
            mo5099h();
            return this;
        }

        public final String toString() {
            StringBuilder sbM5396a;
            String strM5108A;
            if (!m5118u() || this.f4795n.size() <= 0) {
                sbM5396a = C2137a.m5396a("<");
                strM5108A = m5108A();
            } else {
                sbM5396a = C2137a.m5396a("<");
                sbM5396a.append(m5108A());
                sbM5396a.append(" ");
                strM5108A = this.f4795n.toString();
            }
            return C2174h.m5657b(sbM5396a, strM5108A, ">");
        }

        @Override // com.github.catvod.spider.support.p102H.AbstractC2053i.h
        /* JADX INFO: renamed from: y */
        final h mo5099h() {
            super.mo5099h();
            this.f4795n = null;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.H.i$h */
    static abstract class h extends AbstractC2053i {

        /* JADX INFO: renamed from: d */
        @Nullable
        protected String f4785d;

        /* JADX INFO: renamed from: e */
        @Nullable
        protected String f4786e;

        /* JADX INFO: renamed from: g */
        @Nullable
        private String f4788g;

        /* JADX INFO: renamed from: j */
        @Nullable
        private String f4791j;

        /* JADX INFO: renamed from: n */
        @Nullable
        C2030b f4795n;

        /* JADX INFO: renamed from: f */
        private final StringBuilder f4787f = new StringBuilder();

        /* JADX INFO: renamed from: h */
        private boolean f4789h = false;

        /* JADX INFO: renamed from: i */
        private final StringBuilder f4790i = new StringBuilder();

        /* JADX INFO: renamed from: k */
        private boolean f4792k = false;

        /* JADX INFO: renamed from: l */
        private boolean f4793l = false;

        /* JADX INFO: renamed from: m */
        boolean f4794m = false;

        h() {
        }

        /* JADX INFO: renamed from: r */
        private void m5107r() {
            this.f4792k = true;
            String str = this.f4791j;
            if (str != null) {
                this.f4790i.append(str);
                this.f4791j = null;
            }
        }

        /* JADX INFO: renamed from: A */
        final String m5108A() {
            String str = this.f4785d;
            return str != null ? str : "[unset]";
        }

        /* JADX INFO: renamed from: k */
        final void m5109k(char c) {
            this.f4789h = true;
            String str = this.f4788g;
            if (str != null) {
                this.f4787f.append(str);
                this.f4788g = null;
            }
            this.f4787f.append(c);
        }

        /* JADX INFO: renamed from: l */
        final void m5110l(String str) {
            String strReplace = str.replace((char) 0, (char) 65533);
            this.f4789h = true;
            String str2 = this.f4788g;
            if (str2 != null) {
                this.f4787f.append(str2);
                this.f4788g = null;
            }
            if (this.f4787f.length() == 0) {
                this.f4788g = strReplace;
            } else {
                this.f4787f.append(strReplace);
            }
        }

        /* JADX INFO: renamed from: m */
        final void m5111m(char c) {
            m5107r();
            this.f4790i.append(c);
        }

        /* JADX INFO: renamed from: n */
        final void m5112n(String str) {
            m5107r();
            if (this.f4790i.length() == 0) {
                this.f4791j = str;
            } else {
                this.f4790i.append(str);
            }
        }

        /* JADX INFO: renamed from: o */
        final void m5113o(int[] iArr) {
            m5107r();
            for (int i : iArr) {
                this.f4790i.appendCodePoint(i);
            }
        }

        /* JADX INFO: renamed from: p */
        final void m5114p(char c) {
            m5115q(String.valueOf(c));
        }

        /* JADX INFO: renamed from: q */
        final void m5115q(String str) {
            String strReplace = str.replace((char) 0, (char) 65533);
            String str2 = this.f4785d;
            if (str2 != null) {
                strReplace = str2.concat(strReplace);
            }
            this.f4785d = strReplace;
            this.f4786e = C2050f.m5068a(strReplace);
        }

        /* JADX INFO: renamed from: s */
        final void m5116s() {
            if (this.f4789h) {
                m5121x();
            }
        }

        /* JADX INFO: renamed from: t */
        final boolean m5117t(String str) {
            C2030b c2030b = this.f4795n;
            return c2030b != null && c2030b.m4821n(str);
        }

        /* JADX INFO: renamed from: u */
        final boolean m5118u() {
            return this.f4795n != null;
        }

        /* JADX INFO: renamed from: v */
        final h m5119v(String str) {
            this.f4785d = str;
            this.f4786e = C2050f.m5068a(str);
            return this;
        }

        /* JADX INFO: renamed from: w */
        final String m5120w() {
            String str = this.f4785d;
            C1271c.m3152b(str == null || str.length() == 0);
            return this.f4785d;
        }

        /* JADX INFO: renamed from: x */
        final void m5121x() {
            String string;
            if (this.f4795n == null) {
                this.f4795n = new C2030b();
            }
            if (this.f4789h && this.f4795n.size() < 512) {
                String strTrim = (this.f4787f.length() > 0 ? this.f4787f.toString() : this.f4788g).trim();
                if (strTrim.length() > 0) {
                    if (this.f4792k) {
                        string = this.f4790i.length() > 0 ? this.f4790i.toString() : this.f4791j;
                    } else {
                        string = this.f4793l ? "" : null;
                    }
                    this.f4795n.m4814d(strTrim, string);
                }
            }
            AbstractC2053i.m5091i(this.f4787f);
            this.f4788g = null;
            this.f4789h = false;
            AbstractC2053i.m5091i(this.f4790i);
            this.f4791j = null;
            this.f4792k = false;
            this.f4793l = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.support.p102H.AbstractC2053i
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public h mo5099h() {
            super.mo5099h();
            this.f4785d = null;
            this.f4786e = null;
            AbstractC2053i.m5091i(this.f4787f);
            this.f4788g = null;
            this.f4789h = false;
            AbstractC2053i.m5091i(this.f4790i);
            this.f4791j = null;
            this.f4793l = false;
            this.f4792k = false;
            this.f4794m = false;
            this.f4795n = null;
            return this;
        }

        /* JADX INFO: renamed from: z */
        final void m5122z() {
            this.f4793l = true;
        }
    }

    AbstractC2053i() {
    }

    /* JADX INFO: renamed from: i */
    static void m5091i(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: renamed from: a */
    final void m5092a(int i) {
        this.f4776c = i;
    }

    /* JADX INFO: renamed from: b */
    final boolean m5093b() {
        return this.f4774a == 5;
    }

    /* JADX INFO: renamed from: c */
    final boolean m5094c() {
        return this.f4774a == 4;
    }

    /* JADX INFO: renamed from: d */
    final boolean m5095d() {
        return this.f4774a == 1;
    }

    /* JADX INFO: renamed from: e */
    final boolean m5096e() {
        return this.f4774a == 6;
    }

    /* JADX INFO: renamed from: f */
    final boolean m5097f() {
        return this.f4774a == 3;
    }

    /* JADX INFO: renamed from: g */
    final boolean m5098g() {
        return this.f4774a == 2;
    }

    /* JADX INFO: renamed from: h */
    AbstractC2053i mo5099h() {
        this.f4775b = -1;
        this.f4776c = -1;
        return this;
    }

    /* JADX INFO: renamed from: j */
    final void m5100j(int i) {
        this.f4775b = i;
    }
}
