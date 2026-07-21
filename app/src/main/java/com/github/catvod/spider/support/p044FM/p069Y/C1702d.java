package com.github.catvod.spider.support.p044FM.p069Y;

import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p066V.C1661b;
import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d;
import com.github.catvod.spider.support.p044FM.p072a0.C1712a;
import java.math.BigDecimal;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.Y.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1702d implements InterfaceC1663d {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d
    /* JADX INFO: renamed from: a */
    public final C1665f mo3956a(C1664e c1664e) {
        Matcher matcher = C1661b.f3736a.matcher(C1305h.m3251e(C1712a.m3995b("allText").mo3956a(c1664e).m3972e(), ""));
        if (!matcher.find()) {
            return new C1665f(null);
        }
        BigDecimal bigDecimal = new BigDecimal(matcher.group());
        return bigDecimal.compareTo(new BigDecimal(bigDecimal.longValue())) == 0 ? new C1665f(Long.valueOf(bigDecimal.longValue())) : new C1665f(Double.valueOf(bigDecimal.doubleValue()));
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d
    public final String name() {
        return "num";
    }
}
