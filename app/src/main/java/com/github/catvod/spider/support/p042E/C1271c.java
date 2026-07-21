package com.github.catvod.spider.support.p042E;

import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p042E.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1271c {
    private C1271c() {
    }

    /* JADX INFO: renamed from: a */
    public static void m3151a(String str) {
        throw new C1272d(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m3152b(boolean z) {
        if (z) {
            throw new C1272d("Must be false");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3153c(boolean z) {
        if (!z) {
            throw new C1272d("Must be true");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3154d(boolean z, String str) {
        if (!z) {
            throw new C1272d(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3155e(@Nullable String str) {
        if (str == null || str.length() == 0) {
            throw new C1272d("String must not be empty");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3156f(@Nullable String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C1272d(str2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3157g(@Nullable Object obj) {
        if (obj == null) {
            throw new C1272d("Object must not be null");
        }
    }
}
