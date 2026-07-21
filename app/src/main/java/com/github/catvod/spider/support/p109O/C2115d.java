package com.github.catvod.spider.support.p109O;

import com.github.catvod.spider.support.p106L.C2074b;
import com.github.catvod.spider.support.p106L.C2077e;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2076d;
import com.github.catvod.spider.support.p111Q.C2123a;
import com.github.catvod.spider.support.p139y.C2423f;
import java.math.BigDecimal;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p109O.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2115d implements InterfaceC2076d {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2076d
    /* JADX INFO: renamed from: a */
    public final C2078f mo5325a(C2077e c2077e) {
        Matcher matcher = C2074b.f4963a.matcher(C2423f.m6441e(C2123a.m5364b("allText").mo5325a(c2077e).m5341e(), ""));
        if (!matcher.find()) {
            return new C2078f(null);
        }
        BigDecimal bigDecimal = new BigDecimal(matcher.group());
        return bigDecimal.compareTo(new BigDecimal(bigDecimal.longValue())) == 0 ? new C2078f(Long.valueOf(bigDecimal.longValue())) : new C2078f(Double.valueOf(bigDecimal.doubleValue()));
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2076d
    public final String name() {
        return "num";
    }
}
