package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ls */
/* JADX INFO: loaded from: classes.dex */
public final class C0430ls extends AbstractC0604sd {

    /* JADX INFO: renamed from: a */
    public final HashMap f1188a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashSet f1189b = new HashSet();

    /* JADX INFO: renamed from: d */
    public final int f1190d;

    /* JADX INFO: renamed from: e */
    public final int f1191e;

    public C0430ls(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.f1188a.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.f1189b.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f1190d = i;
        this.f1191e = i2;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0604sd
    /* JADX INFO: renamed from: c */
    public final int mo902c(String str, int i, StringWriter stringWriter) throws IOException {
        if (!this.f1189b.contains(Character.valueOf(str.charAt(i)))) {
            return 0;
        }
        int length = this.f1191e;
        if (i + length > str.length()) {
            length = str.length() - i;
        }
        while (length >= this.f1190d) {
            String str2 = (String) this.f1188a.get(str.subSequence(i, i + length).toString());
            if (str2 != null) {
                stringWriter.write(str2);
                return length;
            }
            length--;
        }
        return 0;
    }
}
