package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1050i extends AbstractC1057p {
    public C1050i(String str, String str2, String str3) {
        String str4;
        C0966a.m2376k(str);
        C0966a.m2376k(str2);
        C0966a.m2376k(str3);
        super.mo2746b("name", str);
        super.mo2746b("publicId", str2);
        super.mo2746b("systemId", str3);
        if (m2679K("publicId")) {
            str4 = "PUBLIC";
        } else if (!m2679K("systemId")) {
            return;
        } else {
            str4 = "SYSTEM";
        }
        super.mo2746b("pubSysKey", str4);
    }

    /* JADX INFO: renamed from: K */
    private boolean m2679K(String str) {
        return !C1034b.m2597c(super.mo2747c(str));
    }

    /* JADX INFO: renamed from: L */
    public final void m2680L(String str) {
        if (str != null) {
            super.mo2746b("pubSysKey", str);
        }
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1057p, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ int mo2661h() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1057p, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: m */
    public final AbstractC1059r mo2662m() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: t */
    public final String mo2658t() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: w */
    final void mo2659w(Appendable appendable, int i, C1048g c1048g) throws IOException {
        appendable.append((c1048g.m2669g() != 1 || m2679K("publicId") || m2679K("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (m2679K("name")) {
            appendable.append(" ").append(super.mo2747c("name"));
        }
        if (m2679K("pubSysKey")) {
            appendable.append(" ").append(super.mo2747c("pubSysKey"));
        }
        if (m2679K("publicId")) {
            appendable.append(" \"").append(super.mo2747c("publicId")).append('\"');
        }
        if (m2679K("systemId")) {
            appendable.append(" \"").append(super.mo2747c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: x */
    final void mo2660x(Appendable appendable, int i, C1048g c1048g) {
    }
}
