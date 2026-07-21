package com.github.catvod.spider.support.p010B;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.B.g */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0953g extends AbstractC0949c {

    /* JADX INFO: renamed from: b */
    private final int f2252b;

    /* JADX INFO: renamed from: c */
    private final int f2253c;

    private C0953g(int i, int i2) {
        this.f2252b = i;
        this.f2253c = i2;
    }

    /* JADX INFO: renamed from: c */
    public static C0953g m2330c(int i, int i2) {
        return new C0953g(i, i2);
    }

    @Override // com.github.catvod.spider.support.p010B.AbstractC0949c
    /* JADX INFO: renamed from: b */
    public final boolean mo2318b(int i, Writer writer) throws IOException {
        if (i < this.f2252b || i > this.f2253c) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
