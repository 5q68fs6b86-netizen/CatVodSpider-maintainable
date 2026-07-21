package com.github.catvod.spider.support.p044FM.p087l;

import android.os.Handler;
import android.os.Looper;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p087l.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1837h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4221a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4222b;

    public /* synthetic */ RunnableC1837h(Object obj, int i) {
        this.f4221a = i;
        this.f4222b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4221a) {
            case 0:
                ((MainActivity) this.f4222b).h();
                break;
            default:
                Config config = (Config) this.f4222b;
                config.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC1836g(config, 2));
                break;
        }
    }
}
