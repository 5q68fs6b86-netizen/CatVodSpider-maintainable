package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p055K.C1390j;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1562r extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3507a = 0;

    /* JADX INFO: renamed from: b */
    private final Serializable f3508b;

    public C1562r(String str) {
        StringBuilder sbM3363b = C1380b.m3363b();
        C1380b.m3362a(sbM3363b, str, false);
        this.f3508b = C1286l.m3219d(C1380b.m3369h(sbM3363b));
    }

    public C1562r(Pattern pattern) {
        this.f3508b = pattern;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        switch (this.f3507a) {
            case 0:
                return C1286l.m3219d(c1393m2.m3471j0()).contains((String) this.f3508b);
            default:
                Pattern pattern = (Pattern) this.f3508b;
                StringBuilder sbM3363b = C1380b.m3363b();
                C1317a.m3303d(new C1390j(sbM3363b), c1393m2);
                return pattern.matcher(C1380b.m3369h(sbM3363b)).find();
        }
    }

    public final String toString() {
        switch (this.f3507a) {
            case 0:
                return String.format(":containsOwn(%s)", (String) this.f3508b);
            default:
                return String.format(":matchesWholeText(%s)", (Pattern) this.f3508b);
        }
    }
}
