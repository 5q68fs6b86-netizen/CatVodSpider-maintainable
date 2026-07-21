package com.github.catvod.spider.support.p010B;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: com.github.catvod.spider.support.B.f */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0952f extends AbstractC0948b {

    /* JADX INFO: renamed from: b */
    private final HashMap<String, String> f2248b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private final HashSet<Character> f2249c = new HashSet<>();

    /* JADX INFO: renamed from: d */
    private final int f2250d;

    /* JADX INFO: renamed from: e */
    private final int f2251e;

    public C0952f(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.f2248b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.f2249c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f2250d = i;
        this.f2251e = i2;
    }

    @Override // com.github.catvod.spider.support.p010B.AbstractC0948b
    /* JADX INFO: renamed from: a */
    public final int mo2317a(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (!this.f2249c.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.f2251e;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.f2250d) {
            String str = this.f2248b.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                writer.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
