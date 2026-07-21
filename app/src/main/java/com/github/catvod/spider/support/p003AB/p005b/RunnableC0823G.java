package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.support.p003AB.g.b;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p005b.G */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0823G implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1935a;

    /* JADX INFO: renamed from: b */
    public final Object f1936b;

    /* JADX INFO: renamed from: c */
    public final Object f1937c;

    public /* synthetic */ RunnableC0823G(Object obj, Object obj2, int i) {
        this.f1935a = i;
        this.f1937c = obj;
        this.f1936b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1935a;
        if (i == 0) {
            C0826J.m1975a((C0826J) this.f1937c, (JSONObject) this.f1936b);
        } else if (i != 1) {
            Bili.e((Bili) this.f1937c, (b) this.f1936b);
        } else {
            C0833Q.m2020b((C0833Q) this.f1937c, (JSONObject) this.f1936b);
        }
    }
}
