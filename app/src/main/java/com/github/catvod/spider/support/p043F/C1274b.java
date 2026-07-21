package com.github.catvod.spider.support.p043F;

import com.github.catvod.spider.support.p042E.C1271c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.F.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1274b {

    /* JADX INFO: renamed from: a */
    static final String[] f2983a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* JADX INFO: renamed from: b */
    private static final Pattern f2984b = Pattern.compile("^/((\\.{1,2}/)+)");

    /* JADX INFO: renamed from: c */
    private static final Pattern f2985c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* JADX INFO: renamed from: d */
    private static final Pattern f2986d = Pattern.compile("[\\x00-\\x1f]*");

    /* JADX INFO: renamed from: e */
    private static final ThreadLocal<Stack<StringBuilder>> f2987e = new a();

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f2988f = 0;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.F.b$a */
    final class a extends ThreadLocal<Stack<StringBuilder>> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        protected final Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3170a(StringBuilder sb, String str, boolean z) {
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
    public static StringBuilder m3171b() {
        Stack<StringBuilder> stack = f2987e.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3172c(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3173d(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m3174e(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3174e(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: f */
    public static String m3175f(Collection<?> collection, String str) {
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        StringBuilder sbM3171b = m3171b();
        C1271c.m3157g(sbM3171b);
        Object obj = string;
        while (true) {
            sbM3171b.append(obj);
            if (!it.hasNext()) {
                return m3177h(sbM3171b);
            }
            Object next = it.next();
            sbM3171b.append(str);
            obj = next;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m3176g(int i, int i2) {
        C1271c.m3154d(i >= 0, "width must be >= 0");
        C1271c.m3153c(i2 >= -1);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        String[] strArr = f2983a;
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
    public static String m3177h(StringBuilder sb) {
        C1271c.m3157g(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = f2987e.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    /* JADX INFO: renamed from: i */
    public static String m3178i(String str, String str2) {
        String strM3180k = m3180k(str);
        String strM3180k2 = m3180k(str2);
        try {
            try {
                return m3179j(new URL(strM3180k), strM3180k2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strM3180k2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return f2985c.matcher(strM3180k2).find() ? strM3180k2 : "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static URL m3179j(URL url, String str) {
        String strM3180k = m3180k(str);
        if (strM3180k.startsWith("?")) {
            strM3180k = url.getPath() + strM3180k;
        }
        URL url2 = new URL(url, strM3180k);
        String strReplaceFirst = f2984b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            strReplaceFirst = strReplaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }

    /* JADX INFO: renamed from: k */
    private static String m3180k(String str) {
        return f2986d.matcher(str).replaceAll("");
    }
}
