package com.github.catvod.spider.support.p117b;

import android.widget.EditText;
import com.github.catvod.spider.support.p121f.C2218g;
import com.github.catvod.spider.support.p128m.C2253G;
import com.github.catvod.spider.support.p128m.C2268k;
import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2184r implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5248b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5249c;

    public /* synthetic */ RunnableC2184r(Object obj, Object obj2, int i) {
        this.f5247a = i;
        this.f5249c = obj;
        this.f5248b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5247a) {
            case 0:
                ((C2187w) this.f5249c).m5759d((String) this.f5248b, true);
                break;
            case 1:
                C2144B c2144b = (C2144B) this.f5249c;
                String str = (String) this.f5248b;
                int i = C2144B.f5027e;
                c2144b.m5433b(str, true);
                break;
            case 2:
                C2268k.m6168c((File) this.f5248b, ((C2218g) this.f5249c).toString());
                break;
            case 3:
                C2253G.m6093k((C2253G) this.f5249c, (Map) this.f5248b);
                break;
            default:
                C2253G.m6088f((C2253G) this.f5249c, (EditText) this.f5248b);
                break;
        }
    }
}
