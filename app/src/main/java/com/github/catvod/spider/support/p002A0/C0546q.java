package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0546q {
    /* JADX INFO: renamed from: a */
    public static String m1566a(InterfaceC0575rb interfaceC0575rb) {
        String string = interfaceC0575rb.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
