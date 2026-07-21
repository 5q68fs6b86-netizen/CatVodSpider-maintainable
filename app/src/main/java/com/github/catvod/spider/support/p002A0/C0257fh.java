package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.fh */
/* JADX INFO: loaded from: classes.dex */
public final class C0257fh extends AbstractC0457ms {

    /* JADX INFO: renamed from: c */
    public static final C0257fh f824c = new C0257fh("(Z|(?:[+-]\\d{2}))");

    /* JADX INFO: renamed from: d */
    public static final C0257fh f825d = new C0257fh("(Z|(?:[+-]\\d{2}\\d{2}))");

    /* JADX INFO: renamed from: e */
    public static final C0257fh f826e = new C0257fh("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

    public C0257fh(String str) {
        this.f1253g = Pattern.compile(str);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0457ms
    /* JADX INFO: renamed from: f */
    public final void mo1215f(Calendar calendar, String str) {
        calendar.setTimeZone(AbstractC0735x.m1856c(str));
    }
}
