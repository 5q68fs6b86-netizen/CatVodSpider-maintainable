package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.kz */
/* JADX INFO: loaded from: classes.dex */
public final class C0410kz extends AbstractC0465n {

    /* JADX INFO: renamed from: c */
    public final C0150bi f1113c;

    /* JADX INFO: renamed from: q */
    public final C0424lm f1114q;

    /* JADX INFO: renamed from: r */
    public final C0610sj f1115r;

    /* JADX INFO: renamed from: s */
    public final Object f1116s;

    public C0410kz(C0150bi c0150bi, C0424lm c0424lm, C0610sj c0610sj, Object obj) {
        super(c0610sj.f1492q);
        this.f1113c = c0150bi;
        this.f1114q = c0424lm;
        this.f1115r = c0610sj;
        this.f1116s = obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0465n
    /* JADX INFO: renamed from: f */
    public final void mo992f(Throwable th) {
        C0610sj c0610sj = this.f1115r;
        C0150bi c0150bi = this.f1113c;
        c0150bi.getClass();
        C0610sj c0610sjM1025d = C0150bi.m1025d(c0610sj);
        C0424lm c0424lm = this.f1114q;
        Object obj = this.f1116s;
        if (c0610sjM1025d != null) {
            while (AbstractC0156bo.m1060a(c0610sjM1025d.f1492q, false, new C0410kz(c0150bi, c0424lm, c0610sjM1025d, obj), 1) == C0438m.f1211a) {
                c0610sjM1025d = C0150bi.m1025d(c0610sjM1025d);
                if (c0610sjM1025d != null) {
                }
            }
            return;
        }
        c0150bi.mo963h(c0150bi.m1043p(c0424lm, obj));
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0569qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo992f((Throwable) obj);
        return C0372jo.f1077i;
    }
}
