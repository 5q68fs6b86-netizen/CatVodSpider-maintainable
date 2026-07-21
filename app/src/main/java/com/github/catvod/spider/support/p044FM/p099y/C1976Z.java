package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.AbstractC1275a;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.Z */
/* JADX INFO: loaded from: classes.dex */
final class C1976Z extends AbstractC1275a {

    /* JADX INFO: renamed from: a */
    public static final C1976Z f4512a = new C1976Z();

    private C1976Z() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p045A.AbstractC1275a
    /* JADX INFO: renamed from: E */
    public final boolean mo3181E(Object obj, Object obj2) {
        C1979b c1979b = (C1979b) obj;
        C1979b c1979b2 = (C1979b) obj2;
        if (c1979b == c1979b2) {
            return true;
        }
        return c1979b != null && c1979b2 != null && c1979b.f4522a.f4561b == c1979b2.f4522a.f4561b && c1979b.f4524c.equals(c1979b2.f4524c);
    }

    @Override // com.github.catvod.spider.support.p044FM.p045A.AbstractC1275a
    /* JADX INFO: renamed from: F */
    public final int mo3182F(Object obj) {
        C1979b c1979b = (C1979b) obj;
        return C1286l.m3218c(C1286l.m3225j(C1286l.m3224i(7, c1979b.f4522a.f4561b), c1979b.f4524c), 2);
    }
}
