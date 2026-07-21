package com.github.catvod.spider.support.p103I;

import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p043F.C1274b;
import com.github.catvod.spider.support.p101G.AbstractC2041m;
import com.github.catvod.spider.support.p101G.C2029a;
import com.github.catvod.spider.support.p101G.C2032d;
import com.github.catvod.spider.support.p101G.C2034f;
import com.github.catvod.spider.support.p101G.C2035g;
import com.github.catvod.spider.support.p101G.C2036h;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p101G.C2043o;
import com.github.catvod.spider.support.p101G.C2044p;
import com.github.catvod.spider.support.p102H.C2050f;
import com.github.catvod.spider.support.p102H.C2052h;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.I.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2061d {

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$A */
    public static final class A extends D {
        public A() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d.q
        public final String toString() {
            return ":last-of-type";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$B */
    public static final class B extends q {
        public B(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d.q
        /* JADX INFO: renamed from: b */
        protected final int mo5182b(C2037i c2037i) {
            return c2037i.m4878Y() + 1;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d.q
        /* JADX INFO: renamed from: c */
        protected final String mo5183c() {
            return "nth-child";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$C */
    public static final class C extends q {
        public C(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d.q
        /* JADX INFO: renamed from: b */
        protected final int mo5182b(C2037i c2037i) {
            if (c2037i.m4890j0() == null) {
                return 0;
            }
            return c2037i.m4890j0().m4876V().size() - c2037i.m4878Y();
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d.q
        /* JADX INFO: renamed from: c */
        protected final String mo5183c() {
            return "nth-last-child";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$D */
    public static class D extends q {
        public D(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d.q
        /* JADX INFO: renamed from: b */
        protected final int mo5182b(C2037i c2037i) {
            int i = 0;
            if (c2037i.m4890j0() == null) {
                return 0;
            }
            C2060c c2060cM4876V = c2037i.m4890j0().m4876V();
            for (int iM4878Y = c2037i.m4878Y(); iM4878Y < c2060cM4876V.size(); iM4878Y++) {
                if (c2060cM4876V.get(iM4878Y).m4900q0().equals(c2037i.m4900q0())) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d.q
        /* JADX INFO: renamed from: c */
        protected final String mo5183c() {
            return "nth-last-of-type";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$E */
    public static class E extends q {
        public E(int i, int i2) {
            super(i, i2);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d.q
        /* JADX INFO: renamed from: b */
        protected final int mo5182b(C2037i c2037i) {
            int i = 0;
            if (c2037i.m4890j0() == null) {
                return 0;
            }
            for (C2037i c2037i2 : c2037i.m4890j0().m4876V()) {
                if (c2037i2.m4900q0().equals(c2037i.m4900q0())) {
                    i++;
                }
                if (c2037i2 == c2037i) {
                    break;
                }
            }
            return i;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d.q
        /* JADX INFO: renamed from: c */
        protected final String mo5183c() {
            return "nth-of-type";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$F */
    public static final class F extends AbstractC2061d {
        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            C2037i c2037iM4890j0 = c2037i2.m4890j0();
            return (c2037iM4890j0 == null || (c2037iM4890j0 instanceof C2034f) || !c2037i2.m4899p0().isEmpty()) ? false : true;
        }

        public final String toString() {
            return ":only-child";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$G */
    public static final class G extends AbstractC2061d {
        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            C2037i c2037iM4890j0 = c2037i2.m4890j0();
            if (c2037iM4890j0 == null || (c2037iM4890j0 instanceof C2034f)) {
                return false;
            }
            Iterator<C2037i> it = c2037iM4890j0.m4876V().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().m4900q0().equals(c2037i2.m4900q0())) {
                    i++;
                }
            }
            return i == 1;
        }

        public final String toString() {
            return ":only-of-type";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$H */
    public static final class H extends AbstractC2061d {
        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            if (c2037i instanceof C2034f) {
                c2037i = c2037i.m4874T();
            }
            return c2037i2 == c2037i;
        }

        public final String toString() {
            return ":root";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$I */
    public static final class I extends AbstractC2061d {
        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            if (c2037i2 instanceof C2043o) {
                return true;
            }
            for (C2044p c2044p : c2037i2.m4903u0()) {
                C2043o c2043o = new C2043o(C2052h.m5079m(c2037i2.m4901r0(), C2050f.f4753d), c2037i2.mo4885f(), c2037i2.mo4883e());
                c2044p.m4933E(c2043o);
                c2043o.m4869M(c2044p);
            }
            return false;
        }

        public final String toString() {
            return ":matchText";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$J */
    public static final class J extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final Pattern f4910a;

        public J(Pattern pattern) {
            this.f4910a = pattern;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return this.f4910a.matcher(c2037i2.m4902t0()).find();
        }

        public final String toString() {
            return String.format(":matches(%s)", this.f4910a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$K */
    public static final class K extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final Pattern f4911a;

        public K(Pattern pattern) {
            this.f4911a = pattern;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return this.f4911a.matcher(c2037i2.m4889i0()).find();
        }

        public final String toString() {
            return String.format(":matchesOwn(%s)", this.f4911a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$L */
    public static final class L extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final Pattern f4912a;

        public L(Pattern pattern) {
            this.f4912a = pattern;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return this.f4912a.matcher(c2037i2.m4904v0()).find();
        }

        public final String toString() {
            return String.format(":matchesWholeOwnText(%s)", this.f4912a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$M */
    public static final class M extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final Pattern f4913a;

        public M(Pattern pattern) {
            this.f4913a = pattern;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            Pattern pattern = this.f4913a;
            StringBuilder sbM3171b = C1274b.m3171b();
            C1273a.m3167g(new C2036h(sbM3171b), c2037i2);
            return pattern.matcher(C1274b.m3177h(sbM3171b)).find();
        }

        public final String toString() {
            return String.format(":matchesWholeText(%s)", this.f4913a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$N */
    public static final class N extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4914a;

        public N(String str) {
            this.f4914a = str;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4888h0().equals(this.f4914a);
        }

        public final String toString() {
            return String.format("%s", this.f4914a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$O */
    public static final class O extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4915a;

        public O(String str) {
            this.f4915a = str;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4888h0().endsWith(this.f4915a);
        }

        public final String toString() {
            return String.format("%s", this.f4915a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$a, reason: case insensitive filesystem */
    public static final class C2687a extends AbstractC2061d {
        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return true;
        }

        public final String toString() {
            return Marker.ANY_MARKER;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$b, reason: case insensitive filesystem */
    public static final class C2688b extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4916a;

        public C2688b(String str) {
            this.f4916a = str;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4939o(this.f4916a);
        }

        public final String toString() {
            return String.format("[%s]", this.f4916a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$c, reason: case insensitive filesystem */
    public static abstract class AbstractC2689c extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        String f4917a;

        /* JADX INFO: renamed from: b */
        String f4918b;

        public AbstractC2689c(String str, String str2, boolean z) {
            C1271c.m3155e(str);
            C1271c.m3155e(str2);
            this.f4917a = C1273a.m3166f(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            String strM3165e = (!z && z2) ? C1273a.m3165e(str2) : C1273a.m3166f(str2);
            this.f4918b = strM3165e;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$d, reason: case insensitive filesystem */
    public static final class C2690d extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4919a;

        public C2690d(String str) {
            C1271c.m3155e(str);
            this.f4919a = C1273a.m3165e(str);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            Iterator<C2029a> it = c2037i2.mo4883e().m4816g().iterator();
            while (it.hasNext()) {
                if (C1273a.m3165e(it.next().m4802a()).startsWith(this.f4919a)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format("[^%s]", this.f4919a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$e, reason: case insensitive filesystem */
    public static final class C2691e extends AbstractC2689c {
        public C2691e(String str, String str2) {
            super(str, str2, true);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4939o(this.f4917a) && this.f4918b.equalsIgnoreCase(c2037i2.mo4929d(this.f4917a).trim());
        }

        public final String toString() {
            return String.format("[%s=%s]", this.f4917a, this.f4918b);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$f, reason: case insensitive filesystem */
    public static final class C2692f extends AbstractC2689c {
        public C2692f(String str, String str2) {
            super(str, str2, true);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4939o(this.f4917a) && C1273a.m3165e(c2037i2.mo4929d(this.f4917a)).contains(this.f4918b);
        }

        public final String toString() {
            return String.format("[%s*=%s]", this.f4917a, this.f4918b);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$g, reason: case insensitive filesystem */
    public static final class C2693g extends AbstractC2689c {
        public C2693g(String str, String str2) {
            super(str, str2, false);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4939o(this.f4917a) && C1273a.m3165e(c2037i2.mo4929d(this.f4917a)).endsWith(this.f4918b);
        }

        public final String toString() {
            return String.format("[%s$=%s]", this.f4917a, this.f4918b);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$h, reason: case insensitive filesystem */
    public static final class C2694h extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        String f4920a;

        /* JADX INFO: renamed from: b */
        Pattern f4921b;

        public C2694h(String str, Pattern pattern) {
            this.f4920a = C1273a.m3166f(str);
            this.f4921b = pattern;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4939o(this.f4920a) && this.f4921b.matcher(c2037i2.mo4929d(this.f4920a)).find();
        }

        public final String toString() {
            return String.format("[%s~=%s]", this.f4920a, this.f4921b.toString());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$i, reason: case insensitive filesystem */
    public static final class C2695i extends AbstractC2689c {
        public C2695i(String str, String str2) {
            super(str, str2, true);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return !this.f4918b.equalsIgnoreCase(c2037i2.mo4929d(this.f4917a));
        }

        public final String toString() {
            return String.format("[%s!=%s]", this.f4917a, this.f4918b);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$j, reason: case insensitive filesystem */
    public static final class C2696j extends AbstractC2689c {
        public C2696j(String str, String str2) {
            super(str, str2, false);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4939o(this.f4917a) && C1273a.m3165e(c2037i2.mo4929d(this.f4917a)).startsWith(this.f4918b);
        }

        public final String toString() {
            return String.format("[%s^=%s]", this.f4917a, this.f4918b);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$k, reason: case insensitive filesystem */
    public static final class C2697k extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4922a;

        public C2697k(String str) {
            this.f4922a = str;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4880a0(this.f4922a);
        }

        public final String toString() {
            return String.format(".%s", this.f4922a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$l, reason: case insensitive filesystem */
    public static final class C2698l extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4923a;

        public C2698l(String str) {
            this.f4923a = C1273a.m3165e(str);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return C1273a.m3165e(c2037i2.m4877X()).contains(this.f4923a);
        }

        public final String toString() {
            return String.format(":containsData(%s)", this.f4923a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$m, reason: case insensitive filesystem */
    public static final class C2699m extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4924a;

        public C2699m(String str) {
            StringBuilder sbM3171b = C1274b.m3171b();
            C1274b.m3170a(sbM3171b, str, false);
            this.f4924a = C1273a.m3165e(C1274b.m3177h(sbM3171b));
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return C1273a.m3165e(c2037i2.m4889i0()).contains(this.f4924a);
        }

        public final String toString() {
            return String.format(":containsOwn(%s)", this.f4924a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$n, reason: case insensitive filesystem */
    public static final class C2700n extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4925a;

        public C2700n(String str) {
            StringBuilder sbM3171b = C1274b.m3171b();
            C1274b.m3170a(sbM3171b, str, false);
            this.f4925a = C1273a.m3165e(C1274b.m3177h(sbM3171b));
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return C1273a.m3165e(c2037i2.m4902t0()).contains(this.f4925a);
        }

        public final String toString() {
            return String.format(":contains(%s)", this.f4925a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$o, reason: case insensitive filesystem */
    public static final class C2701o extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4926a;

        public C2701o(String str) {
            this.f4926a = str;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4904v0().contains(this.f4926a);
        }

        public final String toString() {
            return String.format(":containsWholeOwnText(%s)", this.f4926a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$p */
    public static final class p extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4927a;

        public p(String str) {
            this.f4927a = str;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            StringBuilder sbM3171b = C1274b.m3171b();
            C1273a.m3167g(new C2036h(sbM3171b), c2037i2);
            return C1274b.m3177h(sbM3171b).contains(this.f4927a);
        }

        public final String toString() {
            return String.format(":containsWholeText(%s)", this.f4927a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$q */
    public static abstract class q extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        protected final int f4928a;

        /* JADX INFO: renamed from: b */
        protected final int f4929b;

        public q(int i, int i2) {
            this.f4928a = i;
            this.f4929b = i2;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            C2037i c2037iM4890j0 = c2037i2.m4890j0();
            if (c2037iM4890j0 != null && !(c2037iM4890j0 instanceof C2034f)) {
                int iMo5182b = mo5182b(c2037i2);
                int i = this.f4928a;
                if (i == 0) {
                    return iMo5182b == this.f4929b;
                }
                int i2 = iMo5182b - this.f4929b;
                if (i2 * i >= 0 && i2 % i == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        protected abstract int mo5182b(C2037i c2037i);

        /* JADX INFO: renamed from: c */
        protected abstract String mo5183c();

        public String toString() {
            if (this.f4928a == 0) {
                return String.format(":%s(%d)", mo5183c(), Integer.valueOf(this.f4929b));
            }
            return this.f4929b == 0 ? String.format(":%s(%dn)", mo5183c(), Integer.valueOf(this.f4928a)) : String.format(":%s(%dn%+d)", mo5183c(), Integer.valueOf(this.f4928a), Integer.valueOf(this.f4929b));
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$r */
    public static final class r extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        private final String f4930a;

        public r(String str) {
            this.f4930a = str;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return this.f4930a.equals(c2037i2.m4882c0());
        }

        public final String toString() {
            return String.format("#%s", this.f4930a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$s */
    public static final class s extends t {
        public s(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4878Y() == this.f4931a;
        }

        public final String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f4931a));
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$t */
    public static abstract class t extends AbstractC2061d {

        /* JADX INFO: renamed from: a */
        int f4931a;

        public t(int i) {
            this.f4931a = i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$u */
    public static final class u extends t {
        public u(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i2.m4878Y() > this.f4931a;
        }

        public final String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f4931a));
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$v */
    public static final class v extends t {
        public v(int i) {
            super(i);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i != c2037i2 && c2037i2.m4878Y() < this.f4931a;
        }

        public final String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f4931a));
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$w */
    public static final class w extends AbstractC2061d {
        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            for (AbstractC2041m abstractC2041m : c2037i2.m4938i()) {
                if (!(abstractC2041m instanceof C2032d) && !(abstractC2041m instanceof C2035g)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return ":empty";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$x */
    public static final class x extends AbstractC2061d {
        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            C2037i c2037iM4890j0 = c2037i2.m4890j0();
            return (c2037iM4890j0 == null || (c2037iM4890j0 instanceof C2034f) || c2037i2.m4878Y() != 0) ? false : true;
        }

        public final String toString() {
            return ":first-child";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$y */
    public static final class y extends E {
        public y() {
            super(0, 1);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d.q
        public final String toString() {
            return ":first-of-type";
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.I.d$z */
    public static final class z extends AbstractC2061d {
        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            C2037i c2037iM4890j0 = c2037i2.m4890j0();
            return (c2037iM4890j0 == null || (c2037iM4890j0 instanceof C2034f) || c2037i2.m4878Y() != c2037iM4890j0.m4876V().size() - 1) ? false : true;
        }

        public final String toString() {
            return ":last-child";
        }
    }

    protected AbstractC2061d() {
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo5178a(C2037i c2037i, C2037i c2037i2);
}
