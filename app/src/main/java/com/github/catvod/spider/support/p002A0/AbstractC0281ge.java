package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ge */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0281ge {
    private volatile int _size = 0;

    /* JADX INFO: renamed from: a */
    public AbstractRunnableC0494ob[] f856a;

    /* JADX INFO: renamed from: b */
    public final void m1243b(AbstractRunnableC0494ob abstractRunnableC0494ob) {
        C0419lh c0419lh = (C0419lh) this;
        if (abstractRunnableC0494ob.f1321d == AbstractC0611sk.f1493a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        abstractRunnableC0494ob.f1321d = c0419lh;
        AbstractRunnableC0494ob[] abstractRunnableC0494obArr = this.f856a;
        if (abstractRunnableC0494obArr == null) {
            abstractRunnableC0494obArr = new AbstractRunnableC0494ob[4];
            this.f856a = abstractRunnableC0494obArr;
        } else if (this._size >= abstractRunnableC0494obArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC0494obArr, this._size * 2);
            AbstractC0399ko.m1350e("java.util.Arrays.copyOf(this, newSize)", objArrCopyOf);
            abstractRunnableC0494obArr = (AbstractRunnableC0494ob[]) objArrCopyOf;
            this.f856a = abstractRunnableC0494obArr;
        }
        int i = this._size;
        this._size = i + 1;
        abstractRunnableC0494obArr[i] = abstractRunnableC0494ob;
        abstractRunnableC0494ob.f1322e = i;
        m1249h(i);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1244c() {
        return this._size == 0;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractRunnableC0494ob m1245d() {
        AbstractRunnableC0494ob abstractRunnableC0494ob;
        synchronized (this) {
            AbstractRunnableC0494ob[] abstractRunnableC0494obArr = this.f856a;
            abstractRunnableC0494ob = abstractRunnableC0494obArr != null ? abstractRunnableC0494obArr[0] : null;
        }
        return abstractRunnableC0494ob;
    }

    /* JADX INFO: renamed from: e */
    public final void m1246e(AbstractRunnableC0494ob abstractRunnableC0494ob) {
        synchronized (this) {
            Object obj = abstractRunnableC0494ob.f1321d;
            if (!(obj instanceof AbstractC0281ge)) {
                obj = null;
            }
            if (((AbstractC0281ge) obj) != null) {
                m1247f(abstractRunnableC0494ob.f1322e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x0031->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006d A[EDGE_INSN: B:28:0x006d->B:22:0x006d BREAK  A[LOOP:0: B:9:0x0031->B:21:0x0068], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:22:0x006d BREAK  A[LOOP:0: B:9:0x0031->B:21:0x0068], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final AbstractRunnableC0494ob m1247f(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f856a;
        AbstractC0399ko.m1348c(objArr2);
        this._size--;
        if (i < this._size) {
            m1250i(i, this._size);
            int i5 = (i - 1) / 2;
            if (i > 0) {
                AbstractRunnableC0494ob abstractRunnableC0494ob = objArr2[i];
                AbstractC0399ko.m1348c(abstractRunnableC0494ob);
                Object obj2 = objArr2[i5];
                AbstractC0399ko.m1348c(obj2);
                if (abstractRunnableC0494ob.compareTo(obj2) < 0) {
                    m1250i(i, i5);
                    m1249h(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= this._size) {
                            break;
                        }
                        objArr = this.f856a;
                        AbstractC0399ko.m1348c(objArr);
                        i4 = i2 + 2;
                        if (i4 < this._size) {
                            comparable3 = objArr[i4];
                            AbstractC0399ko.m1348c(comparable3);
                            obj = objArr[i3];
                            AbstractC0399ko.m1348c(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        AbstractC0399ko.m1348c(comparable);
                        comparable2 = objArr[i4];
                        AbstractC0399ko.m1348c(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        m1250i(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= this._size) {
                        break;
                        break;
                    }
                    objArr = this.f856a;
                    AbstractC0399ko.m1348c(objArr);
                    i4 = i2 + 2;
                    if (i4 < this._size) {
                        comparable3 = objArr[i4];
                        AbstractC0399ko.m1348c(comparable3);
                        obj = objArr[i3];
                        AbstractC0399ko.m1348c(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    AbstractC0399ko.m1348c(comparable);
                    comparable2 = objArr[i4];
                    AbstractC0399ko.m1348c(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    m1250i(i, i4);
                    i = i4;
                }
            }
        }
        AbstractRunnableC0494ob abstractRunnableC0494ob2 = objArr2[this._size];
        AbstractC0399ko.m1348c(abstractRunnableC0494ob2);
        if (abstractRunnableC0494ob2.f1321d == AbstractC0611sk.f1493a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        abstractRunnableC0494ob2.f1321d = null;
        abstractRunnableC0494ob2.f1322e = -1;
        objArr2[this._size] = null;
        return abstractRunnableC0494ob2;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractRunnableC0494ob m1248g() {
        AbstractRunnableC0494ob abstractRunnableC0494obM1247f;
        synchronized (this) {
            abstractRunnableC0494obM1247f = this._size > 0 ? m1247f(0) : null;
        }
        return abstractRunnableC0494obM1247f;
    }

    /* JADX INFO: renamed from: h */
    public final void m1249h(int i) {
        while (i > 0) {
            AbstractRunnableC0494ob[] abstractRunnableC0494obArr = this.f856a;
            AbstractC0399ko.m1348c(abstractRunnableC0494obArr);
            int i2 = (i - 1) / 2;
            AbstractRunnableC0494ob abstractRunnableC0494ob = abstractRunnableC0494obArr[i2];
            AbstractC0399ko.m1348c(abstractRunnableC0494ob);
            AbstractRunnableC0494ob abstractRunnableC0494ob2 = abstractRunnableC0494obArr[i];
            AbstractC0399ko.m1348c(abstractRunnableC0494ob2);
            if (abstractRunnableC0494ob.compareTo(abstractRunnableC0494ob2) <= 0) {
                return;
            }
            m1250i(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1250i(int i, int i2) {
        AbstractRunnableC0494ob[] abstractRunnableC0494obArr = this.f856a;
        AbstractC0399ko.m1348c(abstractRunnableC0494obArr);
        AbstractRunnableC0494ob abstractRunnableC0494ob = abstractRunnableC0494obArr[i2];
        AbstractC0399ko.m1348c(abstractRunnableC0494ob);
        AbstractRunnableC0494ob abstractRunnableC0494ob2 = abstractRunnableC0494obArr[i];
        AbstractC0399ko.m1348c(abstractRunnableC0494ob2);
        abstractRunnableC0494obArr[i] = abstractRunnableC0494ob;
        abstractRunnableC0494obArr[i2] = abstractRunnableC0494ob2;
        abstractRunnableC0494ob.f1322e = i;
        abstractRunnableC0494ob2.f1322e = i2;
    }
}
