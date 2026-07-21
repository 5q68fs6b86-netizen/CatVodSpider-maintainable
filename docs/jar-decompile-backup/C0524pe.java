package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.pe */
/* JADX INFO: loaded from: classes.dex */
public class C0524pe implements Iterator, InterfaceC0717wi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1359a = 2;

    /* JADX INFO: renamed from: b */
    public int f1360b;

    /* JADX INFO: renamed from: c */
    public final Object f1361c;

    public C0524pe(C0231ei c0231ei) {
        this.f1361c = c0231ei.f778a.iterator();
        this.f1360b = c0231ei.f779b;
    }

    public C0524pe(AbstractC0527ph abstractC0527ph) {
        this.f1361c = abstractC0527ph;
    }

    public C0524pe(Object[] objArr) {
        AbstractC0399ko.m1351f("array", objArr);
        this.f1361c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f1359a) {
            case 0:
                return this.f1360b < ((AbstractC0527ph) this.f1361c).size();
            case 1:
                return this.f1360b < ((Object[]) this.f1361c).length;
        }
        while (true) {
            int i = this.f1360b;
            it = (Iterator) this.f1361c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f1360b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f1359a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f1360b;
                this.f1360b = i + 1;
                return ((AbstractC0527ph) this.f1361c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f1361c;
                    int i2 = this.f1360b;
                    this.f1360b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f1360b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
        while (true) {
            int i3 = this.f1360b;
            it = (Iterator) this.f1361c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f1360b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1359a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
