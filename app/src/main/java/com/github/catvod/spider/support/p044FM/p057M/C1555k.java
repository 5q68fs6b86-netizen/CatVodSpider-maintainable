package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p055K.C1381a;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import java.io.Serializable;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1555k extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3503a;

    /* JADX INFO: renamed from: b */
    private final Serializable f3504b;

    public C1555k(String str, int i) {
        this.f3503a = i;
        if (i == 1) {
            this.f3504b = C1286l.m3219d(str);
        } else {
            C1377c.m3358e(str);
            this.f3504b = C1286l.m3219d(str);
        }
    }

    public C1555k(Pattern pattern) {
        this.f3503a = 2;
        this.f3504b = pattern;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        switch (this.f3503a) {
            case 0:
                Iterator<C1381a> it = c1393m2.mo3463d().m3389g().iterator();
                while (it.hasNext()) {
                    if (C1286l.m3219d(it.next().m3375a()).startsWith((String) this.f3504b)) {
                        return true;
                    }
                }
                return false;
            case 1:
                return C1286l.m3219d(c1393m2.m3457X()).contains((String) this.f3504b);
            default:
                return ((Pattern) this.f3504b).matcher(c1393m2.m3486x0()).find();
        }
    }

    public final String toString() {
        switch (this.f3503a) {
            case 0:
                return String.format("[^%s]", (String) this.f3504b);
            case 1:
                return String.format(":containsData(%s)", (String) this.f3504b);
            default:
                return String.format(":matchesWholeOwnText(%s)", (Pattern) this.f3504b);
        }
    }
}
