package com.github.catvod.spider.support.p003AB.p009o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.github.catvod.crawler.SpiderDebug;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p009o.x */
/* JADX INFO: loaded from: classes.dex */
final class C0943x implements Application.ActivityLifecycleCallbacks {
    C0943x() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String lowerCase = activity.getClass().getName().toLowerCase();
        SpiderDebug.log("activityName: " + lowerCase);
        if (lowerCase.contains("videoactivity") || lowerCase.contains("detailactivity") || lowerCase.contains("playactivity")) {
            C0924e c0924e = new C0924e(activity);
            if (c0924e.f2171b) {
                return;
            }
            try {
                c0924e.m2247e();
                c0924e.f2171b = true;
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
