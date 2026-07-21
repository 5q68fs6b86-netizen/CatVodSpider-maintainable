package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.tk */
/* JADX INFO: loaded from: classes.dex */
public final class C0638tk extends AbstractC0672ur {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: b */
    public final AbstractC0272fw clone() {
        return (C0638tk) super.clone();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    public final Object clone() {
        return (C0638tk) super.clone();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: s */
    public final String mo924s() {
        return "#comment";
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: u */
    public final void mo925u(StringBuilder sb, int i, C0674ut c0674ut) throws IOException {
        AbstractC0272fw abstractC0272fw;
        if (c0674ut.f1582c) {
            int i2 = this.f847aq;
            if (i2 == 0) {
                abstractC0272fw = this.f846ap;
                if (abstractC0272fw instanceof C0226ed) {
                    AbstractC0272fw.m1225ar(sb, i, c0674ut);
                }
            } else if (i2 == 1) {
                AbstractC0272fw abstractC0272fwM1232ay = m1232ay();
                if ((abstractC0272fwM1232ay instanceof C0706vy) && AbstractC0727ws.m1848j(((C0706vy) abstractC0272fwM1232ay).m1732f())) {
                    abstractC0272fw = this.f846ap;
                    if ((abstractC0272fw instanceof C0226ed) && ((C0226ed) abstractC0272fw).f771g.f593f) {
                        AbstractC0272fw.m1225ar(sb, i, c0674ut);
                    }
                }
            }
        }
        sb.append("<!--").append(m1732f()).append("-->");
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: v */
    public final void mo926v(StringBuilder sb, int i, C0674ut c0674ut) {
    }
}
