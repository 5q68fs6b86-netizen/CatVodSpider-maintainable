package com.github.catvod.spider.support.p106L;

import com.github.catvod.spider.support.p011C.C0958a;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p110P.C2122e;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p139y.C2423f;
import com.github.catvod.spider.support.p140z.C2426a;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p106L.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2078f implements Comparable<C2078f> {

    /* JADX INFO: renamed from: a */
    private Object f4967a;

    /* JADX INFO: renamed from: b */
    private boolean f4968b = false;

    /* JADX INFO: renamed from: c */
    private boolean f4969c = false;

    public C2078f(Object obj) {
        this.f4967a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m5337a() {
        Object obj = this.f4967a;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.valueOf((obj == null || C2423f.m6438b(m5343g())) ? false : true);
    }

    /* JADX INFO: renamed from: b */
    public final Date m5338b() {
        Object obj = this.f4967a;
        if (obj instanceof String) {
            try {
                return C0958a.f2258a.m2334c((String) obj);
            } catch (ParseException unused) {
                StringBuilder sbM5396a = C2137a.m5396a("cast to date fail. vale = ");
                sbM5396a.append(this.f4967a);
                throw new C2122e(sbM5396a.toString());
            }
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        StringBuilder sbM5396a2 = C2137a.m5396a("cast to date fail. vale = ");
        sbM5396a2.append(this.f4967a);
        throw new C2122e(sbM5396a2.toString());
    }

    /* JADX INFO: renamed from: c */
    public final Double m5339c() {
        double dDoubleValue;
        Object obj = this.f4967a;
        if (obj instanceof String) {
            dDoubleValue = new BigDecimal((String) this.f4967a).doubleValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder sbM5396a = C2137a.m5396a("cast to number fail. vale = ");
                sbM5396a.append(this.f4967a);
                throw new C2122e(sbM5396a.toString());
            }
            dDoubleValue = ((Number) obj).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: renamed from: d */
    public final C2060c m5340d() {
        return (C2060c) this.f4967a;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m5341e() {
        return (List) this.f4967a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2078f.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f4967a;
        Object obj3 = ((C2078f) obj).f4967a;
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final Long m5342f() {
        long jLongValue;
        Object obj = this.f4967a;
        if (obj instanceof String) {
            jLongValue = new BigDecimal((String) this.f4967a).setScale(0, 4).longValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder sbM5396a = C2137a.m5396a("cast to number fail. vale = ");
                sbM5396a.append(this.f4967a);
                throw new C2122e(sbM5396a.toString());
            }
            jLongValue = ((Number) obj).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    /* JADX INFO: renamed from: g */
    public final String m5343g() {
        Object obj = this.f4967a;
        if (obj instanceof C2060c) {
            StringBuilder sb = new StringBuilder();
            Iterator<C2037i> it = ((C2060c) this.f4967a).iterator();
            while (it.hasNext()) {
                sb.append(it.next().m4889i0());
            }
            return sb.toString();
        }
        if (obj instanceof C2037i) {
            String strM4901r0 = ((C2037i) obj).m4901r0();
            if (strM4901r0 == "JX_TEXT" || (strM4901r0 != null && strM4901r0.equals("JX_TEXT"))) {
                return ((C2037i) this.f4967a).m4889i0();
            }
        }
        Object obj2 = this.f4967a;
        return obj2 instanceof List ? C2423f.m6441e((List) obj2, ",") : String.valueOf(obj2).trim();
    }

    /* JADX INFO: renamed from: h */
    public final C2078f m5344h() {
        this.f4968b = true;
        return this;
    }

    public final int hashCode() {
        Object obj = this.f4967a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2078f c2078f) {
        if (equals(c2078f)) {
            return 0;
        }
        if (c2078f == null || c2078f.f4967a == null) {
            return 1;
        }
        Object obj = this.f4967a;
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            return m5343g().compareTo(c2078f.m5343g());
        }
        if (obj instanceof Number) {
            return m5339c().compareTo(c2078f.m5339c());
        }
        StringBuilder sbM5396a = C2137a.m5396a("Unsupported comparable XValue = ");
        sbM5396a.append(toString());
        throw new C2122e(sbM5396a.toString());
    }

    /* JADX INFO: renamed from: j */
    public final C2078f m5346j() {
        this.f4969c = true;
        this.f4967a = C2423f.m6442f(C2423f.m6442f(C2423f.m6443g(C2423f.m6443g(String.valueOf(this.f4967a), "'"), "\""), "'"), "\"");
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5347k() {
        return this.f4968b;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m5348l() {
        return this.f4967a instanceof Boolean;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m5349m() {
        return this.f4967a instanceof Date;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m5350n() {
        return this.f4967a instanceof C2060c;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5351o() {
        return this.f4969c;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5352p() {
        return this.f4967a instanceof List;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5353q() {
        return this.f4967a instanceof Number;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5354r() {
        return this.f4967a instanceof String;
    }

    /* JADX INFO: renamed from: s */
    public final Class m5355s() {
        Object obj = this.f4967a;
        return obj == null ? Object.class : obj.getClass();
    }

    public final String toString() {
        C2426a c2426a = new C2426a(this);
        c2426a.m6450a(this.f4967a);
        c2426a.m6451b("isAttr", this.f4968b);
        c2426a.m6451b("isExprStr", this.f4969c);
        return c2426a.toString();
    }
}
