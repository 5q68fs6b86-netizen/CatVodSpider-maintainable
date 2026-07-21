package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2390v extends C2361b {

    /* JADX INFO: renamed from: f */
    private final C2393y f5901f;

    /* JADX INFO: renamed from: g */
    private final boolean f5902g;

    public C2390v(AbstractC2375i abstractC2375i, int i, AbstractC2351S abstractC2351S) {
        super(abstractC2375i, i, abstractC2351S, AbstractC2362b0.f5851a);
        this.f5902g = false;
        this.f5901f = null;
    }

    public C2390v(C2390v c2390v, AbstractC2375i abstractC2375i) {
        super(c2390v, abstractC2375i, c2390v.f5848c, c2390v.f5850e);
        this.f5901f = c2390v.f5901f;
        this.f5902g = m6377d(c2390v, abstractC2375i);
    }

    public C2390v(C2390v c2390v, AbstractC2375i abstractC2375i, AbstractC2351S abstractC2351S) {
        super(c2390v, abstractC2375i, abstractC2351S, c2390v.f5850e);
        this.f5901f = c2390v.f5901f;
        this.f5902g = m6377d(c2390v, abstractC2375i);
    }

    public C2390v(C2390v c2390v, AbstractC2375i abstractC2375i, C2393y c2393y) {
        super(c2390v, abstractC2375i, c2390v.f5848c, c2390v.f5850e);
        this.f5901f = c2393y;
        this.f5902g = m6377d(c2390v, abstractC2375i);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m6377d(C2390v c2390v, AbstractC2375i abstractC2375i) {
        return c2390v.f5902g || ((abstractC2375i instanceof AbstractC2386r) && ((AbstractC2386r) abstractC2375i).f5898h);
    }

    @Override // com.github.catvod.spider.support.p135u.C2361b
    /* JADX INFO: renamed from: a */
    public final boolean mo6350a(C2361b c2361b) {
        boolean zEquals = true;
        if (this == c2361b) {
            return true;
        }
        if (!(c2361b instanceof C2390v)) {
            return false;
        }
        C2390v c2390v = (C2390v) c2361b;
        if (this.f5902g != c2390v.f5902g) {
            return false;
        }
        C2393y c2393y = this.f5901f;
        C2393y c2393y2 = c2390v.f5901f;
        if (c2393y != null) {
            zEquals = c2393y.equals(c2393y2);
        } else if (c2393y2 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.mo6350a(c2361b);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final C2393y m6378e() {
        return this.f5901f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6379f() {
        return this.f5902g;
    }

    @Override // com.github.catvod.spider.support.p135u.C2361b
    public final int hashCode() {
        return C1273a.m3160b(C1273a.m3169i(C1273a.m3168h(C1273a.m3169i(C1273a.m3169i(C1273a.m3168h(C1273a.m3168h(7, this.f5846a.f5884b), this.f5847b), this.f5848c), this.f5850e), this.f5902g ? 1 : 0), this.f5901f), 6);
    }
}
