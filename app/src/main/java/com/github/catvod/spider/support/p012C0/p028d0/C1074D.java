package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p026c0.C1044c;
import com.github.catvod.spider.support.p012C0.p040x.C1263a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1074D {

    /* JADX INFO: renamed from: c */
    public static final C1074D f2655c = new C1074D(false, false);

    /* JADX INFO: renamed from: d */
    public static final C1074D f2656d = new C1074D(true, true);

    /* JADX INFO: renamed from: a */
    private final boolean f2657a;

    /* JADX INFO: renamed from: b */
    private final boolean f2658b;

    public C1074D(boolean z, boolean z2) {
        this.f2657a = z;
        this.f2658b = z2;
    }

    /* JADX INFO: renamed from: a */
    public final String m2803a(String str) {
        String strTrim = str.trim();
        return !this.f2658b ? C1263a.m3147c(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: b */
    final C1044c m2804b(C1044c c1044c) {
        if (c1044c != null && !this.f2658b) {
            c1044c.m2651r();
        }
        return c1044c;
    }

    /* JADX INFO: renamed from: c */
    public final String m2805c(String str) {
        String strTrim = str.trim();
        return !this.f2657a ? C1263a.m3147c(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2806d() {
        return this.f2658b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2807e() {
        return this.f2657a;
    }
}
