package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes.dex */
public class adl extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        try {
            String strM1605ai = c0577rd.m1605ai();
            if (strM1605ai.equals("null")) {
                return null;
            }
            return new URI(strM1605ai);
        } catch (URISyntaxException e) {
            throw new C0765yc(e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        aagVar.m881ae(uri == null ? null : uri.toASCIIString());
    }
}
