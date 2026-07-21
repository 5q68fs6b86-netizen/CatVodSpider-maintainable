package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1553i extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3499a;

    /* JADX INFO: renamed from: b */
    private final Object f3500b;

    public /* synthetic */ C1553i(Object obj, int i) {
        this.f3499a = i;
        this.f3500b = obj;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        switch (this.f3499a) {
            case 0:
                return c1393m2.m3520n((String) this.f3500b);
            case 1:
                return c1393m2.m3460a0((String) this.f3500b);
            default:
                return ((Pattern) this.f3500b).matcher(c1393m2.m3471j0()).find();
        }
    }

    public final String toString() {
        switch (this.f3499a) {
            case 0:
                return String.format("[%s]", (String) this.f3500b);
            case 1:
                return String.format(".%s", (String) this.f3500b);
            default:
                return String.format(":matchesOwn(%s)", (Pattern) this.f3500b);
        }
    }
}
