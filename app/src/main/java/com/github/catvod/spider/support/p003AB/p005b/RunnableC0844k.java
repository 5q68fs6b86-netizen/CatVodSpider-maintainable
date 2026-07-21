package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.spider.Config;
import com.github.catvod.spider.support.p003AB.p009o.C0915Z;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0844k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1993a;

    /* JADX INFO: renamed from: b */
    public final Object f1994b;

    /* JADX INFO: renamed from: c */
    public final Object f1995c;

    public /* synthetic */ RunnableC0844k(Object obj, Object obj2, int i) {
        this.f1993a = i;
        this.f1995c = obj;
        this.f1994b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1993a;
        if (i == 0) {
            C0857x.m2071a((C0857x) this.f1995c, (String) this.f1994b);
            return;
        }
        if (i == 1) {
            C0833Q.m2022d((C0833Q) this.f1995c, (String) this.f1994b);
        } else if (i != 2) {
            ((C0915Z) this.f1995c).m2210x((Map) this.f1994b);
        } else {
            Config.a((Config) this.f1995c, (JSONObject) this.f1994b);
        }
    }
}
