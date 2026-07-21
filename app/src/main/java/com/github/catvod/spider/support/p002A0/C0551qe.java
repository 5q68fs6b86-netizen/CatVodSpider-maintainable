package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.qe */
/* JADX INFO: loaded from: classes.dex */
public final class C0551qe implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: a */
    public static final String[] f1394a = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: b */
    public static final Pattern f1395b = Pattern.compile("[^-a-zA-Z0-9_:.]+");

    /* JADX INFO: renamed from: c */
    public static final Pattern f1396c = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* JADX INFO: renamed from: d */
    public final String f1397d;

    /* JADX INFO: renamed from: e */
    public String f1398e;

    /* JADX INFO: renamed from: f */
    public C0554qh f1399f;

    public C0551qe(String str, String str2, C0554qh c0554qh) {
        AbstractC0711wc.m1770e(str);
        String strTrim = str.trim();
        AbstractC0711wc.m1768c(strTrim);
        this.f1397d = strTrim;
        this.f1398e = str2;
        this.f1399f = c0554qh;
    }

    /* JADX INFO: renamed from: g */
    public static String m1577g(String str, int i) {
        if (i == 2 && !m1580j(str)) {
            String strReplaceAll = f1395b.matcher(str).replaceAll("_");
            if (m1580j(strReplaceAll)) {
                return strReplaceAll;
            }
            return null;
        }
        if (i != 1 || m1579i(str)) {
            return str;
        }
        String strReplaceAll2 = f1396c.matcher(str).replaceAll("_");
        if (m1579i(strReplaceAll2)) {
            return strReplaceAll2;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static void m1578h(String str, String str2, Appendable appendable, C0674ut c0674ut) throws IOException {
        appendable.append(str);
        if (c0674ut.f1585f == 1) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f1394a, AbstractC0552qf.m1581c(str)) >= 0) {
                return;
            }
        }
        appendable.append("=\"");
        if (str2 == null) {
            str2 = "";
        }
        AbstractC0225ec.m1157h(appendable, str2, c0674ut, 2);
        appendable.append('\"');
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1579i(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || ((cCharAt >= 127 && cCharAt <= 159) || cCharAt == ' ' || cCharAt == '\"' || cCharAt == '\'' || cCharAt == '/' || cCharAt == '=')) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1580j(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '_' || cCharAt == ':')) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '-' || cCharAt2 == '_' || cCharAt2 == ':' || cCharAt2 == '.'))) {
                return false;
            }
        }
        return true;
    }

    public final Object clone() {
        try {
            return (C0551qe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0551qe.class != obj.getClass()) {
            return false;
        }
        C0551qe c0551qe = (C0551qe) obj;
        return Objects.equals(this.f1397d, c0551qe.f1397d) && Objects.equals(this.f1398e, c0551qe.f1398e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1397d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        String str = this.f1398e;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hash(this.f1397d, this.f1398e);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        int iM1592l;
        String str2 = (String) obj;
        String strM1588h = this.f1398e;
        C0554qh c0554qh = this.f1399f;
        if (c0554qh != null && (iM1592l = c0554qh.m1592l((str = this.f1397d))) != -1) {
            strM1588h = this.f1399f.m1588h(str);
            this.f1399f.f1407c[iM1592l] = str2;
        }
        this.f1398e = str2;
        return strM1588h == null ? "" : strM1588h;
    }

    public final String toString() {
        StringBuilder sbM1845g = AbstractC0727ws.m1845g();
        try {
            C0674ut c0674ut = new C0235em().f783a;
            String str = this.f1398e;
            String strM1577g = m1577g(this.f1397d, c0674ut.f1585f);
            if (strM1577g != null) {
                m1578h(strM1577g, str, sbM1845g, c0674ut);
            }
            return AbstractC0727ws.m1852n(sbM1845g);
        } catch (IOException e) {
            throw new C0649tv(e);
        }
    }
}
