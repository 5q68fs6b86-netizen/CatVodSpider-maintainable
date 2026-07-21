package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zt */
/* JADX INFO: loaded from: classes.dex */
public class C0809zt {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f1920a = AtomicReferenceFieldUpdater.newUpdater(C0809zt.class, Object.class, "_cur");
    private volatile Object _cur = new C0501oi(8, false);

    /* JADX INFO: renamed from: b */
    public final boolean m1958b(adf adfVar) {
        while (true) {
            C0501oi c0501oi = (C0501oi) this._cur;
            int iM1481h = c0501oi.m1481h(adfVar);
            if (iM1481h == 0) {
                return true;
            }
            if (iM1481h == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1920a;
                C0501oi c0501oiM1485l = c0501oi.m1485l();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0501oi, c0501oiM1485l) && atomicReferenceFieldUpdater.get(this) == c0501oi) {
                }
            } else if (iM1481h == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1959c() {
        while (true) {
            C0501oi c0501oi = (C0501oi) this._cur;
            if (c0501oi.m1482i()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1920a;
            C0501oi c0501oiM1485l = c0501oi.m1485l();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0501oi, c0501oiM1485l) && atomicReferenceFieldUpdater.get(this) == c0501oi) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m1960d() {
        return ((C0501oi) this._cur).m1483j();
    }

    /* JADX INFO: renamed from: e */
    public final Object m1961e() {
        while (true) {
            C0501oi c0501oi = (C0501oi) this._cur;
            Object objM1486m = c0501oi.m1486m();
            if (objM1486m != C0501oi.f1329c) {
                return objM1486m;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1920a;
            C0501oi c0501oiM1485l = c0501oi.m1485l();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0501oi, c0501oiM1485l) && atomicReferenceFieldUpdater.get(this) == c0501oi) {
            }
        }
    }
}
