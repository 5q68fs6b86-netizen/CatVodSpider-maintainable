package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.td */
/* JADX INFO: loaded from: classes.dex */
public final class C0631td implements InterfaceC0319hp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1525b;

    public /* synthetic */ C0631td(int i, Object obj) {
        this.f1524a = i;
        this.f1525b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0631td(InterfaceC0304ha interfaceC0304ha) {
        this.f1524a = 1;
        this.f1525b = (AbstractC0168c) interfaceC0304ha;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0319hp
    public final Iterator iterator() {
        switch (this.f1524a) {
            case 0:
                return ((List) this.f1525b).iterator();
            case 1:
                AbstractC0168c abstractC0168c = (AbstractC0168c) this.f1525b;
                C0665uk c0665uk = new C0665uk();
                c0665uk.f1575c = abstractC0168c.create(c0665uk, c0665uk);
                return c0665uk;
            default:
                return (Iterator) this.f1525b;
        }
    }
}
