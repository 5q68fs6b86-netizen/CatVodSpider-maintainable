package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.lm */
/* JADX INFO: loaded from: classes.dex */
public final class C0424lm implements InterfaceC0681v {
    private volatile Object _rootCause;

    /* JADX INFO: renamed from: a */
    public final C0804zo f1159a;
    private volatile int _isCompleting = 0;
    private volatile Object _exceptionsHolder = null;

    public C0424lm(C0804zo c0804zo, Throwable th) {
        this.f1159a = c0804zo;
        this._rootCause = th;
    }

    /* JADX INFO: renamed from: b */
    public final void m1398b(Throwable th) {
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 == null) {
            this._rootCause = th;
            return;
        }
        if (th == th2) {
            return;
        }
        Object obj = this._exceptionsHolder;
        if (obj == null) {
            this._exceptionsHolder = th;
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        this._exceptionsHolder = arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final Throwable m1399c() {
        return (Throwable) this._rootCause;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0681v
    /* JADX INFO: renamed from: d */
    public final boolean mo1153d() {
        return ((Throwable) this._rootCause) == null;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0681v
    /* JADX INFO: renamed from: e */
    public final C0804zo mo1154e() {
        return this.f1159a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1400f() {
        return ((Throwable) this._rootCause) != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: g */
    public final boolean m1401g() {
        return this._isCompleting;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1402h() {
        return this._exceptionsHolder == AbstractC0745xj.f1808e;
    }

    /* JADX INFO: renamed from: i */
    public final ArrayList m1403i(Throwable th) {
        ArrayList arrayList;
        Object obj = this._exceptionsHolder;
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 != null) {
            arrayList.add(0, th2);
        }
        if (th != null && !th.equals(th2)) {
            arrayList.add(th);
        }
        this._exceptionsHolder = AbstractC0745xj.f1808e;
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final void m1404j() {
        this._isCompleting = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    public final String toString() {
        return "Finishing[cancelling=" + m1400f() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f1159a + ']';
    }
}
