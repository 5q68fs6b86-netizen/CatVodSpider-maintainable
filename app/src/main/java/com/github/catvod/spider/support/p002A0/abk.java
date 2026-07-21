package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public abstract class abk {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f523a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static AbstractC0240er m917b() {
        ThreadLocal threadLocal = f523a;
        AbstractC0240er abstractC0240er = (AbstractC0240er) threadLocal.get();
        if (abstractC0240er != null) {
            return abstractC0240er;
        }
        C0585rl c0585rl = new C0585rl(Thread.currentThread());
        threadLocal.set(c0585rl);
        return c0585rl;
    }
}
