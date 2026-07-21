package com.github.catvod.spider.support.p002A0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ft */
/* JADX INFO: loaded from: classes.dex */
public final class C0269ft extends AbstractC0171cc implements acp {
    private volatile C0269ft _immediate;

    /* JADX INFO: renamed from: a */
    public final C0269ft f835a;

    /* JADX INFO: renamed from: b */
    public final Handler f836b;

    /* JADX INFO: renamed from: f */
    public final boolean f837f;

    public C0269ft(Handler handler, boolean z) {
        this.f836b = handler;
        this.f837f = z;
        this._immediate = z ? this : null;
        C0269ft c0269ft = this._immediate;
        if (c0269ft == null) {
            c0269ft = new C0269ft(handler, true);
            this._immediate = c0269ft;
        }
        this.f835a = c0269ft;
    }

    @Override // com.github.catvod.spider.support.p002A0.acp
    /* JADX INFO: renamed from: c */
    public final adh mo947c(long j, RunnableC0140az runnableC0140az, InterfaceC0769yg interfaceC0769yg) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        this.f836b.postDelayed(runnableC0140az, j);
        return new C0566qt(this, runnableC0140az);
    }

    @Override // com.github.catvod.spider.support.p002A0.acp
    /* JADX INFO: renamed from: d */
    public final void mo951d(long j, C0601sa c0601sa) {
        RunnableC0169ca runnableC0169ca = new RunnableC0169ca(this, c0601sa);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        this.f836b.postDelayed(runnableC0169ca, j);
        c0601sa.m1657u(new C0668un(this, runnableC0169ca));
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0775ym
    /* JADX INFO: renamed from: e */
    public final void mo1146e(InterfaceC0769yg interfaceC0769yg, acw acwVar) {
        this.f836b.post(acwVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0269ft) && ((C0269ft) obj).f836b == this.f836b;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0775ym
    /* JADX INFO: renamed from: g */
    public final boolean mo1217g() {
        return (this.f837f && AbstractC0399ko.m1347b(Looper.myLooper(), this.f836b.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f836b);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0775ym
    public final String toString() {
        C0269ft c0269ft;
        String str;
        AbstractC0448mj abstractC0448mj = adg.f605a;
        AbstractC0171cc abstractC0171cc = abu.f538a;
        if (this == abstractC0171cc) {
            str = "Dispatchers.Main";
        } else {
            try {
                c0269ft = ((C0269ft) abstractC0171cc).f835a;
            } catch (UnsupportedOperationException unused) {
                c0269ft = null;
            }
            str = this == c0269ft ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f836b.toString();
        if (!this.f837f) {
            return string;
        }
        return string + ".immediate";
    }
}
