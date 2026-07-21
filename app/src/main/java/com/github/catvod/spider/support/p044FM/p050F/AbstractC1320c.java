package com.github.catvod.spider.support.p044FM.p050F;

import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.F.c */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC1320c extends AbstractC1319b {
    @Override // com.github.catvod.spider.support.p044FM.p050F.AbstractC1319b
    /* JADX INFO: renamed from: a */
    public final int mo3245a(CharSequence charSequence, int i, Writer writer) {
        return mo3304b(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo3304b(int i, Writer writer);
}
