package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.sm */
/* JADX INFO: loaded from: classes.dex */
public class C0613sm {

    /* JADX INFO: renamed from: b */
    @InterfaceC0474ni("type_id")
    private String f1495b;

    /* JADX INFO: renamed from: c */
    @InterfaceC0474ni("type_name")
    private String f1496c;

    /* JADX INFO: renamed from: d */
    @InterfaceC0474ni("type_flag")
    private String f1497d = "1";

    public C0613sm(String str, String str2) {
        this.f1495b = str;
        this.f1496c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m1688a() {
        return this.f1495b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0613sm) {
            return this.f1495b.equals(((C0613sm) obj).f1495b);
        }
        return false;
    }
}
