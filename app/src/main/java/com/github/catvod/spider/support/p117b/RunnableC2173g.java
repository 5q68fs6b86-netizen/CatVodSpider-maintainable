package com.github.catvod.spider.support.p117b;

import android.widget.Toast;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p128m.C2256I;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2173g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5203b;

    public /* synthetic */ RunnableC2173g(Object obj, int i) {
        this.f5202a = i;
        this.f5203b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5202a) {
            case 0:
                C2175i.m5659a((C2175i) this.f5203b);
                break;
            case 1:
                ((MainActivity) this.f5203b).m();
                break;
            case 2:
                Config.m481c((Config) this.f5203b);
                break;
            default:
                String str = (String) this.f5203b;
                List<String> list = C2256I.f5633a;
                Toast.makeText(Init.context(), str, 1).show();
                break;
        }
    }
}
