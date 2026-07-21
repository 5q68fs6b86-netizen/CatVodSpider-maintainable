package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.spider.support.p044FM.p077d.C1775d;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1734e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3815b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3816c;

    public /* synthetic */ RunnableC1734e(Object obj, Object obj2, int i) {
        this.f3814a = i;
        this.f3815b = obj;
        this.f3816c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3814a) {
            case 0:
                C1750u.m4118i((C1750u) this.f3815b, (C1775d) this.f3816c);
                break;
            case 1:
                C1715C.m3997a((C1715C) this.f3815b, (String[]) this.f3816c);
                break;
            default:
                ((C1722J) this.f3815b).m4018C((String) this.f3816c);
                break;
        }
    }
}
