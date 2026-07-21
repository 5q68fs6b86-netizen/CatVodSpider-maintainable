package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r;
import com.github.catvod.spider.support.p012C0.p026c0.C1044c;
import com.github.catvod.spider.support.p012C0.p026c0.C1045d;
import com.github.catvod.spider.support.p012C0.p026c0.C1046e;
import com.github.catvod.spider.support.p012C0.p026c0.C1047f;
import com.github.catvod.spider.support.p012C0.p026c0.C1049h;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p026c0.C1056o;
import com.github.catvod.spider.support.p012C0.p026c0.C1062u;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1122b extends AbstractC1145i1 {

    /* JADX INFO: renamed from: k */
    private EnumC1068A f2732k;

    /* JADX INFO: renamed from: l */
    private EnumC1068A f2733l;

    /* JADX INFO: renamed from: m */
    private boolean f2734m;

    /* JADX INFO: renamed from: n */
    private C1053l f2735n;

    /* JADX INFO: renamed from: o */
    private C1056o f2736o;

    /* JADX INFO: renamed from: p */
    private ArrayList<C1053l> f2737p;

    /* JADX INFO: renamed from: q */
    private List<String> f2738q;

    /* JADX INFO: renamed from: r */
    private C1090L f2739r;

    /* JADX INFO: renamed from: s */
    private boolean f2740s;

    /* JADX INFO: renamed from: t */
    private boolean f2741t;

    /* JADX INFO: renamed from: u */
    private String[] f2742u = {null};

    /* JADX INFO: renamed from: v */
    static final String[] f2727v = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: w */
    static final String[] f2728w = {"ol", "ul"};

    /* JADX INFO: renamed from: x */
    static final String[] f2729x = {"button"};

    /* JADX INFO: renamed from: y */
    static final String[] f2730y = {"html", "table"};

    /* JADX INFO: renamed from: z */
    static final String[] f2731z = {"optgroup", "option"};

    /* JADX INFO: renamed from: A */
    static final String[] f2725A = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};

    /* JADX INFO: renamed from: B */
    static final String[] f2726B = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* JADX INFO: renamed from: A */
    private boolean m2923A(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f2818e.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String strM2706d0 = this.f2818e.get(size).m2706d0();
            if (C1034b.m2596b(strM2706d0, strArr)) {
                return true;
            }
            if (C1034b.m2596b(strM2706d0, strArr2)) {
                return false;
            }
            if (strArr3 != null && C1034b.m2596b(strM2706d0, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    /* JADX INFO: renamed from: K */
    private void m2924K(AbstractC1059r abstractC1059r) {
        C1053l c1053lM2989a;
        C1053l c1053l;
        C1056o c1056o;
        if (!this.f2818e.isEmpty()) {
            if (this.f2741t) {
                m2934I(abstractC1059r);
            } else {
                c1053lM2989a = m2989a();
            }
            if (abstractC1059r instanceof C1053l) {
                c1053l = (C1053l) abstractC1059r;
                if (c1053l.m2717m0().m2816e() || (c1056o = this.f2736o) == null) {
                }
                c1056o.m2741r0(c1053l);
                return;
            }
        }
        c1053lM2989a = this.f2817d;
        c1053lM2989a.m2690L(abstractC1059r);
        if (abstractC1059r instanceof C1053l) {
            c1053l = (C1053l) abstractC1059r;
            if (c1053l.m2717m0().m2816e()) {
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private boolean m2925M(ArrayList<C1053l> arrayList, C1053l c1053l) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == c1053l) {
                return true;
            }
            size--;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    private void m2926j(String... strArr) {
        boolean z;
        for (int size = this.f2818e.size() - 1; size >= 0; size--) {
            C1053l c1053l = this.f2818e.get(size);
            String strM2706d0 = c1053l.m2706d0();
            int i = C1034b.f2516d;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else {
                    if (strArr[i2].equals(strM2706d0)) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z || c1053l.m2706d0().equals("html")) {
                return;
            }
            this.f2818e.remove(size);
        }
    }

    /* JADX INFO: renamed from: B */
    final boolean m2927B(String str) {
        String[] strArr = f2730y;
        String[] strArr2 = this.f2742u;
        strArr2[0] = str;
        return m2923A(strArr2, strArr, null);
    }

    /* JADX INFO: renamed from: C */
    protected final void m2928C(Reader reader, C1076E c1076e) {
        C1049h c1049h = new C1049h();
        this.f2817d = c1049h;
        c1049h.m2674t0(c1076e);
        this.f2814a = c1076e;
        this.f2821h = C1074D.f2655c;
        this.f2815b = new C1119a(reader, 32768);
        this.f2820g = null;
        this.f2816c = new C1100Q(this.f2815b, c1076e.m2809a());
        this.f2818e = new ArrayList<>(32);
        this.f2819f = "";
        this.f2732k = EnumC1068A.f2628c;
        this.f2733l = null;
        this.f2734m = false;
        this.f2735n = null;
        this.f2736o = null;
        this.f2737p = new ArrayList<>();
        this.f2738q = new ArrayList();
        this.f2739r = new C1090L();
        this.f2740s = true;
        this.f2741t = false;
    }

    /* JADX INFO: renamed from: D */
    final C1053l m2929D(C1092M c1092m) {
        if (c1092m.m2839r() && !c1092m.f2693j.isEmpty() && c1092m.f2693j.m2644i(this.f2821h) > 0) {
            C1072C c1072cM2809a = this.f2814a.m2809a();
            if (c1072cM2809a.m2802a()) {
                c1072cM2809a.add(new C1070B(this.f2815b.m2896E(), "Duplicate attribute"));
            }
        }
        if (!c1092m.f2692i) {
            C1078F c1078fM2811l = C1078F.m2811l(c1092m.m2841t(), this.f2821h);
            C1074D c1074d = this.f2821h;
            C1044c c1044c = c1092m.f2693j;
            c1074d.m2804b(c1044c);
            C1053l c1053l = new C1053l(c1078fM2811l, null, c1044c);
            m2924K(c1053l);
            this.f2818e.add(c1053l);
            return c1053l;
        }
        C1053l c1053lM2932G = m2932G(c1092m);
        this.f2818e.add(c1053lM2932G);
        this.f2816c.m2887u(EnumC1142h1.f2771c);
        C1100Q c1100q = this.f2816c;
        C1090L c1090l = this.f2739r;
        c1090l.mo2823g();
        c1090l.m2840s(c1053lM2932G.m2719n0());
        c1100q.m2876j(c1090l);
        return c1053lM2932G;
    }

    /* JADX INFO: renamed from: E */
    final void m2930E(C1082H c1082h) {
        AbstractC1059r c1047f;
        C1053l c1053lM2989a = m2989a();
        if (c1053lM2989a == null) {
            c1053lM2989a = this.f2817d;
        }
        String strM2706d0 = c1053lM2989a.m2706d0();
        String strM2825j = c1082h.m2825j();
        if (c1082h instanceof C1080G) {
            c1047f = new C1045d(strM2825j);
        } else {
            c1047f = mo2951b(strM2706d0) ? new C1047f(strM2825j) : new C1062u(strM2825j);
        }
        c1053lM2989a.m2690L(c1047f);
    }

    /* JADX INFO: renamed from: F */
    final void m2931F(C1084I c1084i) {
        m2924K(new C1046e(c1084i.m2828k()));
    }

    /* JADX INFO: renamed from: G */
    final C1053l m2932G(C1092M c1092m) {
        C1078F c1078fM2811l = C1078F.m2811l(c1092m.m2841t(), this.f2821h);
        C1074D c1074d = this.f2821h;
        C1044c c1044c = c1092m.f2693j;
        c1074d.m2804b(c1044c);
        C1053l c1053l = new C1053l(c1078fM2811l, null, c1044c);
        m2924K(c1053l);
        if (c1092m.f2692i) {
            if (!c1078fM2811l.m2818g()) {
                c1078fM2811l.m2822k();
            } else if (!c1078fM2811l.m2815d()) {
                this.f2816c.m2884r("Tag cannot be self closing; not a void tag");
            }
        }
        return c1053l;
    }

    /* JADX INFO: renamed from: H */
    final C1056o m2933H(C1092M c1092m, boolean z) {
        C1078F c1078fM2811l = C1078F.m2811l(c1092m.m2841t(), this.f2821h);
        C1074D c1074d = this.f2821h;
        C1044c c1044c = c1092m.f2693j;
        c1074d.m2804b(c1044c);
        C1056o c1056o = new C1056o(c1078fM2811l, c1044c);
        this.f2736o = c1056o;
        m2924K(c1056o);
        if (z) {
            this.f2818e.add(c1056o);
        }
        return c1056o;
    }

    /* JADX INFO: renamed from: I */
    final void m2934I(AbstractC1059r abstractC1059r) {
        C1053l c1053lM2958g;
        boolean z = false;
        C1053l c1053lM2974t = m2974t("table");
        if (c1053lM2974t == null) {
            c1053lM2958g = this.f2818e.get(0);
        } else if (c1053lM2974t.m2709f0() != null) {
            c1053lM2958g = c1053lM2974t.m2709f0();
            z = true;
        } else {
            c1053lM2958g = m2958g(c1053lM2974t);
        }
        if (!z) {
            c1053lM2958g.m2690L(abstractC1059r);
        } else {
            C0966a.m2376k(c1053lM2974t);
            c1053lM2974t.m2754f(abstractC1059r);
        }
    }

    /* JADX INFO: renamed from: J */
    final void m2935J() {
        this.f2737p.add(null);
    }

    /* JADX INFO: renamed from: L */
    final C1053l m2936L(String str) {
        C1053l c1053l = new C1053l(C1078F.m2811l(str, this.f2821h), null, null);
        m2924K(c1053l);
        this.f2818e.add(c1053l);
        return c1053l;
    }

    /* JADX INFO: renamed from: N */
    final boolean m2937N(C1053l c1053l) {
        return m2925M(this.f2737p, c1053l);
    }

    /* JADX INFO: renamed from: O */
    final boolean m2938O(C1053l c1053l) {
        return C1034b.m2596b(c1053l.m2706d0(), f2726B);
    }

    /* JADX INFO: renamed from: P */
    final void m2939P() {
        this.f2733l = this.f2732k;
    }

    /* JADX INFO: renamed from: Q */
    final void m2940Q(C1053l c1053l) {
        if (this.f2734m) {
            return;
        }
        String strMo2745a = c1053l.mo2745a("href");
        if (strMo2745a.length() != 0) {
            this.f2819f = strMo2745a;
            this.f2734m = true;
            this.f2817d.m2752G(strMo2745a);
        }
    }

    /* JADX INFO: renamed from: R */
    final void m2941R() {
        this.f2738q = new ArrayList();
    }

    /* JADX INFO: renamed from: S */
    final boolean m2942S(C1053l c1053l) {
        return m2925M(this.f2818e, c1053l);
    }

    /* JADX INFO: renamed from: T */
    final EnumC1068A m2943T() {
        return this.f2733l;
    }

    /* JADX INFO: renamed from: U */
    final C1053l m2944U() {
        return this.f2818e.remove(this.f2818e.size() - 1);
    }

    /* JADX INFO: renamed from: V */
    final C1053l m2945V(String str) {
        for (int size = this.f2818e.size() - 1; size >= 0; size--) {
            C1053l c1053l = this.f2818e.get(size);
            this.f2818e.remove(size);
            if (c1053l.m2706d0().equals(str)) {
                return c1053l;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: W */
    final int m2946W(C1053l c1053l) {
        for (int i = 0; i < this.f2737p.size(); i++) {
            if (c1053l == this.f2737p.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: X */
    final boolean m2947X(AbstractC1096O abstractC1096O, EnumC1068A enumC1068A) {
        this.f2820g = abstractC1096O;
        return enumC1068A.mo2800d(abstractC1096O, this);
    }

    /* JADX INFO: renamed from: Y */
    final void m2948Y(C1053l c1053l) {
        m2960h(c1053l);
        this.f2737p.add(c1053l);
    }

    /* JADX INFO: renamed from: Z */
    final void m2949Z(C1053l c1053l, int i) {
        m2960h(c1053l);
        this.f2737p.add(i, c1053l);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:12:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a0 */
    final void m2950a0() {
        /*
            r6 = this;
            java.util.ArrayList<com.github.catvod.spider.support.p012C0.p026c0.l> r0 = r6.f2737p
            int r0 = r0.size()
            if (r0 <= 0) goto L1f
            java.util.ArrayList<com.github.catvod.spider.support.p012C0.p026c0.l> r0 = r6.f2737p
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.support.p012C0.p026c0.l r0 = (com.github.catvod.spider.support.p012C0.p026c0.C1053l) r0
        L16:
            if (r0 == 0) goto L1e
            boolean r1 = r6.m2942S(r0)
            if (r1 == 0) goto L21
        L1e:
            return
        L1f:
            r0 = 0
            goto L16
        L21:
            java.util.ArrayList<com.github.catvod.spider.support.p012C0.p026c0.l> r1 = r6.f2737p
            int r1 = r1.size()
            r2 = 1
            int r3 = r1 + (-1)
            r1 = r3
        L2b:
            if (r1 != 0) goto L58
        L2d:
            if (r2 != 0) goto L39
            java.util.ArrayList<com.github.catvod.spider.support.p012C0.p026c0.l> r0 = r6.f2737p
            int r1 = r1 + 1
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.support.p012C0.p026c0.l r0 = (com.github.catvod.spider.support.p012C0.p026c0.C1053l) r0
        L39:
            com.github.catvod.spider.support.p012C0.p013N.C0966a.m2376k(r0)
            java.lang.String r2 = r0.m2706d0()
            com.github.catvod.spider.support.p012C0.p026c0.l r2 = r6.m2936L(r2)
            com.github.catvod.spider.support.p012C0.p026c0.c r4 = r2.mo2705d()
            com.github.catvod.spider.support.p012C0.p026c0.c r5 = r0.mo2705d()
            r4.m2641e(r5)
            java.util.ArrayList<com.github.catvod.spider.support.p012C0.p026c0.l> r4 = r6.f2737p
            r4.set(r1, r2)
            if (r1 == r3) goto L1e
        L56:
            r2 = 0
            goto L2d
        L58:
            java.util.ArrayList<com.github.catvod.spider.support.p012C0.p026c0.l> r0 = r6.f2737p
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.support.p012C0.p026c0.l r0 = (com.github.catvod.spider.support.p012C0.p026c0.C1053l) r0
            if (r0 == 0) goto L56
            boolean r4 = r6.m2942S(r0)
            if (r4 == 0) goto L2b
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.support.p012C0.p028d0.C1122b.m2950a0():void");
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.AbstractC1145i1
    /* JADX INFO: renamed from: b */
    protected final boolean mo2951b(String str) {
        return str.equals("script") || str.equals("style");
    }

    /* JADX INFO: renamed from: b0 */
    final void m2952b0(C1053l c1053l) {
        int size = this.f2737p.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                return;
            }
            if (this.f2737p.get(i) == c1053l) {
                this.f2737p.remove(i);
                return;
            }
            size = i;
        }
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.AbstractC1145i1
    /* JADX INFO: renamed from: c */
    protected final boolean mo2953c(AbstractC1096O abstractC1096O) {
        this.f2820g = abstractC1096O;
        return this.f2732k.mo2800d(abstractC1096O, this);
    }

    /* JADX INFO: renamed from: c0 */
    final boolean m2954c0(C1053l c1053l) {
        for (int size = this.f2818e.size() - 1; size >= 0; size--) {
            if (this.f2818e.get(size) == c1053l) {
                this.f2818e.remove(size);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    final void m2955d0(C1053l c1053l, C1053l c1053l2) {
        ArrayList<C1053l> arrayList = this.f2737p;
        int iLastIndexOf = arrayList.lastIndexOf(c1053l);
        C0966a.m2371f(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, c1053l2);
    }

    /* JADX INFO: renamed from: e0 */
    final void m2956e0() {
        EnumC1068A enumC1068A;
        boolean z = false;
        for (int size = this.f2818e.size() - 1; size >= 0; size--) {
            C1053l c1053l = this.f2818e.get(size);
            if (size == 0) {
                c1053l = null;
                z = true;
            }
            String strM2706d0 = c1053l != null ? c1053l.m2706d0() : "";
            if ("select".equals(strM2706d0)) {
                enumC1068A = EnumC1068A.f2643r;
            } else if ("td".equals(strM2706d0) || ("th".equals(strM2706d0) && !z)) {
                enumC1068A = EnumC1068A.f2642q;
            } else if ("tr".equals(strM2706d0)) {
                enumC1068A = EnumC1068A.f2641p;
            } else if ("tbody".equals(strM2706d0) || "thead".equals(strM2706d0) || "tfoot".equals(strM2706d0)) {
                enumC1068A = EnumC1068A.f2640o;
            } else if ("caption".equals(strM2706d0)) {
                enumC1068A = EnumC1068A.f2638m;
            } else if ("colgroup".equals(strM2706d0)) {
                enumC1068A = EnumC1068A.f2639n;
            } else if ("table".equals(strM2706d0)) {
                enumC1068A = EnumC1068A.f2636k;
            } else {
                if (!"head".equals(strM2706d0) && !"body".equals(strM2706d0)) {
                    if ("frameset".equals(strM2706d0)) {
                        enumC1068A = EnumC1068A.f2646u;
                    } else if ("html".equals(strM2706d0)) {
                        enumC1068A = EnumC1068A.f2630e;
                    } else if (!z) {
                    }
                }
                enumC1068A = EnumC1068A.f2634i;
            }
            this.f2732k = enumC1068A;
            return;
        }
    }

    /* JADX INFO: renamed from: f0 */
    final void m2957f0() {
        this.f2736o = null;
    }

    /* JADX INFO: renamed from: g */
    final C1053l m2958g(C1053l c1053l) {
        for (int size = this.f2818e.size() - 1; size >= 0; size--) {
            if (this.f2818e.get(size) == c1053l) {
                return this.f2818e.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    final void m2959g0(boolean z) {
        this.f2741t = z;
    }

    /* JADX INFO: renamed from: h */
    final void m2960h(C1053l c1053l) {
        int i = 0;
        int size = this.f2737p.size() - 1;
        while (size >= 0) {
            C1053l c1053l2 = this.f2737p.get(size);
            if (c1053l2 == null) {
                return;
            }
            int i2 = c1053l.m2706d0().equals(c1053l2.m2706d0()) && c1053l.mo2705d().equals(c1053l2.mo2705d()) ? i + 1 : i;
            if (i2 == 3) {
                this.f2737p.remove(size);
                return;
            } else {
                size--;
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    final void m2961h0(C1053l c1053l) {
        this.f2735n = c1053l;
    }

    /* JADX INFO: renamed from: i */
    final void m2962i() {
        while (!this.f2737p.isEmpty()) {
            int size = this.f2737p.size();
            if ((size > 0 ? this.f2737p.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    final EnumC1068A m2963i0() {
        return this.f2732k;
    }

    /* JADX INFO: renamed from: j0 */
    final void m2964j0(EnumC1068A enumC1068A) {
        this.f2732k = enumC1068A;
    }

    /* JADX INFO: renamed from: k */
    final void m2965k() {
        m2926j("tbody", "tfoot", "thead", "template");
    }

    /* JADX INFO: renamed from: l */
    final void m2966l() {
        m2926j("table");
    }

    /* JADX INFO: renamed from: m */
    final void m2967m() {
        m2926j("tr", "template");
    }

    /* JADX INFO: renamed from: n */
    final void m2968n(EnumC1068A enumC1068A) {
        if (this.f2814a.m2809a().m2802a()) {
            this.f2814a.m2809a().add(new C1070B(this.f2815b.m2896E(), "Unexpected token [%s] when in state [%s]", this.f2820g.getClass().getSimpleName(), enumC1068A));
        }
    }

    /* JADX INFO: renamed from: o */
    final void m2969o(boolean z) {
        this.f2740s = z;
    }

    /* JADX INFO: renamed from: p */
    final boolean m2970p() {
        return this.f2740s;
    }

    /* JADX INFO: renamed from: q */
    final void m2971q(String str) {
        while (str != null && !m2989a().m2706d0().equals(str) && C1034b.m2596b(m2989a().m2706d0(), f2725A)) {
            m2944U();
        }
    }

    /* JADX INFO: renamed from: r */
    final C1053l m2972r(String str) {
        for (int size = this.f2737p.size() - 1; size >= 0; size--) {
            C1053l c1053l = this.f2737p.get(size);
            if (c1053l == null) {
                break;
            }
            if (c1053l.m2706d0().equals(str)) {
                return c1053l;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    final C1056o m2973s() {
        return this.f2736o;
    }

    /* JADX INFO: renamed from: t */
    final C1053l m2974t(String str) {
        int size = this.f2818e.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                return null;
            }
            C1053l c1053l = this.f2818e.get(i);
            if (c1053l.m2706d0().equals(str)) {
                return c1053l;
            }
            size = i;
        }
    }

    public final String toString() {
        StringBuilder sbM2774b = C1064d.m2774b("TreeBuilder{currentToken=");
        sbM2774b.append(this.f2820g);
        sbM2774b.append(", state=");
        sbM2774b.append(this.f2732k);
        sbM2774b.append(", currentElement=");
        sbM2774b.append(m2989a());
        sbM2774b.append('}');
        return sbM2774b.toString();
    }

    /* JADX INFO: renamed from: u */
    final C1053l m2975u() {
        return this.f2735n;
    }

    /* JADX INFO: renamed from: v */
    final List<String> m2976v() {
        return this.f2738q;
    }

    /* JADX INFO: renamed from: w */
    final boolean m2977w(String str) {
        return m2978x(str, f2729x);
    }

    /* JADX INFO: renamed from: x */
    final boolean m2978x(String str, String[] strArr) {
        String[] strArr2 = f2727v;
        String[] strArr3 = this.f2742u;
        strArr3[0] = str;
        return m2923A(strArr3, strArr2, strArr);
    }

    /* JADX INFO: renamed from: y */
    final boolean m2979y(String[] strArr) {
        return m2923A(strArr, f2727v, null);
    }

    /* JADX INFO: renamed from: z */
    final boolean m2980z(String str) {
        for (int size = this.f2818e.size() - 1; size >= 0; size--) {
            String strM2706d0 = this.f2818e.get(size).m2706d0();
            if (strM2706d0.equals(str)) {
                return true;
            }
            if (!C1034b.m2596b(strM2706d0, f2731z)) {
                return false;
            }
        }
        C0966a.m2367a("Should not be reachable");
        throw null;
    }
}
