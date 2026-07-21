package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.kw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0407kw {

    /* JADX INFO: renamed from: a */
    public static final C0546q f1108a;

    static {
        C0546q c0546q = null;
        try {
            c0546q = (C0546q) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0546q == null) {
            c0546q = new C0546q();
        }
        f1108a = c0546q;
    }
}
