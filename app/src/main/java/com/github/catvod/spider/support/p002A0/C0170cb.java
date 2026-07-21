package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.cb */
/* JADX INFO: loaded from: classes.dex */
public class C0170cb extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) {
        return new AtomicBoolean(c0577rd.m1597aa());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        aagVar.m882af(((AtomicBoolean) obj).get());
    }
}
