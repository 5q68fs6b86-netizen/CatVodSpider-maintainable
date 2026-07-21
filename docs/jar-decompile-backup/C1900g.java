package com.github.catvod.spider.support.p044FM.p092q;

import android.util.Log;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p082g.C1812j;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p092q.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1900g {

    /* JADX INFO: renamed from: c */
    private final C1896c f4374c;

    /* JADX INFO: renamed from: a */
    private final int f4372a = 2;

    /* JADX INFO: renamed from: b */
    private final boolean f4373b = true;

    /* JADX INFO: renamed from: d */
    private final String f4375d = "PRETTY_LOGGER";

    C1900g(C1899f c1899f) {
        this.f4374c = c1899f.f4371a;
    }

    /* JADX INFO: renamed from: b */
    private void m4603b(String str, String str2) {
        str2.getClass();
        this.f4374c.getClass();
        if (str == null) {
            str = "NO_TAG";
        }
        Log.println(3, str, str2);
    }

    /* JADX INFO: renamed from: c */
    private void m4604c(String str, String str2) {
        str2.getClass();
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            m4603b(str, C1812j.m4399b("│ ", str3));
        }
    }

    /* JADX INFO: renamed from: d */
    private void m4605d(String str) {
        m4603b(str, "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX INFO: renamed from: a */
    public final void m4606a(String str, String str2) {
        String str3;
        int i;
        str2.getClass();
        if (str == null || str.length() == 0) {
            str3 = this.f4375d;
        } else {
            String str4 = this.f4375d;
            if (str4 == str ? true : (str4 == null || str == null || str4.length() != str.length()) ? false : str4.equals(str)) {
                str3 = this.f4375d;
            } else {
                str3 = this.f4375d + "-" + str;
            }
        }
        m4603b(str3, "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        int length = this.f4372a;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (this.f4373b) {
            StringBuilder sbM3589b = C1434P.m3589b("│ Thread: ");
            sbM3589b.append(Thread.currentThread().getName());
            m4603b(str3, sbM3589b.toString());
            m4605d(str3);
        }
        stackTrace.getClass();
        int i2 = 5;
        while (true) {
            if (i2 >= stackTrace.length) {
                i = -1;
                break;
            }
            String className = stackTrace[i2].getClassName();
            if (!className.equals(C1898e.class.getName()) && !className.equals(C1897d.class.getName())) {
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
                m4603b(str3, sb.toString());
            }
            length--;
        }
        byte[] bytes = str2.getBytes();
        int length2 = bytes.length;
        if (length2 <= 4000) {
            if (this.f4372a > 0) {
                m4605d(str3);
            }
            m4604c(str3, str2);
            m4603b(str3, "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
            return;
        }
        if (this.f4372a > 0) {
            m4605d(str3);
        }
        for (int i5 = 0; i5 < length2; i5 += 4000) {
            m4604c(str3, new String(bytes, i5, Math.min(length2 - i5, 4000)));
        }
        m4603b(str3, "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
    }
}
