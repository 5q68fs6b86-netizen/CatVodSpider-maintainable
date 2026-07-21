package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.pp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0535pp {

    /* JADX INFO: renamed from: a */
    public static final C0737xb f1372a = new C0737xb("NO_DECISION", 3);

    /* JADX INFO: renamed from: b */
    public static void m1525b(InterfaceC0253fd interfaceC0253fd, AbstractC0272fw abstractC0272fw) {
        AbstractC0711wc.m1770e(abstractC0272fw);
        AbstractC0272fw abstractC0272fwM1231ax = abstractC0272fw;
        int i = 0;
        while (abstractC0272fwM1231ax != null) {
            AbstractC0272fw abstractC0272fw2 = abstractC0272fwM1231ax.f846ap;
            int iMo1172n = abstractC0272fw2 != null ? abstractC0272fw2.mo1172n() : 0;
            AbstractC0272fw abstractC0272fwM1231ax2 = abstractC0272fwM1231ax.m1231ax();
            interfaceC0253fd.mo909c(abstractC0272fwM1231ax, i);
            if (abstractC0272fw2 != null && abstractC0272fwM1231ax.f846ap == null) {
                if (iMo1172n == abstractC0272fw2.mo1172n()) {
                    abstractC0272fwM1231ax = (AbstractC0272fw) abstractC0272fw2.mo1175q().get(abstractC0272fwM1231ax.f847aq);
                } else if (abstractC0272fwM1231ax2 == null) {
                    i--;
                    abstractC0272fwM1231ax = abstractC0272fw2;
                } else {
                    abstractC0272fwM1231ax = abstractC0272fwM1231ax2;
                }
            }
            if (abstractC0272fwM1231ax.mo1172n() > 0) {
                abstractC0272fwM1231ax = (AbstractC0272fw) abstractC0272fwM1231ax.mo1175q().get(0);
                i++;
            } else {
                while (abstractC0272fwM1231ax.m1231ax() == null && i > 0) {
                    interfaceC0253fd.mo908b(abstractC0272fwM1231ax, i);
                    abstractC0272fwM1231ax = abstractC0272fwM1231ax.f846ap;
                    i--;
                }
                interfaceC0253fd.mo908b(abstractC0272fwM1231ax, i);
                if (abstractC0272fwM1231ax == abstractC0272fw) {
                    return;
                } else {
                    abstractC0272fwM1231ax = abstractC0272fwM1231ax.m1231ax();
                }
            }
        }
    }
}
