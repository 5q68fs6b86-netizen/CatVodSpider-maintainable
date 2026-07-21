package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class aba {

    /* JADX INFO: renamed from: a */
    public static final aba f467a = new aba("", "", false);

    /* JADX INFO: renamed from: b */
    public final String f468b;

    /* JADX INFO: renamed from: c */
    public final String f469c;

    /* JADX INFO: renamed from: d */
    public final boolean f470d;

    static {
        new aba("\n", "  ", true);
    }

    public aba(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f468b = str;
        this.f469c = str2;
        this.f470d = z;
    }
}
