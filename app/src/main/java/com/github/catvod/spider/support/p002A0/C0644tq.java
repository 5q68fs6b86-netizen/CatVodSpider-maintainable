package com.github.catvod.spider.support.p002A0;

import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.tq */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0644tq implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0569qw[] f1557a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC0569qw[] interfaceC0569qwArr = this.f1557a;
        AbstractC0399ko.m1351f("$selectors", interfaceC0569qwArr);
        for (InterfaceC0569qw interfaceC0569qw : interfaceC0569qwArr) {
            int iM1479a = AbstractC0497oe.m1479a((Comparable) interfaceC0569qw.invoke(obj), (Comparable) interfaceC0569qw.invoke(obj2));
            if (iM1479a != 0) {
                return iM1479a;
            }
        }
        return 0;
    }
}
