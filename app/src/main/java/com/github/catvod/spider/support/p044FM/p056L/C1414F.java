package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import java.io.StringReader;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1414F {

    /* JADX INFO: renamed from: a */
    private AbstractC1487k1 f3298a;

    /* JADX INFO: renamed from: b */
    private C1410D f3299b = new C1410D();

    /* JADX INFO: renamed from: c */
    private C1412E f3300c;

    public C1414F(AbstractC1487k1 abstractC1487k1) {
        this.f3298a = abstractC1487k1;
        this.f3300c = abstractC1487k1.mo3710c();
    }

    /* JADX INFO: renamed from: d */
    public static C1388h m3544d(String str) {
        C1458b c1458b = new C1458b();
        return c1458b.m3757f(new StringReader(str), "", new C1414F(c1458b));
    }

    /* JADX INFO: renamed from: a */
    public final C1410D m3545a() {
        return this.f3299b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3546b(String str) {
        return this.f3298a.mo3714e(str);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3547c() {
        return this.f3299b.m3537b() > 0;
    }

    /* JADX INFO: renamed from: e */
    public final C1388h m3548e(String str, String str2) {
        return this.f3298a.m3757f(new StringReader(str), str2, this);
    }

    /* JADX INFO: renamed from: f */
    public final C1412E m3549f() {
        return this.f3300c;
    }

    /* JADX INFO: renamed from: g */
    public final C1414F m3550g() {
        this.f3300c = C1412E.f3295d;
        return this;
    }
}
