package com.github.catvod.spider.support.p044FM.p098x;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1924J implements InterfaceC1923I {

    /* JADX INFO: renamed from: d */
    private static final String[] f4396d;

    /* JADX INFO: renamed from: e */
    public static final C1924J f4397e;

    /* JADX INFO: renamed from: a */
    private final String[] f4398a;

    /* JADX INFO: renamed from: b */
    private final String[] f4399b;

    /* JADX INFO: renamed from: c */
    private final String[] f4400c;

    static {
        String[] strArr = new String[0];
        f4396d = strArr;
        f4397e = new C1924J(strArr, strArr, strArr);
    }

    public C1924J(String[] strArr, String[] strArr2, String[] strArr3) {
        this.f4398a = strArr;
        this.f4399b = strArr2;
        strArr3 = strArr3 == null ? f4396d : strArr3;
        this.f4400c = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* JADX INFO: renamed from: a */
    public final String m4648a(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.f4400c;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String strM4649b = m4649b(i);
        if (strM4649b != null) {
            return strM4649b;
        }
        String strM4650c = m4650c(i);
        return strM4650c != null ? strM4650c : Integer.toString(i);
    }

    /* JADX INFO: renamed from: b */
    public final String m4649b(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f4398a;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final String m4650c(int i) {
        if (i >= 0) {
            String[] strArr = this.f4399b;
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
