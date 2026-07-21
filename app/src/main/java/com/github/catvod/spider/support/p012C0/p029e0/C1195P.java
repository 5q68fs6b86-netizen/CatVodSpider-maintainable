package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p028d0.C1098P;
import com.github.catvod.spider.support.p012C0.p040x.C1263a;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C1195P {

    /* JADX INFO: renamed from: d */
    private static final String[] f2867d = {",", ">", Marker.ANY_NON_NULL_MARKER, "~", " "};

    /* JADX INFO: renamed from: e */
    private static final String[] f2868e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: f */
    private static final Pattern f2869f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: g */
    private static final Pattern f2870g = Pattern.compile("([+-])?(\\d+)");

    /* JADX INFO: renamed from: a */
    private final C1098P f2871a;

    /* JADX INFO: renamed from: b */
    private final String f2872b;

    /* JADX INFO: renamed from: c */
    private final List<AbstractC1193N> f2873c = new ArrayList();

    private C1195P(String str) {
        C0966a.m2374i(str);
        String strTrim = str.trim();
        this.f2872b = strTrim;
        this.f2871a = new C1098P(strTrim);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00f3, please report this as an issue */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: a */
    private void m2999a(char c) {
        AbstractC1193N c1208d;
        AbstractC1193N abstractC1193N;
        AbstractC1193N abstractC1193N2;
        boolean z;
        AbstractC1193N c1208d2;
        C1209e c1209e;
        String str;
        this.f2871a.m2860h();
        StringBuilder sbM2595a = C1034b.m2595a();
        while (!this.f2871a.m2861i()) {
            if (this.f2871a.m2863k("(")) {
                sbM2595a.append("(");
                sbM2595a.append(this.f2871a.m2853a('(', ')'));
                str = ")";
            } else if (this.f2871a.m2863k("[")) {
                sbM2595a.append("[");
                sbM2595a.append(this.f2871a.m2853a('[', ']'));
                str = "]";
            } else if (this.f2871a.m2864l(f2867d)) {
                break;
            } else {
                sbM2595a.append(this.f2871a.m2855c());
            }
            sbM2595a.append(str);
        }
        AbstractC1193N abstractC1193NM3005h = m3005h(C1034b.m2601g(sbM2595a));
        if (this.f2873c.size() == 1) {
            c1208d = this.f2873c.get(0);
            if ((c1208d instanceof C1209e) && c != ',') {
                C1209e c1209e2 = (C1209e) c1208d;
                int i = c1209e2.f2882b;
                abstractC1193N = i > 0 ? c1209e2.f2881a.get(i - 1) : null;
                abstractC1193N2 = c1208d;
                z = true;
            }
            this.f2873c.clear();
            if (c != ' ') {
                c1208d2 = new C1208d(new C1201W(abstractC1193N), abstractC1193NM3005h);
            } else if (c != '>') {
                c1208d2 = new C1208d(new C1198T(abstractC1193N), abstractC1193NM3005h);
            } else if (c != '~') {
                c1208d2 = new C1208d(new C1202X(abstractC1193N), abstractC1193NM3005h);
            } else if (c != '+') {
                c1208d2 = new C1208d(new C1199U(abstractC1193N), abstractC1193NM3005h);
            } else {
                if (c == ',') {
                    throw new C1196Q("Unknown combinator: " + c, new Object[0]);
                }
                if (abstractC1193N instanceof C1209e) {
                    c1209e = (C1209e) abstractC1193N;
                } else {
                    c1209e = new C1209e();
                    c1209e.f2881a.add(abstractC1193N);
                    c1209e.m3011b();
                }
                c1209e.f2881a.add(abstractC1193NM3005h);
                c1209e.m3011b();
                c1208d2 = c1209e;
            }
            if (z) {
                C1209e c1209e3 = (C1209e) abstractC1193N2;
                c1209e3.f2881a.set(c1209e3.f2882b - 1, c1208d2);
            } else {
                abstractC1193N2 = c1208d2;
            }
            this.f2873c.add(abstractC1193N2);
        }
        c1208d = new C1208d(this.f2873c);
        abstractC1193N = c1208d;
        abstractC1193N2 = c1208d;
        z = false;
        this.f2873c.clear();
        if (c != ' ') {
            c1208d2 = new C1208d(new C1201W(abstractC1193N), abstractC1193NM3005h);
        } else if (c != '>') {
            c1208d2 = new C1208d(new C1198T(abstractC1193N), abstractC1193NM3005h);
        } else if (c != '~') {
            c1208d2 = new C1208d(new C1202X(abstractC1193N), abstractC1193NM3005h);
        } else if (c != '+') {
            c1208d2 = new C1208d(new C1199U(abstractC1193N), abstractC1193NM3005h);
        } else {
            if (c == ',') {
                throw new C1196Q("Unknown combinator: " + c, new Object[0]);
            }
            if (abstractC1193N instanceof C1209e) {
                c1209e = (C1209e) abstractC1193N;
            } else {
                c1209e = new C1209e();
                c1209e.f2881a.add(abstractC1193N);
                c1209e.m3011b();
            }
            c1209e.f2881a.add(abstractC1193NM3005h);
            c1209e.m3011b();
            c1208d2 = c1209e;
        }
        if (z) {
            C1209e c1209e4 = (C1209e) abstractC1193N2;
            c1209e4.f2881a.set(c1209e4.f2882b - 1, c1208d2);
        } else {
            abstractC1193N2 = c1208d2;
        }
        this.f2873c.add(abstractC1193N2);
    }

    /* JADX INFO: renamed from: b */
    private int m3000b() {
        boolean z = false;
        String strTrim = this.f2871a.m2854b().trim();
        int i = C1034b.f2516d;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isDigit(strTrim.codePointAt(i2))) {
                }
            }
            z = true;
        }
        if (z) {
            return Integer.parseInt(strTrim);
        }
        throw new IllegalArgumentException("Index must be numeric");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: c */
    private void m3001c(boolean z) {
        Object c1223s;
        Object r0;
        this.f2871a.m2856d(z ? ":containsOwn" : ":contains");
        String strM2852o = C1098P.m2852o(this.f2871a.m2853a('(', ')'));
        C0966a.m2375j(strM2852o, ":contains(text) query must not be empty");
        if (z) {
            List<AbstractC1193N> list = this.f2873c;
            c1223s = new C1222r(strM2852o);
            r0 = list;
        } else {
            List<AbstractC1193N> list2 = this.f2873c;
            c1223s = new C1223s(strM2852o);
            r0 = list2;
        }
        r0.add(c1223s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: d */
    private void m3002d(boolean z, boolean z2) {
        int i;
        int i2;
        Object c1184e;
        Object r1;
        int i3 = 1;
        String strM3148d = C1263a.m3148d(this.f2871a.m2854b());
        Matcher matcher = f2869f.matcher(strM3148d);
        Matcher matcher2 = f2870g.matcher(strM3148d);
        if ("odd".equals(strM3148d)) {
            i = 2;
            i2 = i3;
        } else if ("even".equals(strM3148d)) {
            i3 = 0;
            i = 2;
            i2 = i3;
        } else if (matcher.matches()) {
            i = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
            i2 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
        } else {
            if (!matcher2.matches()) {
                throw new C1196Q("Could not parse nth-index '%s': unexpected format", strM3148d);
            }
            i = 0;
            i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
        }
        if (z2) {
            if (z) {
                List<AbstractC1193N> list = this.f2873c;
                c1184e = new C1186G(i, i2);
                r1 = list;
            } else {
                List<AbstractC1193N> list2 = this.f2873c;
                c1184e = new C1187H(i, i2);
                r1 = list2;
            }
        } else if (z) {
            List<AbstractC1193N> list3 = this.f2873c;
            c1184e = new C1185F(i, i2);
            r1 = list3;
        } else {
            List<AbstractC1193N> list4 = this.f2873c;
            c1184e = new C1184E(i, i2);
            r1 = list4;
        }
        r1.add(c1184e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: e */
    private void m3003e() {
        List<AbstractC1193N> list;
        Object c1189j;
        List<AbstractC1193N> list2;
        Object c1182c;
        List<AbstractC1193N> list3;
        Object c1219o;
        List<AbstractC1193N> list4;
        Object c1213i;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        if (this.f2871a.m2862j("#")) {
            String strM2857e = this.f2871a.m2857e();
            C0966a.m2374i(strM2857e);
            this.f2873c.add(new C1225u(strM2857e));
            return;
        }
        if (this.f2871a.m2862j(".")) {
            String strM2857e2 = this.f2871a.m2857e();
            C0966a.m2374i(strM2857e2);
            this.f2873c.add(new C1213i(strM2857e2.trim(), i3));
            return;
        }
        if (this.f2871a.m2865m() || this.f2871a.m2863k("*|")) {
            String strM3148d = C1263a.m3148d(this.f2871a.m2858f());
            C0966a.m2374i(strM3148d);
            if (strM3148d.startsWith("*|")) {
                this.f2873c.add(new C1209e(new C1192M(strM3148d), new C1213i(strM3148d.replace("*|", ":"), i)));
                return;
            }
            if (strM3148d.contains("|")) {
                strM3148d = strM3148d.replace("|", ":");
            }
            this.f2873c.add(new C1192M(strM3148d));
            return;
        }
        if (this.f2871a.m2863k("[")) {
            C1098P c1098p = new C1098P(this.f2871a.m2853a('[', ']'));
            String strM2859g = c1098p.m2859g(f2868e);
            C0966a.m2374i(strM2859g);
            c1098p.m2860h();
            if (c1098p.m2861i()) {
                if (strM2859g.startsWith("^")) {
                    list4 = this.f2873c;
                    c1213i = new C1215k(strM2859g.substring(1), 0);
                } else {
                    list4 = this.f2873c;
                    c1213i = new C1213i(strM2859g, i2);
                }
                list4.add(c1213i);
                return;
            }
            if (c1098p.m2862j("=")) {
                list3 = this.f2873c;
                c1219o = new C1216l(strM2859g, c1098p.m2866n());
            } else if (c1098p.m2862j("!=")) {
                list3 = this.f2873c;
                c1219o = new C1220p(strM2859g, c1098p.m2866n());
            } else if (c1098p.m2862j("^=")) {
                list3 = this.f2873c;
                c1219o = new C1221q(strM2859g, c1098p.m2866n());
            } else if (c1098p.m2862j("$=")) {
                list3 = this.f2873c;
                c1219o = new C1218n(strM2859g, c1098p.m2866n());
            } else if (c1098p.m2862j("*=")) {
                list3 = this.f2873c;
                c1219o = new C1217m(strM2859g, c1098p.m2866n());
            } else {
                if (!c1098p.m2862j("~=")) {
                    throw new C1196Q("Could not parse attribute query '%s': unexpected token at '%s'", this.f2872b, c1098p.m2866n());
                }
                list3 = this.f2873c;
                c1219o = new C1219o(strM2859g, Pattern.compile(c1098p.m2866n()));
            }
            list3.add(c1219o);
            return;
        }
        if (this.f2871a.m2862j(Marker.ANY_MARKER)) {
            this.f2873c.add(new C1212h());
            return;
        }
        if (this.f2871a.m2862j(":lt(")) {
            this.f2873c.add(new C1229y(m3000b()));
            return;
        }
        if (this.f2871a.m2862j(":gt(")) {
            this.f2873c.add(new C1228x(m3000b()));
            return;
        }
        if (this.f2871a.m2862j(":eq(")) {
            this.f2873c.add(new C1226v(m3000b()));
            return;
        }
        if (this.f2871a.m2863k(":has(")) {
            this.f2871a.m2856d(":has");
            String strM2853a = this.f2871a.m2853a('(', ')');
            C0966a.m2375j(strM2853a, ":has(el) subselect must not be empty");
            this.f2873c.add(new C1197S(m3005h(strM2853a)));
            return;
        }
        if (this.f2871a.m2863k(":contains(")) {
            m3001c(false);
            return;
        }
        if (this.f2871a.m2863k(":containsOwn(")) {
            m3001c(true);
            return;
        }
        if (this.f2871a.m2863k(":containsData(")) {
            this.f2871a.m2856d(":containsData");
            String strM2852o = C1098P.m2852o(this.f2871a.m2853a('(', ')'));
            C0966a.m2375j(strM2852o, ":containsData(text) query must not be empty");
            this.f2873c.add(new C1215k(strM2852o, 1));
            return;
        }
        if (this.f2871a.m2863k(":matches(")) {
            m3004f(false);
            return;
        }
        if (this.f2871a.m2863k(":matchesOwn(")) {
            m3004f(true);
            return;
        }
        if (this.f2871a.m2863k(":not(")) {
            this.f2871a.m2856d(":not");
            String strM2853a2 = this.f2871a.m2853a('(', ')');
            C0966a.m2375j(strM2853a2, ":not(selector) subselect must not be empty");
            this.f2873c.add(new C1200V(m3005h(strM2853a2)));
            return;
        }
        if (this.f2871a.m2862j(":nth-child(")) {
            m3002d(false, false);
            return;
        }
        if (this.f2871a.m2862j(":nth-last-child(")) {
            m3002d(true, false);
            return;
        }
        if (this.f2871a.m2862j(":nth-of-type(")) {
            m3002d(false, true);
            return;
        }
        if (this.f2871a.m2862j(":nth-last-of-type(")) {
            m3002d(true, true);
            return;
        }
        if (this.f2871a.m2862j(":first-child")) {
            list = this.f2873c;
            c1189j = new C1180A(i2);
        } else if (this.f2871a.m2862j(":last-child")) {
            list = this.f2873c;
            c1189j = new C1182C(i2);
        } else if (this.f2871a.m2862j(":first-of-type")) {
            list = this.f2873c;
            c1189j = new C1181B();
        } else {
            if (!this.f2871a.m2862j(":last-of-type")) {
                if (this.f2871a.m2862j(":only-child")) {
                    list2 = this.f2873c;
                    c1182c = new C1180A(i3);
                } else if (this.f2871a.m2862j(":only-of-type")) {
                    list = this.f2873c;
                    c1189j = new C1188I();
                } else if (this.f2871a.m2862j(":empty")) {
                    list = this.f2873c;
                    c1189j = new C1230z();
                } else if (this.f2871a.m2862j(":root")) {
                    list2 = this.f2873c;
                    c1182c = new C1182C(i3);
                } else {
                    if (!this.f2871a.m2862j(":matchText")) {
                        throw new C1196Q("Could not parse query '%s': unexpected token at '%s'", this.f2872b, this.f2871a.m2866n());
                    }
                    list = this.f2873c;
                    c1189j = new C1189J();
                }
                list2.add(c1182c);
                return;
            }
            list = this.f2873c;
            c1189j = new C1183D();
        }
        list.add(c1189j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: f */
    private void m3004f(boolean z) {
        Object c1190k;
        Object r0;
        this.f2871a.m2856d(z ? ":matchesOwn" : ":matches");
        String strM2853a = this.f2871a.m2853a('(', ')');
        C0966a.m2375j(strM2853a, ":matches(regex) query must not be empty");
        if (z) {
            List<AbstractC1193N> list = this.f2873c;
            c1190k = new C1191L(Pattern.compile(strM2853a));
            r0 = list;
        } else {
            List<AbstractC1193N> list2 = this.f2873c;
            c1190k = new C1190K(Pattern.compile(strM2853a));
            r0 = list2;
        }
        r0.add(c1190k);
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC1193N m3005h(String str) {
        try {
            return new C1195P(str).m3006g();
        } catch (IllegalArgumentException e) {
            throw new C1196Q(e.getMessage(), new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x003f A[LOOP:0: B:7:0x0022->B:13:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0038 -> B:5:0x0019). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003c -> B:6:0x001f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    /* JADX INFO: renamed from: g */
    final com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N m3006g() {
        /*
            r3 = this;
            com.github.catvod.spider.support.C0.d0.P r0 = r3.f2871a
            r0.m2860h()
            com.github.catvod.spider.support.C0.d0.P r0 = r3.f2871a
            java.lang.String[] r1 = com.github.catvod.spider.support.p012C0.p029e0.C1195P.f2867d
            boolean r0 = r0.m2864l(r1)
            if (r0 == 0) goto L3f
            java.util.List<com.github.catvod.spider.support.C0.e0.N> r0 = r3.f2873c
            com.github.catvod.spider.support.C0.e0.Y r1 = new com.github.catvod.spider.support.C0.e0.Y
            r1.<init>()
            r0.add(r1)
        L19:
            com.github.catvod.spider.support.C0.d0.P r0 = r3.f2871a
            char r0 = r0.m2855c()
        L1f:
            r3.m2999a(r0)
        L22:
            com.github.catvod.spider.support.C0.d0.P r0 = r3.f2871a
            boolean r0 = r0.m2861i()
            if (r0 != 0) goto L43
            com.github.catvod.spider.support.C0.d0.P r0 = r3.f2871a
            boolean r0 = r0.m2860h()
            com.github.catvod.spider.support.C0.d0.P r1 = r3.f2871a
            java.lang.String[] r2 = com.github.catvod.spider.support.p012C0.p029e0.C1195P.f2867d
            boolean r1 = r1.m2864l(r2)
            if (r1 != 0) goto L19
            if (r0 == 0) goto L3f
            r0 = 32
            goto L1f
        L3f:
            r3.m3003e()
            goto L22
        L43:
            java.util.List<com.github.catvod.spider.support.C0.e0.N> r0 = r3.f2873c
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L56
            java.util.List<com.github.catvod.spider.support.C0.e0.N> r0 = r3.f2873c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.support.C0.e0.N r0 = (com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N) r0
        L55:
            return r0
        L56:
            com.github.catvod.spider.support.C0.e0.d r0 = new com.github.catvod.spider.support.C0.e0.d
            java.util.List<com.github.catvod.spider.support.C0.e0.N> r1 = r3.f2873c
            r0.<init>(r1)
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.support.p012C0.p029e0.C1195P.m3006g():com.github.catvod.spider.support.C0.e0.N");
    }

    public final String toString() {
        return this.f2872b;
    }
}
