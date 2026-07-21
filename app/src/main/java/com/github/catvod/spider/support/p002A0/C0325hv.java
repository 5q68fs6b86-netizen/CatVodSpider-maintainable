package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.hv */
/* JADX INFO: loaded from: classes.dex */
public class C0325hv extends AbstractC0406kv {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        String strM1605ai = c0577rd.m1605ai();
        if (strM1605ai.equals("null")) {
            return null;
        }
        return new URL(strM1605ai);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        URL url = (URL) obj;
        aagVar.m881ae(url == null ? null : url.toExternalForm());
    }
}
