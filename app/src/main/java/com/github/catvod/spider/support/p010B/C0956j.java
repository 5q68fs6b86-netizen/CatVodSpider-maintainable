package com.github.catvod.spider.support.p010B;

import com.github.catvod.spider.support.p116a.C2137a;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.B.j */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0956j extends AbstractC0948b {
    @Override // com.github.catvod.spider.support.p010B.AbstractC0948b
    /* JADX INFO: renamed from: a */
    public final int mo2317a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i2;
        int i3;
        if (charSequence.charAt(i) != '\\' || (i2 = i + 1) >= charSequence.length() || charSequence.charAt(i2) != 'u') {
            return 0;
        }
        int i4 = 2;
        while (true) {
            i3 = i + i4;
            if (i3 >= charSequence.length() || charSequence.charAt(i3) != 'u') {
                break;
            }
            i4++;
        }
        if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
            i4++;
        }
        int i5 = i + i4;
        int i6 = i5 + 4;
        if (i6 > charSequence.length()) {
            StringBuilder sbM5396a = C2137a.m5396a("Less than 4 hex digits in unicode value: '");
            sbM5396a.append((Object) charSequence.subSequence(i, charSequence.length()));
            sbM5396a.append("' due to end of CharSequence");
            throw new IllegalArgumentException(sbM5396a.toString());
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(i5, i6);
        try {
            writer.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
            return i4 + 4;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unable to parse unicode value: " + ((Object) charSequenceSubSequence), e);
        }
    }
}
