package com.github.catvod.spider.support.p011C;

import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p139y.C2420c;
import com.google.protobuf.DescriptorProtos;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0962e implements Serializable {

    /* JADX INFO: renamed from: f */
    private static final f[] f2305f = new f[0];

    /* JADX INFO: renamed from: g */
    private static final ConcurrentMap<i, String> f2306g = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: a */
    private final String f2307a;

    /* JADX INFO: renamed from: b */
    private final TimeZone f2308b;

    /* JADX INFO: renamed from: c */
    private final Locale f2309c;

    /* JADX INFO: renamed from: d */
    private transient f[] f2310d;

    /* JADX INFO: renamed from: e */
    private transient int f2311e;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$a */
    private static class a implements f {

        /* JADX INFO: renamed from: a */
        private final char f2312a;

        a(char c) {
            this.f2312a = c;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append(this.f2312a);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$b */
    private static class b implements d {

        /* JADX INFO: renamed from: a */
        private final d f2313a;

        b(d dVar) {
            this.f2313a = dVar;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.d
        /* JADX INFO: renamed from: a */
        public final void mo2364a(Appendable appendable, int i) {
            this.f2313a.mo2364a(appendable, i);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            int i = calendar.get(7);
            this.f2313a.mo2364a(appendable, i != 1 ? i - 1 : 7);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return this.f2313a.mo2363c();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$c */
    private static class c implements f {

        /* JADX INFO: renamed from: b */
        static final c f2314b = new c(3);

        /* JADX INFO: renamed from: c */
        static final c f2315c = new c(5);

        /* JADX INFO: renamed from: d */
        static final c f2316d = new c(6);

        /* JADX INFO: renamed from: a */
        final int f2317a;

        c(int i) {
            this.f2317a = i;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            int i = calendar.get(16) + calendar.get(15);
            if (i == 0) {
                ((StringBuilder) appendable).append((CharSequence) "Z");
                return;
            }
            if (i < 0) {
                ((StringBuilder) appendable).append('-');
                i = -i;
            } else {
                ((StringBuilder) appendable).append('+');
            }
            int i2 = i / 3600000;
            C0962e.m2353a(appendable, i2);
            int i3 = this.f2317a;
            if (i3 < 5) {
                return;
            }
            if (i3 == 6) {
                ((StringBuilder) appendable).append(':');
            }
            C0962e.m2353a(appendable, (i / 60000) - (i2 * 60));
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return this.f2317a;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$d */
    private interface d extends f {
        /* JADX INFO: renamed from: a */
        void mo2364a(Appendable appendable, int i);
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$e */
    private static class e implements d {

        /* JADX INFO: renamed from: a */
        private final int f2318a;

        /* JADX INFO: renamed from: b */
        private final int f2319b;

        e(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.f2318a = i;
            this.f2319b = i2;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.d
        /* JADX INFO: renamed from: a */
        public final void mo2364a(Appendable appendable, int i) {
            C0962e.m2354b(appendable, i, this.f2319b);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            mo2364a(appendable, calendar.get(this.f2318a));
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return this.f2319b;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$f */
    private interface f {
        /* JADX INFO: renamed from: b */
        void mo2362b(Appendable appendable, Calendar calendar);

        /* JADX INFO: renamed from: c */
        int mo2363c();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$g */
    private static class g implements f {

        /* JADX INFO: renamed from: a */
        private final String f2320a;

        g(String str) {
            this.f2320a = str;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append((CharSequence) this.f2320a);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return this.f2320a.length();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$h */
    private static class h implements f {

        /* JADX INFO: renamed from: a */
        private final int f2321a;

        /* JADX INFO: renamed from: b */
        private final String[] f2322b;

        h(int i, String[] strArr) {
            this.f2321a = i;
            this.f2322b = strArr;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append((CharSequence) this.f2322b[calendar.get(this.f2321a)]);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            int length = this.f2322b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.f2322b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$i */
    private static class i {

        /* JADX INFO: renamed from: a */
        private final TimeZone f2323a;

        /* JADX INFO: renamed from: b */
        private final int f2324b;

        /* JADX INFO: renamed from: c */
        private final Locale f2325c;

        i(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.f2323a = timeZone;
            if (z) {
                this.f2324b = Integer.MIN_VALUE | i;
            } else {
                this.f2324b = i;
            }
            this.f2325c = C2420c.m6434a(locale);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f2323a.equals(iVar.f2323a) && this.f2324b == iVar.f2324b && this.f2325c.equals(iVar.f2325c);
        }

        public final int hashCode() {
            return this.f2323a.hashCode() + ((this.f2325c.hashCode() + (this.f2324b * 31)) * 31);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$j */
    private static class j implements f {

        /* JADX INFO: renamed from: a */
        private final Locale f2326a;

        /* JADX INFO: renamed from: b */
        private final int f2327b;

        /* JADX INFO: renamed from: c */
        private final String f2328c;

        /* JADX INFO: renamed from: d */
        private final String f2329d;

        j(TimeZone timeZone, Locale locale, int i) {
            this.f2326a = C2420c.m6434a(locale);
            this.f2327b = i;
            this.f2328c = C0962e.m2356h(timeZone, false, i, locale);
            this.f2329d = C0962e.m2356h(timeZone, true, i, locale);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            ((StringBuilder) appendable).append((CharSequence) C0962e.m2356h(calendar.getTimeZone(), calendar.get(16) != 0, this.f2327b, this.f2326a));
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return Math.max(this.f2328c.length(), this.f2329d.length());
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$k */
    private static class k implements f {

        /* JADX INFO: renamed from: b */
        static final k f2330b = new k(true);

        /* JADX INFO: renamed from: c */
        static final k f2331c = new k(false);

        /* JADX INFO: renamed from: a */
        final boolean f2332a;

        k(boolean z) {
            this.f2332a = z;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            int i = calendar.get(16) + calendar.get(15);
            if (i < 0) {
                ((StringBuilder) appendable).append('-');
                i = -i;
            } else {
                ((StringBuilder) appendable).append('+');
            }
            int i2 = i / 3600000;
            C0962e.m2353a(appendable, i2);
            if (this.f2332a) {
                ((StringBuilder) appendable).append(':');
            }
            C0962e.m2353a(appendable, (i / 60000) - (i2 * 60));
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return 5;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$l */
    private static class l implements d {

        /* JADX INFO: renamed from: a */
        private final d f2333a;

        l(d dVar) {
            this.f2333a = dVar;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.d
        /* JADX INFO: renamed from: a */
        public final void mo2364a(Appendable appendable, int i) {
            this.f2333a.mo2364a(appendable, i);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.f2333a.mo2364a(appendable, leastMaximum);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return this.f2333a.mo2363c();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$m */
    private static class m implements d {

        /* JADX INFO: renamed from: a */
        private final d f2334a;

        m(d dVar) {
            this.f2334a = dVar;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.d
        /* JADX INFO: renamed from: a */
        public final void mo2364a(Appendable appendable, int i) {
            this.f2334a.mo2364a(appendable, i);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.f2334a.mo2364a(appendable, maximum);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return this.f2334a.mo2363c();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$n */
    private static class n implements d {

        /* JADX INFO: renamed from: a */
        static final n f2335a = new n();

        n() {
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.d
        /* JADX INFO: renamed from: a */
        public final void mo2364a(Appendable appendable, int i) {
            C0962e.m2353a(appendable, i);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            C0962e.m2353a(appendable, calendar.get(2) + 1);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$o */
    private static class o implements d {

        /* JADX INFO: renamed from: a */
        private final int f2336a;

        o(int i) {
            this.f2336a = i;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.d
        /* JADX INFO: renamed from: a */
        public final void mo2364a(Appendable appendable, int i) {
            if (i < 100) {
                C0962e.m2353a(appendable, i);
            } else {
                C0962e.m2354b(appendable, i, 2);
            }
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            mo2364a(appendable, calendar.get(this.f2336a));
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$p */
    private static class p implements d {

        /* JADX INFO: renamed from: a */
        static final p f2337a = new p();

        p() {
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.d
        /* JADX INFO: renamed from: a */
        public final void mo2364a(Appendable appendable, int i) {
            C0962e.m2353a(appendable, i % 100);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            mo2364a(appendable, calendar.get(1) % 100);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$q */
    private static class q implements d {

        /* JADX INFO: renamed from: a */
        static final q f2338a = new q();

        q() {
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.d
        /* JADX INFO: renamed from: a */
        public final void mo2364a(Appendable appendable, int i) {
            if (i >= 10) {
                C0962e.m2353a(appendable, i);
            } else {
                ((StringBuilder) appendable).append((char) (i + 48));
            }
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            mo2364a(appendable, calendar.get(2) + 1);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$r */
    private static class r implements d {

        /* JADX INFO: renamed from: a */
        private final int f2339a;

        r(int i) {
            this.f2339a = i;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.d
        /* JADX INFO: renamed from: a */
        public final void mo2364a(Appendable appendable, int i) {
            if (i < 10) {
                ((StringBuilder) appendable).append((char) (i + 48));
            } else if (i < 100) {
                C0962e.m2353a(appendable, i);
            } else {
                C0962e.m2354b(appendable, i, 1);
            }
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            mo2364a(appendable, calendar.get(this.f2339a));
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return 4;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.C.e$s */
    private static class s implements d {

        /* JADX INFO: renamed from: a */
        private final d f2340a;

        s(d dVar) {
            this.f2340a = dVar;
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.d
        /* JADX INFO: renamed from: a */
        public final void mo2364a(Appendable appendable, int i) {
            this.f2340a.mo2364a(appendable, i);
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: b */
        public final void mo2362b(Appendable appendable, Calendar calendar) {
            this.f2340a.mo2364a(appendable, calendar.getWeekYear());
        }

        @Override // com.github.catvod.spider.support.p011C.C0962e.f
        /* JADX INFO: renamed from: c */
        public final int mo2363c() {
            return this.f2340a.mo2363c();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b8 A[FALL_THROUGH, PHI: r12
      0x01b8: PHI (r12v8 int) = (r12v7 int), (r12v9 int) binds: [B:50:0x00e8, B:101:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e9 A[PHI: r7
      0x01e9: PHI (r7v12 java.lang.Object) = (r7v29 java.lang.Object), (r7v30 java.lang.Object) binds: [B:113:0x01e1, B:68:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x0206 A[LOOP:2: B:118:0x0202->B:120:0x0206, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x016a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x0178  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a A[PHI: r14
      0x018a: PHI (r14v6 int) = (r14v5 int), (r14v7 int), (r14v8 int), (r14v9 int), (r14v10 int), (r14v11 int), (r14v13 int), (r14v14 int) binds: [B:48:0x00e4, B:62:0x0131, B:60:0x0126, B:57:0x010c, B:56:0x0108, B:54:0x00fa, B:83:0x0189, B:77:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0192  */
    /* JADX WARN: Code duplicated, block: B:88:0x0195  */
    /* JADX WARN: Code duplicated, block: B:90:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:0x019b  */
    /* JADX WARN: Code duplicated, block: B:92:0x019e  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b1  */
    protected C0962e(String str, TimeZone timeZone, Locale locale) {
        int length;
        int iMo2363c;
        String[] strArr;
        String string;
        int i2;
        int length2;
        char cCharAt;
        d dVarM2361i;
        Object sVar;
        Object hVar;
        Locale locale2;
        int i3;
        int i4;
        int i5;
        String strSubstring;
        String[] strArr2;
        this.f2307a = str;
        this.f2308b = timeZone;
        Locale localeM6434a = C2420c.m6434a(locale);
        this.f2309c = localeM6434a;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(localeM6434a);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length3 = str.length();
        int[] iArr = new int[1];
        char c2 = 0;
        int i6 = 0;
        while (i6 < length3) {
            iArr[c2] = i6;
            String str2 = this.f2307a;
            StringBuilder sb = new StringBuilder();
            int i7 = iArr[c2];
            int length4 = str2.length();
            char cCharAt2 = str2.charAt(i7);
            int i8 = length3;
            if ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < 'a' || cCharAt2 > 'z')) {
                char c3 = '\'';
                sb.append('\'');
                boolean z = false;
                while (true) {
                    if (i7 < length4) {
                        char cCharAt3 = str2.charAt(i7);
                        if (cCharAt3 == c3) {
                            int i9 = i7 + 1;
                            strArr = weekdays;
                            if (i9 >= length4 || str2.charAt(i9) != '\'') {
                                z = !z;
                            } else {
                                sb.append(cCharAt3);
                                i7 = i9;
                            }
                        } else {
                            strArr = weekdays;
                            if (z || ((cCharAt3 < 'A' || cCharAt3 > 'Z') && (cCharAt3 < 'a' || cCharAt3 > 'z'))) {
                                sb.append(cCharAt3);
                            } else {
                                i7--;
                            }
                        }
                        i7++;
                        c3 = '\'';
                        weekdays = strArr;
                    }
                    iArr[0] = i7;
                    string = sb.toString();
                    i2 = iArr[0];
                    length2 = string.length();
                    if (length2 == 0) {
                        f[] fVarArr = (f[]) arrayList.toArray(f2305f);
                        this.f2310d = fVarArr;
                        length = fVarArr.length;
                        iMo2363c = 0;
                        while (true) {
                            length--;
                            if (length < 0) {
                                this.f2311e = iMo2363c;
                                return;
                            }
                            iMo2363c += this.f2310d[length].mo2363c();
                        }
                    } else {
                        cCharAt = string.charAt(0);
                        if (cCharAt == 'y') {
                            if (length2 == 2) {
                                dVarM2361i = p.f2337a;
                            } else {
                                dVarM2361i = m2361i(1, Math.max(length2, 4));
                            }
                            hVar = dVarM2361i;
                            if (cCharAt == 'Y') {
                                sVar = new s(dVarM2361i);
                            } else {
                                sVar = hVar;
                            }
                        } else if (cCharAt != 'z') {
                            i4 = 11;
                            i5 = 10;
                            switch (cCharAt) {
                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    strSubstring = string.substring(1);
                                    if (strSubstring.length() == 1) {
                                        sVar = new g(strSubstring);
                                    } else {
                                        sVar = new a(strSubstring.charAt(0));
                                    }
                                    break;
                                case 'K':
                                    sVar = m2361i(i5, length2);
                                    break;
                                case 'M':
                                    if (length2 >= 4) {
                                        sVar = new h(2, months);
                                    } else if (length2 == 3) {
                                        hVar = new h(2, shortMonths);
                                        sVar = hVar;
                                    } else if (length2 == 2) {
                                        sVar = q.f2338a;
                                    } else {
                                        sVar = n.f2335a;
                                    }
                                    break;
                                case 'S':
                                    i5 = 14;
                                    sVar = m2361i(i5, length2);
                                    break;
                                case 'a':
                                    sVar = new h(9, amPmStrings);
                                    break;
                                case 'd':
                                    i5 = 5;
                                    sVar = m2361i(i5, length2);
                                    break;
                                case 'h':
                                    sVar = new l(m2361i(10, length2));
                                    break;
                                case 'k':
                                    sVar = new m(m2361i(11, length2));
                                    break;
                                case 'm':
                                    i5 = 12;
                                    sVar = m2361i(i5, length2);
                                    break;
                                case 's':
                                    i5 = 13;
                                    sVar = m2361i(i5, length2);
                                    break;
                                case 'u':
                                    sVar = new b(m2361i(7, length2));
                                    break;
                                case 'w':
                                    i5 = 3;
                                    sVar = m2361i(i5, length2);
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'D':
                                            i5 = 6;
                                            sVar = m2361i(i5, length2);
                                            break;
                                        case 'E':
                                            if (length2 < 4) {
                                                strArr2 = shortWeekdays;
                                            } else {
                                                strArr2 = strArr;
                                            }
                                            sVar = new h(7, strArr2);
                                            break;
                                        case 'F':
                                            i5 = 8;
                                            sVar = m2361i(i5, length2);
                                            break;
                                        case 'G':
                                            sVar = new h(0, eras);
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'W':
                                                    i4 = 4;
                                                    break;
                                                case 'X':
                                                    if (length2 != 1) {
                                                        sVar = c.f2314b;
                                                    } else if (length2 != 2) {
                                                        sVar = c.f2315c;
                                                    } else {
                                                        if (length2 == 3) {
                                                            throw new IllegalArgumentException("invalid number of X");
                                                        }
                                                        sVar = c.f2316d;
                                                    }
                                                    break;
                                                case 'Y':
                                                    if (length2 == 2) {
                                                        dVarM2361i = p.f2337a;
                                                    } else {
                                                        dVarM2361i = m2361i(1, Math.max(length2, 4));
                                                    }
                                                    hVar = dVarM2361i;
                                                    if (cCharAt == 'Y') {
                                                        sVar = hVar;
                                                    } else {
                                                        sVar = new s(dVarM2361i);
                                                    }
                                                    break;
                                                case 'Z':
                                                    if (length2 == 1) {
                                                        sVar = k.f2331c;
                                                    } else if (length2 == 2) {
                                                        sVar = k.f2330b;
                                                    } else {
                                                        sVar = c.f2316d;
                                                    }
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(C2139c.m5408a("Illegal pattern component: ", string));
                                            }
                                        case 'H':
                                            sVar = m2361i(i4, length2);
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            TimeZone timeZone2 = this.f2308b;
                            if (length2 >= 4) {
                                locale2 = this.f2309c;
                                i3 = 1;
                            } else {
                                locale2 = this.f2309c;
                                i3 = 0;
                            }
                            sVar = new j(timeZone2, locale2, i3);
                        }
                        arrayList.add(sVar);
                        i6 = i2 + 1;
                        c2 = 0;
                        length3 = i8;
                        weekdays = strArr;
                    }
                }
            } else {
                sb.append(cCharAt2);
                while (true) {
                    int i10 = i7 + 1;
                    if (i10 < length4 && str2.charAt(i10) == cCharAt2) {
                        sb.append(cCharAt2);
                        i7 = i10;
                    }
                }
            }
            strArr = weekdays;
            iArr[0] = i7;
            string = sb.toString();
            i2 = iArr[0];
            length2 = string.length();
            if (length2 == 0) {
                f[] fVarArr2 = (f[]) arrayList.toArray(f2305f);
                this.f2310d = fVarArr2;
                length = fVarArr2.length;
                iMo2363c = 0;
                while (true) {
                    length--;
                    if (length < 0) {
                        this.f2311e = iMo2363c;
                        return;
                    }
                    iMo2363c += this.f2310d[length].mo2363c();
                }
            } else {
                cCharAt = string.charAt(0);
                if (cCharAt == 'y') {
                    if (length2 == 2) {
                        dVarM2361i = p.f2337a;
                    } else {
                        dVarM2361i = m2361i(1, Math.max(length2, 4));
                    }
                    hVar = dVarM2361i;
                    if (cCharAt == 'Y') {
                        sVar = new s(dVarM2361i);
                    } else {
                        sVar = hVar;
                    }
                } else if (cCharAt != 'z') {
                    i4 = 11;
                    i5 = 10;
                    switch (cCharAt) {
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            strSubstring = string.substring(1);
                            if (strSubstring.length() == 1) {
                                sVar = new g(strSubstring);
                            } else {
                                sVar = new a(strSubstring.charAt(0));
                            }
                            break;
                        case 'K':
                            sVar = m2361i(i5, length2);
                            break;
                        case 'M':
                            if (length2 >= 4) {
                                sVar = new h(2, months);
                            } else if (length2 == 3) {
                                hVar = new h(2, shortMonths);
                                sVar = hVar;
                            } else if (length2 == 2) {
                                sVar = q.f2338a;
                            } else {
                                sVar = n.f2335a;
                            }
                            break;
                        case 'S':
                            i5 = 14;
                            sVar = m2361i(i5, length2);
                            break;
                        case 'a':
                            sVar = new h(9, amPmStrings);
                            break;
                        case 'd':
                            i5 = 5;
                            sVar = m2361i(i5, length2);
                            break;
                        case 'h':
                            sVar = new l(m2361i(10, length2));
                            break;
                        case 'k':
                            sVar = new m(m2361i(11, length2));
                            break;
                        case 'm':
                            i5 = 12;
                            sVar = m2361i(i5, length2);
                            break;
                        case 's':
                            i5 = 13;
                            sVar = m2361i(i5, length2);
                            break;
                        case 'u':
                            sVar = new b(m2361i(7, length2));
                            break;
                        case 'w':
                            i5 = 3;
                            sVar = m2361i(i5, length2);
                            break;
                        default:
                            switch (cCharAt) {
                                case 'D':
                                    i5 = 6;
                                    sVar = m2361i(i5, length2);
                                    break;
                                case 'E':
                                    if (length2 < 4) {
                                        strArr2 = shortWeekdays;
                                    } else {
                                        strArr2 = strArr;
                                    }
                                    sVar = new h(7, strArr2);
                                    break;
                                case 'F':
                                    i5 = 8;
                                    sVar = m2361i(i5, length2);
                                    break;
                                case 'G':
                                    sVar = new h(0, eras);
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'W':
                                            i4 = 4;
                                            break;
                                        case 'X':
                                            if (length2 != 1) {
                                                sVar = c.f2314b;
                                            } else if (length2 != 2) {
                                                sVar = c.f2315c;
                                            } else {
                                                if (length2 == 3) {
                                                    throw new IllegalArgumentException("invalid number of X");
                                                }
                                                sVar = c.f2316d;
                                            }
                                            break;
                                        case 'Y':
                                            if (length2 == 2) {
                                                dVarM2361i = p.f2337a;
                                            } else {
                                                dVarM2361i = m2361i(1, Math.max(length2, 4));
                                            }
                                            hVar = dVarM2361i;
                                            if (cCharAt == 'Y') {
                                                sVar = hVar;
                                            } else {
                                                sVar = new s(dVarM2361i);
                                            }
                                            break;
                                        case 'Z':
                                            if (length2 == 1) {
                                                sVar = k.f2331c;
                                            } else if (length2 == 2) {
                                                sVar = k.f2330b;
                                            } else {
                                                sVar = c.f2316d;
                                            }
                                            break;
                                        default:
                                            throw new IllegalArgumentException(C2139c.m5408a("Illegal pattern component: ", string));
                                    }
                                case 'H':
                                    sVar = m2361i(i4, length2);
                                    break;
                            }
                            break;
                    }
                } else {
                    TimeZone timeZone3 = this.f2308b;
                    if (length2 >= 4) {
                        locale2 = this.f2309c;
                        i3 = 1;
                    } else {
                        locale2 = this.f2309c;
                        i3 = 0;
                    }
                    sVar = new j(timeZone3, locale2, i3);
                }
                arrayList.add(sVar);
                i6 = i2 + 1;
                c2 = 0;
                length3 = i8;
                weekdays = strArr;
            }
        }
        f[] fVarArr3 = (f[]) arrayList.toArray(f2305f);
        this.f2310d = fVarArr3;
        length = fVarArr3.length;
        iMo2363c = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.f2311e = iMo2363c;
                return;
            }
            iMo2363c += this.f2310d[length].mo2363c();
        }
    }

    /* JADX INFO: renamed from: a */
    static void m2353a(Appendable appendable, int i2) {
        StringBuilder sb = (StringBuilder) appendable;
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
    }

    /* JADX INFO: renamed from: b */
    static void m2354b(Appendable appendable, int i2, int i3) {
        int i4;
        if (i2 < 10000) {
            if (i2 >= 1000) {
                i4 = 4;
            } else if (i2 < 100) {
                i4 = i2 < 10 ? 1 : 2;
            } else {
                i4 = 3;
            }
            for (int i5 = i3 - i4; i5 > 0; i5--) {
                ((StringBuilder) appendable).append('0');
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return;
                        }
                        ((StringBuilder) appendable).append((char) ((i2 / DescriptorProtos.Edition.EDITION_2023_VALUE) + 48));
                        i2 %= DescriptorProtos.Edition.EDITION_2023_VALUE;
                    }
                    if (i2 >= 100) {
                        ((StringBuilder) appendable).append((char) ((i2 / 100) + 48));
                        i2 %= 100;
                    } else {
                        ((StringBuilder) appendable).append('0');
                    }
                }
                if (i2 >= 10) {
                    ((StringBuilder) appendable).append((char) ((i2 / 10) + 48));
                    i2 %= 10;
                } else {
                    ((StringBuilder) appendable).append('0');
                }
            }
            ((StringBuilder) appendable).append((char) (i2 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i6 = 0;
        while (i2 != 0) {
            cArr[i6] = (char) ((i2 % 10) + 48);
            i2 /= 10;
            i6++;
        }
        while (i6 < i3) {
            ((StringBuilder) appendable).append('0');
            i3--;
        }
        while (true) {
            i6--;
            if (i6 < 0) {
                return;
            } else {
                ((StringBuilder) appendable).append(cArr[i6]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private String m2355c(Calendar calendar) throws IOException {
        StringBuilder sb = new StringBuilder(this.f2311e);
        try {
            for (f fVar : this.f2310d) {
                fVar.mo2362b(sb, calendar);
            }
            return sb.toString();
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<com.github.catvod.spider.support.C.e$i, java.lang.String>] */
    /* JADX INFO: renamed from: h */
    static String m2356h(TimeZone timeZone, boolean z, int i2, Locale locale) {
        i iVar = new i(timeZone, z, i2, locale);
        Object r1 = f2306g;
        String str = (String) r1.get(iVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i2, locale);
        String str2 = (String) r1.putIfAbsent(iVar, displayName);
        return str2 != null ? str2 : displayName;
    }

    /* JADX INFO: renamed from: d */
    final String m2357d(Object obj) throws IOException {
        if (obj instanceof Date) {
            Calendar calendar = Calendar.getInstance(this.f2308b, this.f2309c);
            calendar.setTime((Date) obj);
            return m2355c(calendar);
        }
        if (!(obj instanceof Calendar)) {
            if (!(obj instanceof Long)) {
                StringBuilder sbM5396a = C2137a.m5396a("Unknown class: ");
                sbM5396a.append(obj == null ? "<null>" : obj.getClass().getName());
                throw new IllegalArgumentException(sbM5396a.toString());
            }
            long jLongValue = ((Long) obj).longValue();
            Calendar calendar2 = Calendar.getInstance(this.f2308b, this.f2309c);
            calendar2.setTimeInMillis(jLongValue);
            return m2355c(calendar2);
        }
        Calendar calendar3 = (Calendar) obj;
        StringBuilder sb = new StringBuilder(this.f2311e);
        if (!calendar3.getTimeZone().equals(this.f2308b)) {
            calendar3 = (Calendar) calendar3.clone();
            calendar3.setTimeZone(this.f2308b);
        }
        try {
            for (f fVar : this.f2310d) {
                fVar.mo2362b(sb, calendar3);
            }
            return sb.toString();
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Locale m2358e() {
        return this.f2309c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0962e)) {
            return false;
        }
        C0962e c0962e = (C0962e) obj;
        return this.f2307a.equals(c0962e.f2307a) && this.f2308b.equals(c0962e.f2308b) && this.f2309c.equals(c0962e.f2309c);
    }

    /* JADX INFO: renamed from: f */
    public final String m2359f() {
        return this.f2307a;
    }

    /* JADX INFO: renamed from: g */
    public final TimeZone m2360g() {
        return this.f2308b;
    }

    public final int hashCode() {
        return (((this.f2309c.hashCode() * 13) + this.f2308b.hashCode()) * 13) + this.f2307a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    protected final d m2361i(int i2, int i3) {
        if (i3 != 1) {
            return i3 != 2 ? new e(i2, i3) : new o(i2);
        }
        return new r(i2);
    }

    public final String toString() {
        StringBuilder sbM5396a = C2137a.m5396a("FastDatePrinter[");
        sbM5396a.append(this.f2307a);
        sbM5396a.append(",");
        sbM5396a.append(this.f2309c);
        sbM5396a.append(",");
        sbM5396a.append(this.f2308b.getID());
        sbM5396a.append("]");
        return sbM5396a.toString();
    }
}
