package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ud */
/* JADX INFO: loaded from: classes.dex */
public class C0658ud extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        try {
            return Integer.valueOf(c0577rd.m1599ac());
        } catch (NumberFormatException e) {
            throw new C0765yc(e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            aagVar.m892w();
        } else {
            aagVar.m879ac(number.intValue());
        }
    }
}
