package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.pn */
/* JADX INFO: loaded from: classes.dex */
public final class C0533pn extends AbstractC0604sd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1369a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f1370b;

    public C0533pn(EnumC0172cd[] enumC0172cdArr) {
        if (enumC0172cdArr.length > 0) {
            this.f1370b = EnumSet.copyOf((Collection) Arrays.asList(enumC0172cdArr));
        } else {
            this.f1370b = EnumSet.copyOf((Collection) Collections.singletonList(EnumC0172cd.f701a));
        }
    }

    public C0533pn(AbstractC0604sd[] abstractC0604sdArr) {
        this.f1370b = (AbstractC0604sd[]) ((Object[]) abstractC0604sdArr.clone());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0604sd
    /* JADX INFO: renamed from: c */
    public final int mo902c(String str, int i, StringWriter stringWriter) throws IOException {
        int i2;
        switch (this.f1369a) {
            case 0:
                for (AbstractC0604sd abstractC0604sd : (AbstractC0604sd[]) this.f1370b) {
                    int iMo902c = abstractC0604sd.mo902c(str, i, stringWriter);
                    if (iMo902c != 0) {
                        return iMo902c;
                    }
                }
                return 0;
            default:
                int length = str.length();
                if (str.charAt(i) != '&' || i >= length - 2 || str.charAt(i + 1) != '#') {
                    return 0;
                }
                int i3 = i + 2;
                char cCharAt = str.charAt(i3);
                if (cCharAt == 'x' || cCharAt == 'X') {
                    i3 = i + 3;
                    if (i3 == length) {
                        return 0;
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                int i4 = i3;
                while (i4 < length && ((str.charAt(i4) >= '0' && str.charAt(i4) <= '9') || ((str.charAt(i4) >= 'a' && str.charAt(i4) <= 'f') || (str.charAt(i4) >= 'A' && str.charAt(i4) <= 'F')))) {
                    i4++;
                }
                int i5 = (i4 == length || str.charAt(i4) != ';') ? 0 : 1;
                if (i5 == 0) {
                    EnumC0172cd enumC0172cd = EnumC0172cd.f701a;
                    EnumSet enumSet = (EnumSet) this.f1370b;
                    if (enumSet != null && enumSet.contains(enumC0172cd)) {
                        return 0;
                    }
                    EnumC0172cd enumC0172cd2 = EnumC0172cd.f702b;
                    if (enumSet != null && enumSet.contains(enumC0172cd2)) {
                        throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                    }
                }
                try {
                    int i6 = i2 != 0 ? Integer.parseInt(str.subSequence(i3, i4).toString(), 16) : Integer.parseInt(str.subSequence(i3, i4).toString(), 10);
                    if (i6 > 65535) {
                        char[] chars = Character.toChars(i6);
                        stringWriter.write(chars[0]);
                        stringWriter.write(chars[1]);
                    } else {
                        stringWriter.write(i6);
                    }
                    return ((i4 + 2) - i3) + i2 + i5;
                } catch (NumberFormatException unused) {
                    return 0;
                }
        }
    }
}
