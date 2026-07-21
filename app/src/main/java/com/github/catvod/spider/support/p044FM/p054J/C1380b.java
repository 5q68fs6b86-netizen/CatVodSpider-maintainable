package com.github.catvod.spider.support.p044FM.p054J;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.J.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1380b {

    /* JADX INFO: renamed from: a */
    static final String[] f3170a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* JADX INFO: renamed from: b */
    private static final Pattern f3171b = Pattern.compile("^/((\\.{1,2}/)+)");

    /* JADX INFO: renamed from: c */
    private static final Pattern f3172c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* JADX INFO: renamed from: d */
    private static final Pattern f3173d = Pattern.compile("[\\x00-\\x1f]*");

    /* JADX INFO: renamed from: e */
    private static final ThreadLocal<Stack<StringBuilder>> f3174e = new C1379a();

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f3175f = 0;

    /* JADX INFO: renamed from: a */
    public static void m3362a(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!(iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160)) {
                if (!(iCodePointAt == 8203 || iCodePointAt == 173)) {
                    sb.appendCodePoint(iCodePointAt);
                    z2 = true;
                    z3 = false;
                }
            } else if ((!z || z2) && !z3) {
                sb.append(' ');
                z3 = true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: b */
    public static StringBuilder m3363b() {
        Stack<StringBuilder> stack = f3174e.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3364c(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3365d(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m3366e(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3366e(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: f */
    public static String m3367f(Collection<?> collection, String str) {
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        StringBuilder sbM3363b = m3363b();
        C1377c.m3360g(sbM3363b);
        Object obj = string;
        while (true) {
            sbM3363b.append(obj);
            if (!it.hasNext()) {
                return m3369h(sbM3363b);
            }
            Object next = it.next();
            sbM3363b.append(str);
            obj = next;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m3368g(int i, int i2) {
        C1377c.m3357d(i >= 0, "width must be >= 0");
        C1377c.m3356c(i2 >= -1);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        String[] strArr = f3170a;
        if (i < 21) {
            return strArr[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    /* JADX INFO: renamed from: h */
    public static String m3369h(StringBuilder sb) {
        C1377c.m3360g(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = f3174e.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    /* JADX INFO: renamed from: i */
    public static String m3370i(String str, String str2) {
        String strM3372k = m3372k(str);
        String strM3372k2 = m3372k(str2);
        try {
            try {
                return m3371j(new URL(strM3372k), strM3372k2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strM3372k2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return f3172c.matcher(strM3372k2).find() ? strM3372k2 : "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static URL m3371j(URL url, String str) {
        String strM3372k = m3372k(str);
        if (strM3372k.startsWith("?")) {
            strM3372k = url.getPath() + strM3372k;
        }
        URL url2 = new URL(url, strM3372k);
        String strReplaceFirst = f3171b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            strReplaceFirst = strReplaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }

    /* JADX INFO: renamed from: k */
    private static String m3372k(String str) {
        return f3173d.matcher(str).replaceAll("");
    }
}
