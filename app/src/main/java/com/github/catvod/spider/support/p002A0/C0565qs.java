package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.qs */
/* JADX INFO: loaded from: classes.dex */
public class C0565qs extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        String strM1605ai = c0577rd.m1605ai();
        try {
            AbstractC0611sk.m1686c(strM1605ai);
            return new BigInteger(strM1605ai);
        } catch (NumberFormatException e) {
            throw new C0765yc("Failed parsing '" + strM1605ai + "' as BigInteger; at path " + c0577rd.m1624w(true), e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        aagVar.m880ad((BigInteger) obj);
    }
}
