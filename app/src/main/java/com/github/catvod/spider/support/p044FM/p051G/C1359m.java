package com.github.catvod.spider.support.p044FM.p051G;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.m */
/* JADX INFO: loaded from: classes.dex */
class C1359m extends AbstractC1361o {

    /* JADX INFO: renamed from: a */
    private final int f3124a;

    C1359m(int i) {
        super(null);
        this.f3124a = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.AbstractC1361o
    /* JADX INFO: renamed from: a */
    final boolean mo3341a() {
        return true;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.AbstractC1361o
    /* JADX INFO: renamed from: b */
    final boolean mo3338b(C1366t c1366t, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int index = parsePosition.getIndex();
        int length = str.length();
        if (i == 0) {
            while (index < length && Character.isWhitespace(str.charAt(index))) {
                index++;
            }
            parsePosition.setIndex(index);
        } else {
            int i2 = i + index;
            if (length > i2) {
                length = i2;
            }
        }
        while (index < length && Character.isDigit(str.charAt(index))) {
            index++;
        }
        if (parsePosition.getIndex() == index) {
            parsePosition.setErrorIndex(index);
            return false;
        }
        int i3 = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
        parsePosition.setIndex(index);
        calendar.set(this.f3124a, mo3336c(c1366t, i3));
        return true;
    }

    /* JADX INFO: renamed from: c */
    int mo3336c(C1366t c1366t, int i) {
        return i;
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("NumberStrategy [field=");
        sbM3589b.append(this.f3124a);
        sbM3589b.append("]");
        return sbM3589b.toString();
    }
}
