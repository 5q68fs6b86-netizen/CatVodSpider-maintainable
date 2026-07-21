package com.github.catvod.spider.support.p104J;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p104J.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2067b {

    /* JADX INFO: renamed from: a */
    private Object f4942a;

    public C2067b(Object obj) {
        this.f4942a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final String m5196a() {
        Object obj = this.f4942a;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C2037i)) {
            return String.valueOf(obj);
        }
        C2037i c2037i = (C2037i) obj;
        String strM4901r0 = c2037i.m4901r0();
        return strM4901r0 == "JX_TEXT" || (strM4901r0 != null && strM4901r0.equals("JX_TEXT")) ? c2037i.m4889i0() : c2037i.mo4843u();
    }

    /* JADX INFO: renamed from: b */
    public final C2067b m5197b(String str) {
        List<C2067b> listM5195b = !(this.f4942a instanceof C2037i) ? null : new C2066a(new C2060c((C2037i) this.f4942a)).m5195b(str);
        if (listM5195b == null || listM5195b.size() <= 0) {
            return null;
        }
        return listM5195b.get(0);
    }

    public final String toString() {
        return m5196a();
    }
}
