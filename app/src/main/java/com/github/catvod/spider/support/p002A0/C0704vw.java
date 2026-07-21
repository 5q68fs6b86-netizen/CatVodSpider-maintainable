package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.vw */
/* JADX INFO: loaded from: classes.dex */
public class C0704vw extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        String strM1605ai = c0577rd.m1605ai();
        try {
            return Currency.getInstance(strM1605ai);
        } catch (IllegalArgumentException e) {
            throw new C0765yc("Failed parsing '" + strM1605ai + "' as Currency; at path " + c0577rd.m1624w(true), e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        aagVar.m881ae(((Currency) obj).getCurrencyCode());
    }
}
