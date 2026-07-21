package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.qa */
/* JADX INFO: loaded from: classes.dex */
public final class C0547qa extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public static final C0545pz f1389a = new C0545pz();

    /* JADX INFO: renamed from: d */
    public final Class f1390d;

    /* JADX INFO: renamed from: e */
    public final C0489nx f1391e;

    public C0547qa(C0493oa c0493oa, AbstractC0406kv abstractC0406kv, Class cls) {
        this.f1391e = new C0489nx(c0493oa, abstractC0406kv, cls);
        this.f1390d = cls;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        if (c0577rd.m1607ak() == 9) {
            c0577rd.m1603ag();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c0577rd.m1617p();
        while (c0577rd.m1625x()) {
            arrayList.add(((AbstractC0406kv) this.f1391e.f1295e).mo900b(c0577rd));
        }
        c0577rd.m1621t();
        int size = arrayList.size();
        Class cls = this.f1390d;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        if (obj == null) {
            aagVar.m892w();
            return;
        }
        aagVar.m885p();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f1391e.mo901c(aagVar, Array.get(obj, i));
        }
        aagVar.m888s();
    }
}
