package com.github.catvod.spider.support.p044FM.p050F;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p050F.j */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1327j extends AbstractC1319b {
    /* JADX INFO: renamed from: b */
    private boolean m3317b(char c) {
        return c >= '0' && c <= '7';
    }

    @Override // com.github.catvod.spider.support.p044FM.p050F.AbstractC1319b
    /* JADX INFO: renamed from: a */
    public final int mo3245a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        if (charSequence.charAt(i) == '\\' && length > 0) {
            int i2 = i + 1;
            if (m3317b(charSequence.charAt(i2))) {
                int i3 = i + 2;
                int i4 = i + 3;
                sb.append(charSequence.charAt(i2));
                if (length > 1 && m3317b(charSequence.charAt(i3))) {
                    sb.append(charSequence.charAt(i3));
                    if (length > 2) {
                        char cCharAt = charSequence.charAt(i2);
                        if (cCharAt >= '0' && cCharAt <= '3') {
                            z = true;
                        }
                        if (z && m3317b(charSequence.charAt(i4))) {
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
