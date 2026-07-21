package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p077d.C1775d;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1744o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1750u f3839b;

    public /* synthetic */ RunnableC1744o(C1750u c1750u, int i) {
        this.f3838a = i;
        this.f3839b = c1750u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3838a) {
            case 0:
                C1750u.m4111b(this.f3839b);
                break;
            default:
                C1750u c1750u = this.f3839b;
                c1750u.getClass();
                String strM4479n = C1840c.m4479n("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null);
                Init.run(new RunnableC1739j(c1750u, strM4479n, C1775d.m4240g(strM4479n).m4242b().m4243c(), 0));
                break;
        }
    }
}
