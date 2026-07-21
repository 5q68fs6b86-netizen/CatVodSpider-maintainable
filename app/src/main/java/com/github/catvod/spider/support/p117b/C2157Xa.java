package com.github.catvod.spider.support.p117b;

import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.Xa */
/* JADX INFO: loaded from: classes.dex */
public final class C2157Xa {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5167a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    /* JADX INFO: renamed from: a */
    public static String m5633a(String str, String str2) {
        return str == null ? str2 : str;
    }

    /* JADX INFO: renamed from: b */
    public static int m5634b(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return -1;
        }
        return str.indexOf(str2.toString(), i);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m5635c(CharSequence charSequence) {
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

    /* JADX INFO: renamed from: d */
    public static boolean m5636d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m5637e(CharSequence charSequence) {
        return !m5635c(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static String m5638f(Iterable<?> iterable, String str) {
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

    /* JADX INFO: renamed from: g */
    public static String m5639g(String str, String str2) {
        return (m5636d(str) || m5636d(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    /* JADX INFO: renamed from: h */
    public static String m5640h(String str, String str2, String str3) {
        if (m5636d(str) || m5636d(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int iM5634b = m5634b(str, str2, 0);
        if (iM5634b == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (iM5634b != -1) {
            sb.append((CharSequence) str, i, iM5634b);
            sb.append(str3);
            i = iM5634b + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iM5634b = m5634b(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m5641i(int i, String str) {
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

    /* JADX INFO: renamed from: j */
    public static String m5642j(String str, int i, int i2) {
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
