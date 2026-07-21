package com.github.catvod.spider.support.p128m;

import android.content.Context;
import android.content.Intent;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
class HH$1 implements Runnable {
    final /* synthetic */ Context val$context;

    HH$1(Context context) {
        this.val$context = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
        }
        try {
            Context context = this.val$context;
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            launchIntentForPackage.addFlags(268468224);
            context.startActivity(launchIntentForPackage);
            Thread.sleep(200L);
            Process.killProcess(Process.myPid());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
