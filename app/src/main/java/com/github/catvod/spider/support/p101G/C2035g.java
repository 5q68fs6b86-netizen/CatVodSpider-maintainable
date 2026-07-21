package com.github.catvod.spider.support.p101G;

import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p043F.C1274b;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p101G.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2035g extends AbstractC2040l {
    public C2035g(String str, String str2, String str3) {
        String str4;
        C1271c.m3157g(str);
        C1271c.m3157g(str2);
        C1271c.m3157g(str3);
        super.mo4928c("name", str);
        super.mo4928c("publicId", str2);
        super.mo4928c("systemId", str3);
        if (m4856K("publicId")) {
            str4 = "PUBLIC";
        } else if (!m4856K("systemId")) {
            return;
        } else {
            str4 = "SYSTEM";
        }
        super.mo4928c("pubSysKey", str4);
    }

    /* JADX INFO: renamed from: K */
    private boolean m4856K(String str) {
        return !C1274b.m3173d(super.mo4929d(str));
    }

    /* JADX INFO: renamed from: L */
    public final void m4857L(String str) {
        if (str != null) {
            super.mo4928c("pubSysKey", str);
        }
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2040l, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ int mo4835h() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2040l, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: m */
    public final AbstractC2041m mo4836m() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: t */
    public final String mo4832t() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: w */
    final void mo4833w(Appendable appendable, int i, C2034f.a aVar) throws IOException {
        if (this.f4649b > 0 && aVar.m4854g()) {
            appendable.append('\n');
        }
        appendable.append((aVar.m4855h() != 1 || m4856K("publicId") || m4856K("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (m4856K("name")) {
            appendable.append(" ").append(super.mo4929d("name"));
        }
        if (m4856K("pubSysKey")) {
            appendable.append(" ").append(super.mo4929d("pubSysKey"));
        }
        if (m4856K("publicId")) {
            appendable.append(" \"").append(super.mo4929d("publicId")).append('\"');
        }
        if (m4856K("systemId")) {
            appendable.append(" \"").append(super.mo4929d("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: x */
    final void mo4834x(Appendable appendable, int i, C2034f.a aVar) {
    }
}
