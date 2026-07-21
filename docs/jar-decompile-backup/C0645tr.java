package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.tr */
/* JADX INFO: loaded from: classes.dex */
public final class C0645tr {

    /* JADX INFO: renamed from: a */
    public final Object f1558a;

    /* JADX INFO: renamed from: b */
    public final adq f1559b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0569qw f1560c;

    /* JADX INFO: renamed from: d */
    public final Object f1561d;

    /* JADX INFO: renamed from: e */
    public final Throwable f1562e;

    public C0645tr(Object obj, adq adqVar, InterfaceC0569qw interfaceC0569qw, Object obj2, Throwable th) {
        this.f1558a = obj;
        this.f1559b = adqVar;
        this.f1560c = interfaceC0569qw;
        this.f1561d = obj2;
        this.f1562e = th;
    }

    public /* synthetic */ C0645tr(Object obj, adq adqVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : adqVar, null, null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX INFO: renamed from: f */
    public static C0645tr m1727f(C0645tr c0645tr, adq adqVar, CancellationException cancellationException, int i) {
        Object obj = c0645tr.f1558a;
        if ((i & 2) != 0) {
            adqVar = c0645tr.f1559b;
        }
        adq adqVar2 = adqVar;
        InterfaceC0569qw interfaceC0569qw = c0645tr.f1560c;
        Object obj2 = c0645tr.f1561d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = c0645tr.f1562e;
        }
        c0645tr.getClass();
        return new C0645tr(obj, adqVar2, interfaceC0569qw, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0645tr)) {
            return false;
        }
        C0645tr c0645tr = (C0645tr) obj;
        return AbstractC0399ko.m1347b(this.f1558a, c0645tr.f1558a) && AbstractC0399ko.m1347b(this.f1559b, c0645tr.f1559b) && AbstractC0399ko.m1347b(this.f1560c, c0645tr.f1560c) && AbstractC0399ko.m1347b(this.f1561d, c0645tr.f1561d) && AbstractC0399ko.m1347b(this.f1562e, c0645tr.f1562e);
    }

    public final int hashCode() {
        Object obj = this.f1558a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        adq adqVar = this.f1559b;
        int iHashCode2 = (iHashCode + (adqVar != null ? adqVar.hashCode() : 0)) * 31;
        InterfaceC0569qw interfaceC0569qw = this.f1560c;
        int iHashCode3 = (iHashCode2 + (interfaceC0569qw != null ? interfaceC0569qw.hashCode() : 0)) * 31;
        Object obj2 = this.f1561d;
        int iHashCode4 = (iHashCode3 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Throwable th = this.f1562e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1558a + ", cancelHandler=" + this.f1559b + ", onCancellation=" + this.f1560c + ", idempotentResume=" + this.f1561d + ", cancelCause=" + this.f1562e + ")";
    }
}
