package com.github.catvod.spider.support.p002A0;

import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.mp */
/* JADX INFO: loaded from: classes.dex */
public final class C0454mp extends AbstractC0157bp {

    /* JADX INFO: renamed from: c */
    public final String f1241c;

    public C0454mp(String str) {
        this.f1241c = str;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0157bp
    /* JADX INFO: renamed from: a */
    public final boolean mo1061a() {
        return false;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0157bp
    /* JADX INFO: renamed from: b */
    public final boolean mo1062b(abe abeVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int i2 = 0;
        while (true) {
            String str2 = this.f1241c;
            if (i2 >= str2.length()) {
                parsePosition.setIndex(parsePosition.getIndex() + str2.length());
                return true;
            }
            int index = parsePosition.getIndex() + i2;
            if (index == str.length()) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            if (str2.charAt(i2) != str.charAt(index)) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            i2++;
        }
    }

    public final String toString() {
        return "CopyQuotedStrategy [formatField=" + this.f1241c + "]";
    }
}
