package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.S */
/* JADX INFO: loaded from: classes.dex */
public final class C1439S {

    /* JADX INFO: renamed from: a */
    private String f3340a;

    /* JADX INFO: renamed from: b */
    private int f3341b = 0;

    public C1439S(String str) {
        C1377c.m3360g(str);
        this.f3340a = str;
    }

    /* JADX INFO: renamed from: o */
    public static String m3600o(String str) {
        StringBuilder sbM3363b = C1380b.m3363b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || c == '\\') {
                sbM3363b.append(c2);
            }
            i++;
            c = c2;
        }
        return C1380b.m3369h(sbM3363b);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007e A[LOOP:0: B:3:0x0008->B:45:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0055 A[EDGE_INSN: B:47:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0008->B:45:0x007e], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final String m3601a(char c, char c2) {
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        boolean z3 = false;
        while (!m3609i()) {
            char cM3603c = m3603c();
            if (c3 != '\\') {
                if (cM3603c == '\'' && cM3603c != c && !z) {
                    z2 = !z2;
                } else if (cM3603c == '\"' && cM3603c != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (cM3603c == c) {
                        i3++;
                        if (i == -1) {
                            i = this.f3341b;
                        }
                    } else if (cM3603c == c2) {
                        i3--;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                c3 = cM3603c;
            } else if (cM3603c == 'Q') {
                z3 = true;
            } else if (cM3603c == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.f3341b;
            }
            if (i3 <= 0) {
                break;
                break;
            }
            c3 = cM3603c;
        }
        String strSubstring = i2 >= 0 ? this.f3340a.substring(i, i2) : "";
        if (i3 <= 0) {
            return strSubstring;
        }
        C1377c.m3354a("Did not find balanced marker at '" + strSubstring + "'");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final String m3602b() {
        String strM3614n;
        int iIndexOf = this.f3340a.indexOf(")", this.f3341b);
        if (iIndexOf != -1) {
            strM3614n = this.f3340a.substring(this.f3341b, iIndexOf);
            this.f3341b = strM3614n.length() + this.f3341b;
        } else {
            strM3614n = m3614n();
        }
        m3610j(")");
        return strM3614n;
    }

    /* JADX INFO: renamed from: c */
    public final char m3603c() {
        String str = this.f3340a;
        int i = this.f3341b;
        this.f3341b = i + 1;
        return str.charAt(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m3604d(String str) {
        if (!m3611k(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f3340a.length();
        int i = this.f3341b;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f3341b = i + length;
    }

    /* JADX INFO: renamed from: e */
    public final String m3605e() {
        int i = this.f3341b;
        while (!m3609i()) {
            if (!m3613m()) {
                char[] cArr = {'-', '_'};
                boolean z = false;
                if (!m3609i()) {
                    for (int i2 = 0; i2 < 2; i2++) {
                        if (this.f3340a.charAt(this.f3341b) == cArr[i2]) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    break;
                }
            }
            this.f3341b++;
        }
        return this.f3340a.substring(i, this.f3341b);
    }

    /* JADX INFO: renamed from: f */
    public final String m3606f() {
        int i = this.f3341b;
        while (!m3609i() && (m3613m() || m3612l("*|", "|", "_", "-"))) {
            this.f3341b++;
        }
        return this.f3340a.substring(i, this.f3341b);
    }

    /* JADX INFO: renamed from: g */
    public final String m3607g(String... strArr) {
        int i = this.f3341b;
        while (!m3609i() && !m3612l(strArr)) {
            this.f3341b++;
        }
        return this.f3340a.substring(i, this.f3341b);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3608h() {
        boolean z = false;
        while (true) {
            if (!(!m3609i() && C1380b.m3366e(this.f3340a.charAt(this.f3341b)))) {
                return z;
            }
            this.f3341b++;
            z = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3609i() {
        return this.f3340a.length() - this.f3341b == 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3610j(String str) {
        if (!m3611k(str)) {
            return false;
        }
        this.f3341b = str.length() + this.f3341b;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3611k(String str) {
        return this.f3340a.regionMatches(true, this.f3341b, str, 0, str.length());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3612l(String... strArr) {
        for (String str : strArr) {
            if (m3611k(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3613m() {
        return !m3609i() && Character.isLetterOrDigit(this.f3340a.charAt(this.f3341b));
    }

    /* JADX INFO: renamed from: n */
    public final String m3614n() {
        String strSubstring = this.f3340a.substring(this.f3341b);
        this.f3341b = this.f3340a.length();
        return strSubstring;
    }

    public final String toString() {
        return this.f3340a.substring(this.f3341b);
    }
}
