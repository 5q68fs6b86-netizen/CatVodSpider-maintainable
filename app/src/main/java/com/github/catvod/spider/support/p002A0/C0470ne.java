package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ne */
/* JADX INFO: loaded from: classes.dex */
public final class C0470ne extends C0601sa {

    /* JADX INFO: renamed from: a */
    public final aco f1272a;

    public C0470ne(InterfaceC0747xl interfaceC0747xl, aco acoVar) {
        super(interfaceC0747xl);
        this.f1272a = acoVar;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0601sa
    /* JADX INFO: renamed from: b */
    public final Throwable mo1456b(InterfaceC0483nr interfaceC0483nr) {
        Throwable thM1399c;
        Object objM1049v = this.f1272a.m1049v();
        if (!(objM1049v instanceof C0424lm) || (thM1399c = ((C0424lm) objM1049v).m1399c()) == null) {
            return objM1049v instanceof C0647tt ? ((C0647tt) objM1049v).f1565c : ((C0150bi) interfaceC0483nr).m1044q();
        }
        return thM1399c;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0601sa
    /* JADX INFO: renamed from: c */
    public final String mo1457c() {
        return "AwaitContinuation";
    }
}
