package com.github.catvod.spider.support.p044FM.p047C;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.C.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1305h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3028a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3247a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return C1298a.m3241b(charSequence, false, charSequence.length() - charSequence2.length(), charSequence2, charSequence2.length());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3248b(CharSequence charSequence) {
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
    public static boolean m3249c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3250d(CharSequence charSequence) {
        return !m3248b(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public static String m3251e(Iterable<?> iterable, String str) {
        Iterator<?> it;
        Object next;
        if (iterable == null || (it = iterable.iterator()) == null) {
            return null;
        }
        if (it.hasNext()) {
            Object next2 = it.next();
            if (it.hasNext()) {
                StringBuilder sb = new StringBuilder(256);
                if (next2 == null) {
                    sb.append(next2);
                    while (it.hasNext()) {
                        if (str != null) {
                            sb.append(str);
                        }
                        next = it.next();
                        if (next != null) {
                            sb.append(next);
                        }
                    }
                    return sb.toString();
                }
                sb.append(next);
            } else if (next2 != null) {
                return next2.toString();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: f */
    public static String m3252f(String str, String str2) {
        return (m3249c(str) || m3249c(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    /* JADX INFO: renamed from: g */
    public static String m3253g(String str, String str2) {
        return (m3249c(str) || m3249c(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    /* JADX INFO: renamed from: h */
    public static String m3254h(String str, String str2, String str3) {
        if (m3249c(str) || m3249c(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int iM3240a = (str == null || str2 == null) ? -1 : C1298a.m3240a(str, str2, 0);
        if (iM3240a == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (iM3240a != -1) {
            sb.append((CharSequence) str, i, iM3240a);
            sb.append(str3);
            i = iM3240a + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iM3240a = C1298a.m3240a(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m3255i(String str, int i) {
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
    public static String m3256j(String str, int i, int i2) {
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

    /* JADX INFO: renamed from: k */
    public static String m3257k(String str, String str2, String str3) {
        int iIndexOf;
        int iIndexOf2;
        boolean z = false;
        Object[] objArr = {str, str2, str3};
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = true;
                break;
            }
            if (objArr[i] == null) {
                break;
            }
            i++;
        }
        if (!z || (iIndexOf = str.indexOf(str2)) == -1 || (iIndexOf2 = str.indexOf(str3, str2.length() + iIndexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + iIndexOf, iIndexOf2);
    }
}
