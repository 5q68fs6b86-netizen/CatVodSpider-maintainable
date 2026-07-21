package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p137w.C2407i;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2381m extends AbstractC2376i0 {

    /* JADX INFO: renamed from: b */
    public final int f5894b;

    public C2381m(AbstractC2375i abstractC2375i, int i) {
        super(abstractC2375i);
        this.f5894b = i;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: a */
    public final int mo6309a() {
        return 5;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: c */
    public final C2407i mo6343c() {
        int i = this.f5894b;
        C2407i c2407i = new C2407i(new int[0]);
        c2407i.m6416a(i);
        return c2407i;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: d */
    public final boolean mo6310d(int i, int i2) {
        return this.f5894b == i;
    }

    public final String toString() {
        return String.valueOf(this.f5894b);
    }
}
