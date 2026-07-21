package com.github.catvod.spider.support.p003AB.p005b;

import android.widget.EditText;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.support.p003AB.d.d;
import com.github.catvod.spider.support.p003AB.g.b;
import com.github.catvod.spider.support.p003AB.p009o.C0915Z;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p005b.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0841h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1984a;

    /* JADX INFO: renamed from: b */
    public final Object f1985b;

    /* JADX INFO: renamed from: c */
    public final Object f1986c;

    public /* synthetic */ RunnableC0841h(Object obj, Object obj2, int i) {
        this.f1984a = i;
        this.f1985b = obj;
        this.f1986c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1984a;
        if (i == 0) {
            C0857x.m2079i((C0857x) this.f1985b, (d) this.f1986c);
            return;
        }
        if (i == 1) {
            ((C0826J) this.f1985b).m1969D((String) this.f1986c);
            return;
        }
        if (i == 2) {
            C0833Q.m2029k((C0833Q) this.f1985b, (String) this.f1986c);
            return;
        }
        if (i == 3) {
            Bili.d((Bili) this.f1985b, (b) this.f1986c);
        } else if (i != 4) {
            C0915Z.m2195k((C0915Z) this.f1985b, (EditText) this.f1986c);
        } else {
            ((C0915Z) this.f1985b).m2205u((Map) this.f1986c);
        }
    }
}
