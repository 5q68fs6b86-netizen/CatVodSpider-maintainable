package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.zr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0807zr {

    /* JADX INFO: renamed from: b */
    public static final C0737xb f1915b = new C0737xb("ZERO", 3);

    /* JADX INFO: renamed from: c */
    public static final void m1956c(InterfaceC0769yg interfaceC0769yg, Object obj) {
        if (obj == f1915b) {
            return;
        }
        if (obj instanceof C0161bt) {
            ((C0161bt) obj).getClass();
            interfaceC0769yg.fold(obj, C0632te.f1530e);
        } else {
            Object objFold = interfaceC0769yg.fold(null, C0632te.f1529d);
            if (objFold == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            AbstractC0710wb.m1763g(objFold);
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object m1957d(InterfaceC0769yg interfaceC0769yg, Object obj) {
        if (obj == null) {
            obj = interfaceC0769yg.fold(0, C0632te.f1528c);
            AbstractC0399ko.m1348c(obj);
        }
        if (obj == 0) {
            return f1915b;
        }
        if (obj instanceof Integer) {
            return interfaceC0769yg.fold(new C0161bt(interfaceC0769yg, ((Number) obj).intValue()), C0632te.f1531f);
        }
        AbstractC0710wb.m1763g(obj);
        throw null;
    }
}
