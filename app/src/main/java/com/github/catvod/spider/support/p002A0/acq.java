package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class acq implements Iterator, InterfaceC0717wi {

    /* JADX INFO: renamed from: a */
    public int f569a = -1;

    /* JADX INFO: renamed from: b */
    public int f570b;

    /* JADX INFO: renamed from: c */
    public int f571c;

    /* JADX INFO: renamed from: d */
    public add f572d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ acr f573e;

    public acq(acr acrVar) {
        this.f573e = acrVar;
        acrVar.getClass();
        int iM1871h = AbstractC0745xj.m1871h(0, 0, ((String) acrVar.f576c).length());
        this.f570b = iM1871h;
        this.f571c = iM1871h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.github.catvod.spider.support.p002A0.ha, com.github.catvod.spider.support.p002A0.zy] */
    /* JADX INFO: renamed from: f */
    public final void m952f() {
        C0344in c0344in;
        int i = this.f571c;
        if (i < 0) {
            this.f569a = 0;
            this.f572d = null;
            return;
        }
        acr acrVar = this.f573e;
        acrVar.getClass();
        String str = (String) acrVar.f576c;
        if (i <= str.length() && (c0344in = (C0344in) acrVar.f575b.invoke(str, Integer.valueOf(this.f571c))) != null) {
            int iIntValue = ((Number) c0344in.f1014a).intValue();
            int iIntValue2 = ((Number) c0344in.f1015b).intValue();
            this.f572d = AbstractC0745xj.m1874k(this.f570b, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.f570b = i2;
            this.f571c = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f572d = new add(this.f570b, AbstractC0198dc.m1097e(str), 1);
            this.f571c = -1;
        }
        this.f569a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f569a == -1) {
            m952f();
        }
        return this.f569a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f569a == -1) {
            m952f();
        }
        if (this.f569a == 0) {
            throw new NoSuchElementException();
        }
        add addVar = this.f572d;
        AbstractC0399ko.m1349d("null cannot be cast to non-null type kotlin.ranges.IntRange", addVar);
        this.f572d = null;
        this.f569a = -1;
        return addVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
