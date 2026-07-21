package com.github.catvod.spider.support.p002A0;

import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collector;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ws */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0727ws {

    /* JADX INFO: renamed from: a */
    public static final String[] f1762a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* JADX INFO: renamed from: b */
    public static final Pattern f1763b = Pattern.compile("^/(?>(?>\\.\\.?/)+)");

    /* JADX INFO: renamed from: c */
    public static final Pattern f1764c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* JADX INFO: renamed from: d */
    public static final Pattern f1765d = Pattern.compile("[\\x00-\\x1f]*");

    /* JADX INFO: renamed from: e */
    public static final abb f1766e = new abb(new C0605se(5));

    /* JADX INFO: renamed from: f */
    public static void m1844f(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (iCodePointAt != 8203 && iCodePointAt != 173) {
                sb.appendCodePoint(iCodePointAt);
                z2 = true;
                z3 = false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: g */
    public static StringBuilder m1845g() {
        return (StringBuilder) f1766e.m910g();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1846h(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1847i(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1848j(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m1849k(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1849k(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: l */
    public static String m1850l(String str, List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        StringBuilder sbM1845g = m1845g();
        AbstractC0711wc.m1770e(sbM1845g);
        sbM1845g.append((Object) string);
        while (it.hasNext()) {
            Object next = it.next();
            sbM1845g.append(str);
            sbM1845g.append(next);
        }
        return m1852n(sbM1845g);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.catvod.spider.support.p002A0.ai] */
    /* JADX INFO: renamed from: m */
    public static Collector m1851m(final String str) {
        return Collector.of(new Supplier() { // from class: com.github.catvod.spider.support.p002A0.ai
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C0593rt(str);
            }
        }, new C0348ir(), new C0740xe(), new C0234el(7), new Collector.Characteristics[0]);
    }

    /* JADX INFO: renamed from: n */
    public static String m1852n(StringBuilder sb) {
        AbstractC0711wc.m1770e(sb);
        String string = sb.toString();
        if (sb.length() <= 8192) {
            sb.delete(0, sb.length());
            f1766e.m912i(sb);
        }
        return string;
    }

    /* JADX INFO: renamed from: o */
    public static URL m1853o(URL url, String str) {
        String strReplaceAll = f1765d.matcher(str).replaceAll("");
        if (strReplaceAll.startsWith("?")) {
            strReplaceAll = url.getPath() + strReplaceAll;
        }
        URL url2 = new URL(url, strReplaceAll);
        String strReplaceFirst = f1763b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            strReplaceFirst = strReplaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }
}
