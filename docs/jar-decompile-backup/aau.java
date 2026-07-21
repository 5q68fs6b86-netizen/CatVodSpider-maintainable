package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class aau implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0226ed f455a;

    /* JADX INFO: renamed from: b */
    public AbstractC0272fw f456b;

    /* JADX INFO: renamed from: c */
    public AbstractC0272fw f457c;

    /* JADX INFO: renamed from: d */
    public AbstractC0272fw f458d;

    /* JADX INFO: renamed from: e */
    public AbstractC0272fw f459e;

    /* JADX INFO: renamed from: f */
    public final Class f460f;

    public aau(C0226ed c0226ed, Class cls) {
        AbstractC0711wc.m1770e(c0226ed);
        this.f460f = cls;
        if (cls.isInstance(c0226ed)) {
            this.f456b = c0226ed;
        }
        this.f457c = c0226ed;
        this.f458d = c0226ed;
        this.f455a = c0226ed;
        this.f459e = (C0226ed) c0226ed.f846ap;
    }

    /* JADX INFO: renamed from: g */
    public final void m903g() {
        AbstractC0272fw abstractC0272fw;
        if (this.f456b != null) {
            return;
        }
        if (this.f459e != null && this.f457c.f846ap == null) {
            this.f457c = this.f458d;
        }
        AbstractC0272fw abstractC0272fwMo1178w = this.f457c;
        do {
            abstractC0272fw = null;
            if (abstractC0272fwMo1178w.mo1172n() > 0) {
                abstractC0272fwMo1178w = (AbstractC0272fw) abstractC0272fwMo1178w.mo1175q().get(0);
            } else if (this.f455a.equals(abstractC0272fwMo1178w)) {
                abstractC0272fwMo1178w = null;
            } else if (abstractC0272fwMo1178w.m1231ax() != null) {
                abstractC0272fwMo1178w = abstractC0272fwMo1178w.m1231ax();
            } else {
                do {
                    abstractC0272fwMo1178w = abstractC0272fwMo1178w.mo1178w();
                    if (abstractC0272fwMo1178w == null || this.f455a.equals(abstractC0272fwMo1178w)) {
                    }
                    this.f456b = abstractC0272fw;
                } while (abstractC0272fwMo1178w.m1231ax() == null);
                abstractC0272fwMo1178w = abstractC0272fwMo1178w.m1231ax();
            }
            if (abstractC0272fwMo1178w == null) {
            }
            this.f456b = abstractC0272fw;
        } while (!this.f460f.isInstance(abstractC0272fwMo1178w));
        abstractC0272fw = abstractC0272fwMo1178w;
        this.f456b = abstractC0272fw;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m903g();
        return this.f456b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m903g();
        AbstractC0272fw abstractC0272fw = this.f456b;
        if (abstractC0272fw == null) {
            throw new NoSuchElementException();
        }
        this.f458d = this.f457c;
        this.f457c = abstractC0272fw;
        this.f459e = abstractC0272fw.mo1178w();
        this.f456b = null;
        return abstractC0272fw;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f457c.m1234ba();
    }
}
