package com.github.catvod.spider.support.p044FM.p090o;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p073b.RunnableC1713A;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1873n implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1884y f4313b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4314c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f4315d;

    public /* synthetic */ DialogInterfaceOnClickListenerC1873n(C1884y c1884y, Object obj, Object obj2, int i) {
        this.f4312a = i;
        this.f4313b = c1884y;
        this.f4314c = obj;
        this.f4315d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f4312a) {
            case 0:
                C1884y.m4534a(this.f4313b, (Map) this.f4314c, (String) this.f4315d);
                break;
            default:
                C1884y c1884y = this.f4313b;
                EditText editText = (EditText) this.f4314c;
                EditText editText2 = (EditText) this.f4315d;
                c1884y.getClass();
                Init.execute(new RunnableC1713A(c1884y, editText, editText2, 1));
                break;
        }
    }
}
