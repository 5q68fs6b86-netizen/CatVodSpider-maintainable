package com.github.catvod.spider.support.p012C0.p030f0;

import com.github.catvod.spider.support.p012C0.p030f0.b;
import com.github.catvod.spider.support.p012C0.p031g0.a;
import com.github.catvod.spider.support.p012C0.p033h0.e;
import com.github.catvod.spider.support.p012C0.p033h0.f;
import com.github.catvod.spider.support.p012C0.p014P.AbstractC0975j;
import com.github.catvod.spider.support.p012C0.p014P.C0973e;
import com.github.catvod.spider.support.p012C0.p014P.C0974f;
import com.github.catvod.spider.support.p012C0.p014P.C0977m;
import com.github.catvod.spider.support.p012C0.p020W.C1013a;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;
import com.github.catvod.spider.support.p012C0.p029e0.C1211g;
import com.github.catvod.spider.support.p012C0.p031g0.C1232D;
import com.github.catvod.spider.support.p012C0.p037l.C1258u;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p030f0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1231a {

    /* JADX INFO: renamed from: a */
    private C1211g f2897a;

    public C1231a(C1211g c1211g) {
        this.f2897a = c1211g;
    }

    /* JADX INFO: renamed from: a */
    public final List<b> m3017a(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            C0973e c0973eM2410b = C0974f.m2410b(str.length());
            CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
            charBufferAllocate.put(str);
            charBufferAllocate.flip();
            c0973eM2410b.m2408a(charBufferAllocate);
            C1232D c1232d = new C1232D(new C0977m(new a(AbstractC0975j.m2418k(c0973eM2410b.m2409d()))));
            c1232d.m2447v(new com.github.catvod.spider.support.p012C0.l0.a());
            e eVar = (e) c1232d.m3025H().e(new f(this.f2897a));
            if (eVar.n()) {
                Iterator<C1053l> it = eVar.d().iterator();
                while (it.hasNext()) {
                    linkedList.add(new b(it.next()));
                }
                return linkedList;
            }
            if (eVar.p()) {
                Iterator it2 = eVar.e().iterator();
                while (it2.hasNext()) {
                    linkedList.add(new b((String) it2.next()));
                }
                return linkedList;
            }
            if (eVar.r()) {
                linkedList.add(new b(eVar.g()));
                return linkedList;
            }
            if (eVar.q()) {
                linkedList.add(new b(eVar.c()));
                return linkedList;
            }
            if (eVar.l()) {
                linkedList.add(new b(eVar.a()));
                return linkedList;
            }
            if (eVar.m()) {
                linkedList.add(new b(eVar.b()));
                return linkedList;
            }
            linkedList.add(new b(eVar.g()));
            return linkedList;
        } catch (Exception e) {
            StringBuilder sbM2774b = C1064d.m2774b("Please check the syntax of your xpath expr or commit a ");
            sbM2774b.append(C1013a.m2549b(e));
            throw new C1258u(sbM2774b.toString(), e);
        }
    }
}
