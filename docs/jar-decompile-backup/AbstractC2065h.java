package com.github.catvod.spider.support.p103I;

import com.github.catvod.spider.support.p101G.AbstractC2041m;
import com.github.catvod.spider.support.p101G.C2037i;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.h */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2065h extends AbstractC2061d {

    /* JADX INFO: renamed from: a */
    AbstractC2061d f4939a;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.h$a */
    static class a extends AbstractC2065h {

        /* JADX INFO: renamed from: b */
        final C2058a.b f4940b;

        public a(AbstractC2061d abstractC2061d) {
            this.f4939a = abstractC2061d;
            this.f4940b = new C2058a.b(abstractC2061d);
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            for (int i = 0; i < c2037i2.mo4835h(); i++) {
                AbstractC2041m abstractC2041mM4937g = c2037i2.m4937g(i);
                if ((abstractC2041mM4937g instanceof C2037i) && this.f4940b.m5175a(c2037i2, (C2037i) abstractC2041mM4937g) != null) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format(":has(%s)", this.f4939a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.h$b */
    static class b extends AbstractC2065h {
        public b(AbstractC2061d abstractC2061d) {
            this.f4939a = abstractC2061d;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            C2037i c2037iM4890j0;
            return (c2037i == c2037i2 || (c2037iM4890j0 = c2037i2.m4890j0()) == null || !this.f4939a.mo5178a(c2037i, c2037iM4890j0)) ? false : true;
        }

        public final String toString() {
            return String.format("%s > ", this.f4939a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.h$c */
    static class c extends AbstractC2065h {
        public c(AbstractC2061d abstractC2061d) {
            this.f4939a = abstractC2061d;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            C2037i c2037iM4894m0;
            return (c2037i == c2037i2 || (c2037iM4894m0 = c2037i2.m4894m0()) == null || !this.f4939a.mo5178a(c2037i, c2037iM4894m0)) ? false : true;
        }

        public final String toString() {
            return String.format("%s + ", this.f4939a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.h$d */
    static class d extends AbstractC2065h {
        public d(AbstractC2061d abstractC2061d) {
            this.f4939a = abstractC2061d;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return !this.f4939a.mo5178a(c2037i, c2037i2);
        }

        public final String toString() {
            return String.format(":not(%s)", this.f4939a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.h$e */
    static class e extends AbstractC2065h {
        public e(AbstractC2061d abstractC2061d) {
            this.f4939a = abstractC2061d;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            if (c2037i == c2037i2) {
                return false;
            }
            do {
                c2037i2 = c2037i2.m4890j0();
                if (c2037i2 == null) {
                    break;
                }
                if (this.f4939a.mo5178a(c2037i, c2037i2)) {
                    return true;
                }
            } while (c2037i2 != c2037i);
            return false;
        }

        public final String toString() {
            return String.format("%s ", this.f4939a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.h$f */
    static class f extends AbstractC2065h {
        public f(AbstractC2061d abstractC2061d) {
            this.f4939a = abstractC2061d;
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            if (c2037i == c2037i2) {
                return false;
            }
            do {
                c2037i2 = c2037i2.m4894m0();
                if (c2037i2 == null) {
                    return false;
                }
            } while (!this.f4939a.mo5178a(c2037i, c2037i2));
            return true;
        }

        public final String toString() {
            return String.format("%s ~ ", this.f4939a);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p103I.h$g */
    static class g extends AbstractC2061d {
        g() {
        }

        @Override // com.github.catvod.spider.support.p103I.AbstractC2061d
        /* JADX INFO: renamed from: a */
        public final boolean mo5178a(C2037i c2037i, C2037i c2037i2) {
            return c2037i == c2037i2;
        }
    }

    AbstractC2065h() {
    }
}
