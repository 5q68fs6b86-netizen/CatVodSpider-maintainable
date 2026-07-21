package com.github.catvod.spider.support.p002A0;

import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ov */
/* JADX INFO: loaded from: classes.dex */
public final class C0514ov implements Comparator {

    /* JADX INFO: renamed from: a */
    public final String f1352a;

    /* JADX INFO: renamed from: b */
    public final String f1353b;

    public C0514ov(String str, String str2) {
        this.f1352a = str;
        this.f1353b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompareTo;
        long jM1075d;
        long jM1075d2;
        C0175cg c0175cg = (C0175cg) obj;
        C0175cg c0175cg2 = (C0175cg) obj2;
        boolean zEquals = this.f1353b.equals("asc");
        String str = this.f1352a;
        str.getClass();
        switch (str) {
            case "date":
                if (!zEquals) {
                    iCompareTo = c0175cg2.m1073b().compareTo(c0175cg.m1073b());
                    break;
                } else {
                    iCompareTo = c0175cg.m1073b().compareTo(c0175cg2.m1073b());
                    break;
                }
                break;
            case "name":
                if (!zEquals) {
                    iCompareTo = c0175cg2.m1074c().compareTo(c0175cg.m1074c());
                    break;
                } else {
                    iCompareTo = c0175cg.m1074c().compareTo(c0175cg2.m1074c());
                    break;
                }
                break;
            case "size":
                if (zEquals) {
                    jM1075d = c0175cg.m1075d();
                    jM1075d2 = c0175cg2.m1075d();
                } else {
                    jM1075d = c0175cg2.m1075d();
                    jM1075d2 = c0175cg.m1075d();
                }
                iCompareTo = Long.compare(jM1075d, jM1075d2);
                break;
            default:
                return -1;
        }
        return iCompareTo;
    }
}
