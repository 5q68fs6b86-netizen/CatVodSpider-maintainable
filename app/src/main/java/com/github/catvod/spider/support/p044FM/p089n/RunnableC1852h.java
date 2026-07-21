package com.github.catvod.spider.support.p044FM.p089n;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p073b.C1715C;
import com.github.catvod.spider.support.p044FM.p073b.C1722J;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p089n.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1852h implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ RunnableC1852h f4255b = new RunnableC1852h(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ RunnableC1852h f4256c = new RunnableC1852h(1);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ RunnableC1852h f4257d = new RunnableC1852h(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4258a;

    public /* synthetic */ RunnableC1852h(int i) {
        this.f4258a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4258a) {
            case 0:
                C1885z.m4562b("UserInfo");
                break;
            case 1:
                try {
                    C1715C.m4006j().m4013o();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                try {
                    C1722J c1722jM4037p = C1722J.m4037p();
                    c1722jM4037p.getClass();
                    Init.checkPermission();
                    c1722jM4037p.m4049j();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
        }
    }
}
