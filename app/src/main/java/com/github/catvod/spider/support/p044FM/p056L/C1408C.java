package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1408C {

    /* JADX INFO: renamed from: a */
    private String f3291a;

    /* JADX INFO: renamed from: b */
    private String f3292b;

    C1408C(C1455a c1455a, String str) {
        c1455a.getClass();
        this.f3291a = c1455a.m3678v();
        this.f3292b = str;
    }

    C1408C(C1455a c1455a, String str, Object... objArr) {
        c1455a.getClass();
        this.f3291a = c1455a.m3678v();
        this.f3292b = String.format(str, objArr);
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("<");
        sbM3589b.append(this.f3291a);
        sbM3589b.append(">: ");
        sbM3589b.append(this.f3292b);
        return sbM3589b.toString();
    }
}
