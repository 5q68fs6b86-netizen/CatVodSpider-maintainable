package com.github.catvod.spider.support.p117b;

import com.github.catvod.spider.support.p118c.C2194e;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2177k {
    /* JADX INFO: renamed from: a */
    public static StringBuilder m5713a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: a */
    public static StringBuilder m5714a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: b */
    public static void m5715b(String str, String str2, String str3, String str4, ArrayList arrayList) {
        arrayList.add(new C2194e(str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: c */
    public static int m5716c(String str, String str2, String str3, String str4, ArrayList arrayList, int i, int i2) {
        arrayList.add(new C2194e(str, str2, str3, str4));
        return i + i2;
    }

    /* JADX INFO: renamed from: c */
    public static void m5717c(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
    }
}
