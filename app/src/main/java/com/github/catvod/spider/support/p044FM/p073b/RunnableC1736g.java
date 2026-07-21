package com.github.catvod.spider.support.p044FM.p073b;

import android.widget.EditText;
import com.github.catvod.spider.support.p044FM.p077d.C1775d;
import com.github.catvod.spider.support.p044FM.p090o.C1867h;
import com.github.catvod.spider.support.p044FM.p090o.C1884y;
import java.io.PipedOutputStream;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1736g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3821b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3822c;

    public /* synthetic */ RunnableC1736g(Object obj, Object obj2, int i) {
        this.f3820a = i;
        this.f3821b = obj;
        this.f3822c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3820a) {
            case 0:
                C1750u.m4118i((C1750u) this.f3821b, (C1775d) this.f3822c);
                break;
            case 1:
                C1867h.m4515a((C1867h) this.f3821b, (PipedOutputStream) this.f3822c);
                break;
            case 2:
                ((C1884y) this.f3821b).m4554u((Map) this.f3822c);
                break;
            default:
                C1884y.m4544k((C1884y) this.f3821b, (EditText) this.f3822c);
                break;
        }
    }
}
