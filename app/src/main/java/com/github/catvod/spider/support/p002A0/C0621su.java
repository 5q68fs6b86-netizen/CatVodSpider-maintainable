package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.su */
/* JADX INFO: loaded from: classes.dex */
public final class C0621su extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1517a = 0;

    /* JADX INFO: renamed from: d */
    public final Object f1518d;

    /* JADX INFO: renamed from: e */
    public final Object f1519e;

    public C0621su(C0493oa c0493oa, Type type, AbstractC0406kv abstractC0406kv, InterfaceC0656ub interfaceC0656ub) {
        this.f1518d = new C0489nx(c0493oa, abstractC0406kv, type);
        this.f1519e = interfaceC0656ub;
    }

    public C0621su(C0730wv c0730wv, Class cls) {
        this.f1519e = c0730wv;
        this.f1518d = cls;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        switch (this.f1517a) {
            case 0:
                if (c0577rd.m1607ak() == 9) {
                    c0577rd.m1603ag();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC0656ub) this.f1519e).mo1338m();
                c0577rd.m1617p();
                while (c0577rd.m1625x()) {
                    collection.add(((AbstractC0406kv) ((C0489nx) this.f1518d).f1295e).mo900b(c0577rd));
                }
                c0577rd.m1621t();
                return collection;
            default:
                Object objMo900b = ((C0730wv) this.f1519e).f1771d.mo900b(c0577rd);
                if (objMo900b != null) {
                    Class cls = (Class) this.f1518d;
                    if (!cls.isInstance(objMo900b)) {
                        throw new C0765yc("Expected a " + cls.getName() + " but was " + objMo900b.getClass().getName() + "; at path " + c0577rd.m1624w(true));
                    }
                }
                return objMo900b;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        switch (this.f1517a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    aagVar.m885p();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C0489nx) this.f1518d).mo901c(aagVar, it.next());
                    }
                    aagVar.m888s();
                } else {
                    aagVar.m892w();
                }
                break;
            default:
                ((C0730wv) this.f1519e).f1771d.mo901c(aagVar, obj);
                break;
        }
    }
}
