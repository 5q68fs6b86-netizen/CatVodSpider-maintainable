package com.github.catvod.spider.support.p138x;

import com.github.catvod.spider.support.p134t.InterfaceC2333z;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p138x.g */
/* JADX INFO: loaded from: classes.dex */
public class C2417g implements InterfaceC2416f {

    /* JADX INFO: renamed from: a */
    public InterfaceC2333z f5969a;

    public C2417g(InterfaceC2333z interfaceC2333z) {
        this.f5969a = interfaceC2333z;
    }

    @Override // com.github.catvod.spider.support.p138x.InterfaceC2412b
    /* JADX INFO: renamed from: a */
    public <T> T mo5281a(InterfaceC2414d<? extends T> interfaceC2414d) {
        interfaceC2414d.mo6398i();
        return null;
    }

    @Override // com.github.catvod.spider.support.p138x.InterfaceC2416f
    /* JADX INFO: renamed from: b */
    public final InterfaceC2333z mo6430b() {
        return this.f5969a;
    }

    @Override // com.github.catvod.spider.support.p138x.InterfaceC2412b
    public final String getText() {
        return this.f5969a.getText();
    }

    public final String toString() {
        return this.f5969a.getType() == -1 ? "<EOF>" : this.f5969a.getText();
    }
}
