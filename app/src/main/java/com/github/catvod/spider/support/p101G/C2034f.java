package com.github.catvod.spider.support.p101G;

import com.github.catvod.spider.support.p042E.C1270b;
import com.github.catvod.spider.support.p102H.C2046b;
import com.github.catvod.spider.support.p102H.C2050f;
import com.github.catvod.spider.support.p102H.C2051g;
import com.github.catvod.spider.support.p102H.C2052h;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.G.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2034f extends C2037i {

    /* JADX INFO: renamed from: j */
    private a f4615j;

    /* JADX INFO: renamed from: k */
    private C2051g f4616k;

    /* JADX INFO: renamed from: l */
    private int f4617l;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.G.f$a */
    public static class a implements Cloneable {

        /* JADX INFO: renamed from: d */
        @Nullable
        int f4621d;

        /* JADX INFO: renamed from: a */
        private C2038j.a f4618a = C2038j.a.base;

        /* JADX INFO: renamed from: b */
        private Charset f4619b = C1270b.f2981a;

        /* JADX INFO: renamed from: c */
        private final ThreadLocal<CharsetEncoder> f4620c = new ThreadLocal<>();

        /* JADX INFO: renamed from: e */
        private boolean f4622e = true;

        /* JADX INFO: renamed from: f */
        private int f4623f = 1;

        /* JADX INFO: renamed from: g */
        private int f4624g = 30;

        /* JADX INFO: renamed from: h */
        private int f4625h = 1;

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            try {
                a aVar = (a) super.clone();
                String strName = this.f4619b.name();
                aVar.getClass();
                aVar.f4619b = Charset.forName(strName);
                aVar.f4618a = C2038j.a.valueOf(this.f4618a.name());
                return aVar;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: renamed from: b */
        final CharsetEncoder m4849b() {
            CharsetEncoder charsetEncoder = this.f4620c.get();
            return charsetEncoder != null ? charsetEncoder : m4853f();
        }

        /* JADX INFO: renamed from: c */
        public final C2038j.a m4850c() {
            return this.f4618a;
        }

        /* JADX INFO: renamed from: d */
        public final int m4851d() {
            return this.f4623f;
        }

        /* JADX INFO: renamed from: e */
        public final int m4852e() {
            return this.f4624g;
        }

        /* JADX INFO: renamed from: f */
        final CharsetEncoder m4853f() {
            int i;
            CharsetEncoder charsetEncoderNewEncoder = this.f4619b.newEncoder();
            this.f4620c.set(charsetEncoderNewEncoder);
            String strName = charsetEncoderNewEncoder.charset().name();
            if (strName.equals("US-ASCII")) {
                i = 1;
            } else {
                i = strName.startsWith("UTF-") ? 2 : 3;
            }
            this.f4621d = i;
            return charsetEncoderNewEncoder;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m4854g() {
            return this.f4622e;
        }

        /* JADX INFO: renamed from: h */
        public final int m4855h() {
            return this.f4625h;
        }
    }

    public C2034f(String str) {
        super(C2052h.m5079m("#root", C2050f.f4752c), str, null);
        this.f4615j = new a();
        this.f4617l = 1;
        this.f4616k = new C2051g(new C2046b());
    }

    /* JADX INFO: renamed from: A0 */
    public final C2051g m4837A0() {
        return this.f4616k;
    }

    /* JADX INFO: renamed from: B0 */
    public final C2034f m4838B0() {
        this.f4617l = 2;
        return this;
    }

    /* JADX INFO: renamed from: C0 */
    public final int m4839C0() {
        return this.f4617l;
    }

    /* JADX INFO: renamed from: D0 */
    public final C2034f m4840D0() {
        C2034f c2034f = new C2034f(mo4885f());
        C2030b c2030b = this.f4632g;
        if (c2030b != null) {
            c2034f.f4632g = c2030b.clone();
        }
        c2034f.f4615j = this.f4615j.clone();
        return c2034f;
    }

    @Override // com.github.catvod.spider.support.p101G.C2037i
    /* JADX INFO: renamed from: s0 */
    public final C2037i mo4842s0(String str) {
        m4844w0().mo4842s0(str);
        return this;
    }

    @Override // com.github.catvod.spider.support.p101G.C2037i, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: t */
    public final String mo4832t() {
        return "#document";
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: u */
    public final String mo4843u() {
        return m4881b0();
    }

    /* JADX INFO: renamed from: w0 */
    public final C2037i m4844w0() {
        C2037i c2037iM4871O;
        Iterator<C2037i> it = m4875U().iterator();
        do {
            if (!it.hasNext()) {
                c2037iM4871O = m4871O("html");
                break;
            }
            c2037iM4871O = it.next();
        } while (!c2037iM4871O.m4888h0().equals("html"));
        for (C2037i c2037i : c2037iM4871O.m4875U()) {
            if ("body".equals(c2037i.m4888h0()) || "frameset".equals(c2037i.m4888h0())) {
                return c2037i;
            }
        }
        return c2037iM4871O.m4871O("body");
    }

    @Override // com.github.catvod.spider.support.p101G.C2037i, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final C2034f clone() {
        C2034f c2034f = (C2034f) super.clone();
        c2034f.f4615j = this.f4615j.clone();
        return c2034f;
    }

    /* JADX INFO: renamed from: y0 */
    public final a m4846y0() {
        return this.f4615j;
    }

    /* JADX INFO: renamed from: z0 */
    public final C2034f m4847z0(C2051g c2051g) {
        this.f4616k = c2051g;
        return this;
    }
}
