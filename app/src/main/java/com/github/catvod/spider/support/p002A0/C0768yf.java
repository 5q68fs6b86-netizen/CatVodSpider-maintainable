package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.yf */
/* JADX INFO: loaded from: classes.dex */
public class C0768yf extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) {
        try {
            return new AtomicInteger(c0577rd.m1599ac());
        } catch (NumberFormatException e) {
            throw new C0765yc(e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        aagVar.m879ac(((AtomicInteger) obj).get());
    }
}
