package com.github.catvod.spider.support.p044FM.p073b;

import android.widget.EditText;
import com.github.catvod.spider.support.p044FM.p077d.C1775d;
import com.github.catvod.spider.support.p044FM.p090o.C1884y;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1739j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3829a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f3830b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3831c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3832d;

    public /* synthetic */ RunnableC1739j(Object obj, String str, Object obj2, int i) {
        this.f3829a = i;
        this.f3831c = obj;
        this.f3830b = str;
        this.f3832d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3829a) {
            case 0:
                C1750u.m4119j((C1750u) this.f3831c, this.f3830b, (C1775d) this.f3832d);
                break;
            default:
                C1884y.m4545l((C1884y) this.f3831c, this.f3830b, (EditText) this.f3832d);
                break;
        }
    }
}
