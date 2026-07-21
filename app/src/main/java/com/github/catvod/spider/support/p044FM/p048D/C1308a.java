package com.github.catvod.spider.support.p044FM.p048D;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.D.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1308a {

    /* JADX INFO: renamed from: d */
    private static volatile AbstractC1316i f3031d = AbstractC1316i.f3035q;

    /* JADX INFO: renamed from: a */
    private final StringBuffer f3032a;

    /* JADX INFO: renamed from: b */
    private final Object f3033b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1316i f3034c;

    public C1308a(Object obj) {
        AbstractC1316i abstractC1316i = f3031d;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.f3032a = stringBuffer;
        this.f3034c = abstractC1316i;
        this.f3033b = obj;
        abstractC1316i.m3287m(stringBuffer, obj);
    }

    /* JADX INFO: renamed from: a */
    public final C1308a m3259a(Object obj) {
        this.f3034c.mo3261a(this.f3032a, obj);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C1308a m3260b(String str, boolean z) {
        this.f3034c.m3281b(this.f3032a, str, z);
        return this;
    }

    public final String toString() {
        Object obj = this.f3033b;
        if (obj == null) {
            this.f3032a.append(this.f3034c.m3293s());
        } else {
            this.f3034c.m3283h(this.f3032a, obj);
        }
        return this.f3032a.toString();
    }
}
