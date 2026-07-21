package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.dg */
/* JADX INFO: loaded from: classes.dex */
public class C0202dg {

    /* JADX INFO: renamed from: d */
    @InterfaceC0474ni("url")
    private String f729d;

    /* JADX INFO: renamed from: e */
    @InterfaceC0474ni("name")
    private String f730e;

    /* JADX INFO: renamed from: f */
    @InterfaceC0474ni("lang")
    private String f731f;

    /* JADX INFO: renamed from: g */
    @InterfaceC0474ni("format")
    private String f732g;

    /* JADX INFO: renamed from: a */
    public final void m1121a(String str) {
        str.getClass();
        switch (str) {
            case "ass":
            case "ssa":
                this.f732g = "text/x-ssa";
                break;
            case "vtt":
                this.f732g = "text/vtt";
                break;
            default:
                this.f732g = "application/x-subrip";
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1122b(String str) {
        this.f730e = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m1123c(String str) {
        this.f729d = str;
    }
}
