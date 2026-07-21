package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p137w.C2407i;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.c0 */
/* JADX INFO: loaded from: classes.dex */
public class C2364c0 extends AbstractC2376i0 {

    /* JADX INFO: renamed from: b */
    public final C2407i f5868b;

    public C2364c0(AbstractC2375i abstractC2375i, C2407i c2407i) {
        super(abstractC2375i);
        if (c2407i == null) {
            c2407i = new C2407i(new int[0]);
            c2407i.m6416a(0);
        }
        this.f5868b = c2407i;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: a */
    public int mo6309a() {
        return 7;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: c */
    public final C2407i mo6343c() {
        return this.f5868b;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: d */
    public boolean mo6310d(int i, int i2) {
        return this.f5868b.m6419d(i);
    }

    public String toString() {
        return this.f5868b.toString();
    }
}
