package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.AbstractC1275a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1983d extends AbstractC1275a {

    /* JADX INFO: renamed from: a */
    public static final C1983d f4529a = new C1983d();

    private C1983d() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p045A.AbstractC1275a
    /* JADX INFO: renamed from: E */
    public final boolean mo3181E(Object obj, Object obj2) {
        C1979b c1979b = (C1979b) obj;
        C1979b c1979b2 = (C1979b) obj2;
        if (c1979b == c1979b2) {
            return true;
        }
        return c1979b != null && c1979b2 != null && c1979b.f4522a.f4561b == c1979b2.f4522a.f4561b && c1979b.f4523b == c1979b2.f4523b && c1979b.f4526e.equals(c1979b2.f4526e);
    }

    @Override // com.github.catvod.spider.support.p044FM.p045A.AbstractC1275a
    /* JADX INFO: renamed from: F */
    public final int mo3182F(Object obj) {
        C1979b c1979b = (C1979b) obj;
        return c1979b.f4526e.hashCode() + ((((c1979b.f4522a.f4561b + 217) * 31) + c1979b.f4523b) * 31);
    }
}
