package com.github.catvod.spider.support.p114T;

import com.github.catvod.spider.support.p112R.InterfaceC2124a;
import com.github.catvod.spider.support.p112R.InterfaceC2125b;
import com.github.catvod.spider.support.p113S.C2129c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p114T.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2133d implements InterfaceC2124a {

    /* JADX INFO: renamed from: a */
    boolean f4997a = false;

    /* JADX INFO: renamed from: b */
    final Map<String, C2132c> f4998b = new HashMap();

    /* JADX INFO: renamed from: c */
    final LinkedBlockingQueue<C2129c> f4999c = new LinkedBlockingQueue<>();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p114T.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p114T.c>] */
    @Override // com.github.catvod.spider.support.p112R.InterfaceC2124a
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC2125b mo850a(String str) {
        C2132c c2132c;
        c2132c = (C2132c) this.f4998b.get(str);
        if (c2132c == null) {
            c2132c = new C2132c(str, this.f4999c, this.f4997a);
            this.f4998b.put(str, c2132c);
        }
        return c2132c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p114T.c>] */
    /* JADX INFO: renamed from: b */
    public final void m5383b() {
        this.f4998b.clear();
        this.f4999c.clear();
    }

    /* JADX INFO: renamed from: c */
    public final LinkedBlockingQueue<C2129c> m5384c() {
        return this.f4999c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.p114T.c>] */
    /* JADX INFO: renamed from: d */
    public final List<C2132c> m5385d() {
        return new ArrayList(this.f4998b.values());
    }

    /* JADX INFO: renamed from: e */
    public final void m5386e() {
        this.f4997a = true;
    }
}
