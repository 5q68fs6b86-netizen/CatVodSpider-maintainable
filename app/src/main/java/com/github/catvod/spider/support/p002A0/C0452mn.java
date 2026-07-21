package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.mn */
/* JADX INFO: loaded from: classes.dex */
public final class C0452mn extends AbstractC0604sd {

    /* JADX INFO: renamed from: a */
    public static final String f1236a = String.valueOf('\"');

    /* JADX INFO: renamed from: b */
    public static final char[] f1237b = {',', '\"', '\r', '\n'};

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0604sd
    /* JADX INFO: renamed from: c */
    public final int mo902c(String str, int i, StringWriter stringWriter) throws IOException {
        if (i != 0) {
            throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
        }
        if (str.charAt(0) != '\"' || str.charAt(str.length() - 1) != '\"') {
            stringWriter.write(str.toString());
            return Character.codePointCount(str, 0, str.length());
        }
        String string = str.subSequence(1, str.length() - 1).toString();
        if (AbstractC0273fx.m1238d(string)) {
            stringWriter.write(str.toString());
        } else {
            char[] cArr = f1237b;
            if ((cArr == null ? 0 : Array.getLength(cArr)) == 0) {
                stringWriter.write(str.toString());
            } else {
                int length = string.length();
                int length2 = cArr.length;
                int i2 = length - 1;
                int i3 = length2 - 1;
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = string.charAt(i4);
                    for (int i5 = 0; i5 < length2; i5++) {
                        if (cArr[i5] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i5 == i3 || (i4 < i2 && cArr[i5 + 1] == string.charAt(i4 + 1)))) {
                            StringBuilder sb = new StringBuilder();
                            String str2 = f1236a;
                            sb.append(str2);
                            sb.append(str2);
                            stringWriter.write(AbstractC0273fx.m1241g(string, sb.toString(), str2));
                        }
                    }
                }
                stringWriter.write(str.toString());
            }
        }
        return Character.codePointCount(str, 0, str.length());
    }
}
