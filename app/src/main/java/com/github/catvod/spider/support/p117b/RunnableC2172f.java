package com.github.catvod.spider.support.p117b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.support.p119d.C2198b;
import com.github.catvod.spider.support.p128m.C2268k;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2172f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5201b;

    public /* synthetic */ RunnableC2172f(Object obj, int i) {
        this.f5200a = i;
        this.f5201b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5200a) {
            case 0:
                C2175i.m5659a((C2175i) this.f5201b);
                break;
            case 1:
                C2198b c2198b = (C2198b) this.f5201b;
                c2198b.getClass();
                C2268k.m6168c(C2268k.m6166b("aliyun"), c2198b.toString());
                break;
            case 2:
                MainActivity.c((MainActivity) this.f5201b);
                break;
            default:
                Config.m477a((Config) this.f5201b);
                break;
        }
    }
}
