package com.github.catvod.spider.support.p101G;

import com.github.catvod.spider.support.p041D.C1267b;
import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p043F.C1274b;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.G.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2029a implements Map.Entry<String, String>, Cloneable {

    /* JADX INFO: renamed from: d */
    private static final String[] f4602d = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: e */
    private static final Pattern f4603e = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* JADX INFO: renamed from: f */
    private static final Pattern f4604f = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* JADX INFO: renamed from: g */
    private static final Pattern f4605g = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* JADX INFO: renamed from: h */
    private static final Pattern f4606h = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    /* JADX INFO: renamed from: a */
    private String f4607a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private String f4608b;

    /* JADX INFO: renamed from: c */
    @Nullable
    C2030b f4609c;

    public C2029a(String str, @Nullable String str2, @Nullable C2030b c2030b) {
        C1271c.m3157g(str);
        String strTrim = str.trim();
        C1271c.m3155e(strTrim);
        this.f4607a = strTrim;
        this.f4608b = str2;
        this.f4609c = c2030b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m4800b(String str, int i) {
        if (i == 2) {
            Pattern pattern = f4603e;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = f4604f.matcher(str).replaceAll("");
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (i == 1) {
            Pattern pattern2 = f4605g;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = f4606h.matcher(str).replaceAll("");
                if (pattern2.matcher(strReplaceAll2).matches()) {
                    return strReplaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX INFO: renamed from: d */
    static void m4801d(String str, @Nullable String str2, Appendable appendable, C2034f.a aVar) throws IOException {
        appendable.append(str);
        boolean z = false;
        if (aVar.m4855h() == 1) {
            if (str2 == null) {
                z = true;
            } else if (str2.isEmpty() || str2.equalsIgnoreCase(str)) {
                if (Arrays.binarySearch(f4602d, C1273a.m3165e(str)) >= 0) {
                    z = true;
                }
            }
        }
        if (z) {
            return;
        }
        appendable.append("=\"");
        C2038j.m4909d(appendable, C2030b.m4809i(str2), aVar, true, false, false, false);
        appendable.append('\"');
    }

    /* JADX INFO: renamed from: a */
    public final String m4802a() {
        return this.f4607a;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String getValue() {
        return C2030b.m4809i(this.f4608b);
    }

    public final Object clone() {
        try {
            return (C2029a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2029a.class != obj.getClass()) {
            return false;
        }
        C2029a c2029a = (C2029a) obj;
        String str = this.f4607a;
        if (str == null ? c2029a.f4607a != null : !str.equals(c2029a.f4607a)) {
            return false;
        }
        String str2 = this.f4608b;
        String str3 = c2029a.f4608b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f4607a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f4607a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4608b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(@Nullable String str) {
        int iM4824q;
        String str2 = str;
        String strM4819l = this.f4608b;
        C2030b c2030b = this.f4609c;
        if (c2030b != null && (iM4824q = c2030b.m4824q(this.f4607a)) != -1) {
            strM4819l = this.f4609c.m4819l(this.f4607a);
            this.f4609c.f4612c[iM4824q] = str2;
        }
        this.f4608b = str2;
        return C2030b.m4809i(strM4819l);
    }

    public final String toString() {
        StringBuilder sbM3171b = C1274b.m3171b();
        try {
            C2034f.a aVarM4846y0 = new C2034f("").m4846y0();
            String str = this.f4607a;
            String str2 = this.f4608b;
            String strM4800b = m4800b(str, aVarM4846y0.m4855h());
            if (strM4800b != null) {
                m4801d(strM4800b, str2, sbM3171b, aVarM4846y0);
            }
            return C1274b.m3177h(sbM3171b);
        } catch (IOException e) {
            throw new C1267b(e);
        }
    }
}
