package com.github.catvod.spider.support.p044FM.p050F;

import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.F.a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1318a extends AbstractC1319b {

    /* JADX INFO: renamed from: b */
    private final AbstractC1319b[] f3053b;

    public C1318a(AbstractC1319b... abstractC1319bArr) {
        this.f3053b = (AbstractC1319b[]) ((Object[]) abstractC1319bArr.clone());
    }

    @Override // com.github.catvod.spider.support.p044FM.p050F.AbstractC1319b
    /* JADX INFO: renamed from: a */
    public final int mo3245a(CharSequence charSequence, int i, Writer writer) {
        for (AbstractC1319b abstractC1319b : this.f3053b) {
            int iMo3245a = abstractC1319b.mo3245a(charSequence, i, writer);
            if (iMo3245a != 0) {
                return iMo3245a;
            }
        }
        return 0;
    }
}
