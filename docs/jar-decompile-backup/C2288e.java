package com.github.catvod.spider.support.p129n;

import android.util.Log;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p128m.C2268k;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p129n.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2288e {

    /* JADX INFO: renamed from: c */
    private final C2268k f5713c;

    /* JADX INFO: renamed from: a */
    private final int f5711a = 2;

    /* JADX INFO: renamed from: b */
    private final boolean f5712b = true;

    /* JADX INFO: renamed from: d */
    private final String f5714d = "PRETTY_LOGGER";

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p129n.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        C2268k f5715a;

        a() {
        }
    }

    C2288e(a aVar) {
        this.f5713c = aVar.f5715a;
    }

    /* JADX INFO: renamed from: b */
    private void m6192b(String str, String str2) {
        str2.getClass();
        this.f5713c.getClass();
        if (str == null) {
            str = "NO_TAG";
        }
        Log.println(3, str, str2);
    }

    /* JADX INFO: renamed from: c */
    private void m6193c(String str, String str2) {
        str2.getClass();
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            m6192b(str, C2139c.m5408a("│ ", str3));
        }
    }

    /* JADX INFO: renamed from: d */
    private void m6194d(String str) {
        m6192b(str, "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX INFO: renamed from: a */
    public final void m6195a(String str, String str2) {
        String str3;
        int i;
        str2.getClass();
        if (str == null || str.length() == 0) {
            str3 = this.f5714d;
        } else {
            String str4 = this.f5714d;
            if (str4 == str ? true : (str4 == null || str == null || str4.length() != str.length()) ? false : str4.equals(str)) {
                str3 = this.f5714d;
            } else {
                str3 = this.f5714d + "-" + str;
            }
        }
        m6192b(str3, "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        int length = this.f5711a;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (this.f5712b) {
            StringBuilder sbM5396a = C2137a.m5396a("│ Thread: ");
            sbM5396a.append(Thread.currentThread().getName());
            m6192b(str3, sbM5396a.toString());
            m6194d(str3);
        }
        stackTrace.getClass();
        int i2 = 5;
        while (true) {
            if (i2 >= stackTrace.length) {
                i = -1;
                break;
            }
            String className = stackTrace[i2].getClassName();
            if (!className.equals(C2287d.class.getName()) && !className.equals(C2286c.class.getName())) {
                i = i2 - 1;
                break;
            }
            i2++;
        }
        int i3 = i + 0;
        if (length + i3 > stackTrace.length) {
            length = (stackTrace.length - i3) - 1;
        }
        String str5 = "";
        while (length > 0) {
            int i4 = length + i3;
            if (i4 < stackTrace.length) {
                StringBuilder sb = new StringBuilder();
                sb.append((char) 9474);
                sb.append(' ');
                sb.append(str5);
                String className2 = stackTrace[i4].getClassName();
                className2.getClass();
                sb.append(className2.substring(className2.lastIndexOf(".") + 1));
                sb.append(".");
                sb.append(stackTrace[i4].getMethodName());
                sb.append(" ");
                sb.append(" (");
                sb.append(stackTrace[i4].getFileName());
                sb.append(":");
                sb.append(stackTrace[i4].getLineNumber());
                sb.append(")");
                str5 = str5 + "   ";
                m6192b(str3, sb.toString());
            }
            length--;
        }
        byte[] bytes = str2.getBytes();
        int length2 = bytes.length;
        if (length2 <= 4000) {
            if (this.f5711a > 0) {
                m6194d(str3);
            }
            m6193c(str3, str2);
            m6192b(str3, "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            return;
        }
        if (this.f5711a > 0) {
            m6194d(str3);
        }
        for (int i5 = 0; i5 < length2; i5 += 4000) {
            m6193c(str3, new String(bytes, i5, Math.min(length2 - i5, 4000)));
        }
        m6192b(str3, "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
    }
}
