package com.github.catvod.spider.support.p101G;

import com.github.catvod.spider.support.p041D.C1267b;
import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p043F.C1274b;
import com.github.catvod.spider.support.p102H.C2050f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p101G.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2030b implements Iterable<C2029a>, Cloneable {

    /* JADX INFO: renamed from: a */
    private int f4610a = 0;

    /* JADX INFO: renamed from: b */
    String[] f4611b = new String[3];

    /* JADX INFO: renamed from: c */
    Object[] f4612c = new Object[3];

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p101G.b$a */
    final class a implements Iterator<C2029a> {

        /* JADX INFO: renamed from: a */
        int f4613a = 0;

        a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (this.f4613a < C2030b.this.f4610a) {
                C2030b c2030b = C2030b.this;
                if (!c2030b.m4812t(c2030b.f4611b[this.f4613a])) {
                    break;
                }
                this.f4613a++;
            }
            return this.f4613a < C2030b.this.f4610a;
        }

        @Override // java.util.Iterator
        public final C2029a next() {
            C2030b c2030b = C2030b.this;
            String[] strArr = c2030b.f4611b;
            int i = this.f4613a;
            C2029a c2029a = new C2029a(strArr[i], (String) c2030b.f4612c[i], c2030b);
            this.f4613a++;
            return c2029a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C2030b c2030b = C2030b.this;
            int i = this.f4613a - 1;
            this.f4613a = i;
            c2030b.m4813y(i);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m4807f(String str, @Nullable Object obj) {
        m4808h(this.f4610a + 1);
        String[] strArr = this.f4611b;
        int i = this.f4610a;
        strArr[i] = str;
        this.f4612c[i] = obj;
        this.f4610a = i + 1;
    }

    /* JADX INFO: renamed from: h */
    private void m4808h(int i) {
        C1271c.m3153c(i >= this.f4610a);
        String[] strArr = this.f4611b;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f4610a * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f4611b = (String[]) Arrays.copyOf(strArr, i);
        this.f4612c = Arrays.copyOf(this.f4612c, i);
    }

    /* JADX INFO: renamed from: i */
    static String m4809i(@Nullable Object obj) {
        return obj == null ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: r */
    private int m4810r(String str) {
        C1271c.m3157g(str);
        for (int i = 0; i < this.f4610a; i++) {
            if (str.equalsIgnoreCase(this.f4611b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    static String m4811s(String str) {
        return '/' + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public boolean m4812t(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m4813y(int i) {
        C1271c.m3152b(i >= this.f4610a);
        int i2 = (this.f4610a - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f4611b;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.f4612c;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.f4610a - 1;
        this.f4610a = i4;
        this.f4611b[i4] = null;
        this.f4612c[i4] = null;
    }

    /* JADX INFO: renamed from: d */
    public final C2030b m4814d(String str, @Nullable String str2) {
        m4807f(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m4815e(C2030b c2030b) {
        int i = c2030b.f4610a;
        if (i == 0) {
            return;
        }
        m4808h(this.f4610a + i);
        boolean z = this.f4610a != 0;
        int i2 = 0;
        while (true) {
            if (i2 >= c2030b.f4610a || !c2030b.m4812t(c2030b.f4611b[i2])) {
                if (!(i2 < c2030b.f4610a)) {
                    return;
                }
                C2029a c2029a = new C2029a(c2030b.f4611b[i2], (String) c2030b.f4612c[i2], c2030b);
                i2++;
                if (z) {
                    m4826v(c2029a);
                } else {
                    m4807f(c2029a.m4802a(), c2029a.getValue());
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
        if (obj == null || C2030b.class != obj.getClass()) {
            return false;
        }
        C2030b c2030b = (C2030b) obj;
        if (this.f4610a != c2030b.f4610a) {
            return false;
        }
        for (int i = 0; i < this.f4610a; i++) {
            int iM4824q = c2030b.m4824q(this.f4611b[i]);
            if (iM4824q == -1) {
                return false;
            }
            Object obj2 = this.f4612c[i];
            Object obj3 = c2030b.f4612c[iM4824q];
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
    public final List<C2029a> m4816g() {
        ArrayList arrayList = new ArrayList(this.f4610a);
        for (int i = 0; i < this.f4610a; i++) {
            if (!m4812t(this.f4611b[i])) {
                arrayList.add(new C2029a(this.f4611b[i], (String) this.f4612c[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4612c) + (((this.f4610a * 31) + Arrays.hashCode(this.f4611b)) * 31);
    }

    public final boolean isEmpty() {
        return this.f4610a == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<C2029a> iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C2030b clone() {
        try {
            C2030b c2030b = (C2030b) super.clone();
            c2030b.f4610a = this.f4610a;
            c2030b.f4611b = (String[]) Arrays.copyOf(this.f4611b, this.f4610a);
            c2030b.f4612c = Arrays.copyOf(this.f4612c, this.f4610a);
            return c2030b;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX INFO: renamed from: k */
    public final int m4818k(C2050f c2050f) {
        int i = 0;
        if (this.f4610a == 0) {
            return 0;
        }
        boolean zM5072e = c2050f.m5072e();
        int i2 = 0;
        while (i < this.f4611b.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                Object[] objArr = this.f4611b;
                if (i4 >= objArr.length || objArr[i4] == null) {
                    break;
                }
                if (zM5072e && objArr[i].equals(objArr[i4])) {
                    i2++;
                    m4813y(i4);
                    i4--;
                } else if (!zM5072e) {
                    String[] strArr = this.f4611b;
                    if (strArr[i].equalsIgnoreCase(strArr[i4])) {
                        i2++;
                        m4813y(i4);
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
    public final String m4819l(String str) {
        int iM4824q = m4824q(str);
        return iM4824q == -1 ? "" : m4809i(this.f4612c[iM4824q]);
    }

    /* JADX INFO: renamed from: m */
    public final String m4820m(String str) {
        int iM4810r = m4810r(str);
        return iM4810r == -1 ? "" : m4809i(this.f4612c[iM4810r]);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4821n(String str) {
        return m4824q(str) != -1;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4822o(String str) {
        return m4810r(str) != -1;
    }

    /* JADX INFO: renamed from: p */
    final void m4823p(Appendable appendable, C2034f.a aVar) {
        String strM4800b;
        int i = this.f4610a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m4812t(this.f4611b[i2]) && (strM4800b = C2029a.m4800b(this.f4611b[i2], aVar.m4855h())) != null) {
                C2029a.m4801d(strM4800b, (String) this.f4612c[i2], appendable.append(' '), aVar);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    final int m4824q(String str) {
        C1271c.m3157g(str);
        for (int i = 0; i < this.f4610a; i++) {
            if (str.equals(this.f4611b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int size() {
        return this.f4610a;
    }

    public final String toString() {
        StringBuilder sbM3171b = C1274b.m3171b();
        try {
            m4823p(sbM3171b, new C2034f("").m4846y0());
            return C1274b.m3177h(sbM3171b);
        } catch (IOException e) {
            throw new C1267b(e);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m4825u() {
        for (int i = 0; i < this.f4610a; i++) {
            String[] strArr = this.f4611b;
            strArr[i] = C1273a.m3165e(strArr[i]);
        }
    }

    /* JADX INFO: renamed from: v */
    public final C2030b m4826v(C2029a c2029a) {
        m4827w(c2029a.m4802a(), c2029a.getValue());
        c2029a.f4609c = this;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final C2030b m4827w(String str, @Nullable String str2) {
        C1271c.m3157g(str);
        int iM4824q = m4824q(str);
        if (iM4824q != -1) {
            this.f4612c[iM4824q] = str2;
        } else {
            m4807f(str, str2);
        }
        return this;
    }

    /* JADX INFO: renamed from: x */
    final void m4828x(String str, @Nullable String str2) {
        int iM4810r = m4810r(str);
        if (iM4810r == -1) {
            m4807f(str, str2);
            return;
        }
        this.f4612c[iM4810r] = str2;
        if (this.f4611b[iM4810r].equals(str)) {
            return;
        }
        this.f4611b[iM4810r] = str;
    }
}
