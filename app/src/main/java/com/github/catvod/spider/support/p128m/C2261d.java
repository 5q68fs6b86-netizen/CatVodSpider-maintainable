package com.github.catvod.spider.support.p128m;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p106L.C2077e;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.m.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2261d {
    /* JADX INFO: renamed from: a */
    public static C2060c m6141a(C2037i c2037i) {
        C2060c c2060c = new C2060c();
        while (true) {
            c2037i = c2037i.m4886f0();
            if (c2037i == null) {
                break;
            }
            c2060c.add(c2037i);
        }
        if (c2060c.size() > 0) {
            return c2060c;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m6142b(C2037i c2037i, C2077e c2077e) {
        Iterator<C2037i> it = c2037i.m4890j0().m4876V().iterator();
        int i = 1;
        while (it.hasNext()) {
            C2037i next = it.next();
            if (c2037i.m4901r0().equals(next.m4901r0()) && c2077e.m5329a().contains(next)) {
                if (c2037i == next) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static C2060c m6143c(C2037i c2037i) {
        C2060c c2060c = new C2060c();
        while (true) {
            c2037i = c2037i.m4894m0();
            if (c2037i == null) {
                break;
            }
            c2060c.add(c2037i);
        }
        if (c2060c.size() > 0) {
            return c2060c;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m6144d(C2037i c2037i, int i) {
        c2037i.mo4928c("EL_SAME_TAG_INDEX", String.valueOf(i));
    }

    /* JADX INFO: renamed from: e */
    public static void m6145e(C2037i c2037i, int i) {
        c2037i.mo4928c("EL_SAME_TAG_ALL_NUM", String.valueOf(i));
    }
}
