package com.github.catvod.spider.support.p044FM.p053I;

import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.I.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1377c {
    private C1377c() {
    }

    /* JADX INFO: renamed from: a */
    public static void m3354a(String str) {
        throw new C1378d(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m3355b(boolean z) {
        if (z) {
            throw new C1378d("Must be false");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3356c(boolean z) {
        if (!z) {
            throw new C1378d("Must be true");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3357d(boolean z, String str) {
        if (!z) {
            throw new C1378d(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3358e(@Nullable String str) {
        if (str == null || str.length() == 0) {
            throw new C1378d("String must not be empty");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3359f(@Nullable String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C1378d(str2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3360g(@Nullable Object obj) {
        if (obj == null) {
            throw new C1378d("Object must not be null");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m3361h(@Nullable Object obj, String str) {
        if (obj == null) {
            throw new C1378d(String.format("The parameter '%s' must not be null.", str));
        }
    }
}
