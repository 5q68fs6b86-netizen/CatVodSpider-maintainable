package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1747r {
    /* JADX INFO: renamed from: a */
    public static String m4093a(byte[] bArr, byte[] bArr2, C1551g c1551g, StringBuilder sb) {
        sb.append(c1551g.m3784a(C1711a.m3992b(bArr, bArr2)));
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m4094b(byte[] bArr, byte[] bArr2, StringBuilder sb, String str) {
        sb.append(C1711a.m3992b(bArr, bArr2));
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static Iterator m4095c(byte[] bArr, byte[] bArr2, C1388h c1388h) {
        return c1388h.m3478o0(C1711a.m3992b(bArr, bArr2)).iterator();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m4096d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
