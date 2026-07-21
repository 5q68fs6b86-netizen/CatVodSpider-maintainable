package com.github.catvod.spider.support.p117b;

import com.github.catvod.spider.support.p118c.C2192c;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2174h {
    /* JADX INFO: renamed from: a */
    public static String m5655a(String str, C2192c c2192c, int i, int i2, int i3, ArrayList arrayList) {
        c2192c.m5817i(Integer.valueOf(str).intValue(), i, i2, i3);
        c2192c.m5829w(arrayList);
        return c2192c.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m5656a(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: b */
    public static String m5657b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static HashMap m5658c(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put(str, str2);
        map.put(str3, str4);
        return map;
    }
}
