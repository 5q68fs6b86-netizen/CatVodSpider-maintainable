package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p021Z.C1014b;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1119a {

    /* JADX INFO: renamed from: a */
    private char[] f2716a;

    /* JADX INFO: renamed from: b */
    private Reader f2717b;

    /* JADX INFO: renamed from: c */
    private int f2718c;

    /* JADX INFO: renamed from: d */
    private int f2719d;

    /* JADX INFO: renamed from: e */
    private int f2720e;

    /* JADX INFO: renamed from: f */
    private int f2721f;

    /* JADX INFO: renamed from: g */
    private int f2722g = -1;

    /* JADX INFO: renamed from: h */
    private String[] f2723h = new String[512];

    /* JADX INFO: renamed from: i */
    private boolean f2724i;

    public C1119a(Reader reader, int i) {
        C0966a.m2371f(reader.markSupported());
        this.f2717b = reader;
        this.f2716a = new char[Math.min(i, 32768)];
        m2889b();
    }

    /* JADX INFO: renamed from: b */
    private void m2889b() {
        int i;
        int i2;
        if (this.f2724i || (i = this.f2720e) < this.f2719d) {
            return;
        }
        int i3 = this.f2722g;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.f2717b.skip(j);
            this.f2717b.mark(32768);
            int i4 = 0;
            while (i4 <= 1024) {
                Reader reader = this.f2717b;
                char[] cArr = this.f2716a;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.f2724i = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.f2717b.reset();
            if (i4 > 0) {
                C0966a.m2371f(jSkip == j);
                this.f2718c = i4;
                this.f2721f += i;
                this.f2720e = i2;
                if (this.f2722g != -1) {
                    this.f2722g = 0;
                }
                this.f2719d = Math.min(i4, 24576);
            }
        } catch (IOException e) {
            throw new C1014b(e);
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m2890c(char[] cArr, String[] strArr, int i, int i2) {
        boolean z = true;
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 * 31;
        int i4 = 0;
        int i5 = i;
        while (i4 < i2) {
            i3 = (i3 * 31) + cArr[i5];
            i4++;
            i5++;
        }
        int i6 = i3 & 511;
        String str = strArr[i6];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[i6] = str2;
            return str2;
        }
        if (i2 != str.length()) {
            z = false;
            break;
        }
        int i7 = i;
        int i8 = i2;
        int i9 = 0;
        while (i8 != 0) {
            if (cArr[i7] != str.charAt(i9)) {
                z = false;
                break;
            }
            i7++;
            i8--;
            i9++;
        }
        if (z) {
            return str;
        }
        String str3 = new String(cArr, i, i2);
        strArr[i6] = str3;
        return str3;
    }

    /* JADX INFO: renamed from: u */
    private boolean m2891u() {
        return this.f2720e >= this.f2718c;
    }

    /* JADX INFO: renamed from: A */
    final boolean m2892A(char[] cArr) {
        m2889b();
        return !m2917t() && Arrays.binarySearch(cArr, this.f2716a[this.f2720e]) >= 0;
    }

    /* JADX INFO: renamed from: B */
    final boolean m2893B() {
        char c;
        return !m2917t() && (c = this.f2716a[this.f2720e]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: C */
    final boolean m2894C() {
        if (m2917t()) {
            return false;
        }
        char c = this.f2716a[this.f2720e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* JADX INFO: renamed from: D */
    final int m2895D(CharSequence charSequence) {
        m2889b();
        char cCharAt = charSequence.charAt(0);
        int i = this.f2720e;
        while (i < this.f2718c) {
            if (cCharAt != this.f2716a[i]) {
                do {
                    i++;
                    if (i >= this.f2718c) {
                        break;
                    }
                } while (cCharAt != this.f2716a[i]);
            }
            int i2 = i;
            i = i2 + 1;
            int length = (charSequence.length() + i) - 1;
            int i3 = this.f2718c;
            if (i2 < i3 && length <= i3) {
                int i4 = i;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.f2716a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i2 - this.f2720e;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: E */
    public final int m2896E() {
        return this.f2721f + this.f2720e;
    }

    /* JADX INFO: renamed from: F */
    final void m2897F() {
        int i = this.f2722g;
        if (i == -1) {
            throw new C1014b(new IOException("Mark invalid"));
        }
        this.f2720e = i;
        this.f2722g = -1;
    }

    /* JADX INFO: renamed from: G */
    final void m2898G() {
        int i = this.f2720e;
        if (i < 1) {
            throw new C1014b(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f2720e = i - 1;
    }

    /* JADX INFO: renamed from: H */
    final void m2899H() {
        this.f2722g = -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m2900a() {
        this.f2720e++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m2901d() {
        Reader reader = this.f2717b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException e) {
        } finally {
            this.f2717b = null;
            this.f2716a = null;
            this.f2723h = null;
        }
    }

    /* JADX INFO: renamed from: e */
    final char m2902e() {
        m2889b();
        char c = m2891u() ? (char) 65535 : this.f2716a[this.f2720e];
        this.f2720e++;
        return c;
    }

    /* JADX INFO: renamed from: f */
    final String m2903f(boolean z) {
        int i = this.f2720e;
        int i2 = this.f2718c;
        char[] cArr = this.f2716a;
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
        this.f2720e = i3;
        return i3 > i ? m2890c(this.f2716a, this.f2723h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: g */
    final String m2904g() {
        int i = this.f2720e;
        int i2 = this.f2718c;
        char[] cArr = this.f2716a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f2720e = i3;
        return i3 > i ? m2890c(this.f2716a, this.f2723h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: h */
    final String m2905h() {
        int i;
        char c;
        m2889b();
        int i2 = this.f2720e;
        while (true) {
            i = this.f2720e;
            if (i >= this.f2718c || (c = this.f2716a[i]) < '0' || c > '9') {
                break;
            }
            this.f2720e = i + 1;
        }
        return m2890c(this.f2716a, this.f2723h, i2, i - i2);
    }

    /* JADX INFO: renamed from: i */
    final String m2906i() {
        int i;
        char c;
        m2889b();
        int i2 = this.f2720e;
        while (true) {
            i = this.f2720e;
            if (i >= this.f2718c || (((c = this.f2716a[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f2720e = i + 1;
        }
        return m2890c(this.f2716a, this.f2723h, i2, i - i2);
    }

    /* JADX INFO: renamed from: j */
    final String m2907j() {
        char c;
        m2889b();
        int i = this.f2720e;
        while (true) {
            int i2 = this.f2720e;
            if (i2 >= this.f2718c || (((c = this.f2716a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f2720e++;
        }
        return m2890c(this.f2716a, this.f2723h, i, this.f2720e - i);
    }

    /* JADX INFO: renamed from: k */
    final String m2908k() {
        char c;
        m2889b();
        int i = this.f2720e;
        while (true) {
            int i2 = this.f2720e;
            if (i2 >= this.f2718c || (((c = this.f2716a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f2720e++;
        }
        while (!m2891u()) {
            char[] cArr = this.f2716a;
            int i3 = this.f2720e;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.f2720e = i3 + 1;
        }
        return m2890c(this.f2716a, this.f2723h, i, this.f2720e - i);
    }

    /* JADX INFO: renamed from: l */
    final String m2909l() {
        int i = this.f2720e;
        int i2 = this.f2718c;
        char[] cArr = this.f2716a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f2720e = i3;
        return i3 > i ? m2890c(this.f2716a, this.f2723h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: m */
    final String m2910m() {
        m2889b();
        int i = this.f2720e;
        int i2 = this.f2718c;
        char[] cArr = this.f2716a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == ' ' || c == '/' || c == '<' || c == '>' || c == '\t' || c == '\n' || c == '\f' || c == '\r') {
                break;
            }
            i3++;
        }
        this.f2720e = i3;
        return i3 > i ? m2890c(this.f2716a, this.f2723h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: n */
    final String m2911n() {
        int iM2895D = m2895D("]]>");
        if (iM2895D != -1) {
            String strM2890c = m2890c(this.f2716a, this.f2723h, this.f2720e, iM2895D);
            this.f2720e = iM2895D + this.f2720e;
            return strM2890c;
        }
        int i = this.f2718c;
        int i2 = this.f2720e;
        if (i - i2 < 3) {
            return m2915r();
        }
        int i3 = (i - 3) + 1;
        String strM2890c2 = m2890c(this.f2716a, this.f2723h, i2, i3 - i2);
        this.f2720e = i3;
        return strM2890c2;
    }

    /* JADX INFO: renamed from: o */
    public final String m2912o(char c) {
        int i;
        m2889b();
        int i2 = this.f2720e;
        while (true) {
            if (i2 >= this.f2718c) {
                i = -1;
                break;
            }
            if (c == this.f2716a[i2]) {
                i = i2 - this.f2720e;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return m2915r();
        }
        String strM2890c = m2890c(this.f2716a, this.f2723h, this.f2720e, i);
        this.f2720e = i + this.f2720e;
        return strM2890c;
    }

    /* JADX INFO: renamed from: p */
    public final String m2913p(char... cArr) {
        m2889b();
        int i = this.f2720e;
        int i2 = this.f2718c;
        char[] cArr2 = this.f2716a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f2720e = i3;
        return i3 > i ? m2890c(this.f2716a, this.f2723h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: q */
    final String m2914q(char... cArr) {
        m2889b();
        int i = this.f2720e;
        int i2 = this.f2718c;
        char[] cArr2 = this.f2716a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f2720e = i3;
        return i3 > i ? m2890c(this.f2716a, this.f2723h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: r */
    final String m2915r() {
        m2889b();
        char[] cArr = this.f2716a;
        String[] strArr = this.f2723h;
        int i = this.f2720e;
        String strM2890c = m2890c(cArr, strArr, i, this.f2718c - i);
        this.f2720e = this.f2718c;
        return strM2890c;
    }

    /* JADX INFO: renamed from: s */
    public final char m2916s() {
        m2889b();
        if (m2891u()) {
            return (char) 65535;
        }
        return this.f2716a[this.f2720e];
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2917t() {
        m2889b();
        return this.f2720e >= this.f2718c;
    }

    public final String toString() {
        int i = this.f2718c;
        int i2 = this.f2720e;
        return i - i2 < 0 ? "" : new String(this.f2716a, i2, i - i2);
    }

    /* JADX INFO: renamed from: v */
    final void m2918v() {
        if (this.f2718c - this.f2720e < 1024) {
            this.f2719d = 0;
        }
        m2889b();
        this.f2722g = this.f2720e;
    }

    /* JADX INFO: renamed from: w */
    final boolean m2919w(String str) {
        boolean z;
        m2889b();
        m2889b();
        int length = str.length();
        if (length <= this.f2718c - this.f2720e) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (str.charAt(i) != this.f2716a[this.f2720e + i]) {
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
        this.f2720e += str.length();
        return true;
    }

    /* JADX INFO: renamed from: x */
    final boolean m2920x(String str) {
        boolean z;
        m2889b();
        int length = str.length();
        if (length <= this.f2718c - this.f2720e) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f2716a[this.f2720e + i])) {
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
        this.f2720e += str.length();
        return true;
    }

    /* JADX INFO: renamed from: y */
    final boolean m2921y(char c) {
        return !m2917t() && this.f2716a[this.f2720e] == c;
    }

    /* JADX INFO: renamed from: z */
    final boolean m2922z(char... cArr) {
        if (m2917t()) {
            return false;
        }
        m2889b();
        char c = this.f2716a[this.f2720e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }
}
