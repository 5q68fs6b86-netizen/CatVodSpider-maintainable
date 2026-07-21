package com.github.catvod.spider.support.p044FM.p046B;

import com.github.catvod.spider.support.p044FM.p098x.InterfaceC1919E;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p046B.g */
/* JADX INFO: loaded from: classes.dex */
public class C1297g implements InterfaceC1296f {

    /* JADX INFO: renamed from: a */
    public InterfaceC1919E f3016a;

    public C1297g(InterfaceC1919E interfaceC1919E) {
        this.f3016a = interfaceC1919E;
    }

    @Override // com.github.catvod.spider.support.p044FM.p046B.InterfaceC1296f
    /* JADX INFO: renamed from: a */
    public final InterfaceC1919E mo3239a() {
        return this.f3016a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b
    /* JADX INFO: renamed from: b */
    public <T> T mo3232b(InterfaceC1294d<? extends T> interfaceC1294d) {
        interfaceC1294d.mo3184f();
        return null;
    }

    @Override // com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b
    public final String getText() {
        return this.f3016a.getText();
    }

    public final String toString() {
        return this.f3016a.getType() == -1 ? "<EOF>" : this.f3016a.getText();
    }
}
