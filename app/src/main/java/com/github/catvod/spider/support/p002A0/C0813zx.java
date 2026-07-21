package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zx */
/* JADX INFO: loaded from: classes.dex */
public final class C0813zx extends AbstractC0342il implements Iterable {

    /* JADX INFO: renamed from: f */
    public final ArrayList f1923f = new ArrayList();

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0342il
    /* JADX INFO: renamed from: a */
    public final double mo1317a() {
        return m1964g().mo1317a();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0342il
    /* JADX INFO: renamed from: b */
    public final int mo1318b() {
        return m1964g().mo1318b();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0342il
    /* JADX INFO: renamed from: d */
    public final long mo1320d() {
        return m1964g().mo1320d();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0342il
    /* JADX INFO: renamed from: e */
    public final String mo1321e() {
        return m1964g().mo1321e();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0813zx) && ((C0813zx) obj).f1923f.equals(this.f1923f));
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0342il m1964g() {
        ArrayList arrayList = this.f1923f;
        int size = arrayList.size();
        if (size == 1) {
            return (AbstractC0342il) arrayList.get(0);
        }
        throw new IllegalStateException(AbstractC0710wb.m1759c("Array must have size 1, but has size ", size));
    }

    public final int hashCode() {
        return this.f1923f.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1923f.iterator();
    }
}
