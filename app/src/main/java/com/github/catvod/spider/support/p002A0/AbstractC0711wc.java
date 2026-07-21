package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.wc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0711wc {
    /* JADX INFO: renamed from: a */
    public static void m1766a(boolean z) {
        if (!z) {
            throw new C0283gg("Must be true");
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m1767b(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: c */
    public static void m1768c(String str) {
        if (str == null || str.length() == 0) {
            throw new C0283gg("String must not be empty");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1769d(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C0283gg(str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1770e(Object obj) {
        if (obj == null) {
            throw new C0283gg("Object must not be null");
        }
    }
}
