package com.github.catvod.spider.support.p002A0;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.wf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0714wf extends AbstractC0327hx {
    /* JADX INFO: renamed from: aa */
    public static boolean m1771aa(String str, String str2, boolean z) {
        AbstractC0399ko.m1351f("<this>", str);
        AbstractC0399ko.m1351f("suffix", str2);
        return !z ? str.endsWith(str2) : m1774ad(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* JADX INFO: renamed from: ab */
    public static boolean m1772ab(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: ac */
    public static final boolean m1773ac(String str) {
        AbstractC0399ko.m1351f("<this>", str);
        if (str.length() == 0) {
            return true;
        }
        Iterable addVar = new add(0, str.length() - 1, 1);
        if ((addVar instanceof Collection) && ((Collection) addVar).isEmpty()) {
            return true;
        }
        Iterator it = addVar.iterator();
        while (((C0469nd) it).f1270c) {
            char cCharAt = str.charAt(((C0469nd) it).m1455e());
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ad */
    public static final boolean m1774ad(String str, int i, String str2, int i2, int i3, boolean z) {
        AbstractC0399ko.m1351f("<this>", str);
        AbstractC0399ko.m1351f("other", str2);
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* JADX INFO: renamed from: ae */
    public static String m1775ae(String str, char c, char c2) {
        AbstractC0399ko.m1351f("<this>", str);
        String strReplace = str.replace(c, c2);
        AbstractC0399ko.m1350e("replace(...)", strReplace);
        return strReplace;
    }

    /* JADX INFO: renamed from: af */
    public static String m1776af(String str, String str2, String str3) {
        AbstractC0399ko.m1351f("<this>", str);
        int iM1098f = AbstractC0198dc.m1098f(str, str2, 0, false);
        if (iM1098f < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM1098f);
            sb.append(str3);
            i2 = iM1098f + length;
            if (iM1098f >= str.length()) {
                break;
            }
            iM1098f = AbstractC0198dc.m1098f(str, str2, iM1098f + i, false);
        } while (iM1098f > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        AbstractC0399ko.m1350e("toString(...)", string);
        return string;
    }

    /* JADX INFO: renamed from: ag */
    public static boolean m1777ag(int i, String str, String str2, boolean z) {
        AbstractC0399ko.m1351f("<this>", str);
        return !z ? str.startsWith(str2, i) : m1774ad(str, i, str2, 0, str2.length(), z);
    }

    /* JADX INFO: renamed from: ah */
    public static boolean m1778ah(String str, String str2, boolean z) {
        AbstractC0399ko.m1351f("<this>", str);
        AbstractC0399ko.m1351f("prefix", str2);
        return !z ? str.startsWith(str2) : m1774ad(str, 0, str2, 0, str2.length(), z);
    }

    /* JADX INFO: renamed from: z */
    public static String m1779z(char[] cArr, int i, int i2) {
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int length = cArr.length;
        c0523pd.getClass();
        if (i < 0 || i2 > length) {
            throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + length);
        }
        if (i <= i2) {
            return new String(cArr, i, i2 - i);
        }
        throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
    }
}
