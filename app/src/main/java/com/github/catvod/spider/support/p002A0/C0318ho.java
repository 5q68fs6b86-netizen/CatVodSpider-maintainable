package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ho */
/* JADX INFO: loaded from: classes.dex */
public final class C0318ho extends AbstractC0604sd {

    /* JADX INFO: renamed from: a */
    public static final String f926a = String.valueOf('\"');

    /* JADX INFO: renamed from: b */
    public static final char[] f927b = {',', '\"', '\r', '\n'};

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0604sd
    /* JADX INFO: renamed from: c */
    public final int mo902c(String str, int i, StringWriter stringWriter) throws IOException {
        char[] cArr;
        if (i != 0) {
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
        String string = str.toString();
        int i2 = AbstractC0273fx.f848a;
        if (string == null || (cArr = f927b) == null) {
            stringWriter.write(str.toString());
        } else {
            int length = string.length();
            int i3 = length - 1;
            int length2 = cArr.length;
            int i4 = length2 - 1;
            for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = string.charAt(i5);
                for (int i6 = 0; i6 < length2; i6++) {
                    if (cArr[i6] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i6 == i4 || (i5 < i3 && cArr[i6 + 1] == string.charAt(i5 + 1)))) {
                        stringWriter.write(34);
                        String string2 = str.toString();
                        StringBuilder sb = new StringBuilder();
                        String str2 = f926a;
                        sb.append(str2);
                        sb.append(str2);
                        stringWriter.write(AbstractC0273fx.m1241g(string2, str2, sb.toString()));
                        stringWriter.write(34);
                    }
                }
            }
            stringWriter.write(str.toString());
        }
        return Character.codePointCount(str, 0, str.length());
    }
}
