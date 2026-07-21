package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ly */
/* JADX INFO: loaded from: classes.dex */
public final class C0436ly extends C0237eo {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0436ly(int i, int i2) {
        super(i);
        this.f1210e = i2;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0237eo
    /* JADX INFO: renamed from: d */
    public final int mo1194d(abe abeVar, int i) {
        switch (this.f1210e) {
            case 0:
                if (i >= 100) {
                    return i;
                }
                int i2 = abeVar.f498w + i;
                if (i < abeVar.f499x) {
                    i2 += 100;
                }
                return i2;
            case 1:
                return i - 1;
            case 2:
                if (i == 7) {
                    return 1;
                }
                return 1 + i;
            case 3:
                if (i == 24) {
                    return 0;
                }
                return i;
            default:
                if (i == 12) {
                    return 0;
                }
                return i;
        }
    }
}
