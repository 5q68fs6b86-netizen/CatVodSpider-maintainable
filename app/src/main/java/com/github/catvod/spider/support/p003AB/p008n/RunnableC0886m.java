package com.github.catvod.spider.support.p003AB.p008n;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p003AB.p005b.C0826J;
import com.github.catvod.spider.support.p003AB.p005b.C0833Q;
import com.github.catvod.spider.support.p003AB.p009o.C0896F;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.n.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0886m implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final RunnableC0886m f2083b = new RunnableC0886m(0);

    /* JADX INFO: renamed from: c */
    public static final RunnableC0886m f2084c = new RunnableC0886m(1);

    /* JADX INFO: renamed from: d */
    public static final RunnableC0886m f2085d = new RunnableC0886m(2);

    /* JADX INFO: renamed from: e */
    public static final RunnableC0886m f2086e = new RunnableC0886m(3);

    /* JADX INFO: renamed from: a */
    public final int f2087a;

    public /* synthetic */ RunnableC0886m(int i) {
        this.f2087a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2087a;
        if (i == 0) {
            C0896F.m2159g(C0896F.m2158f("/.aliyun"), "");
            return;
        }
        if (i == 1) {
            new Thread(f2085d).start();
            return;
        }
        if (i != 2) {
            try {
                C0826J c0826jM1988o = C0826J.m1988o();
                c0826jM1988o.getClass();
                Init.checkPermission();
                c0826jM1988o.m2003j();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            C0833Q c0833qM2036t = C0833Q.m2036t();
            c0833qM2036t.getClass();
            Init.checkPermission();
            c0833qM2036t.m2050o();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
