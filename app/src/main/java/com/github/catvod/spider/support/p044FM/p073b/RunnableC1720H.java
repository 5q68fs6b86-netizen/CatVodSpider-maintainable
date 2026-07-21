package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.support.p044FM.p082g.C1804b;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p090o.C1884y;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b.H */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1720H implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3771a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3772b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3773c;

    public /* synthetic */ RunnableC1720H(Object obj, Object obj2, int i) {
        this.f3771a = i;
        this.f3773c = obj;
        this.f3772b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3771a) {
            case 0:
                C1722J c1722j = (C1722J) this.f3773c;
                String strM4479n = (String) this.f3772b;
                c1722j.getClass();
                if (strM4479n.startsWith("http")) {
                    strM4479n = C1840c.m4479n(strM4479n, null);
                }
                c1722j.m4047K(strM4479n);
                break;
            case 1:
                C1729Q.m4067f((C1729Q) this.f3773c, (String) this.f3772b);
                break;
            case 2:
                Bili.d((Bili) this.f3773c, (C1804b) this.f3772b);
                break;
            default:
                ((C1884y) this.f3773c).m4559x((Map) this.f3772b);
                break;
        }
    }
}
