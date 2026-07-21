package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class abt extends AbstractC0672ur {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: b */
    public final AbstractC0272fw clone() {
        return (abt) super.clone();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    public final Object clone() {
        return (abt) super.clone();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: s */
    public final String mo924s() {
        return "#data";
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: u */
    public final void mo925u(StringBuilder sb, int i, C0674ut c0674ut) throws IOException {
        String strM1732f = m1732f();
        if (c0674ut.f1585f != 2 || strM1732f.contains("<![CDATA[")) {
            sb.append((CharSequence) m1732f());
            return;
        }
        AbstractC0272fw abstractC0272fw = this.f846ap;
        if (abstractC0272fw != null && abstractC0272fw.mo1177t().equals("script")) {
            sb.append("//<![CDATA[\n").append(strM1732f).append("\n//]]>");
            return;
        }
        AbstractC0272fw abstractC0272fw2 = this.f846ap;
        if (abstractC0272fw2 == null || !abstractC0272fw2.mo1177t().equals("style")) {
            sb.append("<![CDATA[").append(strM1732f).append("]]>");
        } else {
            sb.append("/*<![CDATA[*/\n").append(strM1732f).append("\n/*]]>*/");
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: v */
    public final void mo926v(StringBuilder sb, int i, C0674ut c0674ut) {
    }
}
