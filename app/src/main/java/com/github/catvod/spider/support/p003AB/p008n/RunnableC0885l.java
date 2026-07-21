package com.github.catvod.spider.support.p003AB.p008n;

import com.github.catvod.spider.support.p003AB.p005b.C0826J;
import com.github.catvod.spider.support.p003AB.p005b.C0833Q;
import com.github.catvod.spider.support.p003AB.p009o.C0897G;
import com.github.catvod.spider.support.p003AB.p009o.C0921c0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p008n.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0885l implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final RunnableC0885l f2079b = new RunnableC0885l(0);

    /* JADX INFO: renamed from: c */
    public static final RunnableC0885l f2080c = new RunnableC0885l(1);

    /* JADX INFO: renamed from: d */
    public static final RunnableC0885l f2081d = new RunnableC0885l(2);

    /* JADX INFO: renamed from: a */
    public final int f2082a;

    public /* synthetic */ RunnableC0885l(int i) {
        this.f2082a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2082a;
        if (i == 0) {
            C0826J.m1988o().getClass();
            C0921c0.m2238u(".quark", "");
            C0897G.m2162c(".quarkMemberType", "");
            C0897G.m2162c(".quark", "");
            return;
        }
        if (i == 1) {
            new Thread(RunnableC0883j.f2072c).start();
            return;
        }
        try {
            C0833Q.m2036t().m2043D();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
