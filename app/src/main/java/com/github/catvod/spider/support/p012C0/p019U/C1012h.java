package com.github.catvod.spider.support.p012C0.p019U;

import com.github.catvod.spider.support.C0.U.a;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.U.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1012h {

    /* JADX INFO: renamed from: a */
    public static final int f2477a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2539a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence2.length() <= charSequence.length()) {
            return a.b(charSequence, false, charSequence.length() - charSequence2.length(), charSequence2, charSequence2.length());
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2540b(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2541c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2542d(CharSequence charSequence) {
        return !m2540b(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public static String m2543e(Iterable<?> iterable, String str) {
        Iterator<?> it;
        if (iterable == null || (it = iterable.iterator()) == null) {
            return null;
        }
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                StringBuilder sb = new StringBuilder(256);
                if (next != null) {
                    sb.append(next);
                }
                while (it.hasNext()) {
                    if (str != null) {
                        sb.append(str);
                    }
                    Object next2 = it.next();
                    if (next2 != null) {
                        sb.append(next2);
                    }
                }
                return sb.toString();
            }
            if (next != null) {
                return next.toString();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: f */
    public static String m2544f(String str, String str2) {
        return (m2541c(str) || m2541c(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    /* JADX INFO: renamed from: g */
    public static String m2545g(String str, String str2) {
        return (m2541c(str) || m2541c(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    /* JADX INFO: renamed from: h */
    public static String m2546h(String str, String str2, String str3) {
        int i = 0;
        if (m2541c(str) || m2541c(str2) || str3 == null) {
            return str;
        }
        int iA = (str == null || str2 == null) ? -1 : a.a(str, str2, 0);
        if (iA == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder((Math.max(str3.length() - length, 0) * 16) + str.length());
        int i2 = -1;
        while (iA != -1) {
            sb.append((CharSequence) str, i, iA);
            sb.append(str3);
            i = iA + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iA = a.a(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m2547i(String str, int i) {
        if (str == null) {
            return null;
        }
        int length = i < 0 ? str.length() + i : i;
        if (length < 0) {
            length = 0;
        }
        return length > str.length() ? "" : str.substring(length);
    }

    /* JADX INFO: renamed from: j */
    public static String m2548j(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        int length = i2 < 0 ? str.length() + i2 : i2;
        if (i < 0) {
            i += str.length();
        }
        if (length > str.length()) {
            length = str.length();
        }
        if (i > length) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        return str.substring(i, length >= 0 ? length : 0);
    }
}
