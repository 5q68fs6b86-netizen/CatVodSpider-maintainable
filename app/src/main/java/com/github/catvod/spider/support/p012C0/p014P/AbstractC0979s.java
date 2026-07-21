package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.p012C0.p014P.E;
import com.github.catvod.spider.support.p012C0.p014P.F;
import com.github.catvod.spider.support.p012C0.p015Q.C0986B;
import com.github.catvod.spider.support.p012C0.p017S.C1001h;
import com.github.catvod.spider.support.p012C0.p017S.C1002i;
import com.github.catvod.spider.support.p012C0.p017S.C1004l;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p014P.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0979s extends AbstractC0967B<Integer, C0986B> implements F {

    /* JADX INFO: renamed from: d */
    public InterfaceC0972d f2367d;

    /* JADX INFO: renamed from: e */
    protected C1004l<F, InterfaceC0972d> f2368e;

    /* JADX INFO: renamed from: g */
    public InterfaceC0969D f2370g;

    /* JADX INFO: renamed from: i */
    public int f2372i;

    /* JADX INFO: renamed from: j */
    public int f2373j;

    /* JADX INFO: renamed from: k */
    public boolean f2374k;

    /* JADX INFO: renamed from: l */
    public int f2375l;

    /* JADX INFO: renamed from: m */
    public int f2376m;

    /* JADX INFO: renamed from: f */
    protected E<?> f2369f = C0976l.f2366a;

    /* JADX INFO: renamed from: h */
    public int f2371h = -1;

    /* JADX INFO: renamed from: n */
    public final C1001h f2377n = new C1001h();

    /* JADX INFO: renamed from: o */
    public int f2378o = 0;

    public AbstractC0979s(InterfaceC0972d interfaceC0972d) {
        this.f2367d = interfaceC0972d;
        this.f2368e = new C1004l<>(this, interfaceC0972d);
    }

    /* JADX INFO: renamed from: a */
    public final int m2429a() {
        return ((C0986B) this.f2350b).m2469g();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0972d m2430b() {
        return this.f2367d;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [com.github.catvod.spider.support.p012C0.p014P.E<?>, com.github.catvod.spider.support.p012C0.p014P.l] */
    /* JADX INFO: renamed from: c */
    public final InterfaceC0969D m2431c() {
        int iM2471i;
        InterfaceC0972d interfaceC0972d = this.f2367d;
        if (interfaceC0972d == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        interfaceC0972d.mo2421g();
        loop0: while (true) {
            try {
                if (this.f2374k) {
                    m2434l();
                    break;
                }
                this.f2370g = null;
                this.f2375l = 0;
                this.f2371h = this.f2367d.mo2422i();
                this.f2373j = ((C0986B) this.f2350b).m2469g();
                this.f2372i = ((C0986B) this.f2350b).m2470h();
                while (true) {
                    this.f2376m = 0;
                    try {
                        iM2471i = ((C0986B) this.f2350b).m2471i(this.f2367d, this.f2378o);
                    } catch (C0980t e) {
                        m2435m(e);
                        if (this.f2367d.m2428f(1) != -1) {
                            ((C0986B) this.f2350b).m2467e(this.f2367d);
                        }
                        iM2471i = -3;
                    }
                    if (this.f2367d.m2428f(1) == -1) {
                        this.f2374k = true;
                    }
                    if (this.f2376m == 0) {
                        this.f2376m = iM2471i;
                    }
                    int i = this.f2376m;
                    if (i != -3) {
                        if (i != -2) {
                            if (this.f2370g != null) {
                                break loop0;
                            }
                            this.f2370g = this.f2369f.m2424a(this.f2368e, i, null, this.f2375l, this.f2371h, this.f2367d.mo2422i() - 1, this.f2372i, this.f2373j);
                            break loop0;
                        }
                    }
                }
            } catch (Throwable th) {
                this.f2367d.mo2419a();
                throw th;
            }
        }
        InterfaceC0969D interfaceC0969D = this.f2370g;
        this.f2367d.mo2419a();
        return interfaceC0969D;
    }

    /* JADX INFO: renamed from: d */
    public final int m2432d() {
        return ((C0986B) this.f2350b).m2470h();
    }

    /* JADX INFO: renamed from: e */
    public final E<? extends InterfaceC0969D> m2433e() {
        return this.f2369f;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.github.catvod.spider.support.p012C0.p014P.E<?>, com.github.catvod.spider.support.p012C0.p014P.l] */
    /* JADX INFO: renamed from: l */
    public final InterfaceC0969D m2434l() {
        InterfaceC0969D interfaceC0969DM2424a = this.f2369f.m2424a(this.f2368e, -1, null, 0, this.f2367d.mo2422i(), this.f2367d.mo2422i() - 1, ((C0986B) this.f2350b).m2470h(), ((C0986B) this.f2350b).m2469g());
        this.f2370g = interfaceC0969DM2424a;
        return interfaceC0969DM2424a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m2435m(C0980t c0980t) {
        InterfaceC0972d interfaceC0972d = this.f2367d;
        String strM2404h = interfaceC0972d.m2404h(C1002i.m2518b(this.f2371h, interfaceC0972d.mo2422i()));
        StringBuilder sbM2774b = C1064d.m2774b("token recognition error at: '");
        StringBuilder sb = new StringBuilder();
        for (char c : strM2404h.toCharArray()) {
            String strValueOf = String.valueOf(c);
            if (c == -1) {
                strValueOf = "<EOF>";
            } else if (c == 13) {
                strValueOf = "\\r";
            } else if (c == 9) {
                strValueOf = "\\t";
            } else if (c == 10) {
                strValueOf = "\\n";
            }
            sb.append(strValueOf);
        }
        sbM2774b.append(sb.toString());
        sbM2774b.append("'");
        ((C0984y) m2384g()).m2454a(this, null, this.f2372i, this.f2373j, sbM2774b.toString(), c0980t);
    }
}
