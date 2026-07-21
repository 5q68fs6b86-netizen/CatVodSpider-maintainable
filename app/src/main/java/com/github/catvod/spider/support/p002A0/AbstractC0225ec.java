package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ec */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0225ec {

    /* JADX INFO: renamed from: a */
    public static final char[] f764a = {',', ';'};

    /* JADX INFO: renamed from: b */
    public static final HashMap f765b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final ArrayList f766c = new ArrayList(106);

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f767d = ThreadLocal.withInitial(new C0605se(3));

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f768e = new ThreadLocal();

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: f */
    public static void m1155f(Appendable appendable, EnumC0255ff enumC0255ff, int i) throws IOException {
        String str;
        int iBinarySearch = Arrays.binarySearch(enumC0255ff.f822g, i);
        if (iBinarySearch >= 0) {
            String[] strArr = enumC0255ff.f823h;
            if (iBinarySearch < strArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (enumC0255ff.f822g[i2] == i) {
                    str = strArr[i2];
                } else {
                    str = strArr[iBinarySearch];
                }
            } else {
                str = strArr[iBinarySearch];
            }
        } else {
            str = "";
        }
        if ("".equals(str)) {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        } else {
            appendable.append('&').append(str).append(';');
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1156g(int i, char c, CharsetEncoder charsetEncoder) {
        int iM1764h = AbstractC0710wb.m1764h(i);
        if (iM1764h == 0) {
            return c < 128;
        }
        if (iM1764h != 1) {
            return charsetEncoder.canEncode(c);
        }
        return c < 55296 || c >= 57344;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:91:0x0126  */
    /* JADX WARN: Code duplicated, block: B:93:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x013d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0144  */
    /* JADX WARN: Code duplicated, block: B:97:0x014d  */
    /* JADX INFO: renamed from: h */
    public static void m1157h(Appendable appendable, String str, C0674ut c0674ut, int i) {
        int i2;
        char c;
        char[] cArr;
        int chars;
        EnumC0255ff enumC0255ff = c0674ut.f1580a;
        Charset charset = c0674ut.f1581b;
        String strName = charset.name();
        int i3 = 2;
        if (strName.equals("US-ASCII")) {
            i2 = 1;
        } else {
            i2 = strName.startsWith("UTF-") ? 2 : 3;
        }
        ThreadLocal threadLocal = f768e;
        CharsetEncoder charsetEncoderNewEncoder = (CharsetEncoder) threadLocal.get();
        if (charsetEncoderNewEncoder == null || !charsetEncoderNewEncoder.charset().equals(charset)) {
            charsetEncoderNewEncoder = charset.newEncoder();
            threadLocal.set(charsetEncoderNewEncoder);
        }
        int length = str.length();
        int iCharCount = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((i & 4) == 0) {
                c = (char) iCodePointAt;
                if (iCodePointAt < 65536) {
                    if (c != '\t' || c == '\n' || c == '\r') {
                        appendable.append(c);
                    } else if (c != '\"') {
                        if (c != '<') {
                            if (c != '>') {
                                if (c != 160) {
                                    if (c == '&') {
                                        appendable.append("&amp;");
                                    } else if (c != '\'') {
                                        if (c < ' ' || !m1156g(i2, c, charsetEncoderNewEncoder)) {
                                            m1155f(appendable, enumC0255ff, iCodePointAt);
                                        } else {
                                            appendable.append(c);
                                        }
                                    } else if ((i & 2) == 0 || (i & 1) == 0) {
                                        appendable.append('\'');
                                    } else if (enumC0255ff == EnumC0255ff.xhtml) {
                                        appendable.append("&#x27;");
                                    } else {
                                        appendable.append("&apos;");
                                    }
                                } else if (enumC0255ff != EnumC0255ff.xhtml) {
                                    appendable.append("&nbsp;");
                                } else {
                                    appendable.append("&#xa0;");
                                }
                            } else if ((i & 1) != 0) {
                                appendable.append("&gt;");
                            } else {
                                appendable.append(c);
                            }
                        } else if ((i & 1) != 0 || enumC0255ff == EnumC0255ff.xhtml || c0674ut.f1585f == i3) {
                            appendable.append("&lt;");
                        } else {
                            appendable.append('<');
                        }
                    } else if ((i & 2) != 0) {
                        appendable.append("&quot;");
                    } else {
                        appendable.append(c);
                    }
                } else if (m1156g(i2, c, charsetEncoderNewEncoder)) {
                    cArr = (char[]) f767d.get();
                    chars = Character.toChars(iCodePointAt, cArr, 0);
                    if (appendable instanceof StringBuilder) {
                        ((StringBuilder) appendable).append(cArr, 0, chars);
                    } else {
                        appendable.append(new String(cArr, 0, chars));
                    }
                } else {
                    m1155f(appendable, enumC0255ff, iCodePointAt);
                }
            } else if (!AbstractC0727ws.m1849k(iCodePointAt)) {
                if (z) {
                    appendable.append(' ');
                    z = false;
                }
                z2 = true;
                z3 = false;
                c = (char) iCodePointAt;
                if (iCodePointAt < 65536) {
                    if (c != '\t') {
                        appendable.append(c);
                    } else {
                        appendable.append(c);
                    }
                } else if (m1156g(i2, c, charsetEncoderNewEncoder)) {
                    cArr = (char[]) f767d.get();
                    chars = Character.toChars(iCodePointAt, cArr, 0);
                    if (appendable instanceof StringBuilder) {
                        ((StringBuilder) appendable).append(cArr, 0, chars);
                    } else {
                        appendable.append(new String(cArr, 0, chars));
                    }
                } else {
                    m1155f(appendable, enumC0255ff, iCodePointAt);
                }
            } else if (((i & 8) == 0 || z2) && !z3) {
                if ((i & 16) != 0) {
                    z = true;
                } else {
                    appendable.append(' ');
                    z3 = true;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
            i3 = 2;
        }
    }
}
