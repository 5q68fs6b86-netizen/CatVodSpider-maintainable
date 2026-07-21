package com.github.catvod.spider.support.p104J;

import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p041D.C1266a;
import com.github.catvod.spider.support.p041D.C1267b;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p105K.C2069b;
import com.github.catvod.spider.support.p105K.C2071d;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.C2079g;
import com.github.catvod.spider.support.p110P.C2118a;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p134t.C2312e;
import com.github.catvod.spider.support.p134t.C2318k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p104J.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2066a {

    /* JADX INFO: renamed from: a */
    private C2060c f4941a;

    public C2066a(C2060c c2060c) {
        this.f4941a = c2060c;
    }

    /* JADX INFO: renamed from: a */
    public static C2066a m5194a(String str) {
        return new C2066a(C1266a.m3149a(str).m4876V());
    }

    /* JADX INFO: renamed from: b */
    public final List<C2067b> m5195b(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            C2071d c2071d = new C2071d(new C2318k(new C2069b(C2312e.m6242a(str))));
            c2071d.m6287s(new C2118a());
            C2078f c2078f = (C2078f) c2071d.m5258E().mo5281a(new C2079g(this.f4941a));
            if (c2078f == null) {
                linkedList.add(new C2067b(""));
                return linkedList;
            }
            if (c2078f.m5350n()) {
                Iterator<C2037i> it = c2078f.m5340d().iterator();
                while (it.hasNext()) {
                    linkedList.add(new C2067b(it.next()));
                }
                return linkedList;
            }
            if (c2078f.m5352p()) {
                Iterator<String> it2 = c2078f.m5341e().iterator();
                while (it2.hasNext()) {
                    linkedList.add(new C2067b(it2.next()));
                }
                return linkedList;
            }
            if (c2078f.m5354r()) {
                linkedList.add(new C2067b(c2078f.m5343g()));
                return linkedList;
            }
            if (c2078f.m5353q()) {
                Class clsM5355s = c2078f.m5355s();
                linkedList.add((clsM5355s.isAssignableFrom(Long.class) || clsM5355s.isAssignableFrom(Integer.class)) ? new C2067b(c2078f.m5342f()) : new C2067b(c2078f.m5339c()));
                return linkedList;
            }
            if (c2078f.m5348l()) {
                linkedList.add(new C2067b(c2078f.m5337a()));
                return linkedList;
            }
            if (c2078f.m5349m()) {
                linkedList.add(new C2067b(c2078f.m5338b()));
                return linkedList;
            }
            linkedList.add(new C2067b(c2078f.m5343g()));
            return linkedList;
        } catch (Exception e) {
            StringBuilder sbM5396a = C2137a.m5396a("Please check the syntax of your xpath expr or commit a ");
            sbM5396a.append(C0082a.m817b(e));
            throw new C1267b(sbM5396a.toString(), e);
        }
    }
}
