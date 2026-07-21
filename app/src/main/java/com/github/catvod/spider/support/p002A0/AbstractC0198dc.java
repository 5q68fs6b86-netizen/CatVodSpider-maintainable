package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.dc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0198dc extends AbstractC0714wf {
    /* JADX INFO: renamed from: c */
    public static boolean m1095c(CharSequence charSequence, char c) {
        AbstractC0399ko.m1351f("<this>", charSequence);
        return m1099g(charSequence, c, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1096d(String str, String str2) {
        AbstractC0399ko.m1351f("<this>", str);
        return m1100h(str, str2, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: e */
    public static final int m1097e(CharSequence charSequence) {
        AbstractC0399ko.m1351f("<this>", charSequence);
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: f */
    public static final int m1098f(CharSequence charSequence, String str, int i, boolean z) {
        AbstractC0399ko.m1351f("<this>", charSequence);
        AbstractC0399ko.m1351f("string", str);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        add addVar = new add(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = addVar.f430c;
        int i3 = addVar.f429b;
        int i4 = addVar.f428a;
        if (z2 && (str instanceof String)) {
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (!AbstractC0714wf.m1774ad(str, 0, (String) charSequence, i4, str.length(), z)) {
                    if (i4 != i3) {
                        i4 += i2;
                    }
                }
                return i4;
            }
            return -1;
        }
        if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            while (!m1105m(str, 0, charSequence, i4, str.length(), z)) {
                if (i4 != i3) {
                    i4 += i2;
                }
            }
            return i4;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static int m1099g(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        AbstractC0399ko.m1351f("<this>", charSequence);
        return !(charSequence instanceof String) ? m1101i(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m1100h(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m1098f(charSequence, str, i, false);
    }

    /* JADX INFO: renamed from: i */
    public static final int m1101i(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int i2;
        AbstractC0399ko.m1351f("<this>", charSequence);
        boolean z2 = true;
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        add addVar = new add(i, m1097e(charSequence), 1);
        int i3 = addVar.f430c;
        int i4 = addVar.f429b;
        if (i3 <= 0 ? i < i4 : i > i4) {
            z2 = false;
        }
        if (!z2) {
            i = i4;
        }
        while (z2) {
            if (i != i4) {
                i2 = i + i3;
            } else {
                if (!z2) {
                    throw new NoSuchElementException();
                }
                i2 = i;
                z2 = false;
            }
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC0462mx.m1442b(c, cCharAt, z)) {
                    return i;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static int m1102j(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m1097e(str);
        }
        AbstractC0399ko.m1351f("<this>", str);
        return str.lastIndexOf(c, i);
    }

    /* JADX INFO: renamed from: k */
    public static int m1103k(String str, String str2, int i) {
        int iM1097e = (i & 2) != 0 ? m1097e(str) : 0;
        AbstractC0399ko.m1351f("<this>", str);
        AbstractC0399ko.m1351f("string", str2);
        return str.lastIndexOf(str2, iM1097e);
    }

    /* JADX INFO: renamed from: l */
    public static acr m1104l(String str, String[] strArr) {
        return new acr(str, new C0117ac(1, AbstractC0548qb.m1567c(strArr)));
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m1105m(String str, int i, CharSequence charSequence, int i2, int i3, boolean z) {
        AbstractC0399ko.m1351f("<this>", str);
        AbstractC0399ko.m1351f("other", charSequence);
        if (i2 < 0 || i < 0 || i > str.length() - i3 || i2 > charSequence.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC0462mx.m1442b(str.charAt(i + i4), charSequence.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static String m1106n(String str, String str2) {
        AbstractC0399ko.m1351f("<this>", str);
        AbstractC0399ko.m1351f("prefix", str2);
        if (!m1110r(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC0399ko.m1350e("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: o */
    public static final List m1107o(String str, String str2) {
        int iM1098f = m1098f(str, str2, 0, false);
        if (iM1098f == -1) {
            return AbstractC0624sx.m1710l(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(str.subSequence(length, iM1098f).toString());
            length = str2.length() + iM1098f;
            iM1098f = m1098f(str, str2, length, false);
        } while (iM1098f != -1);
        arrayList.add(str.subSequence(length, str.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public static List m1108p(String str, char[] cArr) {
        AbstractC0399ko.m1351f("<this>", str);
        if (cArr.length == 1) {
            return m1107o(str, String.valueOf(cArr[0]));
        }
        C0397km c0397km = new C0397km(new acr(str, new C0117ac(0, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC0625sy.m1711m(c0397km));
        Iterator it = c0397km.iterator();
        while (true) {
            acq acqVar = (acq) it;
            if (!acqVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(m1111s(str, (add) acqVar.next()));
        }
    }

    /* JADX INFO: renamed from: q */
    public static List m1109q(String str, String[] strArr) {
        AbstractC0399ko.m1351f("<this>", str);
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return m1107o(str, str2);
            }
        }
        C0397km c0397km = new C0397km(m1104l(str, strArr));
        ArrayList arrayList = new ArrayList(AbstractC0625sy.m1711m(c0397km));
        Iterator it = c0397km.iterator();
        while (true) {
            acq acqVar = (acq) it;
            if (!acqVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(m1111s(str, (add) acqVar.next()));
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1110r(String str, String str2) {
        AbstractC0399ko.m1351f("<this>", str);
        AbstractC0399ko.m1351f("prefix", str2);
        return AbstractC0714wf.m1778ah(str, str2, false);
    }

    /* JADX INFO: renamed from: s */
    public static final String m1111s(String str, add addVar) {
        AbstractC0399ko.m1351f("<this>", str);
        AbstractC0399ko.m1351f("range", addVar);
        return str.subSequence(addVar.f428a, addVar.f429b + 1).toString();
    }

    /* JADX INFO: renamed from: t */
    public static String m1112t(String str, String str2) {
        AbstractC0399ko.m1351f("delimiter", str2);
        int iM1100h = m1100h(str, str2, 0, 6);
        if (iM1100h == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iM1100h, str.length());
        AbstractC0399ko.m1350e("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: u */
    public static String m1113u(String str) {
        AbstractC0399ko.m1351f("<this>", str);
        AbstractC0399ko.m1351f("missingDelimiterValue", str);
        int iM1102j = m1102j(str, '.', 0, 6);
        if (iM1102j == -1) {
            return str;
        }
        String strSubstring = str.substring(iM1102j + 1, str.length());
        AbstractC0399ko.m1350e("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: v */
    public static String m1114v(String str, int i) {
        AbstractC0399ko.m1351f("<this>", str);
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        AbstractC0399ko.m1350e("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: w */
    public static CharSequence m1115w(String str) {
        AbstractC0399ko.m1351f("<this>", str);
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
