package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.nk */
/* JADX INFO: loaded from: classes.dex */
public final class C0476nk extends AbstractC0680uz {

    /* JADX INFO: renamed from: b */
    public final StringBuilder f1280b;

    /* JADX INFO: renamed from: c */
    public String f1281c;

    /* JADX INFO: renamed from: d */
    public final StringBuilder f1282d;

    /* JADX INFO: renamed from: e */
    public final StringBuilder f1283e;

    /* JADX INFO: renamed from: f */
    public boolean f1284f;

    public C0476nk() {
        super(1);
        this.f1280b = new StringBuilder();
        this.f1281c = null;
        this.f1282d = new StringBuilder();
        this.f1283e = new StringBuilder();
        this.f1284f = false;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0680uz
    /* JADX INFO: renamed from: a */
    public final void mo904a() {
        AbstractC0680uz.m1738h(this.f1280b);
        this.f1281c = null;
        AbstractC0680uz.m1738h(this.f1282d);
        AbstractC0680uz.m1738h(this.f1283e);
        this.f1284f = false;
    }

    public final String toString() {
        return "<!doctype " + this.f1280b.toString() + ">";
    }
}
