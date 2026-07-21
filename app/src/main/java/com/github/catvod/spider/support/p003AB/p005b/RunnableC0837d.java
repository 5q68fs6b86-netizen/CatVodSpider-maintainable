package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.support.p003AB.p009o.C0924e;
import com.github.catvod.spider.support.p003AB.p009o.C0936q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p005b.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0837d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1975a;

    /* JADX INFO: renamed from: b */
    public final Object f1976b;

    public /* synthetic */ RunnableC0837d(Object obj, int i) {
        this.f1975a = i;
        this.f1976b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1975a) {
            case 0:
                C0857x.m2072b((C0857x) this.f1976b);
                break;
            case 1:
                ((MainActivity) this.f1976b).l();
                break;
            case 2:
                Bili.b((Bili) this.f1976b);
                break;
            case 3:
                Config.m479b((Config) this.f1976b);
                break;
            case 4:
                JSDemo.b((JSDemo) this.f1976b);
                break;
            case 5:
                Market market = (Market) this.f1976b;
                market.getClass();
                Init.run(new RunnableC0834a(market, 3));
                break;
            case 6:
                C0924e.m2242b((C0924e) this.f1976b);
                break;
            default:
                C0936q.m2249a((C0936q) this.f1976b);
                break;
        }
    }
}
