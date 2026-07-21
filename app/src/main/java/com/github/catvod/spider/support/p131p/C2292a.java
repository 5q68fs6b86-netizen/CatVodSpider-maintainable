package com.github.catvod.spider.support.p131p;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2292a implements Serializable {

    /* JADX INFO: renamed from: a */
    private String f5719a;

    /* JADX INFO: renamed from: b */
    private String f5720b;

    /* JADX INFO: renamed from: c */
    private String f5721c;

    public C2292a(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException("Local part not allowed to be null");
        }
        str = str == null ? "" : str;
        str3 = str3 == null ? "" : str3;
        this.f5719a = str;
        this.f5720b = str2;
        this.f5721c = str3;
    }

    /* JADX INFO: renamed from: k */
    public static String m6196k(File file) {
        try {
            return m6197l(new FileInputStream(file));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m6197l(InputStream inputStream) {
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            inputStream.close();
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m6198a() {
        return this.f5720b;
    }

    /* JADX INFO: renamed from: b */
    public final String m6199b() {
        return this.f5719a;
    }

    /* JADX INFO: renamed from: c */
    public final String m6200c() {
        return this.f5721c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2292a)) {
            return false;
        }
        C2292a c2292a = (C2292a) obj;
        return this.f5720b.equals(c2292a.f5720b) && this.f5719a.equals(c2292a.f5719a);
    }

    public final int hashCode() {
        return this.f5719a.hashCode() ^ this.f5720b.hashCode();
    }

    public final String toString() {
        if (this.f5719a.equals("")) {
            return this.f5720b;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(this.f5719a);
        stringBuffer.append("}");
        stringBuffer.append(this.f5720b);
        return stringBuffer.toString();
    }
}
