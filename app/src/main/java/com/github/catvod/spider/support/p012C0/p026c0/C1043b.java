package com.github.catvod.spider.support.p012C0.p026c0;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.c0.b */
/* JADX INFO: loaded from: classes.dex */
final class C1043b implements Iterator<C1042a> {

    /* JADX INFO: renamed from: a */
    int f2562a = 0;

    /* JADX INFO: renamed from: b */
    final C1044c f2563b;

    C1043b(C1044c c1044c) {
        this.f2563b = c1044c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (this.f2562a < this.f2563b.f2564c) {
            C1044c c1044c = this.f2563b;
            if (!c1044c.m2638q(c1044c.f2565d[this.f2562a])) {
                break;
            }
            this.f2562a++;
        }
        return this.f2562a < this.f2563b.f2564c;
    }

    @Override // java.util.Iterator
    public final C1042a next() {
        C1044c c1044c = this.f2563b;
        String[] strArr = c1044c.f2565d;
        int i = this.f2562a;
        C1042a c1042a = new C1042a(strArr[i], c1044c.f2566e[i], c1044c);
        this.f2562a++;
        return c1042a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1044c c1044c = this.f2563b;
        int i = this.f2562a - 1;
        this.f2562a = i;
        c1044c.m2639v(i);
    }
}
