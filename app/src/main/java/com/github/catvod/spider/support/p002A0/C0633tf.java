package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.tf */
/* JADX INFO: loaded from: classes.dex */
public final class C0633tf implements InterfaceC0769yg, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0769yg f1533a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0750xo f1534b;

    public C0633tf(InterfaceC0769yg interfaceC0769yg, InterfaceC0750xo interfaceC0750xo) {
        AbstractC0399ko.m1351f("left", interfaceC0769yg);
        AbstractC0399ko.m1351f("element", interfaceC0750xo);
        this.f1533a = interfaceC0769yg;
        this.f1534b = interfaceC0750xo;
    }

    public final boolean equals(Object obj) {
        boolean zM1347b;
        if (this != obj) {
            if (!(obj instanceof C0633tf)) {
                return false;
            }
            C0633tf c0633tf = (C0633tf) obj;
            c0633tf.getClass();
            int i = 2;
            C0633tf c0633tf2 = c0633tf;
            int i2 = 2;
            while (true) {
                InterfaceC0769yg interfaceC0769yg = c0633tf2.f1533a;
                c0633tf2 = interfaceC0769yg instanceof C0633tf ? (C0633tf) interfaceC0769yg : null;
                if (c0633tf2 == null) {
                    break;
                }
                i2++;
            }
            C0633tf c0633tf3 = this;
            while (true) {
                InterfaceC0769yg interfaceC0769yg2 = c0633tf3.f1533a;
                c0633tf3 = interfaceC0769yg2 instanceof C0633tf ? (C0633tf) interfaceC0769yg2 : null;
                if (c0633tf3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C0633tf c0633tf4 = this;
            while (true) {
                InterfaceC0750xo interfaceC0750xo = c0633tf4.f1534b;
                if (!AbstractC0399ko.m1347b(c0633tf.get(interfaceC0750xo.getKey()), interfaceC0750xo)) {
                    zM1347b = false;
                    break;
                }
                InterfaceC0769yg interfaceC0769yg3 = c0633tf4.f1533a;
                if (!(interfaceC0769yg3 instanceof C0633tf)) {
                    AbstractC0399ko.m1349d("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", interfaceC0769yg3);
                    InterfaceC0750xo interfaceC0750xo2 = (InterfaceC0750xo) interfaceC0769yg3;
                    zM1347b = AbstractC0399ko.m1347b(c0633tf.get(interfaceC0750xo2.getKey()), interfaceC0750xo2);
                    break;
                }
                c0633tf4 = (C0633tf) interfaceC0769yg3;
            }
            if (!zM1347b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final Object fold(Object obj, InterfaceC0304ha interfaceC0304ha) {
        return interfaceC0304ha.invoke(this.f1533a.fold(obj, interfaceC0304ha), this.f1534b);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0750xo get(InterfaceC0751xp interfaceC0751xp) {
        AbstractC0399ko.m1351f("key", interfaceC0751xp);
        C0633tf c0633tf = this;
        while (true) {
            InterfaceC0750xo interfaceC0750xo = c0633tf.f1534b.get(interfaceC0751xp);
            if (interfaceC0750xo != null) {
                return interfaceC0750xo;
            }
            InterfaceC0769yg interfaceC0769yg = c0633tf.f1533a;
            if (!(interfaceC0769yg instanceof C0633tf)) {
                return interfaceC0769yg.get(interfaceC0751xp);
            }
            c0633tf = (C0633tf) interfaceC0769yg;
        }
    }

    public final int hashCode() {
        return this.f1534b.hashCode() + this.f1533a.hashCode();
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0769yg minusKey(InterfaceC0751xp interfaceC0751xp) {
        AbstractC0399ko.m1351f("key", interfaceC0751xp);
        InterfaceC0750xo interfaceC0750xo = this.f1534b;
        InterfaceC0750xo interfaceC0750xo2 = interfaceC0750xo.get(interfaceC0751xp);
        InterfaceC0769yg interfaceC0769yg = this.f1533a;
        if (interfaceC0750xo2 != null) {
            return interfaceC0769yg;
        }
        InterfaceC0769yg interfaceC0769ygMinusKey = interfaceC0769yg.minusKey(interfaceC0751xp);
        if (interfaceC0769ygMinusKey == interfaceC0769yg) {
            return this;
        }
        return interfaceC0769ygMinusKey == C0233ek.f781a ? interfaceC0750xo : new C0633tf(interfaceC0769ygMinusKey, interfaceC0750xo);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0769yg plus(InterfaceC0769yg interfaceC0769yg) {
        AbstractC0399ko.m1351f("context", interfaceC0769yg);
        return interfaceC0769yg == C0233ek.f781a ? this : (InterfaceC0769yg) interfaceC0769yg.fold(this, C0632te.f1527b);
    }

    public final String toString() {
        return "[" + ((String) fold("", C0632te.f1526a)) + ']';
    }
}
