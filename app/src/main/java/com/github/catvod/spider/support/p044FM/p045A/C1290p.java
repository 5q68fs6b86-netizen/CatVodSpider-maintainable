package com.github.catvod.spider.support.p044FM.p045A;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p045A.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1290p {
    /* JADX INFO: renamed from: a */
    public static C1551g m3226a(C1393m c1393m) {
        C1551g c1551g = new C1551g();
        while (true) {
            c1393m = c1393m.m3467g0();
            if (c1393m == null) {
                break;
            }
            c1551g.add(c1393m);
        }
        if (c1551g.size() > 0) {
            return c1551g;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m3227b(C1393m c1393m, C1664e c1664e) {
        Iterator<C1393m> it = c1393m.m3473k0().m3456V().iterator();
        int i = 1;
        while (it.hasNext()) {
            C1393m next = it.next();
            if (c1393m.m3483t0().equals(next.m3483t0()) && c1664e.m3960a().contains(next)) {
                if (c1393m == next) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static String m3228c(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static C1551g m3229d(C1393m c1393m) {
        C1551g c1551g = new C1551g();
        while (true) {
            c1393m = c1393m.m3476n0();
            if (c1393m == null) {
                break;
            }
            c1551g.add(c1393m);
        }
        if (c1551g.size() > 0) {
            return c1551g;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m3230e(C1393m c1393m, int i) {
        c1393m.m3452R("EL_SAME_TAG_INDEX", String.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public static void m3231f(C1393m c1393m, int i) {
        c1393m.m3452R("EL_SAME_TAG_ALL_NUM", String.valueOf(i));
    }
}
