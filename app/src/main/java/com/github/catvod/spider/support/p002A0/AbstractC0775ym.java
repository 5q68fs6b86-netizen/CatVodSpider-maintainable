package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ym */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0775ym extends AbstractC0522pc implements InterfaceC0749xn {

    /* JADX INFO: renamed from: w */
    public static final C0774yl f1839w = new C0774yl(C0372jo.f1071c, C0773yk.f1836a);

    public AbstractC0775ym() {
        super(C0372jo.f1071c);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo1146e(InterfaceC0769yg interfaceC0769yg, acw acwVar);

    /* JADX INFO: renamed from: g */
    public boolean mo1217g() {
        return !(this instanceof AbstractC0336if);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.catvod.spider.support.A0.qw, com.github.catvod.spider.support.A0.zy] */
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0522pc, com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0750xo get(InterfaceC0751xp interfaceC0751xp) {
        AbstractC0399ko.m1351f("key", interfaceC0751xp);
        if (!(interfaceC0751xp instanceof C0774yl)) {
            if (C0372jo.f1071c == interfaceC0751xp) {
                return this;
            }
            return null;
        }
        C0774yl c0774yl = (C0774yl) interfaceC0751xp;
        InterfaceC0751xp key = getKey();
        AbstractC0399ko.m1351f("key", key);
        if (key != c0774yl && c0774yl.f1838b != key) {
            return null;
        }
        InterfaceC0750xo interfaceC0750xo = (InterfaceC0750xo) c0774yl.f1837a.invoke(this);
        if (interfaceC0750xo instanceof InterfaceC0750xo) {
            return interfaceC0750xo;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.catvod.spider.support.A0.qw, com.github.catvod.spider.support.A0.zy] */
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0522pc, com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0769yg minusKey(InterfaceC0751xp interfaceC0751xp) {
        AbstractC0399ko.m1351f("key", interfaceC0751xp);
        boolean z = interfaceC0751xp instanceof C0774yl;
        C0233ek c0233ek = C0233ek.f781a;
        if (z) {
            C0774yl c0774yl = (C0774yl) interfaceC0751xp;
            InterfaceC0751xp key = getKey();
            AbstractC0399ko.m1351f("key", key);
            if ((key == c0774yl || c0774yl.f1838b == key) && ((InterfaceC0750xo) c0774yl.f1837a.invoke(this)) != null) {
                return c0233ek;
            }
        } else if (C0372jo.f1071c == interfaceC0751xp) {
            return c0233ek;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0592rs.m1647a(this);
    }
}
