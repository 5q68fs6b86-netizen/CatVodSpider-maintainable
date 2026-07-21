package com.github.catvod.spider.support.p002A0;

import java.util.Stack;
import org.slf4j.Logger;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.uv */
/* JADX INFO: loaded from: classes.dex */
public final class C0676uv {

    /* JADX INFO: renamed from: a */
    public Logger f1587a;

    /* JADX INFO: renamed from: b */
    public Stack f1588b;

    /* JADX INFO: renamed from: c */
    public C0580rg f1589c;

    /* JADX INFO: renamed from: d */
    public final C0580rg m1735d() {
        return (C0580rg) this.f1588b.peek();
    }

    /* JADX INFO: renamed from: e */
    public final void m1736e(C0589rp c0589rp) {
        ((C0580rg) this.f1588b.peek()).f1438a = c0589rp;
    }

    /* JADX INFO: renamed from: f */
    public final Object m1737f(InterfaceC0256fg interfaceC0256fg) {
        C0579rf c0579rf = (C0579rf) interfaceC0256fg;
        int iM1630j = c0579rf.m1630j();
        Object objMo874b = null;
        for (int i = 0; i < iM1630j; i++) {
            objMo874b = c0579rf.m1629i(i).mo874b(this);
        }
        return objMo874b;
    }
}
