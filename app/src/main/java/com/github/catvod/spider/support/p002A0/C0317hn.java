package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.hn */
/* JADX INFO: loaded from: classes.dex */
public final class C0317hn {

    /* JADX INFO: renamed from: a */
    public static final String[] f921a;

    /* JADX INFO: renamed from: b */
    public static final C0317hn f922b;

    /* JADX INFO: renamed from: c */
    public final String[] f923c;

    /* JADX INFO: renamed from: d */
    public final String[] f924d;

    /* JADX INFO: renamed from: e */
    public final String[] f925e;

    static {
        String[] strArr = new String[0];
        f921a = strArr;
        f922b = new C0317hn(strArr, strArr, strArr);
    }

    public C0317hn(String[] strArr, String[] strArr2, String[] strArr3) {
        String[] strArr4 = f921a;
        this.f923c = strArr;
        this.f924d = strArr2;
        strArr3 = strArr3 == null ? strArr4 : strArr3;
        this.f925e = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX INFO: renamed from: f */
    public final String m1296f(int i) {
        String str;
        String str2;
        if (i >= 0) {
            String[] strArr = this.f925e;
            if (i < strArr.length && (str2 = strArr[i]) != null) {
                return str2;
            }
        }
        if (i >= 0) {
            String[] strArr2 = this.f923c;
            if (i < strArr2.length) {
                str = strArr2[i];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        String strM1297g = m1297g(i);
        return strM1297g != null ? strM1297g : Integer.toString(i);
    }

    /* JADX INFO: renamed from: g */
    public final String m1297g(int i) {
        if (i >= 0) {
            String[] strArr = this.f924d;
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
