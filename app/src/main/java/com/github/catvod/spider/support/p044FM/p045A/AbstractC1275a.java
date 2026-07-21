package com.github.catvod.spider.support.p044FM.p045A;

import com.github.catvod.spider.support.p044FM.p046B.InterfaceC1294d;
import com.github.catvod.spider.support.p044FM.p046B.InterfaceC1295e;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p045A.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1275a implements InterfaceC1294d {
    /* JADX INFO: renamed from: E */
    public abstract boolean mo3181E(Object obj, Object obj2);

    /* JADX INFO: renamed from: F */
    public abstract int mo3182F(Object obj);

    @Override // com.github.catvod.spider.support.p044FM.p046B.InterfaceC1294d
    /* JADX INFO: renamed from: a */
    public void mo3183a() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p046B.InterfaceC1294d
    /* JADX INFO: renamed from: f */
    public void mo3184f() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p046B.InterfaceC1294d
    /* JADX INFO: renamed from: g */
    public Object mo3185g(InterfaceC1295e interfaceC1295e) {
        int iMo3234d = interfaceC1295e.mo3234d();
        Object objMo3232b = null;
        for (int i = 0; i < iMo3234d; i++) {
            objMo3232b = interfaceC1295e.mo3233c(i).mo3232b(this);
        }
        return objMo3232b;
    }
}
