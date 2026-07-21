package com.github.catvod.spider.support.p102H;

import com.github.catvod.spider.support.p101G.C2034f;
import java.io.StringReader;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2051g {

    /* JADX INFO: renamed from: a */
    private AbstractC2057m f4756a;

    /* JADX INFO: renamed from: b */
    private C2049e f4757b = new C2049e();

    public C2051g(AbstractC2057m abstractC2057m) {
        this.f4756a = abstractC2057m;
    }

    /* JADX INFO: renamed from: d */
    public static C2034f m5074d(String str) {
        AbstractC2053i abstractC2053iM5158u;
        C2046b c2046b = new C2046b();
        c2046b.mo5021c(new StringReader(str), new C2051g(c2046b));
        C2055k c2055k = c2046b.f4893c;
        do {
            abstractC2053iM5158u = c2055k.m5158u();
            c2046b.mo5025e(abstractC2053iM5158u);
            abstractC2053iM5158u.mo5099h();
        } while (abstractC2053iM5158u.f4774a != 6);
        c2046b.f4892b.m4971d();
        c2046b.f4892b = null;
        c2046b.f4893c = null;
        c2046b.f4895e = null;
        c2046b.f4899i = null;
        return c2046b.f4894d;
    }

    /* JADX INFO: renamed from: a */
    public final C2049e m5075a() {
        return this.f4757b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5076b(String str) {
        return this.f4756a.mo5023d(str);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5077c() {
        return this.f4757b.m5067b() > 0;
    }
}
