package com.github.catvod.spider.support.p003AB.p005b;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.E */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0821E implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final int f1930a;

    /* JADX INFO: renamed from: b */
    public final Object f1931b;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0821E(Object obj, int i) {
        this.f1930a = i;
        this.f1931b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f1930a;
        Object obj = this.f1931b;
        if (i != 0) {
            C0833Q.m2019a((C0833Q) obj);
        } else {
            C0826J.m1976b((C0826J) obj);
        }
    }
}
