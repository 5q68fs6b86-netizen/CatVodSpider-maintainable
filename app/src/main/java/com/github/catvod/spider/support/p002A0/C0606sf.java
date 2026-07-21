package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.sf */
/* JADX INFO: loaded from: classes.dex */
public final class C0606sf {

    /* JADX INFO: renamed from: a */
    public static final abb f1473a = new abb(new C0605se(0));

    /* JADX INFO: renamed from: b */
    public static final abb f1474b = new abb(new C0605se(1));

    /* JADX INFO: renamed from: d */
    public StringReader f1476d;

    /* JADX INFO: renamed from: f */
    public int f1478f;

    /* JADX INFO: renamed from: g */
    public int f1479g;

    /* JADX INFO: renamed from: i */
    public int f1481i;

    /* JADX INFO: renamed from: k */
    public boolean f1483k;

    /* JADX INFO: renamed from: n */
    public String f1486n;

    /* JADX INFO: renamed from: o */
    public int f1487o;

    /* JADX INFO: renamed from: h */
    public int f1480h = 0;

    /* JADX INFO: renamed from: j */
    public int f1482j = -1;

    /* JADX INFO: renamed from: l */
    public ArrayList f1484l = null;

    /* JADX INFO: renamed from: m */
    public int f1485m = 1;

    /* JADX INFO: renamed from: e */
    public char[] f1477e = (char[]) f1474b.m910g();

    /* JADX INFO: renamed from: c */
    public String[] f1475c = (String[]) f1473a.m910g();

    public C0606sf(StringReader stringReader) {
        this.f1476d = stringReader;
        m1677r();
    }

    /* JADX INFO: renamed from: p */
    public static String m1661p(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 + i;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < i3; i6++) {
            i5 = (i5 * 31) + cArr[i6];
        }
        int i7 = i5 & 511;
        String str = strArr[i7];
        if (str != null && i2 == str.length()) {
            int i8 = i;
            int i9 = i2;
            while (true) {
                int i10 = i9 - 1;
                if (i9 == 0) {
                    return str;
                }
                int i11 = i8 + 1;
                int i12 = i4 + 1;
                if (cArr[i8] == str.charAt(i4)) {
                    i8 = i11;
                    i9 = i10;
                    i4 = i12;
                }
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i7] = str2;
        return str2;
    }

    /* JADX INFO: renamed from: aa */
    public final char m1662aa() {
        m1677r();
        int i = this.f1478f;
        if (i >= this.f1479g) {
            return (char) 65535;
        }
        return this.f1477e[i];
    }

    /* JADX INFO: renamed from: ab */
    public final boolean m1663ab() {
        m1677r();
        return this.f1478f >= this.f1479g;
    }

    /* JADX INFO: renamed from: ac */
    public final int m1664ac(int i) {
        ArrayList arrayList = this.f1484l;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    /* JADX INFO: renamed from: ad */
    public final boolean m1665ad(String str) {
        m1677r();
        m1677r();
        int length = str.length();
        if (length <= this.f1479g - this.f1478f) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f1477e[this.f1478f + i]) {
                }
            }
            this.f1478f = str.length() + this.f1478f;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ae */
    public final boolean m1666ae(String str) {
        m1677r();
        int length = str.length();
        if (length <= this.f1479g - this.f1478f) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f1477e[this.f1478f + i])) {
                }
            }
            this.f1478f = str.length() + this.f1478f;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: af */
    public final boolean m1667af(char c) {
        return !m1663ab() && this.f1477e[this.f1478f] == c;
    }

    /* JADX INFO: renamed from: ag */
    public final boolean m1668ag(char... cArr) {
        if (m1663ab()) {
            return false;
        }
        m1677r();
        char c = this.f1477e[this.f1478f];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ah */
    public final boolean m1669ah() {
        if (m1663ab()) {
            return false;
        }
        char c = this.f1477e[this.f1478f];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    /* JADX INFO: renamed from: ai */
    public final boolean m1670ai() {
        if (m1663ab()) {
            return false;
        }
        char c = this.f1477e[this.f1478f];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* JADX INFO: renamed from: aj */
    public final int m1671aj(String str) {
        m1677r();
        char cCharAt = str.charAt(0);
        int i = this.f1478f;
        while (i < this.f1479g) {
            if (cCharAt != this.f1477e[i]) {
                do {
                    i++;
                    if (i >= this.f1479g) {
                        break;
                    }
                } while (cCharAt != this.f1477e[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f1479g;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.f1477e[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f1478f;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ak */
    public final int m1672ak() {
        return this.f1481i + this.f1478f;
    }

    /* JADX INFO: renamed from: al */
    public final String m1673al() {
        int iM1664ac;
        StringBuilder sb = new StringBuilder();
        int iM1672ak = m1672ak();
        int i = 1;
        if (this.f1484l != null) {
            int iM1664ac2 = m1664ac(iM1672ak);
            i = iM1664ac2 == -1 ? this.f1485m : 1 + iM1664ac2 + this.f1485m;
        }
        sb.append(i);
        sb.append(":");
        int iM1672ak2 = m1672ak();
        if ((this.f1484l != null) && (iM1664ac = m1664ac(iM1672ak2)) != -1) {
            iM1672ak2 -= ((Integer) this.f1484l.get(iM1664ac)).intValue();
        }
        sb.append(iM1672ak2 + 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: am */
    public final void m1674am() {
        int i = this.f1482j;
        if (i == -1) {
            throw new adk(new IOException("Mark invalid"));
        }
        this.f1478f = i;
        this.f1482j = -1;
    }

    /* JADX INFO: renamed from: an */
    public final void m1675an() {
        int i = this.f1478f;
        if (i < 1) {
            throw new adk(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f1478f = i - 1;
    }

    /* JADX INFO: renamed from: q */
    public final void m1676q() {
        this.f1478f++;
    }

    /* JADX INFO: renamed from: r */
    public final void m1677r() {
        int i;
        if (this.f1483k || (i = this.f1478f) < this.f1480h || this.f1482j != -1) {
            return;
        }
        this.f1481i += i;
        int i2 = this.f1479g - i;
        this.f1479g = i2;
        if (i2 > 0) {
            char[] cArr = this.f1477e;
            System.arraycopy(cArr, i, cArr, 0, i2);
        }
        this.f1478f = 0;
        while (true) {
            int i3 = this.f1479g;
            if (i3 >= 2048) {
                break;
            }
            try {
                StringReader stringReader = this.f1476d;
                char[] cArr2 = this.f1477e;
                int i4 = stringReader.read(cArr2, i3, cArr2.length - i3);
                if (i4 == -1) {
                    this.f1483k = true;
                    break;
                }
                this.f1479g += i4;
            } catch (IOException e) {
                throw new adk(e);
            }
        }
        this.f1480h = Math.min(this.f1479g, 1024);
        ArrayList arrayList = this.f1484l;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int iM1664ac = m1664ac(this.f1481i);
                if (iM1664ac == -1) {
                    iM1664ac = 0;
                }
                Integer num = (Integer) this.f1484l.get(iM1664ac);
                num.getClass();
                this.f1485m += iM1664ac;
                this.f1484l.clear();
                this.f1484l.add(num);
            }
            for (int i5 = this.f1478f; i5 < this.f1479g; i5++) {
                if (this.f1477e[i5] == '\n') {
                    this.f1484l.add(Integer.valueOf(this.f1481i + 1 + i5));
                }
            }
        }
        this.f1486n = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m1678s() {
        abb abbVar = f1473a;
        abb abbVar2 = f1474b;
        StringReader stringReader = this.f1476d;
        if (stringReader == null) {
            return;
        }
        try {
            stringReader.close();
            this.f1476d = null;
            Arrays.fill(this.f1477e, (char) 0);
            abbVar2.m912i(this.f1477e);
            this.f1477e = null;
            abbVar.m912i(this.f1475c);
        } catch (IOException unused) {
            this.f1476d = null;
            Arrays.fill(this.f1477e, (char) 0);
            abbVar2.m912i(this.f1477e);
            this.f1477e = null;
            abbVar.m912i(this.f1475c);
        } finally {
            this.f1476d = null;
            Arrays.fill(this.f1477e, (char) 0);
            abbVar2.m912i(this.f1477e);
            this.f1477e = null;
            abbVar.m912i(this.f1475c);
            this.f1475c = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final char m1679t() {
        m1677r();
        int i = this.f1478f;
        char c = i >= this.f1479g ? (char) 65535 : this.f1477e[i];
        this.f1478f = i + 1;
        return c;
    }

    public final String toString() {
        int i = this.f1479g;
        int i2 = this.f1478f;
        return i - i2 < 0 ? "" : new String(this.f1477e, i2, i - i2);
    }

    /* JADX INFO: renamed from: u */
    public final String m1680u(boolean z) {
        int i = this.f1478f;
        int i2 = this.f1479g;
        char[] cArr = this.f1477e;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&' || (c == '\'' && z)) {
                    break;
                }
                i3++;
            } else {
                if (!z) {
                    break;
                }
                i3++;
            }
        }
        this.f1478f = i3;
        return i3 > i ? m1661p(this.f1477e, this.f1475c, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: v */
    public final String m1681v() {
        int i = this.f1478f;
        int i2 = this.f1479g;
        char[] cArr = this.f1477e;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f1478f = i3;
        return i3 > i ? m1661p(this.f1477e, this.f1475c, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: w */
    public final String m1682w() {
        char c;
        m1677r();
        int i = this.f1478f;
        while (true) {
            int i2 = this.f1478f;
            if (i2 >= this.f1479g || (((c = this.f1477e[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f1478f++;
        }
        return m1661p(this.f1477e, this.f1475c, i, this.f1478f - i);
    }

    /* JADX INFO: renamed from: x */
    public final String m1683x(char c) {
        int i;
        m1677r();
        int i2 = this.f1478f;
        while (true) {
            if (i2 >= this.f1479g) {
                i = -1;
                break;
            }
            if (c == this.f1477e[i2]) {
                i = i2 - this.f1478f;
                break;
            }
            i2++;
        }
        if (i != -1) {
            String strM1661p = m1661p(this.f1477e, this.f1475c, this.f1478f, i);
            this.f1478f += i;
            return strM1661p;
        }
        m1677r();
        char[] cArr = this.f1477e;
        String[] strArr = this.f1475c;
        int i3 = this.f1478f;
        String strM1661p2 = m1661p(cArr, strArr, i3, this.f1479g - i3);
        this.f1478f = this.f1479g;
        return strM1661p2;
    }

    /* JADX INFO: renamed from: y */
    public final String m1684y(char... cArr) {
        m1677r();
        int i = this.f1478f;
        int i2 = this.f1479g;
        char[] cArr2 = this.f1477e;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f1478f = i3;
        return i3 > i ? m1661p(this.f1477e, this.f1475c, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: z */
    public final String m1685z(char... cArr) {
        m1677r();
        int i = this.f1478f;
        int i2 = this.f1479g;
        char[] cArr2 = this.f1477e;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f1478f = i3;
        return i3 > i ? m1661p(this.f1477e, this.f1475c, i, i3 - i) : "";
    }
}
