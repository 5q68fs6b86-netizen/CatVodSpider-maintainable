package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s;
import com.github.catvod.spider.support.p044FM.p055K.C1383c;
import com.github.catvod.spider.support.p044FM.p055K.C1384d;
import com.github.catvod.spider.support.p044FM.p055K.C1385e;
import com.github.catvod.spider.support.p044FM.p055K.C1387g;
import com.github.catvod.spider.support.p044FM.p055K.C1389i;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p055K.C1402v;
import com.github.catvod.spider.support.p044FM.p055K.C1403w;
import com.github.catvod.spider.support.p044FM.p055K.EnumC1394n;
import com.github.catvod.spider.support.p044FM.p098x.C1932g;
import java.io.Reader;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1490l1 extends AbstractC1487k1 {
    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1487k1
    /* JADX INFO: renamed from: c */
    final C1412E mo3710c() {
        return C1412E.f3295d;
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1487k1
    @ParametersAreNonnullByDefault
    /* JADX INFO: renamed from: d */
    protected final void mo3712d(Reader reader, String str, C1414F c1414f) {
        super.mo3712d(reader, str, c1414f);
        this.f3472e.add(this.f3471d);
        C1387g c1387gM3424A0 = this.f3471d.m3424A0();
        c1387gM3424A0.m3422j();
        c1387gM3424A0.m3415c(EnumC1394n.xhtml);
        c1387gM3424A0.m3420h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.AbstractC1487k1
    /* JADX INFO: renamed from: g */
    protected final boolean mo3717g(AbstractC1436Q abstractC1436Q) {
        C1393m c1393m;
        C1403w c1403wM3409K;
        int iM4675a = C1932g.m4675a(abstractC1436Q.f3337a);
        if (iM4675a != 0) {
            C1393m c1393m2 = null;
            if (iM4675a == 1) {
                C1430N c1430n = (C1430N) abstractC1436Q;
                C1416G c1416gM3761k = m3761k(c1430n.m3585w(), this.f3475h);
                if (c1430n.m3583u()) {
                    c1430n.f3336n.m3391k(this.f3475h);
                }
                C1412E c1412e = this.f3475h;
                C1383c c1383c = c1430n.f3336n;
                c1412e.m3540c(c1383c);
                C1393m c1393m3 = new C1393m(c1416gM3761k, null, c1383c);
                m3762l(c1393m3);
                if (!c1430n.f3335m) {
                    this.f3472e.add(c1393m3);
                } else if (!c1416gM3761k.m3559g()) {
                    c1416gM3761k.m3563l();
                }
            } else if (iM4675a == 2) {
                String strM3541d = this.f3475h.m3541d(((C1428M) abstractC1436Q).f3326d);
                int size = this.f3472e.size() - 1;
                int i = size >= 256 ? size - 256 : 0;
                int size2 = this.f3472e.size();
                while (true) {
                    size2--;
                    if (size2 < i) {
                        break;
                    }
                    C1393m c1393m4 = this.f3472e.get(size2);
                    if (c1393m4.mo3405s().equals(strM3541d)) {
                        c1393m2 = c1393m4;
                        break;
                    }
                }
                if (c1393m2 != null) {
                    int size3 = this.f3472e.size();
                    do {
                        size3--;
                        if (size3 < 0) {
                            break;
                        }
                        c1393m = this.f3472e.get(size3);
                        this.f3472e.remove(size3);
                    } while (c1393m != c1393m2);
                }
            } else if (iM4675a == 3) {
                C1422J c1422j = (C1422J) abstractC1436Q;
                C1385e c1385e = new C1385e(c1422j.m3569m());
                if (c1422j.f3320f && c1385e.m3410L() && (c1403wM3409K = c1385e.m3409K()) != null) {
                    c1385e = c1403wM3409K;
                }
                m3762l(c1385e);
            } else if (iM4675a == 4) {
                C1420I c1420i = (C1420I) abstractC1436Q;
                String strM3566l = c1420i.m3566l();
                m3762l(c1420i instanceof C1418H ? new C1384d(strM3566l) : new C1402v(strM3566l));
            } else if (iM4675a != 5) {
                StringBuilder sbM3589b = C1434P.m3589b("Unexpected token type: ");
                sbM3589b.append(C1434P.m3590c(abstractC1436Q.f3337a));
                C1377c.m3354a(sbM3589b.toString());
                throw null;
            }
        } else {
            C1424K c1424k = (C1424K) abstractC1436Q;
            C1389i c1389i = new C1389i(this.f3475h.m3541d(c1424k.m3570k()), c1424k.f3323f.toString(), c1424k.f3324g.toString());
            c1389i.m3436L(c1424k.f3322e);
            m3762l(c1389i);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    protected final void m3762l(AbstractC1399s abstractC1399s) {
        m3755a().m3448L(abstractC1399s);
    }
}
