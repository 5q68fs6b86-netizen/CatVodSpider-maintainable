package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0168c extends AbstractC0356iz implements InterfaceC0575rb {
    private final int arity;

    public AbstractC0168c(InterfaceC0747xl interfaceC0747xl) {
        super(interfaceC0747xl);
        if (interfaceC0747xl != null && interfaceC0747xl.getContext() != C0233ek.f781a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.arity = 2;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0575rb
    public int getArity() {
        return this.arity;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0555qi
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        AbstractC0407kw.f1108a.getClass();
        String strM1566a = C0546q.m1566a(this);
        AbstractC0399ko.m1350e("renderLambdaToString(...)", strM1566a);
        return strM1566a;
    }
}
