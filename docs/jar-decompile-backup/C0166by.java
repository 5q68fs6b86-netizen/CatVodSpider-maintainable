package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.by */
/* JADX INFO: loaded from: classes.dex */
public final class C0166by extends C0226ed {

    /* JADX INFO: renamed from: a */
    public final C0589rp f697a;

    public C0166by(C0118ad c0118ad, C0554qh c0554qh) {
        super(c0118ad, null, c0554qh);
        this.f697a = new C0589rp();
        String[] strArr = act.f579a;
        String[] strArr2 = AbstractC0727ws.f1762a;
        C0471nf.m1458h(AbstractC0727ws.m1850l(", ", Arrays.asList(strArr)));
    }

    @Override // com.github.catvod.spider.support.p002A0.C0226ed, com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: b */
    public final AbstractC0272fw clone() {
        return (C0166by) super.mo923b();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: c */
    public final void mo1064c(AbstractC0272fw abstractC0272fw) {
        super.mo1064c(abstractC0272fw);
        this.f697a.remove(abstractC0272fw);
    }
//DUP 
//DUP     @Override // com.github.catvod.spider.support.p002A0.C0226ed, com.github.catvod.spider.support.p002A0.AbstractC0272fw
//DUP     public final Object clone() {
//DUP         return (C0166by) super.mo923b();
//DUP     }

    @Override // com.github.catvod.spider.support.p002A0.C0226ed
    /* JADX INFO: renamed from: d */
    public final C0226ed mo923b() {
        return (C0166by) super.mo923b();
    }
}
