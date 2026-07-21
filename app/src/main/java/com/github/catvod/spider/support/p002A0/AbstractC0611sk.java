package com.github.catvod.spider.support.p002A0;

import java.math.BigDecimal;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.sk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0611sk {

    /* JADX INFO: renamed from: a */
    public static final C0737xb f1493a;

    /* JADX INFO: renamed from: b */
    public static final C0737xb f1494b;

    static {
        int i = 3;
        f1493a = new C0737xb("REMOVED_TASK", i);
        f1494b = new C0737xb("CLOSED_EMPTY", i);
    }

    /* JADX INFO: renamed from: c */
    public static void m1686c(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    /* JADX INFO: renamed from: d */
    public static BigDecimal m1687d(String str) {
        m1686c(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }
}
