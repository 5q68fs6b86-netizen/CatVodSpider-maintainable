package com.github.catvod.spider.support.p137w;

import com.github.catvod.spider.support.p138x.InterfaceC2414d;
import com.github.catvod.spider.support.p138x.InterfaceC2415e;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p137w.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2399a implements InterfaceC2414d {
    @Override // com.github.catvod.spider.support.p138x.InterfaceC2414d
    /* JADX INFO: renamed from: A */
    public Object mo6396A(InterfaceC2415e interfaceC2415e) {
        int iMo6289d = interfaceC2415e.mo6289d();
        Object objMo5281a = null;
        for (int i = 0; i < iMo6289d; i++) {
            objMo5281a = interfaceC2415e.mo6288c(i).mo5281a(this);
        }
        return objMo5281a;
    }

    /* JADX INFO: renamed from: E */
    public abstract boolean mo6338E(Object obj, Object obj2);

    /* JADX INFO: renamed from: F */
    public abstract int mo6339F(Object obj);

    @Override // com.github.catvod.spider.support.p138x.InterfaceC2414d
    /* JADX INFO: renamed from: a */
    public void mo6397a() {
    }

    @Override // com.github.catvod.spider.support.p138x.InterfaceC2414d
    /* JADX INFO: renamed from: i */
    public void mo6398i() {
    }
}
