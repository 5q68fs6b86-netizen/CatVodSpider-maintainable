package com.github.catvod.spider.support.p002A0;

import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0519p {

    /* JADX INFO: renamed from: a */
    public final TimeZone f1355a;

    /* JADX INFO: renamed from: b */
    public final int f1356b;

    public C0519p(TimeZone timeZone, boolean z) {
        this.f1355a = timeZone;
        this.f1356b = z ? timeZone.getDSTSavings() : 0;
    }
}
