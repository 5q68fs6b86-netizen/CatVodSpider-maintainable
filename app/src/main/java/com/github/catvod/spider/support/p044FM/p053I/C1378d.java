package com.github.catvod.spider.support.p044FM.p053I;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.I.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1378d extends IllegalArgumentException {

    /* JADX INFO: renamed from: a */
    public static final String f3169a = C1377c.class.getName();

    public C1378d(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        super.fillInStackTrace();
        StackTraceElement[] stackTrace = getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.getClassName().equals(f3169a)) {
                arrayList.add(stackTraceElement);
            }
        }
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        return this;
    }
}
