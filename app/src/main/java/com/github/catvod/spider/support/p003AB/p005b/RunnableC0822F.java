package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p005b.F */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0822F implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1932a;

    /* JADX INFO: renamed from: b */
    public final Object f1933b;

    /* JADX INFO: renamed from: c */
    public final Object f1934c;

    public /* synthetic */ RunnableC0822F(Object obj, Object obj2, int i) {
        this.f1932a = i;
        this.f1933b = obj;
        this.f1934c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1932a != 0) {
            C0833Q.m2030l((C0833Q) this.f1933b, (JSONObject) this.f1934c);
            return;
        }
        C0826J c0826j = (C0826J) this.f1933b;
        String strM2132l = (String) this.f1934c;
        c0826j.getClass();
        if (strM2132l.startsWith("http")) {
            strM2132l = C0869c.m2132l(strM2132l, null);
        }
        c0826j.m2001M(strM2132l);
    }
}
