package com.github.catvod.spider.support.p002A0;

import java.io.StringWriter;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.st */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0620st extends AbstractC0604sd {
    /* JADX INFO: renamed from: a */
    public abstract boolean mo899a(int i, StringWriter stringWriter);

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0604sd
    /* JADX INFO: renamed from: c */
    public final int mo902c(String str, int i, StringWriter stringWriter) {
        return mo899a(Character.codePointAt(str, i), stringWriter) ? 1 : 0;
    }
}
