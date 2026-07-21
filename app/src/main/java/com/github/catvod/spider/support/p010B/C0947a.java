package com.github.catvod.spider.support.p010B;

import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p010B.a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0947a extends AbstractC0948b {

    /* JADX INFO: renamed from: b */
    private final AbstractC0948b[] f2234b;

    public C0947a(AbstractC0948b... abstractC0948bArr) {
        this.f2234b = (AbstractC0948b[]) ((Object[]) abstractC0948bArr.clone());
    }

    @Override // com.github.catvod.spider.support.p010B.AbstractC0948b
    /* JADX INFO: renamed from: a */
    public final int mo2317a(CharSequence charSequence, int i, Writer writer) {
        for (AbstractC0948b abstractC0948b : this.f2234b) {
            int iMo2317a = abstractC0948b.mo2317a(charSequence, i, writer);
            if (iMo2317a != 0) {
                return iMo2317a;
            }
        }
        return 0;
    }
}
