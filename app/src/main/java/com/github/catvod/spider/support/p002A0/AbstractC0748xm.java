package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.xm */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0748xm extends AbstractC0555qi {
    private final InterfaceC0769yg _context;
    private transient InterfaceC0747xl intercepted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0748xm(InterfaceC0747xl interfaceC0747xl) {
        super(interfaceC0747xl);
        InterfaceC0769yg context = interfaceC0747xl != null ? interfaceC0747xl.getContext() : null;
        this._context = context;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0747xl
    public InterfaceC0769yg getContext() {
        InterfaceC0769yg interfaceC0769yg = this._context;
        AbstractC0399ko.m1348c(interfaceC0769yg);
        return interfaceC0769yg;
    }

    public final InterfaceC0747xl intercepted() {
        InterfaceC0747xl acuVar = this.intercepted;
        if (acuVar == null) {
            InterfaceC0749xn interfaceC0749xn = (InterfaceC0749xn) getContext().get(C0372jo.f1071c);
            acuVar = interfaceC0749xn != null ? new acu((AbstractC0775ym) interfaceC0749xn, this) : this;
            this.intercepted = acuVar;
        }
        return acuVar;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0555qi
    public void releaseIntercepted() {
        InterfaceC0747xl interfaceC0747xl = this.intercepted;
        if (interfaceC0747xl != null && interfaceC0747xl != this) {
            InterfaceC0750xo interfaceC0750xo = getContext().get(C0372jo.f1071c);
            AbstractC0399ko.m1348c(interfaceC0750xo);
            C0601sa c0601saM956g = ((acu) interfaceC0747xl).m956g();
            if (c0601saM956g != null) {
                c0601saM956g.m1654r();
            }
        }
        this.intercepted = C0646ts.f1563a;
    }
}
