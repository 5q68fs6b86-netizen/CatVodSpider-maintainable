package com.github.catvod.spider.support.p103I;

import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p043F.C1274b;
import com.github.catvod.spider.support.p102H.C2054j;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.I.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2063f {

    /* JADX INFO: renamed from: d */
    private static final String[] f4932d = {",", ">", Marker.ANY_NON_NULL_MARKER, "~", " "};

    /* JADX INFO: renamed from: e */
    private static final String[] f4933e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: f */
    private static final Pattern f4934f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: g */
    private static final Pattern f4935g = Pattern.compile("([+-])?(\\d+)");

    /* JADX INFO: renamed from: a */
    private final C2054j f4936a;

    /* JADX INFO: renamed from: b */
    private final String f4937b;

    /* JADX INFO: renamed from: c */
    private final List<AbstractC2061d> f4938c = new ArrayList();

    private C2063f(String str) {
        C1271c.m3155e(str);
        String strTrim = str.trim();
        this.f4937b = strTrim;
        this.f4936a = new C2054j(strTrim);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.I.d>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.I.d>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.I.d>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.I.d>] */
    /* JADX INFO: renamed from: a */
    private void m5184a(char c) {
        AbstractC2061d aVar;
        AbstractC2061d abstractC2061d;
        boolean z;
        AbstractC2059b.a aVar2;
        AbstractC2059b abstractC2059b;
        String str;
        this.f4936a.m5131h();
        StringBuilder sbM3171b = C1274b.m3171b();
        while (!this.f4936a.m5132i()) {
            if (this.f4936a.m5134k("(")) {
                sbM3171b.append("(");
                sbM3171b.append(this.f4936a.m5124a('(', ')'));
                str = ")";
            } else if (this.f4936a.m5134k("[")) {
                sbM3171b.append("[");
                sbM3171b.append(this.f4936a.m5124a('[', ']'));
                str = "]";
            } else if (!this.f4936a.m5135l(f4932d)) {
                sbM3171b.append(this.f4936a.m5126c());
            } else if (sbM3171b.length() > 0) {
                break;
            } else {
                this.f4936a.m5126c();
            }
            sbM3171b.append(str);
        }
        AbstractC2061d abstractC2061dM5192j = m5192j(C1274b.m3177h(sbM3171b));
        if (this.f4938c.size() == 1) {
            aVar = (AbstractC2061d) this.f4938c.get(0);
            if ((aVar instanceof AbstractC2059b.b) && c != ',') {
                AbstractC2059b.b bVar = (AbstractC2059b.b) aVar;
                int i = bVar.f4909b;
                abstractC2061d = i > 0 ? bVar.f4908a.get(i - 1) : null;
                z = true;
            }
            this.f4938c.clear();
            if (c != ' ') {
                aVar2 = new AbstractC2059b.a(new AbstractC2065h.e(abstractC2061d), abstractC2061dM5192j);
            } else if (c != '>') {
                aVar2 = new AbstractC2059b.a(new AbstractC2065h.b(abstractC2061d), abstractC2061dM5192j);
            } else {
                if (c != '~') {
                    if (c != '+') {
                        aVar2 = new AbstractC2059b.a(new AbstractC2065h.c(abstractC2061d), abstractC2061dM5192j);
                    } else {
                        if (c == ',') {
                            throw new C2064g("Unknown combinator '%s'", Character.valueOf(c));
                        }
                        if (abstractC2061d instanceof AbstractC2059b.b) {
                            abstractC2059b = (AbstractC2059b.b) abstractC2061d;
                        } else {
                            AbstractC2059b.b bVar2 = new AbstractC2059b.b();
                            bVar2.f4908a.add(abstractC2061d);
                            bVar2.m5177b();
                            abstractC2059b = bVar2;
                        }
                        abstractC2059b.f4908a.add(abstractC2061dM5192j);
                        abstractC2059b.m5177b();
                    }
                    if (z) {
                        AbstractC2059b.b bVar3 = (AbstractC2059b.b) aVar;
                        bVar3.f4908a.set(bVar3.f4909b - 1, abstractC2059b);
                    } else {
                        aVar = abstractC2059b;
                    }
                    this.f4938c.add(aVar);
                }
                aVar2 = new AbstractC2059b.a(new AbstractC2065h.f(abstractC2061d), abstractC2061dM5192j);
            }
            abstractC2059b = aVar2;
            if (z) {
                AbstractC2059b.b bVar4 = (AbstractC2059b.b) aVar;
                bVar4.f4908a.set(bVar4.f4909b - 1, abstractC2059b);
            } else {
                aVar = abstractC2059b;
            }
            this.f4938c.add(aVar);
        }
        aVar = new AbstractC2059b.a(this.f4938c);
        abstractC2061d = aVar;
        z = false;
        this.f4938c.clear();
        if (c != ' ') {
            aVar2 = new AbstractC2059b.a(new AbstractC2065h.e(abstractC2061d), abstractC2061dM5192j);
        } else if (c != '>') {
            aVar2 = new AbstractC2059b.a(new AbstractC2065h.b(abstractC2061d), abstractC2061dM5192j);
        } else {
            if (c != '~') {
                if (c != '+') {
                    aVar2 = new AbstractC2059b.a(new AbstractC2065h.c(abstractC2061d), abstractC2061dM5192j);
                } else {
                    if (c == ',') {
                        throw new C2064g("Unknown combinator '%s'", Character.valueOf(c));
                    }
                    if (abstractC2061d instanceof AbstractC2059b.b) {
                        abstractC2059b = (AbstractC2059b.b) abstractC2061d;
                    } else {
                        AbstractC2059b.b bVar5 = new AbstractC2059b.b();
                        bVar5.f4908a.add(abstractC2061d);
                        bVar5.m5177b();
                        abstractC2059b = bVar5;
                    }
                    abstractC2059b.f4908a.add(abstractC2061dM5192j);
                    abstractC2059b.m5177b();
                }
                if (z) {
                    AbstractC2059b.b bVar6 = (AbstractC2059b.b) aVar;
                    bVar6.f4908a.set(bVar6.f4909b - 1, abstractC2059b);
                } else {
                    aVar = abstractC2059b;
                }
                this.f4938c.add(aVar);
            }
            aVar2 = new AbstractC2059b.a(new AbstractC2065h.f(abstractC2061d), abstractC2061dM5192j);
        }
        abstractC2059b = aVar2;
        if (z) {
            AbstractC2059b.b bVar7 = (AbstractC2059b.b) aVar;
            bVar7.f4908a.set(bVar7.f4909b - 1, abstractC2059b);
        } else {
            aVar = abstractC2059b;
        }
        this.f4938c.add(aVar);
    }

    /* JADX INFO: renamed from: b */
    private int m5185b() {
        String strTrim = this.f4936a.m5125b().trim();
        int i = C1274b.f2988f;
        boolean z = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isDigit(strTrim.codePointAt(i2))) {
                }
            }
            z = true;
        }
        C1271c.m3154d(z, "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: c */
    private void m5186c(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        this.f4936a.m5127d(str);
        String strM5123o = C2054j.m5123o(this.f4936a.m5124a('(', ')'));
        C1271c.m3156f(strM5123o, str + "(text) query must not be empty");
        this.f4938c.add(z ? new AbstractC2061d.C2699m(strM5123o) : new AbstractC2061d.C2700n(strM5123o));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: d */
    private void m5187d(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        this.f4936a.m5127d(str);
        String strM5123o = C2054j.m5123o(this.f4936a.m5124a('(', ')'));
        C1271c.m3156f(strM5123o, str + "(text) query must not be empty");
        this.f4938c.add(z ? new AbstractC2061d.C2701o(strM5123o) : new AbstractC2061d.p(strM5123o));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: e */
    private void m5188e(boolean z, boolean z2) {
        int i;
        AbstractC2061d.q b;
        Object r9;
        String strM3166f = C1273a.m3166f(this.f4936a.m5125b());
        Matcher matcher = f4934f.matcher(strM3166f);
        Matcher matcher2 = f4935g.matcher(strM3166f);
        int i2 = 0;
        if (!"odd".equals(strM3166f)) {
            if ("even".equals(strM3166f)) {
                i = 0;
            } else if (matcher.matches()) {
                int i3 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i2 = i3;
            } else {
                if (!matcher2.matches()) {
                    throw new C2064g("Could not parse nth-index '%s': unexpected format", strM3166f);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
            }
            if (z2) {
                if (z) {
                    List<AbstractC2061d> list = this.f4938c;
                    b = new AbstractC2061d.D(i2, i);
                    r9 = list;
                } else {
                    List<AbstractC2061d> list2 = this.f4938c;
                    b = new AbstractC2061d.E(i2, i);
                    r9 = list2;
                }
            } else if (z) {
                List<AbstractC2061d> list3 = this.f4938c;
                b = new AbstractC2061d.C(i2, i);
                r9 = list3;
            } else {
                List<AbstractC2061d> list4 = this.f4938c;
                b = new AbstractC2061d.B(i2, i);
                r9 = list4;
            }
            r9.add(b);
        }
        i = 1;
        i2 = 2;
        if (z2) {
            if (z) {
                List<AbstractC2061d> list5 = this.f4938c;
                b = new AbstractC2061d.D(i2, i);
                r9 = list5;
            } else {
                List<AbstractC2061d> list6 = this.f4938c;
                b = new AbstractC2061d.E(i2, i);
                r9 = list6;
            }
        } else if (z) {
            List<AbstractC2061d> list7 = this.f4938c;
            b = new AbstractC2061d.C(i2, i);
            r9 = list7;
        } else {
            List<AbstractC2061d> list8 = this.f4938c;
            b = new AbstractC2061d.B(i2, i);
            r9 = list8;
        }
        r9.add(b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: f */
    private void m5189f() {
        List<AbstractC2061d> list;
        Object i;
        List<AbstractC2061d> list2;
        Object c2694h;
        List<AbstractC2061d> list3;
        Object c2688b;
        if (this.f4936a.m5133j("#")) {
            String strM5128e = this.f4936a.m5128e();
            C1271c.m3155e(strM5128e);
            this.f4938c.add(new AbstractC2061d.r(strM5128e));
            return;
        }
        if (this.f4936a.m5133j(".")) {
            String strM5128e2 = this.f4936a.m5128e();
            C1271c.m3155e(strM5128e2);
            this.f4938c.add(new AbstractC2061d.C2697k(strM5128e2.trim()));
            return;
        }
        if (this.f4936a.m5136m() || this.f4936a.m5134k("*|")) {
            String strM3166f = C1273a.m3166f(this.f4936a.m5129f());
            C1271c.m3155e(strM3166f);
            if (strM3166f.startsWith("*|")) {
                this.f4938c.add(new AbstractC2059b.b(new AbstractC2061d.N(strM3166f.substring(2)), new AbstractC2061d.O(strM3166f.replace("*|", ":"))));
                return;
            } else {
                if (strM3166f.contains("|")) {
                    strM3166f = strM3166f.replace("|", ":");
                }
                this.f4938c.add(new AbstractC2061d.N(strM3166f));
                return;
            }
        }
        if (this.f4936a.m5134k("[")) {
            C2054j c2054j = new C2054j(this.f4936a.m5124a('[', ']'));
            String strM5130g = c2054j.m5130g(f4933e);
            C1271c.m3155e(strM5130g);
            c2054j.m5131h();
            if (c2054j.m5132i()) {
                if (strM5130g.startsWith("^")) {
                    list3 = this.f4938c;
                    c2688b = new AbstractC2061d.C2690d(strM5130g.substring(1));
                } else {
                    list3 = this.f4938c;
                    c2688b = new AbstractC2061d.C2688b(strM5130g);
                }
                list3.add(c2688b);
                return;
            }
            if (c2054j.m5133j("=")) {
                list2 = this.f4938c;
                c2694h = new AbstractC2061d.C2691e(strM5130g, c2054j.m5137n());
            } else if (c2054j.m5133j("!=")) {
                list2 = this.f4938c;
                c2694h = new AbstractC2061d.C2695i(strM5130g, c2054j.m5137n());
            } else if (c2054j.m5133j("^=")) {
                list2 = this.f4938c;
                c2694h = new AbstractC2061d.C2696j(strM5130g, c2054j.m5137n());
            } else if (c2054j.m5133j("$=")) {
                list2 = this.f4938c;
                c2694h = new AbstractC2061d.C2693g(strM5130g, c2054j.m5137n());
            } else if (c2054j.m5133j("*=")) {
                list2 = this.f4938c;
                c2694h = new AbstractC2061d.C2692f(strM5130g, c2054j.m5137n());
            } else {
                if (!c2054j.m5133j("~=")) {
                    throw new C2064g("Could not parse attribute query '%s': unexpected token at '%s'", this.f4937b, c2054j.m5137n());
                }
                list2 = this.f4938c;
                c2694h = new AbstractC2061d.C2694h(strM5130g, Pattern.compile(c2054j.m5137n()));
            }
            list2.add(c2694h);
            return;
        }
        if (this.f4936a.m5133j(Marker.ANY_MARKER)) {
            this.f4938c.add(new AbstractC2061d.C2687a());
            return;
        }
        if (this.f4936a.m5133j(":lt(")) {
            this.f4938c.add(new AbstractC2061d.v(m5185b()));
            return;
        }
        if (this.f4936a.m5133j(":gt(")) {
            this.f4938c.add(new AbstractC2061d.u(m5185b()));
            return;
        }
        if (this.f4936a.m5133j(":eq(")) {
            this.f4938c.add(new AbstractC2061d.s(m5185b()));
            return;
        }
        if (this.f4936a.m5134k(":has(")) {
            this.f4936a.m5127d(":has");
            String strM5124a = this.f4936a.m5124a('(', ')');
            C1271c.m3156f(strM5124a, ":has(selector) sub-select must not be empty");
            this.f4938c.add(new AbstractC2065h.a(m5192j(strM5124a)));
            return;
        }
        if (this.f4936a.m5134k(":contains(")) {
            m5186c(false);
            return;
        }
        if (this.f4936a.m5134k(":containsOwn(")) {
            m5186c(true);
            return;
        }
        if (this.f4936a.m5134k(":containsWholeText(")) {
            m5187d(false);
            return;
        }
        if (this.f4936a.m5134k(":containsWholeOwnText(")) {
            m5187d(true);
            return;
        }
        if (this.f4936a.m5134k(":containsData(")) {
            this.f4936a.m5127d(":containsData");
            String strM5123o = C2054j.m5123o(this.f4936a.m5124a('(', ')'));
            C1271c.m3156f(strM5123o, ":containsData(text) query must not be empty");
            this.f4938c.add(new AbstractC2061d.C2698l(strM5123o));
            return;
        }
        if (this.f4936a.m5134k(":matches(")) {
            m5190g(false);
            return;
        }
        if (this.f4936a.m5134k(":matchesOwn(")) {
            m5190g(true);
            return;
        }
        if (this.f4936a.m5134k(":matchesWholeText(")) {
            m5191h(false);
            return;
        }
        if (this.f4936a.m5134k(":matchesWholeOwnText(")) {
            m5191h(true);
            return;
        }
        if (this.f4936a.m5134k(":not(")) {
            this.f4936a.m5127d(":not");
            String strM5124a2 = this.f4936a.m5124a('(', ')');
            C1271c.m3156f(strM5124a2, ":not(selector) subselect must not be empty");
            this.f4938c.add(new AbstractC2065h.d(m5192j(strM5124a2)));
            return;
        }
        if (this.f4936a.m5133j(":nth-child(")) {
            m5188e(false, false);
            return;
        }
        if (this.f4936a.m5133j(":nth-last-child(")) {
            m5188e(true, false);
            return;
        }
        if (this.f4936a.m5133j(":nth-of-type(")) {
            m5188e(false, true);
            return;
        }
        if (this.f4936a.m5133j(":nth-last-of-type(")) {
            m5188e(true, true);
            return;
        }
        if (this.f4936a.m5133j(":first-child")) {
            list = this.f4938c;
            i = new AbstractC2061d.x();
        } else if (this.f4936a.m5133j(":last-child")) {
            list = this.f4938c;
            i = new AbstractC2061d.z();
        } else if (this.f4936a.m5133j(":first-of-type")) {
            list = this.f4938c;
            i = new AbstractC2061d.y();
        } else if (this.f4936a.m5133j(":last-of-type")) {
            list = this.f4938c;
            i = new AbstractC2061d.A();
        } else if (this.f4936a.m5133j(":only-child")) {
            list = this.f4938c;
            i = new AbstractC2061d.F();
        } else if (this.f4936a.m5133j(":only-of-type")) {
            list = this.f4938c;
            i = new AbstractC2061d.G();
        } else if (this.f4936a.m5133j(":empty")) {
            list = this.f4938c;
            i = new AbstractC2061d.w();
        } else if (this.f4936a.m5133j(":root")) {
            list = this.f4938c;
            i = new AbstractC2061d.H();
        } else {
            if (!this.f4936a.m5133j(":matchText")) {
                throw new C2064g("Could not parse query '%s': unexpected token at '%s'", this.f4937b, this.f4936a.m5137n());
            }
            list = this.f4938c;
            i = new AbstractC2061d.I();
        }
        list.add(i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: g */
    private void m5190g(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        this.f4936a.m5127d(str);
        String strM5124a = this.f4936a.m5124a('(', ')');
        C1271c.m3156f(strM5124a, str + "(regex) query must not be empty");
        this.f4938c.add(z ? new AbstractC2061d.K(Pattern.compile(strM5124a)) : new AbstractC2061d.J(Pattern.compile(strM5124a)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: h */
    private void m5191h(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        this.f4936a.m5127d(str);
        String strM5124a = this.f4936a.m5124a('(', ')');
        C1271c.m3156f(strM5124a, str + "(regex) query must not be empty");
        this.f4938c.add(z ? new AbstractC2061d.L(Pattern.compile(strM5124a)) : new AbstractC2061d.M(Pattern.compile(strM5124a)));
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC2061d m5192j(String str) {
        try {
            return new C2063f(str).m5193i();
        } catch (IllegalArgumentException e) {
            throw new C2064g(e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001c A[LOOP:0: B:7:0x001f->B:6:0x001c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:11:0x0037). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    /* JADX INFO: renamed from: i */
    final com.github.catvod.spider.support.p103I.AbstractC2061d m5193i() {
        /*
            r4 = this;
            com.github.catvod.spider.support.H.j r0 = r4.f4936a
            r0.m5131h()
            com.github.catvod.spider.support.H.j r0 = r4.f4936a
            java.lang.String[] r1 = com.github.catvod.spider.support.p103I.C2063f.f4932d
            boolean r0 = r0.m5135l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.support.I.d> r0 = r4.f4938c
            com.github.catvod.spider.support.I.h$g r1 = new com.github.catvod.spider.support.I.h$g
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.m5189f()
        L1f:
            com.github.catvod.spider.support.H.j r1 = r0.f4936a
            boolean r1 = r1.m5132i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.support.H.j r1 = r0.f4936a
            boolean r1 = r1.m5131h()
            com.github.catvod.spider.support.H.j r2 = r0.f4936a
            java.lang.String[] r3 = com.github.catvod.spider.support.p103I.C2063f.f4932d
            boolean r2 = r2.m5135l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.support.H.j r1 = r0.f4936a
            char r1 = r1.m5126c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.m5184a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.support.I.d> r1 = r0.f4938c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.support.I.d> r0 = r0.f4938c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.support.I.d r0 = (com.github.catvod.spider.support.p103I.AbstractC2061d) r0
            return r0
        L59:
            com.github.catvod.spider.support.I.b$a r1 = new com.github.catvod.spider.support.I.b$a
            java.util.List<com.github.catvod.spider.support.I.d> r0 = r0.f4938c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.support.p103I.C2063f.m5193i():com.github.catvod.spider.support.I.d");
    }

    public final String toString() {
        return this.f4937b;
    }
}
