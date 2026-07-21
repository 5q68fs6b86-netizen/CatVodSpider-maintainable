package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p056L.C1455a;
import com.github.catvod.spider.support.p044FM.p098x.C1932g;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p055K.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1395o {

    /* JADX INFO: renamed from: a */
    private static final char[] f3217a = {',', ';'};

    /* JADX INFO: renamed from: b */
    private static final HashMap<String, String> f3218b = new HashMap<>();

    static {
        new C1387g();
    }

    /* JADX INFO: renamed from: a */
    static void m3498a(EnumC1394n enumC1394n, String str, int i) {
        int i2;
        enumC1394n.f3213a = new String[i];
        enumC1394n.f3214b = new int[i];
        enumC1394n.f3215c = new int[i];
        enumC1394n.f3216d = new String[i];
        C1455a c1455a = new C1455a(new StringReader(str), str.length());
        int i3 = 0;
        while (!c1455a.m3679w()) {
            try {
                String strM3672p = c1455a.m3672p('=');
                c1455a.m3659a();
                int i4 = Integer.parseInt(c1455a.m3673q(f3217a), 36);
                char cM3677u = c1455a.m3677u();
                c1455a.m3659a();
                if (cM3677u == ',') {
                    i2 = Integer.parseInt(c1455a.m3672p(';'), 36);
                    c1455a.m3659a();
                } else {
                    i2 = -1;
                }
                int i5 = Integer.parseInt(c1455a.m3672p('&'), 36);
                c1455a.m3659a();
                enumC1394n.f3213a[i3] = strM3672p;
                enumC1394n.f3214b[i3] = i4;
                enumC1394n.f3215c[i5] = i4;
                enumC1394n.f3216d[i5] = strM3672p;
                if (i2 != -1) {
                    f3218b.put(strM3672p, new String(new int[]{i4, i2}, 0, 2));
                }
                i3++;
            } catch (Throwable th) {
                c1455a.m3660d();
                throw th;
            }
        }
        C1377c.m3357d(i3 == i, "Unexpected count of entities loaded");
        c1455a.m3660d();
    }

    /* JADX INFO: renamed from: b */
    private static void m3499b(Appendable appendable, EnumC1394n enumC1394n, int i) throws IOException {
        Appendable appendableAppend;
        String strM3497j = enumC1394n.m3497j(i);
        if ("".equals(strM3497j)) {
            appendableAppend = appendable.append("&#x");
            strM3497j = Integer.toHexString(i);
        } else {
            appendableAppend = appendable.append('&');
        }
        appendableAppend.append(strM3497j).append(';');
    }

    /* JADX INFO: renamed from: c */
    public static int m3500c(String str, int[] iArr) {
        String str2 = f3218b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iM3496i = EnumC1394n.extended.m3496i(str);
        if (iM3496i == -1) {
            return 0;
        }
        iArr[0] = iM3496i;
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd A[PHI: r6
      0x00bd: PHI (r6v1 java.lang.String) = 
      (r6v0 java.lang.String)
      (r6v6 java.lang.String)
      (r6v8 java.lang.String)
      (r6v10 java.lang.String)
      (r6v14 java.lang.String)
      (r6v17 java.lang.String)
      (r6v18 java.lang.String)
     binds: [B:65:0x00bb, B:62:0x00a7, B:60:0x00a2, B:59:0x009f, B:53:0x008f, B:51:0x008a, B:50:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX INFO: renamed from: d */
    static void m3501d(Appendable appendable, String str, C1387g c1387g, boolean z, boolean z2, boolean z3, boolean z4) throws IOException {
        String str2;
        char c;
        int iM4675a;
        EnumC1394n enumC1394nM3416d = c1387g.m3416d();
        CharsetEncoder charsetEncoderM3414b = c1387g.m3414b();
        int i = c1387g.f3192d;
        int length = str.length();
        int iCharCount = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            boolean zCanEncode = true;
            if (z2) {
                if (!C1380b.m3366e(iCodePointAt)) {
                    if (z5) {
                        appendable.append(' ');
                        z5 = false;
                    }
                    z6 = true;
                    z7 = false;
                    if (iCodePointAt < 65536) {
                        c = (char) iCodePointAt;
                        if (c != '\t') {
                            if (c != '\"') {
                                if (c != '&') {
                                    str2 = "&amp;";
                                } else if (c == '<') {
                                    if (z) {
                                    }
                                    str2 = "&lt;";
                                } else if (c != '>') {
                                    if (c != 160) {
                                        if (c >= ' ') {
                                            iM4675a = C1932g.m4675a(i);
                                            if (iM4675a != 0) {
                                                if (iM4675a != 1) {
                                                    zCanEncode = charsetEncoderM3414b.canEncode(c);
                                                }
                                            } else if (c >= 128) {
                                                zCanEncode = false;
                                            }
                                            if (!zCanEncode) {
                                            }
                                        }
                                        m3499b(appendable, enumC1394nM3416d, iCodePointAt);
                                    } else if (enumC1394nM3416d != EnumC1394n.xhtml) {
                                        str2 = "&nbsp;";
                                    } else {
                                        str2 = "&#xa0;";
                                    }
                                } else if (!z) {
                                    str2 = "&gt;";
                                }
                                appendable.append(str2);
                            } else if (z) {
                                str2 = "&quot;";
                                appendable.append(str2);
                            }
                        }
                        appendable.append(c);
                    } else {
                        str2 = new String(Character.toChars(iCodePointAt));
                        if (charsetEncoderM3414b.canEncode(str2)) {
                            appendable.append(str2);
                        } else {
                            m3499b(appendable, enumC1394nM3416d, iCodePointAt);
                        }
                    }
                } else if ((!z3 || z6) && !z7) {
                    if (z4) {
                        z5 = true;
                    } else {
                        appendable.append(' ');
                        z7 = true;
                    }
                }
            } else if (iCodePointAt < 65536) {
                c = (char) iCodePointAt;
                if (c != '\t' && c != '\n' && c != '\r') {
                    if (c != '\"') {
                        if (c != '&') {
                            str2 = "&amp;";
                        } else if (c == '<') {
                            if (c != '>') {
                                if (c != 160) {
                                    if (c >= ' ') {
                                        iM4675a = C1932g.m4675a(i);
                                        if (iM4675a != 0) {
                                            if (iM4675a != 1) {
                                                zCanEncode = charsetEncoderM3414b.canEncode(c);
                                            }
                                        } else if (c >= 128) {
                                            zCanEncode = false;
                                        }
                                        if (!zCanEncode) {
                                        }
                                    }
                                    m3499b(appendable, enumC1394nM3416d, iCodePointAt);
                                } else if (enumC1394nM3416d != EnumC1394n.xhtml) {
                                    str2 = "&nbsp;";
                                } else {
                                    str2 = "&#xa0;";
                                }
                            } else if (!z) {
                                str2 = "&gt;";
                            }
                        } else if (z || enumC1394nM3416d == EnumC1394n.xhtml || c1387g.m3423k() == 2) {
                            str2 = "&lt;";
                        }
                        appendable.append(str2);
                    } else if (z) {
                        str2 = "&quot;";
                        appendable.append(str2);
                    }
                }
                appendable.append(c);
            } else {
                str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoderM3414b.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    m3499b(appendable, enumC1394nM3416d, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3502e(String str) {
        return EnumC1394n.base.m3496i(str) != -1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3503f(String str) {
        return EnumC1394n.extended.m3496i(str) != -1;
    }
}
