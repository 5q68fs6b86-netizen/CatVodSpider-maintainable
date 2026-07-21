package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.gg */
/* JADX INFO: loaded from: classes.dex */
public final class C0283gg extends IllegalArgumentException {

    /* JADX INFO: renamed from: a */
    public static final String f857a = AbstractC0711wc.class.getName();

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        try {
            super.fillInStackTrace();
            StackTraceElement[] stackTrace = getStackTrace();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!stackTraceElement.getClassName().equals(f857a)) {
                    arrayList.add(stackTraceElement);
                }
            }
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}
