package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.dp */
/* JADX INFO: loaded from: classes.dex */
public final class C0211dp implements InterfaceC0698vq {

    /* JADX INFO: renamed from: b */
    public final C0259fj f747b;

    /* JADX INFO: renamed from: c */
    public final boolean f748c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0176ch f749d;

    /* JADX INFO: renamed from: e */
    public final aav f750e;

    public C0211dp(Object obj, C0259fj c0259fj, boolean z) {
        this.f749d = (InterfaceC0176ch) obj;
        this.f750e = (aav) obj;
        this.f747b = c0259fj;
        this.f748c = z;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0698vq
    /* JADX INFO: renamed from: a */
    public final AbstractC0406kv mo934a(C0493oa c0493oa, C0259fj c0259fj) {
        C0259fj c0259fj2 = this.f747b;
        if (c0259fj2 == null) {
            Class cls = c0259fj.f827a;
            throw null;
        }
        if (!c0259fj2.equals(c0259fj)) {
            if (!this.f748c) {
                return null;
            }
            if (c0259fj2.f828b != c0259fj.f827a) {
                return null;
            }
        }
        return new C0432lu(this.f749d, this.f750e, c0493oa, c0259fj, this, true);
    }
}
