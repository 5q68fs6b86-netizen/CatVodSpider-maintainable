package com.github.catvod.spider.support.p002A0;

import java.lang.ref.SoftReference;
import java.util.IdentityHashMap;
import java.util.Stack;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.se */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0605se implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1472a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f1472a) {
            case 0:
                return new String[512];
            case 1:
                return new char[2048];
            case 2:
                return new C0589rp();
            case 3:
                return new char[2];
            case 4:
                return new SoftReference(new Stack());
            case 5:
                return new StringBuilder(1024);
            case 6:
                return new IdentityHashMap();
            default:
                return new aau(new C0226ed("html"), C0226ed.class);
        }
    }
}
