package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.support.p044FM.p077d.C1773b;
import com.github.catvod.spider.support.p044FM.p090o.C1860a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1731b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3809b;

    public /* synthetic */ RunnableC1731b(Object obj, int i) {
        this.f3808a = i;
        this.f3809b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3808a) {
            case 0:
                C1750u.m4111b((C1750u) this.f3809b);
                break;
            case 1:
                ((C1722J) this.f3809b).m4048L();
                break;
            case 2:
                ((C1729Q) this.f3809b).m4081x();
                break;
            case 3:
                C1773b c1773b = (C1773b) this.f3809b;
                c1773b.getClass();
                C1860a.m4503m(C1749t.f3844a.m4134q(), c1773b.toString());
                break;
            default:
                MainActivity.c((MainActivity) this.f3809b);
                break;
        }
    }
}
