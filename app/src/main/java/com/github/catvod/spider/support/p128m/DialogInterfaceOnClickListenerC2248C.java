package com.github.catvod.spider.support.p128m;

import android.content.DialogInterface;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p117b.RunnableC2143A;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2248C implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2253G f5610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f5611b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.C$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2253G f5612a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f5613b;

        public /* synthetic */ AnonymousClass1(C2253G c2253g, Map map) {
            this.f5612a = c2253g;
            this.f5613b = map;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            C2253G c2253g = this.f5612a;
            Map map = this.f5613b;
            c2253g.getClass();
            map.put("model", "1");
            Init.execute(new RunnableC2143A(c2253g, map, 1));
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC2248C(C2253G c2253g, Map map) {
        this.f5610a = c2253g;
        this.f5611b = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C2253G c2253g = this.f5610a;
        Map map = this.f5611b;
        c2253g.getClass();
        map.put("model", "1");
        map.put("flag", "请使用浏览器或者微信扫描二维码");
        Init.execute(new RunnableC2143A(c2253g, map, 1));
    }
}
