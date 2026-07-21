package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p052H.C1373a;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1381a implements Map.Entry<String, String>, Cloneable {

    /* JADX INFO: renamed from: d */
    private static final String[] f3176d = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: e */
    private static final Pattern f3177e = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* JADX INFO: renamed from: f */
    private static final Pattern f3178f = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* JADX INFO: renamed from: g */
    private static final Pattern f3179g = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* JADX INFO: renamed from: h */
    private static final Pattern f3180h = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    /* JADX INFO: renamed from: a */
    private String f3181a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private String f3182b;

    /* JADX INFO: renamed from: c */
    @Nullable
    C1383c f3183c;

    public C1381a(String str, @Nullable String str2, @Nullable C1383c c1383c) {
        C1377c.m3360g(str);
        String strTrim = str.trim();
        C1377c.m3358e(strTrim);
        this.f3181a = strTrim;
        this.f3182b = str2;
        this.f3183c = c1383c;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m3373b(String str, int i) {
        if (i == 2) {
            Pattern pattern = f3177e;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = f3178f.matcher(str).replaceAll("");
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (i == 1) {
            Pattern pattern2 = f3179g;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = f3180h.matcher(str).replaceAll("");
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
    static void m3374d(String str, @Nullable String str2, Appendable appendable, C1387g c1387g) throws IOException {
        appendable.append(str);
        boolean z = false;
        if (c1387g.m3423k() == 1) {
            if (str2 == null) {
                z = true;
            } else if (str2.isEmpty() || str2.equalsIgnoreCase(str)) {
                if (Arrays.binarySearch(f3176d, C1286l.m3219d(str)) >= 0) {
                    z = true;
                }
            }
        }
        if (z) {
            return;
        }
        appendable.append("=\"");
        C1395o.m3501d(appendable, C1383c.m3382i(str2), c1387g, true, false, false, false);
        appendable.append('\"');
    }

    /* JADX INFO: renamed from: a */
    public final String m3375a() {
        return this.f3181a;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String getValue() {
        return C1383c.m3382i(this.f3182b);
    }

    public final Object clone() {
        try {
            return (C1381a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1381a.class != obj.getClass()) {
            return false;
        }
        C1381a c1381a = (C1381a) obj;
        String str = this.f3181a;
        if (str == null ? c1381a.f3181a != null : !str.equals(c1381a.f3181a)) {
            return false;
        }
        String str2 = this.f3182b;
        String str3 = c1381a.f3182b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f3181a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f3181a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3182b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(@Nullable String str) {
        int iM3397q;
        String str2 = str;
        String strM3392l = this.f3182b;
        C1383c c1383c = this.f3183c;
        if (c1383c != null && (iM3397q = c1383c.m3397q(this.f3181a)) != -1) {
            strM3392l = this.f3183c.m3392l(this.f3181a);
            this.f3183c.f3188c[iM3397q] = str2;
        }
        this.f3182b = str2;
        return C1383c.m3382i(strM3392l);
    }

    public final String toString() {
        StringBuilder sbM3363b = C1380b.m3363b();
        try {
            C1387g c1387gM3424A0 = new C1388h("").m3424A0();
            String str = this.f3181a;
            String str2 = this.f3182b;
            String strM3373b = m3373b(str, c1387gM3424A0.m3423k());
            if (strM3373b != null) {
                m3374d(strM3373b, str2, sbM3363b, c1387gM3424A0);
            }
            return C1380b.m3369h(sbM3363b);
        } catch (IOException e) {
            throw new C1373a(e);
        }
    }
}
