package com.github.catvod.spider.support.p002A0;

import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.lj */
/* JADX INFO: loaded from: classes.dex */
public final class C0421lj {

    /* JADX INFO: renamed from: a */
    public static final String[] f1155a = {Marker.ANY_MARKER, "|", "_", "-"};

    /* JADX INFO: renamed from: b */
    public static final String[] f1156b = {"-", "_"};

    /* JADX INFO: renamed from: c */
    public final String f1157c;

    /* JADX INFO: renamed from: d */
    public int f1158d = 0;

    public C0421lj(String str) {
        AbstractC0711wc.m1770e(str);
        this.f1157c = str;
    }

    /* JADX INFO: renamed from: e */
    public static String m1374e(String str) {
        StringBuilder sbM1845g = AbstractC0727ws.m1845g();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    sbM1845g.append(c2);
                    c = 0;
                }
            } else {
                sbM1845g.append(c2);
            }
            c = c2;
        }
        return AbstractC0727ws.m1852n(sbM1845g);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007b A[LOOP:0: B:3:0x0008->B:45:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0054 A[EDGE_INSN: B:47:0x0054->B:38:0x0054 BREAK  A[LOOP:0: B:3:0x0008->B:45:0x007b], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final String m1375f(char c, char c2) {
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        boolean z3 = false;
        while (!m1379j()) {
            char cM1376g = m1376g();
            if (c3 != '\\') {
                if (cM1376g == '\'' && cM1376g != c && !z) {
                    z2 = !z2;
                } else if (cM1376g == '\"' && cM1376g != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (cM1376g == c) {
                        i3++;
                        if (i == -1) {
                            i = this.f1158d;
                        }
                    } else if (cM1376g == c2) {
                        i3--;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                c3 = cM1376g;
            } else if (cM1376g == 'Q') {
                z3 = true;
            } else if (cM1376g == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.f1158d;
            }
            if (i3 <= 0) {
                break;
                break;
            }
            c3 = cM1376g;
        }
        String strSubstring = i2 >= 0 ? this.f1157c.substring(i, i2) : "";
        if (i3 <= 0) {
            return strSubstring;
        }
        throw new C0283gg("Did not find balanced marker at '" + strSubstring + "'");
    }

    /* JADX INFO: renamed from: g */
    public final char m1376g() {
        int i = this.f1158d;
        this.f1158d = i + 1;
        return this.f1157c.charAt(i);
    }

    /* JADX INFO: renamed from: h */
    public final String m1377h(String... strArr) {
        String str;
        int i = this.f1158d;
        boolean z = false;
        loop0: while (true) {
            boolean zM1379j = m1379j();
            str = this.f1157c;
            if (zM1379j) {
                break;
            }
            if (str.charAt(this.f1158d) == '\\') {
                int length = this.f1157c.length();
                int i2 = this.f1158d;
                if (length - i2 > 1) {
                    this.f1158d = i2 + 2;
                    z = true;
                }
            }
            if (m1379j() || !Character.isLetterOrDigit(this.f1157c.charAt(this.f1158d))) {
                int length2 = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break loop0;
                    }
                    if (m1381l(strArr[i3])) {
                        break;
                    }
                    i3++;
                }
            }
            this.f1158d++;
        }
        String strSubstring = str.substring(i, this.f1158d);
        return z ? m1374e(strSubstring) : strSubstring;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1378i() {
        boolean z = false;
        while (!m1379j() && AbstractC0727ws.m1849k(this.f1157c.charAt(this.f1158d))) {
            this.f1158d++;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1379j() {
        return this.f1157c.length() - this.f1158d == 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1380k(String str) {
        if (!m1381l(str)) {
            return false;
        }
        this.f1158d = str.length() + this.f1158d;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1381l(String str) {
        return this.f1157c.regionMatches(true, this.f1158d, str, 0, str.length());
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1382m(char... cArr) {
        if (m1379j()) {
            return false;
        }
        for (char c : cArr) {
            if (this.f1157c.charAt(this.f1158d) == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final String m1383n() {
        int i = this.f1158d;
        String str = this.f1157c;
        String strSubstring = str.substring(i);
        this.f1158d = str.length();
        return strSubstring;
    }

    public final String toString() {
        return this.f1157c.substring(this.f1158d);
    }
}
