package com.github.catvod.spider.support.p044FM.p055K;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.b */
/* JADX INFO: loaded from: classes.dex */
final class C1382b implements Iterator<C1381a> {

    /* JADX INFO: renamed from: a */
    int f3184a = 0;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1383c f3185b;

    C1382b(C1383c c1383c) {
        this.f3185b = c1383c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (this.f3184a < this.f3185b.f3186a) {
            C1383c c1383c = this.f3185b;
            if (!c1383c.m3385t(c1383c.f3187b[this.f3184a])) {
                break;
            }
            this.f3184a++;
        }
        return this.f3184a < this.f3185b.f3186a;
    }

    @Override // java.util.Iterator
    public final C1381a next() {
        C1383c c1383c = this.f3185b;
        String[] strArr = c1383c.f3187b;
        int i = this.f3184a;
        C1381a c1381a = new C1381a(strArr[i], (String) c1383c.f3188c[i], c1383c);
        this.f3184a++;
        return c1381a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1383c c1383c = this.f3185b;
        int i = this.f3184a - 1;
        this.f3184a = i;
        c1383c.m3386y(i);
    }
}
