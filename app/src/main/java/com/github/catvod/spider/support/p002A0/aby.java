package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class aby implements aac, Serializable {

    /* JADX INFO: renamed from: a */
    public AbstractC0814zy f542a;

    /* JADX INFO: renamed from: b */
    public volatile Object f543b;

    /* JADX INFO: renamed from: c */
    public final Object f544c;

    /* JADX WARN: Multi-variable type inference failed */
    public aby(InterfaceC0264fo interfaceC0264fo) {
        AbstractC0399ko.m1351f("initializer", interfaceC0264fo);
        this.f542a = (AbstractC0814zy) interfaceC0264fo;
        this.f543b = C0372jo.f1076h;
        this.f544c = this;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.catvod.spider.support.A0.fo, com.github.catvod.spider.support.A0.zy, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final Object m928d() {
        Object objInvoke;
        Object obj = this.f543b;
        C0372jo c0372jo = C0372jo.f1076h;
        if (obj != c0372jo) {
            return obj;
        }
        synchronized (this.f544c) {
            objInvoke = this.f543b;
            if (objInvoke == c0372jo) {
                ?? r1 = this.f542a;
                AbstractC0399ko.m1348c(r1);
                objInvoke = r1.invoke();
                this.f543b = objInvoke;
                this.f542a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f543b != C0372jo.f1076h ? String.valueOf(m928d()) : "Lazy value not initialized yet.";
    }
}
