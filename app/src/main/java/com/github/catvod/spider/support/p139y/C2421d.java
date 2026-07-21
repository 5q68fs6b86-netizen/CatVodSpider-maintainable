package com.github.catvod.spider.support.p139y;

import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.y.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2421d {
    /* JADX INFO: renamed from: a */
    public static void m6435a(StringBuffer stringBuffer, Object obj) {
        Objects.requireNonNull(obj, new C2424g("object", new Object[0]));
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(hexString);
    }
}
