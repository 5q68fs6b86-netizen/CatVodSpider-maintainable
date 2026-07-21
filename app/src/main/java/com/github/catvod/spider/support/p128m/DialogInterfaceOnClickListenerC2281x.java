package com.github.catvod.spider.support.p128m;

import android.content.DialogInterface;
import com.github.catvod.spider.Init;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.m.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2281x implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2253G f5698b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f5699c;

    public /* synthetic */ DialogInterfaceOnClickListenerC2281x(C2253G c2253g, Map map, int i) {
        this.f5697a = i;
        this.f5698b = c2253g;
        this.f5699c = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f5697a) {
            case 0:
                C2253G.m6092j(this.f5698b, this.f5699c);
                break;
            default:
                C2253G c2253g = this.f5698b;
                Map map = this.f5699c;
                c2253g.getClass();
                map.put("model", "");
                map.put("flag", "请输入天翼云盘账号密码");
                Init.execute(new RunnableC2277t(c2253g, map, 1));
                break;
        }
    }
}
