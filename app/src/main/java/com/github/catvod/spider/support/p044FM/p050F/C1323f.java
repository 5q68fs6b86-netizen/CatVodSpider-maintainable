package com.github.catvod.spider.support.p044FM.p050F;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.F.f */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1323f extends AbstractC1319b {

    /* JADX INFO: renamed from: b */
    private final HashMap<String, String> f3067b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashSet<Character> f3068c = new HashSet<>();

    /* JADX INFO: renamed from: d */
    private final int f3069d;

    /* JADX INFO: renamed from: e */
    private final int f3070e;

    public C1323f(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.f3067b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.f3068c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f3069d = i;
        this.f3070e = i2;
    }

    @Override // com.github.catvod.spider.support.p044FM.p050F.AbstractC1319b
    /* JADX INFO: renamed from: a */
    public final int mo3245a(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (!this.f3068c.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.f3070e;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.f3069d) {
            String str = this.f3067b.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                writer.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
