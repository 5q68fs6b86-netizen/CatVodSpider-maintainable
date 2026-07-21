package com.github.catvod.spider.support.p044FM.p050F;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p050F.i */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1326i extends AbstractC1319b {

    /* JADX INFO: renamed from: b */
    private final EnumSet<EnumC1325h> f3076b;

    public C1326i(EnumC1325h... enumC1325hArr) {
        this.f3076b = EnumSet.copyOf((Collection) (enumC1325hArr.length > 0 ? Arrays.asList(enumC1325hArr) : Collections.singletonList(EnumC1325h.semiColonRequired)));
    }

    @Override // com.github.catvod.spider.support.p044FM.p050F.AbstractC1319b
    /* JADX INFO: renamed from: a */
    public final int mo3245a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i2;
        int length = charSequence.length();
        if (charSequence.charAt(i) == '&' && i < length - 2 && charSequence.charAt(i + 1) == '#') {
            int i3 = i + 2;
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == 'x' || cCharAt == 'X') {
                i3++;
                if (i3 == length) {
                    return 0;
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i4 = i3;
            while (i4 < length && ((charSequence.charAt(i4) >= '0' && charSequence.charAt(i4) <= '9') || ((charSequence.charAt(i4) >= 'a' && charSequence.charAt(i4) <= 'f') || (charSequence.charAt(i4) >= 'A' && charSequence.charAt(i4) <= 'F')))) {
                i4++;
            }
            int i5 = (i4 == length || charSequence.charAt(i4) != ';') ? 0 : 1;
            if (i5 == 0) {
                EnumC1325h enumC1325h = EnumC1325h.semiColonRequired;
                EnumSet<EnumC1325h> enumSet = this.f3076b;
                if (enumSet != null && enumSet.contains(enumC1325h)) {
                    return 0;
                }
                EnumC1325h enumC1325h2 = EnumC1325h.errorIfNoSemiColon;
                EnumSet<EnumC1325h> enumSet2 = this.f3076b;
                if (enumSet2 != null && enumSet2.contains(enumC1325h2)) {
                    throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            try {
                int i6 = i2 != 0 ? Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 16) : Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 10);
                int i7 = i6;
                if (i6 > 65535) {
                    char[] chars = Character.toChars(i6);
                    writer.write(chars[0]);
                    i7 = chars[1];
                }
                writer.write(i7);
                return ((i4 + 2) - i3) + i2 + i5;
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
