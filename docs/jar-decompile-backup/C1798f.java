package com.github.catvod.spider.support.p044FM.p079e;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p079e.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1798f implements Comparator<C1795c> {

    /* JADX INFO: renamed from: a */
    private final String f4051a;

    /* JADX INFO: renamed from: b */
    private final String f4052b;

    public C1798f(String str, String str2) {
        this.f4051a = str;
        this.f4052b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static void m4335a(String str, String str2, List<C1795c> list) {
        Collections.sort(list, new C1798f(str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    @Override // java.util.Comparator
    public final int compare(C1795c c1795c, C1795c c1795c2) {
        byte b;
        int iCompareTo;
        long jM4319e;
        long jM4319e2;
        C1795c c1795c3 = c1795c;
        C1795c c1795c4 = c1795c2;
        boolean zEquals = this.f4052b.equals("asc");
        String str = this.f4051a;
        int iHashCode = str.hashCode();
        if (iHashCode != 3076014) {
            if (iHashCode != 3373707) {
                if (iHashCode == 3530753 && str.equals("size")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("name")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals("date")) {
            b = 2;
        } else {
            b = -1;
        }
        if (b == 0) {
            iCompareTo = zEquals ? c1795c3.m4317c().compareTo(c1795c4.m4317c()) : c1795c4.m4317c().compareTo(c1795c3.m4317c());
        } else {
            if (b == 1) {
                if (zEquals) {
                    jM4319e = c1795c3.m4319e();
                    jM4319e2 = c1795c4.m4319e();
                } else {
                    jM4319e = c1795c4.m4319e();
                    jM4319e2 = c1795c3.m4319e();
                }
                return (jM4319e > jM4319e2 ? 1 : (jM4319e == jM4319e2 ? 0 : -1));
            }
            if (b != 2) {
                return -1;
            }
            iCompareTo = zEquals ? c1795c3.m4316b().compareTo(c1795c4.m4316b()) : c1795c4.m4316b().compareTo(c1795c3.m4316b());
        }
        return iCompareTo;
    }
}
