package com.github.catvod.spider.support.p003AB.p008n;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p003AB.p009o.C0915Z;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p008n.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0882i implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final RunnableC0882i f2068b = new RunnableC0882i(0);

    /* JADX INFO: renamed from: c */
    public static final RunnableC0882i f2069c = new RunnableC0882i(1);

    /* JADX INFO: renamed from: a */
    public final int f2070a;

    public /* synthetic */ RunnableC0882i(int i) {
        this.f2070a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2070a == 0) {
            new Thread(RunnableC0885l.f2081d).start();
            return;
        }
        try {
            SpiderDebug.log("addBaidu debug");
            HashMap map = new HashMap();
            map.put("site", "baidu");
            map.put("flag", "请使用百度网盘扫码");
            C0915Z.m2199o().m2210x(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
