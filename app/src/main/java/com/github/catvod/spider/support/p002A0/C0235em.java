package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.em */
/* JADX INFO: loaded from: classes.dex */
public final class C0235em extends C0226ed {

    /* JADX INFO: renamed from: a */
    public C0674ut f783a;

    /* JADX INFO: renamed from: al */
    public C0736xa f784al;

    /* JADX INFO: renamed from: am */
    public int f785am;

    public C0235em() {
        this("http://www.w3.org/1999/xhtml", "");
    }

    public C0235em(String str, String str2) {
        super(C0118ad.m987m("#root", str, C0707vz.f1648a), str2, null);
        C0674ut c0674ut = new C0674ut();
        c0674ut.f1580a = EnumC0255ff.base;
        c0674ut.f1581b = abz.f545a;
        c0674ut.f1582c = true;
        c0674ut.f1583d = 1;
        c0674ut.f1584e = 30;
        c0674ut.f1585f = 1;
        this.f783a = c0674ut;
        this.f785am = 1;
        this.f784al = new C0736xa(new C0801zl());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: an */
    public final String mo1192an() {
        return m1163ae();
    }

    @Override // com.github.catvod.spider.support.p002A0.C0226ed, com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: b */
    public final AbstractC0272fw clone() {
        C0235em c0235em = (C0235em) super.mo923b();
        c0235em.f783a = this.f783a.clone();
        return c0235em;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0226ed, com.github.catvod.spider.support.p002A0.AbstractC0272fw
    public final Object clone() {
        C0235em c0235em = (C0235em) super.mo923b();
        c0235em.f783a = this.f783a.clone();
        return c0235em;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0226ed
    /* JADX INFO: renamed from: d */
    public final C0226ed mo923b() {
        C0235em c0235em = (C0235em) super.mo923b();
        c0235em.f783a = this.f783a.clone();
        return c0235em;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0226ed, com.github.catvod.spider.support.p002A0.AbstractC0272fw
    /* JADX INFO: renamed from: s */
    public final String mo924s() {
        return "#document";
    }
}
