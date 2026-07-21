package com.github.catvod.spider.support.p002A0;

import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.cw */
/* JADX INFO: loaded from: classes.dex */
public final class C0191cw {

    /* JADX INFO: renamed from: a */
    public Object f719a;

    /* JADX INFO: renamed from: b */
    public static C0191cw m1089b(Object obj) {
        C0191cw c0191cw = new C0191cw();
        c0191cw.f719a = obj;
        return c0191cw;
    }

    /* JADX INFO: renamed from: c */
    public final String m1090c() {
        Object obj = this.f719a;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C0226ed)) {
            return String.valueOf(obj);
        }
        C0226ed c0226ed = (C0226ed) obj;
        return Objects.equals(c0226ed.f771g.f589b, "JX_TEXT") ? c0226ed.m1165ag() : c0226ed.mo1192an();
    }

    /* JADX INFO: renamed from: d */
    public final C0191cw m1091d(String str) {
        Object obj = this.f719a;
        LinkedList linkedListM1860h = !(obj instanceof C0226ed) ? null : new C0736xa(4, new C0589rp((C0226ed) obj)).m1860h(str);
        if (linkedListM1860h == null || linkedListM1860h.size() <= 0) {
            return null;
        }
        return (C0191cw) linkedListM1860h.get(0);
    }

    public final String toString() {
        return m1090c();
    }
}
