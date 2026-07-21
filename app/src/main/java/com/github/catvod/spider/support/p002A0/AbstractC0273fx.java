package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.fx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0273fx {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f848a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    /* JADX INFO: renamed from: b */
    public static int m1236b(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return -1;
        }
        return str.indexOf(str2.toString(), i);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1237c(String str) {
        int length = str == null ? 0 : str.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1238d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: e */
    public static String m1239e(Iterable iterable, String str) {
        Iterator it;
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
    public static String m1240f(String str, String str2) {
        return (m1238d(str) || m1238d(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    /* JADX INFO: renamed from: g */
    public static String m1241g(String str, String str2, String str3) {
        if (m1238d(str) || m1238d(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int iM1236b = m1236b(str, str2, 0);
        if (iM1236b == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (iM1236b != -1) {
            sb.append((CharSequence) str, i, iM1236b);
            sb.append(str3);
            i = iM1236b + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iM1236b = m1236b(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }
}
