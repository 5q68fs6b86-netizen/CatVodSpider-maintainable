package com.github.catvod.spider.support.p044FM.p089n;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p073b.C1729Q;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p089n.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1854j implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ RunnableC1854j f4263b = new RunnableC1854j(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ RunnableC1854j f4264c = new RunnableC1854j(1);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ RunnableC1854j f4265d = new RunnableC1854j(2);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ RunnableC1854j f4266e = new RunnableC1854j(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4267a;

    public /* synthetic */ RunnableC1854j(int i) {
        this.f4267a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f4267a) {
            case 0:
                new Thread(RunnableC1851g.f4252c).start();
                break;
            case 1:
                new Thread(RunnableC1853i.f4261d).start();
                break;
            case 2:
                try {
                    C1729Q c1729qM4076q = C1729Q.m4076q();
                    c1729qM4076q.getClass();
                    Init.checkPermission();
                    c1729qM4076q.m4088l();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                Init.m574a();
                break;
        }
    }
}
