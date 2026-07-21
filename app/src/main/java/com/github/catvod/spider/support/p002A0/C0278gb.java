package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.gb */
/* JADX INFO: loaded from: classes.dex */
public class C0278gb extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        String strM1605ai = c0577rd.m1605ai();
        if (strM1605ai.length() == 1) {
            return Character.valueOf(strM1605ai.charAt(0));
        }
        throw new C0765yc("Expecting character, got: " + strM1605ai + "; at " + c0577rd.m1624w(true));
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        Character ch = (Character) obj;
        aagVar.m881ae(ch == null ? null : String.valueOf(ch));
    }
}
