package com.github.catvod.spider.support.p137w;

/* JADX INFO: renamed from: com.github.catvod.spider.support.w.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2408j extends AbstractC2399a {

    /* JADX INFO: renamed from: a */
    public static final C2408j f5966a = new C2408j();

    @Override // com.github.catvod.spider.support.p137w.AbstractC2399a
    /* JADX INFO: renamed from: E */
    public final boolean mo6338E(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // com.github.catvod.spider.support.p137w.AbstractC2399a
    /* JADX INFO: renamed from: F */
    public final int mo6339F(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
