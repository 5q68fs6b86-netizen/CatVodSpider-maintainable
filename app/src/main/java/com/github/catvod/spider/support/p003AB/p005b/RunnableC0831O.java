package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.support.p003AB.p009o.C0895E;
import com.github.catvod.spider.support.p003AB.p009o.C0936q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p005b.O */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0831O implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1956a;

    /* JADX INFO: renamed from: b */
    public final Object f1957b;

    public /* synthetic */ RunnableC0831O(Object obj, int i) {
        this.f1956a = i;
        this.f1957b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1956a;
        if (i == 0) {
            ((C0833Q) this.f1957b).m2049R();
            return;
        }
        final int i2 = 1;
        if (i == 1) {
            ((MainActivity) this.f1957b).i();
            return;
        }
        if (i == 2) {
            final Config config = (Config) this.f1957b;
            config.getClass();
            new Thread(new Runnable(config, i2) { // from class: com.github.catvod.spider.support.p003AB.p008n.e

                /* JADX INFO: renamed from: a */
                public final int f2061a;

                /* JADX INFO: renamed from: b */
                public final Config f2062b;

                {
                    this.f2061a = i2;
                    this.f2062b = config;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = this.f2061a;
                    Config config2 = this.f2062b;
                    if (i3 != 0) {
                        Config.d(config2);
                    } else {
                        config2.getClass();
                        new Thread(new Runnable(config2, 1) { // from class: com.github.catvod.spider.support.p003AB.p006l.g

                            /* JADX INFO: renamed from: a */
                            public final int f2033a;

                            /* JADX INFO: renamed from: b */
                            public final Object f2034b;

                            {
                                this.f2033a = i;
                                this.f2034b = config2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4 = this.f2033a;
                                Object obj = this.f2034b;
                                if (i4 != 0) {
                                    Config.m481c((Config) obj);
                                } else {
                                    ((MainActivity) obj).k();
                                }
                            }
                        }).start();
                    }
                }
            }).start();
        } else {
            Object obj = this.f1957b;
            if (i != 3) {
                C0895E.m2151a((String) obj);
            } else {
                C0936q.m2256h((C0936q) obj);
            }
        }
    }
}
