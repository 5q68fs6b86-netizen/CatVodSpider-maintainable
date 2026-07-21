package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p116a.C2137a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2379k extends AbstractC2376i0 {

    /* JADX INFO: renamed from: b */
    public final int f5890b;

    /* JADX INFO: renamed from: c */
    public final int f5891c;

    public C2379k(AbstractC2375i abstractC2375i, int i, int i2) {
        super(abstractC2375i);
        this.f5890b = i;
        this.f5891c = i2;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: a */
    public final int mo6309a() {
        return 6;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: d */
    public final boolean mo6310d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("action_");
        sbM5396a.append(this.f5890b);
        sbM5396a.append(":");
        sbM5396a.append(this.f5891c);
        return sbM5396a.toString();
    }
}
