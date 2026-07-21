package com.github.catvod.spider.support.p012C0.p022a0;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p022a0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1016b {

    /* JADX INFO: renamed from: a */
    public static final Charset f2478a;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset charsetForName = Charset.forName("UTF-8");
        f2478a = charsetForName;
        charsetForName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
