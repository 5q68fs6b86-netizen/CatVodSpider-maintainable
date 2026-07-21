package com.github.catvod.spider.support.p002A0;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.sg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0607sg {

    /* JADX INFO: renamed from: a */
    public static final Charset f1488a;

    /* JADX INFO: renamed from: b */
    public static volatile Charset f1489b;

    /* JADX INFO: renamed from: c */
    public static volatile Charset f1490c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC0399ko.m1350e("forName(...)", charsetForName);
        f1488a = charsetForName;
        AbstractC0399ko.m1350e("forName(...)", Charset.forName("UTF-16"));
        AbstractC0399ko.m1350e("forName(...)", Charset.forName("UTF-16BE"));
        AbstractC0399ko.m1350e("forName(...)", Charset.forName("UTF-16LE"));
        AbstractC0399ko.m1350e("forName(...)", Charset.forName("US-ASCII"));
        AbstractC0399ko.m1350e("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
