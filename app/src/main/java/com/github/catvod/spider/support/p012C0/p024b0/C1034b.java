package com.github.catvod.spider.support.p012C0.p024b0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.b0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1034b {

    /* JADX INFO: renamed from: a */
    static final String[] f2513a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* JADX INFO: renamed from: b */
    private static Pattern f2514b = Pattern.compile("^/((\\.{1,2}/)+)");

    /* JADX INFO: renamed from: c */
    private static final ThreadLocal<Stack<StringBuilder>> f2515c = new C1033a();

    /* JADX INFO: renamed from: d */
    public static final int f2516d = 0;

    /* JADX INFO: renamed from: a */
    public static StringBuilder m2595a() {
        Stack<StringBuilder> stack = f2515c.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2596b(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2597c(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m2598d(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2598d(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: e */
    public static String m2599e(Collection<?> collection, String str) {
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        StringBuilder sbM2595a = m2595a();
        C0966a.m2376k(sbM2595a);
        Object obj = string;
        while (true) {
            sbM2595a.append(obj);
            if (!it.hasNext()) {
                return m2601g(sbM2595a);
            }
            Object next = it.next();
            sbM2595a.append(str);
            obj = next;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m2600f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        String[] strArr = f2513a;
        if (i < 21) {
            return strArr[i];
        }
        int iMin = Math.min(i, 30);
        char[] cArr = new char[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            cArr[i2] = ' ';
        }
        return String.valueOf(cArr);
    }

    /* JADX INFO: renamed from: g */
    public static String m2601g(StringBuilder sb) {
        C0966a.m2376k(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = f2515c.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    /* JADX INFO: renamed from: h */
    public static URL m2602h(URL url, String str) {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        URL url2 = new URL(url, str);
        String strReplaceFirst = f2514b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            strReplaceFirst = strReplaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }
}
