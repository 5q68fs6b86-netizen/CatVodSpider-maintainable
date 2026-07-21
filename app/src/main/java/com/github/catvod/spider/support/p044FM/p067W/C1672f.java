package com.github.catvod.spider.support.p044FM.p067W;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a;
import java.util.HashSet;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p067W.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1672f implements InterfaceC1660a {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    /* JADX INFO: renamed from: a */
    public final C1665f mo3954a(C1551g c1551g) {
        HashSet hashSet = new HashSet();
        C1551g c1551g2 = new C1551g();
        for (C1393m c1393m : c1551g) {
            C1551g c1551gM3459Z = c1393m.m3459Z();
            c1551gM3459Z.remove(c1393m);
            hashSet.addAll(c1551gM3459Z);
        }
        c1551g2.addAll(hashSet);
        return new C1665f(c1551g2);
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    public final String name() {
        return "descendant";
    }
}
