package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.support.p003AB.p009o.C0915Z;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0835b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1971a;

    /* JADX INFO: renamed from: b */
    public final Object f1972b;

    public /* synthetic */ RunnableC0835b(Object obj, int i) {
        this.f1971a = i;
        this.f1972b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1971a;
        if (i == 0) {
            C0857x.m2072b((C0857x) this.f1972b);
            return;
        }
        if (i == 1) {
            ((C0826J) this.f1972b).m2002N();
            return;
        }
        if (i == 2) {
            ((C0833Q) this.f1972b).m2009B();
            return;
        }
        if (i == 3) {
            ((MainActivity) this.f1972b).j();
            return;
        }
        if (i == 4) {
            JSDemo.a((JSDemo) this.f1972b);
            return;
        }
        Object obj = this.f1972b;
        if (i != 5) {
            C0915Z.m2189e((C0915Z) obj);
        } else {
            Market.m594b((Market) obj);
        }
    }
}
