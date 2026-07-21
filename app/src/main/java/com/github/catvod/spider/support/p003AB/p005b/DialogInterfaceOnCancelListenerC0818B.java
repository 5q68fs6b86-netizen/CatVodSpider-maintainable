package com.github.catvod.spider.support.p003AB.p005b;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p005b.B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0818B implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final int f1924a;

    /* JADX INFO: renamed from: b */
    public final Object f1925b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0818B(Object obj, int i) {
        this.f1924a = i;
        this.f1925b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.f1924a;
        Object obj = this.f1925b;
        if (i != 0) {
            C0833Q.m2025g((C0833Q) obj);
        } else {
            C0826J.m1980f((C0826J) obj);
        }
    }
}
