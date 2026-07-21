package com.github.catvod.spider.support.p003AB.p009o;

import android.widget.EditText;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0931l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f2191a;

    /* JADX INFO: renamed from: b */
    public final Object f2192b;

    /* JADX INFO: renamed from: c */
    public final Object f2193c;

    /* JADX INFO: renamed from: d */
    public final Object f2194d;

    public /* synthetic */ RunnableC0931l(Object obj, Object obj2, Object obj3, int i) {
        this.f2191a = i;
        this.f2192b = obj;
        this.f2193c = obj2;
        this.f2194d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2191a != 0) {
            C0915Z.m2196l((C0915Z) this.f2192b, (String) this.f2193c, (EditText) this.f2194d);
        } else {
            C0936q.m2252d((C0936q) this.f2192b, (List) this.f2193c, (Runnable) this.f2194d);
        }
    }
}
