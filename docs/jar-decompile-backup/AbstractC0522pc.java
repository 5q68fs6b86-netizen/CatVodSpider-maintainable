package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.pc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0522pc implements InterfaceC0750xo {
    private final InterfaceC0751xp key;

    public AbstractC0522pc(InterfaceC0751xp interfaceC0751xp) {
        this.key = interfaceC0751xp;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public <R> R fold(R r, InterfaceC0304ha interfaceC0304ha) {
        AbstractC0399ko.m1351f("operation", interfaceC0304ha);
        return (R) interfaceC0304ha.invoke(r, this);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public <E extends InterfaceC0750xo> E get(InterfaceC0751xp interfaceC0751xp) {
        return (E) AbstractC0513ou.m1508a(this, interfaceC0751xp);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0750xo
    public InterfaceC0751xp getKey() {
        return this.key;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public InterfaceC0769yg minusKey(InterfaceC0751xp interfaceC0751xp) {
        return AbstractC0513ou.m1509b(this, interfaceC0751xp);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public InterfaceC0769yg plus(InterfaceC0769yg interfaceC0769yg) {
        AbstractC0399ko.m1351f("context", interfaceC0769yg);
        return interfaceC0769yg == C0233ek.f781a ? this : (InterfaceC0769yg) interfaceC0769yg.fold(this, C0632te.f1527b);
    }
}
