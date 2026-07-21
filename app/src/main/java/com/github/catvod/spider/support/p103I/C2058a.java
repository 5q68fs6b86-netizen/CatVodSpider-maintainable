package com.github.catvod.spider.support.p103I;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p101G.AbstractC2041m;
import com.github.catvod.spider.support.p101G.C2037i;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2058a {

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.a$a */
    private static class a implements InterfaceC2062e {

        /* JADX INFO: renamed from: a */
        private final C2037i f4902a;

        /* JADX INFO: renamed from: b */
        private final C2060c f4903b;

        /* JADX INFO: renamed from: c */
        private final AbstractC2061d f4904c;

        a(C2037i c2037i, C2060c c2060c, AbstractC2061d abstractC2061d) {
            this.f4902a = c2037i;
            this.f4903b = c2060c;
            this.f4904c = abstractC2061d;
        }

        @Override // com.github.catvod.spider.support.p103I.InterfaceC2062e
        /* JADX INFO: renamed from: a */
        public final void mo4858a(AbstractC2041m abstractC2041m, int i) {
        }

        @Override // com.github.catvod.spider.support.p103I.InterfaceC2062e
        /* JADX INFO: renamed from: b */
        public final void mo4859b(AbstractC2041m abstractC2041m, int i) {
            if (abstractC2041m instanceof C2037i) {
                C2037i c2037i = (C2037i) abstractC2041m;
                if (this.f4904c.mo5178a(this.f4902a, c2037i)) {
                    this.f4903b.add(c2037i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.a$b */
    static class b {

        /* JADX INFO: renamed from: a */
        @Nullable
        private C2037i f4905a = null;

        /* JADX INFO: renamed from: b */
        @Nullable
        private C2037i f4906b = null;

        /* JADX INFO: renamed from: c */
        private final AbstractC2061d f4907c;

        b(AbstractC2061d abstractC2061d) {
            this.f4907c = abstractC2061d;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        final C2037i m5175a(C2037i c2037i, C2037i c2037i2) {
            this.f4905a = c2037i;
            this.f4906b = null;
            AbstractC2041m abstractC2041mM4937g = c2037i2;
            int i = 0;
            while (abstractC2041mM4937g != null) {
                int iM5176b = m5176b(abstractC2041mM4937g);
                if (iM5176b == 5) {
                    break;
                }
                int i2 = 1;
                if (iM5176b != 1 || abstractC2041mM4937g.mo4835h() <= 0) {
                    while (abstractC2041mM4937g.m4942s() == null && i > 0) {
                        if (iM5176b == 1 || iM5176b == 2) {
                            iM5176b = 1;
                        }
                        AbstractC2041m abstractC2041mM4931A = abstractC2041mM4937g.m4931A();
                        i--;
                        if (iM5176b == 4) {
                            abstractC2041mM4937g.m4932C();
                        }
                        abstractC2041mM4937g = abstractC2041mM4931A;
                        iM5176b = 1;
                    }
                    if (iM5176b != 1 && iM5176b != 2) {
                        i2 = iM5176b;
                    }
                    if (abstractC2041mM4937g == c2037i2) {
                        break;
                    }
                    AbstractC2041m abstractC2041mM4942s = abstractC2041mM4937g.m4942s();
                    if (i2 == 4) {
                        abstractC2041mM4937g.m4932C();
                    }
                    abstractC2041mM4937g = abstractC2041mM4942s;
                } else {
                    abstractC2041mM4937g = abstractC2041mM4937g.m4937g(0);
                    i++;
                }
            }
            return this.f4906b;
        }

        /* JADX INFO: renamed from: b */
        public final int m5176b(AbstractC2041m abstractC2041m) {
            if (!(abstractC2041m instanceof C2037i)) {
                return 1;
            }
            C2037i c2037i = (C2037i) abstractC2041m;
            if (!this.f4907c.mo5178a(this.f4905a, c2037i)) {
                return 1;
            }
            this.f4906b = c2037i;
            return 5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2060c m5174a(AbstractC2061d abstractC2061d, C2037i c2037i) {
        C2060c c2060c = new C2060c();
        C1273a.m3167g(new a(c2037i, c2060c, abstractC2061d), c2037i);
        return c2060c;
    }
}
