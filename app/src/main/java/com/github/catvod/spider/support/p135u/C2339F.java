package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p134t.AbstractC2324q;
import com.github.catvod.spider.support.p137w.C2405g;
import java.util.EmptyStackException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.F */
/* JADX INFO: loaded from: classes.dex */
public final class C2339F implements InterfaceC2392x {

    /* JADX INFO: renamed from: a */
    public static final C2339F f5809a = new C2339F();

    private C2339F() {
    }

    @Override // com.github.catvod.spider.support.p135u.InterfaceC2392x
    /* JADX INFO: renamed from: a */
    public final void mo6304a(AbstractC2324q abstractC2324q) {
        if (abstractC2324q.f5775n.m6408d()) {
            throw new EmptyStackException();
        }
        C2405g c2405g = abstractC2324q.f5775n;
        abstractC2324q.f5776o = c2405g.m6409e(c2405g.m6410f() - 1);
    }

    @Override // com.github.catvod.spider.support.p135u.InterfaceC2392x
    /* JADX INFO: renamed from: b */
    public final boolean mo6305b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return C1273a.m3160b(C1273a.m3168h(0, 4), 1);
    }

    public final String toString() {
        return "popMode";
    }
}
