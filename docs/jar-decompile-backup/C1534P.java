package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p056L.C1439S;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.P */
/* JADX INFO: loaded from: classes.dex */
public final class C1534P {

    /* JADX INFO: renamed from: d */
    private static final String[] f3482d = {",", ">", Marker.ANY_NON_NULL_MARKER, "~", " "};

    /* JADX INFO: renamed from: e */
    private static final String[] f3483e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: f */
    private static final Pattern f3484f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: g */
    private static final Pattern f3485g = Pattern.compile("([+-])?(\\d+)");

    /* JADX INFO: renamed from: a */
    private final C1439S f3486a;

    /* JADX INFO: renamed from: b */
    private final String f3487b;

    /* JADX INFO: renamed from: c */
    private final List<AbstractC1532N> f3488c = new ArrayList();

    private C1534P(String str) {
        C1377c.m3358e(str);
        String strTrim = str.trim();
        this.f3487b = strTrim;
        this.f3486a = new C1439S(strTrim);
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
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p057M.N>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p057M.N>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p057M.N>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p057M.N>] */
    /* JADX INFO: renamed from: a */
    private void m3769a(char c) {
        AbstractC1532N c1548d;
        AbstractC1532N abstractC1532N;
        boolean z;
        C1548d c1548d2;
        AbstractC1550f abstractC1550f;
        String str;
        this.f3486a.m3608h();
        StringBuilder sbM3363b = C1380b.m3363b();
        while (!this.f3486a.m3609i()) {
            if (this.f3486a.m3611k("(")) {
                sbM3363b.append("(");
                sbM3363b.append(this.f3486a.m3601a('(', ')'));
                str = ")";
            } else if (this.f3486a.m3611k("[")) {
                sbM3363b.append("[");
                sbM3363b.append(this.f3486a.m3601a('[', ']'));
                str = "]";
            } else if (!this.f3486a.m3612l(f3482d)) {
                sbM3363b.append(this.f3486a.m3603c());
            } else if (sbM3363b.length() > 0) {
                break;
            } else {
                this.f3486a.m3603c();
            }
            sbM3363b.append(str);
        }
        AbstractC1532N abstractC1532NM3777j = m3777j(C1380b.m3369h(sbM3363b));
        if (this.f3488c.size() == 1) {
            c1548d = (AbstractC1532N) this.f3488c.get(0);
            if ((c1548d instanceof C1549e) && c != ',') {
                C1549e c1549e = (C1549e) c1548d;
                int i = c1549e.f3498b;
                abstractC1532N = i > 0 ? c1549e.f3497a.get(i - 1) : null;
                z = true;
            }
            this.f3488c.clear();
            if (c != ' ') {
                c1548d2 = new C1548d(new C1541X(abstractC1532N), abstractC1532NM3777j);
            } else if (c != '>') {
                c1548d2 = new C1548d(new C1538U(abstractC1532N), abstractC1532NM3777j);
            } else {
                if (c != '~') {
                    if (c != '+') {
                        c1548d2 = new C1548d(new C1539V(abstractC1532N), abstractC1532NM3777j);
                    } else {
                        if (c == ',') {
                            throw new C1535Q("Unknown combinator '%s'", Character.valueOf(c));
                        }
                        if (abstractC1532N instanceof C1549e) {
                            abstractC1550f = (C1549e) abstractC1532N;
                        } else {
                            C1549e c1549e2 = new C1549e();
                            c1549e2.f3497a.add(abstractC1532N);
                            c1549e2.m3783b();
                            abstractC1550f = c1549e2;
                        }
                        abstractC1550f.f3497a.add(abstractC1532NM3777j);
                        abstractC1550f.m3783b();
                    }
                    if (z) {
                        C1549e c1549e3 = (C1549e) c1548d;
                        c1549e3.f3497a.set(c1549e3.f3498b - 1, abstractC1550f);
                    } else {
                        c1548d = abstractC1550f;
                    }
                    this.f3488c.add(c1548d);
                }
                c1548d2 = new C1548d(new C1542Y(abstractC1532N), abstractC1532NM3777j);
            }
            abstractC1550f = c1548d2;
            if (z) {
                C1549e c1549e4 = (C1549e) c1548d;
                c1549e4.f3497a.set(c1549e4.f3498b - 1, abstractC1550f);
            } else {
                c1548d = abstractC1550f;
            }
            this.f3488c.add(c1548d);
        }
        c1548d = new C1548d(this.f3488c);
        abstractC1532N = c1548d;
        z = false;
        this.f3488c.clear();
        if (c != ' ') {
            c1548d2 = new C1548d(new C1541X(abstractC1532N), abstractC1532NM3777j);
        } else if (c != '>') {
            c1548d2 = new C1548d(new C1538U(abstractC1532N), abstractC1532NM3777j);
        } else {
            if (c != '~') {
                if (c != '+') {
                    c1548d2 = new C1548d(new C1539V(abstractC1532N), abstractC1532NM3777j);
                } else {
                    if (c == ',') {
                        throw new C1535Q("Unknown combinator '%s'", Character.valueOf(c));
                    }
                    if (abstractC1532N instanceof C1549e) {
                        abstractC1550f = (C1549e) abstractC1532N;
                    } else {
                        C1549e c1549e5 = new C1549e();
                        c1549e5.f3497a.add(abstractC1532N);
                        c1549e5.m3783b();
                        abstractC1550f = c1549e5;
                    }
                    abstractC1550f.f3497a.add(abstractC1532NM3777j);
                    abstractC1550f.m3783b();
                }
                if (z) {
                    C1549e c1549e6 = (C1549e) c1548d;
                    c1549e6.f3497a.set(c1549e6.f3498b - 1, abstractC1550f);
                } else {
                    c1548d = abstractC1550f;
                }
                this.f3488c.add(c1548d);
            }
            c1548d2 = new C1548d(new C1542Y(abstractC1532N), abstractC1532NM3777j);
        }
        abstractC1550f = c1548d2;
        if (z) {
            C1549e c1549e7 = (C1549e) c1548d;
            c1549e7.f3497a.set(c1549e7.f3498b - 1, abstractC1550f);
        } else {
            c1548d = abstractC1550f;
        }
        this.f3488c.add(c1548d);
    }

    /* JADX INFO: renamed from: b */
    private int m3770b() {
        String strTrim = this.f3486a.m3602b().trim();
        int i = C1380b.f3175f;
        boolean z = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isDigit(strTrim.codePointAt(i2))) {
                }
            }
            z = true;
        }
        C1377c.m3357d(z, "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: c */
    private void m3771c(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        this.f3486a.m3604d(str);
        String strM3600o = C1439S.m3600o(this.f3486a.m3601a('(', ')'));
        C1377c.m3359f(strM3600o, str + "(text) query must not be empty");
        this.f3488c.add(z ? new C1562r(strM3600o) : new C1563s(strM3600o, 0));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: d */
    private void m3772d(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        this.f3486a.m3604d(str);
        String strM3600o = C1439S.m3600o(this.f3486a.m3601a('(', ')'));
        C1377c.m3359f(strM3600o, str + "(text) query must not be empty");
        this.f3488c.add(z ? new C1564t(strM3600o, 0) : new C1565u(strM3600o));
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
    private void m3773e(boolean z, boolean z2) {
        int i;
        AbstractC1566v c1525g;
        Object r9;
        String strM3220e = C1286l.m3220e(this.f3486a.m3602b());
        Matcher matcher = f3484f.matcher(strM3220e);
        Matcher matcher2 = f3485g.matcher(strM3220e);
        int i2 = 0;
        if (!"odd".equals(strM3220e)) {
            if ("even".equals(strM3220e)) {
                i = 0;
            } else if (matcher.matches()) {
                int i3 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i2 = i3;
            } else {
                if (!matcher2.matches()) {
                    throw new C1535Q("Could not parse nth-index '%s': unexpected format", strM3220e);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
            }
            if (z2) {
                if (z) {
                    List<AbstractC1532N> list = this.f3488c;
                    c1525g = new C1527I(i2, i);
                    r9 = list;
                } else {
                    List<AbstractC1532N> list2 = this.f3488c;
                    c1525g = new C1528J(i2, i);
                    r9 = list2;
                }
            } else if (z) {
                List<AbstractC1532N> list3 = this.f3488c;
                c1525g = new C1526H(i2, i);
                r9 = list3;
            } else {
                List<AbstractC1532N> list4 = this.f3488c;
                c1525g = new C1525G(i2, i);
                r9 = list4;
            }
            r9.add(c1525g);
        }
        i = 1;
        i2 = 2;
        if (z2) {
            if (z) {
                List<AbstractC1532N> list5 = this.f3488c;
                c1525g = new C1527I(i2, i);
                r9 = list5;
            } else {
                List<AbstractC1532N> list6 = this.f3488c;
                c1525g = new C1528J(i2, i);
                r9 = list6;
            }
        } else if (z) {
            List<AbstractC1532N> list7 = this.f3488c;
            c1525g = new C1526H(i2, i);
            r9 = list7;
        } else {
            List<AbstractC1532N> list8 = this.f3488c;
            c1525g = new C1525G(i2, i);
            r9 = list8;
        }
        r9.add(c1525g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: f */
    private void m3774f() {
        List<AbstractC1532N> list;
        AbstractC1532N c1530l;
        List<AbstractC1532N> list2;
        AbstractC1532N c1523e;
        List<AbstractC1532N> list3;
        AbstractC1532N c1559o;
        List<AbstractC1532N> list4;
        AbstractC1532N c1553i;
        if (this.f3486a.m3610j("#")) {
            String strM3605e = this.f3486a.m3605e();
            C1377c.m3358e(strM3605e);
            this.f3488c.add(new C1567w(strM3605e));
            return;
        }
        int i = 1;
        if (this.f3486a.m3610j(".")) {
            String strM3605e2 = this.f3486a.m3605e();
            C1377c.m3358e(strM3605e2);
            this.f3488c.add(new C1553i(strM3605e2.trim(), i));
            return;
        }
        int i2 = 0;
        if (this.f3486a.m3613m() || this.f3486a.m3611k("*|")) {
            String strM3220e = C1286l.m3220e(this.f3486a.m3606f());
            C1377c.m3358e(strM3220e);
            if (strM3220e.startsWith("*|")) {
                this.f3488c.add(new C1549e(new C1563s(strM3220e.substring(2), 1), new C1564t(strM3220e.replace("*|", ":"), i)));
                return;
            } else {
                if (strM3220e.contains("|")) {
                    strM3220e = strM3220e.replace("|", ":");
                }
                this.f3488c.add(new C1563s(strM3220e, 1));
                return;
            }
        }
        if (this.f3486a.m3611k("[")) {
            C1439S c1439s = new C1439S(this.f3486a.m3601a('[', ']'));
            String strM3607g = c1439s.m3607g(f3483e);
            C1377c.m3358e(strM3607g);
            c1439s.m3608h();
            if (c1439s.m3609i()) {
                if (strM3607g.startsWith("^")) {
                    list4 = this.f3488c;
                    c1553i = new C1555k(strM3607g.substring(1), 0);
                } else {
                    list4 = this.f3488c;
                    c1553i = new C1553i(strM3607g, i2);
                }
                list4.add(c1553i);
                return;
            }
            if (c1439s.m3610j("=")) {
                list3 = this.f3488c;
                c1559o = new C1556l(strM3607g, c1439s.m3614n());
            } else if (c1439s.m3610j("!=")) {
                list3 = this.f3488c;
                c1559o = new C1560p(strM3607g, c1439s.m3614n());
            } else if (c1439s.m3610j("^=")) {
                list3 = this.f3488c;
                c1559o = new C1561q(strM3607g, c1439s.m3614n());
            } else if (c1439s.m3610j("$=")) {
                list3 = this.f3488c;
                c1559o = new C1558n(strM3607g, c1439s.m3614n());
            } else if (c1439s.m3610j("*=")) {
                list3 = this.f3488c;
                c1559o = new C1557m(strM3607g, c1439s.m3614n());
            } else {
                if (!c1439s.m3610j("~=")) {
                    throw new C1535Q("Could not parse attribute query '%s': unexpected token at '%s'", this.f3487b, c1439s.m3614n());
                }
                list3 = this.f3488c;
                c1559o = new C1559o(strM3607g, Pattern.compile(c1439s.m3614n()));
            }
            list3.add(c1559o);
            return;
        }
        if (this.f3486a.m3610j(Marker.ANY_MARKER)) {
            this.f3488c.add(new C1552h());
            return;
        }
        if (this.f3486a.m3610j(":lt(")) {
            this.f3488c.add(new C1519A(m3770b()));
            return;
        }
        if (this.f3486a.m3610j(":gt(")) {
            this.f3488c.add(new C1570z(m3770b()));
            return;
        }
        if (this.f3486a.m3610j(":eq(")) {
            this.f3488c.add(new C1568x(m3770b()));
            return;
        }
        if (this.f3486a.m3611k(":has(")) {
            this.f3486a.m3604d(":has");
            String strM3601a = this.f3486a.m3601a('(', ')');
            C1377c.m3359f(strM3601a, ":has(selector) sub-select must not be empty");
            this.f3488c.add(new C1537T(m3777j(strM3601a)));
            return;
        }
        if (this.f3486a.m3611k(":contains(")) {
            m3771c(false);
            return;
        }
        if (this.f3486a.m3611k(":containsOwn(")) {
            m3771c(true);
            return;
        }
        if (this.f3486a.m3611k(":containsWholeText(")) {
            m3772d(false);
            return;
        }
        if (this.f3486a.m3611k(":containsWholeOwnText(")) {
            m3772d(true);
            return;
        }
        if (this.f3486a.m3611k(":containsData(")) {
            this.f3486a.m3604d(":containsData");
            String strM3600o = C1439S.m3600o(this.f3486a.m3601a('(', ')'));
            C1377c.m3359f(strM3600o, ":containsData(text) query must not be empty");
            this.f3488c.add(new C1555k(strM3600o, 1));
            return;
        }
        if (this.f3486a.m3611k(":matches(")) {
            m3775g(false);
            return;
        }
        if (this.f3486a.m3611k(":matchesOwn(")) {
            m3775g(true);
            return;
        }
        if (this.f3486a.m3611k(":matchesWholeText(")) {
            m3776h(false);
            return;
        }
        if (this.f3486a.m3611k(":matchesWholeOwnText(")) {
            m3776h(true);
            return;
        }
        if (this.f3486a.m3611k(":not(")) {
            this.f3486a.m3604d(":not");
            String strM3601a2 = this.f3486a.m3601a('(', ')');
            C1377c.m3359f(strM3601a2, ":not(selector) subselect must not be empty");
            this.f3488c.add(new C1540W(m3777j(strM3601a2)));
            return;
        }
        if (this.f3486a.m3610j(":nth-child(")) {
            m3773e(false, false);
            return;
        }
        if (this.f3486a.m3610j(":nth-last-child(")) {
            m3773e(true, false);
            return;
        }
        if (this.f3486a.m3610j(":nth-of-type(")) {
            m3773e(false, true);
            return;
        }
        if (this.f3486a.m3610j(":nth-last-of-type(")) {
            m3773e(true, true);
            return;
        }
        if (this.f3486a.m3610j(":first-child")) {
            list = this.f3488c;
            c1530l = new C1521C(i2);
        } else if (this.f3486a.m3610j(":last-child")) {
            list = this.f3488c;
            c1530l = new C1523E(i2);
        } else if (this.f3486a.m3610j(":first-of-type")) {
            list = this.f3488c;
            c1530l = new C1522D();
        } else {
            if (!this.f3486a.m3610j(":last-of-type")) {
                if (this.f3486a.m3610j(":only-child")) {
                    list2 = this.f3488c;
                    c1523e = new C1521C(i);
                } else if (this.f3486a.m3610j(":only-of-type")) {
                    list = this.f3488c;
                    c1530l = new C1529K();
                } else if (this.f3486a.m3610j(":empty")) {
                    list = this.f3488c;
                    c1530l = new C1520B();
                } else if (this.f3486a.m3610j(":root")) {
                    list2 = this.f3488c;
                    c1523e = new C1523E(i);
                } else {
                    if (!this.f3486a.m3610j(":matchText")) {
                        throw new C1535Q("Could not parse query '%s': unexpected token at '%s'", this.f3487b, this.f3486a.m3614n());
                    }
                    list = this.f3488c;
                    c1530l = new C1530L();
                }
                list2.add(c1523e);
                return;
            }
            list = this.f3488c;
            c1530l = new C1524F();
        }
        list.add(c1530l);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: g */
    private void m3775g(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        this.f3486a.m3604d(str);
        String strM3601a = this.f3486a.m3601a('(', ')');
        C1377c.m3359f(strM3601a, str + "(regex) query must not be empty");
        this.f3488c.add(z ? new C1553i(Pattern.compile(strM3601a), 2) : new C1531M(Pattern.compile(strM3601a)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: h */
    private void m3776h(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        this.f3486a.m3604d(str);
        String strM3601a = this.f3486a.m3601a('(', ')');
        C1377c.m3359f(strM3601a, str + "(regex) query must not be empty");
        this.f3488c.add(z ? new C1555k(Pattern.compile(strM3601a)) : new C1562r(Pattern.compile(strM3601a)));
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC1532N m3777j(String str) {
        try {
            return new C1534P(str).m3778i();
        } catch (IllegalArgumentException e) {
            throw new C1535Q(e.getMessage());
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
    final com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N m3778i() {
        /*
            r4 = this;
            com.github.catvod.spider.support.p044FM.p056L.S r0 = r4.f3486a
            r0.m3608h()
            com.github.catvod.spider.support.p044FM.p056L.S r0 = r4.f3486a
            java.lang.String[] r1 = com.github.catvod.spider.support.p044FM.p057M.C1534P.f3482d
            boolean r0 = r0.m3612l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.support.p044FM.p057M.N> r0 = r4.f3488c
            com.github.catvod.spider.support.p044FM.p057M.Z r1 = new com.github.catvod.spider.support.p044FM.p057M.Z
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.m3774f()
        L1f:
            com.github.catvod.spider.support.p044FM.p056L.S r1 = r0.f3486a
            boolean r1 = r1.m3609i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.support.p044FM.p056L.S r1 = r0.f3486a
            boolean r1 = r1.m3608h()
            com.github.catvod.spider.support.p044FM.p056L.S r2 = r0.f3486a
            java.lang.String[] r3 = com.github.catvod.spider.support.p044FM.p057M.C1534P.f3482d
            boolean r2 = r2.m3612l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.support.p044FM.p056L.S r1 = r0.f3486a
            char r1 = r1.m3603c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.m3769a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.support.p044FM.p057M.N> r1 = r0.f3488c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.support.p044FM.p057M.N> r0 = r0.f3488c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.support.p044FM.p057M.N r0 = (com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N) r0
            return r0
        L59:
            com.github.catvod.spider.support.p044FM.p057M.d r1 = new com.github.catvod.spider.support.p044FM.p057M.d
            java.util.List<com.github.catvod.spider.support.p044FM.p057M.N> r0 = r0.f3488c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.support.p044FM.p057M.C1534P.m3778i():com.github.catvod.spider.support.p044FM.p057M.N");
    }

    public final String toString() {
        return this.f3487b;
    }
}
