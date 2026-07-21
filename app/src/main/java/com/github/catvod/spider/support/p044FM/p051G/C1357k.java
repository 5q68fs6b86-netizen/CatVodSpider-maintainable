package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p073b.C1751v;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.k */
/* JADX INFO: loaded from: classes.dex */
final class C1357k extends AbstractC1361o {

    /* JADX INFO: renamed from: a */
    private final String f3120a;

    C1357k(String str) {
        super(null);
        this.f3120a = str;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.AbstractC1361o
    /* JADX INFO: renamed from: b */
    final boolean mo3338b(C1366t c1366t, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        for (int i2 = 0; i2 < this.f3120a.length(); i2++) {
            int index = parsePosition.getIndex() + i2;
            if (index == str.length()) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            if (this.f3120a.charAt(i2) != str.charAt(index)) {
                parsePosition.setErrorIndex(index);
                return false;
            }
        }
        parsePosition.setIndex(parsePosition.getIndex() + this.f3120a.length());
        return true;
    }

    public final String toString() {
        return C1751v.m4142b(C1434P.m3589b("CopyQuotedStrategy [formatField="), this.f3120a, "]");
    }
}
