package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aao extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public final C0489nx f449a;

    /* JADX INFO: renamed from: d */
    public final C0489nx f450d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0656ub f451e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0622sv f452f;

    public aao(C0622sv c0622sv, C0493oa c0493oa, Type type, AbstractC0406kv abstractC0406kv, Type type2, AbstractC0406kv abstractC0406kv2, InterfaceC0656ub interfaceC0656ub) {
        this.f452f = c0622sv;
        this.f449a = new C0489nx(c0493oa, abstractC0406kv, type);
        this.f450d = new C0489nx(c0493oa, abstractC0406kv2, type2);
        this.f451e = interfaceC0656ub;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        int iM1607ak = c0577rd.m1607ak();
        if (iM1607ak == 9) {
            c0577rd.m1603ag();
            return null;
        }
        Map map = (Map) this.f451e.mo1338m();
        if (iM1607ak == 1) {
            c0577rd.m1617p();
            while (c0577rd.m1625x()) {
                c0577rd.m1617p();
                Object objMo900b = ((AbstractC0406kv) this.f449a.f1295e).mo900b(c0577rd);
                if (map.put(objMo900b, ((AbstractC0406kv) this.f450d.f1295e).mo900b(c0577rd)) != null) {
                    throw new C0765yc("duplicate key: " + objMo900b);
                }
                c0577rd.m1621t();
            }
            c0577rd.m1621t();
        } else {
            c0577rd.m1618q();
            while (c0577rd.m1625x()) {
                C0372jo.f1078j.getClass();
                int iM1620s = c0577rd.f1425g;
                if (iM1620s == 0) {
                    iM1620s = c0577rd.m1620s();
                }
                if (iM1620s == 13) {
                    c0577rd.f1425g = 9;
                } else if (iM1620s == 12) {
                    c0577rd.f1425g = 8;
                } else {
                    if (iM1620s != 14) {
                        throw c0577rd.m1616at("a name");
                    }
                    c0577rd.f1425g = 10;
                }
                Object objMo900b2 = ((AbstractC0406kv) this.f449a.f1295e).mo900b(c0577rd);
                if (map.put(objMo900b2, ((AbstractC0406kv) this.f450d.f1295e).mo900b(c0577rd)) != null) {
                    throw new C0765yc("duplicate key: " + objMo900b2);
                }
            }
            c0577rd.m1622u();
        }
        return map;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            aagVar.m892w();
            return;
        }
        this.f452f.getClass();
        C0489nx c0489nx = this.f450d;
        aagVar.m886q();
        for (Object __en : map.entrySet()) { Map.Entry entry = (Map.Entry) __en;
            aagVar.m890u(String.valueOf(entry.getKey()));
            c0489nx.mo901c(aagVar, entry.getValue());
        }
        aagVar.m889t();
    }
}
