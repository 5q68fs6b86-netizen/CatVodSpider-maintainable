package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.mt */
/* JADX INFO: loaded from: classes.dex */
public class C0458mt extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() != 9) {
            return Double.valueOf(c0577rd.m1598ab());
        }
        c0577rd.m1603ag();
        return null;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            aagVar.m892w();
        } else {
            aagVar.m878ab(number.doubleValue());
        }
    }
}
