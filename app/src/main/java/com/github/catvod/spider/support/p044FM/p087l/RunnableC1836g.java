package com.github.catvod.spider.support.p044FM.p087l;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.support.p044FM.p090o.C1869j;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p087l.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1836g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4219a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4220b;

    public /* synthetic */ RunnableC1836g(Object obj, int i) {
        this.f4219a = i;
        this.f4220b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4219a) {
            case 0:
                ((MainActivity) this.f4220b).l();
                break;
            case 1:
                Bili.b((Bili) this.f4220b);
                break;
            case 2:
                Config.m477a((Config) this.f4220b);
                break;
            case 3:
                Market.m594b((Market) this.f4220b);
                break;
            default:
                C1869j.m4521a((String) this.f4220b);
                break;
        }
    }
}
