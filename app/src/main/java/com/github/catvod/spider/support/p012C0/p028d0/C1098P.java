package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p024b0.C1034b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C1098P {

    /* JADX INFO: renamed from: a */
    private String f2695a;

    /* JADX INFO: renamed from: b */
    private int f2696b = 0;

    public C1098P(String str) {
        C0966a.m2376k(str);
        this.f2695a = str;
    }

    /* JADX INFO: renamed from: o */
    public static String m2852o(String str) {
        StringBuilder sbM2595a = C1034b.m2595a();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || c == '\\') {
                sbM2595a.append(c2);
            }
            i++;
            c = c2;
        }
        return C1034b.m2601g(sbM2595a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032 A[LOOP:0: B:3:0x0008->B:19:0x0032, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x000e A[EDGE_INSN: B:41:0x000e->B:5:0x000e BREAK  A[LOOP:0: B:3:0x0008->B:19:0x0032], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final String m2853a(char c, char c2) {
        boolean z;
        char c3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (!m2861i()) {
            char cM2855c = m2855c();
            if (c3 != '\\') {
                if (cM2855c != '\'' || cM2855c == c || z2) {
                    z = (cM2855c != '\"' || cM2855c == c || z3) ? z2 : !z2;
                } else {
                    z3 = !z3;
                    z = z2;
                }
                if (!z3 && !z) {
                    if (cM2855c == c) {
                        i++;
                        if (i2 == -1) {
                            i2 = this.f2696b;
                        }
                    } else if (cM2855c == c2) {
                        i--;
                    }
                }
                if (i > 0) {
                    break;
                }
                z2 = z;
            } else {
                z = z2;
            }
            if (i > 0 && c3 != 0) {
                i3 = this.f2696b;
            }
            c3 = cM2855c;
            if (i > 0) {
                break;
                break;
            }
            z2 = z;
        }
        String strSubstring = i3 >= 0 ? this.f2695a.substring(i2, i3) : "";
        if (i <= 0) {
            return strSubstring;
        }
        C0966a.m2367a("Did not find balanced marker at '" + strSubstring + "'");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final String m2854b() {
        String strM2866n;
        int iIndexOf = this.f2695a.indexOf(")", this.f2696b);
        if (iIndexOf != -1) {
            strM2866n = this.f2695a.substring(this.f2696b, iIndexOf);
            this.f2696b += strM2866n.length();
        } else {
            strM2866n = m2866n();
        }
        m2862j(")");
        return strM2866n;
    }

    /* JADX INFO: renamed from: c */
    public final char m2855c() {
        String str = this.f2695a;
        int i = this.f2696b;
        this.f2696b = i + 1;
        return str.charAt(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m2856d(String str) {
        if (!m2863k(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f2695a.length();
        int i = this.f2696b;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f2696b = length + i;
    }

    /* JADX INFO: renamed from: e */
    public final String m2857e() {
        boolean z;
        int i = this.f2696b;
        while (!m2861i()) {
            if (!m2865m()) {
                if (!m2861i()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            z = false;
                            break;
                        }
                        if (this.f2695a.charAt(this.f2696b) == new char[]{'-', '_'}[i2]) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                }
            }
            this.f2696b++;
        }
        return this.f2695a.substring(i, this.f2696b);
    }

    /* JADX INFO: renamed from: f */
    public final String m2858f() {
        int i = this.f2696b;
        while (!m2861i() && (m2865m() || m2864l("*|", "|", "_", "-"))) {
            this.f2696b++;
        }
        return this.f2695a.substring(i, this.f2696b);
    }

    /* JADX INFO: renamed from: g */
    public final String m2859g(String... strArr) {
        int i = this.f2696b;
        while (!m2861i() && !m2864l(strArr)) {
            this.f2696b++;
        }
        return this.f2695a.substring(i, this.f2696b);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2860h() {
        boolean z = false;
        while (true) {
            if (!(!m2861i() && C1034b.m2598d(this.f2695a.charAt(this.f2696b)))) {
                return z;
            }
            this.f2696b++;
            z = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2861i() {
        return this.f2695a.length() - this.f2696b == 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2862j(String str) {
        if (!m2863k(str)) {
            return false;
        }
        this.f2696b += str.length();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2863k(String str) {
        return this.f2695a.regionMatches(true, this.f2696b, str, 0, str.length());
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2864l(String... strArr) {
        for (String str : strArr) {
            if (m2863k(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2865m() {
        return !m2861i() && Character.isLetterOrDigit(this.f2695a.charAt(this.f2696b));
    }

    /* JADX INFO: renamed from: n */
    public final String m2866n() {
        String strSubstring = this.f2695a.substring(this.f2696b);
        this.f2696b = this.f2695a.length();
        return strSubstring;
    }

    public final String toString() {
        return this.f2695a.substring(this.f2696b);
    }
}
