package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class abx {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: a */
    public static String m927a(Exception exc) {
        ?? arrayList = new ArrayList();
        for (?? cause = exc; cause != 0 && !arrayList.contains(cause); cause = cause.getCause()) {
            arrayList.add(cause);
        }
        Throwable th = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th != null) {
            exc = th;
        }
        HashMap map = AbstractC0616sp.f1502a;
        String strM1690c = AbstractC0616sp.m1690c(exc.getClass());
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(strM1690c);
        sb.append(": ");
        int i = AbstractC0273fx.f848a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }
}
