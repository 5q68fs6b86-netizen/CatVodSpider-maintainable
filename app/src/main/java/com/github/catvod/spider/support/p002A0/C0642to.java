package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.to */
/* JADX INFO: loaded from: classes.dex */
public final class C0642to implements Serializable {

    /* JADX INFO: renamed from: a */
    public int f1544a;

    /* JADX INFO: renamed from: b */
    public int f1545b;

    /* JADX INFO: renamed from: c */
    public int f1546c;

    /* JADX INFO: renamed from: d */
    public int f1547d;

    /* JADX INFO: renamed from: e */
    public aam f1548e;

    /* JADX INFO: renamed from: f */
    public String f1549f;

    /* JADX INFO: renamed from: g */
    public int f1550g;

    /* JADX INFO: renamed from: h */
    public int f1551h;

    /* JADX INFO: renamed from: i */
    public int f1552i;

    /* JADX INFO: renamed from: j */
    public final String m1720j() {
        int i;
        String str = this.f1549f;
        if (str != null) {
            return str;
        }
        C0619ss c0619ss = (C0619ss) this.f1548e.f448b;
        if (c0619ss == null) {
            return null;
        }
        int i2 = this.f1551h;
        int i3 = c0619ss.f1513a;
        return (i2 >= i3 || (i = this.f1552i) >= i3) ? "<EOF>" : c0619ss.m1698f(C0145bd.m1022d(i2, i));
    }

    public final String toString() {
        int i = this.f1547d;
        String strM1759c = i > 0 ? AbstractC0710wb.m1759c(",channel=", i) : "";
        String strM1720j = m1720j();
        return "[@" + this.f1550g + "," + this.f1551h + ":" + this.f1552i + "='" + (strM1720j != null ? strM1720j.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>") + "',<" + String.valueOf(this.f1544a) + ">" + strM1759c + "," + this.f1545b + ":" + this.f1546c + "]";
    }
}
