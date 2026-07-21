package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.js */
/* JADX INFO: loaded from: classes.dex */
public class C0376js extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        String strM1605ai = c0577rd.m1605ai();
        try {
            return UUID.fromString(strM1605ai);
        } catch (IllegalArgumentException e) {
            throw new C0765yc("Failed parsing '" + strM1605ai + "' as UUID; at path " + c0577rd.m1624w(true), e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        aagVar.m881ae(uuid == null ? null : uuid.toString());
    }
}
