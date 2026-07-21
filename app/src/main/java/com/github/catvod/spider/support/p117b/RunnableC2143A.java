package com.github.catvod.spider.support.p117b;

import com.github.catvod.spider.support.p128m.C2253G;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2143A implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5023a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5024b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5025c;

    public /* synthetic */ RunnableC2143A(Object obj, Object obj2, int i) {
        this.f5023a = i;
        this.f5024b = obj;
        this.f5025c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5023a) {
            case 0:
                ((C2144B) this.f5024b).m5433b((String) this.f5025c, true);
                break;
            default:
                ((C2253G) this.f5024b).m6108z((Map) this.f5025c);
                break;
        }
    }
}
