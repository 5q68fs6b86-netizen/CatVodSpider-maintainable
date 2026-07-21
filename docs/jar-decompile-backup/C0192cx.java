package com.github.catvod.spider.support.p002A0;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.cx */
/* JADX INFO: loaded from: classes.dex */
public final class C0192cx extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0463my f721b;

    public /* synthetic */ C0192cx(C0463my c0463my, int i) {
        this.f720a = i;
        this.f721b = c0463my;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f720a) {
            case 0:
                this.f721b.clear();
                break;
            default:
                this.f721b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        adi adiVarM1443j;
        switch (this.f720a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                C0463my c0463my = this.f721b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                adi adiVar = null;
                if (key != null) {
                    try {
                        adiVarM1443j = c0463my.m1443j(key, false);
                    } catch (ClassCastException unused) {
                        adiVarM1443j = null;
                    }
                    break;
                } else {
                    adiVarM1443j = null;
                }
                if (adiVarM1443j != null && Objects.equals(adiVarM1443j.f614h, entry.getValue())) {
                    adiVar = adiVarM1443j;
                }
                return adiVar != null;
            default:
                return this.f721b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f720a) {
            case 0:
                return new C0756xu(this.f721b, 0);
            default:
                return new C0756xu(this.f721b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        adi adiVarM1443j;
        switch (this.f720a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C0463my c0463my = this.f721b;
                Object key = entry.getKey();
                adi adiVar = null;
                if (key != null) {
                    try {
                        adiVarM1443j = c0463my.m1443j(key, false);
                    } catch (ClassCastException unused) {
                        adiVarM1443j = null;
                    }
                    break;
                } else {
                    adiVarM1443j = null;
                }
                if (adiVarM1443j != null && Objects.equals(adiVarM1443j.f614h, entry.getValue())) {
                    adiVar = adiVarM1443j;
                }
                if (adiVar == null) {
                    return false;
                }
                c0463my.m1445l(adiVar, true);
                return true;
            default:
                C0463my c0463my2 = this.f721b;
                adi adiVarM1443j2 = null;
                if (obj != null) {
                    try {
                        adiVarM1443j2 = c0463my2.m1443j(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (adiVarM1443j2 != null) {
                    c0463my2.m1445l(adiVarM1443j2, true);
                }
                return adiVarM1443j2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f720a) {
            case 0:
                break;
        }
        return this.f721b.f1258e;
    }
}
