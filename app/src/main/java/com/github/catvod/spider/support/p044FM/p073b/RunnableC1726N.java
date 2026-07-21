package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.spider.support.p044FM.p090o.C1884y;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b.N */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1726N implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3790a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3791b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3792c;

    public /* synthetic */ RunnableC1726N(Object obj, Object obj2, int i) {
        this.f3790a = i;
        this.f3791b = obj;
        this.f3792c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3790a) {
            case 0:
                C1729Q.m4065d((C1729Q) this.f3791b, (String) this.f3792c);
                break;
            default:
                ((C1884y) this.f3791b).m4559x((Map) this.f3792c);
                break;
        }
    }
}
