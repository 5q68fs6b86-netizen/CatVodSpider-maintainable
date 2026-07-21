package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.l */
/* JADX INFO: loaded from: classes.dex */
final class C1358l extends AbstractC1360n {

    /* JADX INFO: renamed from: b */
    private static final C1358l f3121b = new C1358l("(Z|(?:[+-]\\d{2}))");

    /* JADX INFO: renamed from: c */
    private static final C1358l f3122c = new C1358l("(Z|(?:[+-]\\d{2}\\d{2}))");

    /* JADX INFO: renamed from: d */
    private static final C1358l f3123d = new C1358l("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

    C1358l(String str) {
        this.f3125a = Pattern.compile(str);
    }

    /* JADX INFO: renamed from: e */
    static AbstractC1361o m3340e(int i) {
        if (i == 1) {
            return f3121b;
        }
        if (i == 2) {
            return f3122c;
        }
        if (i == 3) {
            return f3123d;
        }
        throw new IllegalArgumentException("invalid number of X");
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.AbstractC1360n
    /* JADX INFO: renamed from: c */
    final void mo3337c(Calendar calendar, String str) {
        calendar.setTimeZone(C1344O.m3330a(str));
    }
}
