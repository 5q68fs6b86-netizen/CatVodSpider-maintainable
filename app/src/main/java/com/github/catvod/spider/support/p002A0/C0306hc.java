package com.github.catvod.spider.support.p002A0;

import java.util.function.Supplier;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.hc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0306hc implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object[] f885b;

    public /* synthetic */ C0306hc(String str, Object[] objArr) {
        this.f884a = str;
        this.f885b = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.f884a, this.f885b);
    }
}
