package com.github.catvod.spider.support.p102H;

import com.base.model.proto.DramaDetailProto;
import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p043F.C1274b;
import com.github.catvod.spider.support.p101G.C2029a;
import com.github.catvod.spider.support.p101G.C2030b;
import com.github.catvod.spider.support.p101G.C2035g;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p101G.C2039k;
import com.github.catvod.spider.support.p134t.C2314g;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c */
/* JADX INFO: loaded from: classes.dex */
abstract class EnumC2047c {

    /* JADX INFO: renamed from: a */
    public static final k f4685a;

    /* JADX INFO: renamed from: b */
    public static final q f4686b;

    /* JADX INFO: renamed from: c */
    public static final r f4687c;

    /* JADX INFO: renamed from: d */
    public static final s f4688d;

    /* JADX INFO: renamed from: e */
    public static final t f4689e;

    /* JADX INFO: renamed from: f */
    public static final u f4690f;

    /* JADX INFO: renamed from: g */
    public static final v f4691g;

    /* JADX INFO: renamed from: h */
    public static final w f4692h;

    /* JADX INFO: renamed from: i */
    public static final x f4693i;

    /* JADX INFO: renamed from: j */
    public static final a f4694j;

    /* JADX INFO: renamed from: k */
    public static final b f4695k;

    /* JADX INFO: renamed from: l */
    public static final c f4696l;

    /* JADX INFO: renamed from: m */
    public static final d f4697m;

    /* JADX INFO: renamed from: n */
    public static final e f4698n;

    /* JADX INFO: renamed from: o */
    public static final f f4699o;

    /* JADX INFO: renamed from: p */
    public static final g f4700p;

    /* JADX INFO: renamed from: q */
    public static final h f4701q;

    /* JADX INFO: renamed from: r */
    public static final i f4702r;

    /* JADX INFO: renamed from: s */
    public static final j f4703s;

    /* JADX INFO: renamed from: t */
    public static final l f4704t;

    /* JADX INFO: renamed from: u */
    public static final m f4705u;

    /* JADX INFO: renamed from: v */
    public static final n f4706v;

    /* JADX INFO: renamed from: w */
    public static final o f4707w;

    /* JADX INFO: renamed from: x */
    public static final p f4708x;

    /* JADX INFO: renamed from: y */
    private static final String f4709y;

    /* JADX INFO: renamed from: z */
    private static final /* synthetic */ EnumC2047c[] f4710z;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$a */
    static final class a extends EnumC2047c {
        a() {
            super("InTableText", 9, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            EnumC2047c enumC2047c = EnumC2047c.f4691g;
            if (abstractC2053i.f4774a == 5) {
                AbstractC2053i.b bVar = (AbstractC2053i.b) abstractC2053i;
                if (bVar.m5102l().equals(EnumC2047c.f4709y)) {
                    c2046b.m5046r(this);
                    return false;
                }
                ((ArrayList) c2046b.m4996A()).add(bVar.m5102l());
                return true;
            }
            if (((ArrayList) c2046b.m4996A()).size() > 0) {
                for (String str : (ArrayList) c2046b.m4996A()) {
                    if (C1274b.m3173d(str)) {
                        AbstractC2053i.b bVar2 = new AbstractC2053i.b();
                        bVar2.m5101k(str);
                        c2046b.m5003I(bVar2);
                    } else {
                        c2046b.m5046r(this);
                        if (C1274b.m3172c(c2046b.m5168a().m4888h0(), y.f4711A)) {
                            c2046b.m5041o0(true);
                            AbstractC2053i.b bVar3 = new AbstractC2053i.b();
                            bVar3.m5101k(str);
                            c2046b.m5024d0(bVar3, enumC2047c);
                            c2046b.m5041o0(false);
                        } else {
                            AbstractC2053i.b bVar4 = new AbstractC2053i.b();
                            bVar4.m5101k(str);
                            c2046b.m5024d0(bVar4, enumC2047c);
                        }
                    }
                }
                c2046b.m5014U();
            }
            c2046b.m5049s0(c2046b.m5017Y());
            return c2046b.mo5025e(abstractC2053i);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$b */
    static final class b extends EnumC2047c {
        b() {
            super("InCaption", 10, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            if (abstractC2053i.m5097f()) {
                AbstractC2053i.f fVar = (AbstractC2053i.f) abstractC2053i;
                if (fVar.f4786e.equals("caption")) {
                    if (!c2046b.m5001G(fVar.f4786e)) {
                        c2046b.m5046r(this);
                        return false;
                    }
                    c2046b.m5052v(false);
                    if (!c2046b.m5169b("caption")) {
                        c2046b.m5046r(this);
                    }
                    c2046b.m5019a0("caption");
                    c2046b.m5035l();
                    c2046b.m5049s0(EnumC2047c.f4693i);
                    return true;
                }
            }
            if ((abstractC2053i.m5098g() && C1274b.m3172c(((AbstractC2053i.g) abstractC2053i).f4786e, y.f4747y)) || (abstractC2053i.m5097f() && ((AbstractC2053i.f) abstractC2053i).f4786e.equals("table"))) {
                c2046b.m5046r(this);
                if (c2046b.m5170f("caption")) {
                    return c2046b.mo5025e(abstractC2053i);
                }
                return true;
            }
            if (!abstractC2053i.m5097f() || !C1274b.m3172c(((AbstractC2053i.f) abstractC2053i).f4786e, y.f4720J)) {
                return c2046b.m5024d0(abstractC2053i, EnumC2047c.f4691g);
            }
            c2046b.m5046r(this);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$c */
    static final class c extends EnumC2047c {
        c() {
            super("InColumnGroup", 11, null);
        }

        /* JADX INFO: renamed from: e */
        private boolean m5061e(AbstractC2053i abstractC2053i, C2046b c2046b) {
            if (!c2046b.m5169b("colgroup")) {
                c2046b.m5046r(this);
                return false;
            }
            c2046b.m5018Z();
            c2046b.m5049s0(EnumC2047c.f4693i);
            c2046b.mo5025e(abstractC2053i);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x006d  */
        /* JADX WARN: Code duplicated, block: B:41:0x008c  */
        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            s sVar = EnumC2047c.f4688d;
            if (EnumC2047c.m5057a(abstractC2053i)) {
                c2046b.m5003I((AbstractC2053i.b) abstractC2053i);
                return true;
            }
            int iM6255a = C2314g.m6255a(abstractC2053i.f4774a);
            if (iM6255a != 0) {
                byte b = 0;
                if (iM6255a == 1) {
                    AbstractC2053i.g gVar = (AbstractC2053i.g) abstractC2053i;
                    String str = gVar.f4786e;
                    str.getClass();
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1321546630) {
                        if (iHashCode != 98688) {
                            if (iHashCode == 3213227 && str.equals("html")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str.equals("col")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (!str.equals("template")) {
                        b = -1;
                    }
                    if (b == 0) {
                        c2046b.m5024d0(abstractC2053i, sVar);
                    } else {
                        if (b != 1) {
                            return b != 2 ? m5061e(abstractC2053i, c2046b) : c2046b.m5024d0(abstractC2053i, EnumC2047c.f4691g);
                        }
                        c2046b.m5005K(gVar);
                    }
                } else if (iM6255a == 2) {
                    String str2 = ((AbstractC2053i.f) abstractC2053i).f4786e;
                    str2.getClass();
                    if (str2.equals("template")) {
                        c2046b.m5024d0(abstractC2053i, sVar);
                    } else {
                        if (!str2.equals("colgroup")) {
                            return m5061e(abstractC2053i, c2046b);
                        }
                        if (!c2046b.m5169b(str2)) {
                            c2046b.m5046r(this);
                            return false;
                        }
                        c2046b.m5018Z();
                        c2046b.m5049s0(EnumC2047c.f4693i);
                    }
                } else {
                    if (iM6255a != 3) {
                        if (iM6255a == 5 && c2046b.m5169b("html")) {
                            return true;
                        }
                        return m5061e(abstractC2053i, c2046b);
                    }
                    c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
                }
            } else {
                c2046b.m5046r(this);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$d */
    static final class d extends EnumC2047c {
        d() {
            super("InTableBody", 12, null);
        }

        /* JADX INFO: renamed from: e */
        private boolean m5062e(AbstractC2053i abstractC2053i, C2046b c2046b) {
            if (!c2046b.m5001G("tbody") && !c2046b.m5001G("thead") && !c2046b.m4998C("tfoot", null)) {
                c2046b.m5046r(this);
                return false;
            }
            c2046b.m5038n();
            c2046b.m5170f(c2046b.m5168a().m4888h0());
            return c2046b.mo5025e(abstractC2053i);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            EnumC2047c enumC2047c = EnumC2047c.f4693i;
            int iM6255a = C2314g.m6255a(abstractC2053i.f4774a);
            if (iM6255a == 1) {
                AbstractC2053i.g gVar = (AbstractC2053i.g) abstractC2053i;
                String str = gVar.f4786e;
                if (!str.equals("tr")) {
                    if (!C1274b.m3172c(str, y.f4744v)) {
                        return C1274b.m3172c(str, y.f4712B) ? m5062e(abstractC2053i, c2046b) : c2046b.m5024d0(abstractC2053i, enumC2047c);
                    }
                    c2046b.m5046r(this);
                    c2046b.m5172h("tr");
                    return c2046b.mo5025e(gVar);
                }
                c2046b.m5038n();
                c2046b.m5002H(gVar);
                c2046b.m5049s0(EnumC2047c.f4698n);
            } else {
                if (iM6255a != 2) {
                    return c2046b.m5024d0(abstractC2053i, enumC2047c);
                }
                String str2 = ((AbstractC2053i.f) abstractC2053i).f4786e;
                if (!C1274b.m3172c(str2, y.f4718H)) {
                    if (str2.equals("table")) {
                        return m5062e(abstractC2053i, c2046b);
                    }
                    if (!C1274b.m3172c(str2, y.f4713C)) {
                        return c2046b.m5024d0(abstractC2053i, enumC2047c);
                    }
                    c2046b.m5046r(this);
                    return false;
                }
                if (!c2046b.m5001G(str2)) {
                    c2046b.m5046r(this);
                    return false;
                }
                c2046b.m5038n();
                c2046b.m5018Z();
                c2046b.m5049s0(enumC2047c);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$e */
    static final class e extends EnumC2047c {
        e() {
            super("InRow", 13, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            d dVar = EnumC2047c.f4697m;
            x xVar = EnumC2047c.f4693i;
            if (abstractC2053i.m5098g()) {
                AbstractC2053i.g gVar = (AbstractC2053i.g) abstractC2053i;
                String str = gVar.f4786e;
                if (C1274b.m3172c(str, y.f4744v)) {
                    c2046b.m5042p();
                    c2046b.m5002H(gVar);
                    c2046b.m5049s0(EnumC2047c.f4699o);
                    c2046b.m5008N();
                    return true;
                }
                if (!C1274b.m3172c(str, y.f4714D)) {
                    return c2046b.m5024d0(abstractC2053i, xVar);
                }
                if (c2046b.m5170f("tr")) {
                    return c2046b.mo5025e(abstractC2053i);
                }
                return false;
            }
            if (!abstractC2053i.m5097f()) {
                return c2046b.m5024d0(abstractC2053i, xVar);
            }
            String str2 = ((AbstractC2053i.f) abstractC2053i).f4786e;
            if (str2.equals("tr")) {
                if (!c2046b.m5001G(str2)) {
                    c2046b.m5046r(this);
                    return false;
                }
            } else {
                if (str2.equals("table")) {
                    if (c2046b.m5170f("tr")) {
                        return c2046b.mo5025e(abstractC2053i);
                    }
                    return false;
                }
                if (!C1274b.m3172c(str2, y.f4741s)) {
                    if (!C1274b.m3172c(str2, y.f4715E)) {
                        return c2046b.m5024d0(abstractC2053i, xVar);
                    }
                    c2046b.m5046r(this);
                    return false;
                }
                if (!c2046b.m5001G(str2) || !c2046b.m5001G("tr")) {
                    c2046b.m5046r(this);
                    return false;
                }
            }
            c2046b.m5042p();
            c2046b.m5018Z();
            c2046b.m5049s0(dVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$f */
    static final class f extends EnumC2047c {
        f() {
            super("InCell", 14, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            e eVar = EnumC2047c.f4698n;
            v vVar = EnumC2047c.f4691g;
            if (!abstractC2053i.m5097f()) {
                if (!abstractC2053i.m5098g() || !C1274b.m3172c(((AbstractC2053i.g) abstractC2053i).f4786e, y.f4747y)) {
                    return c2046b.m5024d0(abstractC2053i, vVar);
                }
                if (c2046b.m5001G("td") || c2046b.m5001G("th")) {
                    c2046b.m5170f(c2046b.m5001G("td") ? "td" : "th");
                    return c2046b.mo5025e(abstractC2053i);
                }
                c2046b.m5046r(this);
                return false;
            }
            String str = ((AbstractC2053i.f) abstractC2053i).f4786e;
            if (!C1274b.m3172c(str, y.f4744v)) {
                if (C1274b.m3172c(str, y.f4745w)) {
                    c2046b.m5046r(this);
                    return false;
                }
                if (!C1274b.m3172c(str, y.f4746x)) {
                    return c2046b.m5024d0(abstractC2053i, vVar);
                }
                if (c2046b.m5001G(str)) {
                    c2046b.m5170f(c2046b.m5001G("td") ? "td" : "th");
                    return c2046b.mo5025e(abstractC2053i);
                }
                c2046b.m5046r(this);
                return false;
            }
            if (!c2046b.m5001G(str)) {
                c2046b.m5046r(this);
                c2046b.m5049s0(eVar);
                return false;
            }
            c2046b.m5052v(false);
            if (!c2046b.m5169b(str)) {
                c2046b.m5046r(this);
            }
            c2046b.m5019a0(str);
            c2046b.m5035l();
            c2046b.m5049s0(eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$g */
    static final class g extends EnumC2047c {
        g() {
            super("InSelect", 15, null);
        }

        /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            EnumC2047c enumC2047c = EnumC2047c.f4688d;
            int iM6255a = C2314g.m6255a(abstractC2053i.f4774a);
            if (iM6255a == 0) {
                c2046b.m5046r(this);
                return false;
            }
            if (iM6255a == 1) {
                AbstractC2053i.g gVar = (AbstractC2053i.g) abstractC2053i;
                String str = gVar.f4786e;
                if (str.equals("html")) {
                    return c2046b.m5024d0(gVar, EnumC2047c.f4691g);
                }
                if (!str.equals("option")) {
                    if (!str.equals("optgroup")) {
                        if (str.equals("select")) {
                            c2046b.m5046r(this);
                            return c2046b.m5170f("select");
                        }
                        if (C1274b.m3172c(str, y.f4716F)) {
                            c2046b.m5046r(this);
                            if (!c2046b.m5000E("select")) {
                                return false;
                            }
                            c2046b.m5170f("select");
                            return c2046b.mo5025e(gVar);
                        }
                        if (str.equals("script") || str.equals("template")) {
                            return c2046b.m5024d0(abstractC2053i, enumC2047c);
                        }
                        c2046b.m5046r(this);
                        return false;
                    }
                    if (c2046b.m5169b("option")) {
                        c2046b.m5170f("option");
                    }
                    if (c2046b.m5169b("optgroup")) {
                        c2046b.m5170f("optgroup");
                    }
                } else if (c2046b.m5169b("option")) {
                    c2046b.m5170f("option");
                }
                c2046b.m5002H(gVar);
            } else if (iM6255a == 2) {
                String str2 = ((AbstractC2053i.f) abstractC2053i).f4786e;
                str2.getClass();
                byte b = -1;
                switch (str2.hashCode()) {
                    case -1321546630:
                        if (str2.equals("template")) {
                            b = 0;
                        }
                        break;
                    case -1010136971:
                        if (str2.equals("option")) {
                            b = 1;
                        }
                        break;
                    case -906021636:
                        if (str2.equals("select")) {
                            b = 2;
                        }
                        break;
                    case -80773204:
                        if (str2.equals("optgroup")) {
                            b = 3;
                        }
                        break;
                }
                if (b == 0) {
                    return c2046b.m5024d0(abstractC2053i, enumC2047c);
                }
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            c2046b.m5046r(this);
                            return false;
                        }
                        if (c2046b.m5169b("option") && c2046b.m5031j(c2046b.m5168a()) != null && c2046b.m5031j(c2046b.m5168a()).m4888h0().equals("optgroup")) {
                            c2046b.m5170f("option");
                        }
                        if (c2046b.m5169b("optgroup")) {
                            c2046b.m5018Z();
                        } else {
                            c2046b.m5046r(this);
                        }
                    } else {
                        if (!c2046b.m5000E(str2)) {
                            c2046b.m5046r(this);
                            return false;
                        }
                        c2046b.m5019a0(str2);
                        c2046b.m5037m0();
                    }
                } else if (c2046b.m5169b("option")) {
                    c2046b.m5018Z();
                } else {
                    c2046b.m5046r(this);
                }
            } else if (iM6255a == 3) {
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
            } else if (iM6255a == 4) {
                AbstractC2053i.b bVar = (AbstractC2053i.b) abstractC2053i;
                if (bVar.m5102l().equals(EnumC2047c.f4709y)) {
                    c2046b.m5046r(this);
                    return false;
                }
                c2046b.m5003I(bVar);
            } else {
                if (iM6255a != 5) {
                    c2046b.m5046r(this);
                    return false;
                }
                if (!c2046b.m5169b("html")) {
                    c2046b.m5046r(this);
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$h */
    static final class h extends EnumC2047c {
        h() {
            super("InSelectInTable", 16, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            if (abstractC2053i.m5098g() && C1274b.m3172c(((AbstractC2053i.g) abstractC2053i).f4786e, y.f4717G)) {
                c2046b.m5046r(this);
                c2046b.m5019a0("select");
                c2046b.m5037m0();
                return c2046b.mo5025e(abstractC2053i);
            }
            if (abstractC2053i.m5097f()) {
                AbstractC2053i.f fVar = (AbstractC2053i.f) abstractC2053i;
                if (C1274b.m3172c(fVar.f4786e, y.f4717G)) {
                    c2046b.m5046r(this);
                    if (!c2046b.m5001G(fVar.f4786e)) {
                        return false;
                    }
                    c2046b.m5019a0("select");
                    c2046b.m5037m0();
                    return c2046b.mo5025e(abstractC2053i);
                }
            }
            return c2046b.m5024d0(abstractC2053i, EnumC2047c.f4700p);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$i */
    static final class i extends EnumC2047c {
        i() {
            super("InTemplate", 17, null);
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            s sVar = EnumC2047c.f4688d;
            v vVar = EnumC2047c.f4691g;
            int iM6255a = C2314g.m6255a(abstractC2053i.f4774a);
            if (iM6255a == 0) {
                c2046b.m5024d0(abstractC2053i, vVar);
            } else {
                if (iM6255a == 1) {
                    String str = ((AbstractC2053i.g) abstractC2053i).f4786e;
                    if (!C1274b.m3172c(str, y.f4721K)) {
                        if (C1274b.m3172c(str, y.f4722L)) {
                            c2046b.m5020b0();
                            x xVar = EnumC2047c.f4693i;
                            c2046b.m5027f0(xVar);
                            c2046b.m5049s0(xVar);
                            return c2046b.mo5025e(abstractC2053i);
                        }
                        if (str.equals("col")) {
                            c2046b.m5020b0();
                            c cVar = EnumC2047c.f4696l;
                            c2046b.m5027f0(cVar);
                            c2046b.m5049s0(cVar);
                            return c2046b.mo5025e(abstractC2053i);
                        }
                        if (str.equals("tr")) {
                            c2046b.m5020b0();
                            d dVar = EnumC2047c.f4697m;
                            c2046b.m5027f0(dVar);
                            c2046b.m5049s0(dVar);
                            return c2046b.mo5025e(abstractC2053i);
                        }
                        if (!str.equals("td") && !str.equals("th")) {
                            c2046b.m5020b0();
                            c2046b.m5027f0(vVar);
                            c2046b.m5049s0(vVar);
                            return c2046b.mo5025e(abstractC2053i);
                        }
                        c2046b.m5020b0();
                        e eVar = EnumC2047c.f4698n;
                        c2046b.m5027f0(eVar);
                        c2046b.m5049s0(eVar);
                        return c2046b.mo5025e(abstractC2053i);
                    }
                } else if (iM6255a != 2) {
                    if (iM6255a != 3 && iM6255a != 4) {
                        if (iM6255a != 5 || !c2046b.m5016W("template")) {
                            return true;
                        }
                        c2046b.m5046r(this);
                        c2046b.m5019a0("template");
                        c2046b.m5035l();
                        c2046b.m5020b0();
                        c2046b.m5037m0();
                        if (c2046b.m5045q0() == EnumC2047c.f4702r || c2046b.m5047r0() >= 12) {
                            return true;
                        }
                        return c2046b.mo5025e(abstractC2053i);
                    }
                    c2046b.m5024d0(abstractC2053i, vVar);
                } else if (!((AbstractC2053i.f) abstractC2053i).f4786e.equals("template")) {
                    c2046b.m5046r(this);
                    return false;
                }
                c2046b.m5024d0(abstractC2053i, sVar);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$j */
    static final class j extends EnumC2047c {
        j() {
            super("AfterBody", 18, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            if (EnumC2047c.m5057a(abstractC2053i)) {
                c2046b.m5003I((AbstractC2053i.b) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5094c()) {
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5095d()) {
                c2046b.m5046r(this);
                return false;
            }
            if (abstractC2053i.m5098g() && ((AbstractC2053i.g) abstractC2053i).f4786e.equals("html")) {
                return c2046b.m5024d0(abstractC2053i, EnumC2047c.f4691g);
            }
            if (abstractC2053i.m5097f() && ((AbstractC2053i.f) abstractC2053i).f4786e.equals("html")) {
                c2046b.getClass();
                if (c2046b.m5016W("html")) {
                    c2046b.m5019a0("html");
                }
                c2046b.m5049s0(EnumC2047c.f4706v);
                return true;
            }
            if (abstractC2053i.m5096e()) {
                return true;
            }
            c2046b.m5046r(this);
            c2046b.m5036l0();
            return c2046b.mo5025e(abstractC2053i);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$k */
    static final class k extends EnumC2047c {
        k() {
            super("Initial", 0, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            q qVar = EnumC2047c.f4686b;
            if (EnumC2047c.m5057a(abstractC2053i)) {
                return true;
            }
            if (abstractC2053i.m5094c()) {
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
            } else {
                if (!abstractC2053i.m5095d()) {
                    c2046b.m5049s0(qVar);
                    return c2046b.mo5025e(abstractC2053i);
                }
                AbstractC2053i.d dVar = (AbstractC2053i.d) abstractC2053i;
                C2035g c2035g = new C2035g(c2046b.f4898h.m5071d(dVar.f4780d.toString()), dVar.f4782f.toString(), dVar.f4783g.toString());
                c2035g.m4857L(dVar.f4781e);
                c2046b.f4894d.m4869M(c2035g);
                if (dVar.f4784h) {
                    c2046b.f4894d.m4838B0();
                }
                c2046b.m5049s0(qVar);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$l */
    static final class l extends EnumC2047c {
        l() {
            super("InFrameset", 19, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            EnumC2047c enumC2047c;
            if (EnumC2047c.m5057a(abstractC2053i)) {
                c2046b.m5003I((AbstractC2053i.b) abstractC2053i);
            } else if (abstractC2053i.m5094c()) {
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
            } else {
                if (abstractC2053i.m5095d()) {
                    c2046b.m5046r(this);
                    return false;
                }
                if (abstractC2053i.m5098g()) {
                    AbstractC2053i.g gVar = (AbstractC2053i.g) abstractC2053i;
                    String str = gVar.f4786e;
                    str.getClass();
                    switch (str) {
                        case "frameset":
                            c2046b.m5002H(gVar);
                            break;
                        case "html":
                            enumC2047c = EnumC2047c.f4691g;
                            return c2046b.m5024d0(gVar, enumC2047c);
                        case "frame":
                            c2046b.m5005K(gVar);
                            break;
                        case "noframes":
                            enumC2047c = EnumC2047c.f4688d;
                            return c2046b.m5024d0(gVar, enumC2047c);
                        default:
                            c2046b.m5046r(this);
                            return false;
                    }
                } else if (abstractC2053i.m5097f() && ((AbstractC2053i.f) abstractC2053i).f4786e.equals("frameset")) {
                    if (c2046b.m5169b("html")) {
                        c2046b.m5046r(this);
                        return false;
                    }
                    c2046b.m5018Z();
                    if (!c2046b.m5169b("frameset")) {
                        c2046b.m5049s0(EnumC2047c.f4705u);
                    }
                } else {
                    if (!abstractC2053i.m5096e()) {
                        c2046b.m5046r(this);
                        return false;
                    }
                    if (!c2046b.m5169b("html")) {
                        c2046b.m5046r(this);
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$m */
    static final class m extends EnumC2047c {
        m() {
            super("AfterFrameset", 20, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            EnumC2047c enumC2047c;
            if (EnumC2047c.m5057a(abstractC2053i)) {
                c2046b.m5003I((AbstractC2053i.b) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5094c()) {
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5095d()) {
                c2046b.m5046r(this);
                return false;
            }
            if (abstractC2053i.m5098g() && ((AbstractC2053i.g) abstractC2053i).f4786e.equals("html")) {
                enumC2047c = EnumC2047c.f4691g;
            } else {
                if (abstractC2053i.m5097f() && ((AbstractC2053i.f) abstractC2053i).f4786e.equals("html")) {
                    c2046b.m5049s0(EnumC2047c.f4707w);
                    return true;
                }
                if (!abstractC2053i.m5098g() || !((AbstractC2053i.g) abstractC2053i).f4786e.equals("noframes")) {
                    if (abstractC2053i.m5096e()) {
                        return true;
                    }
                    c2046b.m5046r(this);
                    return false;
                }
                enumC2047c = EnumC2047c.f4688d;
            }
            return c2046b.m5024d0(abstractC2053i, enumC2047c);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$n */
    static final class n extends EnumC2047c {
        n() {
            super("AfterAfterBody", 21, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            if (abstractC2053i.m5094c()) {
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5095d() || (abstractC2053i.m5098g() && ((AbstractC2053i.g) abstractC2053i).f4786e.equals("html"))) {
                return c2046b.m5024d0(abstractC2053i, EnumC2047c.f4691g);
            }
            if (EnumC2047c.m5057a(abstractC2053i)) {
                c2046b.m5003I((AbstractC2053i.b) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5096e()) {
                return true;
            }
            c2046b.m5046r(this);
            c2046b.m5036l0();
            return c2046b.mo5025e(abstractC2053i);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$o */
    static final class o extends EnumC2047c {
        o() {
            super("AfterAfterFrameset", 22, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            if (abstractC2053i.m5094c()) {
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5095d() || EnumC2047c.m5057a(abstractC2053i) || (abstractC2053i.m5098g() && ((AbstractC2053i.g) abstractC2053i).f4786e.equals("html"))) {
                return c2046b.m5024d0(abstractC2053i, EnumC2047c.f4691g);
            }
            if (abstractC2053i.m5096e()) {
                return true;
            }
            if (abstractC2053i.m5098g() && ((AbstractC2053i.g) abstractC2053i).f4786e.equals("noframes")) {
                return c2046b.m5024d0(abstractC2053i, EnumC2047c.f4688d);
            }
            c2046b.m5046r(this);
            return false;
        }
    }

    static final class p extends EnumC2047c {
        p() { super("StubP", 99, null); }
                final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) { return false; }
    }


    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$q */
    static final class q extends EnumC2047c {
        q() {
            super("BeforeHtml", 1, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            r rVar = EnumC2047c.f4687c;
            if (abstractC2053i.m5095d()) {
                c2046b.m5046r(this);
                return false;
            }
            if (abstractC2053i.m5094c()) {
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
                return true;
            }
            if (EnumC2047c.m5057a(abstractC2053i)) {
                c2046b.m5003I((AbstractC2053i.b) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5098g()) {
                AbstractC2053i.g gVar = (AbstractC2053i.g) abstractC2053i;
                if (gVar.f4786e.equals("html")) {
                    c2046b.m5002H(gVar);
                    c2046b.m5049s0(rVar);
                    return true;
                }
            }
            if (!(abstractC2053i.m5097f() && C1274b.m3172c(((AbstractC2053i.f) abstractC2053i).f4786e, y.f4727e)) && abstractC2053i.m5097f()) {
                c2046b.m5046r(this);
                return false;
            }
            c2046b.m5009P();
            c2046b.m5049s0(rVar);
            return c2046b.mo5025e(abstractC2053i);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$r */
    static final class r extends EnumC2047c {
        r() {
            super("BeforeHead", 2, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            if (EnumC2047c.m5057a(abstractC2053i)) {
                c2046b.m5003I((AbstractC2053i.b) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5094c()) {
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5095d()) {
                c2046b.m5046r(this);
                return false;
            }
            if (abstractC2053i.m5098g() && ((AbstractC2053i.g) abstractC2053i).f4786e.equals("html")) {
                return EnumC2047c.f4691g.mo5060d(abstractC2053i, c2046b);
            }
            if (abstractC2053i.m5098g()) {
                AbstractC2053i.g gVar = (AbstractC2053i.g) abstractC2053i;
                if (gVar.f4786e.equals("head")) {
                    c2046b.m5043p0(c2046b.m5002H(gVar));
                    c2046b.m5049s0(EnumC2047c.f4688d);
                    return true;
                }
            }
            if (abstractC2053i.m5097f() && C1274b.m3172c(((AbstractC2053i.f) abstractC2053i).f4786e, y.f4727e)) {
                c2046b.m5172h("head");
                return c2046b.mo5025e(abstractC2053i);
            }
            if (abstractC2053i.m5097f()) {
                c2046b.m5046r(this);
                return false;
            }
            c2046b.m5172h("head");
            return c2046b.mo5025e(abstractC2053i);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$s */
    static final class s extends EnumC2047c {
        s() {
            super("InHead", 3, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            EnumC2047c enumC2047c;
            w wVar = EnumC2047c.f4692h;
            if (EnumC2047c.m5057a(abstractC2053i)) {
                c2046b.m5003I((AbstractC2053i.b) abstractC2053i);
                return true;
            }
            int iM6255a = C2314g.m6255a(abstractC2053i.f4774a);
            if (iM6255a == 0) {
                c2046b.m5046r(this);
                return false;
            }
            if (iM6255a == 1) {
                AbstractC2053i.g gVar = (AbstractC2053i.g) abstractC2053i;
                String str = gVar.f4786e;
                if (str.equals("html")) {
                    return EnumC2047c.f4691g.mo5060d(abstractC2053i, c2046b);
                }
                if (C1274b.m3172c(str, y.f4723a)) {
                    C2037i c2037iM5005K = c2046b.m5005K(gVar);
                    if (str.equals("base") && c2037iM5005K.m4939o("href")) {
                        c2046b.m5013T(c2037iM5005K);
                    }
                } else if (str.equals("meta")) {
                    c2046b.m5005K(gVar);
                } else if (str.equals("title")) {
                    c2046b.f4893c.m5159v(EnumC2056l.f4850c);
                    c2046b.m5012S();
                    c2046b.m5049s0(wVar);
                    c2046b.m5002H(gVar);
                } else if (C1274b.m3172c(str, y.f4724b)) {
                    EnumC2047c.m5058b(gVar, c2046b);
                } else if (str.equals("noscript")) {
                    c2046b.m5002H(gVar);
                    enumC2047c = EnumC2047c.f4689e;
                    c2046b.m5049s0(enumC2047c);
                } else if (str.equals("script")) {
                    c2046b.f4893c.m5159v(EnumC2056l.f4856f);
                    c2046b.m5012S();
                    c2046b.m5049s0(wVar);
                    c2046b.m5002H(gVar);
                } else {
                    if (str.equals("head")) {
                        c2046b.m5046r(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        c2046b.m5170f("head");
                        return c2046b.mo5025e(abstractC2053i);
                    }
                    c2046b.m5002H(gVar);
                    c2046b.m5008N();
                    c2046b.m5048s(false);
                    i iVar = EnumC2047c.f4702r;
                    c2046b.m5049s0(iVar);
                    c2046b.m5027f0(iVar);
                }
            } else if (iM6255a == 2) {
                String str2 = ((AbstractC2053i.f) abstractC2053i).f4786e;
                if (str2.equals("head")) {
                    c2046b.m5018Z();
                    enumC2047c = EnumC2047c.f4690f;
                    c2046b.m5049s0(enumC2047c);
                } else {
                    if (C1274b.m3172c(str2, y.f4725c)) {
                        c2046b.m5170f("head");
                        return c2046b.mo5025e(abstractC2053i);
                    }
                    if (!str2.equals("template")) {
                        c2046b.m5046r(this);
                        return false;
                    }
                    if (c2046b.m5016W(str2)) {
                        c2046b.m5052v(true);
                        if (!str2.equals(c2046b.m5168a().m4888h0())) {
                            c2046b.m5046r(this);
                        }
                        c2046b.m5019a0(str2);
                        c2046b.m5035l();
                        c2046b.m5020b0();
                        c2046b.m5037m0();
                    } else {
                        c2046b.m5046r(this);
                    }
                }
            } else {
                if (iM6255a != 3) {
                    c2046b.m5170f("head");
                    return c2046b.mo5025e(abstractC2053i);
                }
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$t */
    static final class t extends EnumC2047c {
        t() {
            super("InHeadNoscript", 4, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            AbstractC2053i.b bVar;
            s sVar = EnumC2047c.f4688d;
            if (abstractC2053i.m5095d()) {
                c2046b.m5046r(this);
            } else {
                if (abstractC2053i.m5098g() && ((AbstractC2053i.g) abstractC2053i).f4786e.equals("html")) {
                    return c2046b.m5024d0(abstractC2053i, EnumC2047c.f4691g);
                }
                if (!abstractC2053i.m5097f() || !((AbstractC2053i.f) abstractC2053i).f4786e.equals("noscript")) {
                    if (EnumC2047c.m5057a(abstractC2053i) || abstractC2053i.m5094c() || (abstractC2053i.m5098g() && C1274b.m3172c(((AbstractC2053i.g) abstractC2053i).f4786e, y.f4728f))) {
                        return c2046b.m5024d0(abstractC2053i, sVar);
                    }
                    if (abstractC2053i.m5097f() && ((AbstractC2053i.f) abstractC2053i).f4786e.equals("br")) {
                        c2046b.m5046r(this);
                        bVar = new AbstractC2053i.b();
                    } else {
                        if ((abstractC2053i.m5098g() && C1274b.m3172c(((AbstractC2053i.g) abstractC2053i).f4786e, y.f4719I)) || abstractC2053i.m5097f()) {
                            c2046b.m5046r(this);
                            return false;
                        }
                        c2046b.m5046r(this);
                        bVar = new AbstractC2053i.b();
                    }
                    bVar.m5101k(abstractC2053i.toString());
                    c2046b.m5003I(bVar);
                    return true;
                }
                c2046b.m5018Z();
                c2046b.m5049s0(sVar);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$u */
    static final class u extends EnumC2047c {
        u() {
            super("AfterHead", 5, null);
        }

        /* JADX INFO: renamed from: e */
        private boolean m5063e(AbstractC2053i abstractC2053i, C2046b c2046b) {
            c2046b.m5172h("body");
            c2046b.m5048s(true);
            return c2046b.mo5025e(abstractC2053i);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            s sVar = EnumC2047c.f4688d;
            v vVar = EnumC2047c.f4691g;
            if (EnumC2047c.m5057a(abstractC2053i)) {
                c2046b.m5003I((AbstractC2053i.b) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5094c()) {
                c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5095d()) {
                c2046b.m5046r(this);
                return true;
            }
            if (abstractC2053i.m5098g()) {
                AbstractC2053i.g gVar = (AbstractC2053i.g) abstractC2053i;
                String str = gVar.f4786e;
                if (str.equals("html")) {
                    return c2046b.m5024d0(abstractC2053i, vVar);
                }
                if (str.equals("body")) {
                    c2046b.m5002H(gVar);
                    c2046b.m5048s(false);
                    c2046b.m5049s0(vVar);
                    return true;
                }
                if (str.equals("frameset")) {
                    c2046b.m5002H(gVar);
                    c2046b.m5049s0(EnumC2047c.f4704t);
                    return true;
                }
                if (C1274b.m3172c(str, y.f4729g)) {
                    c2046b.m5046r(this);
                    C2037i c2037iM5056z = c2046b.m5056z();
                    c2046b.f4895e.add(c2037iM5056z);
                    c2046b.m5024d0(abstractC2053i, sVar);
                    c2046b.m5032j0(c2037iM5056z);
                    return true;
                }
                if (str.equals("head")) {
                    c2046b.m5046r(this);
                    return false;
                }
            } else if (abstractC2053i.m5097f()) {
                String str2 = ((AbstractC2053i.f) abstractC2053i).f4786e;
                if (!C1274b.m3172c(str2, y.f4726d)) {
                    if (str2.equals("template")) {
                        c2046b.m5024d0(abstractC2053i, sVar);
                        return true;
                    }
                    c2046b.m5046r(this);
                    return false;
                }
            }
            m5063e(abstractC2053i, c2046b);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$v */
    static final class v extends EnumC2047c {
        v() {
            super("InBody", 6, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:104:0x016c  */
        /* JADX WARN: Code duplicated, block: B:223:0x034a  */
        /* JADX WARN: Code duplicated, block: B:225:0x0356  */
        /* JADX WARN: Code duplicated, block: B:227:0x035c  */
        /* JADX WARN: Code duplicated, block: B:229:0x0363  */
        /* JADX WARN: Code duplicated, block: B:231:0x0369  */
        /* JADX WARN: Code duplicated, block: B:235:0x03a2  */
        /* JADX WARN: Code duplicated, block: B:236:0x03a4  */
        /* JADX WARN: Code duplicated, block: B:245:0x03d0  */
        /* JADX WARN: Code duplicated, block: B:430:0x0768  */
        /* JADX WARN: Code duplicated, block: B:442:0x07a3 A[PHI: r5
          0x07a3: PHI (r5v61 java.lang.String) = (r5v18 java.lang.String), (r5v19 java.lang.String), (r5v20 java.lang.String), (r5v62 java.lang.String) binds: [B:441:0x07a1, B:437:0x078e, B:433:0x077b, B:430:0x0768] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:478:0x0838 A[PHI: r5 r6
          0x0838: PHI (r5v15 java.lang.String) = 
          (r5v14 java.lang.String)
          (r5v16 java.lang.String)
          (r5v17 java.lang.String)
          (r5v61 java.lang.String)
          (r5v64 java.lang.String)
          (r5v64 java.lang.String)
          (r5v64 java.lang.String)
          (r5v64 java.lang.String)
          (r5v64 java.lang.String)
          (r5v64 java.lang.String)
          (r5v64 java.lang.String)
         binds: [B:477:0x0836, B:449:0x07cb, B:445:0x07b7, B:442:0x07a3, B:266:0x0458, B:473:0x0824, B:469:0x0816, B:465:0x0808, B:461:0x07fa, B:457:0x07eb, B:453:0x07db] A[DONT_GENERATE, DONT_INLINE]
          0x0838: PHI (r6v12 java.lang.String) = 
          (r6v11 java.lang.String)
          (r6v13 java.lang.String)
          (r6v14 java.lang.String)
          (r6v58 java.lang.String)
          (r6v60 java.lang.String)
          (r6v60 java.lang.String)
          (r6v60 java.lang.String)
          (r6v60 java.lang.String)
          (r6v60 java.lang.String)
          (r6v60 java.lang.String)
          (r6v60 java.lang.String)
         binds: [B:477:0x0836, B:449:0x07cb, B:445:0x07b7, B:442:0x07a3, B:266:0x0458, B:473:0x0824, B:469:0x0816, B:465:0x0808, B:461:0x07fa, B:457:0x07eb, B:453:0x07db] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:633:0x0b81 A[PHI: r0 r13
          0x0b81: PHI (r0v26 java.lang.String) = (r0v20 java.lang.String), (r0v27 java.lang.String) binds: [B:632:0x0b7f, B:606:0x0afb] A[DONT_GENERATE, DONT_INLINE]
          0x0b81: PHI (r13v14 com.github.catvod.spider.support.p102H.i$g) = (r13v10 com.github.catvod.spider.support.p102H.i$g), (r13v15 com.github.catvod.spider.support.p102H.i$g) binds: [B:632:0x0b7f, B:606:0x0afb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x018c, code lost:
        
            if (r44.m5170f("body") != false) goto L164;
         */
        /* JADX WARN: Code restructure failed: missing block: B:524:0x0950, code lost:
        
            if (r44.m5005K(r28).mo4929d("type").equalsIgnoreCase("hidden") == false) goto L675;
         */
        /* JADX WARN: Code restructure failed: missing block: B:711:0x0cef, code lost:
        
            if (com.github.catvod.spider.support.p043F.C1274b.m3172c(r1, com.github.catvod.spider.support.p102H.EnumC2047c.y.f4737o) != false) goto L550;
         */
        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 int, still in use, count: 3, list:
          (r2v3 int) from 0x044b: IF  (r2v3 int) == (97 int)  -> B:480:0x0840 A[HIDDEN]
          (r2v3 int) from 0x044f: IF  (r2v3 int) != (98 int)  -> B:264:0x0451 A[HIDDEN]
          (r2v3 int) from 0x0451: SWITCH (r2v3 int)
         case -1644953643: goto B:448:0x07c1
         case -1377687758: goto B:444:0x07af
         case -1191214428: goto B:440:0x0799
         case -1134665583: goto B:436:0x0786
         case -1010136971: goto B:432:0x0775
         case -1003243718: goto B:428:0x0760
         case -906021636: goto B:424:0x074d
         case -891985998: goto B:420:0x073a
         case -891980137: goto B:416:0x0727
         case -80773204: goto B:412:0x0714
         case 105: goto B:408:0x0700
         case 115: goto B:404:0x06ec
         case 117: goto B:400:0x06d8
         case 3152: goto B:396:0x06c5
         case 3200: goto B:392:0x06b3
         case 3216: goto B:388:0x06a1
         case 3240: goto B:384:0x068d
         case 3338: goto B:380:0x067b
         case 3453: goto B:376:0x0669
         case 3646: goto B:372:0x0655
         case 3650: goto B:368:0x0641
         case 3712: goto B:364:0x062d
         case 97536: goto B:360:0x0619
         case 104387: goto B:356:0x0607
         case 111267: goto B:352:0x05f3
         case 114276: goto B:348:0x05e1
         case 117511: goto B:344:0x05cd
         case 118811: goto B:340:0x05b9
         case 3002509: goto B:336:0x05a5
         case 3029410: goto B:332:0x0593
         case 3059181: goto B:328:0x057f
         case 3148879: goto B:324:0x056b
         case 3148996: goto B:320:0x0559
         case 3213227: goto B:316:0x0547
         case 3344136: goto B:312:0x0533
         case 3386833: goto B:308:0x0521
         case 3536714: goto B:304:0x050f
         case 96620249: goto B:300:0x04fb
         case 100313435: goto B:296:0x04e7
         case 100358090: goto B:292:0x04d3
         case 109548807: goto B:288:0x04bf
         case 110115790: goto B:284:0x04ab
         case 181975684: goto B:280:0x0497
         case 1973234167: goto B:276:0x0483
         case 2091304424: goto B:272:0x0471
         case 2115613112: goto B:268:0x045d
         default: goto B:265:0x0454 A[RegionRef:SW:264]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 int, still in use, count: 3, list:
          (r2v3 int) from 0x044b: IF  (r2v3 int) == (97 int)  -> B:480:0x0840 A[HIDDEN]
          (r2v3 int) from 0x044f: IF  (r2v3 int) != (98 int)  -> B:264:0x0451 A[HIDDEN]
          (r2v3 int) from 0x0451: SWITCH (r2v3 int)
         case -1644953643: goto B:448:0x07c1
         case -1377687758: goto B:444:0x07af
         case -1191214428: goto B:440:0x0799
         case -1134665583: goto B:436:0x0786
         case -1010136971: goto B:432:0x0775
         case -1003243718: goto B:428:0x0760
         case -906021636: goto B:424:0x074d
         case -891985998: goto B:420:0x073a
         case -891980137: goto B:416:0x0727
         case -80773204: goto B:412:0x0714
         case 105: goto B:408:0x0700
         case 115: goto B:404:0x06ec
         case 117: goto B:400:0x06d8
         case 3152: goto B:396:0x06c5
         case 3200: goto B:392:0x06b3
         case 3216: goto B:388:0x06a1
         case 3240: goto B:384:0x068d
         case 3338: goto B:380:0x067b
         case 3453: goto B:376:0x0669
         case 3646: goto B:372:0x0655
         case 3650: goto B:368:0x0641
         case 3712: goto B:364:0x062d
         case 97536: goto B:360:0x0619
         case 104387: goto B:356:0x0607
         case 111267: goto B:352:0x05f3
         case 114276: goto B:348:0x05e1
         case 117511: goto B:344:0x05cd
         case 118811: goto B:340:0x05b9
         case 3002509: goto B:336:0x05a5
         case 3029410: goto B:332:0x0593
         case 3059181: goto B:328:0x057f
         case 3148879: goto B:324:0x056b
         case 3148996: goto B:320:0x0559
         case 3213227: goto B:316:0x0547
         case 3344136: goto B:312:0x0533
         case 3386833: goto B:308:0x0521
         case 3536714: goto B:304:0x050f
         case 96620249: goto B:300:0x04fb
         case 100313435: goto B:296:0x04e7
         case 100358090: goto B:292:0x04d3
         case 109548807: goto B:288:0x04bf
         case 110115790: goto B:284:0x04ab
         case 181975684: goto B:280:0x0497
         case 1973234167: goto B:276:0x0483
         case 2091304424: goto B:272:0x0471
         case 2115613112: goto B:268:0x045d
         default: goto B:265:0x0454 A[RegionRef:SW:264]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v3, types: [com.github.catvod.spider.support.p101G.i] */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v6, types: [com.github.catvod.spider.support.p101G.i, com.github.catvod.spider.support.p101G.m] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r15v3, types: [com.github.catvod.spider.support.p101G.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r44v0, types: [com.github.catvod.spider.support.p102H.b, com.github.catvod.spider.support.p102H.m] */
        /* JADX WARN: Type inference failed for: r9v10, types: [com.github.catvod.spider.support.p101G.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v23 */
        /* JADX WARN: Type inference failed for: r9v24 */
        /* JADX WARN: Type inference failed for: r9v25 */
        /* JADX WARN: Type inference failed for: r9v26 */
        /* JADX WARN: Type inference failed for: r9v8, types: [com.github.catvod.spider.support.p101G.i] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            String str;
            String str2;
            String str3;
            byte b;
            EnumC2047c enumC2047c;
            AbstractC2053i.g gVar;
            AbstractC2053i.g gVar2;
            AbstractC2053i.g gVar3;
            String str4;
            C2037i c2037iM5055y;
            boolean z;
            C2039k c2039kM5054x;
            byte b2;
            C2037i c2037i;
            int iLastIndexOf;
            boolean z2;
            Object M5031j;
            int iM6255a = C2314g.m6255a(abstractC2053i.f4774a);
            if (iM6255a == 0) {
                c2046b.m5046r(this);
                return false;
            }
            if (iM6255a == 1) {
                AbstractC2053i.g gVar4 = (AbstractC2053i.g) abstractC2053i;
                String str5 = gVar4.f4786e;
                str5.getClass();
                AbstractC2053i.g gVar5 = gVar4;
                if (iHashCode == 97) {
                    str = "option";
                    str2 = "button";
                    str3 = "a";
                    b = !str5.equals(str3) ? (byte) -1 : (byte) 10;
                } else if (iHashCode != 98) {
                    switch (iHashCode) {
                        case -1644953643:
                            str = "option";
                            str2 = "button";
                            if (str5.equals("frameset")) {
                                str3 = "a";
                                b = 0;
                            } else {
                                str3 = "a";
                            }
                            break;
                        case -1377687758:
                            str = "option";
                            str2 = "button";
                            if (str5.equals(str2)) {
                                str3 = "a";
                                b = 1;
                            } else {
                                str3 = "a";
                            }
                            break;
                        case -1191214428:
                            str = "option";
                            if (str5.equals("iframe")) {
                                str2 = "button";
                                str3 = "a";
                                b = 2;
                            } else {
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case -1134665583:
                            str = "option";
                            if (str5.equals("keygen")) {
                                str2 = "button";
                                str3 = "a";
                                b = 3;
                            } else {
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case -1010136971:
                            str = "option";
                            if (str5.equals(str)) {
                                str2 = "button";
                                str3 = "a";
                                b = 4;
                            } else {
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case -1003243718:
                            if (str5.equals("textarea")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 5;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case -906021636:
                            if (str5.equals("select")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 6;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case -891985998:
                            if (str5.equals("strike")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 7;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case -891980137:
                            if (str5.equals("strong")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 8;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case -80773204:
                            if (str5.equals("optgroup")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 9;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 105:
                            if (str5.equals("i")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 12;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 115:
                            if (str5.equals("s")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 13;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 117:
                            if (str5.equals("u")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 14;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3152:
                            if (str5.equals("br")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 15;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3200:
                            if (str5.equals("dd")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 16;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3216:
                            if (str5.equals("dt")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 17;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3240:
                            if (str5.equals("em")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 18;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3338:
                            if (str5.equals("hr")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 25;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3453:
                            if (str5.equals("li")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 26;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3646:
                            if (str5.equals("rp")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 27;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3650:
                            if (str5.equals("rt")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 28;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3712:
                            if (str5.equals("tt")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 29;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 97536:
                            if (str5.equals("big")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 30;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 104387:
                            if (str5.equals("img")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 31;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 111267:
                            if (str5.equals("pre")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 32;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 114276:
                            if (str5.equals("svg")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 33;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 117511:
                            if (str5.equals("wbr")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 34;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 118811:
                            if (str5.equals("xmp")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 35;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3002509:
                            if (str5.equals("area")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 36;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3029410:
                            if (str5.equals("body")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 37;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3059181:
                            if (str5.equals("code")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 38;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3148879:
                            if (str5.equals("font")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 39;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3148996:
                            if (str5.equals("form")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 40;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3213227:
                            if (str5.equals("html")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 41;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3344136:
                            if (str5.equals("math")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 42;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3386833:
                            if (str5.equals("nobr")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 43;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 3536714:
                            if (str5.equals("span")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 44;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 96620249:
                            if (str5.equals("embed")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 45;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 100313435:
                            if (str5.equals("image")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 46;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 100358090:
                            if (str5.equals("input")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 47;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 109548807:
                            if (str5.equals("small")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 48;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 110115790:
                            if (str5.equals("table")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 49;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 181975684:
                            if (str5.equals("listing")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 50;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 1973234167:
                            if (str5.equals("plaintext")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 51;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 2091304424:
                            if (str5.equals("isindex")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 52;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        case 2115613112:
                            if (str5.equals("noembed")) {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                                b = 53;
                            } else {
                                str = "option";
                                str2 = "button";
                                str3 = "a";
                            }
                            break;
                        default:
                            str = "option";
                            str2 = "button";
                            switch (str5) {
                                case "h1":
                                    str3 = "a";
                                    b = 19;
                                    break;
                                case "h2":
                                    str3 = "a";
                                    b = 20;
                                    break;
                                case "h3":
                                    str3 = "a";
                                    b = 21;
                                    break;
                                case "h4":
                                    str3 = "a";
                                    b = 22;
                                    break;
                                case "h5":
                                    str3 = "a";
                                    b = 23;
                                    break;
                                case "h6":
                                    str3 = "a";
                                    b = 24;
                                    break;
                                default:
                                    str3 = "a";
                                    break;
                            }
                            break;
                    }
                } else {
                    str = "option";
                    str2 = "button";
                    if (str5.equals("b")) {
                        str3 = "a";
                        b = 11;
                    } else {
                        str3 = "a";
                    }
                }
                switch (b) {
                    case 0:
                        c2046b.m5046r(this);
                        ArrayList<C2037i> arrayList = c2046b.f4895e;
                        if (arrayList.size() != 1 && ((arrayList.size() <= 2 || arrayList.get(1).m4888h0().equals("body")) && c2046b.m5050t())) {
                            C2037i c2037i2 = arrayList.get(1);
                            if (c2037i2.m4890j0() != null) {
                                c2037i2.m4932C();
                            }
                            while (arrayList.size() > 1) {
                                arrayList.remove(arrayList.size() - 1);
                            }
                            c2046b.m5002H(gVar5);
                            enumC2047c = EnumC2047c.f4704t;
                            c2046b.m5049s0(enumC2047c);
                            return true;
                        }
                        return false;
                    case 1:
                        if (c2046b.m4997B(str2)) {
                            c2046b.m5046r(this);
                            c2046b.m5170f(str2);
                            c2046b.mo5025e(gVar5);
                        } else {
                            c2046b.m5029h0();
                            c2046b.m5002H(gVar5);
                            z = false;
                            c2046b.m5048s(z);
                        }
                        return true;
                    case 2:
                        c2046b.m5048s(false);
                        EnumC2047c.m5058b(gVar5, c2046b);
                        return true;
                    case 3:
                    case 15:
                    case 31:
                    case 34:
                    case 36:
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        gVar = gVar5;
                        c2046b.m5029h0();
                        c2046b.m5005K(gVar);
                        z = false;
                        c2046b.m5048s(z);
                        return true;
                    case 4:
                    case 9:
                        gVar2 = gVar5;
                        if (c2046b.m5169b(str)) {
                            c2046b.m5170f(str);
                        }
                        c2046b.m5029h0();
                        c2046b.m5002H(gVar2);
                        return true;
                    case 5:
                        c2046b.m5002H(gVar5);
                        if (!gVar5.f4794m) {
                            c2046b.f4893c.m5159v(EnumC2056l.f4850c);
                            c2046b.m5012S();
                            c2046b.m5048s(false);
                            enumC2047c = EnumC2047c.f4692h;
                            c2046b.m5049s0(enumC2047c);
                        }
                        return true;
                    case 6:
                        c2046b.m5029h0();
                        c2046b.m5002H(gVar5);
                        c2046b.m5048s(false);
                        if (!gVar5.f4794m) {
                            EnumC2047c enumC2047cM5045q0 = c2046b.m5045q0();
                            enumC2047c = (enumC2047cM5045q0.equals(EnumC2047c.f4693i) || enumC2047cM5045q0.equals(EnumC2047c.f4695k) || enumC2047cM5045q0.equals(EnumC2047c.f4697m) || enumC2047cM5045q0.equals(EnumC2047c.f4698n) || enumC2047cM5045q0.equals(EnumC2047c.f4699o)) ? EnumC2047c.f4701q : EnumC2047c.f4700p;
                            c2046b.m5049s0(enumC2047c);
                        }
                        return true;
                    case 7:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 18:
                    case 29:
                    case 30:
                    case 38:
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case 48:
                        gVar3 = gVar5;
                        c2046b.m5029h0();
                        c2046b.m5026e0(c2046b.m5002H(gVar3));
                        return true;
                    case 10:
                        gVar3 = gVar5;
                        if (c2046b.m5053w(str3) != null) {
                            c2046b.m5046r(this);
                            c2046b.m5170f(str3);
                            C2037i c2037iM5055y2 = c2046b.m5055y(str3);
                            if (c2037iM5055y2 != null) {
                                c2046b.m5030i0(c2037iM5055y2);
                                c2046b.m5032j0(c2037iM5055y2);
                            }
                        }
                        c2046b.m5029h0();
                        c2046b.m5026e0(c2046b.m5002H(gVar3));
                        return true;
                    case 16:
                    case 17:
                        str4 = "p";
                        gVar2 = gVar5;
                        c2046b.m5048s(false);
                        ArrayList<C2037i> arrayList2 = c2046b.f4895e;
                        int size = arrayList2.size() - 1;
                        int i = size >= 24 ? size - 24 : 0;
                        while (size >= i) {
                            C2037i c2037i3 = arrayList2.get(size);
                            if (C1274b.m3172c(c2037i3.m4888h0(), y.f4733k)) {
                                c2046b.m5170f(c2037i3.m4888h0());
                            } else if (!c2046b.m5011R(c2037i3) || C1274b.m3172c(c2037i3.m4888h0(), y.f4732j)) {
                                size--;
                            }
                            if (c2046b.m4997B(str4)) {
                                c2046b.m5170f(str4);
                            }
                            c2046b.m5002H(gVar2);
                            return true;
                        }
                        if (c2046b.m4997B(str4)) {
                            c2046b.m5170f(str4);
                        }
                        c2046b.m5002H(gVar2);
                        return true;
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        gVar2 = gVar5;
                        if (c2046b.m4997B("p")) {
                            c2046b.m5170f("p");
                        }
                        if (C1274b.m3172c(c2046b.m5168a().m4888h0(), y.f4731i)) {
                            c2046b.m5046r(this);
                            c2046b.m5018Z();
                        }
                        c2046b.m5002H(gVar2);
                        return true;
                    case 25:
                        gVar = gVar5;
                        if (c2046b.m4997B("p")) {
                            c2046b.m5170f("p");
                        }
                        c2046b.m5005K(gVar);
                        z = false;
                        c2046b.m5048s(z);
                        return true;
                    case 26:
                        str4 = "p";
                        gVar2 = gVar5;
                        c2046b.m5048s(false);
                        ArrayList<C2037i> arrayList3 = c2046b.f4895e;
                        for (int size2 = arrayList3.size() - 1; size2 > 0; size2--) {
                            C2037i c2037i4 = arrayList3.get(size2);
                            if (c2037i4.m4888h0().equals("li")) {
                                c2046b.m5170f("li");
                            } else if (!c2046b.m5011R(c2037i4) || C1274b.m3172c(c2037i4.m4888h0(), y.f4732j)) {
                            }
                            if (c2046b.m4997B(str4)) {
                                c2046b.m5170f(str4);
                            }
                            c2046b.m5002H(gVar2);
                            return true;
                        }
                        if (c2046b.m4997B(str4)) {
                            c2046b.m5170f(str4);
                        }
                        c2046b.m5002H(gVar2);
                        return true;
                    case 27:
                    case 28:
                        gVar2 = gVar5;
                        if (c2046b.m4998C("ruby", null)) {
                            c2046b.m5052v(false);
                            if (!c2046b.m5169b("ruby")) {
                                c2046b.m5046r(this);
                                for (int size3 = c2046b.f4895e.size() - 1; size3 >= 0 && !c2046b.f4895e.get(size3).m4888h0().equals("ruby"); size3--) {
                                    c2046b.f4895e.remove(size3);
                                }
                            }
                            c2046b.m5002H(gVar2);
                        }
                        return true;
                    case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                    case 50:
                        if (c2046b.m4997B("p")) {
                            c2046b.m5170f("p");
                        }
                        c2046b.m5002H(gVar5);
                        c2046b.f4892b.m4956C("\n");
                        z = false;
                        c2046b.m5048s(z);
                        return true;
                    case 33:
                    case 42:
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        gVar2 = gVar5;
                        c2046b.m5029h0();
                        c2046b.m5002H(gVar2);
                        return true;
                    case 35:
                        if (c2046b.m4997B("p")) {
                            c2046b.m5170f("p");
                        }
                        c2046b.m5029h0();
                        c2046b.m5048s(false);
                        EnumC2047c.m5058b(gVar5, c2046b);
                        return true;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        c2046b.m5046r(this);
                        ArrayList<C2037i> arrayList4 = c2046b.f4895e;
                        if (arrayList4.size() != 1 && ((arrayList4.size() <= 2 || arrayList4.get(1).m4888h0().equals("body")) && !c2046b.m5016W("template"))) {
                            c2046b.m5048s(false);
                            if (gVar5.m5118u() && (c2037iM5055y = c2046b.m5055y("body")) != null) {
                                for (C2029a c2029a : gVar5.f4795n) {
                                    if (!c2037iM5055y.m4939o(c2029a.m4802a())) {
                                        c2037iM5055y.mo4883e().m4826v(c2029a);
                                    }
                                }
                            }
                            return true;
                        }
                        return false;
                    case 40:
                        if (c2046b.m5054x() == null || c2046b.m5016W("template")) {
                            if (c2046b.m4997B("p")) {
                                c2046b.m5044q();
                            }
                            c2046b.m5006L(gVar5, true, true);
                            return true;
                        }
                        c2046b.m5046r(this);
                        return false;
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        c2046b.m5046r(this);
                        if (!c2046b.m5016W("template")) {
                            if (c2046b.f4895e.size() > 0) {
                                C2037i c2037i5 = c2046b.f4895e.get(0);
                                if (gVar5.m5118u()) {
                                    for (C2029a c2029a2 : gVar5.f4795n) {
                                        if (!c2037i5.m4939o(c2029a2.m4802a())) {
                                            c2037i5.mo4883e().m4826v(c2029a2);
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                        return false;
                    case 43:
                        gVar3 = gVar5;
                        c2046b.m5029h0();
                        if (c2046b.m4998C("nobr", null)) {
                            c2046b.m5046r(this);
                            c2046b.m5170f("nobr");
                            c2046b.m5029h0();
                        }
                        c2046b.m5026e0(c2046b.m5002H(gVar3));
                        return true;
                    case 46:
                        gVar2 = gVar5;
                        if (c2046b.m5055y("svg") == null) {
                            gVar2.m5119v("img");
                            return c2046b.mo5025e(gVar2);
                        }
                        c2046b.m5002H(gVar2);
                        return true;
                    case 47:
                        c2046b.m5029h0();
                        break;
                    case 49:
                        if (c2046b.f4894d.m4839C0() != 2 && c2046b.m4997B("p")) {
                            c2046b.m5170f("p");
                        }
                        c2046b.m5002H(gVar5);
                        c2046b.m5048s(false);
                        enumC2047c = EnumC2047c.f4693i;
                        c2046b.m5049s0(enumC2047c);
                        return true;
                    case 51:
                        if (c2046b.m4997B("p")) {
                            c2046b.m5170f("p");
                        }
                        c2046b.m5002H(gVar5);
                        c2046b.f4893c.m5159v(EnumC2056l.f4858g);
                        return true;
                    case 52:
                        c2046b.m5046r(this);
                        if (c2046b.m5054x() == null) {
                            c2046b.m5172h("form");
                            if (gVar5.m5117t("action") && (c2039kM5054x = c2046b.m5054x()) != null && gVar5.m5117t("action")) {
                                c2039kM5054x.mo4883e().m4827w("action", gVar5.f4795n.m4819l("action"));
                            }
                            c2046b.m5172h("hr");
                            c2046b.m5172h("label");
                            String strM4819l = gVar5.m5117t("prompt") ? gVar5.f4795n.m4819l("prompt") : "This is a searchable index. Enter search keywords: ";
                            AbstractC2053i.b bVar = new AbstractC2053i.b();
                            bVar.m5101k(strM4819l);
                            c2046b.mo5025e(bVar);
                            C2030b c2030b = new C2030b();
                            if (gVar5.m5118u()) {
                                for (C2029a c2029a3 : gVar5.f4795n) {
                                    if (!C1274b.m3172c(c2029a3.m4802a(), y.f4736n)) {
                                        c2030b.m4826v(c2029a3);
                                    }
                                }
                            }
                            c2030b.m4827w("name", "isindex");
                            c2046b.m5171g(c2030b);
                            c2046b.m5170f("label");
                            c2046b.m5172h("hr");
                            c2046b.m5170f("form");
                            return true;
                        }
                        return false;
                    case 53:
                        gVar5 = gVar5;
                        EnumC2047c.m5058b(gVar5, c2046b);
                        return true;
                    default:
                        gVar2 = gVar5;
                        if (C2052h.m5078h(str5)) {
                            if (C1274b.m3172c(str5, y.f4730h)) {
                                if (c2046b.m4997B("p")) {
                                    c2046b.m5170f("p");
                                }
                                c2046b.m5002H(gVar2);
                            } else {
                                if (C1274b.m3172c(str5, y.f4729g)) {
                                    return c2046b.m5024d0(abstractC2053i, EnumC2047c.f4688d);
                                }
                                if (C1274b.m3172c(str5, y.f4734l)) {
                                    c2046b.m5029h0();
                                    c2046b.m5002H(gVar2);
                                    c2046b.m5008N();
                                    z = false;
                                    c2046b.m5048s(z);
                                } else if (C1274b.m3172c(str5, y.f4735m)) {
                                    c2046b.m5005K(gVar2);
                                }
                            }
                            break;
                        } else {
                            c2046b.m5002H(gVar2);
                        }
                        return true;
                }
            } else {
                if (iM6255a != 2) {
                    if (iM6255a == 3) {
                        c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
                        return true;
                    }
                    if (iM6255a != 4) {
                        if (iM6255a == 5 && c2046b.m5047r0() > 0) {
                            return c2046b.m5024d0(abstractC2053i, EnumC2047c.f4702r);
                        }
                        return true;
                    }
                    AbstractC2053i.b bVar2 = (AbstractC2053i.b) abstractC2053i;
                    if (bVar2.m5102l().equals(EnumC2047c.f4709y)) {
                        c2046b.m5046r(this);
                        return false;
                    }
                    if (c2046b.m5050t() && EnumC2047c.m5057a(bVar2)) {
                        c2046b.m5029h0();
                        c2046b.m5003I(bVar2);
                        return true;
                    }
                    c2046b.m5029h0();
                    c2046b.m5003I(bVar2);
                    c2046b.m5048s(false);
                    return true;
                }
                AbstractC2053i.f fVar = (AbstractC2053i.f) abstractC2053i;
                String str6 = fVar.f4786e;
                str6.getClass();
                switch (str6.hashCode()) {
                    case -1321546630:
                        if (str6.equals("template")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 112:
                        if (str6.equals("p")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3152:
                        if (str6.equals("br")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3200:
                        if (str6.equals("dd")) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3216:
                        if (str6.equals("dt")) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3453:
                        if (str6.equals("li")) {
                            b2 = 11;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3029410:
                        if (str6.equals("body")) {
                            b2 = 12;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3148996:
                        if (str6.equals("form")) {
                            b2 = 13;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3213227:
                        if (str6.equals("html")) {
                            b2 = 14;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3536714:
                        if (str6.equals("span")) {
                            b2 = 15;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 1869063452:
                        if (str6.equals("sarcasm")) {
                            b2 = 16;
                        } else {
                            b2 = -1;
                        }
                        break;
                    default:
                        switch (str6) {
                            case "h1":
                                b2 = 5;
                                break;
                            case "h2":
                                b2 = 6;
                                break;
                            case "h3":
                                b2 = 7;
                                break;
                            case "h4":
                                b2 = 8;
                                break;
                            case "h5":
                                b2 = 9;
                                break;
                            case "h6":
                                b2 = 10;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        c2046b.m5024d0(abstractC2053i, EnumC2047c.f4688d);
                        return true;
                    case 1:
                        if (!c2046b.m4997B(str6)) {
                            c2046b.m5046r(this);
                            c2046b.m5172h(str6);
                            return c2046b.mo5025e(fVar);
                        }
                        c2046b.m5051u(str6);
                        if (!c2046b.m5169b(str6)) {
                            c2046b.m5046r(this);
                        }
                        c2046b.m5019a0(str6);
                        return true;
                    case 2:
                        c2046b.m5046r(this);
                        c2046b.m5172h("br");
                        return false;
                    case 3:
                    case 4:
                        if (c2046b.m4998C(str6, null)) {
                            c2046b.m5051u(str6);
                            if (!c2046b.m5169b(str6)) {
                                c2046b.m5046r(this);
                            }
                            c2046b.m5019a0(str6);
                            return true;
                        }
                        c2046b.m5046r(this);
                        return false;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        String[] strArr = y.f4731i;
                        if (c2046b.m4999D(strArr)) {
                            c2046b.m5051u(str6);
                            if (!c2046b.m5169b(str6)) {
                                c2046b.m5046r(this);
                            }
                            for (int size4 = c2046b.f4895e.size() - 1; size4 >= 0; size4--) {
                                C2037i c2037i6 = c2046b.f4895e.get(size4);
                                c2046b.f4895e.remove(size4);
                                if (C1274b.m3172c(c2037i6.m4888h0(), strArr)) {
                                    return true;
                                }
                            }
                            return true;
                        }
                        c2046b.m5046r(this);
                        return false;
                    case 11:
                        if (c2046b.m4998C(str6, C2046b.f4671y)) {
                            c2046b.m5051u(str6);
                            if (!c2046b.m5169b(str6)) {
                                c2046b.m5046r(this);
                            }
                            c2046b.m5019a0(str6);
                            return true;
                        }
                        c2046b.m5046r(this);
                        return false;
                    case 12:
                        if (c2046b.m4998C("body", null)) {
                            m5064e(abstractC2053i, c2046b);
                            c2046b.m5049s0(EnumC2047c.f4703s);
                            return true;
                        }
                        c2046b.m5046r(this);
                        return false;
                    case 13:
                        if (!c2046b.m5016W("template")) {
                            C2039k c2039kM5054x2 = c2046b.m5054x();
                            c2046b.m5039n0();
                            if (c2039kM5054x2 != null && c2046b.m4998C(str6, null)) {
                                c2046b.m5052v(false);
                                if (!c2046b.m5169b(str6)) {
                                    c2046b.m5046r(this);
                                }
                                c2046b.m5032j0(c2039kM5054x2);
                                return true;
                            }
                        } else if (c2046b.m4998C(str6, null)) {
                            c2046b.m5052v(false);
                            if (!c2046b.m5169b(str6)) {
                                c2046b.m5046r(this);
                            }
                            c2046b.m5019a0(str6);
                            return true;
                        }
                        c2046b.m5046r(this);
                        return false;
                    case 14:
                        break;
                    default:
                        if (!C1274b.m3172c(str6, y.f4739q)) {
                            if (C1274b.m3172c(str6, y.f4738p)) {
                                if (c2046b.m4998C(str6, null)) {
                                    c2046b.m5052v(false);
                                    if (!c2046b.m5169b(str6)) {
                                        c2046b.m5046r(this);
                                    }
                                    c2046b.m5019a0(str6);
                                }
                            } else if (C1274b.m3172c(str6, y.f4734l)) {
                                if (!c2046b.m4998C("name", null)) {
                                    if (c2046b.m4998C(str6, null)) {
                                        c2046b.m5052v(false);
                                        if (!c2046b.m5169b(str6)) {
                                            c2046b.m5046r(this);
                                        }
                                        c2046b.m5019a0(str6);
                                        c2046b.m5035l();
                                    }
                                }
                            }
                            c2046b.m5046r(this);
                            return false;
                        }
                        String str7 = fVar.f4786e;
                        ArrayList<C2037i> arrayList5 = c2046b.f4895e;
                        int i2 = 0;
                        while (i2 < 8) {
                            C2037i c2037iM5053w = c2046b.m5053w(str7);
                            if (c2037iM5053w == null) {
                                return m5064e(abstractC2053i, c2046b);
                            }
                            if (!c2046b.m5015V(c2037iM5053w)) {
                                c2046b.m5046r(this);
                            } else {
                                if (!c2046b.m4998C(c2037iM5053w.m4888h0(), null)) {
                                    c2046b.m5046r(this);
                                    return false;
                                }
                                if (c2046b.m5168a() != c2037iM5053w) {
                                    c2046b.m5046r(this);
                                }
                                int size5 = arrayList5.size();
                                boolean z3 = false;
                                int iM5022c0 = -1;
                                Object r11 = 0;
                                int i3 = 1;
                                while (true) {
                                    if (i3 >= size5 || i3 >= 64) {
                                        c2037i = null;
                                    } else {
                                        c2037i = arrayList5.get(i3);
                                        if (c2037i == c2037iM5053w) {
                                            C2037i c2037i7 = arrayList5.get(i3 - 1);
                                            iM5022c0 = c2046b.m5022c0(c2037i);
                                            r11 = c2037i7;
                                            z3 = true;
                                        } else if (!z3 || !c2046b.m5011R(c2037i)) {
                                        }
                                        i3++;
                                        r11 = r11;
                                    }
                                }
                                if (c2037i == null) {
                                    c2046b.m5019a0(c2037iM5053w.m4888h0());
                                } else {
                                    C2037i c2037i8 = c2037i;
                                    Object r12 = c2037i8;
                                    int i4 = 0;
                                    Object r9 = c2037i8;
                                    while (i4 < 3) {
                                        if (c2046b.m5015V(r9)) {
                                            M5031j = r9;
                                            M5031j = c2046b.m5031j(r9);
                                        }
                                        M5031j = r9;
                                        if (!c2046b.m5010Q(M5031j)) {
                                            c2046b.m5032j0(M5031j);
                                        } else if (M5031j == c2037iM5053w) {
                                            String str8 = str7;
                                            if (r11 != 0) {
                                                if (C1274b.m3172c(r11.m4888h0(), y.f4740r)) {
                                                    if (r12.m4890j0() != null) {
                                                        r12.m4932C();
                                                    }
                                                    c2046b.m5007M(r12);
                                                } else {
                                                    if (r12.m4890j0() != null) {
                                                        r12.m4932C();
                                                    }
                                                    r11.m4869M(r12);
                                                }
                                            }
                                            C2037i c2037i9 = new C2037i(c2037iM5053w.m4900q0(), c2046b.f4896f, null);
                                            c2037i9.mo4883e().m4815e(c2037iM5053w.mo4883e());
                                            c2037i9.m4870N(c2037i.m4938i());
                                            c2037i.m4869M(c2037i9);
                                            c2046b.m5030i0(c2037iM5053w);
                                            c2046b.m5028g0(c2037i9, iM5022c0);
                                            c2046b.m5032j0(c2037iM5053w);
                                            iLastIndexOf = c2046b.f4895e.lastIndexOf(c2037i);
                                            if (iLastIndexOf != -1) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            C1271c.m3153c(z2);
                                            c2046b.f4895e.add(iLastIndexOf + 1, c2037i9);
                                            i2++;
                                            str7 = str8;
                                        } else {
                                            Object c2037i10 = new C2037i(c2046b.m5173i(M5031j.mo4832t(), C2050f.f4753d), c2046b.f4896f, null);
                                            c2046b.m5034k0(M5031j, c2037i10);
                                            ArrayList<C2037i> arrayList6 = c2046b.f4895e;
                                            int iLastIndexOf2 = arrayList6.lastIndexOf(M5031j);
                                            C1271c.m3153c(iLastIndexOf2 != -1);
                                            arrayList6.set(iLastIndexOf2, (C2037i) c2037i10);
                                            if (r12 == c2037i) {
                                                iM5022c0 = c2046b.m5022c0(c2037i10) + 1;
                                            }
                                            if (r12.m4890j0() != null) {
                                                r12.m4932C();
                                            }
                                            c2037i10.m4869M(r12);
                                            M5031j = c2037i10;
                                            r12 = M5031j;
                                        }
                                        i4++;
                                        str7 = str7;
                                        r9 = M5031j;
                                        r12 = r12;
                                    }
                                    String str9 = str7;
                                    if (r11 != 0) {
                                        if (C1274b.m3172c(r11.m4888h0(), y.f4740r)) {
                                            if (r12.m4890j0() != null) {
                                                r12.m4932C();
                                            }
                                            c2046b.m5007M(r12);
                                        } else {
                                            if (r12.m4890j0() != null) {
                                                r12.m4932C();
                                            }
                                            r11.m4869M(r12);
                                        }
                                    }
                                    C2037i c2037i11 = new C2037i(c2037iM5053w.m4900q0(), c2046b.f4896f, null);
                                    c2037i11.mo4883e().m4815e(c2037iM5053w.mo4883e());
                                    c2037i11.m4870N(c2037i.m4938i());
                                    c2037i.m4869M(c2037i11);
                                    c2046b.m5030i0(c2037iM5053w);
                                    c2046b.m5028g0(c2037i11, iM5022c0);
                                    c2046b.m5032j0(c2037iM5053w);
                                    iLastIndexOf = c2046b.f4895e.lastIndexOf(c2037i);
                                    if (iLastIndexOf != -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    C1271c.m3153c(z2);
                                    c2046b.f4895e.add(iLastIndexOf + 1, c2037i11);
                                    i2++;
                                    str7 = str9;
                                }
                            }
                            c2046b.m5030i0(c2037iM5053w);
                        }
                        return true;
                    case 15:
                    case 16:
                        return m5064e(abstractC2053i, c2046b);
                }
            }
        }

        /* JADX INFO: renamed from: e */
        final boolean m5064e(AbstractC2053i abstractC2053i, C2046b c2046b) {
            abstractC2053i.getClass();
            String str = ((AbstractC2053i.f) abstractC2053i).f4786e;
            ArrayList<C2037i> arrayList = c2046b.f4895e;
            if (c2046b.m5055y(str) == null) {
                c2046b.m5046r(this);
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C2037i c2037i = arrayList.get(size);
                if (c2037i.m4888h0().equals(str)) {
                    c2046b.m5051u(str);
                    if (!c2046b.m5169b(str)) {
                        c2046b.m5046r(this);
                    }
                    c2046b.m5019a0(str);
                    break;
                }
                if (c2046b.m5011R(c2037i)) {
                    c2046b.m5046r(this);
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$w */
    static final class w extends EnumC2047c {
        w() {
            super("Text", 7, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            if (abstractC2053i.m5093b()) {
                c2046b.m5003I((AbstractC2053i.b) abstractC2053i);
                return true;
            }
            if (abstractC2053i.m5096e()) {
                c2046b.m5046r(this);
                c2046b.m5018Z();
                c2046b.m5049s0(c2046b.m5017Y());
                return c2046b.mo5025e(abstractC2053i);
            }
            if (!abstractC2053i.m5097f()) {
                return true;
            }
            c2046b.m5018Z();
            c2046b.m5049s0(c2046b.m5017Y());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$x */
    static final class x extends EnumC2047c {
        x() {
            super("InTable", 8, null);
        }

        @Override // com.github.catvod.spider.support.p102H.EnumC2047c
        /* JADX INFO: renamed from: d */
        final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
            EnumC2047c enumC2047c;
            s sVar = EnumC2047c.f4688d;
            if (!abstractC2053i.m5093b() || !C1274b.m3172c(c2046b.m5168a().m4888h0(), y.f4711A)) {
                if (abstractC2053i.m5094c()) {
                    c2046b.m5004J((AbstractC2053i.c) abstractC2053i);
                    return true;
                }
                if (abstractC2053i.m5095d()) {
                    c2046b.m5046r(this);
                    return false;
                }
                if (!abstractC2053i.m5098g()) {
                    if (!abstractC2053i.m5097f()) {
                        if (!abstractC2053i.m5096e()) {
                            m5065e(abstractC2053i, c2046b);
                            return true;
                        }
                        if (c2046b.m5169b("html")) {
                            c2046b.m5046r(this);
                        }
                        return true;
                    }
                    String str = ((AbstractC2053i.f) abstractC2053i).f4786e;
                    if (str.equals("table")) {
                        if (!c2046b.m5001G(str)) {
                            c2046b.m5046r(this);
                            return false;
                        }
                        c2046b.m5019a0("table");
                        c2046b.m5037m0();
                    } else {
                        if (C1274b.m3172c(str, y.f4748z)) {
                            c2046b.m5046r(this);
                            return false;
                        }
                        if (!str.equals("template")) {
                            m5065e(abstractC2053i, c2046b);
                            return true;
                        }
                        c2046b.m5024d0(abstractC2053i, sVar);
                    }
                    return true;
                }
                AbstractC2053i.g gVar = (AbstractC2053i.g) abstractC2053i;
                String str2 = gVar.f4786e;
                if (str2.equals("caption")) {
                    c2046b.m5040o();
                    c2046b.m5008N();
                    c2046b.m5002H(gVar);
                    enumC2047c = EnumC2047c.f4695k;
                } else if (str2.equals("colgroup")) {
                    c2046b.m5040o();
                    c2046b.m5002H(gVar);
                    enumC2047c = EnumC2047c.f4696l;
                } else {
                    if (!str2.equals("col")) {
                        if (C1274b.m3172c(str2, y.f4741s)) {
                            c2046b.m5040o();
                            c2046b.m5002H(gVar);
                            enumC2047c = EnumC2047c.f4697m;
                        } else if (C1274b.m3172c(str2, y.f4742t)) {
                            c2046b.m5040o();
                            c2046b.m5172h("tbody");
                        } else {
                            if (str2.equals("table")) {
                                c2046b.m5046r(this);
                                if (!c2046b.m5001G(str2)) {
                                    return false;
                                }
                                c2046b.m5019a0(str2);
                                if (c2046b.m5037m0()) {
                                    return c2046b.mo5025e(abstractC2053i);
                                }
                                c2046b.m5002H(gVar);
                                return true;
                            }
                            if (C1274b.m3172c(str2, y.f4743u)) {
                                return c2046b.m5024d0(abstractC2053i, sVar);
                            }
                            if (str2.equals("input")) {
                                if (!gVar.m5118u() || !gVar.f4795n.m4819l("type").equalsIgnoreCase("hidden")) {
                                    m5065e(abstractC2053i, c2046b);
                                    return true;
                                }
                                c2046b.m5005K(gVar);
                            } else {
                                if (!str2.equals("form")) {
                                    m5065e(abstractC2053i, c2046b);
                                    return true;
                                }
                                c2046b.m5046r(this);
                                if (c2046b.m5054x() != null || c2046b.m5016W("template")) {
                                    return false;
                                }
                                c2046b.m5006L(gVar, false, false);
                            }
                        }
                        return true;
                    }
                    c2046b.m5040o();
                    c2046b.m5172h("colgroup");
                }
                c2046b.m5049s0(enumC2047c);
                return true;
            }
            c2046b.m5014U();
            c2046b.m5012S();
            c2046b.m5049s0(EnumC2047c.f4694j);
            return c2046b.mo5025e(abstractC2053i);
        }

        /* JADX INFO: renamed from: e */
        final void m5065e(AbstractC2053i abstractC2053i, C2046b c2046b) {
            c2046b.m5046r(this);
            c2046b.m5041o0(true);
            c2046b.m5024d0(abstractC2053i, EnumC2047c.f4691g);
            c2046b.m5041o0(false);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.c$y */
    static final class y {

        /* JADX INFO: renamed from: a */
        static final String[] f4723a = {"base", "basefont", "bgsound", "command", "link"};

        /* JADX INFO: renamed from: b */
        static final String[] f4724b = {"noframes", "style"};

        /* JADX INFO: renamed from: c */
        static final String[] f4725c = {"body", "br", "html"};

        /* JADX INFO: renamed from: d */
        static final String[] f4726d = {"body", "br", "html"};

        /* JADX INFO: renamed from: e */
        static final String[] f4727e = {"body", "br", "head", "html"};

        /* JADX INFO: renamed from: f */
        static final String[] f4728f = {"basefont", "bgsound", "link", "meta", "noframes", "style"};

        /* JADX INFO: renamed from: g */
        static final String[] f4729g = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};

        /* JADX INFO: renamed from: h */
        static final String[] f4730h = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};

        /* JADX INFO: renamed from: i */
        static final String[] f4731i = {"h1", "h2", "h3", "h4", "h5", "h6"};

        /* JADX INFO: renamed from: j */
        static final String[] f4732j = {"address", "div", "p"};

        /* JADX INFO: renamed from: k */
        static final String[] f4733k = {"dd", "dt"};

        /* JADX INFO: renamed from: l */
        static final String[] f4734l = {"applet", "marquee", "object"};

        /* JADX INFO: renamed from: m */
        static final String[] f4735m = {"param", "source", "track"};

        /* JADX INFO: renamed from: n */
        static final String[] f4736n = {"action", "name", "prompt"};

        /* JADX INFO: renamed from: o */
        static final String[] f4737o = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: p */
        static final String[] f4738p = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};

        /* JADX INFO: renamed from: q */
        static final String[] f4739q = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};

        /* JADX INFO: renamed from: r */
        static final String[] f4740r = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: s */
        static final String[] f4741s = {"tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: t */
        static final String[] f4742t = {"td", "th", "tr"};

        /* JADX INFO: renamed from: u */
        static final String[] f4743u = {"script", "style", "template"};

        /* JADX INFO: renamed from: v */
        static final String[] f4744v = {"td", "th"};

        /* JADX INFO: renamed from: w */
        static final String[] f4745w = {"body", "caption", "col", "colgroup", "html"};

        /* JADX INFO: renamed from: x */
        static final String[] f4746x = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: y */
        static final String[] f4747y = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: z */
        static final String[] f4748z = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: A */
        static final String[] f4711A = {"table", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: B */
        static final String[] f4712B = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: C */
        static final String[] f4713C = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};

        /* JADX INFO: renamed from: D */
        static final String[] f4714D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};

        /* JADX INFO: renamed from: E */
        static final String[] f4715E = {"body", "caption", "col", "colgroup", "html", "td", "th"};

        /* JADX INFO: renamed from: F */
        static final String[] f4716F = {"input", "keygen", "textarea"};

        /* JADX INFO: renamed from: G */
        static final String[] f4717G = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: H */
        static final String[] f4718H = {"tbody", "tfoot", "thead"};

        /* JADX INFO: renamed from: I */
        static final String[] f4719I = {"head", "noscript"};

        /* JADX INFO: renamed from: J */
        static final String[] f4720J = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* JADX INFO: renamed from: K */
        static final String[] f4721K = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};

        /* JADX INFO: renamed from: L */
        static final String[] f4722L = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.github.catvod.spider.support.p102H.c$p] */
    static {
        k kVar = new k();
        f4685a = kVar;
        q qVar = new q();
        f4686b = qVar;
        r rVar = new r();
        f4687c = rVar;
        s sVar = new s();
        f4688d = sVar;
        t tVar = new t();
        f4689e = tVar;
        u uVar = new u();
        f4690f = uVar;
        v vVar = new v();
        f4691g = vVar;
        w wVar = new w();
        f4692h = wVar;
        x xVar = new x();
        f4693i = xVar;
        a aVar = new a();
        f4694j = aVar;
        b bVar = new b();
        f4695k = bVar;
        c cVar = new c();
        f4696l = cVar;
        d dVar = new d();
        f4697m = dVar;
        e eVar = new e();
        f4698n = eVar;
        f fVar = new f();
        f4699o = fVar;
        g gVar = new g();
        f4700p = gVar;
        h hVar = new h();
        f4701q = hVar;
        i iVar = new i();
        f4702r = iVar;
        j jVar = new j();
        f4703s = jVar;
        l lVar = new l();
        f4704t = lVar;
        m mVar = new m();
        f4705u = mVar;
        n nVar = new n();
        f4706v = nVar;
        o oVar = new o();
        f4707w = oVar;
        Object r23 = new EnumC2047c() { // from class: com.github.catvod.spider.support.p102H.c.p
            @Override // com.github.catvod.spider.support.p102H.EnumC2047c
            /* JADX INFO: renamed from: d */
            final boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b) {
                return true;
            }
        };
        f4708x = r23;
        f4710z = new EnumC2047c[]{kVar, qVar, rVar, sVar, tVar, uVar, vVar, wVar, xVar, aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, lVar, mVar, nVar, oVar, r23};
        f4709y = String.valueOf((char) 0);
    }

    EnumC2047c(String str, int i2, k kVar) {
        super(str, i2);
    }

    /* JADX INFO: renamed from: a */
    static boolean m5057a(AbstractC2053i abstractC2053i) {
        if (abstractC2053i.m5093b()) {
            return C1274b.m3173d(((AbstractC2053i.b) abstractC2053i).m5102l());
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    static void m5058b(AbstractC2053i.g gVar, C2046b c2046b) {
        c2046b.f4893c.m5159v(EnumC2056l.f4854e);
        c2046b.m5012S();
        c2046b.m5049s0(f4692h);
        c2046b.m5002H(gVar);
    }

    public static EnumC2047c valueOf(String str) {
        return (EnumC2047c) Enum.valueOf(EnumC2047c.class, str);
    }

    public static EnumC2047c[] values() {
        return (EnumC2047c[]) f4710z.clone();
    }

    /* JADX INFO: renamed from: d */
    abstract boolean mo5060d(AbstractC2053i abstractC2053i, C2046b c2046b);
}
