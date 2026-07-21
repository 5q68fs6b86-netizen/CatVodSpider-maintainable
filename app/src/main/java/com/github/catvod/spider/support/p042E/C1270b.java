package com.github.catvod.spider.support.p042E;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.support.E.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1270b {

    /* JADX INFO: renamed from: a */
    public static final Charset f2981a;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset charsetForName = Charset.forName("UTF-8");
        f2981a = charsetForName;
        charsetForName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
