package com.github.catvod.spider.support.p044FM.p047C;

import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p047C.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1301d {
    /* JADX INFO: renamed from: a */
    public static void m3244a(StringBuffer stringBuffer, Object obj) {
        Objects.requireNonNull(obj, new C1306i("object", new Object[0]));
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(hexString);
    }
}
