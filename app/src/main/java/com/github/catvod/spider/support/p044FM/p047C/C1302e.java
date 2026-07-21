package com.github.catvod.spider.support.p044FM.p047C;

import com.github.catvod.spider.support.p044FM.p050F.AbstractC1319b;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.C.e */
/* JADX INFO: loaded from: classes.dex */
final class C1302e extends AbstractC1319b {

    /* JADX INFO: renamed from: b */
    private static final String f3022b = String.valueOf('\"');

    /* JADX INFO: renamed from: c */
    private static final char[] f3023c = {',', '\"', '\r', '\n'};

    @Override // com.github.catvod.spider.support.p044FM.p050F.AbstractC1319b
    /* JADX INFO: renamed from: a */
    public final int mo3245a(CharSequence charSequence, int i, Writer writer) throws IOException {
        boolean z;
        if (i != 0) {
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
        String string = charSequence.toString();
        char[] cArr = f3023c;
        int i2 = C1305h.f3028a;
        if (string == null || cArr == null) {
            z = true;
        } else {
            int length = string.length();
            int i3 = length - 1;
            int length2 = cArr.length;
            int i4 = length2 - 1;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    char cCharAt = string.charAt(i5);
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length2) {
                            i5++;
                        } else if (cArr[i6] != cCharAt || (Character.isHighSurrogate(cCharAt) && i6 != i4 && (i5 >= i3 || cArr[i6 + 1] != string.charAt(i5 + 1)))) {
                            i6++;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            writer.write(charSequence.toString());
        } else {
            writer.write(34);
            String string2 = charSequence.toString();
            String str = f3022b;
            writer.write(C1305h.m3254h(string2, str, str + str));
            writer.write(34);
        }
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}
