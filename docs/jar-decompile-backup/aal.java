package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class aal extends AbstractC0620st {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f446b;

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0620st
    /* JADX INFO: renamed from: a */
    public final boolean mo899a(int i, StringWriter stringWriter) throws IOException {
        switch (this.f446b) {
            case 0:
                if (i >= 32 && i <= 127) {
                    return false;
                }
                if (i > 65535) {
                    char[] chars = Character.toChars(i);
                    StringBuilder sb = new StringBuilder("\\u");
                    String hexString = Integer.toHexString(chars[0]);
                    Locale locale = Locale.ENGLISH;
                    sb.append(hexString.toUpperCase(locale));
                    sb.append("\\u");
                    sb.append(Integer.toHexString(chars[1]).toUpperCase(locale));
                    stringWriter.write(sb.toString());
                } else {
                    stringWriter.write("\\u");
                    char[] cArr = AbstractC0604sd.f1471f;
                    stringWriter.write(cArr[(i >> 12) & 15]);
                    stringWriter.write(cArr[(i >> 8) & 15]);
                    stringWriter.write(cArr[(i >> 4) & 15]);
                    stringWriter.write(cArr[i & 15]);
                }
                return true;
            default:
                return i >= 55296 && i <= 57343;
        }
    }
}
