package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.nd */
/* JADX INFO: loaded from: classes.dex */
public final class C0469nd implements Iterator, InterfaceC0717wi {

    /* JADX INFO: renamed from: a */
    public final int f1268a;

    /* JADX INFO: renamed from: b */
    public final int f1269b;

    /* JADX INFO: renamed from: c */
    public boolean f1270c;

    /* JADX INFO: renamed from: d */
    public int f1271d;

    public C0469nd(int i, int i2, int i3) {
        this.f1268a = i3;
        this.f1269b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f1270c = z;
        this.f1271d = z ? i : i2;
    }

    /* JADX INFO: renamed from: e */
    public final int m1455e() {
        int i = this.f1271d;
        if (i != this.f1269b) {
            this.f1271d = this.f1268a + i;
        } else {
            if (!this.f1270c) {
                throw new NoSuchElementException();
            }
            this.f1270c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1270c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(m1455e());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
