package com.github.catvod.spider.support.p044FM.p053I;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.I.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1376b {

    /* JADX INFO: renamed from: a */
    public static final Charset f3168a;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset charsetForName = Charset.forName("UTF-8");
        f3168a = charsetForName;
        charsetForName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
