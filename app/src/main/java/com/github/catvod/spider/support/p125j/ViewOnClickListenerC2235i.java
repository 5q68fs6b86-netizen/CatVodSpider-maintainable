package com.github.catvod.spider.support.p125j;

import android.app.AlertDialog;
import android.view.View;
import com.github.catvod.debug.MainActivity;

/* JADX INFO: renamed from: com.github.catvod.spider.support.j.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2235i implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ViewOnClickListenerC2235i f5580a = new ViewOnClickListenerC2235i();

    private /* synthetic */ ViewOnClickListenerC2235i() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = MainActivity.c;
        ((AlertDialog) view.getTag()).dismiss();
    }
}
