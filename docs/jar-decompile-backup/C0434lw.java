package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.lw */
/* JADX INFO: loaded from: classes.dex */
public final class C0434lw implements InterfaceC0698vq, Cloneable {

    /* JADX INFO: renamed from: b */
    public static final C0434lw f1204b = new C0434lw();

    /* JADX INFO: renamed from: c */
    public final List f1205c = Collections.emptyList();

    /* JADX INFO: renamed from: d */
    public final List f1206d = Collections.emptyList();

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0698vq
    /* JADX INFO: renamed from: a */
    public final AbstractC0406kv mo934a(C0493oa c0493oa, C0259fj c0259fj) {
        Class cls = c0259fj.f827a;
        boolean zM1418e = m1418e(cls, true);
        boolean zM1418e2 = m1418e(cls, false);
        if (zM1418e || zM1418e2) {
            return new C0440mb(this, zM1418e2, zM1418e, c0493oa, c0259fj);
        }
        return null;
    }

    public final Object clone() {
        try {
            return (C0434lw) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1418e(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            acs acsVar = AbstractC0173ce.f703a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f1205c : this.f1206d).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
