package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.support.AB.d.d;
import com.github.catvod.spider.support.AB.g.b;
import com.github.catvod.spider.support.p003AB.p009o.C0936q;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0840g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1981a;

    /* JADX INFO: renamed from: b */
    public final Object f1982b;

    /* JADX INFO: renamed from: c */
    public final Object f1983c;

    public /* synthetic */ RunnableC0840g(Object obj, Object obj2, int i) {
        this.f1981a = i;
        this.f1982b = obj;
        this.f1983c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1981a;
        if (i == 0) {
            C0857x.m2079i((C0857x) this.f1982b, (d) this.f1983c);
        } else if (i != 1) {
            C0936q.m2260l((C0936q) this.f1982b, (List) this.f1983c);
        } else {
            Bili.d((Bili) this.f1982b, (b) this.f1983c);
        }
    }
}
