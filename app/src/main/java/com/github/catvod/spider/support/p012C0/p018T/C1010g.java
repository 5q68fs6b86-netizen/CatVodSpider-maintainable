package com.github.catvod.spider.support.p012C0.p018T;

import com.github.catvod.spider.support.C0.T.d;
import com.github.catvod.spider.support.p012C0.p014P.InterfaceC0969D;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.T.g */
/* JADX INFO: loaded from: classes.dex */
public class C1010g implements InterfaceC1009f {

    /* JADX INFO: renamed from: a */
    public InterfaceC0969D f2471a;

    public C1010g(InterfaceC0969D interfaceC0969D) {
        this.f2471a = interfaceC0969D;
    }

    @Override // com.github.catvod.spider.support.p012C0.p018T.InterfaceC1009f
    /* JADX INFO: renamed from: a */
    public final InterfaceC0969D mo2537a() {
        return this.f2471a;
    }

    @Override // com.github.catvod.spider.support.p012C0.p018T.InterfaceC1006b
    /* JADX INFO: renamed from: c */
    public final String mo2390c() {
        return this.f2471a.m2397c();
    }

    @Override // com.github.catvod.spider.support.p012C0.p018T.InterfaceC1006b
    /* JADX INFO: renamed from: e */
    public <T> T mo2392e(d<? extends T> dVar) {
        dVar.q();
        return null;
    }

    public final String toString() {
        return this.f2471a.m2399e() == -1 ? "<EOF>" : this.f2471a.m2397c();
    }
}
