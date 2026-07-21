package com.github.catvod.spider.support.p002A0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.mb */
/* JADX INFO: loaded from: classes.dex */
public final class C0440mb extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public volatile AbstractC0406kv f1212a;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f1213d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f1214e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0493oa f1215f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0259fj f1216g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0434lw f1217h;

    public C0440mb(C0434lw c0434lw, boolean z, boolean z2, C0493oa c0493oa, C0259fj c0259fj) {
        this.f1217h = c0434lw;
        this.f1213d = z;
        this.f1214e = z2;
        this.f1215f = c0493oa;
        this.f1216g = c0259fj;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (this.f1213d) {
            c0577rd.m1614ar();
            return null;
        }
        AbstractC0406kv abstractC0406kvM1472ab = this.f1212a;
        if (abstractC0406kvM1472ab == null) {
            abstractC0406kvM1472ab = this.f1215f.m1472ab(this.f1217h, this.f1216g);
            this.f1212a = abstractC0406kvM1472ab;
        }
        return abstractC0406kvM1472ab.mo900b(c0577rd);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        if (this.f1214e) {
            aagVar.m892w();
            return;
        }
        AbstractC0406kv abstractC0406kvM1472ab = this.f1212a;
        if (abstractC0406kvM1472ab == null) {
            abstractC0406kvM1472ab = this.f1215f.m1472ab(this.f1217h, this.f1216g);
            this.f1212a = abstractC0406kvM1472ab;
        }
        abstractC0406kvM1472ab.mo901c(aagVar, obj);
    }
}
