package com.github.catvod.spider.support.p002A0;

import java.util.Random;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ow */
/* JADX INFO: loaded from: classes.dex */
public final class C0515ow extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new Random();
    }
}
