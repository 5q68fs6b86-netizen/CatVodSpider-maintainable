package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ap */
/* JADX INFO: loaded from: classes.dex */
public final class C0130ap implements InterfaceC0698vq {

    /* JADX INFO: renamed from: b */
    public static final C0129ao f666b;

    /* JADX INFO: renamed from: c */
    public static final C0129ao f667c;

    /* JADX INFO: renamed from: d */
    public final C0742xg f668d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f669e = new ConcurrentHashMap();

    static {
        int i = 0;
        f666b = new C0129ao(i);
        f667c = new C0129ao(i);
    }

    public C0130ap(C0742xg c0742xg) {
        this.f668d = c0742xg;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0698vq
    /* JADX INFO: renamed from: a */
    public final AbstractC0406kv mo934a(C0493oa c0493oa, C0259fj c0259fj) {
        InterfaceC0388kd interfaceC0388kd = (InterfaceC0388kd) c0259fj.f827a.getAnnotation(InterfaceC0388kd.class);
        if (interfaceC0388kd == null) {
            return null;
        }
        return m1007f(this.f668d, c0493oa, c0259fj, interfaceC0388kd, true);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC0406kv m1007f(C0742xg c0742xg, C0493oa c0493oa, C0259fj c0259fj, InterfaceC0388kd interfaceC0388kd, boolean z) {
        AbstractC0406kv c0432lu;
        Object objMo1338m = c0742xg.m1870e(new C0259fj(interfaceC0388kd.value())).mo1338m();
        boolean zNullSafe = interfaceC0388kd.nullSafe();
        if (objMo1338m instanceof AbstractC0406kv) {
            c0432lu = (AbstractC0406kv) objMo1338m;
        } else if (objMo1338m instanceof InterfaceC0698vq) {
            InterfaceC0698vq interfaceC0698vq = (InterfaceC0698vq) objMo1338m;
            if (z) {
                InterfaceC0698vq interfaceC0698vq2 = (InterfaceC0698vq) this.f669e.putIfAbsent(c0259fj.f827a, interfaceC0698vq);
                if (interfaceC0698vq2 != null) {
                    interfaceC0698vq = interfaceC0698vq2;
                }
            }
            c0432lu = interfaceC0698vq.mo934a(c0493oa, c0259fj);
        } else {
            boolean z2 = objMo1338m instanceof InterfaceC0176ch;
            if (!z2 && !(objMo1338m instanceof aav)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo1338m.getClass().getName() + " as a @JsonAdapter for " + AbstractC0534po.m1522i(c0259fj.f828b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            c0432lu = new C0432lu(z2 ? (InterfaceC0176ch) objMo1338m : null, objMo1338m instanceof aav ? (aav) objMo1338m : null, c0493oa, c0259fj, z ? f666b : f667c, zNullSafe);
            zNullSafe = false;
        }
        return (c0432lu == null || !zNullSafe) ? c0432lu : new C0595rv(2, c0432lu);
    }
}
