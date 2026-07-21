package com.github.catvod.spider.support.p109O;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p101G.AbstractC2041m;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p101G.C2044p;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p103I.InterfaceC2062e;
import com.github.catvod.spider.support.p106L.C2077e;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2076d;
import com.github.catvod.spider.support.p128m.C2261d;
import com.github.catvod.spider.support.p139y.C2423f;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.O.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2117f implements InterfaceC2076d {

    /* JADX INFO: renamed from: com.github.catvod.spider.support.O.f$a */
    final class a implements InterfaceC2062e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f4973a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C2060c f4974b;

        a(Map map, C2060c c2060c) {
            this.f4973a = map;
            this.f4974b = c2060c;
        }

        @Override // com.github.catvod.spider.support.p103I.InterfaceC2062e
        /* JADX INFO: renamed from: a */
        public final void mo4858a(AbstractC2041m abstractC2041m, int i) {
        }

        @Override // com.github.catvod.spider.support.p103I.InterfaceC2062e
        /* JADX INFO: renamed from: b */
        public final void mo4859b(AbstractC2041m abstractC2041m, int i) {
            if (abstractC2041m instanceof C2044p) {
                C2044p c2044p = (C2044p) abstractC2041m;
                String str = i + "_" + c2044p.mo4905z().hashCode();
                Integer num = (Integer) this.f4973a.get(str);
                Integer numValueOf = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
                this.f4973a.put(str, numValueOf);
                C2037i c2037i = new C2037i("JX_TEXT");
                c2037i.mo4842s0(c2044p.m4947L());
                c2037i.mo4928c("EL_DEPTH", str);
                try {
                    Method declaredMethod = AbstractC2041m.class.getDeclaredMethod("setParentNode", AbstractC2041m.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(c2037i, c2044p.mo4905z());
                } catch (Exception unused) {
                }
                C2261d.m6144d(c2037i, numValueOf.intValue());
                this.f4974b.add(c2037i);
            }
        }
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2076d
    /* JADX INFO: renamed from: a */
    public final C2078f mo5325a(C2077e c2077e) {
        Integer num;
        C2060c c2060cM5329a = c2077e.m5329a();
        C2060c c2060c = new C2060c();
        HashMap map = new HashMap();
        if (c2060cM5329a != null && c2060cM5329a.size() > 0) {
            if (c2077e.m5331f()) {
                Iterator<C2037i> it = c2060cM5329a.iterator();
                while (it.hasNext()) {
                    C1273a.m3167g(new a(map, c2060c), it.next());
                }
                for (C2037i c2037i : c2060c) {
                    String strMo4929d = c2037i.mo4929d("EL_DEPTH");
                    if (C2423f.m6440d(strMo4929d) && (num = (Integer) map.get(strMo4929d)) != null) {
                        C2261d.m6145e(c2037i, num.intValue());
                    }
                }
            } else {
                for (C2037i c2037i2 : c2060cM5329a) {
                    if ("script".equals(c2037i2.mo4832t())) {
                        C2037i c2037i3 = new C2037i("JX_TEXT");
                        c2037i3.mo4842s0(c2037i2.m4877X());
                        C2261d.m6144d(c2037i3, 1);
                        C2261d.m6145e(c2037i3, 1);
                        c2060c.add(c2037i3);
                    } else {
                        List<C2044p> listM4903u0 = c2037i2.m4903u0();
                        int i = 0;
                        while (i < listM4903u0.size()) {
                            C2044p c2044p = listM4903u0.get(i);
                            C2037i c2037i4 = new C2037i("JX_TEXT");
                            c2037i4.mo4842s0(c2044p.m4947L());
                            i++;
                            C2261d.m6144d(c2037i4, i);
                            C2261d.m6145e(c2037i4, listM4903u0.size());
                            c2060c.add(c2037i4);
                        }
                    }
                }
            }
        }
        return new C2078f(c2060c);
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2076d
    public final String name() {
        return "text";
    }
}
