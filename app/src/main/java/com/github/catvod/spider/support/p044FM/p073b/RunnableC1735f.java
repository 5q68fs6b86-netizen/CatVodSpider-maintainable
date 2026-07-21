package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.support.p044FM.p077d.C1775d;
import com.github.catvod.spider.support.p044FM.p082g.C1804b;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1735f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3818b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3819c;

    public /* synthetic */ RunnableC1735f(Object obj, Object obj2, int i) {
        this.f3817a = i;
        this.f3818b = obj;
        this.f3819c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3817a) {
            case 0:
                C1750u.m4118i((C1750u) this.f3818b, (C1775d) this.f3819c);
                break;
            case 1:
                C1722J.m4030g((C1722J) this.f3818b, (JSONObject) this.f3819c);
                break;
            case 2:
                C1729Q.m4063b((C1729Q) this.f3818b, (JSONObject) this.f3819c);
                break;
            default:
                Bili.e((Bili) this.f3818b, (C1804b) this.f3819c);
                break;
        }
    }
}
