package com.github.catvod.spider.support.p003AB.p005b;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.support.p003AB.p009o.C0915Z;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p005b.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0847n implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f2001a;

    /* JADX INFO: renamed from: b */
    public final Object f2002b;

    /* JADX INFO: renamed from: c */
    public final Object f2003c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0847n(Object obj, Object obj2, int i) {
        this.f2001a = i;
        this.f2002b = obj;
        this.f2003c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f2001a != 0) {
            C0915Z.m2190f((C0915Z) this.f2002b, (Map) this.f2003c);
        } else {
            C0857x.m2078h((C0857x) this.f2002b, (EditText) this.f2003c);
        }
    }
}
