package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ak */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0125ak {

    /* JADX INFO: renamed from: a */
    public static final long f652a = AbstractC0760xy.m1881g("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* JADX INFO: renamed from: b */
    public static final int f653b;

    /* JADX INFO: renamed from: c */
    public static final int f654c;

    /* JADX INFO: renamed from: d */
    public static final long f655d;

    /* JADX INFO: renamed from: e */
    public static final C0372jo f656e;

    static {
        AbstractC0760xy.m1882h("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 12);
        int i = abp.f534a;
        int iM1882h = AbstractC0760xy.m1882h("kotlinx.coroutines.scheduler.core.pool.size", i >= 2 ? i : 2, 8);
        f653b = iM1882h;
        f654c = AbstractC0760xy.m1882h("kotlinx.coroutines.scheduler.max.pool.size", AbstractC0745xj.m1871h(i * 128, iM1882h, 2097150), 4);
        f655d = TimeUnit.SECONDS.toNanos(AbstractC0760xy.m1881g("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f656e = C0372jo.f1074f;
    }
}
