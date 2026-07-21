package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.xv */
/* JADX INFO: loaded from: classes.dex */
public final class C0757xv extends AbstractC0620st {

    /* JADX INFO: renamed from: b */
    public final int f1822b;

    /* JADX INFO: renamed from: d */
    public final int f1823d;

    public C0757xv(int i, int i2) {
        this.f1822b = i;
        this.f1823d = i2;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0620st
    /* JADX INFO: renamed from: a */
    public final boolean mo899a(int i, StringWriter stringWriter) throws IOException {
        if (i < this.f1822b || i > this.f1823d) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
