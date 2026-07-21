package com.github.catvod.spider.support.p044FM.p050F;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.F.g */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1324g extends AbstractC1320c {

    /* JADX INFO: renamed from: b */
    private final int f3071b;

    /* JADX INFO: renamed from: c */
    private final int f3072c;

    private C1324g(int i, int i2) {
        this.f3071b = i;
        this.f3072c = i2;
    }

    /* JADX INFO: renamed from: c */
    public static C1324g m3316c(int i, int i2) {
        return new C1324g(i, i2);
    }

    @Override // com.github.catvod.spider.support.p044FM.p050F.AbstractC1320c
    /* JADX INFO: renamed from: b */
    public final boolean mo3304b(int i, Writer writer) throws IOException {
        if (i < this.f3071b || i > this.f3072c) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
