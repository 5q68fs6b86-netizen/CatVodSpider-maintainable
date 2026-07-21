package com.github.catvod.spider.support.p044FM.p078d0;

import com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1757b;
import com.github.catvod.spider.support.p044FM.p076c0.C1769a;
import com.github.catvod.spider.support.p044FM.p076c0.C1771c;
import com.github.catvod.spider.support.p044FM.p076c0.InterfaceC1770b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.d0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1789c implements InterfaceC1757b {

    /* JADX INFO: renamed from: a */
    private final String f4017a;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC1757b f4018b;

    /* JADX INFO: renamed from: c */
    private Boolean f4019c;

    /* JADX INFO: renamed from: d */
    private Method f4020d;

    /* JADX INFO: renamed from: e */
    private C1769a f4021e;

    /* JADX INFO: renamed from: f */
    private Queue<C1771c> f4022f;

    /* JADX INFO: renamed from: g */
    private final boolean f4023g;

    public C1789c(String str, Queue<C1771c> queue, boolean z) {
        this.f4017a = str;
        this.f4022f = queue;
        this.f4023g = z;
    }

    @Override // com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1757b
    /* JADX INFO: renamed from: a */
    public final void mo4163a(String str, Throwable th) {
        InterfaceC1757b interfaceC1757b;
        if (this.f4018b != null) {
            interfaceC1757b = this.f4018b;
        } else if (this.f4023g) {
            interfaceC1757b = C1788b.f4016a;
        } else {
            if (this.f4021e == null) {
                this.f4021e = new C1769a(this, this.f4022f);
            }
            interfaceC1757b = this.f4021e;
        }
        interfaceC1757b.mo4163a(str, th);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4286b() {
        Boolean bool = this.f4019c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f4020d = this.f4018b.getClass().getMethod("log", InterfaceC1770b.class);
            this.f4019c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f4019c = Boolean.FALSE;
        }
        return this.f4019c.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4287c() {
        return this.f4018b instanceof C1788b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4288d() {
        return this.f4018b == null;
    }

    /* JADX INFO: renamed from: e */
    public final void m4289e(InterfaceC1770b interfaceC1770b) {
        if (m4286b()) {
            try {
                this.f4020d.invoke(this.f4018b, interfaceC1770b);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1789c.class == obj.getClass() && this.f4017a.equals(((C1789c) obj).f4017a);
    }

    /* JADX INFO: renamed from: f */
    public final void m4290f(InterfaceC1757b interfaceC1757b) {
        this.f4018b = interfaceC1757b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1757b
    public final String getName() {
        return this.f4017a;
    }

    public final int hashCode() {
        return this.f4017a.hashCode();
    }
}
