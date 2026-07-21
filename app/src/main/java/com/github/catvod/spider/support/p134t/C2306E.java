package com.github.catvod.spider.support.p134t;

/* JADX INFO: renamed from: com.github.catvod.spider.support.t.E */
/* JADX INFO: loaded from: classes.dex */
public final class C2306E implements InterfaceC2305D {

    /* JADX INFO: renamed from: d */
    private static final String[] f5725d;

    /* JADX INFO: renamed from: e */
    public static final C2306E f5726e;

    /* JADX INFO: renamed from: a */
    private final String[] f5727a;

    /* JADX INFO: renamed from: b */
    private final String[] f5728b;

    /* JADX INFO: renamed from: c */
    private final String[] f5729c;

    static {
        String[] strArr = new String[0];
        f5725d = strArr;
        f5726e = new C2306E(strArr, strArr, strArr);
    }

    public C2306E(String[] strArr, String[] strArr2, String[] strArr3) {
        this.f5727a = strArr;
        this.f5728b = strArr2;
        strArr3 = strArr3 == null ? f5725d : strArr3;
        this.f5729c = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* JADX INFO: renamed from: a */
    public final String m6223a(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.f5729c;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String strM6224b = m6224b(i);
        if (strM6224b != null) {
            return strM6224b;
        }
        String strM6225c = m6225c(i);
        return strM6225c != null ? strM6225c : Integer.toString(i);
    }

    /* JADX INFO: renamed from: b */
    public final String m6224b(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f5727a;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final String m6225c(int i) {
        if (i >= 0) {
            String[] strArr = this.f5728b;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return "EOF";
        }
        return null;
    }
}
