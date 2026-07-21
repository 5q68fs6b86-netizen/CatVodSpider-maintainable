package com.github.catvod.spider.support.p128m;

import com.github.catvod.spider.support.p116a.C2139c;

/* JADX INFO: renamed from: com.github.catvod.spider.support.m.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2259b {

    /* JADX INFO: renamed from: a */
    private static final int[] f5636a = {46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};

    /* JADX INFO: renamed from: a */
    public static String m6137a(String str, String str2, String str3) {
        String strM5408a = C2139c.m5408a(str, str2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(strM5408a.charAt(f5636a[i]));
        }
        String string = sb.toString();
        String str4 = (System.currentTimeMillis() / 1000) + "";
        return str3 + "&w_rid=" + C2256I.m6109a(str3 + "&wts=" + str4 + string) + "&wts=" + str4;
    }
}
