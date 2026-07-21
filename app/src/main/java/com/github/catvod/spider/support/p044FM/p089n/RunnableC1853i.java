package com.github.catvod.spider.support.p044FM.p089n;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p044FM.p090o.C1860a;
import com.github.catvod.spider.support.p044FM.p090o.C1884y;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.n.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1853i implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ RunnableC1853i f4259b = new RunnableC1853i(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ RunnableC1853i f4260c = new RunnableC1853i(1);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ RunnableC1853i f4261d = new RunnableC1853i(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4262a;

    public /* synthetic */ RunnableC1853i(int i) {
        this.f4262a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4262a) {
            case 0:
                C1860a.m4503m(C1860a.m4502l("/.aliyun"), "");
                break;
            case 1:
                new Thread(RunnableC1854j.f4265d).start();
                break;
            default:
                try {
                    SpiderDebug.log("addBaidu debug");
                    HashMap map = new HashMap();
                    map.put("site", "baidu");
                    map.put("flag", "请使用百度网盘扫码");
                    C1884y.m4548o().m4559x(map);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
        }
    }
}
