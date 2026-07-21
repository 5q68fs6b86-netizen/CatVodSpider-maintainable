package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p021Z.a;
import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1042a implements Map.Entry<String, String>, Cloneable {

    /* JADX INFO: renamed from: f */
    private static final String[] f2558f = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: c */
    private String f2559c;

    /* JADX INFO: renamed from: d */
    private String f2560d;

    /* JADX INFO: renamed from: e */
    C1044c f2561e;

    public C1042a(String str, String str2, C1044c c1044c) {
        C0966a.m2376k(str);
        String strTrim = str.trim();
        C0966a.m2374i(strTrim);
        this.f2559c = strTrim;
        this.f2560d = str2;
        this.f2561e = c1044c;
    }

    /* JADX INFO: renamed from: c */
    protected static boolean m2630c(String str, String str2, C1048g c1048g) {
        if (c1048g.m2669g() != 1) {
            return false;
        }
        if (str2 != null) {
            if (!str2.isEmpty() && !str2.equalsIgnoreCase(str)) {
                return false;
            }
            if (!(Arrays.binarySearch(f2558f, str) >= 0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final String m2631a() {
        return this.f2559c;
    }

    /* JADX INFO: renamed from: b */
    public final String m2632b() {
        String str = this.f2560d;
        return str == null ? "" : str;
    }

    public final Object clone() {
        try {
            return (C1042a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1042a.class != obj.getClass()) {
            return false;
        }
        C1042a c1042a = (C1042a) obj;
        String str = this.f2559c;
        if (str == null ? c1042a.f2559c != null : !str.equals(c1042a.f2559c)) {
            return false;
        }
        String str2 = this.f2560d;
        String str3 = c1042a.f2560d;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f2559c;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.f2560d;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f2559c;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f2560d;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String str2 = str;
        String strM2645j = this.f2560d;
        C1044c c1044c = this.f2561e;
        if (c1044c != null) {
            strM2645j = c1044c.m2645j(this.f2559c);
            int iM2650o = this.f2561e.m2650o(this.f2559c);
            if (iM2650o != -1) {
                this.f2561e.f2566e[iM2650o] = str2;
            }
        }
        this.f2560d = str2;
        return strM2645j == null ? "" : strM2645j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.support.p012C0.p021Z.a */
    public final String toString() throws a {
        StringBuilder sbM2595a = C1034b.m2595a();
        try {
            C1048g c1048gM2673s0 = new C1049h().m2673s0();
            String str = this.f2559c;
            String str2 = this.f2560d;
            sbM2595a.append((CharSequence) str);
            if (!m2630c(str, str2, c1048gM2673s0)) {
                sbM2595a.append((CharSequence) "=\"");
                if (str2 == null) {
                    str2 = "";
                }
                C1055n.m2737d(sbM2595a, str2, c1048gM2673s0, true, false, false);
                sbM2595a.append('\"');
            }
            return C1034b.m2601g(sbM2595a);
        } catch (IOException e) {
            throw new a(e);
        }
    }
}
