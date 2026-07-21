package com.github.catvod.spider.support.p103I;

import com.github.catvod.spider.support.p043F.C1274b;
import com.github.catvod.spider.support.p101G.C2037i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.I.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2060c extends ArrayList<C2037i> {
    public C2060c() {
    }

    public C2060c(int i) {
        super(i);
    }

    public C2060c(List<C2037i> list) {
        super(list);
    }

    public C2060c(C2037i... c2037iArr) {
        super(Arrays.asList(c2037iArr));
    }

    /* JADX INFO: renamed from: a */
    public final String m5179a(String str) {
        for (C2037i c2037i : this) {
            if (c2037i.m4939o(str)) {
                return c2037i.mo4929d(str);
            }
        }
        return "";
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C2037i m5180b() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    /* JADX INFO: renamed from: c */
    public final String m5181c() {
        StringBuilder sbM3171b = C1274b.m3171b();
        for (C2037i c2037i : this) {
            if (sbM3171b.length() != 0) {
                sbM3171b.append(" ");
            }
            sbM3171b.append(c2037i.m4902t0());
        }
        return C1274b.m3177h(sbM3171b);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C2060c c2060c = new C2060c(size());
        Iterator<C2037i> it = iterator();
        while (it.hasNext()) {
            c2060c.add(it.next().clone());
        }
        return c2060c;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbM3171b = C1274b.m3171b();
        for (C2037i c2037i : this) {
            if (sbM3171b.length() != 0) {
                sbM3171b.append("\n");
            }
            sbM3171b.append(c2037i.mo4843u());
        }
        return C1274b.m3177h(sbM3171b);
    }
}
