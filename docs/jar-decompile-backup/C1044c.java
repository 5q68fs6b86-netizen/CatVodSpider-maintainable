package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p021Z.a;
import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p028d0.C1074D;
import com.github.catvod.spider.support.p012C0.p040x.C1263a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1044c implements Iterable<C1042a>, Cloneable {

    /* JADX INFO: renamed from: c */
    private int f2564c = 0;

    /* JADX INFO: renamed from: d */
    String[] f2565d = new String[3];

    /* JADX INFO: renamed from: e */
    String[] f2566e = new String[3];

    /* JADX INFO: renamed from: g */
    private void m2636g(int i) {
        C0966a.m2371f(i >= this.f2564c);
        String[] strArr = this.f2565d;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f2564c * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f2565d = (String[]) Arrays.copyOf(strArr, i);
        this.f2566e = (String[]) Arrays.copyOf(this.f2566e, i);
    }

    /* JADX INFO: renamed from: p */
    private int m2637p(String str) {
        C0966a.m2376k(str);
        for (int i = 0; i < this.f2564c; i++) {
            if (str.equalsIgnoreCase(this.f2565d[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public boolean m2638q(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m2639v(int i) {
        C0966a.m2370e(i >= this.f2564c);
        int i2 = (this.f2564c - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f2565d;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.f2566e;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.f2564c - 1;
        this.f2564c = i4;
        this.f2565d[i4] = null;
        this.f2566e[i4] = null;
    }

    /* JADX INFO: renamed from: d */
    public final C1044c m2640d(String str, String str2) {
        m2636g(this.f2564c + 1);
        String[] strArr = this.f2565d;
        int i = this.f2564c;
        strArr[i] = str;
        this.f2566e[i] = str2;
        this.f2564c = i + 1;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m2641e(C1044c c1044c) {
        if (c1044c.size() == 0) {
            return;
        }
        m2636g(this.f2564c + c1044c.f2564c);
        int i = 0;
        while (true) {
            if (i >= c1044c.f2564c || !c1044c.m2638q(c1044c.f2565d[i])) {
                if (!(i < c1044c.f2564c)) {
                    return;
                }
                C1042a c1042a = new C1042a(c1044c.f2565d[i], c1044c.f2566e[i], c1044c);
                i++;
                m2652s(c1042a);
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1044c.class != obj.getClass()) {
            return false;
        }
        C1044c c1044c = (C1044c) obj;
        if (this.f2564c == c1044c.f2564c && Arrays.equals(this.f2565d, c1044c.f2565d)) {
            return Arrays.equals(this.f2566e, c1044c.f2566e);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final List<C1042a> m2642f() {
        ArrayList arrayList = new ArrayList(this.f2564c);
        for (int i = 0; i < this.f2564c; i++) {
            if (!m2638q(this.f2565d[i])) {
                arrayList.add(new C1042a(this.f2565d[i], this.f2566e[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C1044c clone() {
        try {
            C1044c c1044c = (C1044c) super.clone();
            c1044c.f2564c = this.f2564c;
            this.f2565d = (String[]) Arrays.copyOf(this.f2565d, this.f2564c);
            this.f2566e = (String[]) Arrays.copyOf(this.f2566e, this.f2564c);
            return c1044c;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return (((this.f2564c * 31) + Arrays.hashCode(this.f2565d)) * 31) + Arrays.hashCode(this.f2566e);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX INFO: renamed from: i */
    public final int m2644i(C1074D c1074d) {
        if (this.f2564c == 0) {
            return 0;
        }
        boolean zM2806d = c1074d.m2806d();
        int i = 0;
        int i2 = 0;
        while (i2 < this.f2565d.length) {
            int i3 = i2 + 1;
            int i4 = i3;
            while (true) {
                Object[] objArr = this.f2565d;
                if (i4 >= objArr.length || objArr[i4] == null) {
                    break;
                }
                if (zM2806d && objArr[i2].equals(objArr[i4])) {
                    i++;
                    m2639v(i4);
                    i4--;
                } else if (!zM2806d) {
                    String[] strArr = this.f2565d;
                    if (strArr[i2].equalsIgnoreCase(strArr[i4])) {
                        i++;
                        m2639v(i4);
                        i4--;
                    }
                }
                i4++;
            }
            i2 = i3;
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f2564c == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<C1042a> iterator() {
        return new C1043b(this);
    }

    /* JADX INFO: renamed from: j */
    public final String m2645j(String str) {
        String str2;
        int iM2650o = m2650o(str);
        return (iM2650o == -1 || (str2 = this.f2566e[iM2650o]) == null) ? "" : str2;
    }

    /* JADX INFO: renamed from: k */
    public final String m2646k(String str) {
        String str2;
        int iM2637p = m2637p(str);
        return (iM2637p == -1 || (str2 = this.f2566e[iM2637p]) == null) ? "" : str2;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2647l(String str) {
        return m2650o(str) != -1;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2648m(String str) {
        return m2637p(str) != -1;
    }

    /* JADX INFO: renamed from: n */
    final void m2649n(Appendable appendable, C1048g c1048g) {
        int i = this.f2564c;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m2638q(this.f2565d[i2])) {
                String str = this.f2565d[i2];
                String str2 = this.f2566e[i2];
                appendable.append(' ').append(str);
                if (!C1042a.m2630c(str, str2, c1048g)) {
                    appendable.append("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1055n.m2737d(appendable, str2, c1048g, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    final int m2650o(String str) {
        C0966a.m2376k(str);
        for (int i = 0; i < this.f2564c; i++) {
            if (str.equals(this.f2565d[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final void m2651r() {
        for (int i = 0; i < this.f2564c; i++) {
            String[] strArr = this.f2565d;
            strArr[i] = C1263a.m3147c(strArr[i]);
        }
    }

    /* JADX INFO: renamed from: s */
    public final C1044c m2652s(C1042a c1042a) {
        m2653t(c1042a.m2631a(), c1042a.m2632b());
        c1042a.f2561e = this;
        return this;
    }

    public final int size() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 >= this.f2564c) {
                return i3;
            }
            i = !m2638q(this.f2565d[i2]) ? i3 + 1 : i3;
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public final C1044c m2653t(String str, String str2) {
        C0966a.m2376k(str);
        int iM2650o = m2650o(str);
        if (iM2650o != -1) {
            this.f2566e[iM2650o] = str2;
        } else {
            m2640d(str, str2);
        }
        return this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.support.p012C0.p021Z.a */
    public final String toString() throws a {
        StringBuilder sbM2595a = C1034b.m2595a();
        try {
            m2649n(sbM2595a, new C1049h().m2673s0());
            return C1034b.m2601g(sbM2595a);
        } catch (IOException e) {
            throw new a(e);
        }
    }

    /* JADX INFO: renamed from: u */
    final void m2654u(String str, String str2) {
        int iM2637p = m2637p(str);
        if (iM2637p == -1) {
            m2640d(str, str2);
            return;
        }
        this.f2566e[iM2637p] = str2;
        if (this.f2565d[iM2637p].equals(str)) {
            return;
        }
        this.f2565d[iM2637p] = str;
    }
}
