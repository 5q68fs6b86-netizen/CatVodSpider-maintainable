package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p134t.AbstractC2324q;
import com.github.catvod.spider.support.p134t.C2325r;
import com.github.catvod.spider.support.p134t.InterfaceC2311d;
import com.github.catvod.spider.support.p136v.C2396b;
import com.github.catvod.spider.support.p136v.C2398d;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2391w extends AbstractC2373h {

    /* JADX INFO: renamed from: d */
    protected final AbstractC2324q f5903d;

    /* JADX INFO: renamed from: e */
    protected int f5904e;

    /* JADX INFO: renamed from: f */
    protected int f5905f;

    /* JADX INFO: renamed from: g */
    protected int f5906g;

    /* JADX INFO: renamed from: h */
    public final C2396b[] f5907h;

    /* JADX INFO: renamed from: i */
    protected int f5908i;

    /* JADX INFO: renamed from: j */
    protected final a f5909j;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.w$a */
    protected static class a {

        /* JADX INFO: renamed from: a */
        protected int f5910a = -1;

        /* JADX INFO: renamed from: b */
        protected int f5911b = 0;

        /* JADX INFO: renamed from: c */
        protected int f5912c = -1;

        /* JADX INFO: renamed from: d */
        protected C2398d f5913d;

        protected a() {
        }
    }

    public C2391w(AbstractC2324q abstractC2324q, C2359a c2359a, C2396b[] c2396bArr, C2352T c2352t) {
        super(c2359a, c2352t);
        this.f5904e = -1;
        this.f5905f = 1;
        this.f5906g = 0;
        this.f5908i = 0;
        this.f5909j = new a();
        this.f5907h = c2396bArr;
        this.f5903d = abstractC2324q;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2373h
    /* JADX INFO: renamed from: a */
    public final void mo6312a() {
        a aVar = this.f5909j;
        aVar.f5910a = -1;
        aVar.f5911b = 0;
        aVar.f5912c = -1;
        aVar.f5913d = null;
        this.f5904e = -1;
        this.f5905f = 1;
        this.f5906g = 0;
        this.f5908i = 0;
    }

    /* JADX INFO: renamed from: b */
    protected final void m6380b(C2398d c2398d, int i, C2398d c2398d2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c2398d) {
            if (c2398d.f5934c == null) {
                c2398d.f5934c = new C2398d[128];
            }
            c2398d.f5934c[i + 0] = c2398d2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.p136v.d, com.github.catvod.spider.support.p136v.d>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.p136v.d, com.github.catvod.spider.support.p136v.d>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.p136v.d, com.github.catvod.spider.support.p136v.d>] */
    /* JADX INFO: renamed from: c */
    protected final C2398d m6381c(C2363c c2363c) {
        C2361b next;
        C2398d c2398d = new C2398d(c2363c);
        Iterator<C2361b> it = c2363c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next.f5846a instanceof C2358Z));
        if (next != null) {
            c2398d.f5935d = true;
            c2398d.f5937f = ((C2390v) next).m6378e();
            c2398d.f5936e = this.f5881a.f5841g[next.f5846a.f5885c];
        }
        C2396b c2396b = this.f5907h[this.f5908i];
        synchronized (c2396b.f5925a) {
            C2398d c2398d2 = (C2398d) c2396b.f5925a.get(c2398d);
            if (c2398d2 != null) {
                return c2398d2;
            }
            c2398d.f5932a = c2396b.f5925a.size();
            c2363c.f5858a = true;
            c2363c.f5859b = null;
            c2398d.f5933b = c2363c;
            c2396b.f5925a.put(c2398d, c2398d);
            return c2398d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:85:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX INFO: renamed from: d */
    protected final boolean m6382d(InterfaceC2311d interfaceC2311d, C2390v c2390v, C2363c c2363c, boolean z, boolean z2, boolean z3) {
        C2390v c2390v2;
        C2390v c2390v3;
        AbstractC2375i abstractC2375i = c2390v.f5846a;
        boolean z4 = true;
        if (abstractC2375i instanceof C2358Z) {
            AbstractC2351S abstractC2351S = c2390v.f5848c;
            if (abstractC2351S == null || abstractC2351S.m6334e()) {
                AbstractC2351S abstractC2351S2 = c2390v.f5848c;
                if (abstractC2351S2 == null || abstractC2351S2.mo6335f()) {
                    c2363c.m6358a(c2390v, null);
                    return true;
                }
                c2363c.m6358a(new C2390v(c2390v, c2390v.f5846a, AbstractC2351S.f5827b), null);
            } else {
                z4 = z;
            }
            AbstractC2351S abstractC2351S3 = c2390v.f5848c;
            if (abstractC2351S3 == null || abstractC2351S3.mo6335f()) {
                return z4;
            }
            boolean zM6382d = z4;
            for (int i = 0; i < c2390v.f5848c.mo6336h(); i++) {
                if (c2390v.f5848c.mo6333d(i) != Integer.MAX_VALUE) {
                    zM6382d = m6382d(interfaceC2311d, new C2390v(c2390v, (AbstractC2375i) this.f5881a.f5835a.get(c2390v.f5848c.mo6333d(i)), c2390v.f5848c.mo6332c(i)), c2363c, zM6382d, z2, z3);
                }
            }
            return zM6382d;
        }
        if (!abstractC2375i.f5886d && (!z || !c2390v.m6379f())) {
            c2363c.m6358a(c2390v, null);
        }
        AbstractC2375i abstractC2375i2 = c2390v.f5846a;
        boolean zM6382d2 = z;
        for (int i2 = 0; i2 < abstractC2375i2.m6373b(); i2++) {
            AbstractC2376i0 abstractC2376i0M6374d = abstractC2375i2.m6374d(i2);
            int iMo6309a = abstractC2376i0M6374d.mo6309a();
            if (iMo6309a == 10) {
                throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
            }
            switch (iMo6309a) {
                case 1:
                    c2390v3 = new C2390v(c2390v, abstractC2376i0M6374d.f5889a);
                    c2390v2 = c2390v3;
                    if (c2390v2 != null) {
                        zM6382d2 = m6382d(interfaceC2311d, c2390v2, c2363c, zM6382d2, z2, z3);
                    }
                    break;
                case 2:
                case 5:
                case 7:
                    if (z3 && abstractC2376i0M6374d.mo6310d(-1, 1114111)) {
                        c2390v3 = new C2390v(c2390v, abstractC2376i0M6374d.f5889a);
                        c2390v2 = c2390v3;
                    } else {
                        c2390v2 = null;
                    }
                    if (c2390v2 != null) {
                        zM6382d2 = m6382d(interfaceC2311d, c2390v2, c2363c, zM6382d2, z2, z3);
                    }
                    break;
                case 3:
                    c2390v2 = new C2390v(c2390v, abstractC2376i0M6374d.f5889a, C2366d0.m6364i(c2390v.f5848c, ((C2360a0) abstractC2376i0M6374d).f5845c.f5884b));
                    if (c2390v2 != null) {
                        zM6382d2 = m6382d(interfaceC2311d, c2390v2, c2363c, zM6382d2, z2, z3);
                    }
                    break;
                case 4:
                    c2363c.f5863f = true;
                    if (this.f5903d != null && z2) {
                        int i3 = this.f5906g;
                        int i4 = this.f5905f;
                        int iMo6234h = interfaceC2311d.mo6234h();
                        interfaceC2311d.mo6231c();
                        try {
                            m6383e(interfaceC2311d);
                            this.f5903d.getClass();
                            this.f5906g = i3;
                            this.f5905f = i4;
                            interfaceC2311d.mo6232e(iMo6234h);
                            interfaceC2311d.release();
                        } catch (Throwable th) {
                            this.f5906g = i3;
                            this.f5905f = i4;
                            interfaceC2311d.mo6232e(iMo6234h);
                            interfaceC2311d.release();
                            throw th;
                        }
                    }
                    c2390v3 = new C2390v(c2390v, abstractC2376i0M6374d.f5889a);
                    c2390v2 = c2390v3;
                    if (c2390v2 != null) {
                        zM6382d2 = m6382d(interfaceC2311d, c2390v2, c2363c, zM6382d2, z2, z3);
                    }
                    break;
                case 6:
                    AbstractC2351S abstractC2351S4 = c2390v.f5848c;
                    if (abstractC2351S4 == null || abstractC2351S4.m6334e()) {
                        c2390v2 = new C2390v(c2390v, abstractC2376i0M6374d.f5889a, C2393y.m6389a(c2390v.m6378e(), this.f5881a.f5842h[((C2379k) abstractC2376i0M6374d).f5891c]));
                    } else {
                        c2390v3 = new C2390v(c2390v, abstractC2376i0M6374d.f5889a);
                        c2390v2 = c2390v3;
                    }
                    if (c2390v2 != null) {
                        zM6382d2 = m6382d(interfaceC2311d, c2390v2, c2363c, zM6382d2, z2, z3);
                    }
                    break;
                default:
                    c2390v2 = null;
                    if (c2390v2 != null) {
                        zM6382d2 = m6382d(interfaceC2311d, c2390v2, c2363c, zM6382d2, z2, z3);
                    }
                    break;
            }
        }
        return zM6382d2;
    }

    /* JADX INFO: renamed from: e */
    public final void m6383e(InterfaceC2311d interfaceC2311d) {
        if (interfaceC2311d.mo6233g(1) == 10) {
            this.f5905f++;
            this.f5906g = 0;
        } else {
            this.f5906g++;
        }
        interfaceC2311d.mo6235i();
    }

    /* JADX INFO: renamed from: f */
    protected final int m6384f(InterfaceC2311d interfaceC2311d, C2398d c2398d) throws Throwable {
        AbstractC2324q abstractC2324q;
        int i;
        C2361b c2361b;
        if (c2398d.f5935d) {
            a aVar = this.f5909j;
            aVar.f5910a = interfaceC2311d.mo6234h();
            aVar.f5911b = this.f5905f;
            aVar.f5912c = this.f5906g;
            aVar.f5913d = c2398d;
        }
        C2398d c2398d2 = c2398d;
        int iMo6233g = interfaceC2311d.mo6233g(1);
        while (true) {
            C2398d[] c2398dArr = c2398d2.f5934c;
            C2398d c2398d3 = (c2398dArr == null || iMo6233g < 0 || iMo6233g > 127) ? null : c2398dArr[iMo6233g + 0];
            int i2 = -1;
            if (c2398d3 == null) {
                C2345L c2345l = new C2345L();
                int i3 = 0;
                for (C2361b c2361b2 : c2398d2.f5933b) {
                    boolean z = c2361b2.f5847b == i3;
                    if (z && ((C2390v) c2361b2).m6379f()) {
                        i3 = i3;
                        break;
                        break;
                    }
                    int iM6373b = c2361b2.f5846a.m6373b();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= iM6373b) {
                            i3 = i3;
                            break;
                        }
                        AbstractC2376i0 abstractC2376i0M6374d = c2361b2.f5846a.m6374d(i4);
                        AbstractC2375i abstractC2375i = abstractC2376i0M6374d.mo6310d(iMo6233g, 1114111) ? abstractC2376i0M6374d.f5889a : null;
                        if (abstractC2375i != null) {
                            C2390v c2390v = (C2390v) c2361b2;
                            C2393y c2393yM6378e = c2390v.m6378e();
                            if (c2393yM6378e != null) {
                                c2393yM6378e = c2393yM6378e.m6391c(interfaceC2311d.mo6234h() - this.f5904e);
                            }
                            boolean z2 = iMo6233g == i2;
                            c2361b = c2361b2;
                            i = iM6373b;
                            if (m6382d(interfaceC2311d, new C2390v(c2390v, abstractC2375i, c2393yM6378e), c2345l, z, true, z2)) {
                                i3 = c2361b.f5847b;
                                break;
                            }
                        } else {
                            i = iM6373b;
                            c2361b = c2361b2;
                        }
                        i4++;
                        c2361b2 = c2361b;
                        i3 = i3;
                        iM6373b = i;
                        i2 = -1;
                    }
                    i2 = -1;
                }
                if (c2345l.isEmpty()) {
                    if (!c2345l.f5863f) {
                        m6380b(c2398d2, iMo6233g, AbstractC2373h.f5880c);
                    }
                    c2398d3 = AbstractC2373h.f5880c;
                    c2398d2 = c2398d3;
                } else {
                    boolean z3 = c2345l.f5863f;
                    c2345l.f5863f = false;
                    C2398d c2398dM6381c = m6381c(c2345l);
                    if (!z3) {
                        m6380b(c2398d2, iMo6233g, c2398dM6381c);
                    }
                    c2398d2 = c2398dM6381c;
                }
            } else {
                c2398d2 = c2398d3;
            }
            if (c2398d2 == AbstractC2373h.f5880c) {
                break;
            }
            if (iMo6233g != -1) {
                m6383e(interfaceC2311d);
            }
            if (c2398d2.f5935d) {
                a aVar2 = this.f5909j;
                aVar2.f5910a = interfaceC2311d.mo6234h();
                aVar2.f5911b = this.f5905f;
                aVar2.f5912c = this.f5906g;
                aVar2.f5913d = c2398d2;
                if (iMo6233g == -1) {
                    break;
                }
            }
            iMo6233g = interfaceC2311d.mo6233g(1);
        }
        a aVar3 = this.f5909j;
        C2398d c2398d4 = aVar3.f5913d;
        if (c2398d4 == null) {
            if (iMo6233g == -1 && interfaceC2311d.mo6234h() == this.f5904e) {
                return -1;
            }
            throw new C2325r(this.f5903d, interfaceC2311d, this.f5904e);
        }
        C2393y c2393y = c2398d4.f5937f;
        int i5 = this.f5904e;
        int i6 = aVar3.f5910a;
        int i7 = aVar3.f5911b;
        int i8 = aVar3.f5912c;
        interfaceC2311d.mo6232e(i6);
        this.f5905f = i7;
        this.f5906g = i8;
        if (c2393y != null && (abstractC2324q = this.f5903d) != null) {
            c2393y.m6390b(abstractC2324q, interfaceC2311d, i5);
        }
        return aVar3.f5913d.f5936e;
    }

    /* JADX INFO: renamed from: g */
    public final int m6385g() {
        return this.f5906g;
    }

    /* JADX INFO: renamed from: h */
    public final int m6386h() {
        return this.f5905f;
    }

    /* JADX INFO: renamed from: i */
    public final int m6387i(InterfaceC2311d interfaceC2311d, int i) {
        this.f5908i = i;
        interfaceC2311d.mo6231c();
        try {
            this.f5904e = interfaceC2311d.mo6234h();
            a aVar = this.f5909j;
            aVar.f5910a = -1;
            aVar.f5911b = 0;
            aVar.f5912c = -1;
            aVar.f5913d = null;
            C2396b c2396b = this.f5907h[i];
            return c2396b.f5926b == null ? m6388j(interfaceC2311d) : m6384f(interfaceC2311d, c2396b.f5926b);
        } finally {
            interfaceC2311d.release();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.h0>] */
    /* JADX INFO: renamed from: j */
    protected final int m6388j(InterfaceC2311d interfaceC2311d) {
        AbstractC2375i abstractC2375i = (AbstractC2375i) this.f5881a.f5843i.get(this.f5908i);
        C2387s c2387s = AbstractC2351S.f5827b;
        C2345L c2345l = new C2345L();
        int i = 0;
        while (i < abstractC2375i.m6373b()) {
            int i2 = i + 1;
            m6382d(interfaceC2311d, new C2390v(abstractC2375i.m6374d(i).f5889a, i2, c2387s), c2345l, false, false, false);
            i = i2;
        }
        boolean z = c2345l.f5863f;
        c2345l.f5863f = false;
        C2398d c2398dM6381c = m6381c(c2345l);
        if (!z) {
            this.f5907h[this.f5908i].f5926b = c2398dM6381c;
        }
        return m6384f(interfaceC2311d, c2398dM6381c);
    }
}
