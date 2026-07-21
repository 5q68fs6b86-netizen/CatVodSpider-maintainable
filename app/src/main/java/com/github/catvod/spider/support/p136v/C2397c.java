package com.github.catvod.spider.support.p136v;

import com.github.catvod.spider.support.p134t.C2306E;
import com.github.catvod.spider.support.p134t.InterfaceC2305D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.github.catvod.spider.support.v.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2397c {

    /* JADX INFO: renamed from: a */
    private final C2396b f5930a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2305D f5931b;

    public C2397c(C2396b c2396b, InterfaceC2305D interfaceC2305D) {
        this.f5930a = c2396b;
        this.f5931b = interfaceC2305D;
    }

    /* JADX INFO: renamed from: a */
    protected final String m6395a(C2398d c2398d) {
        StringBuilder sb;
        int i = c2398d.f5932a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c2398d.f5935d ? ":" : "");
        sb2.append("s");
        sb2.append(i);
        sb2.append(c2398d.f5938g ? "^" : "");
        String string = sb2.toString();
        if (!c2398d.f5935d) {
            return string;
        }
        if (c2398d.f5939h != null) {
            sb = new StringBuilder();
            sb.append(string);
            sb.append("=>");
            sb.append(Arrays.toString(c2398d.f5939h));
        } else {
            sb = new StringBuilder();
            sb.append(string);
            sb.append("=>");
            sb.append(c2398d.f5936e);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.v.d, com.github.catvod.spider.support.v.d>] */
    public final String toString() {
        if (this.f5930a.f5926b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        C2396b c2396b = this.f5930a;
        c2396b.getClass();
        ArrayList<C2398d> arrayList = new ArrayList(c2396b.f5925a.keySet());
        Collections.sort(arrayList, new C2395a());
        for (C2398d c2398d : arrayList) {
            C2398d[] c2398dArr = c2398d.f5934c;
            int length = c2398dArr != null ? c2398dArr.length : 0;
            for (int i = 0; i < length; i++) {
                C2398d c2398d2 = c2398d.f5934c[i];
                if (c2398d2 != null && c2398d2.f5932a != Integer.MAX_VALUE) {
                    sb.append(m6395a(c2398d));
                    String strM6223a = ((C2306E) this.f5931b).m6223a(i - 1);
                    sb.append("-");
                    sb.append(strM6223a);
                    sb.append("->");
                    sb.append(m6395a(c2398d2));
                    sb.append('\n');
                }
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return null;
        }
        return string;
    }
}
