package com.github.catvod.spider.support.p111Q;

import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p106L.InterfaceC2073a;
import com.github.catvod.spider.support.p106L.InterfaceC2075c;
import com.github.catvod.spider.support.p106L.InterfaceC2076d;
import com.github.catvod.spider.support.p107M.C2080a;
import com.github.catvod.spider.support.p107M.C2081b;
import com.github.catvod.spider.support.p107M.C2082c;
import com.github.catvod.spider.support.p107M.C2083d;
import com.github.catvod.spider.support.p107M.C2084e;
import com.github.catvod.spider.support.p107M.C2085f;
import com.github.catvod.spider.support.p107M.C2086g;
import com.github.catvod.spider.support.p107M.C2087h;
import com.github.catvod.spider.support.p107M.C2088i;
import com.github.catvod.spider.support.p107M.C2089j;
import com.github.catvod.spider.support.p107M.C2090k;
import com.github.catvod.spider.support.p107M.C2091l;
import com.github.catvod.spider.support.p107M.C2092m;
import com.github.catvod.spider.support.p107M.C2093n;
import com.github.catvod.spider.support.p108N.C2094a;
import com.github.catvod.spider.support.p108N.C2095b;
import com.github.catvod.spider.support.p108N.C2096c;
import com.github.catvod.spider.support.p108N.C2097d;
import com.github.catvod.spider.support.p108N.C2098e;
import com.github.catvod.spider.support.p108N.C2099f;
import com.github.catvod.spider.support.p108N.C2100g;
import com.github.catvod.spider.support.p108N.C2101h;
import com.github.catvod.spider.support.p108N.C2102i;
import com.github.catvod.spider.support.p108N.C2103j;
import com.github.catvod.spider.support.p108N.C2104k;
import com.github.catvod.spider.support.p108N.C2105l;
import com.github.catvod.spider.support.p108N.C2106m;
import com.github.catvod.spider.support.p108N.C2107n;
import com.github.catvod.spider.support.p108N.C2108o;
import com.github.catvod.spider.support.p108N.C2109p;
import com.github.catvod.spider.support.p108N.C2111r;
import com.github.catvod.spider.support.p109O.C2112a;
import com.github.catvod.spider.support.p109O.C2113b;
import com.github.catvod.spider.support.p109O.C2114c;
import com.github.catvod.spider.support.p109O.C2115d;
import com.github.catvod.spider.support.p109O.C2116e;
import com.github.catvod.spider.support.p109O.C2117f;
import com.github.catvod.spider.support.p110P.C2119b;
import com.github.catvod.spider.support.p110P.C2120c;
import com.github.catvod.spider.support.p112R.C2126c;
import com.github.catvod.spider.support.p112R.InterfaceC2125b;
import com.github.catvod.spider.support.p116a.C2139c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p111Q.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2123a {

    /* JADX INFO: renamed from: a */
    private static Map<String, InterfaceC2073a> f4975a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static Map<String, InterfaceC2076d> f4976b = new HashMap();

    /* JADX INFO: renamed from: c */
    private static Map<String, InterfaceC2075c> f4977c = new HashMap();

    /* JADX INFO: renamed from: d */
    private static InterfaceC2125b f4978d = C2126c.m5370d(C2123a.class);

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p106L.c>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p106L.a>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p106L.d>] */
    static {
        Class[] clsArr = {C2080a.class, C2081b.class, C2082c.class, C2083d.class, C2084e.class, C2085f.class, C2086g.class, C2087h.class, C2088i.class, C2089j.class, C2090k.class, C2091l.class, C2092m.class, C2093n.class};
        int i = 0;
        for (int i2 = 14; i < i2; i2 = 14) {
            try {
                InterfaceC2073a interfaceC2073a = (InterfaceC2073a) clsArr[i].newInstance();
                f4975a.put(interfaceC2073a.name(), interfaceC2073a);
            } catch (Exception e) {
                f4978d.mo5366a(C0082a.m817b(e), e);
            }
            i++;
        }
        Class[] clsArr2 = {C2094a.class, C2095b.class, C2096c.class, C2097d.class, C2099f.class, C2100g.class, C2101h.class, C2102i.class, C2103j.class, C2104k.class, C2105l.class, C2107n.class, C2109p.class, C2098e.class, C2106m.class, C2108o.class, C2111r.class};
        for (int i3 = 0; i3 < 17; i3++) {
            try {
                InterfaceC2075c interfaceC2075c = (InterfaceC2075c) clsArr2[i3].newInstance();
                f4977c.put(interfaceC2075c.name(), interfaceC2075c);
            } catch (Exception e2) {
                f4978d.mo5366a(C0082a.m817b(e2), e2);
            }
        }
        Class[] clsArr3 = {C2112a.class, C2113b.class, C2114c.class, C2115d.class, C2116e.class, C2117f.class};
        for (int i4 = 0; i4 < 6; i4++) {
            try {
                InterfaceC2076d interfaceC2076d = (InterfaceC2076d) clsArr3[i4].newInstance();
                f4976b.put(interfaceC2076d.name(), interfaceC2076d);
            } catch (Exception e3) {
                f4978d.mo5366a(C0082a.m817b(e3), e3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p106L.c>] */
    /* JADX INFO: renamed from: a */
    public static InterfaceC2075c m5363a(String str) {
        InterfaceC2075c interfaceC2075c = (InterfaceC2075c) f4977c.get(str);
        if (interfaceC2075c != null) {
            return interfaceC2075c;
        }
        throw new C2120c(C2139c.m5408a("not support function: ", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p106L.d>] */
    /* JADX INFO: renamed from: b */
    public static InterfaceC2076d m5364b(String str) {
        InterfaceC2076d interfaceC2076d = (InterfaceC2076d) f4976b.get(str);
        if (interfaceC2076d != null) {
            return interfaceC2076d;
        }
        throw new C2120c(C2139c.m5408a("not support nodeTest: ", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p106L.a>] */
    /* JADX INFO: renamed from: c */
    public static InterfaceC2073a m5365c(String str) {
        InterfaceC2073a interfaceC2073a = (InterfaceC2073a) f4975a.get(str);
        if (interfaceC2073a != null) {
            return interfaceC2073a;
        }
        throw new C2119b(C2139c.m5408a("not support axis: ", str));
    }
}
