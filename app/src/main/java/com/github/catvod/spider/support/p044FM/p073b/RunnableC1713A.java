package com.github.catvod.spider.support.p044FM.p073b;

import android.widget.EditText;
import com.github.catvod.spider.support.p044FM.p090o.C1884y;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1713A implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3752a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3753b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3754c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3755d;

    public /* synthetic */ RunnableC1713A(Object obj, Object obj2, Object obj3, int i) {
        this.f3752a = i;
        this.f3753b = obj;
        this.f3754c = obj2;
        this.f3755d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3752a) {
            case 0:
                C1715C.m4000d((C1715C) this.f3753b, (String) this.f3754c, (String) this.f3755d);
                break;
            default:
                C1884y.m4542i((C1884y) this.f3753b, (EditText) this.f3754c, (EditText) this.f3755d);
                break;
        }
    }
}
