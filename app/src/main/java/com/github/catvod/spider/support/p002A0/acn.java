package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class acn extends AbstractC0748xm {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f566a;

    /* JADX INFO: renamed from: b */
    public int f567b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aco f568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acn(aco acoVar, AbstractC0748xm abstractC0748xm) {
        super(abstractC0748xm);
        this.f568c = acoVar;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0555qi
    public final Object invokeSuspend(Object obj) {
        this.f566a = obj;
        this.f567b |= Integer.MIN_VALUE;
        return aco.m950ai(this.f568c, this);
    }
}
