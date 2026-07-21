package com.github.catvod.spider.support.p002A0;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.nu */
/* JADX INFO: loaded from: classes.dex */
public final class C0486nu extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        if (!"..".equals(mo1128c())) {
            return C0133as.m1010d(c0676uv.m1735d().f1438a);
        }
        HashSet hashSet = new HashSet();
        C0589rp c0589rp = new C0589rp();
        Iterator<E> it = c0676uv.m1735d().f1438a.iterator();
        while (it.hasNext()) {
            hashSet.add((C0226ed) ((C0226ed) it.next()).f846ap);
        }
        c0589rp.addAll(hashSet);
        return C0133as.m1010d(c0589rp);
    }
}
