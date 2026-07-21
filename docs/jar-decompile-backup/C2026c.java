package com.github.catvod.spider.support.p044FM.p100z;

import com.github.catvod.spider.support.p044FM.p098x.C1924J;
import com.github.catvod.spider.support.p044FM.p098x.InterfaceC1923I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p100z.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2026c {

    /* JADX INFO: renamed from: a */
    private final C2025b f4590a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1923I f4591b;

    public C2026c(C2025b c2025b, InterfaceC1923I interfaceC1923I) {
        this.f4590a = c2025b;
        this.f4591b = interfaceC1923I;
    }

    /* JADX INFO: renamed from: a */
    protected final String m4799a(C2028e c2028e) {
        StringBuilder sb;
        int i = c2028e.f4594a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c2028e.f4597d ? ":" : "");
        sb2.append("s");
        sb2.append(i);
        sb2.append(c2028e.f4600g ? "^" : "");
        String string = sb2.toString();
        if (!c2028e.f4597d) {
            return string;
        }
        if (c2028e.f4601h != null) {
            sb = new StringBuilder();
            sb.append(string);
            sb.append("=>");
            sb.append(Arrays.toString(c2028e.f4601h));
        } else {
            sb = new StringBuilder();
            sb.append(string);
            sb.append("=>");
            sb.append(c2028e.f4598e);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.p044FM.p100z.e, com.github.catvod.spider.support.p044FM.p100z.e>] */
    public final String toString() {
        if (this.f4590a.f4586b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        C2025b c2025b = this.f4590a;
        c2025b.getClass();
        ArrayList<C2028e> arrayList = new ArrayList(c2025b.f4585a.keySet());
        Collections.sort(arrayList, new C2024a());
        for (C2028e c2028e : arrayList) {
            C2028e[] c2028eArr = c2028e.f4596c;
            int length = c2028eArr != null ? c2028eArr.length : 0;
            for (int i = 0; i < length; i++) {
                C2028e c2028e2 = c2028e.f4596c[i];
                if (c2028e2 != null && c2028e2.f4594a != Integer.MAX_VALUE) {
                    sb.append(m4799a(c2028e));
                    String strM4648a = ((C1924J) this.f4591b).m4648a(i - 1);
                    sb.append("-");
                    sb.append(strM4648a);
                    sb.append("->");
                    sb.append(m4799a(c2028e2));
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
