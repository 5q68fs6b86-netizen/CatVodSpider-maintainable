package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.mu */
/* JADX INFO: loaded from: classes.dex */
public class C0459mu extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() != 9) {
            return InetAddress.getByName(c0577rd.m1605ai());
        }
        c0577rd.m1603ag();
        return null;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        aagVar.m881ae(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
