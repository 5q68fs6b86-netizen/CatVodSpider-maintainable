package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.qd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0550qd extends AbstractC0755xt {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f1393a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0550qd.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0535pp.f1372a;

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0755xt
    /* JADX INFO: renamed from: b */
    public final Object mo1574b(Object obj) {
        Object obj2 = this._consensus;
        C0737xb c0737xb = AbstractC0535pp.f1372a;
        if (obj2 == c0737xb) {
            C0737xb c0737xbMo1576d = mo1576d(obj);
            obj2 = this._consensus;
            if (obj2 == c0737xb) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1393a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0737xb, c0737xbMo1576d)) {
                    if (atomicReferenceFieldUpdater.get(this) != c0737xb) {
                        obj2 = this._consensus;
                    }
                }
                obj2 = c0737xbMo1576d;
            }
        }
        mo1575c(obj, obj2);
        return obj2;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo1575c(Object obj, Object obj2);

    /* JADX INFO: renamed from: d */
    public abstract C0737xb mo1576d(Object obj);
}
