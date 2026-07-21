package com.github.catvod.spider.support.p044FM.p047C;

import java.util.function.Supplier;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.C.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1306i implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f3029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object[] f3030b;

    public /* synthetic */ C1306i(String str, Object[] objArr) {
        this.f3029a = str;
        this.f3030b = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.f3029a, this.f3030b);
    }
}
