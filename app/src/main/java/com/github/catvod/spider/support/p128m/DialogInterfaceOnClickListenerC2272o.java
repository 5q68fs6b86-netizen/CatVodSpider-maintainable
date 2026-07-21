package com.github.catvod.spider.support.p128m;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.m.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2272o implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2253G f5670b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5671c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5672d;

    public /* synthetic */ DialogInterfaceOnClickListenerC2272o(C2253G c2253g, Object obj, Object obj2, int i) {
        this.f5669a = i;
        this.f5670b = c2253g;
        this.f5671c = obj;
        this.f5672d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f5669a) {
            case 0:
                C2253G.m6098p(this.f5670b, (Map) this.f5671c, (String) this.f5672d);
                break;
            default:
                final C2253G c2253g = this.f5670b;
                final EditText editText = (EditText) this.f5671c;
                final EditText editText2 = (EditText) this.f5672d;
                c2253g.getClass();
                Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.m.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2253G.m6085c(c2253g, editText, editText2);
                    }
                });
                break;
        }
    }
}
