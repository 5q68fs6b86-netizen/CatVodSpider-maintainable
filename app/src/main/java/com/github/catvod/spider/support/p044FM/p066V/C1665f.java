package com.github.catvod.spider.support.p044FM.p066V;

import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p048D.C1308a;
import com.github.catvod.spider.support.p044FM.p051G.C1347a;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p070Z.C1710e;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p066V.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1665f implements Comparable<C1665f> {

    /* JADX INFO: renamed from: a */
    private Object f3740a;

    /* JADX INFO: renamed from: b */
    private boolean f3741b = false;

    /* JADX INFO: renamed from: c */
    private boolean f3742c = false;

    public C1665f(Object obj) {
        this.f3740a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m3968a() {
        Object obj = this.f3740a;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.valueOf((obj == null || C1305h.m3248b(m3974g())) ? false : true);
    }

    /* JADX INFO: renamed from: b */
    public final Date m3969b() {
        Object obj = this.f3740a;
        if (obj instanceof String) {
            try {
                return C1347a.f3112a.m3334c((String) obj);
            } catch (ParseException unused) {
                StringBuilder sbM3589b = C1434P.m3589b("cast to date fail. vale = ");
                sbM3589b.append(this.f3740a);
                throw new C1710e(sbM3589b.toString());
            }
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        StringBuilder sbM3589b2 = C1434P.m3589b("cast to date fail. vale = ");
        sbM3589b2.append(this.f3740a);
        throw new C1710e(sbM3589b2.toString());
    }

    /* JADX INFO: renamed from: c */
    public final Double m3970c() {
        double dDoubleValue;
        Object obj = this.f3740a;
        if (obj instanceof String) {
            dDoubleValue = new BigDecimal((String) this.f3740a).doubleValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder sbM3589b = C1434P.m3589b("cast to number fail. vale = ");
                sbM3589b.append(this.f3740a);
                throw new C1710e(sbM3589b.toString());
            }
            dDoubleValue = ((Number) obj).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: renamed from: d */
    public final C1551g m3971d() {
        return (C1551g) this.f3740a;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m3972e() {
        return (List) this.f3740a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1665f.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f3740a;
        Object obj3 = ((C1665f) obj).f3740a;
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final Long m3973f() {
        long jLongValue;
        Object obj = this.f3740a;
        if (obj instanceof String) {
            jLongValue = new BigDecimal((String) this.f3740a).setScale(0, 4).longValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder sbM3589b = C1434P.m3589b("cast to number fail. vale = ");
                sbM3589b.append(this.f3740a);
                throw new C1710e(sbM3589b.toString());
            }
            jLongValue = ((Number) obj).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    /* JADX INFO: renamed from: g */
    public final String m3974g() {
        Object obj = this.f3740a;
        if (obj instanceof C1551g) {
            StringBuilder sb = new StringBuilder();
            Iterator<C1393m> it = ((C1551g) this.f3740a).iterator();
            while (it.hasNext()) {
                sb.append(it.next().m3471j0());
            }
            return sb.toString();
        }
        if (obj instanceof C1393m) {
            String strM3483t0 = ((C1393m) obj).m3483t0();
            if (strM3483t0 == "JX_TEXT" || (strM3483t0 != null && strM3483t0.equals("JX_TEXT"))) {
                return ((C1393m) this.f3740a).m3471j0();
            }
        }
        Object obj2 = this.f3740a;
        return obj2 instanceof List ? C1305h.m3251e((List) obj2, ",") : String.valueOf(obj2).trim();
    }

    /* JADX INFO: renamed from: h */
    public final C1665f m3975h() {
        this.f3741b = true;
        return this;
    }

    public final int hashCode() {
        Object obj = this.f3740a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1665f c1665f) {
        if (equals(c1665f)) {
            return 0;
        }
        if (c1665f == null || c1665f.f3740a == null) {
            return 1;
        }
        Object obj = this.f3740a;
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            return m3974g().compareTo(c1665f.m3974g());
        }
        if (obj instanceof Number) {
            return m3970c().compareTo(c1665f.m3970c());
        }
        StringBuilder sbM3589b = C1434P.m3589b("Unsupported comparable XValue = ");
        sbM3589b.append(toString());
        throw new C1710e(sbM3589b.toString());
    }

    /* JADX INFO: renamed from: j */
    public final C1665f m3977j() {
        this.f3742c = true;
        this.f3740a = C1305h.m3252f(C1305h.m3252f(C1305h.m3253g(C1305h.m3253g(String.valueOf(this.f3740a), "'"), "\""), "'"), "\"");
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3978k() {
        return this.f3741b;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3979l() {
        return this.f3740a instanceof Boolean;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3980m() {
        return this.f3740a instanceof Date;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m3981n() {
        return this.f3740a instanceof C1551g;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3982o() {
        return this.f3742c;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m3983p() {
        return this.f3740a instanceof List;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3984q() {
        return this.f3740a instanceof Number;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3985r() {
        return this.f3740a instanceof String;
    }

    /* JADX INFO: renamed from: s */
    public final Class m3986s() {
        Object obj = this.f3740a;
        return obj == null ? Object.class : obj.getClass();
    }

    public final String toString() {
        C1308a c1308a = new C1308a(this);
        c1308a.m3259a(this.f3740a);
        c1308a.m3260b("isAttr", this.f3741b);
        c1308a.m3260b("isExprStr", this.f3742c);
        return c1308a.toString();
    }
}
