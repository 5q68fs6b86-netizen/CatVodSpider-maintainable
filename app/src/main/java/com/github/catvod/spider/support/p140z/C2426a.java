package com.github.catvod.spider.support.p140z;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p140z.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2426a {

    /* JADX INFO: renamed from: d */
    private static volatile AbstractC2427b f5984d = AbstractC2427b.f5988q;

    /* JADX INFO: renamed from: a */
    private final StringBuffer f5985a;

    /* JADX INFO: renamed from: b */
    private final Object f5986b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2427b f5987c;

    public C2426a(Object obj) {
        AbstractC2427b abstractC2427b = f5984d;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.f5985a = stringBuffer;
        this.f5987c = abstractC2427b;
        this.f5986b = obj;
        abstractC2427b.m6478m(stringBuffer, obj);
    }

    /* JADX INFO: renamed from: a */
    public final C2426a m6450a(Object obj) {
        this.f5987c.mo6466a(this.f5985a, obj);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C2426a m6451b(String str, boolean z) {
        this.f5987c.m6467b(this.f5985a, str, z);
        return this;
    }

    public final String toString() {
        Object obj = this.f5986b;
        if (obj == null) {
            this.f5985a.append(this.f5987c.m6484s());
        } else {
            this.f5987c.m6473h(this.f5985a, obj);
        }
        return this.f5985a.toString();
    }
}
