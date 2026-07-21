package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p053I.C1378d;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s;
import com.github.catvod.spider.support.p044FM.p055K.C1383c;
import com.github.catvod.spider.support.p044FM.p055K.C1384d;
import com.github.catvod.spider.support.p044FM.p055K.C1385e;
import com.github.catvod.spider.support.p044FM.p055K.C1386f;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p055K.C1396p;
import com.github.catvod.spider.support.p044FM.p055K.C1402v;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1458b extends AbstractC1487k1 {

    /* JADX INFO: renamed from: l */
    private EnumC1406B f3385l;

    /* JADX INFO: renamed from: m */
    private EnumC1406B f3386m;

    /* JADX INFO: renamed from: n */
    private boolean f3387n;

    /* JADX INFO: renamed from: o */
    @Nullable
    private C1393m f3388o;

    /* JADX INFO: renamed from: p */
    @Nullable
    private C1396p f3389p;

    /* JADX INFO: renamed from: q */
    private ArrayList<C1393m> f3390q;

    /* JADX INFO: renamed from: r */
    private ArrayList<EnumC1406B> f3391r;

    /* JADX INFO: renamed from: s */
    private List<String> f3392s;

    /* JADX INFO: renamed from: t */
    private C1428M f3393t;

    /* JADX INFO: renamed from: u */
    private boolean f3394u;

    /* JADX INFO: renamed from: v */
    private boolean f3395v;

    /* JADX INFO: renamed from: w */
    private String[] f3396w = {null};

    /* JADX INFO: renamed from: x */
    static final String[] f3382x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: y */
    static final String[] f3383y = {"ol", "ul"};

    /* JADX INFO: renamed from: z */
    static final String[] f3384z = {"button"};

    /* JADX INFO: renamed from: A */
    static final String[] f3377A = {"html", "table"};

    /* JADX INFO: renamed from: B */
    static final String[] f3378B = {"optgroup", "option"};

    /* JADX INFO: renamed from: C */
    static final String[] f3379C = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};

    /* JADX INFO: renamed from: D */
    static final String[] f3380D = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* JADX INFO: renamed from: E */
    static final String[] f3381E = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* JADX INFO: renamed from: H */
    private boolean m3681H(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f3472e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strM3469i0 = this.f3472e.get(size).m3469i0();
            if (C1380b.m3364c(strM3469i0, strArr)) {
                return true;
            }
            if (C1380b.m3364c(strM3469i0, strArr2)) {
                return false;
            }
            if (strArr3 != null && C1380b.m3364c(strM3469i0, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Q */
    private void m3682Q(AbstractC1399s abstractC1399s) {
        C1393m c1393mM3755a;
        C1393m c1393m;
        C1396p c1396p;
        if (!this.f3472e.isEmpty()) {
            if (this.f3395v && C1380b.m3364c(m3755a().m3469i0(), C1404A.f3227A)) {
                m3698O(abstractC1399s);
            } else {
                c1393mM3755a = m3755a();
            }
            if (abstractC1399s instanceof C1393m) {
                c1393m = (C1393m) abstractC1399s;
                if (c1393m.m3482s0().m3557e() || (c1396p = this.f3389p) == null) {
                }
                c1396p.m3505y0(c1393m);
                return;
            }
        }
        c1393mM3755a = this.f3471d;
        c1393mM3755a.m3448L(abstractC1399s);
        if (abstractC1399s instanceof C1393m) {
            c1393m = (C1393m) abstractC1399s;
            if (c1393m.m3482s0().m3557e()) {
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    private static boolean m3683Z(ArrayList<C1393m> arrayList, C1393m c1393m) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == c1393m) {
                return true;
            }
            size--;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    private void m3684o(String... strArr) {
        for (int size = this.f3472e.size() - 1; size >= 0; size--) {
            C1393m c1393m = this.f3472e.get(size);
            String strM3469i0 = c1393m.m3469i0();
            int i = C1380b.f3175f;
            boolean z = false;
            for (String str : strArr) {
                if (str.equals(strM3469i0)) {
                    z = true;
                    break;
                }
            }
            if (z || c1393m.m3469i0().equals("html")) {
                return;
            }
            this.f3472e.remove(size);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    final C1393m m3685A(String str) {
        int size = this.f3472e.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            C1393m c1393m = this.f3472e.get(size);
            if (c1393m.m3469i0().equals(str)) {
                return c1393m;
            }
            size--;
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    final C1393m m3686B() {
        return this.f3388o;
    }

    /* JADX INFO: renamed from: C */
    final List<String> m3687C() {
        return this.f3392s;
    }

    /* JADX INFO: renamed from: D */
    final boolean m3688D(String str) {
        return m3689E(str, f3384z);
    }

    /* JADX INFO: renamed from: E */
    final boolean m3689E(String str, String[] strArr) {
        String[] strArr2 = f3382x;
        String[] strArr3 = this.f3396w;
        strArr3[0] = str;
        return m3681H(strArr3, strArr2, strArr);
    }

    /* JADX INFO: renamed from: F */
    final boolean m3690F(String[] strArr) {
        return m3681H(strArr, f3382x, null);
    }

    /* JADX INFO: renamed from: G */
    final boolean m3691G(String str) {
        for (int size = this.f3472e.size() - 1; size >= 0; size--) {
            String strM3469i0 = this.f3472e.get(size).m3469i0();
            if (strM3469i0.equals(str)) {
                return true;
            }
            if (!C1380b.m3364c(strM3469i0, f3378B)) {
                return false;
            }
        }
        C1377c.m3354a("Should not be reachable");
        throw null;
    }

    /* JADX INFO: renamed from: I */
    final boolean m3692I(String str) {
        String[] strArr = f3377A;
        String[] strArr2 = this.f3396w;
        strArr2[0] = str;
        return m3681H(strArr2, strArr, null);
    }

    /* JADX INFO: renamed from: J */
    final C1393m m3693J(C1430N c1430n) {
        if (c1430n.m3583u() && !c1430n.f3336n.isEmpty() && c1430n.f3336n.m3391k(this.f3475h) > 0) {
            Object[] objArr = {c1430n.f3327e};
            C1410D c1410dM3545a = this.f3468a.m3545a();
            if (c1410dM3545a.m3536a()) {
                c1410dM3545a.add(new C1408C(this.f3469b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (!c1430n.f3335m) {
            C1416G c1416gM3761k = m3761k(c1430n.m3585w(), this.f3475h);
            C1412E c1412e = this.f3475h;
            C1383c c1383c = c1430n.f3336n;
            c1412e.m3540c(c1383c);
            C1393m c1393m = new C1393m(c1416gM3761k, null, c1383c);
            m3682Q(c1393m);
            this.f3472e.add(c1393m);
            return c1393m;
        }
        C1393m c1393mM3696M = m3696M(c1430n);
        this.f3472e.add(c1393mM3696M);
        this.f3470c.m3636v(EnumC1484j1.f3423a);
        C1441T c1441t = this.f3470c;
        C1428M c1428m = this.f3393t;
        c1428m.mo3564h();
        c1428m.m3584v(c1393mM3696M.m3483t0());
        c1441t.m3625k(c1428m);
        return c1393mM3696M;
    }

    /* JADX INFO: renamed from: K */
    final void m3694K(C1420I c1420i) {
        AbstractC1399s c1386f;
        C1393m c1393mM3755a = m3755a();
        String strM3469i0 = c1393mM3755a.m3469i0();
        String strM3566l = c1420i.m3566l();
        if (c1420i instanceof C1418H) {
            c1386f = new C1384d(strM3566l);
        } else {
            c1386f = mo3714e(strM3469i0) ? new C1386f(strM3566l) : new C1402v(strM3566l);
        }
        c1393mM3755a.m3448L(c1386f);
    }

    /* JADX INFO: renamed from: L */
    final void m3695L(C1422J c1422j) {
        m3682Q(new C1385e(c1422j.m3569m()));
    }

    /* JADX INFO: renamed from: M */
    final C1393m m3696M(C1430N c1430n) {
        C1416G c1416gM3761k = m3761k(c1430n.m3585w(), this.f3475h);
        C1412E c1412e = this.f3475h;
        C1383c c1383c = c1430n.f3336n;
        c1412e.m3540c(c1383c);
        C1393m c1393m = new C1393m(c1416gM3761k, null, c1383c);
        m3682Q(c1393m);
        if (c1430n.f3335m) {
            if (!c1416gM3761k.m3559g()) {
                c1416gM3761k.m3563l();
            } else if (!c1416gM3761k.m3556d()) {
                this.f3470c.m3633s("Tag [%s] cannot be self closing; not a void tag", c1416gM3761k.m3561j());
            }
        }
        return c1393m;
    }

    /* JADX INFO: renamed from: N */
    final C1396p m3697N(C1430N c1430n, boolean z, boolean z2) {
        C1416G c1416gM3761k = m3761k(c1430n.m3585w(), this.f3475h);
        C1412E c1412e = this.f3475h;
        C1383c c1383c = c1430n.f3336n;
        c1412e.m3540c(c1383c);
        C1396p c1396p = new C1396p(c1416gM3761k, c1383c);
        if (!z2 || !m3707Y("template")) {
            this.f3389p = c1396p;
        }
        m3682Q(c1396p);
        if (z) {
            this.f3472e.add(c1396p);
        }
        return c1396p;
    }

    /* JADX INFO: renamed from: O */
    final void m3698O(AbstractC1399s abstractC1399s) {
        C1393m c1393mM3723l;
        C1393m c1393mM3685A = m3685A("table");
        boolean z = false;
        if (c1393mM3685A == null) {
            c1393mM3723l = this.f3472e.get(0);
        } else if (c1393mM3685A.m3473k0() != null) {
            c1393mM3723l = c1393mM3685A.m3473k0();
            z = true;
        } else {
            c1393mM3723l = m3723l(c1393mM3685A);
        }
        if (!z) {
            c1393mM3723l.m3448L(abstractC1399s);
        } else {
            C1377c.m3360g(c1393mM3685A);
            c1393mM3685A.m3453S(abstractC1399s);
        }
    }

    /* JADX INFO: renamed from: P */
    final void m3699P() {
        this.f3390q.add(null);
    }

    /* JADX INFO: renamed from: R */
    final C1393m m3700R() {
        C1393m c1393m = new C1393m(m3761k("html", this.f3475h), null, null);
        m3682Q(c1393m);
        this.f3472e.add(c1393m);
        return c1393m;
    }

    /* JADX INFO: renamed from: S */
    final boolean m3701S(C1393m c1393m) {
        return m3683Z(this.f3390q, c1393m);
    }

    /* JADX INFO: renamed from: T */
    final boolean m3702T(C1393m c1393m) {
        return C1380b.m3364c(c1393m.m3469i0(), f3381E);
    }

    /* JADX INFO: renamed from: U */
    final void m3703U() {
        this.f3386m = this.f3385l;
    }

    /* JADX INFO: renamed from: V */
    final void m3704V(C1393m c1393m) {
        if (this.f3387n) {
            return;
        }
        String strMo3510a = c1393m.mo3510a("href");
        if (strMo3510a.length() != 0) {
            this.f3473f = strMo3510a;
            this.f3387n = true;
            this.f3471d.m3515F(strMo3510a);
        }
    }

    /* JADX INFO: renamed from: W */
    final void m3705W() {
        this.f3392s = new ArrayList();
    }

    /* JADX INFO: renamed from: X */
    final boolean m3706X(C1393m c1393m) {
        return m3683Z(this.f3472e, c1393m);
    }

    /* JADX INFO: renamed from: Y */
    final boolean m3707Y(String str) {
        return m3685A(str) != null;
    }

    /* JADX INFO: renamed from: a0 */
    final EnumC1406B m3708a0() {
        return this.f3386m;
    }

    /* JADX INFO: renamed from: b0 */
    final C1393m m3709b0() {
        return this.f3472e.remove(this.f3472e.size() - 1);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1487k1
    /* JADX INFO: renamed from: c */
    final C1412E mo3710c() {
        return C1412E.f3294c;
    }

    @Nullable
    /* JADX INFO: renamed from: c0 */
    final C1393m m3711c0(String str) {
        for (int size = this.f3472e.size() - 1; size >= 0; size--) {
            C1393m c1393m = this.f3472e.get(size);
            this.f3472e.remove(size);
            if (c1393m.m3469i0().equals(str)) {
                boolean z = this.f3474g instanceof C1428M;
                return c1393m;
            }
        }
        return null;
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1487k1
    @ParametersAreNonnullByDefault
    /* JADX INFO: renamed from: d */
    protected final void mo3712d(Reader reader, String str, C1414F c1414f) {
        super.mo3712d(reader, str, c1414f);
        this.f3385l = EnumC1406B.f3265a;
        this.f3386m = null;
        this.f3387n = false;
        this.f3388o = null;
        this.f3389p = null;
        this.f3390q = new ArrayList<>();
        this.f3391r = new ArrayList<>();
        this.f3392s = new ArrayList();
        this.f3393t = new C1428M();
        this.f3394u = true;
        this.f3395v = false;
    }

    @Nullable
    /* JADX INFO: renamed from: d0 */
    final EnumC1406B m3713d0() {
        if (this.f3391r.size() <= 0) {
            return null;
        }
        ArrayList<EnumC1406B> arrayList = this.f3391r;
        return arrayList.remove(arrayList.size() - 1);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1487k1
    /* JADX INFO: renamed from: e */
    protected final boolean mo3714e(String str) {
        return str.equals("script") || str.equals("style");
    }

    /* JADX INFO: renamed from: e0 */
    final int m3715e0(C1393m c1393m) {
        for (int i = 0; i < this.f3390q.size(); i++) {
            if (c1393m == this.f3390q.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f0 */
    final boolean m3716f0(AbstractC1436Q abstractC1436Q, EnumC1406B enumC1406B) {
        this.f3474g = abstractC1436Q;
        return enumC1406B.mo3535d(abstractC1436Q, this);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1487k1
    /* JADX INFO: renamed from: g */
    protected final boolean mo3717g(AbstractC1436Q abstractC1436Q) {
        this.f3474g = abstractC1436Q;
        return this.f3385l.mo3535d(abstractC1436Q, this);
    }

    /* JADX INFO: renamed from: g0 */
    final void m3718g0(C1393m c1393m) {
        m3725m(c1393m);
        this.f3390q.add(c1393m);
    }

    /* JADX INFO: renamed from: h0 */
    final void m3719h0(EnumC1406B enumC1406B) {
        this.f3391r.add(enumC1406B);
    }

    /* JADX INFO: renamed from: i0 */
    final void m3720i0(C1393m c1393m, int i) {
        m3725m(c1393m);
        try {
            this.f3390q.add(i, c1393m);
        } catch (IndexOutOfBoundsException unused) {
            this.f3390q.add(c1393m);
        }
    }

    /* JADX INFO: renamed from: j0 */
    final void m3721j0() {
        C1393m c1393m;
        if (this.f3472e.size() > 256) {
            return;
        }
        if (this.f3390q.size() > 0) {
            ArrayList<C1393m> arrayList = this.f3390q;
            c1393m = arrayList.get(arrayList.size() - 1);
        } else {
            c1393m = null;
        }
        if (c1393m == null || m3706X(c1393m)) {
            return;
        }
        int size = this.f3390q.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        boolean z = true;
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            c1393m = this.f3390q.get(i3);
            if (c1393m == null || m3706X(c1393m)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i3++;
                c1393m = this.f3390q.get(i3);
            }
            C1377c.m3360g(c1393m);
            C1393m c1393m2 = new C1393m(m3761k(c1393m.m3469i0(), this.f3475h), null, c1393m.mo3463d().clone());
            m3682Q(c1393m2);
            this.f3472e.add(c1393m2);
            this.f3390q.set(i3, c1393m2);
            if (i3 == i2) {
                return;
            } else {
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    final void m3722k0(C1393m c1393m) {
        int size = this.f3390q.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.f3390q.get(size) != c1393m);
        this.f3390q.remove(size);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    final C1393m m3723l(C1393m c1393m) {
        for (int size = this.f3472e.size() - 1; size >= 0; size--) {
            if (this.f3472e.get(size) == c1393m) {
                return this.f3472e.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    final boolean m3724l0(C1393m c1393m) {
        for (int size = this.f3472e.size() - 1; size >= 0; size--) {
            if (this.f3472e.get(size) == c1393m) {
                this.f3472e.remove(size);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    final void m3725m(C1393m c1393m) {
        int size = this.f3390q.size() - 1;
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = 0;
        while (size >= i) {
            C1393m c1393m2 = this.f3390q.get(size);
            if (c1393m2 == null) {
                return;
            }
            if (c1393m.m3469i0().equals(c1393m2.m3469i0()) && c1393m.mo3463d().equals(c1393m2.mo3463d())) {
                i2++;
            }
            if (i2 == 3) {
                this.f3390q.remove(size);
                return;
            }
            size--;
        }
    }

    /* JADX INFO: renamed from: m0 */
    final void m3726m0(C1393m c1393m, C1393m c1393m2) {
        ArrayList<C1393m> arrayList = this.f3390q;
        int iLastIndexOf = arrayList.lastIndexOf(c1393m);
        C1377c.m3356c(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, c1393m2);
    }

    /* JADX INFO: renamed from: n */
    final void m3727n() {
        while (!this.f3390q.isEmpty()) {
            int size = this.f3390q.size();
            if ((size > 0 ? this.f3390q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    final void m3728n0() {
        if (!m3707Y("body")) {
            this.f3472e.add(this.f3471d.m3433y0());
        }
        this.f3385l = EnumC1406B.f3271g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0153 A[LOOP:0: B:10:0x001f->B:109:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x003d. Please report as an issue. */
    /* JADX INFO: renamed from: o0 */
    final boolean m3729o0() {
        EnumC1406B enumC1406B;
        int size = this.f3472e.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        EnumC1406B enumC1406B2 = this.f3385l;
        if (this.f3472e.size() == 0) {
            this.f3385l = EnumC1406B.f3271g;
        }
        boolean z = false;
        while (true) {
            if (size >= i) {
                C1393m c1393m = this.f3472e.get(size);
                if (size == i) {
                    z = true;
                }
                String strM3469i0 = c1393m != null ? c1393m.m3469i0() : "";
                strM3469i0.getClass();
                switch (strM3469i0) {
                    case "frameset":
                        enumC1406B = EnumC1406B.f3284t;
                        this.f3385l = enumC1406B;
                        break;
                    case "template":
                        if (this.f3391r.size() > 0) {
                            ArrayList<EnumC1406B> arrayList = this.f3391r;
                            enumC1406B = arrayList.get(arrayList.size() - 1);
                        } else {
                            enumC1406B = null;
                        }
                        if (enumC1406B == null) {
                            throw new C1378d("Bug: no template insertion mode on stack!");
                        }
                        this.f3385l = enumC1406B;
                        break;
                    case "select":
                        enumC1406B = EnumC1406B.f3280p;
                        this.f3385l = enumC1406B;
                        break;
                    case "colgroup":
                        enumC1406B = EnumC1406B.f3276l;
                        this.f3385l = enumC1406B;
                        break;
                    case "td":
                    case "th":
                        if (z) {
                            if (z) {
                                size--;
                            } else {
                                enumC1406B = EnumC1406B.f3271g;
                            }
                            break;
                        } else {
                            enumC1406B = EnumC1406B.f3279o;
                        }
                        this.f3385l = enumC1406B;
                        break;
                    case "tr":
                        enumC1406B = EnumC1406B.f3278n;
                        this.f3385l = enumC1406B;
                        break;
                    case "body":
                        enumC1406B = EnumC1406B.f3271g;
                        this.f3385l = enumC1406B;
                        break;
                    case "head":
                        if (z) {
                            if (z) {
                                size--;
                            } else {
                                enumC1406B = EnumC1406B.f3271g;
                            }
                            break;
                        } else {
                            enumC1406B = EnumC1406B.f3268d;
                        }
                        this.f3385l = enumC1406B;
                        break;
                    case "html":
                        enumC1406B = this.f3388o == null ? EnumC1406B.f3267c : EnumC1406B.f3270f;
                        this.f3385l = enumC1406B;
                        break;
                    case "table":
                        enumC1406B = EnumC1406B.f3273i;
                        this.f3385l = enumC1406B;
                        break;
                    case "tbody":
                    case "tfoot":
                    case "thead":
                        enumC1406B = EnumC1406B.f3277m;
                        this.f3385l = enumC1406B;
                        break;
                    case "caption":
                        enumC1406B = EnumC1406B.f3275k;
                        this.f3385l = enumC1406B;
                        break;
                    default:
                        if (z) {
                            enumC1406B = EnumC1406B.f3271g;
                            this.f3385l = enumC1406B;
                            break;
                        } else {
                            size--;
                            break;
                        }
                        break;
                }
            }
            return this.f3385l != enumC1406B2;
        }
    }

    /* JADX INFO: renamed from: p */
    final void m3730p() {
        m3684o("tbody", "tfoot", "thead", "template");
    }

    /* JADX INFO: renamed from: p0 */
    final void m3731p0() {
        this.f3389p = null;
    }

    /* JADX INFO: renamed from: q */
    final void m3732q() {
        m3684o("table", "template");
    }

    /* JADX INFO: renamed from: q0 */
    final void m3733q0(boolean z) {
        this.f3395v = z;
    }

    /* JADX INFO: renamed from: r */
    final void m3734r() {
        m3684o("tr", "template");
    }

    /* JADX INFO: renamed from: r0 */
    final void m3735r0(C1393m c1393m) {
        this.f3388o = c1393m;
    }

    /* JADX INFO: renamed from: s */
    final void m3736s() {
        m3743w("p");
        if (!"p".equals(m3755a().m3469i0())) {
            m3738t(this.f3385l);
        }
        m3711c0("p");
    }

    /* JADX INFO: renamed from: s0 */
    final EnumC1406B m3737s0() {
        return this.f3385l;
    }

    /* JADX INFO: renamed from: t */
    final void m3738t(EnumC1406B enumC1406B) {
        if (this.f3468a.m3545a().m3536a()) {
            this.f3468a.m3545a().add(new C1408C(this.f3469b, "Unexpected %s token [%s] when in state [%s]", this.f3474g.getClass().getSimpleName(), this.f3474g, enumC1406B));
        }
    }

    /* JADX INFO: renamed from: t0 */
    final int m3739t0() {
        return this.f3391r.size();
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("TreeBuilder{currentToken=");
        sbM3589b.append(this.f3474g);
        sbM3589b.append(", state=");
        sbM3589b.append(this.f3385l);
        sbM3589b.append(", currentElement=");
        sbM3589b.append(m3755a());
        sbM3589b.append('}');
        return sbM3589b.toString();
    }

    /* JADX INFO: renamed from: u */
    final void m3740u(boolean z) {
        this.f3394u = z;
    }

    /* JADX INFO: renamed from: u0 */
    final void m3741u0(EnumC1406B enumC1406B) {
        this.f3385l = enumC1406B;
    }

    /* JADX INFO: renamed from: v */
    final boolean m3742v() {
        return this.f3394u;
    }

    /* JADX INFO: renamed from: w */
    final void m3743w(String str) {
        while (C1380b.m3364c(m3755a().m3469i0(), f3379C)) {
            if (str != null && m3756b(str)) {
                return;
            } else {
                m3709b0();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    final void m3744x(boolean z) {
        String[] strArr = z ? f3380D : f3379C;
        while (C1380b.m3364c(m3755a().m3469i0(), strArr)) {
            m3709b0();
        }
    }

    /* JADX INFO: renamed from: y */
    final C1393m m3745y(String str) {
        for (int size = this.f3390q.size() - 1; size >= 0; size--) {
            C1393m c1393m = this.f3390q.get(size);
            if (c1393m == null) {
                return null;
            }
            if (c1393m.m3469i0().equals(str)) {
                return c1393m;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    final C1396p m3746z() {
        return this.f3389p;
    }
}
