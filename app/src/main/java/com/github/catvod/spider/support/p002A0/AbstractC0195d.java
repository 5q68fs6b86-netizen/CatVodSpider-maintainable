package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0195d {

    /* JADX INFO: renamed from: a */
    public static final C0533pn f725a;

    static {
        C0430ls c0430ls = new C0430ls(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        String[][] strArr = AbstractC0247ey.f810i;
        AbstractC0604sd[] abstractC0604sdArr = {new C0430ls((String[][]) strArr.clone())};
        AbstractC0604sd[] abstractC0604sdArr2 = new AbstractC0604sd[2];
        abstractC0604sdArr2[0] = c0430ls;
        System.arraycopy(abstractC0604sdArr, 0, abstractC0604sdArr2, 1, 1);
        C0533pn c0533pn = new C0533pn(abstractC0604sdArr2);
        AbstractC0604sd[] abstractC0604sdArr3 = {new aal(0)};
        AbstractC0604sd[] abstractC0604sdArr4 = new AbstractC0604sd[2];
        abstractC0604sdArr4[0] = c0533pn;
        System.arraycopy(abstractC0604sdArr3, 0, abstractC0604sdArr4, 1, 1);
        f725a = new C0533pn(new AbstractC0604sd[]{new C0430ls(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new C0430ls((String[][]) strArr.clone()), new aal(0)});
        String[][] strArr2 = AbstractC0247ey.f806e;
        C0430ls c0430ls2 = new C0430ls((String[][]) strArr2.clone());
        String[][] strArr3 = AbstractC0247ey.f808g;
        C0430ls c0430ls3 = new C0430ls((String[][]) strArr2.clone());
        String[][] strArr4 = AbstractC0247ey.f802a;
        new C0533pn(new AbstractC0604sd[]{new aaq(0), new aaq(1), new C0430ls((String[][]) AbstractC0247ey.f811j.clone()), new C0430ls(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""})});
        String[][] strArr5 = AbstractC0247ey.f807f;
        C0430ls c0430ls4 = new C0430ls((String[][]) strArr5.clone());
        String[][] strArr6 = AbstractC0247ey.f803b;
    }

    /* JADX INFO: renamed from: b */
    public static final String m1092b(String str) {
        C0533pn c0533pn = f725a;
        c0533pn.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iMo902c = c0533pn.mo902c(str, iCharCount, stringWriter);
                if (iMo902c == 0) {
                    char cCharAt = str.charAt(iCharCount);
                    stringWriter.write(cCharAt);
                    int i = iCharCount + 1;
                    if (Character.isHighSurrogate(cCharAt) && i < length) {
                        char cCharAt2 = str.charAt(i);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            stringWriter.write(cCharAt2);
                            iCharCount += 2;
                        }
                    }
                    iCharCount = i;
                } else {
                    for (int i2 = 0; i2 < iMo902c; i2++) {
                        iCharCount += Character.charCount(Character.codePointAt(str, iCharCount));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
