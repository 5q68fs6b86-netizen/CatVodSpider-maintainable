package com.github.catvod.spider.support.p002A0;

import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ix */
/* JADX INFO: loaded from: classes.dex */
public final class C0354ix implements InterfaceC0698vq {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f1025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f1026c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0406kv f1027d;

    public C0354ix(Class cls, Class cls2, AbstractC0406kv abstractC0406kv) {
        this.f1025b = cls;
        this.f1026c = cls2;
        this.f1027d = abstractC0406kv;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0698vq
    /* JADX INFO: renamed from: a */
    public final AbstractC0406kv mo934a(C0493oa c0493oa, C0259fj c0259fj) {
        Class cls = c0259fj.f827a;
        if (cls == this.f1025b || cls == this.f1026c) {
            return this.f1027d;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f1026c.getName() + Marker.ANY_NON_NULL_MARKER + this.f1025b.getName() + ",adapter=" + this.f1027d + "]";
    }
}
