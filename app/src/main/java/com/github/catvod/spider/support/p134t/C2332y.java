package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p138x.InterfaceC2412b;
import com.github.catvod.spider.support.p138x.InterfaceC2414d;
import com.github.catvod.spider.support.p138x.InterfaceC2415e;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.y */
/* JADX INFO: loaded from: classes.dex */
public class C2332y implements InterfaceC2415e {

    /* JADX INFO: renamed from: c */
    public static final C2328u f5799c = new C2328u();

    /* JADX INFO: renamed from: a */
    public C2332y f5800a;

    /* JADX INFO: renamed from: b */
    public int f5801b;

    public C2332y() {
        this.f5801b = -1;
    }

    public C2332y(C2332y c2332y, int i) {
        this.f5800a = c2332y;
        this.f5801b = i;
    }

    @Override // com.github.catvod.spider.support.p138x.InterfaceC2412b
    /* JADX INFO: renamed from: a */
    public <T> T mo5281a(InterfaceC2414d<? extends T> interfaceC2414d) {
        return interfaceC2414d.mo6396A(this);
    }

    @Override // com.github.catvod.spider.support.p138x.InterfaceC2412b
    /* JADX INFO: renamed from: c */
    public InterfaceC2412b mo6288c(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.support.p138x.InterfaceC2412b
    /* JADX INFO: renamed from: d */
    public int mo6289d() {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public int mo5282e() {
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6303f() {
        return this.f5801b == -1;
    }

    @Override // com.github.catvod.spider.support.p138x.InterfaceC2412b
    public final String getText() {
        if (mo6289d() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mo6289d(); i++) {
            sb.append(mo6288c(i).getText());
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("[");
        for (C2332y c2332y = this; c2332y != null; c2332y = c2332y.f5800a) {
            if (!c2332y.m6303f()) {
                sbM5396a.append(c2332y.f5801b);
            }
            C2332y c2332y2 = c2332y.f5800a;
            if (c2332y2 != null && !c2332y2.m6303f()) {
                sbM5396a.append(" ");
            }
        }
        sbM5396a.append("]");
        return sbM5396a.toString();
    }
}
