package com.github.catvod.spider.support.p114T;

import com.github.catvod.spider.support.p112R.InterfaceC2125b;
import com.github.catvod.spider.support.p113S.C2127a;
import com.github.catvod.spider.support.p113S.C2129c;
import com.github.catvod.spider.support.p113S.InterfaceC2128b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p114T.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2132c implements InterfaceC2125b {

    /* JADX INFO: renamed from: a */
    private final String f4990a;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC2125b f4991b;

    /* JADX INFO: renamed from: c */
    private Boolean f4992c;

    /* JADX INFO: renamed from: d */
    private Method f4993d;

    /* JADX INFO: renamed from: e */
    private C2127a f4994e;

    /* JADX INFO: renamed from: f */
    private Queue<C2129c> f4995f;

    /* JADX INFO: renamed from: g */
    private final boolean f4996g;

    public C2132c(String str, Queue<C2129c> queue, boolean z) {
        this.f4990a = str;
        this.f4995f = queue;
        this.f4996g = z;
    }

    @Override // com.github.catvod.spider.support.p112R.InterfaceC2125b
    /* JADX INFO: renamed from: a */
    public final void mo5366a(String str, Throwable th) {
        InterfaceC2125b interfaceC2125b;
        if (this.f4991b != null) {
            interfaceC2125b = this.f4991b;
        } else if (this.f4996g) {
            interfaceC2125b = C2131b.f4989a;
        } else {
            if (this.f4994e == null) {
                this.f4994e = new C2127a(this, this.f4995f);
            }
            interfaceC2125b = this.f4994e;
        }
        interfaceC2125b.mo5366a(str, th);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5378b() {
        Boolean bool = this.f4992c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f4993d = this.f4991b.getClass().getMethod("log", InterfaceC2128b.class);
            this.f4992c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f4992c = Boolean.FALSE;
        }
        return this.f4992c.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5379c() {
        return this.f4991b instanceof C2131b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5380d() {
        return this.f4991b == null;
    }

    /* JADX INFO: renamed from: e */
    public final void m5381e(InterfaceC2128b interfaceC2128b) {
        if (m5378b()) {
            try {
                this.f4993d.invoke(this.f4991b, interfaceC2128b);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2132c.class == obj.getClass() && this.f4990a.equals(((C2132c) obj).f4990a);
    }

    /* JADX INFO: renamed from: f */
    public final void m5382f(InterfaceC2125b interfaceC2125b) {
        this.f4991b = interfaceC2125b;
    }

    @Override // com.github.catvod.spider.support.p112R.InterfaceC2125b
    public final String getName() {
        return this.f4990a;
    }

    public final int hashCode() {
        return this.f4990a.hashCode();
    }
}
