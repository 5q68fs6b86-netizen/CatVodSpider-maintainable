package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p137w.AbstractC2399a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.U */
/* JADX INFO: loaded from: classes.dex */
final class C2353U extends AbstractC2399a {

    /* JADX INFO: renamed from: a */
    public static final C2353U f5830a = new C2353U();

    private C2353U() {
    }

    @Override // com.github.catvod.spider.support.p137w.AbstractC2399a
    /* JADX INFO: renamed from: E */
    public final boolean mo6338E(Object obj, Object obj2) {
        C2361b c2361b = (C2361b) obj;
        C2361b c2361b2 = (C2361b) obj2;
        if (c2361b == c2361b2) {
            return true;
        }
        return c2361b != null && c2361b2 != null && c2361b.f5846a.f5884b == c2361b2.f5846a.f5884b && c2361b.f5848c.equals(c2361b2.f5848c);
    }

    @Override // com.github.catvod.spider.support.p137w.AbstractC2399a
    /* JADX INFO: renamed from: F */
    public final int mo6339F(Object obj) {
        C2361b c2361b = (C2361b) obj;
        return C1273a.m3160b(C1273a.m3169i(C1273a.m3168h(7, c2361b.f5846a.f5884b), c2361b.f5848c), 2);
    }
}
