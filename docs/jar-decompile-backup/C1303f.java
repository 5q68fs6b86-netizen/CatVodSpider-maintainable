package com.github.catvod.spider.support.p044FM.p047C;

import com.github.catvod.spider.support.p044FM.p050F.AbstractC1319b;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p047C.f */
/* JADX INFO: loaded from: classes.dex */
final class C1303f extends AbstractC1319b {

    /* JADX INFO: renamed from: b */
    private static final String f3024b = String.valueOf('\"');

    /* JADX INFO: renamed from: c */
    private static final char[] f3025c = {',', '\"', '\r', '\n'};

    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    @Override // com.github.catvod.spider.support.p044FM.p050F.AbstractC1319b
    /* JADX INFO: renamed from: a */
    public final int mo3245a(CharSequence charSequence, int i, Writer writer) throws IOException {
        String string;
        if (i != 0) {
            throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
        }
        if (charSequence.charAt(0) == '\"') {
            boolean z = true;
            if (charSequence.charAt(charSequence.length() - 1) != '\"') {
                string = charSequence.toString();
            } else {
                String string2 = charSequence.subSequence(1, charSequence.length() - 1).toString();
                char[] cArr = f3025c;
                if (C1305h.m3249c(string2)) {
                    z = false;
                    break;
                }
                if ((cArr == null ? 0 : Array.getLength(cArr)) == 0) {
                    z = false;
                    break;
                }
                int length = string2.length();
                int length2 = cArr.length;
                int i2 = length - 1;
                int i3 = length2 - 1;
                int i4 = 0;
                loop0: while (true) {
                    if (i4 >= length) {
                        z = false;
                        break;
                    }
                    char cCharAt = string2.charAt(i4);
                    for (int i5 = 0; i5 < length2; i5++) {
                        if (cArr[i5] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i5 == i3 || (i4 < i2 && cArr[i5 + 1] == string2.charAt(i4 + 1)))) {
                            break loop0;
                        }
                    }
                    i4++;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    String str = f3024b;
                    sb.append(str);
                    sb.append(str);
                    string = C1305h.m3254h(string2, sb.toString(), str);
                } else {
                    string = charSequence.toString();
                }
            }
        } else {
            string = charSequence.toString();
        }
        writer.write(string);
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}
