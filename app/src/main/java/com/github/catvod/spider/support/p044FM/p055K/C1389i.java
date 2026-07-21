package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1389i extends AbstractC1397q {
    public C1389i(String str, String str2, String str3) {
        String str4;
        C1377c.m3360g(str);
        C1377c.m3360g(str2);
        C1377c.m3360g(str3);
        super.m3508H("name", str);
        super.m3508H("publicId", str2);
        super.m3508H("systemId", str3);
        if (m3435K("publicId")) {
            str4 = "PUBLIC";
        } else if (!m3435K("systemId")) {
            return;
        } else {
            str4 = "SYSTEM";
        }
        super.m3508H("pubSysKey", str4);
    }

    /* JADX INFO: renamed from: K */
    private boolean m3435K(String str) {
        return !C1380b.m3365d(super.mo3511c(str));
    }

    /* JADX INFO: renamed from: L */
    public final void m3436L(String str) {
        if (str != null) {
            super.m3508H("pubSysKey", str);
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1397q, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ int mo3411g() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1397q, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: l */
    public final AbstractC1399s mo3412l() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: s */
    public final String mo3405s() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: v */
    final void mo3406v(Appendable appendable, int i, C1387g c1387g) throws IOException {
        if (this.f3225b > 0 && c1387g.m3421i()) {
            appendable.append('\n');
        }
        appendable.append((c1387g.m3423k() != 1 || m3435K("publicId") || m3435K("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (m3435K("name")) {
            appendable.append(" ").append(super.mo3511c("name"));
        }
        if (m3435K("pubSysKey")) {
            appendable.append(" ").append(super.mo3511c("pubSysKey"));
        }
        if (m3435K("publicId")) {
            appendable.append(" \"").append(super.mo3511c("publicId")).append('\"');
        }
        if (m3435K("systemId")) {
            appendable.append(" \"").append(super.mo3511c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: w */
    final void mo3407w(Appendable appendable, int i, C1387g c1387g) {
    }
}
