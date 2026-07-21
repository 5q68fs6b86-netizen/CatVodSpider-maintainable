package com.github.catvod.spider.support.p010B;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p010B.i */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0955i extends AbstractC0948b {
    /* JADX INFO: renamed from: b */
    private boolean m2331b(char c) {
        return c >= '0' && c <= '7';
    }

    @Override // com.github.catvod.spider.support.p010B.AbstractC0948b
    /* JADX INFO: renamed from: a */
    public final int mo2317a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        if (charSequence.charAt(i) == '\\' && length > 0) {
            int i2 = i + 1;
            if (m2331b(charSequence.charAt(i2))) {
                int i3 = i + 2;
                int i4 = i + 3;
                sb.append(charSequence.charAt(i2));
                if (length > 1 && m2331b(charSequence.charAt(i3))) {
                    sb.append(charSequence.charAt(i3));
                    if (length > 2) {
                        char cCharAt = charSequence.charAt(i2);
                        if (cCharAt >= '0' && cCharAt <= '3') {
                            z = true;
                        }
                        if (z && m2331b(charSequence.charAt(i4))) {
                            sb.append(charSequence.charAt(i4));
                        }
                    }
                }
                writer.write(Integer.parseInt(sb.toString(), 8));
                return sb.length() + 1;
            }
        }
        return 0;
    }
}
