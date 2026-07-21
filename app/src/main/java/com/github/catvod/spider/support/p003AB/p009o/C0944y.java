package com.github.catvod.spider.support.p003AB.p009o;

import android.app.Application;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0944y {

    /* JADX INFO: renamed from: b */
    private static C0944y f2230b;

    /* JADX INFO: renamed from: a */
    private boolean f2231a = false;

    private C0944y() {
    }

    /* JADX INFO: renamed from: a */
    public static C0944y m2282a() {
        if (f2230b == null) {
            synchronized (C0944y.class) {
                if (f2230b == null) {
                    f2230b = new C0944y();
                }
            }
        }
        return f2230b;
    }

    /* JADX INFO: renamed from: b */
    public final void m2283b(Application application) {
        if (this.f2231a) {
            return;
        }
        this.f2231a = true;
        application.registerActivityLifecycleCallbacks(new C0943x());
    }
}
