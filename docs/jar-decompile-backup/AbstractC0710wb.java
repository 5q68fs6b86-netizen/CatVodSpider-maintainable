package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import okio.Path;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.wb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0710wb {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f1722a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    /* JADX INFO: renamed from: b */
    public static ArrayList m1758b(C0371jn c0371jn) {
        abn abnVar = new abn();
        for (C0368jk c0368jk : c0371jn.f1062c) {
            BitSet bitSet = (BitSet) abnVar.get(c0368jk);
            if (bitSet == null) {
                bitSet = new BitSet();
                abnVar.put(c0368jk, bitSet);
            }
            bitSet.set(c0368jk.f1047f);
        }
        return (ArrayList) abnVar.values();
    }

    /* JADX INFO: renamed from: c */
    public static String m1759c(String str, int i) {
        return str + i;
    }

    /* JADX INFO: renamed from: d */
    public static String m1760d(String str, long j) {
        return str + j;
    }

    /* JADX INFO: renamed from: e */
    public static String m1761e(Path path, String str) {
        return str + path;
    }

    /* JADX INFO: renamed from: f */
    public static HashMap m1762f(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m1763g(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m1764h(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m1765i(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
