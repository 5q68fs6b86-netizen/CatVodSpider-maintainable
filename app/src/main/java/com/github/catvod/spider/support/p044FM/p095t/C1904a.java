package com.github.catvod.spider.support.p044FM.p095t;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.t.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1904a implements Serializable {

    /* JADX INFO: renamed from: a */
    private String f4379a;

    /* JADX INFO: renamed from: b */
    private String f4380b;

    /* JADX INFO: renamed from: c */
    private String f4381c;

    public C1904a(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException("Local part not allowed to be null");
        }
        str = str == null ? "" : str;
        str3 = str3 == null ? "" : str3;
        this.f4379a = str;
        this.f4380b = str2;
        this.f4381c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m4607a() {
        return this.f4380b;
    }

    /* JADX INFO: renamed from: b */
    public final String m4608b() {
        return this.f4379a;
    }

    /* JADX INFO: renamed from: c */
    public final String m4609c() {
        return this.f4381c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1904a)) {
            return false;
        }
        C1904a c1904a = (C1904a) obj;
        return this.f4380b.equals(c1904a.f4380b) && this.f4379a.equals(c1904a.f4379a);
    }

    public final int hashCode() {
        return this.f4379a.hashCode() ^ this.f4380b.hashCode();
    }

    public final String toString() {
        if (this.f4379a.equals("")) {
            return this.f4380b;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(this.f4379a);
        stringBuffer.append("}");
        stringBuffer.append(this.f4380b);
        return stringBuffer.toString();
    }
}
