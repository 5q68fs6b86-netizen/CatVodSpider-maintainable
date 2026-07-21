package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p021Z.C1014b;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1045d extends C1062u {
    public C1045d(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.C1062u, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1045d mo2657j() {
        return (C1045d) super.mo2657j();
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.C1062u, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: t */
    public final String mo2658t() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.C1062u, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: w */
    final void mo2659w(Appendable appendable, int i, C1048g c1048g) throws IOException {
        appendable.append("<![CDATA[").append(m2744I());
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.C1062u, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: x */
    final void mo2660x(Appendable appendable, int i, C1048g c1048g) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new C1014b(e);
        }
    }
}
