package com.github.catvod.spider.support.p044FM.p050F;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p050F.e */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1322e extends AbstractC1320c {

    /* JADX INFO: renamed from: b */
    private final int f3065b = 32;

    /* JADX INFO: renamed from: c */
    private final int f3066c = 127;

    @Override // com.github.catvod.spider.support.p044FM.p050F.AbstractC1320c
    /* JADX INFO: renamed from: b */
    public final boolean mo3304b(int i, Writer writer) throws IOException {
        if (i >= this.f3065b && i <= this.f3066c) {
            return false;
        }
        if (i <= 65535) {
            writer.write("\\u");
            char[] cArr = AbstractC1319b.f3054a;
            writer.write(cArr[(i >> 12) & 15]);
            writer.write(cArr[(i >> 8) & 15]);
            writer.write(cArr[(i >> 4) & 15]);
            writer.write(cArr[i & 15]);
            return true;
        }
        char[] chars = Character.toChars(i);
        StringBuilder sbM3589b = C1434P.m3589b("\\u");
        String hexString = Integer.toHexString(chars[0]);
        Locale locale = Locale.ENGLISH;
        sbM3589b.append(hexString.toUpperCase(locale));
        sbM3589b.append("\\u");
        sbM3589b.append(Integer.toHexString(chars[1]).toUpperCase(locale));
        writer.write(sbM3589b.toString());
        return true;
    }
}
