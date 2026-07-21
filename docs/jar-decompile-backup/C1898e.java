package com.github.catvod.spider.support.p044FM.p092q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p092q.e */
/* JADX INFO: loaded from: classes.dex */
final class C1898e implements InterfaceC1901h {

    /* JADX INFO: renamed from: a */
    private final ThreadLocal<String> f4369a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    private final List<InterfaceC1895b> f4370b = new ArrayList();

    C1898e() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p092q.InterfaceC1901h
    /* JADX INFO: renamed from: a */
    public final void mo4599a(Object obj) {
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
            String str = this.f4369a.get();
            if (str != null) {
                this.f4369a.remove();
            } else {
                str = null;
            }
            m4601c(str, strDeepToString);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p092q.b>] */
    /* JADX INFO: renamed from: b */
    public final void m4600b(InterfaceC1895b interfaceC1895b) {
        this.f4370b.add(interfaceC1895b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p044FM.p092q.b>] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m4601c(String str, String str2) {
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
        for (InterfaceC1895b interfaceC1895b : this.f4370b) {
            interfaceC1895b.mo4595a();
            interfaceC1895b.mo4596b(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC1901h m4602d(String str) {
        this.f4369a.set(str);
        return this;
    }
}
