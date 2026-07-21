package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p116a.C2137a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C2350Q extends AbstractC2377j {

    /* JADX INFO: renamed from: b */
    public final int f5824b;

    /* JADX INFO: renamed from: c */
    public final int f5825c;

    /* JADX INFO: renamed from: d */
    public final boolean f5826d;

    public C2350Q(AbstractC2375i abstractC2375i, int i, int i2, boolean z) {
        super(abstractC2375i);
        this.f5824b = i;
        this.f5825c = i2;
        this.f5826d = z;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: a */
    public final int mo6309a() {
        return 4;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: b */
    public final boolean mo6328b() {
        return true;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: d */
    public final boolean mo6310d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("pred_");
        sbM5396a.append(this.f5824b);
        sbM5396a.append(":");
        sbM5396a.append(this.f5825c);
        return sbM5396a.toString();
    }
}
