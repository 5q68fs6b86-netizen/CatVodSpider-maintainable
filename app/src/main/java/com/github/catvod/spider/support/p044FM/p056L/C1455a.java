package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p052H.C1374b;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1455a {

    /* JADX INFO: renamed from: a */
    private char[] f3364a;

    /* JADX INFO: renamed from: b */
    private Reader f3365b;

    /* JADX INFO: renamed from: c */
    private int f3366c;

    /* JADX INFO: renamed from: d */
    private int f3367d;

    /* JADX INFO: renamed from: e */
    private int f3368e;

    /* JADX INFO: renamed from: f */
    private int f3369f;

    /* JADX INFO: renamed from: g */
    private int f3370g = -1;

    /* JADX INFO: renamed from: h */
    private String[] f3371h = new String[512];

    /* JADX INFO: renamed from: i */
    @Nullable
    private ArrayList<Integer> f3372i = null;

    /* JADX INFO: renamed from: j */
    private int f3373j = 1;

    /* JADX INFO: renamed from: k */
    private boolean f3374k;

    /* JADX INFO: renamed from: l */
    @Nullable
    private String f3375l;

    /* JADX INFO: renamed from: m */
    private int f3376m;

    public C1455a(Reader reader, int i) {
        C1377c.m3356c(reader.markSupported());
        this.f3365b = reader;
        this.f3364a = new char[Math.min(i, 32768)];
        m3639b();
    }

    /* JADX INFO: renamed from: N */
    private void m3638N() {
        if (m3680y()) {
            if (this.f3372i.size() > 0) {
                int iM3642z = m3642z(this.f3369f);
                if (iM3642z == -1) {
                    iM3642z = 0;
                }
                int iIntValue = this.f3372i.get(iM3642z).intValue();
                this.f3373j += iM3642z;
                this.f3372i.clear();
                this.f3372i.add(Integer.valueOf(iIntValue));
            }
            for (int i = this.f3368e; i < this.f3366c; i++) {
                if (this.f3364a[i] == '\n') {
                    this.f3372i.add(Integer.valueOf(this.f3369f + 1 + i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3639b() {
        int i;
        int i2;
        boolean z;
        if (this.f3374k || (i = this.f3368e) < this.f3367d) {
            return;
        }
        int i3 = this.f3370g;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.f3365b.skip(j);
            this.f3365b.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.f3365b;
                char[] cArr = this.f3364a;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.f3374k = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.f3365b.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                C1377c.m3356c(z);
                this.f3366c = i4;
                this.f3369f += i;
                this.f3368e = i2;
                if (this.f3370g != -1) {
                    this.f3370g = 0;
                }
                this.f3367d = Math.min(i4, 24576);
            }
            m3638N();
            this.f3375l = null;
        } catch (IOException e) {
            throw new C1374b(e);
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m3640c(char[] cArr, String[] strArr, int i, int i2) {
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
                /*break*/;
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
    private boolean m3641x() {
        return this.f3368e >= this.f3366c;
    }

    /* JADX INFO: renamed from: z */
    private int m3642z(int i) {
        if (!m3680y()) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(this.f3372i, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    /* JADX INFO: renamed from: A */
    final int m3643A(int i) {
        if (!m3680y()) {
            return 1;
        }
        int iM3642z = m3642z(i);
        return iM3642z == -1 ? this.f3373j : iM3642z + this.f3373j + 1;
    }

    /* JADX INFO: renamed from: B */
    final void m3644B() {
        if (this.f3366c - this.f3368e < 1024) {
            this.f3367d = 0;
        }
        m3639b();
        this.f3370g = this.f3368e;
    }

    /* JADX INFO: renamed from: C */
    final boolean m3645C(String str) {
        boolean z;
        m3639b();
        m3639b();
        int length = str.length();
        if (length <= this.f3366c - this.f3368e) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (str.charAt(i) != this.f3364a[this.f3368e + i]) {
                    z = false;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            /*break*/;
        }
        if (!z) {
            return false;
        }
        this.f3368e = str.length() + this.f3368e;
        return true;
    }

    /* JADX INFO: renamed from: D */
    final boolean m3646D(String str) {
        boolean z;
        m3639b();
        int length = str.length();
        if (length <= this.f3366c - this.f3368e) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f3364a[this.f3368e + i])) {
                    z = false;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            /*break*/;
        }
        if (!z) {
            return false;
        }
        this.f3368e = str.length() + this.f3368e;
        return true;
    }

    /* JADX INFO: renamed from: E */
    final boolean m3647E(char c) {
        return !m3679w() && this.f3364a[this.f3368e] == c;
    }

    /* JADX INFO: renamed from: F */
    final boolean m3648F(char... cArr) {
        if (m3679w()) {
            return false;
        }
        m3639b();
        char c = this.f3364a[this.f3368e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    final boolean m3649G(char[] cArr) {
        m3639b();
        return !m3679w() && Arrays.binarySearch(cArr, this.f3364a[this.f3368e]) >= 0;
    }

    /* JADX INFO: renamed from: H */
    final boolean m3650H() {
        if (m3679w()) {
            return false;
        }
        char c = this.f3364a[this.f3368e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    /* JADX INFO: renamed from: I */
    final boolean m3651I() {
        char c;
        return !m3679w() && (c = this.f3364a[this.f3368e]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: J */
    final boolean m3652J() {
        if (m3679w()) {
            return false;
        }
        char c = this.f3364a[this.f3368e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* JADX INFO: renamed from: K */
    final int m3653K(CharSequence charSequence) {
        m3639b();
        char cCharAt = charSequence.charAt(0);
        int i = this.f3368e;
        while (i < this.f3366c) {
            if (cCharAt != this.f3364a[i]) {
                do {
                    i++;
                    if (i >= this.f3366c) {
                        break;
                    }
                } while (cCharAt != this.f3364a[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.f3366c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.f3364a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f3368e;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: L */
    public final int m3654L() {
        return this.f3369f + this.f3368e;
    }

    /* JADX INFO: renamed from: M */
    final void m3655M() {
        int i = this.f3370g;
        if (i == -1) {
            throw new C1374b(new IOException("Mark invalid"));
        }
        this.f3368e = i;
        this.f3370g = -1;
    }

    /* JADX INFO: renamed from: O */
    public final void m3656O(boolean z) {
        if (z && this.f3372i == null) {
            this.f3372i = new ArrayList<>(409);
            m3638N();
        } else {
            if (z) {
                return;
            }
            this.f3372i = null;
        }
    }

    /* JADX INFO: renamed from: P */
    final void m3657P() {
        int i = this.f3368e;
        if (i < 1) {
            throw new C1374b(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f3368e = i - 1;
    }

    /* JADX INFO: renamed from: Q */
    final void m3658Q() {
        this.f3370g = -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m3659a() {
        this.f3368e++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m3660d() {
        Reader reader = this.f3365b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } finally {
            this.f3365b = null;
            this.f3364a = null;
            this.f3371h = null;
        }
    }

    /* JADX INFO: renamed from: e */
    final int m3661e(int i) {
        int iM3642z;
        if (m3680y() && (iM3642z = m3642z(i)) != -1) {
            return (i - this.f3372i.get(iM3642z).intValue()) + 1;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    final char m3662f() {
        m3639b();
        char c = m3641x() ? (char) 65535 : this.f3364a[this.f3368e];
        this.f3368e++;
        return c;
    }

    /* JADX INFO: renamed from: g */
    final String m3663g(boolean z) {
        int i = this.f3368e;
        int i2 = this.f3366c;
        char[] cArr = this.f3364a;
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
        this.f3368e = i3;
        return i3 > i ? m3640c(this.f3364a, this.f3371h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: h */
    final String m3664h() {
        int i = this.f3368e;
        int i2 = this.f3366c;
        char[] cArr = this.f3364a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f3368e = i3;
        return i3 > i ? m3640c(this.f3364a, this.f3371h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: i */
    final String m3665i() {
        int i;
        char c;
        m3639b();
        int i2 = this.f3368e;
        while (true) {
            i = this.f3368e;
            if (i >= this.f3366c || (c = this.f3364a[i]) < '0' || c > '9') {
                break;
            }
            this.f3368e = i + 1;
        }
        return m3640c(this.f3364a, this.f3371h, i2, i - i2);
    }

    /* JADX INFO: renamed from: j */
    final String m3666j() {
        int i;
        char c;
        m3639b();
        int i2 = this.f3368e;
        while (true) {
            i = this.f3368e;
            if (i >= this.f3366c || (((c = this.f3364a[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f3368e = i + 1;
        }
        return m3640c(this.f3364a, this.f3371h, i2, i - i2);
    }

    /* JADX INFO: renamed from: k */
    final String m3667k() {
        char c;
        m3639b();
        int i = this.f3368e;
        while (true) {
            int i2 = this.f3368e;
            if (i2 >= this.f3366c || (((c = this.f3364a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f3368e++;
        }
        return m3640c(this.f3364a, this.f3371h, i, this.f3368e - i);
    }

    /* JADX INFO: renamed from: l */
    final String m3668l() {
        char c;
        m3639b();
        int i = this.f3368e;
        while (true) {
            int i2 = this.f3368e;
            if (i2 >= this.f3366c || (((c = this.f3364a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f3368e++;
        }
        while (!m3641x()) {
            char[] cArr = this.f3364a;
            int i3 = this.f3368e;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.f3368e = i3 + 1;
        }
        return m3640c(this.f3364a, this.f3371h, i, this.f3368e - i);
    }

    /* JADX INFO: renamed from: m */
    final String m3669m() {
        int i = this.f3368e;
        int i2 = this.f3366c;
        char[] cArr = this.f3364a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f3368e = i3;
        return i3 > i ? m3640c(this.f3364a, this.f3371h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: n */
    final String m3670n() {
        m3639b();
        int i = this.f3368e;
        int i2 = this.f3366c;
        char[] cArr = this.f3364a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.f3368e = i3;
        return i3 > i ? m3640c(this.f3364a, this.f3371h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: o */
    final String m3671o() {
        int iM3653K = m3653K("]]>");
        if (iM3653K != -1) {
            String strM3640c = m3640c(this.f3364a, this.f3371h, this.f3368e, iM3653K);
            this.f3368e += iM3653K;
            return strM3640c;
        }
        int i = this.f3366c;
        int i2 = this.f3368e;
        if (i - i2 < 3) {
            return m3675s();
        }
        int i3 = (i - 3) + 1;
        String strM3640c2 = m3640c(this.f3364a, this.f3371h, i2, i3 - i2);
        this.f3368e = i3;
        return strM3640c2;
    }

    /* JADX INFO: renamed from: p */
    public final String m3672p(char c) {
        int i;
        m3639b();
        int i2 = this.f3368e;
        while (true) {
            if (i2 >= this.f3366c) {
                i = -1;
                break;
            }
            if (c == this.f3364a[i2]) {
                i = i2 - this.f3368e;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return m3675s();
        }
        String strM3640c = m3640c(this.f3364a, this.f3371h, this.f3368e, i);
        this.f3368e += i;
        return strM3640c;
    }

    /* JADX INFO: renamed from: q */
    public final String m3673q(char... cArr) {
        m3639b();
        int i = this.f3368e;
        int i2 = this.f3366c;
        char[] cArr2 = this.f3364a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f3368e = i3;
        return i3 > i ? m3640c(this.f3364a, this.f3371h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: r */
    final String m3674r(char... cArr) {
        m3639b();
        int i = this.f3368e;
        int i2 = this.f3366c;
        char[] cArr2 = this.f3364a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f3368e = i3;
        return i3 > i ? m3640c(this.f3364a, this.f3371h, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: s */
    final String m3675s() {
        m3639b();
        char[] cArr = this.f3364a;
        String[] strArr = this.f3371h;
        int i = this.f3368e;
        String strM3640c = m3640c(cArr, strArr, i, this.f3366c - i);
        this.f3368e = this.f3366c;
        return strM3640c;
    }

    /* JADX INFO: renamed from: t */
    final boolean m3676t(String str) {
        if (str.equals(this.f3375l)) {
            int i = this.f3376m;
            if (i == -1) {
                return false;
            }
            if (i >= this.f3368e) {
                return true;
            }
        }
        this.f3375l = str;
        Locale locale = Locale.ENGLISH;
        int iM3653K = m3653K(str.toLowerCase(locale));
        if (iM3653K > -1) {
            this.f3376m = this.f3368e + iM3653K;
            return true;
        }
        int iM3653K2 = m3653K(str.toUpperCase(locale));
        boolean z = iM3653K2 > -1;
        this.f3376m = z ? this.f3368e + iM3653K2 : -1;
        return z;
    }

    public final String toString() {
        int i = this.f3366c;
        int i2 = this.f3368e;
        return i - i2 < 0 ? "" : new String(this.f3364a, i2, i - i2);
    }

    /* JADX INFO: renamed from: u */
    public final char m3677u() {
        m3639b();
        if (m3641x()) {
            return (char) 65535;
        }
        return this.f3364a[this.f3368e];
    }

    /* JADX INFO: renamed from: v */
    final String m3678v() {
        return m3643A(this.f3369f + this.f3368e) + ":" + m3661e(this.f3369f + this.f3368e);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m3679w() {
        m3639b();
        return this.f3368e >= this.f3366c;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m3680y() {
        return this.f3372i != null;
    }
}
