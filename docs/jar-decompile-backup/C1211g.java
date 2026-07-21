package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1211g extends ArrayList<C1053l> {
    public C1211g() {
    }

    public C1211g(int i) {
        super(i);
    }

    public C1211g(List<C1053l> list) {
        super(list);
    }

    public C1211g(C1053l... c1053lArr) {
        super(Arrays.asList(c1053lArr));
    }

    /* JADX INFO: renamed from: a */
    public final String m3012a(String str) {
        for (C1053l c1053l : this) {
            if (c1053l.m2757o(str)) {
                return c1053l.mo2747c(str);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public final C1211g m3013b(int i) {
        return size() > i ? new C1211g(get(i)) : new C1211g();
    }

    /* JADX INFO: renamed from: c */
    public final C1053l m3014c() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C1211g c1211g = new C1211g(size());
        Iterator<C1053l> it = iterator();
        while (it.hasNext()) {
            c1211g.add(it.next().mo2657j());
        }
        return c1211g;
    }

    /* JADX INFO: renamed from: d */
    public final C1211g m3015d(String str) {
        C0966a.m2374i(str);
        AbstractC1193N abstractC1193NM3005h = C1195P.m3005h(str);
        C1211g c1211g = new C1211g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (C1053l c1053l : this) {
            C0966a.m2376k(abstractC1193NM3005h);
            C0966a.m2376k(c1053l);
            for (C1053l c1053l2 : C1207c.m3009a(abstractC1193NM3005h, c1053l)) {
                if (identityHashMap.put(c1053l2, Boolean.TRUE) == null) {
                    c1211g.add(c1053l2);
                }
            }
        }
        return c1211g;
    }

    /* JADX INFO: renamed from: e */
    public final String m3016e() {
        StringBuilder sbM2595a = C1034b.m2595a();
        for (C1053l c1053l : this) {
            if (sbM2595a.length() != 0) {
                sbM2595a.append(" ");
            }
            sbM2595a.append(c1053l.m2721p0());
        }
        return C1034b.m2601g(sbM2595a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbM2595a = C1034b.m2595a();
        for (C1053l c1053l : this) {
            if (sbM2595a.length() != 0) {
                sbM2595a.append("\n");
            }
            sbM2595a.append(c1053l.mo2675u());
        }
        return C1034b.m2601g(sbM2595a);
    }
}
