package com.github.catvod.spider.support.p129n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p129n.d */
/* JADX INFO: loaded from: classes.dex */
final class C2287d implements InterfaceC2289f {

    /* JADX INFO: renamed from: a */
    private final ThreadLocal<String> f5709a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    private final List<InterfaceC2285b> f5710b = new ArrayList();

    C2287d() {
    }

    @Override // com.github.catvod.spider.support.p129n.InterfaceC2289f
    /* JADX INFO: renamed from: a */
    public final void mo6188a(Object obj) {
        String strDeepToString;
        if (obj == null) {
            strDeepToString = "null";
        } else if (!obj.getClass().isArray()) {
            strDeepToString = obj.toString();
        } else if (obj instanceof boolean[]) {
            strDeepToString = Arrays.toString((boolean[]) obj);
        } else if (obj instanceof byte[]) {
            strDeepToString = Arrays.toString((byte[]) obj);
        } else if (obj instanceof char[]) {
            strDeepToString = Arrays.toString((char[]) obj);
        } else if (obj instanceof short[]) {
            strDeepToString = Arrays.toString((short[]) obj);
        } else if (obj instanceof int[]) {
            strDeepToString = Arrays.toString((int[]) obj);
        } else if (obj instanceof long[]) {
            strDeepToString = Arrays.toString((long[]) obj);
        } else if (obj instanceof float[]) {
            strDeepToString = Arrays.toString((float[]) obj);
        } else if (obj instanceof double[]) {
            strDeepToString = Arrays.toString((double[]) obj);
        } else {
            strDeepToString = obj instanceof Object[] ? Arrays.deepToString((Object[]) obj) : "Couldn't find a correct type for the object";
        }
        synchronized (this) {
            strDeepToString.getClass();
            String str = this.f5709a.get();
            if (str != null) {
                this.f5709a.remove();
            } else {
                str = null;
            }
            m6190c(str, strDeepToString);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p129n.b>] */
    /* JADX INFO: renamed from: b */
    public final void m6189b(InterfaceC2285b interfaceC2285b) {
        this.f5710b.add(interfaceC2285b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p129n.b>] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m6190c(String str, String str2) {
        boolean z;
        if (str2 != null) {
            try {
                z = str2.length() == 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            str2 = "Empty/NULL log message";
        }
        for (InterfaceC2285b interfaceC2285b : this.f5710b) {
            interfaceC2285b.mo6184a();
            interfaceC2285b.mo6185b(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2289f m6191d(String str) {
        this.f5709a.set(str);
        return this;
    }
}
