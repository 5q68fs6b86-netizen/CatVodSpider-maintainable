package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1751v {
    /* JADX INFO: renamed from: a */
    public static String m4141a(String str, Object[] objArr, StringBuilder sb) {
        sb.append(String.format(str, objArr));
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m4142b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m4143c(byte[] bArr, byte[] bArr2, StringBuilder sb, Exception exc) {
        sb.append(C1711a.m3992b(bArr, bArr2));
        sb.append(exc);
        SpiderDebug.log(sb.toString());
    }
}
