package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.wg */
/* JADX INFO: loaded from: classes.dex */
public final class C0715wg extends AbstractC0342il {

    /* JADX INFO: renamed from: f */
    public final Serializable f1724f;

    public C0715wg(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f1724f = bool;
    }

    public C0715wg(Number number) {
        Objects.requireNonNull(number);
        this.f1724f = number;
    }

    public C0715wg(String str) {
        Objects.requireNonNull(str);
        this.f1724f = str;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1780g(C0715wg c0715wg) {
        Serializable serializable = c0715wg.f1724f;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0342il
    /* JADX INFO: renamed from: a */
    public final double mo1317a() {
        return this.f1724f instanceof Number ? m1783j().doubleValue() : Double.parseDouble(mo1321e());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0342il
    /* JADX INFO: renamed from: b */
    public final int mo1318b() {
        return this.f1724f instanceof Number ? m1783j().intValue() : Integer.parseInt(mo1321e());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0342il
    /* JADX INFO: renamed from: d */
    public final long mo1320d() {
        return this.f1724f instanceof Number ? m1783j().longValue() : Long.parseLong(mo1321e());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0342il
    /* JADX INFO: renamed from: e */
    public final String mo1321e() {
        Serializable serializable = this.f1724f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m1783j().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0715wg.class != obj.getClass()) {
            return false;
        }
        C0715wg c0715wg = (C0715wg) obj;
        Serializable serializable = this.f1724f;
        Serializable serializable2 = c0715wg.f1724f;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (m1780g(this) && m1780g(c0715wg)) {
            if ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) {
                return m1781h().equals(c0715wg.m1781h());
            }
            return m1783j().longValue() == c0715wg.m1783j().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC0611sk.m1687d(mo1321e())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC0611sk.m1687d(c0715wg.mo1321e())) == 0;
        }
        double dMo1317a = mo1317a();
        double dMo1317a2 = c0715wg.mo1317a();
        if (dMo1317a != dMo1317a2) {
            return Double.isNaN(dMo1317a) && Double.isNaN(dMo1317a2);
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final BigInteger m1781h() {
        Serializable serializable = this.f1724f;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m1780g(this)) {
            return BigInteger.valueOf(m1783j().longValue());
        }
        String strMo1321e = mo1321e();
        AbstractC0611sk.m1686c(strMo1321e);
        return new BigInteger(strMo1321e);
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f1724f;
        if (serializable == null) {
            return 31;
        }
        if (m1780g(this)) {
            jDoubleToLongBits = m1783j().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m1783j().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1782i() {
        Serializable serializable = this.f1724f;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(mo1321e());
    }

    /* JADX INFO: renamed from: j */
    public final Number m1783j() {
        Serializable serializable = this.f1724f;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C0484ns((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }
}
