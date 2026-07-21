package com.github.catvod.spider.support.p010B;

import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.B.c */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC0949c extends AbstractC0948b {
    @Override // com.github.catvod.spider.support.p010B.AbstractC0948b
    /* JADX INFO: renamed from: a */
    public final int mo2317a(CharSequence charSequence, int i, Writer writer) {
        return mo2318b(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo2318b(int i, Writer writer);
}
