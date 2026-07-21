package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.Q */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1436Q {

    /* JADX INFO: renamed from: a */
    int f3337a;

    /* JADX INFO: renamed from: b */
    private int f3338b;

    /* JADX INFO: renamed from: c */
    private int f3339c = -1;

    AbstractC1436Q() {
    }

    /* JADX INFO: renamed from: i */
    static void m3591i(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: renamed from: a */
    final void m3592a(int i) {
        this.f3339c = i;
    }

    /* JADX INFO: renamed from: b */
    final boolean m3593b() {
        return this.f3337a == 5;
    }

    /* JADX INFO: renamed from: c */
    final boolean m3594c() {
        return this.f3337a == 4;
    }

    /* JADX INFO: renamed from: d */
    final boolean m3595d() {
        return this.f3337a == 1;
    }

    /* JADX INFO: renamed from: e */
    final boolean m3596e() {
        return this.f3337a == 6;
    }

    /* JADX INFO: renamed from: f */
    final boolean m3597f() {
        return this.f3337a == 3;
    }

    /* JADX INFO: renamed from: g */
    final boolean m3598g() {
        return this.f3337a == 2;
    }

    /* JADX INFO: renamed from: h */
    AbstractC1436Q mo3564h() {
        this.f3338b = -1;
        this.f3339c = -1;
        return this;
    }

    /* JADX INFO: renamed from: j */
    final void m3599j(int i) {
        this.f3338b = i;
    }
}
