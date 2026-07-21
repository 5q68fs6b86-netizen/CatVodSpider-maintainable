package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.jw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0380jw extends AbstractC0411l {
    /* JADX WARN: Code duplicated, block: B:14:0x005d A[PHI: r8
      0x005d: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v3 java.lang.String) binds: [B:13:0x005b, B:29:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: y */
    public static String m1343y(String str) {
        AbstractC0399ko.m1351f("<this>", str);
        if (AbstractC0714wf.m1773ac("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM1854a = AbstractC0728wt.m1854a(new acr(AbstractC0198dc.m1104l(str, new String[]{"\r\n", "\n", "\r"}), new C0433lv(1, str)));
        int length = str.length();
        listM1854a.size();
        int size = listM1854a.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM1854a) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            String strSubstring = null;
            if ((i == 0 || i == size) && AbstractC0714wf.m1773ac(str2)) {
                str2 = strSubstring;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    char cCharAt = str2.charAt(i3);
                    if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && AbstractC0714wf.m1777ag(i3, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i3);
                    AbstractC0399ko.m1350e("substring(...)", strSubstring);
                }
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC0623sw.m1699a(arrayList, sb, "\n", "", "", "...", null);
        String string = sb.toString();
        AbstractC0399ko.m1350e("toString(...)", string);
        return string;
    }
}
