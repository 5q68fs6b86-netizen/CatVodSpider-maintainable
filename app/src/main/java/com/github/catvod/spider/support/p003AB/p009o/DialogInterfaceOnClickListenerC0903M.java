package com.github.catvod.spider.support.p003AB.p009o;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.M */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0903M implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f2120a;

    /* JADX INFO: renamed from: b */
    public final C0915Z f2121b;

    /* JADX INFO: renamed from: c */
    public final Object f2122c;

    /* JADX INFO: renamed from: d */
    public final Object f2123d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0903M(C0915Z c0915z, Object obj, Object obj2, int i) {
        this.f2120a = i;
        this.f2121b = c0915z;
        this.f2122c = obj;
        this.f2123d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f2120a == 0) {
            C0915Z.m2185a(this.f2121b, (Map) this.f2122c, (String) this.f2123d);
            return;
        }
        final C0915Z c0915z = this.f2121b;
        final EditText editText = (EditText) this.f2122c;
        final EditText editText2 = (EditText) this.f2123d;
        c0915z.getClass();
        Init.execute(new Runnable(c0915z, editText, editText2) { // from class: com.github.catvod.spider.support.AB.o.O

            /* JADX INFO: renamed from: a */
            public final C0915Z f2127a;

            /* JADX INFO: renamed from: b */
            public final EditText f2128b;

            /* JADX INFO: renamed from: c */
            public final EditText f2129c;

            {
                this.f2127a = c0915z;
                this.f2128b = editText;
                this.f2129c = editText2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0915Z.m2193i(this.f2127a, this.f2128b, this.f2129c);
            }
        });
    }
}
