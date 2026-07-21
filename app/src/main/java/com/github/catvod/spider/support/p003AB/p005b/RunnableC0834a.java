package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Market;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0834a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1969a;

    /* JADX INFO: renamed from: b */
    public final Object f1970b;

    public /* synthetic */ RunnableC0834a(Object obj, int i) {
        this.f1969a = i;
        this.f1970b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1969a;
        if (i == 0) {
            C0857x.m2072b((C0857x) this.f1970b);
            return;
        }
        if (i == 1) {
            ((C0826J) this.f1970b).m1987n();
            return;
        }
        Object obj = this.f1970b;
        if (i != 2) {
            Market.m595c((Market) obj);
        } else {
            ((MainActivity) obj).m();
        }
    }
}
