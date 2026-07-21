package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p052H.C1373a;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p056L.C1412E;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1383c implements Iterable<C1381a>, Cloneable {

    /* JADX INFO: renamed from: a */
    private int f3186a = 0;

    /* JADX INFO: renamed from: b */
    String[] f3187b = new String[3];

    /* JADX INFO: renamed from: c */
    Object[] f3188c = new Object[3];

    /* JADX INFO: renamed from: f */
    private void m3380f(String str, @Nullable Object obj) {
        m3381h(this.f3186a + 1);
        String[] strArr = this.f3187b;
        int i = this.f3186a;
        strArr[i] = str;
        this.f3188c[i] = obj;
        this.f3186a = i + 1;
    }

    /* JADX INFO: renamed from: h */
    private void m3381h(int i) {
        C1377c.m3356c(i >= this.f3186a);
        String[] strArr = this.f3187b;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f3186a * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f3187b = (String[]) Arrays.copyOf(strArr, i);
        this.f3188c = Arrays.copyOf(this.f3188c, i);
    }

    /* JADX INFO: renamed from: i */
    static String m3382i(@Nullable Object obj) {
        return obj == null ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: r */
    private int m3383r(String str) {
        C1377c.m3360g(str);
        for (int i = 0; i < this.f3186a; i++) {
            if (str.equalsIgnoreCase(this.f3187b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    static String m3384s(String str) {
        return '/' + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public boolean m3385t(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m3386y(int i) {
        C1377c.m3355b(i >= this.f3186a);
        int i2 = (this.f3186a - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f3187b;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.f3188c;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.f3186a - 1;
        this.f3186a = i4;
        this.f3187b[i4] = null;
        this.f3188c[i4] = null;
    }

    /* JADX INFO: renamed from: d */
    public final C1383c m3387d(String str, @Nullable String str2) {
        m3380f(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m3388e(C1383c c1383c) {
        int i = c1383c.f3186a;
        if (i == 0) {
            return;
        }
        m3381h(this.f3186a + i);
        boolean z = this.f3186a != 0;
        int i2 = 0;
        while (true) {
            if (i2 >= c1383c.f3186a || !c1383c.m3385t(c1383c.f3187b[i2])) {
                if (!(i2 < c1383c.f3186a)) {
                    return;
                }
                C1381a c1381a = new C1381a(c1383c.f3187b[i2], (String) c1383c.f3188c[i2], c1383c);
                i2++;
                if (z) {
                    m3399v(c1381a);
                } else {
                    m3380f(c1381a.m3375a(), c1381a.getValue());
                }
            } else {
                i2++;
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1383c.class != obj.getClass()) {
            return false;
        }
        C1383c c1383c = (C1383c) obj;
        if (this.f3186a != c1383c.f3186a) {
            return false;
        }
        for (int i = 0; i < this.f3186a; i++) {
            int iM3397q = c1383c.m3397q(this.f3187b[i]);
            if (iM3397q == -1) {
                return false;
            }
            Object obj2 = this.f3188c[i];
            Object obj3 = c1383c.f3188c[iM3397q];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final List<C1381a> m3389g() {
        ArrayList arrayList = new ArrayList(this.f3186a);
        for (int i = 0; i < this.f3186a; i++) {
            if (!m3385t(this.f3187b[i])) {
                arrayList.add(new C1381a(this.f3187b[i], (String) this.f3188c[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3188c) + (((this.f3186a * 31) + Arrays.hashCode(this.f3187b)) * 31);
    }

    public final boolean isEmpty() {
        return this.f3186a == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<C1381a> iterator() {
        return new C1382b(this);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C1383c clone() {
        try {
            C1383c c1383c = (C1383c) super.clone();
            c1383c.f3186a = this.f3186a;
            c1383c.f3187b = (String[]) Arrays.copyOf(this.f3187b, this.f3186a);
            c1383c.f3188c = Arrays.copyOf(this.f3188c, this.f3186a);
            return c1383c;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX INFO: renamed from: k */
    public final int m3391k(C1412E c1412e) {
        int i = 0;
        if (this.f3186a == 0) {
            return 0;
        }
        boolean zM3542e = c1412e.m3542e();
        int i2 = 0;
        while (i < this.f3187b.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                Object[] objArr = this.f3187b;
                if (i4 >= objArr.length || objArr[i4] == null) {
                    break;
                }
                if (zM3542e && objArr[i].equals(objArr[i4])) {
                    i2++;
                    m3386y(i4);
                    i4--;
                } else if (!zM3542e) {
                    String[] strArr = this.f3187b;
                    if (strArr[i].equalsIgnoreCase(strArr[i4])) {
                        i2++;
                        m3386y(i4);
                        i4--;
                    }
                }
                i4++;
            }
            i = i3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public final String m3392l(String str) {
        int iM3397q = m3397q(str);
        return iM3397q == -1 ? "" : m3382i(this.f3188c[iM3397q]);
    }

    /* JADX INFO: renamed from: m */
    public final String m3393m(String str) {
        int iM3383r = m3383r(str);
        return iM3383r == -1 ? "" : m3382i(this.f3188c[iM3383r]);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m3394n(String str) {
        return m3397q(str) != -1;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3395o(String str) {
        return m3383r(str) != -1;
    }

    /* JADX INFO: renamed from: p */
    final void m3396p(Appendable appendable, C1387g c1387g) {
        String strM3373b;
        int i = this.f3186a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m3385t(this.f3187b[i2]) && (strM3373b = C1381a.m3373b(this.f3187b[i2], c1387g.m3423k())) != null) {
                C1381a.m3374d(strM3373b, (String) this.f3188c[i2], appendable.append(' '), c1387g);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    final int m3397q(String str) {
        C1377c.m3360g(str);
        for (int i = 0; i < this.f3186a; i++) {
            if (str.equals(this.f3187b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int size() {
        return this.f3186a;
    }

    public final String toString() {
        StringBuilder sbM3363b = C1380b.m3363b();
        try {
            m3396p(sbM3363b, new C1388h("").m3424A0());
            return C1380b.m3369h(sbM3363b);
        } catch (IOException e) {
            throw new C1373a(e);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3398u() {
        for (int i = 0; i < this.f3186a; i++) {
            String[] strArr = this.f3187b;
            strArr[i] = C1286l.m3219d(strArr[i]);
        }
    }

    /* JADX INFO: renamed from: v */
    public final C1383c m3399v(C1381a c1381a) {
        m3400w(c1381a.m3375a(), c1381a.getValue());
        c1381a.f3183c = this;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final C1383c m3400w(String str, @Nullable String str2) {
        C1377c.m3360g(str);
        int iM3397q = m3397q(str);
        if (iM3397q != -1) {
            this.f3188c[iM3397q] = str2;
        } else {
            m3380f(str, str2);
        }
        return this;
    }

    /* JADX INFO: renamed from: x */
    final void m3401x(String str, @Nullable String str2) {
        int iM3383r = m3383r(str);
        if (iM3383r == -1) {
            m3380f(str, str2);
            return;
        }
        this.f3188c[iM3383r] = str2;
        if (this.f3187b[iM3383r].equals(str)) {
            return;
        }
        this.f3187b[iM3383r] = str;
    }
}
