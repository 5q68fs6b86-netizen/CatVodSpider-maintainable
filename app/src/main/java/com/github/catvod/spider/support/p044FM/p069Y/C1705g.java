package com.github.catvod.spider.support.p044FM.p069Y;

import com.github.catvod.spider.support.p044FM.p045A.C1290p;
import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p055K.C1402v;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p069Y.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1705g implements InterfaceC1663d {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d
    /* JADX INFO: renamed from: a */
    public final C1665f mo3956a(C1664e c1664e) {
        Integer num;
        C1551g c1551gM3960a = c1664e.m3960a();
        C1551g c1551g = new C1551g();
        HashMap map = new HashMap();
        if (c1551gM3960a != null && c1551gM3960a.size() > 0) {
            if (c1664e.m3962f()) {
                Iterator<C1393m> it = c1551gM3960a.iterator();
                while (it.hasNext()) {
                    C1317a.m3303d(new C1704f(map, c1551g), it.next());
                }
                for (C1393m c1393m : c1551g) {
                    String strMo3511c = c1393m.mo3511c("EL_DEPTH");
                    if (C1305h.m3250d(strMo3511c) && (num = (Integer) map.get(strMo3511c)) != null) {
                        C1290p.m3231f(c1393m, num.intValue());
                    }
                }
            } else {
                for (C1393m c1393m2 : c1551gM3960a) {
                    if ("script".equals(c1393m2.mo3405s())) {
                        C1393m c1393m3 = new C1393m("JX_TEXT");
                        c1393m3.mo3432u0(c1393m2.m3457X());
                        C1290p.m3230e(c1393m3, 1);
                        C1290p.m3231f(c1393m3, 1);
                        c1551g.add(c1393m3);
                    } else {
                        List<C1402v> listM3485w0 = c1393m2.m3485w0();
                        int i = 0;
                        while (i < listM3485w0.size()) {
                            C1402v c1402v = listM3485w0.get(i);
                            C1393m c1393m4 = new C1393m("JX_TEXT");
                            c1393m4.mo3432u0(c1402v.m3529L());
                            i++;
                            C1290p.m3230e(c1393m4, i);
                            C1290p.m3231f(c1393m4, listM3485w0.size());
                            c1551g.add(c1393m4);
                        }
                    }
                }
            }
        }
        return new C1665f(c1551g);
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d
    public final String name() {
        return "text";
    }
}
