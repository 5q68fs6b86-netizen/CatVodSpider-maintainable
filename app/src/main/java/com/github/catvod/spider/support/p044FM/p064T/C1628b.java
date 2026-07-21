package com.github.catvod.spider.support.p044FM.p064T;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p064T.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1628b {

    /* JADX INFO: renamed from: a */
    private Object f3715a;

    public C1628b(Object obj) {
        this.f3715a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final String m3827a() {
        Object obj = this.f3715a;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C1393m)) {
            return String.valueOf(obj);
        }
        C1393m c1393m = (C1393m) obj;
        String strM3483t0 = c1393m.m3483t0();
        return strM3483t0 == "JX_TEXT" || (strM3483t0 != null && strM3483t0.equals("JX_TEXT")) ? c1393m.m3471j0() : c1393m.mo3431t();
    }

    /* JADX INFO: renamed from: b */
    public final List<C1628b> m3828b(String str) {
        if (this.f3715a instanceof C1393m) {
            return new C1627a(new C1551g((C1393m) this.f3715a)).m3826a(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C1628b m3829c(String str) {
        List<C1628b> listM3828b = m3828b(str);
        if (listM3828b == null) {
            return null;
        }
        LinkedList linkedList = (LinkedList) listM3828b;
        if (linkedList.size() > 0) {
            return (C1628b) linkedList.get(0);
        }
        return null;
    }

    public final String toString() {
        return m3827a();
    }
}
