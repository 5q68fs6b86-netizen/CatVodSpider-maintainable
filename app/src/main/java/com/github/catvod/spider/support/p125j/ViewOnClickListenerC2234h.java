package com.github.catvod.spider.support.p125j;

import android.app.AlertDialog;
import android.view.View;
import com.github.catvod.debug.MainActivity;

/* JADX INFO: renamed from: com.github.catvod.spider.support.j.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2234h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ViewOnClickListenerC2234h f5579a = new ViewOnClickListenerC2234h();

    private /* synthetic */ ViewOnClickListenerC2234h() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = MainActivity.c;
        ((AlertDialog) view.getTag()).dismiss();
    }
}
