package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.lv */
/* JADX INFO: loaded from: classes.dex */
public final class C0433lv extends AbstractC0814zy implements InterfaceC0569qw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0433lv(int i, Object obj) {
        super(1);
        this.f1202a = i;
        this.f1203b = obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0569qw
    public final Object invoke(Object obj) {
        switch (this.f1202a) {
            case 0:
                return obj == ((AbstractC0520pa) this.f1203b) ? "(this Collection)" : String.valueOf(obj);
            default:
                add addVar = (add) obj;
                AbstractC0399ko.m1351f("it", addVar);
                return AbstractC0198dc.m1111s((String) this.f1203b, addVar);
        }
    }
}
