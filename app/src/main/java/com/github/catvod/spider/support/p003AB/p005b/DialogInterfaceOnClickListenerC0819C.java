package com.github.catvod.spider.support.p003AB.p005b;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p003AB.p009o.C0915Z;
import com.github.catvod.spider.support.p003AB.p009o.RunnableC0912W;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0819C implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f1926a;

    /* JADX INFO: renamed from: b */
    public final Object f1927b;

    /* JADX INFO: renamed from: c */
    public final Object f1928c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0819C(Object obj, Object obj2, int i) {
        this.f1926a = i;
        this.f1927b = obj;
        this.f1928c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f1926a == 0) {
            C0826J.m1979e((C0826J) this.f1927b, (EditText) this.f1928c);
            return;
        }
        C0915Z c0915z = (C0915Z) this.f1927b;
        Map map = (Map) this.f1928c;
        c0915z.getClass();
        map.put("model", "");
        map.put("flag", "请输入天翼云盘账号密码");
        Init.execute(new RunnableC0912W(c0915z, map, 2));
    }
}
