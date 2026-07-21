package com.github.catvod.spider.support.p003AB.p005b;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.support.p003AB.p009o.C0936q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0838e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1977a;

    /* JADX INFO: renamed from: b */
    public final Object f1978b;

    public /* synthetic */ RunnableC0838e(Object obj, int i) {
        this.f1977a = i;
        this.f1978b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1977a;
        if (i == 0) {
            C0857x.m2081k((C0857x) this.f1978b);
            return;
        }
        if (i == 1) {
            ((MainActivity) this.f1978b).h();
            return;
        }
        Object obj = this.f1978b;
        if (i != 2) {
            Toast.makeText(((C0936q) obj).f2206a, "没有详情数据", 0).show();
            return;
        }
        Config config = (Config) obj;
        config.getClass();
        new Handler(Looper.getMainLooper()).post(new RunnableC0837d(config, 3));
    }
}
