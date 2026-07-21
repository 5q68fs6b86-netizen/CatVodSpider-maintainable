package com.github.catvod.spider.support.p002A0;

import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.sy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0625sy extends AbstractC0624sx {
    /* JADX INFO: renamed from: m */
    public static int m1711m(Iterable iterable) {
        AbstractC0399ko.m1351f("<this>", iterable);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
