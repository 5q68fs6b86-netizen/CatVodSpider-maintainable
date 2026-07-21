package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.support.AB.d.d;
import com.github.catvod.spider.support.AB.g.b;
import com.github.catvod.spider.support.p003AB.p009o.C0893C;
import com.github.catvod.spider.support.p003AB.p009o.C0915Z;
import java.io.PipedOutputStream;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0842i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1987a;

    /* JADX INFO: renamed from: b */
    public final Object f1988b;

    /* JADX INFO: renamed from: c */
    public final Object f1989c;

    public /* synthetic */ RunnableC0842i(Object obj, Object obj2, int i) {
        this.f1987a = i;
        this.f1988b = obj;
        this.f1989c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1987a;
        if (i == 0) {
            C0857x.m2079i((C0857x) this.f1988b, (d) this.f1989c);
            return;
        }
        if (i == 1) {
            C0826J.m1981g((C0826J) this.f1988b, (JSONObject) this.f1989c);
            return;
        }
        if (i == 2) {
            Bili.d((Bili) this.f1988b, (b) this.f1989c);
        } else if (i != 3) {
            ((C0915Z) this.f1988b).m2210x((Map) this.f1989c);
        } else {
            C0893C.m2145a((C0893C) this.f1988b, (PipedOutputStream) this.f1989c);
        }
    }
}
