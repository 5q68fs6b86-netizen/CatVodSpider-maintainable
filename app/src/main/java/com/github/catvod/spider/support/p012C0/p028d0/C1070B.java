package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1070B {

    /* JADX INFO: renamed from: a */
    private int f2652a;

    /* JADX INFO: renamed from: b */
    private String f2653b;

    C1070B(int i, String str) {
        this.f2652a = i;
        this.f2653b = str;
    }

    C1070B(int i, String str, Object... objArr) {
        this.f2653b = String.format(str, objArr);
        this.f2652a = i;
    }

    public final String toString() {
        return this.f2652a + ": " + this.f2653b;
    }
}
