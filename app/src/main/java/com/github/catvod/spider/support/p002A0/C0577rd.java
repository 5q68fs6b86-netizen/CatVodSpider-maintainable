package com.github.catvod.spider.support.p002A0;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.rd */
/* JADX INFO: loaded from: classes.dex */
public class C0577rd implements Closeable {

    /* JADX INFO: renamed from: a */
    public final StringReader f1419a;

    /* JADX INFO: renamed from: h */
    public long f1426h;

    /* JADX INFO: renamed from: i */
    public int f1427i;

    /* JADX INFO: renamed from: j */
    public String f1428j;

    /* JADX INFO: renamed from: k */
    public int[] f1429k;

    /* JADX INFO: renamed from: m */
    public String[] f1431m;

    /* JADX INFO: renamed from: n */
    public int[] f1432n;

    /* JADX INFO: renamed from: o */
    public int f1433o = 2;

    /* JADX INFO: renamed from: b */
    public final char[] f1420b = new char[1024];

    /* JADX INFO: renamed from: c */
    public int f1421c = 0;

    /* JADX INFO: renamed from: d */
    public int f1422d = 0;

    /* JADX INFO: renamed from: e */
    public int f1423e = 0;

    /* JADX INFO: renamed from: f */
    public int f1424f = 0;

    /* JADX INFO: renamed from: g */
    public int f1425g = 0;

    /* JADX INFO: renamed from: l */
    public int f1430l = 1;

    static {
        C0372jo.f1078j = new C0372jo(20);
    }

    public C0577rd(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f1429k = iArr;
        iArr[0] = 6;
        this.f1431m = new String[32];
        this.f1432n = new int[32];
        this.f1419a = stringReader;
    }

    /* JADX INFO: renamed from: aa */
    public final boolean m1597aa() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s == 5) {
            this.f1425g = 0;
            int[] iArr = this.f1432n;
            int i = this.f1430l - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM1620s != 6) {
            throw m1616at("a boolean");
        }
        this.f1425g = 0;
        int[] iArr2 = this.f1432n;
        int i2 = this.f1430l - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: renamed from: ab */
    public final double m1598ab() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s == 15) {
            this.f1425g = 0;
            int[] iArr = this.f1432n;
            int i = this.f1430l - 1;
            iArr[i] = iArr[i] + 1;
            return this.f1426h;
        }
        if (iM1620s == 16) {
            this.f1428j = new String(this.f1420b, this.f1421c, this.f1427i);
            this.f1421c += this.f1427i;
        } else if (iM1620s == 8 || iM1620s == 9) {
            this.f1428j = m1604ah(iM1620s == 8 ? '\'' : '\"');
        } else if (iM1620s == 10) {
            this.f1428j = m1606aj();
        } else if (iM1620s != 11) {
            throw m1616at("a double");
        }
        this.f1425g = 11;
        double d = Double.parseDouble(this.f1428j);
        if (this.f1433o != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            m1615as("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.f1428j = null;
        this.f1425g = 0;
        int[] iArr2 = this.f1432n;
        int i2 = this.f1430l - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX INFO: renamed from: ac */
    public final int m1599ac() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s == 15) {
            long j = this.f1426h;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.f1426h + m1627z());
            }
            this.f1425g = 0;
            int[] iArr = this.f1432n;
            int i2 = this.f1430l - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM1620s == 16) {
            this.f1428j = new String(this.f1420b, this.f1421c, this.f1427i);
            this.f1421c += this.f1427i;
        } else {
            if (iM1620s != 8 && iM1620s != 9 && iM1620s != 10) {
                throw m1616at("an int");
            }
            if (iM1620s == 10) {
                this.f1428j = m1606aj();
            } else {
                this.f1428j = m1604ah(iM1620s == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f1428j);
                this.f1425g = 0;
                int[] iArr2 = this.f1432n;
                int i4 = this.f1430l - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1425g = 11;
        double d = Double.parseDouble(this.f1428j);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f1428j + m1627z());
        }
        this.f1428j = null;
        this.f1425g = 0;
        int[] iArr3 = this.f1432n;
        int i6 = this.f1430l - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    /* JADX INFO: renamed from: ad */
    public final long m1600ad() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s == 15) {
            this.f1425g = 0;
            int[] iArr = this.f1432n;
            int i = this.f1430l - 1;
            iArr[i] = iArr[i] + 1;
            return this.f1426h;
        }
        if (iM1620s == 16) {
            this.f1428j = new String(this.f1420b, this.f1421c, this.f1427i);
            this.f1421c += this.f1427i;
        } else {
            if (iM1620s != 8 && iM1620s != 9 && iM1620s != 10) {
                throw m1616at("a long");
            }
            if (iM1620s == 10) {
                this.f1428j = m1606aj();
            } else {
                this.f1428j = m1604ah(iM1620s == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f1428j);
                this.f1425g = 0;
                int[] iArr2 = this.f1432n;
                int i2 = this.f1430l - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1425g = 11;
        double d = Double.parseDouble(this.f1428j);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f1428j + m1627z());
        }
        this.f1428j = null;
        this.f1425g = 0;
        int[] iArr3 = this.f1432n;
        int i3 = this.f1430l - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    /* JADX INFO: renamed from: ae */
    public final String m1601ae() throws IOException {
        String strM1604ah;
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s == 14) {
            strM1604ah = m1606aj();
        } else if (iM1620s == 12) {
            strM1604ah = m1604ah('\'');
        } else {
            if (iM1620s != 13) {
                throw m1616at("a name");
            }
            strM1604ah = m1604ah('\"');
        }
        this.f1425g = 0;
        this.f1431m[this.f1430l - 1] = strM1604ah;
        return strM1604ah;
    }

    /* JADX INFO: renamed from: af */
    public final int m1602af(boolean z) throws IOException {
        int i = this.f1421c;
        int i2 = this.f1422d;
        while (true) {
            if (i == i2) {
                this.f1421c = i;
                if (!m1623v(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m1627z());
                }
                i = this.f1421c;
                i2 = this.f1422d;
            }
            int i3 = i + 1;
            char[] cArr = this.f1420b;
            char c = cArr[i];
            if (c == '\n') {
                this.f1423e++;
                this.f1424f = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f1421c = i3;
                    if (i3 == i2) {
                        this.f1421c = i;
                        boolean zM1623v = m1623v(2);
                        this.f1421c++;
                        if (!zM1623v) {
                            return c;
                        }
                    }
                    m1619r();
                    int i4 = this.f1421c;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f1421c = i4 + 1;
                        while (true) {
                            if (this.f1421c + 2 > this.f1422d && !m1623v(2)) {
                                m1615as("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f1421c;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 2) {
                                        i = this.f1421c + 2;
                                        i2 = this.f1422d;
                                        break;
                                    }
                                    if (cArr[this.f1421c + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.f1423e++;
                                this.f1424f = i5 + 1;
                            }
                            this.f1421c++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f1421c = i4 + 1;
                        m1612ap();
                        i = this.f1421c;
                        i2 = this.f1422d;
                    }
                } else {
                    if (c != '#') {
                        this.f1421c = i3;
                        return c;
                    }
                    this.f1421c = i3;
                    m1619r();
                    m1612ap();
                    i = this.f1421c;
                    i2 = this.f1422d;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: ag */
    public final void m1603ag() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s != 7) {
            throw m1616at("null");
        }
        this.f1425g = 0;
        int[] iArr = this.f1432n;
        int i = this.f1430l - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: renamed from: ah */
    public final String m1604ah(char c) throws C0657uc {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.f1421c;
            int i3 = this.f1422d;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.f1420b;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (this.f1433o == 3 && c2 < ' ') {
                            m1615as("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c2 == c) {
                            this.f1421c = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.f1421c = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(m1609am());
                            i2 = this.f1421c;
                            i3 = this.f1422d;
                        } else {
                            if (c2 == '\n') {
                                this.f1423e++;
                                this.f1424f = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.f1421c = i2;
        } while (m1623v(1));
        m1615as("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: ai */
    public final String m1605ai() throws IOException {
        String str;
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s == 10) {
            str = m1606aj();
        } else if (iM1620s == 8) {
            str = m1604ah('\'');
        } else if (iM1620s == 9) {
            str = m1604ah('\"');
        } else if (iM1620s == 11) {
            str = this.f1428j;
            this.f1428j = null;
        } else if (iM1620s == 15) {
            str = Long.toString(this.f1426h);
        } else {
            if (iM1620s != 16) {
                throw m1616at("a string");
            }
            str = new String(this.f1420b, this.f1421c, this.f1427i);
            this.f1421c += this.f1427i;
        }
        this.f1425g = 0;
        int[] iArr = this.f1432n;
        int i = this.f1430l - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: aj */
    public final String m1606aj() throws C0657uc {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.f1421c;
                int i4 = i3 + i2;
                int i5 = this.f1422d;
                char[] cArr = this.f1420b;
                if (i4 < i5) {
                    char c = cArr[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m1619r();
                    }
                    i = i2;
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.f1421c, i2);
                    this.f1421c += i2;
                    if (!m1623v(1)) {
                    }
                } else if (!m1623v(i2 + 1)) {
                    i = i2;
                }
                if (sb == null) {
                    string = new String(cArr, this.f1421c, i);
                } else {
                    sb.append(cArr, this.f1421c, i);
                    string = sb.toString();
                }
                this.f1421c += i;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: ak */
    public final int m1607ak() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        switch (iM1620s) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: al */
    public final void m1608al(int i) {
        int i2 = this.f1430l;
        int[] iArr = this.f1429k;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f1429k = Arrays.copyOf(iArr, i3);
            this.f1432n = Arrays.copyOf(this.f1432n, i3);
            this.f1431m = (String[]) Arrays.copyOf(this.f1431m, i3);
        }
        int[] iArr2 = this.f1429k;
        int i4 = this.f1430l;
        this.f1430l = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX INFO: renamed from: am */
    public final char m1609am() throws C0657uc {
        int i;
        if (this.f1421c == this.f1422d && !m1623v(1)) {
            m1615as("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f1421c;
        int i3 = i2 + 1;
        this.f1421c = i3;
        char[] cArr = this.f1420b;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            m1615as("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.f1422d && !m1623v(4)) {
                            m1615as("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.f1421c;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    m1615as("Malformed Unicode escape \\u".concat(new String(cArr, this.f1421c, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.f1421c += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.f1433o == 3) {
            m1615as("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f1423e++;
        this.f1424f = i3;
        if (this.f1433o == 3) {
            m1615as("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    /* JADX INFO: renamed from: an */
    public final void m1610an(int i) {
        if (i == 0) {
            throw null;
        }
        this.f1433o = i;
    }

    /* JADX INFO: renamed from: ao */
    public final void m1611ao(char c) throws C0657uc {
        do {
            int i = this.f1421c;
            int i2 = this.f1422d;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f1420b[i];
                if (c2 == c) {
                    this.f1421c = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f1421c = i3;
                    m1609am();
                    i = this.f1421c;
                    i2 = this.f1422d;
                } else {
                    if (c2 == '\n') {
                        this.f1423e++;
                        this.f1424f = i3;
                    }
                    i = i3;
                }
            }
            this.f1421c = i;
        } while (m1623v(1));
        m1615as("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: ap */
    public final void m1612ap() {
        char c;
        do {
            if (this.f1421c >= this.f1422d && !m1623v(1)) {
                return;
            }
            int i = this.f1421c;
            int i2 = i + 1;
            this.f1421c = i2;
            c = this.f1420b[i];
            if (c == '\n') {
                this.f1423e++;
                this.f1424f = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX INFO: renamed from: aq */
    public final void m1613aq() throws C0657uc {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f1421c;
                if (i2 + i < this.f1422d) {
                    char c = this.f1420b[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        m1619r();
                    }
                    this.f1421c += i;
                    return;
                }
                this.f1421c = i2 + i;
            }
        } while (m1623v(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ar */
    public final void m1614ar() throws IOException {
        int i = 0;
        do {
            int iM1620s = this.f1425g;
            if (iM1620s == 0) {
                iM1620s = m1620s();
            }
            switch (iM1620s) {
                case 1:
                    m1608al(3);
                    i++;
                    this.f1425g = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f1431m[this.f1430l - 1] = null;
                    }
                    this.f1430l--;
                    i--;
                    this.f1425g = 0;
                    break;
                case 3:
                    m1608al(1);
                    i++;
                    this.f1425g = 0;
                    break;
                case 4:
                    this.f1430l--;
                    i--;
                    this.f1425g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f1425g = 0;
                    break;
                case 8:
                    m1611ao('\'');
                    this.f1425g = 0;
                    break;
                case 9:
                    m1611ao('\"');
                    this.f1425g = 0;
                    break;
                case 10:
                    m1613aq();
                    this.f1425g = 0;
                    break;
                case 12:
                    m1611ao('\'');
                    if (i == 0) {
                        this.f1431m[this.f1430l - 1] = "<skipped>";
                    }
                    this.f1425g = 0;
                    break;
                case 13:
                    m1611ao('\"');
                    if (i == 0) {
                        this.f1431m[this.f1430l - 1] = "<skipped>";
                    }
                    this.f1425g = 0;
                    break;
                case 14:
                    m1613aq();
                    if (i == 0) {
                        this.f1431m[this.f1430l - 1] = "<skipped>";
                    }
                    this.f1425g = 0;
                    break;
                case 16:
                    this.f1421c += this.f1427i;
                    this.f1425g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f1432n;
        int i2 = this.f1430l - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX INFO: renamed from: as */
    public final void m1615as(String str) throws C0657uc {
        throw new C0657uc(str + m1627z() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    /* JADX INFO: renamed from: at */
    public final IllegalStateException m1616at(String str) {
        return new IllegalStateException("Expected " + str + " but was " + AbstractC0710wb.m1765i(m1607ak()) + m1627z() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(m1607ak() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1425g = 0;
        this.f1429k[0] = 8;
        this.f1430l = 1;
        this.f1419a.close();
    }

    /* JADX INFO: renamed from: p */
    public final void m1617p() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s != 3) {
            throw m1616at("BEGIN_ARRAY");
        }
        m1608al(1);
        this.f1432n[this.f1430l - 1] = 0;
        this.f1425g = 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m1618q() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s != 1) {
            throw m1616at("BEGIN_OBJECT");
        }
        m1608al(3);
        this.f1425g = 0;
    }

    /* JADX INFO: renamed from: r */
    public final void m1619r() throws C0657uc {
        if (this.f1433o == 1) {
            return;
        }
        m1615as("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192  */
    /* JADX WARN: Code duplicated, block: B:126:0x0198  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a9 A[PHI: r2 r4
      0x01a9: PHI (r2v51 int) = (r2v50 int), (r2v53 int) binds: [B:122:0x0190, B:129:0x01a3] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:122:0x0190, B:129:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:174:0x021c  */
    /* JADX WARN: Code duplicated, block: B:175:0x021e  */
    /* JADX WARN: Code duplicated, block: B:187:0x023f A[DONT_INVERT, PHI: r1
      0x023f: PHI (r1v65 char) = (r1v64 char), (r1v68 char) binds: [B:173:0x021a, B:179:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:188:0x0241  */
    /* JADX WARN: Code duplicated, block: B:202:0x0261  */
    /* JADX WARN: Code duplicated, block: B:204:0x0266  */
    /* JADX WARN: Code duplicated, block: B:207:0x026b  */
    /* JADX WARN: Code duplicated, block: B:212:0x027a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:213:0x027b  */
    /* JADX WARN: Code duplicated, block: B:215:0x0285  */
    /* JADX WARN: Code duplicated, block: B:217:0x028d  */
    /* JADX WARN: Code duplicated, block: B:280:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x01a0 A[SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public final int m1620s() throws IOException {
        int iM1602af;
        int i;
        String str;
        String str2;
        int i2;
        char c;
        int i3;
        int i4;
        char c2;
        int i5;
        boolean z;
        char c3;
        int i6;
        int i7;
        char c4;
        int[] iArr = this.f1429k;
        boolean z2 = true;
        int i8 = this.f1430l - 1;
        int i9 = iArr[i8];
        char[] cArr = this.f1420b;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else if (i9 == 2) {
            int iM1602af2 = m1602af(true);
            if (iM1602af2 != 44) {
                if (iM1602af2 != 59) {
                    if (iM1602af2 == 93) {
                        this.f1425g = 4;
                        return 4;
                    }
                    m1615as("Unterminated array");
                    throw null;
                }
                m1619r();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iM1602af = m1602af(true)) != 44) {
                    if (iM1602af != 59) {
                        if (iM1602af == 125) {
                            this.f1425g = 2;
                            return 2;
                        }
                        m1615as("Unterminated object");
                        throw null;
                    }
                    m1619r();
                }
                int iM1602af3 = m1602af(true);
                if (iM1602af3 == 34) {
                    this.f1425g = 13;
                    return 13;
                }
                if (iM1602af3 == 39) {
                    m1619r();
                    this.f1425g = 12;
                    return 12;
                }
                if (iM1602af3 == 125) {
                    if (i9 != 5) {
                        this.f1425g = 2;
                        return 2;
                    }
                    m1615as("Expected name");
                    throw null;
                }
                m1619r();
                this.f1421c--;
                if (m1626y((char) iM1602af3)) {
                    this.f1425g = 14;
                    return 14;
                }
                m1615as("Expected name");
                throw null;
            }
            if (i9 == 4) {
                iArr[i8] = 5;
                int iM1602af4 = m1602af(true);
                if (iM1602af4 != 58) {
                    if (iM1602af4 != 61) {
                        m1615as("Expected ':'");
                        throw null;
                    }
                    m1619r();
                    if (this.f1421c < this.f1422d || m1623v(1)) {
                        int i10 = this.f1421c;
                        if (cArr[i10] == '>') {
                            this.f1421c = i10 + 1;
                        }
                    }
                }
            } else if (i9 == 6) {
                if (this.f1433o == 1) {
                    m1602af(true);
                    int i11 = this.f1421c;
                    this.f1421c = i11 - 1;
                    if (i11 + 4 <= this.f1422d || m1623v(5)) {
                        int i12 = this.f1421c;
                        if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                            this.f1421c = i12 + 5;
                        }
                    }
                }
                this.f1429k[this.f1430l - 1] = 7;
            } else if (i9 == 7) {
                if (m1602af(false) == -1) {
                    this.f1425g = 17;
                    return 17;
                }
                m1619r();
                this.f1421c--;
            } else if (i9 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM1602af5 = m1602af(true);
        if (iM1602af5 == 34) {
            this.f1425g = 9;
            return 9;
        }
        if (iM1602af5 == 39) {
            m1619r();
            this.f1425g = 8;
            return 8;
        }
        if (iM1602af5 == 44 || iM1602af5 == 59) {
            i = 1;
        } else {
            if (iM1602af5 == 91) {
                this.f1425g = 3;
                return 3;
            }
            if (iM1602af5 != 93) {
                if (iM1602af5 == 123) {
                    this.f1425g = 1;
                    return 1;
                }
                int i13 = this.f1421c - 1;
                this.f1421c = i13;
                char c5 = cArr[i13];
                if (c5 == 't' || c5 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                } else {
                    if (c5 != 'f' && c5 != 'F') {
                        if (c5 != 'n' && c5 != 'N') {
                            i2 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i2 = 7;
                        if (i2 != 0) {
                            return i2;
                        }
                        i3 = this.f1421c;
                        i4 = this.f1422d;
                        long j = 0;
                        c2 = 0;
                        i5 = 0;
                        z = true;
                        boolean z3 = false;
                        while (true) {
                            if (i3 + i5 != i4) {
                                c3 = cArr[i3 + i5];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        i6 = i4;
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i5++;
                                            i4 = i6;
                                            z2 = true;
                                        }
                                    } else if (c3 == '-') {
                                        i6 = i4;
                                        if (c2 == 0) {
                                            c2 = 1;
                                            z3 = true;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = 6;
                                        }
                                        i5++;
                                        i4 = i6;
                                        z2 = true;
                                    } else if (c3 == '.') {
                                        i6 = i4;
                                        if (c2 == 2) {
                                            c2 = 3;
                                            i5++;
                                            i4 = i6;
                                            z2 = true;
                                        }
                                    } else if (c3 >= '0' && c3 <= '9') {
                                        if (c2 == z2 || c2 == 0) {
                                            i6 = i4;
                                            j = -(c3 - '0');
                                            c2 = 2;
                                        } else if (c2 != 2) {
                                            i6 = i4;
                                            if (c2 == 3) {
                                                c2 = 4;
                                            } else if (c2 == 5 || c2 == 6) {
                                                c2 = 7;
                                            }
                                        } else if (j != 0) {
                                            i6 = i4;
                                            long j2 = (10 * j) - ((long) (c3 - '0'));
                                            z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                            j = j2;
                                        }
                                        i5++;
                                        i4 = i6;
                                        z2 = true;
                                    } else if (!m1626y(c3)) {
                                        c4 = 2;
                                        if (c2 != 2) {
                                            if (c2 != c4 || c2 == 4 || c2 == 7) {
                                                this.f1427i = i5;
                                                i7 = 16;
                                                this.f1425g = 16;
                                            }
                                        } else if (z || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                                            c4 = 2;
                                            if (c2 != c4) {
                                            }
                                            this.f1427i = i5;
                                            i7 = 16;
                                            this.f1425g = 16;
                                        } else {
                                            if (!z3) {
                                                j = -j;
                                            }
                                            this.f1426h = j;
                                            this.f1421c += i5;
                                            i7 = 15;
                                            this.f1425g = 15;
                                        }
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (m1626y(cArr[this.f1421c])) {
                                        m1615as("Expected value");
                                        throw null;
                                    }
                                    m1619r();
                                    this.f1425g = 10;
                                    return 10;
                                }
                                i6 = i4;
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i5++;
                                i4 = i6;
                                z2 = true;
                            } else if (i5 != cArr.length) {
                                if (!m1623v(i5 + 1)) {
                                    int i14 = this.f1421c;
                                    i4 = this.f1422d;
                                    i3 = i14;
                                    c3 = cArr[i3 + i5];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            i6 = i4;
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                            i4 = i6;
                                            z2 = true;
                                        } else {
                                            i6 = i4;
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                            i4 = i6;
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (m1626y(cArr[this.f1421c])) {
                                            m1615as("Expected value");
                                            throw null;
                                        }
                                        m1619r();
                                        this.f1425g = 10;
                                        return 10;
                                    }
                                    i6 = i4;
                                    if (c2 != 5) {
                                    }
                                    c2 = 6;
                                    i5++;
                                    i4 = i6;
                                    z2 = true;
                                }
                                c4 = 2;
                                if (c2 != 2) {
                                    if (c2 != c4) {
                                    }
                                    this.f1427i = i5;
                                    i7 = 16;
                                    this.f1425g = 16;
                                } else {
                                    if (z) {
                                    }
                                    c4 = 2;
                                    if (c2 != c4) {
                                    }
                                    this.f1427i = i5;
                                    i7 = 16;
                                    this.f1425g = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m1626y(cArr[this.f1421c])) {
                                    m1615as("Expected value");
                                    throw null;
                                }
                                m1619r();
                                this.f1425g = 10;
                                return 10;
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m1626y(cArr[this.f1421c])) {
                                m1615as("Expected value");
                                throw null;
                            }
                            m1619r();
                            this.f1425g = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                }
                boolean z4 = this.f1433o != 3;
                int length = str.length();
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        if ((this.f1421c + length >= this.f1422d && !m1623v(length + 1)) || !m1626y(cArr[this.f1421c + length])) {
                            this.f1421c += length;
                            this.f1425g = i2;
                            break;
                        }
                        break;
                    }
                    if ((this.f1421c + i15 < this.f1422d || m1623v(i15 + 1)) && ((c = cArr[this.f1421c + i15]) == str.charAt(i15) || (z4 && c == str2.charAt(i15)))) {
                        i15++;
                    }
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    return i2;
                }
                i3 = this.f1421c;
                i4 = this.f1422d;
                long j3 = 0;
                c2 = 0;
                i5 = 0;
                z = true;
                boolean z5 = false;
                while (true) {
                    if (i3 + i5 != i4) {
                        c3 = cArr[i3 + i5];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                i6 = i4;
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i5++;
                                i4 = i6;
                                z2 = true;
                            } else {
                                i6 = i4;
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i5++;
                                i4 = i6;
                                z2 = true;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m1626y(cArr[this.f1421c])) {
                                m1615as("Expected value");
                                throw null;
                            }
                            m1619r();
                            this.f1425g = 10;
                            return 10;
                        }
                        i6 = i4;
                        if (c2 != 5) {
                        }
                        c2 = 6;
                        i5++;
                        i4 = i6;
                        z2 = true;
                    } else if (i5 != cArr.length) {
                        if (!m1623v(i5 + 1)) {
                            int i16 = this.f1421c;
                            i4 = this.f1422d;
                            i3 = i16;
                            c3 = cArr[i3 + i5];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    i6 = i4;
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i5++;
                                    i4 = i6;
                                    z2 = true;
                                } else {
                                    i6 = i4;
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i5++;
                                    i4 = i6;
                                    z2 = true;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m1626y(cArr[this.f1421c])) {
                                    m1615as("Expected value");
                                    throw null;
                                }
                                m1619r();
                                this.f1425g = 10;
                                return 10;
                            }
                            i6 = i4;
                            if (c2 != 5) {
                            }
                            c2 = 6;
                            i5++;
                            i4 = i6;
                            z2 = true;
                        }
                        c4 = 2;
                        if (c2 != 2) {
                            if (c2 != c4) {
                            }
                            this.f1427i = i5;
                            i7 = 16;
                            this.f1425g = 16;
                        } else {
                            if (z) {
                            }
                            c4 = 2;
                            if (c2 != c4) {
                            }
                            this.f1427i = i5;
                            i7 = 16;
                            this.f1425g = 16;
                        }
                        if (i7 != 0) {
                            return i7;
                        }
                        if (m1626y(cArr[this.f1421c])) {
                            m1615as("Expected value");
                            throw null;
                        }
                        m1619r();
                        this.f1425g = 10;
                        return 10;
                    }
                    i7 = 0;
                    if (i7 != 0) {
                        return i7;
                    }
                    if (m1626y(cArr[this.f1421c])) {
                        m1615as("Expected value");
                        throw null;
                    }
                    m1619r();
                    this.f1425g = 10;
                    return 10;
                }
            }
            i = 1;
            if (i9 == 1) {
                this.f1425g = 4;
                return 4;
            }
        }
        if (i9 != i && i9 != 2) {
            m1615as("Unexpected value");
            throw null;
        }
        m1619r();
        this.f1421c -= i;
        this.f1425g = 7;
        return 7;
    }

    /* JADX INFO: renamed from: t */
    public final void m1621t() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s != 4) {
            throw m1616at("END_ARRAY");
        }
        int i = this.f1430l;
        this.f1430l = i - 1;
        int[] iArr = this.f1432n;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f1425g = 0;
    }

    public final String toString() {
        return C0577rd.class.getSimpleName() + m1627z();
    }

    /* JADX INFO: renamed from: u */
    public final void m1622u() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        if (iM1620s != 2) {
            throw m1616at("END_OBJECT");
        }
        int i = this.f1430l;
        int i2 = i - 1;
        this.f1430l = i2;
        this.f1431m[i2] = null;
        int[] iArr = this.f1432n;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f1425g = 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1623v(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f1424f;
        int i5 = this.f1421c;
        this.f1424f = i4 - i5;
        int i6 = this.f1422d;
        char[] cArr = this.f1420b;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f1422d = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f1422d = 0;
        }
        this.f1421c = 0;
        do {
            int i8 = this.f1422d;
            int i9 = this.f1419a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f1422d + i9;
            this.f1422d = i2;
            if (this.f1423e == 0 && (i3 = this.f1424f) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f1421c++;
                this.f1424f = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final String m1624w(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f1430l;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f1429k[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f1432n[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f1431m[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(AbstractC0710wb.m1759c("Unknown scope value: ", i3));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m1625x() throws IOException {
        int iM1620s = this.f1425g;
        if (iM1620s == 0) {
            iM1620s = m1620s();
        }
        return (iM1620s == 2 || iM1620s == 4 || iM1620s == 17) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1626y(char c) throws C0657uc {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m1619r();
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final String m1627z() {
        return " at line " + (this.f1423e + 1) + " column " + ((this.f1421c - this.f1424f) + 1) + " path " + m1624w(false);
    }
