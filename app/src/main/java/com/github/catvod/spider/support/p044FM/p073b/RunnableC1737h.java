package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.support.p044FM.p082g.C1804b;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1737h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3824b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3825c;

    public /* synthetic */ RunnableC1737h(Object obj, Object obj2, int i) {
        this.f3823a = i;
        this.f3824b = obj;
        this.f3825c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3823a) {
            case 0:
                C1750u.m4110a((C1750u) this.f3824b, (String) this.f3825c);
                break;
            case 1:
                C1722J.m4024a((C1722J) this.f3824b, (JSONObject) this.f3825c);
                break;
            case 2:
                Bili.d((Bili) this.f3824b, (C1804b) this.f3825c);
                break;
            default:
                Config.b((Config) this.f3824b, (JSONObject) this.f3825c);
                break;
        }
    }
}
