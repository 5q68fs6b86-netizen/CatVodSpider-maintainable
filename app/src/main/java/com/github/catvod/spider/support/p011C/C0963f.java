package com.github.catvod.spider.support.p011C;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p011C.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0963f {

    /* JADX INFO: renamed from: a */
    private static final Pattern f2341a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");

    /* JADX INFO: renamed from: b */
    private static final TimeZone f2342b = new C0965h(false, 0, 0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f2343c = 0;

    /* JADX INFO: renamed from: a */
    public static TimeZone m2365a(String str) {
        if ("Z".equals(str) || "UTC".equals(str)) {
            return f2342b;
        }
        Matcher matcher = f2341a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(2);
        boolean z = false;
        int i = strGroup != null ? Integer.parseInt(strGroup) : 0;
        String strGroup2 = matcher.group(4);
        int i2 = strGroup2 != null ? Integer.parseInt(strGroup2) : 0;
        if (i == 0 && i2 == 0) {
            return f2342b;
        }
        String strGroup3 = matcher.group(1);
        if (strGroup3 != null && strGroup3.charAt(0) == '-') {
            z = true;
        }
        return new C0965h(z, i, i2);
    }
}
