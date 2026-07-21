package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.hu */
/* JADX INFO: loaded from: classes.dex */
public class C0324hu extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        int iM1607ak = c0577rd.m1607ak();
        if (iM1607ak != 9) {
            return iM1607ak == 6 ? Boolean.valueOf(Boolean.parseBoolean(c0577rd.m1605ai())) : Boolean.valueOf(c0577rd.m1597aa());
        }
        c0577rd.m1603ag();
        return null;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            aagVar.m892w();
            return;
        }
        aagVar.m883ag();
        aagVar.m884o();
        aagVar.f434d.write(bool.booleanValue() ? "true" : "false");
    }
}
