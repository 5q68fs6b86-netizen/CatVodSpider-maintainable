package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class abv implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f539a;

    public abv(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC0399ko.m1350e("compile(...)", patternCompile);
        this.f539a = patternCompile;
    }

    public final String toString() {
        String string = this.f539a.toString();
        AbstractC0399ko.m1350e("toString(...)", string);
        return string;
    }
}
