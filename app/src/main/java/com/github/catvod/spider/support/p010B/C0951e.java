package com.github.catvod.spider.support.p010B;

import com.github.catvod.spider.support.p116a.C2137a;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.B.e */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0951e extends AbstractC0949c {

    /* JADX INFO: renamed from: b */
    private final int f2246b = 32;

    /* JADX INFO: renamed from: c */
    private final int f2247c = 127;

    @Override // com.github.catvod.spider.support.p010B.AbstractC0949c
    /* JADX INFO: renamed from: b */
    public final boolean mo2318b(int i, Writer writer) throws IOException {
        if (i >= this.f2246b && i <= this.f2247c) {
            return false;
        }
        if (i <= 65535) {
            writer.write("\\u");
            char[] cArr = AbstractC0948b.f2235a;
            writer.write(cArr[(i >> 12) & 15]);
            writer.write(cArr[(i >> 8) & 15]);
            writer.write(cArr[(i >> 4) & 15]);
            writer.write(cArr[i & 15]);
            return true;
        }
        char[] chars = Character.toChars(i);
        StringBuilder sbM5396a = C2137a.m5396a("\\u");
        String hexString = Integer.toHexString(chars[0]);
        Locale locale = Locale.ENGLISH;
        sbM5396a.append(hexString.toUpperCase(locale));
        sbM5396a.append("\\u");
        sbM5396a.append(Integer.toHexString(chars[1]).toUpperCase(locale));
        writer.write(sbM5396a.toString());
        return true;
    }
}
