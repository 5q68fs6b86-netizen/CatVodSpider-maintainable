package com.github.catvod.spider.support.p102H;

import com.github.catvod.spider.support.p116a.C2137a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.H.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2048d {

    /* JADX INFO: renamed from: a */
    private String f4749a;

    /* JADX INFO: renamed from: b */
    private String f4750b;

    C2048d(C2045a c2045a, String str) {
        c2045a.getClass();
        this.f4749a = c2045a.m4989v();
        this.f4750b = str;
    }

    C2048d(C2045a c2045a, String str, Object... objArr) {
        c2045a.getClass();
        this.f4749a = c2045a.m4989v();
        this.f4750b = String.format(str, objArr);
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("<");
        sbM5396a.append(this.f4749a);
        sbM5396a.append(">: ");
        sbM5396a.append(this.f4750b);
        return sbM5396a.toString();
    }
}
