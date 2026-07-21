package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.AB.d.d;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0851r implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f2008a;

    /* JADX INFO: renamed from: b */
    public final C0857x f2009b;

    public /* synthetic */ RunnableC0851r(C0857x c0857x, int i) {
        this.f2008a = i;
        this.f2009b = c0857x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2008a;
        C0857x c0857x = this.f2009b;
        if (i == 0) {
            C0857x.m2072b(c0857x);
            return;
        }
        c0857x.getClass();
        String strM2132l = C0869c.m2132l("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null);
        Init.run(new RunnableC0845l(c0857x, strM2132l, d.g(strM2132l).b().c()));
    }
}
