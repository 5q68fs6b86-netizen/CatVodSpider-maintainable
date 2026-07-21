package com.github.catvod.spider.support.p102H;

import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p042E.C1272d;
import com.github.catvod.spider.support.p043F.C1274b;
import com.github.catvod.spider.support.p101G.AbstractC2041m;
import com.github.catvod.spider.support.p101G.C2030b;
import com.github.catvod.spider.support.p101G.C2031c;
import com.github.catvod.spider.support.p101G.C2032d;
import com.github.catvod.spider.support.p101G.C2033e;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p101G.C2039k;
import com.github.catvod.spider.support.p101G.C2044p;
import com.github.catvod.spider.support.p116a.C2137a;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: renamed from: com.github.catvod.spider.support.H.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2046b extends AbstractC2057m {

    /* JADX INFO: renamed from: l */
    private EnumC2047c f4673l;

    /* JADX INFO: renamed from: m */
    private EnumC2047c f4674m;

    /* JADX INFO: renamed from: n */
    private boolean f4675n;

    /* JADX INFO: renamed from: o */
    @Nullable
    private C2037i f4676o;

    /* JADX INFO: renamed from: p */
    @Nullable
    private C2039k f4677p;

    /* JADX INFO: renamed from: q */
    private ArrayList<C2037i> f4678q;

    /* JADX INFO: renamed from: r */
    private ArrayList<EnumC2047c> f4679r;

    /* JADX INFO: renamed from: s */
    private List<String> f4680s;

    /* JADX INFO: renamed from: t */
    private AbstractC2053i.f f4681t;

    /* JADX INFO: renamed from: u */
    private boolean f4682u;

    /* JADX INFO: renamed from: v */
    private boolean f4683v;

    /* JADX INFO: renamed from: w */
    private String[] f4684w = {null};

    /* JADX INFO: renamed from: x */
    static final String[] f4670x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: y */
    static final String[] f4671y = {"ol", "ul"};

    /* JADX INFO: renamed from: z */
    static final String[] f4672z = {"button"};

    /* JADX INFO: renamed from: A */
    static final String[] f4665A = {"html", "table"};

    /* JADX INFO: renamed from: B */
    static final String[] f4666B = {"optgroup", "option"};

    /* JADX INFO: renamed from: C */
    static final String[] f4667C = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};

    /* JADX INFO: renamed from: D */
    static final String[] f4668D = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* JADX INFO: renamed from: E */
    static final String[] f4669E = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* JADX INFO: renamed from: F */
    private boolean m4992F(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f4895e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strM4888h0 = this.f4895e.get(size).m4888h0();
            if (C1274b.m3172c(strM4888h0, strArr)) {
                return true;
            }
            if (C1274b.m3172c(strM4888h0, strArr2)) {
                return false;
            }
            if (strArr3 != null && C1274b.m3172c(strM4888h0, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: O */
    private void m4993O(AbstractC2041m abstractC2041m) {
        C2037i c2037iM5168a;
        C2037i c2037i;
        C2039k c2039k;
        if (!this.f4895e.isEmpty()) {
            if (this.f4683v && C1274b.m3172c(m5168a().m4888h0(), EnumC2047c.y.f4711A)) {
                m5007M(abstractC2041m);
            } else {
                c2037iM5168a = m5168a();
            }
            if (abstractC2041m instanceof C2037i) {
                c2037i = (C2037i) abstractC2041m;
                if (c2037i.m4900q0().m5084e() || (c2039k = this.f4677p) == null) {
                }
                c2039k.m4923w0(c2037i);
                return;
            }
        }
        c2037iM5168a = this.f4894d;
        c2037iM5168a.m4869M(abstractC2041m);
        if (abstractC2041m instanceof C2037i) {
            c2037i = (C2037i) abstractC2041m;
            if (c2037i.m4900q0().m5084e()) {
            }
        }
    }

    /* JADX INFO: renamed from: X */
    private static boolean m4994X(ArrayList<C2037i> arrayList, C2037i c2037i) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == c2037i) {
                return true;
            }
            size--;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    private void m4995m(String... strArr) {
        for (int size = this.f4895e.size() - 1; size >= 0; size--) {
            C2037i c2037i = this.f4895e.get(size);
            String strM4888h0 = c2037i.m4888h0();
            int i = C1274b.f2988f;
            boolean z = false;
            for (String str : strArr) {
                if (str.equals(strM4888h0)) {
                    z = true;
                    break;
                }
            }
            if (z || c2037i.m4888h0().equals("html")) {
                return;
            }
            this.f4895e.remove(size);
        }
    }

    /* JADX INFO: renamed from: A */
    final List<String> m4996A() {
        return this.f4680s;
    }

    /* JADX INFO: renamed from: B */
    final boolean m4997B(String str) {
        return m4998C(str, f4672z);
    }

    /* JADX INFO: renamed from: C */
    final boolean m4998C(String str, String[] strArr) {
        String[] strArr2 = f4670x;
        String[] strArr3 = this.f4684w;
        strArr3[0] = str;
        return m4992F(strArr3, strArr2, strArr);
    }

    /* JADX INFO: renamed from: D */
    final boolean m4999D(String[] strArr) {
        return m4992F(strArr, f4670x, null);
    }

    /* JADX INFO: renamed from: E */
    final boolean m5000E(String str) {
        for (int size = this.f4895e.size() - 1; size >= 0; size--) {
            String strM4888h0 = this.f4895e.get(size).m4888h0();
            if (strM4888h0.equals(str)) {
                return true;
            }
            if (!C1274b.m3172c(strM4888h0, f4666B)) {
                return false;
            }
        }
        C1271c.m3151a("Should not be reachable");
        throw null;
    }

    /* JADX INFO: renamed from: G */
    final boolean m5001G(String str) {
        String[] strArr = f4665A;
        String[] strArr2 = this.f4684w;
        strArr2[0] = str;
        return m4992F(strArr2, strArr, null);
    }

    /* JADX INFO: renamed from: H */
    final C2037i m5002H(AbstractC2053i.g gVar) {
        if (gVar.m5118u() && !gVar.f4795n.isEmpty() && gVar.f4795n.m4818k(this.f4898h) > 0) {
            Object[] objArr = {gVar.f4786e};
            C2049e c2049eM5075a = this.f4891a.m5075a();
            if (c2049eM5075a.m5066a()) {
                c2049eM5075a.add(new C2048d(this.f4892b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (!gVar.f4794m) {
            C2052h c2052hM5173i = m5173i(gVar.m5120w(), this.f4898h);
            C2050f c2050f = this.f4898h;
            C2030b c2030b = gVar.f4795n;
            c2050f.m5070c(c2030b);
            C2037i c2037i = new C2037i(c2052hM5173i, null, c2030b);
            m4993O(c2037i);
            this.f4895e.add(c2037i);
            return c2037i;
        }
        C2037i c2037iM5005K = m5005K(gVar);
        this.f4895e.add(c2037iM5005K);
        this.f4893c.m5159v(EnumC2056l.f4846a);
        C2055k c2055k = this.f4893c;
        AbstractC2053i.f fVar = this.f4681t;
        fVar.mo5099h();
        fVar.m5119v(c2037iM5005K.m4901r0());
        c2055k.m5148k(fVar);
        return c2037iM5005K;
    }

    /* JADX INFO: renamed from: I */
    final void m5003I(AbstractC2053i.b bVar) {
        AbstractC2041m c2033e;
        C2037i c2037iM5168a = m5168a();
        String strM4888h0 = c2037iM5168a.m4888h0();
        String strM5102l = bVar.m5102l();
        if (bVar instanceof AbstractC2053i.a) {
            c2033e = new C2031c(strM5102l);
        } else {
            c2033e = mo5023d(strM4888h0) ? new C2033e(strM5102l) : new C2044p(strM5102l);
        }
        c2037iM5168a.m4869M(c2033e);
    }

    /* JADX INFO: renamed from: J */
    final void m5004J(AbstractC2053i.c cVar) {
        m4993O(new C2032d(cVar.m5105m()));
    }

    /* JADX INFO: renamed from: K */
    final C2037i m5005K(AbstractC2053i.g gVar) {
        C2052h c2052hM5173i = m5173i(gVar.m5120w(), this.f4898h);
        C2050f c2050f = this.f4898h;
        C2030b c2030b = gVar.f4795n;
        c2050f.m5070c(c2030b);
        C2037i c2037i = new C2037i(c2052hM5173i, null, c2030b);
        m4993O(c2037i);
        if (gVar.f4794m) {
            if (!c2052hM5173i.m5086g()) {
                c2052hM5173i.m5090l();
            } else if (!c2052hM5173i.m5083d()) {
                this.f4893c.m5156s("Tag [%s] cannot be self closing; not a void tag", c2052hM5173i.m5088j());
            }
        }
        return c2037i;
    }

    /* JADX INFO: renamed from: L */
    final C2039k m5006L(AbstractC2053i.g gVar, boolean z, boolean z2) {
        C2052h c2052hM5173i = m5173i(gVar.m5120w(), this.f4898h);
        C2050f c2050f = this.f4898h;
        C2030b c2030b = gVar.f4795n;
        c2050f.m5070c(c2030b);
        C2039k c2039k = new C2039k(c2052hM5173i, c2030b);
        if (!z2 || !m5016W("template")) {
            this.f4677p = c2039k;
        }
        m4993O(c2039k);
        if (z) {
            this.f4895e.add(c2039k);
        }
        return c2039k;
    }

    /* JADX INFO: renamed from: M */
    final void m5007M(AbstractC2041m abstractC2041m) {
        C2037i c2037iM5031j;
        C2037i c2037iM5055y = m5055y("table");
        boolean z = false;
        if (c2037iM5055y == null) {
            c2037iM5031j = this.f4895e.get(0);
        } else if (c2037iM5055y.m4890j0() != null) {
            c2037iM5031j = c2037iM5055y.m4890j0();
            z = true;
        } else {
            c2037iM5031j = m5031j(c2037iM5055y);
        }
        if (!z) {
            c2037iM5031j.m4869M(abstractC2041m);
        } else {
            C1271c.m3157g(c2037iM5055y);
            c2037iM5055y.m4873S(abstractC2041m);
        }
    }

    /* JADX INFO: renamed from: N */
    final void m5008N() {
        this.f4678q.add(null);
    }

    /* JADX INFO: renamed from: P */
    final C2037i m5009P() {
        C2037i c2037i = new C2037i(m5173i("html", this.f4898h), null, null);
        m4993O(c2037i);
        this.f4895e.add(c2037i);
        return c2037i;
    }

    /* JADX INFO: renamed from: Q */
    final boolean m5010Q(C2037i c2037i) {
        return m4994X(this.f4678q, c2037i);
    }

    /* JADX INFO: renamed from: R */
    final boolean m5011R(C2037i c2037i) {
        return C1274b.m3172c(c2037i.m4888h0(), f4669E);
    }

    /* JADX INFO: renamed from: S */
    final void m5012S() {
        this.f4674m = this.f4673l;
    }

    /* JADX INFO: renamed from: T */
    final void m5013T(C2037i c2037i) {
        if (this.f4675n) {
            return;
        }
        String strMo4927a = c2037i.mo4927a("href");
        if (strMo4927a.length() != 0) {
            this.f4896f = strMo4927a;
            this.f4675n = true;
            this.f4894d.m4934G(strMo4927a);
        }
    }

    /* JADX INFO: renamed from: U */
    final void m5014U() {
        this.f4680s = new ArrayList();
    }

    /* JADX INFO: renamed from: V */
    final boolean m5015V(C2037i c2037i) {
        return m4994X(this.f4895e, c2037i);
    }

    /* JADX INFO: renamed from: W */
    final boolean m5016W(String str) {
        return m5055y(str) != null;
    }

    /* JADX INFO: renamed from: Y */
    final EnumC2047c m5017Y() {
        return this.f4674m;
    }

    /* JADX INFO: renamed from: Z */
    final C2037i m5018Z() {
        return this.f4895e.remove(this.f4895e.size() - 1);
    }

    @Nullable
    /* JADX INFO: renamed from: a0 */
    final C2037i m5019a0(String str) {
        for (int size = this.f4895e.size() - 1; size >= 0; size--) {
            C2037i c2037i = this.f4895e.get(size);
            this.f4895e.remove(size);
            if (c2037i.m4888h0().equals(str)) {
                boolean z = this.f4897g instanceof AbstractC2053i.f;
                return c2037i;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b0 */
    final EnumC2047c m5020b0() {
        if (this.f4679r.size() <= 0) {
            return null;
        }
        ArrayList<EnumC2047c> arrayList = this.f4679r;
        return arrayList.remove(arrayList.size() - 1);
    }

    @Override // com.github.catvod.spider.support.p102H.AbstractC2057m
    @ParametersAreNonnullByDefault
    /* JADX INFO: renamed from: c */
    protected final void mo5021c(Reader reader, C2051g c2051g) {
        super.mo5021c(reader, c2051g);
        this.f4673l = EnumC2047c.f4685a;
        this.f4674m = null;
        this.f4675n = false;
        this.f4676o = null;
        this.f4677p = null;
        this.f4678q = new ArrayList<>();
        this.f4679r = new ArrayList<>();
        this.f4680s = new ArrayList();
        this.f4681t = new AbstractC2053i.f();
        this.f4682u = true;
        this.f4683v = false;
    }

    /* JADX INFO: renamed from: c0 */
    final int m5022c0(C2037i c2037i) {
        for (int i = 0; i < this.f4678q.size(); i++) {
            if (c2037i == this.f4678q.get(i)) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.github.catvod.spider.support.p102H.AbstractC2057m
    /* JADX INFO: renamed from: d */
    protected final boolean mo5023d(String str) {
        return str.equals("script") || str.equals("style");
    }

    /* JADX INFO: renamed from: d0 */
    final boolean m5024d0(AbstractC2053i abstractC2053i, EnumC2047c enumC2047c) {
        this.f4897g = abstractC2053i;
        return enumC2047c.mo5060d(abstractC2053i, this);
    }

    @Override // com.github.catvod.spider.support.p102H.AbstractC2057m
    /* JADX INFO: renamed from: e */
    protected final boolean mo5025e(AbstractC2053i abstractC2053i) {
        this.f4897g = abstractC2053i;
        return this.f4673l.mo5060d(abstractC2053i, this);
    }

    /* JADX INFO: renamed from: e0 */
    final void m5026e0(C2037i c2037i) {
        m5033k(c2037i);
        this.f4678q.add(c2037i);
    }

    /* JADX INFO: renamed from: f0 */
    final void m5027f0(EnumC2047c enumC2047c) {
        this.f4679r.add(enumC2047c);
    }

    /* JADX INFO: renamed from: g0 */
    final void m5028g0(C2037i c2037i, int i) {
        m5033k(c2037i);
        try {
            this.f4678q.add(i, c2037i);
        } catch (IndexOutOfBoundsException unused) {
            this.f4678q.add(c2037i);
        }
    }

    /* JADX INFO: renamed from: h0 */
    final void m5029h0() {
        C2037i c2037i;
        if (this.f4895e.size() > 256) {
            return;
        }
        if (this.f4678q.size() > 0) {
            ArrayList<C2037i> arrayList = this.f4678q;
            c2037i = arrayList.get(arrayList.size() - 1);
        } else {
            c2037i = null;
        }
        if (c2037i == null || m5015V(c2037i)) {
            return;
        }
        int size = this.f4678q.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        boolean z = true;
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            c2037i = this.f4678q.get(i3);
            if (c2037i == null || m5015V(c2037i)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i3++;
                c2037i = this.f4678q.get(i3);
            }
            C1271c.m3157g(c2037i);
            C2037i c2037i2 = new C2037i(m5173i(c2037i.m4888h0(), this.f4898h), null, c2037i.mo4883e().clone());
            m4993O(c2037i2);
            this.f4895e.add(c2037i2);
            this.f4678q.set(i3, c2037i2);
            if (i3 == i2) {
                return;
            } else {
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    final void m5030i0(C2037i c2037i) {
        int size = this.f4678q.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.f4678q.get(size) != c2037i);
        this.f4678q.remove(size);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    final C2037i m5031j(C2037i c2037i) {
        for (int size = this.f4895e.size() - 1; size >= 0; size--) {
            if (this.f4895e.get(size) == c2037i) {
                return this.f4895e.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    final boolean m5032j0(C2037i c2037i) {
        for (int size = this.f4895e.size() - 1; size >= 0; size--) {
            if (this.f4895e.get(size) == c2037i) {
                this.f4895e.remove(size);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    final void m5033k(C2037i c2037i) {
        int size = this.f4678q.size() - 1;
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = 0;
        while (size >= i) {
            C2037i c2037i2 = this.f4678q.get(size);
            if (c2037i2 == null) {
                return;
            }
            if (c2037i.m4888h0().equals(c2037i2.m4888h0()) && c2037i.mo4883e().equals(c2037i2.mo4883e())) {
                i2++;
            }
            if (i2 == 3) {
                this.f4678q.remove(size);
                return;
            }
            size--;
        }
    }

    /* JADX INFO: renamed from: k0 */
    final void m5034k0(C2037i c2037i, C2037i c2037i2) {
        ArrayList<C2037i> arrayList = this.f4678q;
        int iLastIndexOf = arrayList.lastIndexOf(c2037i);
        C1271c.m3153c(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, c2037i2);
    }

    /* JADX INFO: renamed from: l */
    final void m5035l() {
        while (!this.f4678q.isEmpty()) {
            int size = this.f4678q.size();
            if ((size > 0 ? this.f4678q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    final void m5036l0() {
        if (!m5016W("body")) {
            this.f4895e.add(this.f4894d.m4844w0());
        }
        this.f4673l = EnumC2047c.f4691g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0153 A[LOOP:0: B:10:0x001f->B:109:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x003d. Please report as an issue. */
    /* JADX INFO: renamed from: m0 */
    final boolean m5037m0() {
        EnumC2047c enumC2047c;
        int size = this.f4895e.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        EnumC2047c enumC2047c2 = this.f4673l;
        if (this.f4895e.size() == 0) {
            this.f4673l = EnumC2047c.f4691g;
        }
        boolean z = false;
        while (true) {
            if (size >= i) {
                C2037i c2037i = this.f4895e.get(size);
                if (size == i) {
                    z = true;
                }
                String strM4888h0 = c2037i != null ? c2037i.m4888h0() : "";
                strM4888h0.getClass();
                switch (strM4888h0) {
                    case "frameset":
                        enumC2047c = EnumC2047c.f4704t;
                        this.f4673l = enumC2047c;
                        break;
                    case "template":
                        if (this.f4679r.size() > 0) {
                            ArrayList<EnumC2047c> arrayList = this.f4679r;
                            enumC2047c = arrayList.get(arrayList.size() - 1);
                        } else {
                            enumC2047c = null;
                        }
                        if (enumC2047c == null) {
                            throw new C1272d("Bug: no template insertion mode on stack!");
                        }
                        this.f4673l = enumC2047c;
                        break;
                    case "select":
                        enumC2047c = EnumC2047c.f4700p;
                        this.f4673l = enumC2047c;
                        break;
                    case "colgroup":
                        enumC2047c = EnumC2047c.f4696l;
                        this.f4673l = enumC2047c;
                        break;
                    case "td":
                    case "th":
                        if (z) {
                            if (z) {
                                size--;
                            } else {
                                enumC2047c = EnumC2047c.f4691g;
                            }
                            break;
                        } else {
                            enumC2047c = EnumC2047c.f4699o;
                        }
                        this.f4673l = enumC2047c;
                        break;
                    case "tr":
                        enumC2047c = EnumC2047c.f4698n;
                        this.f4673l = enumC2047c;
                        break;
                    case "body":
                        enumC2047c = EnumC2047c.f4691g;
                        this.f4673l = enumC2047c;
                        break;
                    case "head":
                        if (z) {
                            if (z) {
                                size--;
                            } else {
                                enumC2047c = EnumC2047c.f4691g;
                            }
                            break;
                        } else {
                            enumC2047c = EnumC2047c.f4688d;
                        }
                        this.f4673l = enumC2047c;
                        break;
                    case "html":
                        enumC2047c = this.f4676o == null ? EnumC2047c.f4687c : EnumC2047c.f4690f;
                        this.f4673l = enumC2047c;
                        break;
                    case "table":
                        enumC2047c = EnumC2047c.f4693i;
                        this.f4673l = enumC2047c;
                        break;
                    case "tbody":
                    case "tfoot":
                    case "thead":
                        enumC2047c = EnumC2047c.f4697m;
                        this.f4673l = enumC2047c;
                        break;
                    case "caption":
                        enumC2047c = EnumC2047c.f4695k;
                        this.f4673l = enumC2047c;
                        break;
                    default:
                        if (z) {
                            enumC2047c = EnumC2047c.f4691g;
                            this.f4673l = enumC2047c;
                            break;
                        } else {
                            size--;
                            break;
                        }
                        break;
                }
            }
            return this.f4673l != enumC2047c2;
        }
    }

    /* JADX INFO: renamed from: n */
    final void m5038n() {
        m4995m("tbody", "tfoot", "thead", "template");
    }

    /* JADX INFO: renamed from: n0 */
    final void m5039n0() {
        this.f4677p = null;
    }

    /* JADX INFO: renamed from: o */
    final void m5040o() {
        m4995m("table", "template");
    }

    /* JADX INFO: renamed from: o0 */
    final void m5041o0(boolean z) {
        this.f4683v = z;
    }

    /* JADX INFO: renamed from: p */
    final void m5042p() {
        m4995m("tr", "template");
    }

    /* JADX INFO: renamed from: p0 */
    final void m5043p0(C2037i c2037i) {
        this.f4676o = c2037i;
    }

    /* JADX INFO: renamed from: q */
    final void m5044q() {
        m5051u("p");
        if (!"p".equals(m5168a().m4888h0())) {
            m5046r(this.f4673l);
        }
        m5019a0("p");
    }

    /* JADX INFO: renamed from: q0 */
    final EnumC2047c m5045q0() {
        return this.f4673l;
    }

    /* JADX INFO: renamed from: r */
    final void m5046r(EnumC2047c enumC2047c) {
        if (this.f4891a.m5075a().m5066a()) {
            this.f4891a.m5075a().add(new C2048d(this.f4892b, "Unexpected %s token [%s] when in state [%s]", this.f4897g.getClass().getSimpleName(), this.f4897g, enumC2047c));
        }
    }

    /* JADX INFO: renamed from: r0 */
    final int m5047r0() {
        return this.f4679r.size();
    }

    /* JADX INFO: renamed from: s */
    final void m5048s(boolean z) {
        this.f4682u = z;
    }

    /* JADX INFO: renamed from: s0 */
    final void m5049s0(EnumC2047c enumC2047c) {
        this.f4673l = enumC2047c;
    }

    /* JADX INFO: renamed from: t */
    final boolean m5050t() {
        return this.f4682u;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("TreeBuilder{currentToken=");
        sbM5396a.append(this.f4897g);
        sbM5396a.append(", state=");
        sbM5396a.append(this.f4673l);
        sbM5396a.append(", currentElement=");
        sbM5396a.append(m5168a());
        sbM5396a.append('}');
        return sbM5396a.toString();
    }

    /* JADX INFO: renamed from: u */
    final void m5051u(String str) {
        while (C1274b.m3172c(m5168a().m4888h0(), f4667C)) {
            if (str != null && m5169b(str)) {
                return;
            } else {
                m5018Z();
            }
        }
    }

    /* JADX INFO: renamed from: v */
    final void m5052v(boolean z) {
        String[] strArr = z ? f4668D : f4667C;
        while (C1274b.m3172c(m5168a().m4888h0(), strArr)) {
            m5018Z();
        }
    }

    /* JADX INFO: renamed from: w */
    final C2037i m5053w(String str) {
        for (int size = this.f4678q.size() - 1; size >= 0; size--) {
            C2037i c2037i = this.f4678q.get(size);
            if (c2037i == null) {
                return null;
            }
            if (c2037i.m4888h0().equals(str)) {
                return c2037i;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    final C2039k m5054x() {
        return this.f4677p;
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    final C2037i m5055y(String str) {
        int size = this.f4895e.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            C2037i c2037i = this.f4895e.get(size);
            if (c2037i.m4888h0().equals(str)) {
                return c2037i;
            }
            size--;
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    final C2037i m5056z() {
        return this.f4676o;
    }
}
