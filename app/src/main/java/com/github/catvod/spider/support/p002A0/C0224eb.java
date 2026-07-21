package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.eb */
/* JADX INFO: loaded from: classes.dex */
public final class C0224eb implements InterfaceC0681v {

    /* JADX INFO: renamed from: a */
    public final boolean f763a;

    public C0224eb(boolean z) {
        this.f763a = z;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0681v
    /* JADX INFO: renamed from: d */
    public final boolean mo1153d() {
        return this.f763a;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0681v
    /* JADX INFO: renamed from: e */
    public final C0804zo mo1154e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f763a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
