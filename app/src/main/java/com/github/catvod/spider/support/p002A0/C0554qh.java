package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.qh */
/* JADX INFO: loaded from: classes.dex */
public final class C0554qh implements Iterable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f1405a = 0;

    /* JADX INFO: renamed from: b */
    public String[] f1406b = new String[3];

    /* JADX INFO: renamed from: c */
    public Object[] f1407c = new Object[3];

    /* JADX INFO: renamed from: d */
    public static boolean m1584d(String str) {
        return str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: renamed from: e */
    public final void m1585e(String str, Serializable serializable) {
        m1586f(this.f1405a + 1);
        String[] strArr = this.f1406b;
        int i = this.f1405a;
        strArr[i] = str;
        this.f1407c[i] = serializable;
        this.f1405a = i + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0554qh.class != obj.getClass()) {
            return false;
        }
        C0554qh c0554qh = (C0554qh) obj;
        if (this.f1405a != c0554qh.f1405a) {
            return false;
        }
        for (int i = 0; i < this.f1405a; i++) {
            int iM1592l = c0554qh.m1592l(this.f1406b[i]);
            if (iM1592l == -1 || !Objects.equals(this.f1407c[i], c0554qh.f1407c[iM1592l])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m1586f(int i) {
        AbstractC0711wc.m1766a(i >= this.f1405a);
        String[] strArr = this.f1406b;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f1405a * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f1406b = (String[]) Arrays.copyOf(strArr, i);
        this.f1407c = Arrays.copyOf(this.f1407c, i);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C0554qh clone() {
        try {
            C0554qh c0554qh = (C0554qh) super.clone();
            c0554qh.f1405a = this.f1405a;
            c0554qh.f1406b = (String[]) Arrays.copyOf(this.f1406b, this.f1405a);
            c0554qh.f1407c = Arrays.copyOf(this.f1407c, this.f1405a);
            return c0554qh;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m1588h(String str) {
        Object obj;
        int iM1592l = m1592l(str);
        return (iM1592l == -1 || (obj = this.f1407c[iM1592l]) == null) ? "" : (String) obj;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1407c) + (((this.f1405a * 31) + Arrays.hashCode(this.f1406b)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m1589i(String str) {
        Object obj;
        int iM1593m = m1593m(str);
        return (iM1593m == -1 || (obj = this.f1407c[iM1593m]) == null) ? "" : (String) obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0553qg(this);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1590j(String str) {
        return m1592l(str) != -1;
    }

    /* JADX INFO: renamed from: k */
    public final void m1591k(StringBuilder sb, C0674ut c0674ut) {
        String strM1577g;
        int i = this.f1405a;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.f1406b[i2];
            if (!m1584d(str) && (strM1577g = C0551qe.m1577g(str, c0674ut.f1585f)) != null) {
                C0551qe.m1578h(strM1577g, (String) this.f1407c[i2], sb.append(' '), c0674ut);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m1592l(String str) {
        AbstractC0711wc.m1770e(str);
        for (int i = 0; i < this.f1405a; i++) {
            if (str.equals(this.f1406b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final int m1593m(String str) {
        AbstractC0711wc.m1770e(str);
        for (int i = 0; i < this.f1405a; i++) {
            if (str.equalsIgnoreCase(this.f1406b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public final void m1594n(String str, String str2) {
        AbstractC0711wc.m1770e(str);
        int iM1592l = m1592l(str);
        if (iM1592l != -1) {
            this.f1407c[iM1592l] = str2;
        } else {
            m1585e(str, str2);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1595o(int i) {
        int i2 = this.f1405a;
        if (i >= i2) {
            throw new C0283gg("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.f1406b;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.f1407c;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.f1405a - 1;
        this.f1405a = i5;
        this.f1406b[i5] = null;
        this.f1407c[i5] = null;
    }

    public final String toString() {
        StringBuilder sbM1845g = AbstractC0727ws.m1845g();
        try {
            m1591k(sbM1845g, new C0235em().f783a);
            return AbstractC0727ws.m1852n(sbM1845g);
        } catch (IOException e) {
            throw new C0649tv(e);
        }
    }
}
