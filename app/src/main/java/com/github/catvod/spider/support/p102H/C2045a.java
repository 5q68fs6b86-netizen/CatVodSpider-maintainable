package com.github.catvod.spider.support.p102H;

import com.github.catvod.spider.support.p041D.C1268c;
import com.github.catvod.spider.support.p042E.C1271c;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2045a {

    /* JADX INFO: renamed from: a */
    private char[] f4652a;

    /* JADX INFO: renamed from: b */
    private Reader f4653b;

    /* JADX INFO: renamed from: c */
    private int f4654c;

    /* JADX INFO: renamed from: d */
    private int f4655d;

    /* JADX INFO: renamed from: e */
    private int f4656e;

    /* JADX INFO: renamed from: f */
    private int f4657f;

    /* JADX INFO: renamed from: g */
    private int f4658g = -1;

    /* JADX INFO: renamed from: h */
    private String[] f4659h = new String[512];

    /* JADX INFO: renamed from: i */
    @Nullable
    private ArrayList<Integer> f4660i = null;

    /* JADX INFO: renamed from: j */
    private int f4661j = 1;

    /* JADX INFO: renamed from: k */
    private boolean f4662k;

    /* JADX INFO: renamed from: l */
    @Nullable
    private String f4663l;

    /* JADX INFO: renamed from: m */
    private int f4664m;

    public C2045a(Reader reader, int i) {
        C1271c.m3153c(reader.markSupported());
        this.f4653b = reader;
        this.f4652a = new char[Math.min(i, 32768)];
        m4950b();
    }

    /* JADX INFO: renamed from: N */
    private void m4949N() {
        if (m4991y()) {
            if (this.f4660i.size() > 0) {
                int iM4953z = m4953z(this.f4657f);
                if (iM4953z == -1) {
                    iM4953z = 0;
                }
                int iIntValue = this.f4660i.get(iM4953z).intValue();
                this.f4661j += iM4953z;
                this.f4660i.clear();
                this.f4660i.add(Integer.valueOf(iIntValue));
            }
            for (int i = this.f4656e; i < this.f4654c; i++) {
                if (this.f4652a[i] == '\n') {
                    this.f4660i.add(Integer.valueOf(this.f4657f + 1 + i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4950b() {
        int i;
        int i2;
        boolean z;
        if (this.f4662k || (i = this.f4656e) < this.f4655d) {
            return;
        }
        int i3 = this.f4658g;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.f4653b.skip(j);
            this.f4653b.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.f4653b;
                char[] cArr = this.f4652a;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.f4662k = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.f4653b.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                C1271c.m3153c(z);
                this.f4654c = i4;
                this.f4657f += i;
                this.f4656e = i2;
                if (this.f4658g != -1) {
                    this.f4658g = 0;
                }
                this.f4655d = Math.min(i4, 24576);
            }
            m4949N();
            this.f4663l = null;
        } catch (IOException e) {
            throw new C1268c(e);
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m4951c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        boolean z = true;
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + cArr[i + i4];
        }
        int i5 = i3 & 511;
        String str = strArr[i5];
        if (str != null) {
            if (i2 != str.length()) {
                z = false;
                break;
            }
            int i6 = i;
            int i7 = i2;
            int i8 = 0;
            while (true) {
                int i9 = i7 - 1;
                if (i7 == 0) {
                    break;
                }
                int i10 = i6 + 1;
                int i11 = i8 + 1;
                if (cArr[i6] != str.charAt(i8)) {
                    z = false;
                    break;
                }
                i6 = i10;
                i7 = i9;
                i8 = i11;
            }
            if (z) {
                return str;
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i5] = str2;
        return str2;
    }

    /* JADX INFO: renamed from: x */
    private boolean m4952x() {
        return this.f4656e >= this.f4654c;
    }

    /* JADX INFO: renamed from: z */
    private int m4953z(int i) {
        if (!m4991y()) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(this.f4660i, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    /* JADX INFO: renamed from: A */
    final int m4954A(int i) {
        if (!m4991y()) {
            return 1;
        }
        int iM4953z = m4953z(i);
        return iM4953z == -1 ? this.f4661j : iM4953z + this.f4661j + 1;
    }

    /* JADX INFO: renamed from: B */
    final void m4955B() {
        if (this.f4654c - this.f4656e < 1024) {
            this.f4655d = 0;
        }
        m4950b();
        this.f4658g = this.f4656e;
    }

    /* JADX INFO: renamed from: C */
    final boolean m4956C(String str) {
        boolean z;
        m4950b();
        m4950b();
        int length = str.length();
        if (length <= this.f4654c - this.f4656e) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (str.charAt(i) != this.f4652a[this.f4656e + i]) {
                    z = false;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        if (!z) {
            return false;
        }
        this.f4656e = str.length() + this.f4656e;
        return true;
    }

    /* JADX INFO: renamed from: D */
    final boolean m4957D(String str) {
        boolean z;
        m4950b();
        int length = str.length();
        if (length <= this.f4654c - this.f4656e) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f4652a[this.f4656e + i])) {
                    z = false;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        if (!z) {
            return false;
        }
        this.f4656e = str.length() + this.f4656e;
        return true;
    }

    /* JADX INFO: renamed from: E */
    final boolean m4958E(char c) {
        return !m4990w() && this.f4652a[this.f4656e] == c;
    }

    /* JADX INFO: renamed from: F */
    final boolean m4959F(char... cArr) {
        if (m4990w()) {
            return false;
        }
        m4950b();
        char c = this.f4652a[this.f4656e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    final boolean m4960G(char[] cArr) {
        m4950b();
        return !m4990w() && Arrays.binarySearch(cArr, this.f4652a[this.f4656e]) >= 0;
    }

    /* JADX INFO: renamed from: H */
    final boolean m4961H() {
        if (m4990w()) {
            return false;
        }
        char c = this.f4652a[this.f4656e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    /* JADX INFO: renamed from: I */
    final boolean m4962I() {
        char c;
        return !m4990w() && (c = this.f4652a[this.f4656e]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: J */
    final boolean m4963J() {
        if (m4990w()) {
            return false;
        }
        char c = this.f4652a[this.f4656e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* JADX INFO: renamed from: K */
    final int m4964K(CharSequence charSequence) {
        m4950b();
        char cCharAt = charSequence.charAt(0);
        int i = this.f4656e;
        while (i < this.f4654c) {
            if (cCharAt != this.f4652a[i]) {
                do {
                    i++;
                    if (i >= this.f4654c) {
                        break;
                    }
                } while (cCharAt != this.f4652a[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.f4654c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.f4652a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f4656e;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: L */
    public final int m4965L() {
        return this.f4657f + this.f4656e;
    }

    /* JADX INFO: renamed from: M */
    final void m4966M() {
        int i = this.f4658g;
        if (i == -1) {
            throw new C1268c(new IOException("Mark invalid"));
        }
        this.f4656e = i;
        this.f4658g = -1;
    }

    /* JADX INFO: renamed from: O */
    public final void m4967O(boolean z) {
        if (z && this.f4660i == null) {
            this.f4660i = new ArrayList<>(409);
            m4949N();
        } else {
            if (z) {
                return;
            }
            this.f4660i = null;
        }
    }

    /* JADX INFO: renamed from: P */
    final void m4968P() {
        int i = this.f4656e;
        if (i < 1) {
            throw new C1268c(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f4656e = i - 1;
    }

    /* JADX INFO: renamed from: Q */
    final void m4969Q() {
        this.f4658g = -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m4970a() {
        this.f4656e++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m4971d() {
        Reader reader = this.f4653b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } finally {
            this.f4653b = null;
            this.f4652a = null;
            this.f4659h = null;
        }
    }

    /* JADX INFO: renamed from: e */
    final int m4972e(int i) {
        int iM4953z;
        if (m4991y() && (iM4953z = m4953z(i)) != -1) {
            return (i - this.f4660i.get(iM4953z).intValue()) + 1;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    final char m4973f() {
        m4950b();
        char c = m4952x() ? (char) 65535 : this.f4652a[this.f4656e];
        this.f4656e++;
        return c;
    }

    /* JADX INFO: renamed from: g */
    final String m4974g(boolean z) {
        int i = this.f4656e;
        int i2 = this.f4654c;
        char[] cArr = this.f4652a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                }
                if (c == '\'') {
                    if (!z) {
                        break;
                    }
                    break;
                }
                continue;
                i3++;
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.f4656e = i3;
        return i3 > i ? m4951c(this.f4652a, this.f4659h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: h */
    final String m4975h() {
        int i = this.f4656e;
        int i2 = this.f4654c;
        char[] cArr = this.f4652a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f4656e = i3;
        return i3 > i ? m4951c(this.f4652a, this.f4659h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: i */
    final String m4976i() {
        int i;
        char c;
        m4950b();
        int i2 = this.f4656e;
        while (true) {
            i = this.f4656e;
            if (i >= this.f4654c || (c = this.f4652a[i]) < '0' || c > '9') {
                break;
            }
            this.f4656e = i + 1;
        }
        return m4951c(this.f4652a, this.f4659h, i2, i - i2);
    }

    /* JADX INFO: renamed from: j */
    final String m4977j() {
        int i;
        char c;
        m4950b();
        int i2 = this.f4656e;
        while (true) {
            i = this.f4656e;
            if (i >= this.f4654c || (((c = this.f4652a[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f4656e = i + 1;
        }
        return m4951c(this.f4652a, this.f4659h, i2, i - i2);
    }

    /* JADX INFO: renamed from: k */
    final String m4978k() {
        char c;
        m4950b();
        int i = this.f4656e;
        while (true) {
            int i2 = this.f4656e;
            if (i2 >= this.f4654c || (((c = this.f4652a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f4656e++;
        }
        return m4951c(this.f4652a, this.f4659h, i, this.f4656e - i);
    }

    /* JADX INFO: renamed from: l */
    final String m4979l() {
        char c;
        m4950b();
        int i = this.f4656e;
        while (true) {
            int i2 = this.f4656e;
            if (i2 >= this.f4654c || (((c = this.f4652a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f4656e++;
        }
        while (!m4952x()) {
            char[] cArr = this.f4652a;
            int i3 = this.f4656e;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.f4656e = i3 + 1;
        }
        return m4951c(this.f4652a, this.f4659h, i, this.f4656e - i);
    }

    /* JADX INFO: renamed from: m */
    final String m4980m() {
        int i = this.f4656e;
        int i2 = this.f4654c;
        char[] cArr = this.f4652a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f4656e = i3;
        return i3 > i ? m4951c(this.f4652a, this.f4659h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: n */
    final String m4981n() {
        m4950b();
        int i = this.f4656e;
        int i2 = this.f4654c;
        char[] cArr = this.f4652a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.f4656e = i3;
        return i3 > i ? m4951c(this.f4652a, this.f4659h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: o */
    final String m4982o() {
        int iM4964K = m4964K("]]>");
        if (iM4964K != -1) {
            String strM4951c = m4951c(this.f4652a, this.f4659h, this.f4656e, iM4964K);
            this.f4656e += iM4964K;
            return strM4951c;
        }
        int i = this.f4654c;
        int i2 = this.f4656e;
        if (i - i2 < 3) {
            return m4986s();
        }
        int i3 = (i - 3) + 1;
        String strM4951c2 = m4951c(this.f4652a, this.f4659h, i2, i3 - i2);
        this.f4656e = i3;
        return strM4951c2;
    }

    /* JADX INFO: renamed from: p */
    public final String m4983p(char c) {
        int i;
        m4950b();
        int i2 = this.f4656e;
        while (true) {
            if (i2 >= this.f4654c) {
                i = -1;
                break;
            }
            if (c == this.f4652a[i2]) {
                i = i2 - this.f4656e;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return m4986s();
        }
        String strM4951c = m4951c(this.f4652a, this.f4659h, this.f4656e, i);
        this.f4656e += i;
        return strM4951c;
    }

    /* JADX INFO: renamed from: q */
    public final String m4984q(char... cArr) {
        m4950b();
        int i = this.f4656e;
        int i2 = this.f4654c;
        char[] cArr2 = this.f4652a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f4656e = i3;
        return i3 > i ? m4951c(this.f4652a, this.f4659h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: r */
    final String m4985r(char... cArr) {
        m4950b();
        int i = this.f4656e;
        int i2 = this.f4654c;
        char[] cArr2 = this.f4652a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f4656e = i3;
        return i3 > i ? m4951c(this.f4652a, this.f4659h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: s */
    final String m4986s() {
        m4950b();
        char[] cArr = this.f4652a;
        String[] strArr = this.f4659h;
        int i = this.f4656e;
        String strM4951c = m4951c(cArr, strArr, i, this.f4654c - i);
        this.f4656e = this.f4654c;
        return strM4951c;
    }

    /* JADX INFO: renamed from: t */
    final boolean m4987t(String str) {
        if (str.equals(this.f4663l)) {
            int i = this.f4664m;
            if (i == -1) {
                return false;
            }
            if (i >= this.f4656e) {
                return true;
            }
        }
        this.f4663l = str;
        Locale locale = Locale.ENGLISH;
        int iM4964K = m4964K(str.toLowerCase(locale));
        if (iM4964K > -1) {
            this.f4664m = this.f4656e + iM4964K;
            return true;
        }
        int iM4964K2 = m4964K(str.toUpperCase(locale));
        boolean z = iM4964K2 > -1;
        this.f4664m = z ? this.f4656e + iM4964K2 : -1;
        return z;
    }

    public final String toString() {
        int i = this.f4654c;
        int i2 = this.f4656e;
        return i - i2 < 0 ? "" : new String(this.f4652a, i2, i - i2);
    }

    /* JADX INFO: renamed from: u */
    public final char m4988u() {
        m4950b();
        if (m4952x()) {
            return (char) 65535;
        }
        return this.f4652a[this.f4656e];
    }

    /* JADX INFO: renamed from: v */
    final String m4989v() {
        return m4954A(this.f4657f + this.f4656e) + ":" + m4972e(this.f4657f + this.f4656e);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4990w() {
        m4950b();
        return this.f4656e >= this.f4654c;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4991y() {
        return this.f4660i != null;
    }
}
