package com.github.catvod.spider.support.p002A0;

import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ms */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0457ms extends AbstractC0157bp {

    /* JADX INFO: renamed from: g */
    public Pattern f1253g;

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0157bp
    /* JADX INFO: renamed from: a */
    public final boolean mo1061a() {
        return false;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0157bp
    /* JADX INFO: renamed from: b */
    public final boolean mo1062b(abe abeVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcher = this.f1253g.matcher(str.substring(parsePosition.getIndex()));
        if (!matcher.lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
        mo1215f(calendar, matcher.group(1));
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1215f(Calendar calendar, String str);

    public String toString() {
        return getClass().getSimpleName() + " [pattern=" + this.f1253g + "]";
    }
}
