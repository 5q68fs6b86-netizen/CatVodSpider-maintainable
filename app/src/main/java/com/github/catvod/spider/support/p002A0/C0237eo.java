package com.github.catvod.spider.support.p002A0;

import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.eo */
/* JADX INFO: loaded from: classes.dex */
public class C0237eo extends AbstractC0157bp {

    /* JADX INFO: renamed from: c */
    public final int f786c;

    public C0237eo(int i) {
        this.f786c = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0157bp
    /* JADX INFO: renamed from: a */
    public final boolean mo1061a() {
        return true;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0157bp
    /* JADX INFO: renamed from: b */
    public final boolean mo1062b(abe abeVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
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
        calendar.set(this.f786c, mo1194d(abeVar, i3));
        return true;
    }

    /* JADX INFO: renamed from: d */
    public int mo1194d(abe abeVar, int i) {
        return i;
    }

    public final String toString() {
        return "NumberStrategy [field=" + this.f786c + "]";
    }
}
