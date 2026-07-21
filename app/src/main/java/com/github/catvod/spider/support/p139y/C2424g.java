package com.github.catvod.spider.support.p139y;

import java.util.function.Supplier;

/* JADX INFO: renamed from: com.github.catvod.spider.support.y.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2424g implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f5982a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object[] f5983b;

    public /* synthetic */ C2424g(String str, Object[] objArr) {
        this.f5982a = str;
        this.f5983b = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.f5982a, this.f5983b);
    }
}
