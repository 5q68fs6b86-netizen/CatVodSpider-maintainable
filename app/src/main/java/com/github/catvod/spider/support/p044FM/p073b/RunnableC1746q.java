package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.support.p044FM.p090o.C1884y;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1746q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3843b;

    public /* synthetic */ RunnableC1746q(Object obj, int i) {
        this.f3842a = i;
        this.f3843b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3842a) {
            case 0:
                C1750u.m4111b((C1750u) this.f3843b);
                break;
            case 1:
                ((MainActivity) this.f3843b).i();
                break;
            case 2:
                JSDemo.b((JSDemo) this.f3843b);
                break;
            default:
                C1884y.m4538e((C1884y) this.f3843b);
                break;
        }
    }
}
