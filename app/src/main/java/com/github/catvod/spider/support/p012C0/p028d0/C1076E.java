package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p026c0.C1049h;
import java.io.StringReader;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1076E {

    /* JADX INFO: renamed from: a */
    private AbstractC1145i1 f2659a;

    /* JADX INFO: renamed from: b */
    private C1072C f2660b = new C1072C();

    public C1076E(AbstractC1145i1 abstractC1145i1) {
        this.f2659a = abstractC1145i1;
    }

    /* JADX INFO: renamed from: c */
    public static C1049h m2808c(String str) {
        AbstractC1096O abstractC1096OM2886t;
        C1122b c1122b = new C1122b();
        c1122b.m2928C(new StringReader(str), new C1076E(c1122b));
        C1100Q c1100q = c1122b.f2816c;
        do {
            abstractC1096OM2886t = c1100q.m2886t();
            c1122b.mo2953c(abstractC1096OM2886t);
            abstractC1096OM2886t.mo2823g();
        } while (abstractC1096OM2886t.f2694a != 6);
        c1122b.f2815b.m2901d();
        c1122b.f2815b = null;
        c1122b.f2816c = null;
        c1122b.f2818e = null;
        return c1122b.f2817d;
    }

    /* JADX INFO: renamed from: a */
    public final C1072C m2809a() {
        return this.f2660b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2810b(String str) {
        return this.f2659a.mo2951b(str);
    }
}
