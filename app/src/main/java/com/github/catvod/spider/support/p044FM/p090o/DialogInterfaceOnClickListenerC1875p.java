package com.github.catvod.spider.support.p044FM.p090o;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p044FM.p073b.C1750u;
import com.github.catvod.spider.support.p044FM.p073b.RunnableC1726N;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1875p implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4319a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4320b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4321c;

    public /* synthetic */ DialogInterfaceOnClickListenerC1875p(Object obj, Object obj2, int i) {
        this.f4319a = i;
        this.f4320b = obj;
        this.f4321c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f4319a) {
            case 0:
                C1884y.m4535b((C1884y) this.f4320b, (Map) this.f4321c);
                break;
            case 1:
                C1884y c1884y = (C1884y) this.f4320b;
                Map map = (Map) this.f4321c;
                c1884y.getClass();
                map.put("model", "1");
                map.put("flag", "请使用微信或者浏览器扫码下方二维码远程输入");
                Init.execute(new RunnableC1726N(c1884y, map, 1));
                break;
            default:
                C1750u.m4117h((C1750u) this.f4320b, (EditText) this.f4321c);
                break;
        }
    }
}
