package com.github.catvod.spider.support.p117b;

import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.Ga */
/* JADX INFO: loaded from: classes.dex */
public final class C2146Ga {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5095a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    /* JADX INFO: renamed from: a */
    public static int m5522a(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return -1;
        }
        return str.indexOf(str2.toString(), i);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5523b(CharSequence charSequence) {
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
    public static boolean m5524c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m5525d(CharSequence charSequence) {
        return !C2149Gf.m5534b(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public static String m5526e(Iterable<?> iterable, String str) {
        Iterator<?> it;
        if (iterable == null || (it = iterable.iterator()) == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(str);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m5527f(String str, String str2) {
        return (m5524c(str) || m5524c(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    /* JADX INFO: renamed from: g */
    public static String m5528g(String str, String str2, String str3) {
        if (m5524c(str) || m5524c(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int iM5522a = m5522a(str, str2, 0);
        if (iM5522a == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (iM5522a != -1) {
            sb.append((CharSequence) str, i, iM5522a);
            sb.append(str3);
            i = iM5522a + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iM5522a = m5522a(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m5529h(int i, String str) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            i += str.length();
        }
        if (i < 0) {
            i = 0;
        }
        return i > str.length() ? "" : str.substring(i);
    }

    /* JADX INFO: renamed from: i */
    public static String m5530i(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0) {
            i2 += str.length();
        }
        if (i < 0) {
            i += str.length();
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        if (i > i2) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return str.substring(i, i2);
    }
}
