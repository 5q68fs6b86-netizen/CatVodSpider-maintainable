package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p052H.C1374b;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1384d extends C1402v {
    public C1384d(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.C1402v, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1384d mo3404i() {
        return (C1384d) super.mo3404i();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.C1402v, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: s */
    public final String mo3405s() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.C1402v, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: v */
    final void mo3406v(Appendable appendable, int i, C1387g c1387g) throws IOException {
        appendable.append("<![CDATA[").append(m3509I());
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.C1402v, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: w */
    final void mo3407w(Appendable appendable, int i, C1387g c1387g) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new C1374b(e);
        }
    }
}
