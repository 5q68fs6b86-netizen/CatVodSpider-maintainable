package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.wv */
/* JADX INFO: loaded from: classes.dex */
public final class C0730wv implements InterfaceC0698vq {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1769b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1770c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0406kv f1771d;

    public /* synthetic */ C0730wv(Object obj, AbstractC0406kv abstractC0406kv, int i) {
        this.f1769b = i;
        this.f1770c = obj;
        this.f1771d = abstractC0406kv;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0698vq
    /* JADX INFO: renamed from: a */
    public final AbstractC0406kv mo934a(C0493oa c0493oa, C0259fj c0259fj) {
        switch (this.f1769b) {
            case 0:
                if (c0259fj.f827a == ((Class) this.f1770c)) {
                    return this.f1771d;
                }
                return null;
            case 1:
                Class<?> cls = c0259fj.f827a;
                if (((Class) this.f1770c).isAssignableFrom(cls)) {
                    return new C0621su(this, cls);
                }
                return null;
            default:
                if (c0259fj.equals((C0259fj) this.f1770c)) {
                    return this.f1771d;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f1769b) {
            case 0:
                return "Factory[type=" + ((Class) this.f1770c).getName() + ",adapter=" + this.f1771d + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f1770c).getName() + ",adapter=" + this.f1771d + "]";
            default:
                return super.toString();
        }
    }
}
