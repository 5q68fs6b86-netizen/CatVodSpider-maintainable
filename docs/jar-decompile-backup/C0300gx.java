package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.gx */
/* JADX INFO: loaded from: classes.dex */
public final class C0300gx extends AbstractC0680uz {

    /* JADX INFO: renamed from: b */
    public final StringBuilder f878b;

    /* JADX INFO: renamed from: c */
    public String f879c;

    public C0300gx() {
        super(4);
        this.f878b = new StringBuilder();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0680uz
    /* JADX INFO: renamed from: a */
    public final void mo904a() {
        AbstractC0680uz.m1738h(this.f878b);
        this.f879c = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m1261d(char c) {
        String str = this.f879c;
        StringBuilder sb = this.f878b;
        if (str != null) {
            sb.append(str);
            this.f879c = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: e */
    public final void m1262e(String str) {
        String str2 = this.f879c;
        StringBuilder sb = this.f878b;
        if (str2 != null) {
            sb.append(str2);
            this.f879c = null;
        }
        if (sb.length() == 0) {
            this.f879c = str;
        } else {
            sb.append(str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<!--");
        String string = this.f879c;
        if (string == null) {
            string = this.f878b.toString();
        }
        sb.append(string);
        sb.append("-->");
        return sb.toString();
    }
}
