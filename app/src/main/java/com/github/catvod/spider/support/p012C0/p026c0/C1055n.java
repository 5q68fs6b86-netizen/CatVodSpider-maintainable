package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p028d0.C1119a;
import com.github.catvod.spider.support.p012C0.p037l.C1257a;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1055n {

    /* JADX INFO: renamed from: a */
    private static final char[] f2593a = {',', ';'};

    /* JADX INFO: renamed from: b */
    private static final HashMap<String, String> f2594b = new HashMap<>();

    static {
        new C1048g();
    }

    /* JADX INFO: renamed from: a */
    static void m2734a(EnumC1054m enumC1054m, String str, int i) {
        int i2;
        enumC1054m.f2589c = new String[i];
        enumC1054m.f2590d = new int[i];
        enumC1054m.f2591e = new int[i];
        enumC1054m.f2592f = new String[i];
        C1119a c1119a = new C1119a(new StringReader(str), str.length());
        int i3 = 0;
        while (!c1119a.m2917t()) {
            String strM2912o = c1119a.m2912o('=');
            c1119a.m2900a();
            int i4 = Integer.parseInt(c1119a.m2913p(f2593a), 36);
            char cM2916s = c1119a.m2916s();
            c1119a.m2900a();
            if (cM2916s == ',') {
                i2 = Integer.parseInt(c1119a.m2912o(';'), 36);
                c1119a.m2900a();
            } else {
                i2 = -1;
            }
            int i5 = Integer.parseInt(c1119a.m2912o('&'), 36);
            c1119a.m2900a();
            enumC1054m.f2589c[i3] = strM2912o;
            enumC1054m.f2590d[i3] = i4;
            enumC1054m.f2591e[i5] = i4;
            enumC1054m.f2592f[i5] = strM2912o;
            if (i2 != -1) {
                f2594b.put(strM2912o, new String(new int[]{i4, i2}, 0, 2));
            }
            i3++;
        }
        if (!(i3 == i)) {
            throw new IllegalArgumentException("Unexpected count of entities loaded");
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m2735b(Appendable appendable, EnumC1054m enumC1054m, int i) throws IOException {
        Appendable appendableAppend;
        String strM2733j = enumC1054m.m2733j(i);
        if ("".equals(strM2733j)) {
            appendableAppend = appendable.append("&#x");
            strM2733j = Integer.toHexString(i);
        } else {
            appendableAppend = appendable.append('&');
        }
        appendableAppend.append(strM2733j).append(';');
    }

    /* JADX INFO: renamed from: c */
    public static int m2736c(String str, int[] iArr) {
        String str2 = f2594b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iM2732i = EnumC1054m.extended.m2732i(str);
        if (iM2732i == -1) {
            return 0;
        }
        iArr[0] = iM2732i;
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX INFO: renamed from: d */
    static void m2737d(Appendable appendable, String str, C1048g c1048g, boolean z, boolean z2, boolean z3) {
        boolean z4;
        String str2;
        boolean zCanEncode;
        EnumC1054m enumC1054mM2665c = c1048g.m2665c();
        CharsetEncoder charsetEncoderM2664b = c1048g.m2664b();
        int i = c1048g.f2570f;
        int length = str.length();
        boolean z5 = false;
        boolean z6 = false;
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (z2) {
                if (!C1034b.m2598d(iCodePointAt)) {
                    z4 = true;
                    z6 = false;
                } else if ((!z3 || z5) && !z6) {
                    appendable.append(' ');
                    z6 = true;
                }
                iCharCount = Character.charCount(iCodePointAt) + iCharCount;
            } else {
                z4 = z5;
            }
            if (iCodePointAt < 65536) {
                char c = (char) iCodePointAt;
                if (c != '\"') {
                    if (c == '&') {
                        str2 = "&amp;";
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c != 160) {
                                int iM3131a = C1257a.m3131a(i);
                                if (iM3131a != 0) {
                                    zCanEncode = iM3131a != 1 ? charsetEncoderM2664b.canEncode(c) : true;
                                } else {
                                    zCanEncode = c < 128;
                                }
                                if (zCanEncode) {
                                    appendable.append(c);
                                    z5 = z4;
                                } else {
                                    m2735b(appendable, enumC1054mM2665c, iCodePointAt);
                                    z5 = z4;
                                }
                            } else {
                                str2 = enumC1054mM2665c != EnumC1054m.xhtml ? "&nbsp;" : "&#xa0;";
                            }
                        } else if (z) {
                            appendable.append(c);
                            z5 = z4;
                        } else {
                            str2 = "&gt;";
                        }
                    } else if (!z || enumC1054mM2665c == EnumC1054m.xhtml || c1048g.m2669g() == 2) {
                        str2 = "&lt;";
                    } else {
                        appendable.append(c);
                        z5 = z4;
                    }
                    appendable.append(str2);
                    z5 = z4;
                } else if (z) {
                    str2 = "&quot;";
                    appendable.append(str2);
                    z5 = z4;
                } else {
                    appendable.append(c);
                    z5 = z4;
                }
            } else {
                str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoderM2664b.canEncode(str2)) {
                    appendable.append(str2);
                    z5 = z4;
                } else {
                    m2735b(appendable, enumC1054mM2665c, iCodePointAt);
                    z5 = z4;
                }
            }
            iCharCount = Character.charCount(iCodePointAt) + iCharCount;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2738e(String str) {
        return EnumC1054m.base.m2732i(str) != -1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2739f(String str) {
        return EnumC1054m.extended.m2732i(str) != -1;
    }
}
