package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.as */
/* JADX INFO: loaded from: classes.dex */
public final class C0133as implements Comparable {

    /* JADX INFO: renamed from: a */
    public Serializable f673a;

    /* JADX INFO: renamed from: b */
    public boolean f674b;

    /* JADX INFO: renamed from: c */
    public boolean f675c;

    /* JADX INFO: renamed from: d */
    public static C0133as m1010d(Serializable serializable) {
        C0133as c0133as = new C0133as();
        c0133as.f674b = false;
        c0133as.f675c = false;
        c0133as.f673a = serializable;
        return c0133as;
    }

    /* JADX INFO: renamed from: e */
    public final Boolean m1011e() {
        Serializable serializable = this.f673a;
        if (serializable instanceof Boolean) {
            return (Boolean) serializable;
        }
        return Boolean.valueOf((serializable == null || AbstractC0273fx.m1237c(m1015i())) ? false : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0133as.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f673a, ((C0133as) obj).f673a);
    }

    /* JADX INFO: renamed from: f */
    public final Date m1012f() {
        Serializable serializable = this.f673a;
        if (serializable instanceof String) {
            try {
                return aca.f548a.m1420e((String) serializable);
            } catch (ParseException unused) {
                throw new C0649tv("cast to date fail. vale = " + this.f673a);
            }
        }
        if (serializable instanceof Date) {
            return (Date) serializable;
        }
        throw new C0649tv("cast to date fail. vale = " + this.f673a);
    }

    /* JADX INFO: renamed from: g */
    public final Double m1013g() {
        Serializable serializable = this.f673a;
        if (serializable instanceof String) {
            return Double.valueOf(new BigDecimal((String) this.f673a).doubleValue());
        }
        if (serializable instanceof Number) {
            return Double.valueOf(((Number) serializable).doubleValue());
        }
        throw new C0649tv("cast to number fail. vale = " + this.f673a);
    }

    /* JADX INFO: renamed from: h */
    public final Long m1014h() {
        Serializable serializable = this.f673a;
        if (serializable instanceof String) {
            return Long.valueOf(new BigDecimal((String) this.f673a).setScale(0, 4).longValue());
        }
        if (serializable instanceof Number) {
            return Long.valueOf(((Number) serializable).longValue());
        }
        throw new C0649tv("cast to number fail. vale = " + this.f673a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f673a);
    }

    /* JADX INFO: renamed from: i */
    public final String m1015i() {
        Object obj = this.f673a;
        if (obj instanceof C0589rp) {
            StringBuilder sb = new StringBuilder();
            Iterator<E> it = ((C0589rp) this.f673a).iterator();
            while (it.hasNext()) {
                sb.append(((C0226ed) it.next()).m1165ag());
            }
            return sb.toString();
        }
        if ((obj instanceof C0226ed) && Objects.equals(((C0226ed) obj).f771g.f589b, "JX_TEXT")) {
            return ((C0226ed) this.f673a).m1165ag();
        }
        Serializable serializable = this.f673a;
        return serializable instanceof List ? AbstractC0273fx.m1239e((List) serializable, ",") : String.valueOf(serializable).trim();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0133as c0133as) {
        if (equals(c0133as)) {
            return 0;
        }
        if (c0133as == null || c0133as.f673a == null) {
            return 1;
        }
        Serializable serializable = this.f673a;
        if (serializable == null) {
            return -1;
        }
        if (serializable instanceof String) {
            return m1015i().compareTo(c0133as.m1015i());
        }
        if (serializable instanceof Number) {
            return m1013g().compareTo(c0133as.m1013g());
        }
        throw new C0649tv("Unsupported comparable XValue = " + toString());
    }

    /* JADX INFO: renamed from: k */
    public final void m1017k() {
        this.f675c = true;
        String strValueOf = String.valueOf(this.f673a);
        if (!AbstractC0273fx.m1238d(strValueOf) && !AbstractC0273fx.m1238d("'") && strValueOf.startsWith("'")) {
            strValueOf = strValueOf.substring(1);
        }
        if (!AbstractC0273fx.m1238d(strValueOf) && !AbstractC0273fx.m1238d("\"") && strValueOf.startsWith("\"")) {
            strValueOf = strValueOf.substring(1);
        }
        this.f673a = AbstractC0273fx.m1240f(AbstractC0273fx.m1240f(strValueOf, "'"), "\"");
    }

    public final String toString() {
        C0794ze c0794ze = new C0794ze(this);
        Serializable serializable = this.f673a;
        StringBuffer stringBuffer = c0794ze.f1871b;
        C0429lr c0429lr = c0794ze.f1873d;
        c0429lr.m1414y(stringBuffer, "value");
        if (serializable == null) {
            stringBuffer.append(c0429lr.f1182n);
        } else {
            c0429lr.m1409aa(stringBuffer, "value", serializable, true);
        }
        stringBuffer.append(c0429lr.f1179k);
        boolean z = this.f674b;
        c0429lr.m1414y(stringBuffer, "isAttr");
        stringBuffer.append(z);
        stringBuffer.append(c0429lr.f1179k);
        boolean z2 = this.f675c;
        c0429lr.m1414y(stringBuffer, "isExprStr");
        stringBuffer.append(z2);
        stringBuffer.append(c0429lr.f1179k);
        return c0794ze.toString();
    }
}
