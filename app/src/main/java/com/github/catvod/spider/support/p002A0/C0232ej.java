package com.github.catvod.spider.support.p002A0;

import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ej */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0232ej implements InterfaceC0253fd, EventListener.Factory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f780a;

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0253fd
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo908b(AbstractC0272fw abstractC0272fw, int i) {
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0253fd
    /* JADX INFO: renamed from: c */
    public void mo909c(AbstractC0272fw abstractC0272fw, int i) {
        boolean z = abstractC0272fw instanceof abt;
        StringBuilder sb = (StringBuilder) this.f780a;
        if (z) {
            sb.append(((abt) abstractC0272fw).m1732f());
        } else if (abstractC0272fw instanceof C0638tk) {
            sb.append(((C0638tk) abstractC0272fw).m1732f());
        } else if (abstractC0272fw instanceof C0586rm) {
            sb.append(((C0586rm) abstractC0272fw).m1732f());
        }
    }

    public EventListener create(Call call) {
        return Util.Ϳ((EventListener) this.f780a, call);
    }
}
