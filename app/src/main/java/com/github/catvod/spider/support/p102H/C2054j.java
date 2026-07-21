package com.github.catvod.spider.support.p102H;

import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p043F.C1274b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2054j {

    /* JADX INFO: renamed from: a */
    private String f4796a;

    /* JADX INFO: renamed from: b */
    private int f4797b = 0;

    public C2054j(String str) {
        C1271c.m3157g(str);
        this.f4796a = str;
    }

    /* JADX INFO: renamed from: o */
    public static String m5123o(String str) {
        StringBuilder sbM3171b = C1274b.m3171b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || c == '\\') {
                sbM3171b.append(c2);
            }
            i++;
            c = c2;
        }
        return C1274b.m3177h(sbM3171b);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007e A[LOOP:0: B:3:0x0008->B:45:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0055 A[EDGE_INSN: B:47:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0008->B:45:0x007e], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final String m5124a(char c, char c2) {
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        boolean z3 = false;
        while (!m5132i()) {
            char cM5126c = m5126c();
            if (c3 != '\\') {
                if (cM5126c == '\'' && cM5126c != c && !z) {
                    z2 = !z2;
                } else if (cM5126c == '\"' && cM5126c != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (cM5126c == c) {
                        i3++;
                        if (i == -1) {
                            i = this.f4797b;
                        }
                    } else if (cM5126c == c2) {
                        i3--;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                c3 = cM5126c;
            } else if (cM5126c == 'Q') {
                z3 = true;
            } else if (cM5126c == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.f4797b;
            }
            if (i3 <= 0) {
                break;
                break;
            }
            c3 = cM5126c;
        }
        String strSubstring = i2 >= 0 ? this.f4796a.substring(i, i2) : "";
        if (i3 <= 0) {
            return strSubstring;
        }
        C1271c.m3151a("Did not find balanced marker at '" + strSubstring + "'");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final String m5125b() {
        String strM5137n;
        int iIndexOf = this.f4796a.indexOf(")", this.f4797b);
        if (iIndexOf != -1) {
            strM5137n = this.f4796a.substring(this.f4797b, iIndexOf);
            this.f4797b = strM5137n.length() + this.f4797b;
        } else {
            strM5137n = m5137n();
        }
        m5133j(")");
        return strM5137n;
    }

    /* JADX INFO: renamed from: c */
    public final char m5126c() {
        String str = this.f4796a;
        int i = this.f4797b;
        this.f4797b = i + 1;
        return str.charAt(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m5127d(String str) {
        if (!m5134k(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f4796a.length();
        int i = this.f4797b;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f4797b = i + length;
    }

    /* JADX INFO: renamed from: e */
    public final String m5128e() {
        int i = this.f4797b;
        while (!m5132i()) {
            if (!m5136m()) {
                char[] cArr = {'-', '_'};
                boolean z = false;
                if (!m5132i()) {
                    for (int i2 = 0; i2 < 2; i2++) {
                        if (this.f4796a.charAt(this.f4797b) == cArr[i2]) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    break;
                }
            }
            this.f4797b++;
        }
        return this.f4796a.substring(i, this.f4797b);
    }

    /* JADX INFO: renamed from: f */
    public final String m5129f() {
        int i = this.f4797b;
        while (!m5132i() && (m5136m() || m5135l("*|", "|", "_", "-"))) {
            this.f4797b++;
        }
        return this.f4796a.substring(i, this.f4797b);
    }

    /* JADX INFO: renamed from: g */
    public final String m5130g(String... strArr) {
        int i = this.f4797b;
        while (!m5132i() && !m5135l(strArr)) {
            this.f4797b++;
        }
        return this.f4796a.substring(i, this.f4797b);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5131h() {
        boolean z = false;
        while (true) {
            if (!(!m5132i() && C1274b.m3174e(this.f4796a.charAt(this.f4797b)))) {
                return z;
            }
            this.f4797b++;
            z = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5132i() {
        return this.f4796a.length() - this.f4797b == 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5133j(String str) {
        if (!m5134k(str)) {
            return false;
        }
        this.f4797b = str.length() + this.f4797b;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5134k(String str) {
        return this.f4796a.regionMatches(true, this.f4797b, str, 0, str.length());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m5135l(String... strArr) {
        for (String str : strArr) {
            if (m5134k(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m5136m() {
        return !m5132i() && Character.isLetterOrDigit(this.f4796a.charAt(this.f4797b));
    }

    /* JADX INFO: renamed from: n */
    public final String m5137n() {
        String strSubstring = this.f4796a.substring(this.f4797b);
        this.f4797b = this.f4796a.length();
        return strSubstring;
    }

    public final String toString() {
        return this.f4796a.substring(this.f4797b);
    }
}
