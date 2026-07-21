package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.lu */
/* JADX INFO: loaded from: classes.dex */
public final class C0432lu extends AbstractC0673us {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0176ch f1194a;

    /* JADX INFO: renamed from: d */
    public final aav f1195d;

    /* JADX INFO: renamed from: e */
    public final C0493oa f1196e;

    /* JADX INFO: renamed from: f */
    public final C0259fj f1197f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0698vq f1198g;

    /* JADX INFO: renamed from: h */
    public final C0372jo f1199h = new C0372jo(23);

    /* JADX INFO: renamed from: i */
    public final boolean f1200i;

    /* JADX INFO: renamed from: j */
    public volatile AbstractC0406kv f1201j;

    public C0432lu(InterfaceC0176ch interfaceC0176ch, aav aavVar, C0493oa c0493oa, C0259fj c0259fj, InterfaceC0698vq interfaceC0698vq, boolean z) {
        this.f1194a = interfaceC0176ch;
        this.f1195d = aavVar;
        this.f1196e = c0493oa;
        this.f1197f = c0259fj;
        this.f1198g = interfaceC0698vq;
        this.f1200i = z;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) {
        aav aavVar = this.f1195d;
        if (aavVar == null) {
            return m1417l().mo900b(c0577rd);
        }
        AbstractC0342il abstractC0342ilM1637b = AbstractC0584rk.m1637b(c0577rd);
        if (this.f1200i) {
            abstractC0342ilM1637b.getClass();
            if (abstractC0342ilM1637b instanceof aas) {
                return null;
            }
        }
        return aavVar.deserialize(abstractC0342ilM1637b, this.f1197f.f828b, this.f1199h);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        InterfaceC0176ch interfaceC0176ch = this.f1194a;
        if (interfaceC0176ch == null) {
            m1417l().mo901c(aagVar, obj);
            return;
        }
        if (this.f1200i && obj == null) {
            aagVar.m892w();
            return;
        }
        AbstractC0342il abstractC0342ilSerialize = interfaceC0176ch.serialize(obj, this.f1197f.f828b, this.f1199h);
        ado.f643z.getClass();
        C0685vd.m1746d(aagVar, abstractC0342ilSerialize);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0673us
    /* JADX INFO: renamed from: k */
    public final AbstractC0406kv mo1416k() {
        return this.f1194a != null ? this : m1417l();
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC0406kv m1417l() {
        AbstractC0406kv abstractC0406kv = this.f1201j;
        if (abstractC0406kv != null) {
            return abstractC0406kv;
        }
        AbstractC0406kv abstractC0406kvM1472ab = this.f1196e.m1472ab(this.f1198g, this.f1197f);
        this.f1201j = abstractC0406kvM1472ab;
        return abstractC0406kvM1472ab;
    }
}
