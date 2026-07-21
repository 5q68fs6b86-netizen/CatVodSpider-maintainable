package com.github.catvod.spider.support.p102H;

import com.github.catvod.spider.support.p101G.C2030b;
import com.github.catvod.spider.support.p101G.C2034f;
import com.github.catvod.spider.support.p101G.C2037i;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: com.github.catvod.spider.support.p102H.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2057m {

    /* JADX INFO: renamed from: a */
    protected C2051g f4891a;

    /* JADX INFO: renamed from: b */
    C2045a f4892b;

    /* JADX INFO: renamed from: c */
    C2055k f4893c;

    /* JADX INFO: renamed from: d */
    protected C2034f f4894d;

    /* JADX INFO: renamed from: e */
    protected ArrayList<C2037i> f4895e;

    /* JADX INFO: renamed from: f */
    protected String f4896f;

    /* JADX INFO: renamed from: g */
    protected AbstractC2053i f4897g;

    /* JADX INFO: renamed from: h */
    protected C2050f f4898h;

    /* JADX INFO: renamed from: i */
    protected Map<String, C2052h> f4899i;

    /* JADX INFO: renamed from: j */
    private AbstractC2053i.g f4900j = new AbstractC2053i.g();

    /* JADX INFO: renamed from: k */
    private AbstractC2053i.f f4901k = new AbstractC2053i.f();

    AbstractC2057m() {
    }

    /* JADX INFO: renamed from: a */
    protected final C2037i m5168a() {
        int size = this.f4895e.size();
        return size > 0 ? this.f4895e.get(size - 1) : this.f4894d;
    }

    /* JADX INFO: renamed from: b */
    protected final boolean m5169b(String str) {
        C2037i c2037iM5168a;
        return (this.f4895e.size() == 0 || (c2037iM5168a = m5168a()) == null || !c2037iM5168a.m4888h0().equals(str)) ? false : true;
    }

    @ParametersAreNonnullByDefault
    /* JADX INFO: renamed from: c */
    protected void mo5021c(Reader reader, C2051g c2051g) {
        C2034f c2034f = new C2034f("");
        this.f4894d = c2034f;
        c2034f.m4847z0(c2051g);
        this.f4891a = c2051g;
        this.f4898h = C2050f.f4752c;
        C2045a c2045a = new C2045a(reader, 32768);
        this.f4892b = c2045a;
        c2045a.m4967O(c2051g.m5077c());
        this.f4897g = null;
        this.f4893c = new C2055k(this.f4892b, c2051g.m5075a());
        this.f4895e = new ArrayList<>(32);
        this.f4899i = new HashMap();
        this.f4896f = "";
    }

    /* JADX INFO: renamed from: d */
    protected abstract boolean mo5023d(String str);

    /* JADX INFO: renamed from: e */
    protected abstract boolean mo5025e(AbstractC2053i abstractC2053i);

    /* JADX INFO: renamed from: f */
    protected final boolean m5170f(String str) {
        AbstractC2053i abstractC2053i = this.f4897g;
        AbstractC2053i.f fVar = this.f4901k;
        if (abstractC2053i == fVar) {
            AbstractC2053i.f fVar2 = new AbstractC2053i.f();
            fVar2.m5119v(str);
            return mo5025e(fVar2);
        }
        fVar.mo5099h();
        fVar.m5119v(str);
        return mo5025e(fVar);
    }

    /* JADX INFO: renamed from: g */
    public boolean m5171g(C2030b c2030b) {
        String str;
        AbstractC2053i.g gVar = this.f4900j;
        if (this.f4897g == gVar) {
            gVar = new AbstractC2053i.g();
            gVar.f4785d = "input";
            gVar.f4795n = c2030b;
            str = "input";
        } else {
            gVar.mo5099h();
            gVar.f4785d = "input";
            gVar.f4795n = c2030b;
            str = "input";
        }
        gVar.f4786e = str;
        return mo5025e(gVar);
    }

    /* JADX INFO: renamed from: h */
    protected final boolean m5172h(String str) {
        AbstractC2053i.g gVar = this.f4900j;
        if (this.f4897g == gVar) {
            gVar = new AbstractC2053i.g();
        } else {
            gVar.mo5099h();
        }
        gVar.m5119v(str);
        return mo5025e(gVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p102H.h>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p102H.h>] */
    /* JADX INFO: renamed from: i */
    protected final C2052h m5173i(String str, C2050f c2050f) {
        C2052h c2052h = (C2052h) this.f4899i.get(str);
        if (c2052h != null) {
            return c2052h;
        }
        C2052h c2052hM5079m = C2052h.m5079m(str, c2050f);
        this.f4899i.put(str, c2052hM5079m);
        return c2052hM5079m;
    }
}
