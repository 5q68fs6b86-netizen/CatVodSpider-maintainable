package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p026c0.C1044c;
import com.github.catvod.spider.support.p012C0.p026c0.C1049h;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.i1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145i1 {

    /* JADX INFO: renamed from: a */
    protected C1076E f2814a;

    /* JADX INFO: renamed from: b */
    C1119a f2815b;

    /* JADX INFO: renamed from: c */
    C1100Q f2816c;

    /* JADX INFO: renamed from: d */
    protected C1049h f2817d;

    /* JADX INFO: renamed from: e */
    protected ArrayList<C1053l> f2818e;

    /* JADX INFO: renamed from: f */
    protected String f2819f;

    /* JADX INFO: renamed from: g */
    protected AbstractC1096O f2820g;

    /* JADX INFO: renamed from: h */
    protected C1074D f2821h;

    /* JADX INFO: renamed from: i */
    private C1092M f2822i = new C1092M();

    /* JADX INFO: renamed from: j */
    private C1090L f2823j = new C1090L();

    AbstractC1145i1() {
    }

    /* JADX INFO: renamed from: a */
    protected final C1053l m2989a() {
        int size = this.f2818e.size();
        if (size > 0) {
            return this.f2818e.get(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    protected abstract boolean mo2951b(String str);

    /* JADX INFO: renamed from: c */
    protected abstract boolean mo2953c(AbstractC1096O abstractC1096O);

    /* JADX INFO: renamed from: d */
    protected final boolean m2990d(String str) {
        AbstractC1096O abstractC1096O = this.f2820g;
        C1090L c1090l = this.f2823j;
        if (abstractC1096O == c1090l) {
            C1090L c1090l2 = new C1090L();
            c1090l2.m2840s(str);
            return mo2953c(c1090l2);
        }
        c1090l.mo2823g();
        c1090l.m2840s(str);
        return mo2953c(c1090l);
    }

    /* JADX INFO: renamed from: e */
    public boolean m2991e(C1044c c1044c) {
        C1092M c1092m = this.f2822i;
        if (this.f2820g == c1092m) {
            c1092m = new C1092M();
        } else {
            c1092m.mo2823g();
        }
        c1092m.f2685b = "input";
        c1092m.f2693j = c1044c;
        c1092m.f2686c = "input";
        return mo2953c(c1092m);
    }

    /* JADX INFO: renamed from: f */
    protected final boolean m2992f(String str) {
        C1092M c1092m = this.f2822i;
        if (this.f2820g == c1092m) {
            c1092m = new C1092M();
        } else {
            c1092m.mo2823g();
        }
        c1092m.m2840s(str);
        return mo2953c(c1092m);
    }
}
