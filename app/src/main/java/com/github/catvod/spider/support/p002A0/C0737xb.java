package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.xb */
/* JADX INFO: loaded from: classes.dex */
public final class C0737xb implements InterfaceC0656ub {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1780a;

    /* JADX INFO: renamed from: b */
    public final String f1781b;

    public /* synthetic */ C0737xb(String str, int i) {
        this.f1780a = i;
        this.f1781b = str;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0656ub
    /* JADX INFO: renamed from: m */
    public Object mo1338m() {
        switch (this.f1780a) {
            case 0:
                throw new C0765yc(this.f1781b);
            case 1:
                throw new C0765yc(this.f1781b);
            default:
                throw new C0765yc(this.f1781b);
        }
    }

    public String toString() {
        switch (this.f1780a) {
            case 3:
                return this.f1781b;
            default:
                return super.toString();
        }
    }
}
