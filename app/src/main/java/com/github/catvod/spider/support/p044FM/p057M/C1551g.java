package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1551g extends ArrayList<C1393m> {
    public C1551g() {
    }

    public C1551g(int i) {
        super(i);
    }

    public C1551g(List<C1393m> list) {
        super(list);
    }

    public C1551g(C1393m... c1393mArr) {
        super(Arrays.asList(c1393mArr));
    }

    /* JADX INFO: renamed from: a */
    public final String m3784a(String str) {
        for (C1393m c1393m : this) {
            if (c1393m.m3520n(str)) {
                return c1393m.mo3511c(str);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m3785b(String str) {
        ArrayList arrayList = new ArrayList(size());
        for (C1393m c1393m : this) {
            if (c1393m.m3520n(str)) {
                arrayList.add(c1393m.mo3511c(str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m3786c() {
        ArrayList arrayList = new ArrayList(size());
        for (C1393m c1393m : this) {
            if (c1393m.m3461b0()) {
                arrayList.add(c1393m.m3484v0());
            }
        }
        return arrayList;
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C1551g c1551g = new C1551g(size());
        Iterator<C1393m> it = iterator();
        while (it.hasNext()) {
            c1551g.add(it.next().mo3404i());
        }
        return c1551g;
    }

    /* JADX INFO: renamed from: d */
    public final C1551g m3787d(int i) {
        return size() > i ? new C1551g(get(i)) : new C1551g();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C1393m m3788e() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    /* JADX INFO: renamed from: f */
    public final String m3789f() {
        StringBuilder sbM3363b = C1380b.m3363b();
        for (C1393m c1393m : this) {
            if (sbM3363b.length() != 0) {
                sbM3363b.append("\n");
            }
            sbM3363b.append(c1393m.m3462c0());
        }
        return C1380b.m3369h(sbM3363b);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final C1393m m3790g() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    /* JADX INFO: renamed from: h */
    public final C1551g m3791h(String str) {
        C1377c.m3358e(str);
        AbstractC1532N abstractC1532NM3777j = C1534P.m3777j(str);
        C1551g c1551g = new C1551g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (C1393m c1393m : this) {
            C1377c.m3360g(abstractC1532NM3777j);
            C1377c.m3360g(c1393m);
            for (C1393m c1393m2 : C1547c.m3782a(abstractC1532NM3777j, c1393m)) {
                if (identityHashMap.put(c1393m2, Boolean.TRUE) == null) {
                    c1551g.add(c1393m2);
                }
            }
        }
        return c1551g;
    }

    /* JADX INFO: renamed from: i */
    public final String m3792i() {
        StringBuilder sbM3363b = C1380b.m3363b();
        for (C1393m c1393m : this) {
            if (sbM3363b.length() != 0) {
                sbM3363b.append(" ");
            }
            sbM3363b.append(c1393m.m3484v0());
        }
        return C1380b.m3369h(sbM3363b);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbM3363b = C1380b.m3363b();
        for (C1393m c1393m : this) {
            if (sbM3363b.length() != 0) {
                sbM3363b.append("\n");
            }
            sbM3363b.append(c1393m.mo3431t());
        }
        return C1380b.m3369h(sbM3363b);
    }
}
