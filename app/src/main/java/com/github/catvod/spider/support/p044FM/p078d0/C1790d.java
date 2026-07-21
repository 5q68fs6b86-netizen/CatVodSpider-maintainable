package com.github.catvod.spider.support.p044FM.p078d0;

import com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1756a;
import com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1757b;
import com.github.catvod.spider.support.p044FM.p076c0.C1771c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.d0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1790d implements InterfaceC1756a {

    /* JADX INFO: renamed from: a */
    boolean f4024a = false;

    /* JADX INFO: renamed from: b */
    final Map<String, C1789c> f4025b = new HashMap();

    /* JADX INFO: renamed from: c */
    final LinkedBlockingQueue<C1771c> f4026c = new LinkedBlockingQueue<>();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.d0.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.d0.c>] */
    @Override // com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1756a
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC1757b mo3993a(String str) {
        C1789c c1789c;
        c1789c = (C1789c) this.f4025b.get(str);
        if (c1789c == null) {
            c1789c = new C1789c(str, this.f4026c, this.f4024a);
            this.f4025b.put(str, c1789c);
        }
        return c1789c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.d0.c>] */
    /* JADX INFO: renamed from: b */
    public final void m4291b() {
        this.f4025b.clear();
        this.f4026c.clear();
    }

    /* JADX INFO: renamed from: c */
    public final LinkedBlockingQueue<C1771c> m4292c() {
        return this.f4026c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.d0.c>] */
    /* JADX INFO: renamed from: d */
    public final List<C1789c> m4293d() {
        return new ArrayList(this.f4025b.values());
    }

    /* JADX INFO: renamed from: e */
    public final void m4294e() {
        this.f4024a = true;
    }
}
