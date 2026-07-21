package com.github.catvod.spider.support.p044FM.p051G;

import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.n */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1360n extends AbstractC1361o {

    /* JADX INFO: renamed from: a */
    Pattern f3125a;

    AbstractC1360n() {
        super(null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.AbstractC1361o
    /* JADX INFO: renamed from: a */
    final boolean mo3341a() {
        return false;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.AbstractC1361o
    /* JADX INFO: renamed from: b */
    final boolean mo3338b(C1366t c1366t, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcher = this.f3125a.matcher(str.substring(parsePosition.getIndex()));
        if (!matcher.lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
        mo3337c(calendar, matcher.group(1));
        return true;
    }

    /* JADX INFO: renamed from: c */
    abstract void mo3337c(Calendar calendar, String str);

    public String toString() {
        return getClass().getSimpleName() + " [pattern=" + this.f3125a + "]";
    }
}
