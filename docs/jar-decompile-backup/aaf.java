package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class aaf implements Iterable, InterfaceC0717wi {

    /* JADX INFO: renamed from: a */
    public final int f428a;

    /* JADX INFO: renamed from: b */
    public final int f429b;

    /* JADX INFO: renamed from: c */
    public final int f430c;

    public aaf(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f428a = i;
        this.f429b = AbstractC0702vu.m1751ao(i, i2, i3);
        this.f430c = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof aaf) {
            if (!isEmpty() || !((aaf) obj).isEmpty()) {
                aaf aafVar = (aaf) obj;
                if (this.f428a != aafVar.f428a || this.f429b != aafVar.f429b || this.f430c != aafVar.f430c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f428a * 31) + this.f429b) * 31) + this.f430c;
    }

    public boolean isEmpty() {
        int i = this.f430c;
        int i2 = this.f429b;
        int i3 = this.f428a;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0469nd(this.f428a, this.f429b, this.f430c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f429b;
        int i2 = this.f428a;
        int i3 = this.f430c;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
