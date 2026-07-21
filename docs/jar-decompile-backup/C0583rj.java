package com.github.catvod.spider.support.p002A0;

import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.rj */
/* JADX INFO: loaded from: classes.dex */
public final class C0583rj extends AbstractC0213dr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1443a;

    public /* synthetic */ C0583rj(int i) {
        this.f1443a = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: b */
    public int mo1019b() {
        switch (this.f1443a) {
            case 0:
                return 10;
            case 6:
                return 1;
            case 7:
                return -1;
            case 8:
                return 1;
            default:
                return super.mo1019b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac A[ORIG_RETURN, RETURN] */
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        C0589rp c0589rp;
        switch (this.f1443a) {
            case 0:
                return true;
            case 1:
                for (AbstractC0272fw abstractC0272fwM1231ax = c0226ed2.mo1172n() == 0 ? null : (AbstractC0272fw) c0226ed2.mo1175q().get(0); abstractC0272fwM1231ax != null; abstractC0272fwM1231ax = abstractC0272fwM1231ax.m1231ax()) {
                    if (abstractC0272fwM1231ax instanceof C0706vy) {
                        if (!AbstractC0727ws.m1848j(((C0706vy) abstractC0272fwM1231ax).m1732f())) {
                            return false;
                        }
                    } else if (!(abstractC0272fwM1231ax instanceof C0638tk) && !(abstractC0272fwM1231ax instanceof C0236en)) {
                        return false;
                    }
                }
                return true;
            case 2:
                C0226ed c0226ed3 = (C0226ed) c0226ed2.f846ap;
                return (c0226ed3 == null || (c0226ed3 instanceof C0235em) || c0226ed2 != c0226ed3.m1161ac()) ? false : true;
            case 3:
                C0226ed c0226ed4 = (C0226ed) c0226ed2.f846ap;
                if (c0226ed4 != null && !(c0226ed4 instanceof C0235em)) {
                    int iMo1172n = c0226ed4.mo1172n();
                    C0226ed c0226ed5 = null;
                    for (AbstractC0272fw abstractC0272fwM1232ay = iMo1172n == 0 ? null : (AbstractC0272fw) c0226ed4.mo1175q().get(iMo1172n - 1); abstractC0272fwM1232ay != null; abstractC0272fwM1232ay = abstractC0272fwM1232ay.m1232ay()) {
                        if (abstractC0272fwM1232ay instanceof C0226ed) {
                            c0226ed5 = (C0226ed) abstractC0272fwM1232ay;
                            if (c0226ed2 == c0226ed5) {
                                return true;
                            }
                        }
                    }
                    if (c0226ed2 == c0226ed5) {
                        return true;
                    }
                }
                return false;
            case 4:
                AbstractC0272fw abstractC0272fw = c0226ed2.f846ap;
                C0226ed c0226ed6 = (C0226ed) abstractC0272fw;
                if (c0226ed6 == null || (c0226ed6 instanceof C0235em)) {
                    return false;
                }
                if (abstractC0272fw == null) {
                    c0589rp = new C0589rp(0);
                } else {
                    List<C0226ed> listM1181z = ((C0226ed) abstractC0272fw).m1181z();
                    C0589rp c0589rp2 = new C0589rp(listM1181z.size() - 1);
                    for (C0226ed c0226ed7 : listM1181z) {
                        if (c0226ed7 != c0226ed2) {
                            c0589rp2.add(c0226ed7);
                        }
                    }
                    c0589rp = c0589rp2;
                }
                return c0589rp.isEmpty();
            case 5:
                C0226ed c0226ed8 = (C0226ed) c0226ed2.f846ap;
                if (c0226ed8 == null || (c0226ed8 instanceof C0235em)) {
                    return false;
                }
                int i = 0;
                for (C0226ed c0226edM1161ac = c0226ed8.m1161ac(); c0226edM1161ac != null; c0226edM1161ac = c0226edM1161ac.m1164af()) {
                    if (c0226edM1161ac.f771g.f590c.equals(c0226ed2.f771g.f590c)) {
                        i++;
                    }
                    if (i > 1) {
                        if (i == 1) {
                            return true;
                        }
                        return false;
                    }
                }
                if (i == 1) {
                    return true;
                }
                return false;
            case 6:
                if (c0226ed instanceof C0235em) {
                    c0226ed = c0226ed.m1161ac();
                }
                return c0226ed2 == c0226ed;
            case 7:
                if (c0226ed2 instanceof C0795zf) {
                    return true;
                }
                for (AbstractC0272fw abstractC0272fw2 : (List) c0226ed2.f773i.stream().filter(new C0591rr()).map(new C0234el(1)).collect(Collectors.collectingAndThen(Collectors.toList(), new C0234el(2)))) {
                    C0118ad c0118ad = c0226ed2.f771g;
                    C0795zf c0795zf = new C0795zf(C0118ad.m987m(c0118ad.f589b, c0118ad.f591d, C0707vz.f1649b), c0226ed2.mo1171m(), c0226ed2.mo1170l());
                    abstractC0272fw2.m1235bb(c0795zf);
                    c0795zf.m1180y(abstractC0272fw2);
                }
                return false;
            default:
                return c0226ed == c0226ed2;
        }
    }

    public final String toString() {
        switch (this.f1443a) {
            case 0:
                return Marker.ANY_MARKER;
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return "";
        }
    }
}
