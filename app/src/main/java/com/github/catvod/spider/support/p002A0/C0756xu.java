package com.github.catvod.spider.support.p002A0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.xu */
/* JADX INFO: loaded from: classes.dex */
public final class C0756xu implements Iterator {

    /* JADX INFO: renamed from: a */
    public adi f1817a;

    /* JADX INFO: renamed from: b */
    public adi f1818b = null;

    /* JADX INFO: renamed from: c */
    public int f1819c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0463my f1820d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1821e;

    public C0756xu(C0463my c0463my, int i) {
        this.f1821e = i;
        this.f1820d = c0463my;
        this.f1817a = c0463my.f1260g.f610d;
        this.f1819c = c0463my.f1259f;
    }

    /* JADX INFO: renamed from: f */
    public final Object m1879f() {
        return m1880g();
    }

    /* JADX INFO: renamed from: g */
    public final adi m1880g() {
        adi adiVar = this.f1817a;
        C0463my c0463my = this.f1820d;
        if (adiVar == c0463my.f1260g) {
            throw new NoSuchElementException();
        }
        if (c0463my.f1259f != this.f1819c) {
            throw new ConcurrentModificationException();
        }
        this.f1817a = adiVar.f610d;
        this.f1818b = adiVar;
        return adiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1817a != this.f1820d.f1260g;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f1821e) {
            case 1:
                return m1880g().f612f;
            default:
                return m1879f();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        adi adiVar = this.f1818b;
        if (adiVar == null) {
            throw new IllegalStateException();
        }
        C0463my c0463my = this.f1820d;
        c0463my.m1445l(adiVar, true);
        this.f1818b = null;
        this.f1819c = c0463my.f1259f;
    }
}
