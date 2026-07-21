package com.github.catvod.spider.support.p003AB.p009o;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p003AB.p005b.C0833Q;
import com.github.catvod.spider.support.p003AB.p005b.RunnableC0842i;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0906P implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f2130a;

    /* JADX INFO: renamed from: b */
    public final Object f2131b;

    /* JADX INFO: renamed from: c */
    public final Object f2132c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0906P(Object obj, Object obj2, int i) {
        this.f2130a = i;
        this.f2131b = obj;
        this.f2132c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f2130a;
        if (i2 == 0) {
            C0915Z.m2186b((C0915Z) this.f2131b, (Map) this.f2132c);
            return;
        }
        if (i2 != 1) {
            C0833Q.m2023e((C0833Q) this.f2131b, (EditText) this.f2132c);
            return;
        }
        C0915Z c0915z = (C0915Z) this.f2131b;
        Map map = (Map) this.f2132c;
        c0915z.getClass();
        map.put("model", "1");
        map.put("flag", "请使用微信或者浏览器扫码下方二维码远程输入");
        Init.execute(new RunnableC0842i(c0915z, map, 4));
    }
}
