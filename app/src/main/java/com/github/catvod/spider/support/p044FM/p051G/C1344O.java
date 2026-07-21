package com.github.catvod.spider.support.p044FM.p051G;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1344O {

    /* JADX INFO: renamed from: a */
    private static final Pattern f3105a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");

    /* JADX INFO: renamed from: b */
    private static final TimeZone f3106b = new C1346Q(false, 0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f3107c = 0;

    /* JADX INFO: renamed from: a */
    public static TimeZone m3330a(String str) {
        if ("Z".equals(str) || "UTC".equals(str)) {
            return f3106b;
        }
        Matcher matcher = f3105a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(2);
        boolean z = false;
        int i = strGroup != null ? Integer.parseInt(strGroup) : 0;
        String strGroup2 = matcher.group(4);
        int i2 = strGroup2 != null ? Integer.parseInt(strGroup2) : 0;
        if (i == 0 && i2 == 0) {
            return f3106b;
        }
        String strGroup3 = matcher.group(1);
        if (strGroup3 != null && strGroup3.charAt(0) == '-') {
            z = true;
        }
        return new C1346Q(z, i, i2);
    }
}
