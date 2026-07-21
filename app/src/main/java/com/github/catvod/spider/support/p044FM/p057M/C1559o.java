package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1559o extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    String f3505a;

    /* JADX INFO: renamed from: b */
    Pattern f3506b;

    public C1559o(String str, Pattern pattern) {
        this.f3505a = C1286l.m3220e(str);
        this.f3506b = pattern;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        return c1393m2.m3520n(this.f3505a) && this.f3506b.matcher(c1393m2.mo3511c(this.f3505a)).find();
    }

    public final String toString() {
        return String.format("[%s~=%s]", this.f3505a, this.f3506b.toString());
    }
}
