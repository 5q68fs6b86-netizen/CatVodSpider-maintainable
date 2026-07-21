package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.en */
/* JADX INFO: loaded from: classes.dex */
public final class C0236en extends AbstractC0672ur {
    /* JADX INFO: renamed from: a */
    public final boolean m1193a(String str) {
        return !AbstractC0727ws.m1848j(mo1228au(str));
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: s */
    public final String mo924s() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: u */
    public final void mo925u(StringBuilder sb, int i, C0674ut c0674ut) throws IOException {
        if (this.f847aq > 0 && c0674ut.f1582c) {
            sb.append('\n');
        }
        if (c0674ut.f1585f != 1 || m1193a("publicId") || m1193a("systemId")) {
            sb.append("<!DOCTYPE");
        } else {
            sb.append("<!doctype");
        }
        if (m1193a("#doctype")) {
            sb.append(" ").append(mo1228au("#doctype"));
        }
        if (m1193a("pubSysKey")) {
            sb.append(" ").append(mo1228au("pubSysKey"));
        }
        if (m1193a("publicId")) {
            sb.append(" \"").append(mo1228au("publicId")).append('\"');
        }
        if (m1193a("systemId")) {
            sb.append(" \"").append(mo1228au("systemId")).append('\"');
        }
        sb.append('>');
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: v */
    public final void mo926v(StringBuilder sb, int i, C0674ut c0674ut) {
    }
}
