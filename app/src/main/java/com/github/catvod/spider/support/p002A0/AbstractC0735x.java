package com.github.catvod.spider.support.p002A0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0735x {

    /* JADX INFO: renamed from: a */
    public static final Pattern f1776a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");

    /* JADX INFO: renamed from: b */
    public static final C0761xz f1777b = new C0761xz(false, 0, 0);

    /* JADX INFO: renamed from: c */
    public static C0761xz m1856c(String str) {
        boolean zEquals = "Z".equals(str);
        C0761xz c0761xz = f1777b;
        if (zEquals || "UTC".equals(str)) {
            return c0761xz;
        }
        Matcher matcher = f1776a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(2);
        boolean z = false;
        int i = strGroup != null ? Integer.parseInt(strGroup) : 0;
        String strGroup2 = matcher.group(4);
        int i2 = strGroup2 != null ? Integer.parseInt(strGroup2) : 0;
        if (i == 0 && i2 == 0) {
            return c0761xz;
        }
        String strGroup3 = matcher.group(1);
        if (strGroup3 != null && strGroup3.charAt(0) == '-') {
            z = true;
        }
        return new C0761xz(z, i, i2);
    }
}
