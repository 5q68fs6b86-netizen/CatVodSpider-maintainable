package com.github.catvod.spider.support.p117b;

import com.github.catvod.spider.Config;
import com.github.catvod.spider.support.p119d.C2209y;
import com.github.catvod.spider.support.p124i.C2226d;
import com.github.catvod.spider.support.p128m.C2268k;
import java.io.File;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2182p implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5241a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5242b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5243c;

    public /* synthetic */ RunnableC2182p(Object obj, Object obj2, int i) {
        this.f5241a = i;
        this.f5242b = obj;
        this.f5243c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5241a) {
            case 0:
                ((C2187w) this.f5242b).m5759d((String) this.f5243c, true);
                break;
            case 1:
                C2268k.m6168c((File) this.f5243c, ((C2226d) this.f5242b).toString());
                break;
            case 2:
                C2268k.m6168c((File) this.f5243c, ((C2209y) this.f5242b).m5926e());
                break;
            default:
                ((Config) this.f5242b).m490p((String) this.f5243c);
                break;
        }
    }
}
