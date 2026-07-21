package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ei */
/* JADX INFO: loaded from: classes.dex */
public final class C0231ei implements InterfaceC0319hp {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0319hp f778a;

    /* JADX INFO: renamed from: b */
    public final int f779b;

    public C0231ei(InterfaceC0319hp interfaceC0319hp, int i) {
        this.f778a = interfaceC0319hp;
        this.f779b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0319hp
    public final Iterator iterator() {
        return new C0524pe(this);
    }
}
