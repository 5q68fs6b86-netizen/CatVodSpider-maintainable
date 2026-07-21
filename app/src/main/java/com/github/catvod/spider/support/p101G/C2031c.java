package com.github.catvod.spider.support.p101G;

import com.github.catvod.spider.support.p041D.C1268c;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p101G.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2031c extends C2044p {
    public C2031c(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.support.p101G.C2044p, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final C2031c clone() {
        return (C2031c) super.clone();
    }

    @Override // com.github.catvod.spider.support.p101G.C2044p, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: t */
    public final String mo4832t() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.support.p101G.C2044p, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: w */
    final void mo4833w(Appendable appendable, int i, C2034f.a aVar) throws IOException {
        appendable.append("<![CDATA[").append(m4926I());
    }

    @Override // com.github.catvod.spider.support.p101G.C2044p, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: x */
    final void mo4834x(Appendable appendable, int i, C2034f.a aVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new C1268c(e);
        }
    }
}
