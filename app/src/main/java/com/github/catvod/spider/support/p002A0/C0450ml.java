package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ml */
/* JADX INFO: loaded from: classes.dex */
public class C0450ml extends AbstractC0673us {

    /* JADX INFO: renamed from: a */
    public AbstractC0406kv f1234a = null;

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) {
        AbstractC0406kv abstractC0406kv = this.f1234a;
        if (abstractC0406kv != null) {
            return abstractC0406kv.mo900b(c0577rd);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) {
        AbstractC0406kv abstractC0406kv = this.f1234a;
        if (abstractC0406kv == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC0406kv.mo901c(aagVar, obj);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0673us
    /* JADX INFO: renamed from: k */
    public final AbstractC0406kv mo1416k() {
        AbstractC0406kv abstractC0406kv = this.f1234a;
        if (abstractC0406kv != null) {
            return abstractC0406kv;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
