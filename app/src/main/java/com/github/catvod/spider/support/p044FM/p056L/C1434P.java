package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p071a.C1711a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1434P {
    /* JADX INFO: renamed from: a */
    public static String m3588a(byte[] bArr, byte[] bArr2, StringBuilder sb) {
        sb.append(C1711a.m3992b(bArr, bArr2));
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static StringBuilder m3589b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m3590c(int i) {
        if (i == 1) {
            return "Doctype";
        }
        if (i == 2) {
            return "StartTag";
        }
        if (i == 3) {
            return "EndTag";
        }
        if (i == 4) {
            return "Comment";
        }
        if (i == 5) {
            return "Character";
        }
        return i == 6 ? "EOF" : "null";
    }
}
