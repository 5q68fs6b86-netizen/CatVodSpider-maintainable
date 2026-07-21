package com.github.catvod.spider.support.p044FM.p064T;

import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p052H.C1373a;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p065U.C1632D;
import com.github.catvod.spider.support.p044FM.p065U.C1634a;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.C1666g;
import com.github.catvod.spider.support.p044FM.p070Z.C1706a;
import com.github.catvod.spider.support.p044FM.p098x.C1930e;
import com.github.catvod.spider.support.p044FM.p098x.C1939n;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.T.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1627a {

    /* JADX INFO: renamed from: a */
    private C1551g f3714a;

    public C1627a(C1551g c1551g) {
        this.f3714a = c1551g;
    }

    /* JADX INFO: renamed from: a */
    public final List<C1628b> m3826a(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            C1632D c1632d = new C1632D(new C1939n(new C1634a(C1930e.m4668b(str))));
            c1632d.m4708t(new C1706a());
            C1665f c1665f = (C1665f) c1632d.m3839F().mo3232b(new C1666g(this.f3714a));
            if (c1665f == null) {
                linkedList.add(new C1628b(""));
                return linkedList;
            }
            if (c1665f.m3981n()) {
                Iterator<C1393m> it = c1665f.m3971d().iterator();
                while (it.hasNext()) {
                    linkedList.add(new C1628b(it.next()));
                }
                return linkedList;
            }
            if (c1665f.m3983p()) {
                Iterator<String> it2 = c1665f.m3972e().iterator();
                while (it2.hasNext()) {
                    linkedList.add(new C1628b(it2.next()));
                }
                return linkedList;
            }
            if (c1665f.m3985r()) {
                linkedList.add(new C1628b(c1665f.m3974g()));
                return linkedList;
            }
            if (c1665f.m3984q()) {
                Class clsM3986s = c1665f.m3986s();
                linkedList.add((clsM3986s.isAssignableFrom(Long.class) || clsM3986s.isAssignableFrom(Integer.class)) ? new C1628b(c1665f.m3973f()) : new C1628b(c1665f.m3970c()));
                return linkedList;
            }
            if (c1665f.m3979l()) {
                linkedList.add(new C1628b(c1665f.m3968a()));
                return linkedList;
            }
            if (c1665f.m3980m()) {
                linkedList.add(new C1628b(c1665f.m3969b()));
                return linkedList;
            }
            linkedList.add(new C1628b(c1665f.m3974g()));
            return linkedList;
        } catch (Exception e) {
            StringBuilder sbM3589b = C1434P.m3589b("Please check the syntax of your xpath expr or commit a ");
            sbM3589b.append(C1317a.m3302c(e));
            throw new C1373a(sbM3589b.toString(), e);
        }
    }
}
