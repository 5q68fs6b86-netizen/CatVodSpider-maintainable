package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class acl extends AbstractC0516ox {

    /* JADX INFO: renamed from: b */
    public static final ExecutorC0697vp f564b;

    /* JADX INFO: renamed from: c */
    public static final acl f565c;

    static {
        int i = AbstractC0125ak.f653b;
        int i2 = AbstractC0125ak.f654c;
        long j = AbstractC0125ak.f655d;
        acl aclVar = new acl();
        aclVar.f1354a = new ExecutorC0778yp(i, i2, j);
        f565c = aclVar;
        int i3 = abp.f534a;
        if (64 >= i3) {
            i3 = 64;
        }
        f564b = new ExecutorC0697vp(aclVar, AbstractC0760xy.m1882h("kotlinx.coroutines.io.parallelism", i3, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0775ym
    public final String toString() {
        return "Dispatchers.Default";
    }
}
