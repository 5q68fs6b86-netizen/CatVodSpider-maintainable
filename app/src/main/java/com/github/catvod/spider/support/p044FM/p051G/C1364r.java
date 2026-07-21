package com.github.catvod.spider.support.p044FM.p051G;

import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.r */
/* JADX INFO: loaded from: classes.dex */
final class C1364r {

    /* JADX INFO: renamed from: a */
    final TimeZone f3131a;

    /* JADX INFO: renamed from: b */
    final int f3132b;

    C1364r(TimeZone timeZone, boolean z) {
        this.f3131a = timeZone;
        this.f3132b = z ? timeZone.getDSTSavings() : 0;
    }
}
