package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.nx */
/* JADX INFO: loaded from: classes.dex */
public final class C0489nx extends AbstractC0406kv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1293a;

    /* JADX INFO: renamed from: d */
    public final Object f1294d;

    /* JADX INFO: renamed from: e */
    public final Object f1295e;

    /* JADX INFO: renamed from: f */
    public final Object f1296f;

    public C0489nx(C0493oa c0493oa, AbstractC0406kv abstractC0406kv, Type type) {
        this.f1293a = 0;
        this.f1294d = c0493oa;
        this.f1295e = abstractC0406kv;
        this.f1296f = type;
    }

    public C0489nx(Class cls) {
        this.f1293a = 1;
        this.f1294d = new HashMap();
        this.f1295e = new HashMap();
        this.f1296f = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C0347iq(cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                InterfaceC0474ni interfaceC0474ni = (InterfaceC0474ni) field.getAnnotation(InterfaceC0474ni.class);
                if (interfaceC0474ni != null) {
                    strName = interfaceC0474ni.value();
                    for (String str : interfaceC0474ni.alternate()) {
                        ((HashMap) this.f1294d).put(str, r4);
                    }
                }
                ((HashMap) this.f1294d).put(strName, r4);
                ((HashMap) this.f1295e).put(string, r4);
                ((HashMap) this.f1296f).put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: b */
    public final Object mo900b(C0577rd c0577rd) throws IOException {
        switch (this.f1293a) {
            case 0:
                return ((AbstractC0406kv) this.f1295e).mo900b(c0577rd);
            default:
                if (c0577rd.m1607ak() == 9) {
                    c0577rd.m1603ag();
                    return null;
                }
                String strM1605ai = c0577rd.m1605ai();
                Enum r0 = (Enum) ((HashMap) this.f1294d).get(strM1605ai);
                return r0 == null ? (Enum) ((HashMap) this.f1295e).get(strM1605ai) : r0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0406kv
    /* JADX INFO: renamed from: c */
    public final void mo901c(aag aagVar, Object obj) throws IOException {
        AbstractC0406kv abstractC0406kvMo1416k;
        switch (this.f1293a) {
            case 0:
                Type type = (Type) this.f1296f;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                AbstractC0406kv abstractC0406kv = (AbstractC0406kv) this.f1295e;
                if (type2 != type) {
                    AbstractC0406kv abstractC0406kvM1471aa = ((C0493oa) this.f1294d).m1471aa(new C0259fj(type2));
                    if (abstractC0406kvM1471aa instanceof AbstractC0426lo) {
                        AbstractC0406kv abstractC0406kv2 = abstractC0406kv;
                        while ((abstractC0406kv2 instanceof AbstractC0673us) && (abstractC0406kvMo1416k = ((AbstractC0673us) abstractC0406kv2).mo1416k()) != abstractC0406kv2) {
                            abstractC0406kv2 = abstractC0406kvMo1416k;
                        }
                        if (abstractC0406kv2 instanceof AbstractC0426lo) {
                            abstractC0406kv = abstractC0406kvM1471aa;
                        }
                    } else {
                        abstractC0406kv = abstractC0406kvM1471aa;
                    }
                }
                abstractC0406kv.mo901c(aagVar, obj);
                break;
            default:
                Enum r6 = (Enum) obj;
                aagVar.m881ae(r6 == null ? null : (String) ((HashMap) this.f1296f).get(r6));
                break;
        }
    }
}
